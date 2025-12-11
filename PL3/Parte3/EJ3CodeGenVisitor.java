import java.util.HashMap;
import java.util.Map;

/**
 * EJ3CodeGenVisitor
 *
 * Genera código Jasmin a partir del árbol de EJ3Parser.
 * - Usa enteros JVM (int) para números y booleanos (0/1).
 * - El resultado de cada visitXxx es un fragmento de Jasmin
 *   que deja en la pila el valor (para expresiones) o realiza
 *   efectos (asignaciones, bucles, etc.).
 */
public class EJ3CodeGenVisitor extends EJ3ParserBaseVisitor<String> {

    // ============
    // ESTADO
    // ============

    // Variable -> índice de local en la JVM
    private final Map<String, Integer> locals = new HashMap<>();
    private int nextLocal = 1; // 0 reservado para args de main

    // Contador de etiquetas Jasmin: L0, L1, L2...
    private int labelCounter = 0;

    // ============
    // HELPERS
    // ============

    /** Nueva etiqueta única: L0, L1, ... */
    private String newLabel() {
        return "L" + (labelCounter++);
    }

    /** Slot local para una variable; si no existe, se crea. */
    private int getOrAllocLocal(String name) {
        return locals.computeIfAbsent(name, k -> nextLocal++);
    }

    /**
     * ANTLR usa este método para combinar resultados de hijos
     * cuando se llama a visitChildren(ctx). Hacemos concatenación
     * con salto de línea, como en el ejemplo de MyVisitor.
     */
    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        if (aggregate == null) return nextResult;
        if (nextResult == null) return aggregate;
        return aggregate + "\n" + nextResult;
    }

    // ============
    // PROGRAMA / BLOQUE / SENTENCIA
    // ============

    @Override
    public String visitPrograma(EJ3Parser.ProgramaContext ctx) {
        // programa : (sentencia | condicional)* EOF
        return visitChildren(ctx);
    }

    @Override
    public String visitSentencia(EJ3Parser.SentenciaContext ctx) {
        // sentencia : declaracion | asignacion | impresion | bucle | control_bucle
        return visitChildren(ctx);
    }

    @Override
    public String visitBloque(EJ3Parser.BloqueContext ctx) {
        // bloque : (sentencia | condicional)*
        return visitChildren(ctx);
    }

    // ============
    // DECLARACIÓN / ASIGNACIÓN / MOSTRAR
    // ============

    @Override
    public String visitDeclaracion(EJ3Parser.DeclaracionContext ctx) {
        // declaracion : ASIGNAR id=ID ASIGNACION valor=expr_general FIN_LINEA ;
        String varName = ctx.id.getText();
        int slot = getOrAllocLocal(varName);

        String exprCode = visit(ctx.valor); // deja valor (int/0-1) en pila
        return exprCode + "\n    istore " + slot;
    }

    @Override
    public String visitAsignacion(EJ3Parser.AsignacionContext ctx) {
        // asignacion : id=ID ASIGNACION valor=expr_general FIN_LINEA ;
        String varName = ctx.id.getText();
        int slot = getOrAllocLocal(varName);

        String exprCode = visit(ctx.valor);
        return exprCode + "\n    istore " + slot;
    }

    @Override
    public String visitImpresion(EJ3Parser.ImpresionContext ctx) {
        // impresion : MOSTRAR expr=expr_general FIN_LINEA ;
        String exprCode = visit(ctx.expr);

        // System.out.println(int)
        return "    getstatic java/lang/System/out Ljava/io/PrintStream;\n"
                + exprCode + "\n"
                + "    invokevirtual java/io/PrintStream/println(I)V";
    }

    // ============
    // CONTROL DE BUCLE (break/continue)
    // ============

    @Override
    public String visitControl_bucle(EJ3Parser.Control_bucleContext ctx) {
        // No implementamos break/continue de verdad en Jasmin (haría falta
        // un stack de etiquetas). Para la práctica de nivel intermedio
        // bastan comentarios para que compile.
        if (ctx.ROMPER() != null) {
            return "    ; ROMPER (break) no implementado en Jasmin";
        } else {
            return "    ; CONTINUAR (continue) no implementado en Jasmin";
        }
    }

    // ============
    // IF / ELSE
    // ============

    @Override
    public String visitCondicional(EJ3Parser.CondicionalContext ctx) {
        // condicional :
        //    cond=condicion MARCA_COND SI FLECHA thenBlock=bloque
        //    (SI_NO FLECHA elseBlock=bloque)? TERMINAR ;

        String condCode = visit(ctx.cond);          // deja 0/1 en pila
        String thenCode = visit(ctx.thenBlock);     // bloque then
        String elseCode = (ctx.elseBlock != null)   // bloque else opcional
                ? visit(ctx.elseBlock)
                : "";

        String labelElse = newLabel();
        String labelEnd  = newLabel();

        StringBuilder sb = new StringBuilder();
        sb.append(condCode).append("\n");
        // Si cond == 0 → saltar a else
        sb.append("    ifeq ").append(labelElse).append("\n");
        // THEN
        sb.append(thenCode).append("\n");
        sb.append("    goto ").append(labelEnd).append("\n");
        // ELSE
        sb.append(labelElse).append(":\n");
        if (!elseCode.isEmpty()) {
            sb.append(elseCode).append("\n");
        }
        // END
        sb.append(labelEnd).append(":");
        return sb.toString();
    }

    // ============
    // BUCLE MIENTRAS
    // ============

    @Override
    public String visitBucle_mientras(EJ3Parser.Bucle_mientrasContext ctx) {
        // bucle_mientras : MIENTRAS cond=condicion HACER FLECHA cuerpo=bloque TERMINAR ;
        String labelStart = newLabel();
        String labelEnd   = newLabel();

        String condCode = visit(ctx.cond);    // deja 0/1
        String bodyCode = visit(ctx.cuerpo);  // cuerpo del bucle

        StringBuilder sb = new StringBuilder();
        sb.append(labelStart).append(":\n");
        sb.append(condCode).append("\n");
        sb.append("    ifeq ").append(labelEnd).append("\n"); // si cond == 0 → salir
        sb.append(bodyCode).append("\n");
        sb.append("    goto ").append(labelStart).append("\n");
        sb.append(labelEnd).append(":");
        return sb.toString();
    }

    // ============
    // BUCLE PARA
    // ============

    @Override
    public String visitBucle_para(EJ3Parser.Bucle_paraContext ctx) {
        // bucle_para :
        //   PARA var=ID DESDE inicio=expresion HASTA fin=expresion
        //   (PASO paso=expresion)? HACER FLECHA cuerpo=bloque TERMINAR ;

        String varName = ctx.var.getText();

        // Slots: variable de control, límite y paso (usamos nombres sintéticos)
        int idxVar  = getOrAllocLocal(varName);
        int idxFin  = getOrAllocLocal(varName + "#fin");
        int idxPaso = getOrAllocLocal(varName + "#paso");

        String inicioCode = visit(ctx.inicio);      // valor inicial
        String finCode    = visit(ctx.fin);         // valor final
        String pasoCode   = (ctx.paso != null)
                ? visit(ctx.paso)
                : "    ldc 1";                      // paso por defecto

        StringBuilder sb = new StringBuilder();

        // Inicialización
        sb.append(inicioCode).append("\n");
        sb.append("    istore ").append(idxVar).append("\n");
        sb.append(finCode).append("\n");
        sb.append("    istore ").append(idxFin).append("\n");
        sb.append(pasoCode).append("\n");
        sb.append("    istore ").append(idxPaso).append("\n");

        // Etiquetas de bucle
        String labelStart = newLabel();
        String labelEnd   = newLabel();

        // while (var <= fin) { cuerpo; var = var + paso; }
        sb.append(labelStart).append(":\n");
        sb.append("    iload ").append(idxVar).append("\n");
        sb.append("    iload ").append(idxFin).append("\n");
        sb.append("    if_icmpgt ").append(labelEnd).append("\n");

        // Cuerpo
        sb.append(visit(ctx.cuerpo)).append("\n");

        // Incremento
        sb.append("    iload ").append(idxVar).append("\n");
        sb.append("    iload ").append(idxPaso).append("\n");
        sb.append("    iadd\n");
        sb.append("    istore ").append(idxVar).append("\n");
        sb.append("    goto ").append(labelStart).append("\n");
        sb.append(labelEnd).append(":");

        return sb.toString();
    }

    // ============
    // BOOLEANOS Y CONDICIONES
    // ============

    @Override
    public String visitCondicion(EJ3Parser.CondicionContext ctx) {
        // condicion : raiz=bool_o ;
        return visit(ctx.raiz);
    }

    @Override
    public String visitBool_o(EJ3Parser.Bool_oContext ctx) {
        // bool_o : left=bool_y (ops+=OR rights+=bool_y)* ;
        // Usamos ior (OR bit a bit) sobre 0/1.
        String code = visit(ctx.left);
        for (EJ3Parser.Bool_yContext r : ctx.rights) {
            code = code + "\n" + visit(r) + "\n    ior";
        }
        return code;
    }

    @Override
    public String visitBool_y(EJ3Parser.Bool_yContext ctx) {
        // bool_y : left=bool_no (ops+=AND rights+=bool_no)* ;
        // Usamos iand (AND bit a bit) sobre 0/1.
        String code = visit(ctx.left);
        for (EJ3Parser.Bool_noContext r : ctx.rights) {
            code = code + "\n" + visit(r) + "\n    iand";
        }
        return code;
    }

    @Override
    public String visitBool_no(EJ3Parser.Bool_noContext ctx) {
        // bool_no
        //   : NOT negado=bool_no
        //   | PAREN_ABRE inner=condicion PAREN_CIERRA
        //   | comp=comparacion
        //   | bool=booleano
        if (ctx.negado != null) {
            // NOT: generamos etiquetas para hacer 1→0 y 0→1
            String inner = visit(ctx.negado);
            String lTrue = newLabel();
            String lEnd  = newLabel();

            StringBuilder sb = new StringBuilder();
            sb.append(inner).append("\n");
            sb.append("    ifeq ").append(lTrue).append("\n"); // si era 0 → true
            sb.append("    iconst_0\n");
            sb.append("    goto ").append(lEnd).append("\n");
            sb.append(lTrue).append(":\n");
            sb.append("    iconst_1\n");
            sb.append(lEnd).append(":");
            return sb.toString();
        } else if (ctx.inner != null) {
            return visit(ctx.inner);
        } else if (ctx.comp != null) {
            return visit(ctx.comp);
        } else {
            return visit(ctx.bool);
        }
    }

    @Override
    public String visitOperando_cmp(EJ3Parser.Operando_cmpContext ctx) {
        // operando_cmp : expr=expresion | bool=booleano ;
        if (ctx.expr != null) return visit(ctx.expr);
        return visit(ctx.bool);
    }

    @Override
    public String visitComparacion(EJ3Parser.ComparacionContext ctx) {
        // comparacion : left=operando_cmp op=operador_relacional right=operando_cmp ;
        String leftCode  = visit(ctx.left);
        String rightCode = visit(ctx.right);
        String opText    = ctx.op.getText();

        String lTrue = newLabel();
        String lEnd  = newLabel();

        StringBuilder sb = new StringBuilder();
        sb.append(leftCode).append("\n");
        sb.append(rightCode).append("\n");

        // Comparamos ints con if_icmpXX
        String instr;
        switch (opText) {
            case "==" -> instr = "if_icmpeq";
            case "!=" -> instr = "if_icmpne";
            case "<"  -> instr = "if_icmplt";
            case "<=" -> instr = "if_icmple";
            case ">"  -> instr = "if_icmpgt";
            case ">=" -> instr = "if_icmpge";
            default   -> instr = "if_icmpeq"; // nunca debería pasar
        }

        sb.append("    ").append(instr).append(" ").append(lTrue).append("\n");
        sb.append("    iconst_0\n");
        sb.append("    goto ").append(lEnd).append("\n");
        sb.append(lTrue).append(":\n");
        sb.append("    iconst_1\n");
        sb.append(lEnd).append(":");

        return sb.toString();
    }

    @Override
    public String visitBooleano(EJ3Parser.BooleanoContext ctx) {
        // booleano : VERDADERO | FALSO | id=ID ;
        if (ctx.VERDADERO() != null) {
            return "    iconst_1";
        } else if (ctx.FALSO() != null) {
            return "    iconst_0";
        } else {
            String name = ctx.id.getText();
            int slot = getOrAllocLocal(name);
            return "    iload " + slot;
        }
    }

    @Override
    public String visitOperador_relacional(EJ3Parser.Operador_relacionalContext ctx) {
        // No se genera código aquí; se usa ctx.op.getText() en comparacion.
        return super.visitOperador_relacional(ctx);
    }

    // ============
    // EXPRESIONES ARITMÉTICAS
    // ============

    @Override
    public String visitExpr_general(EJ3Parser.Expr_generalContext ctx) {
        // expr_general : arith=expresion | bool=condicion ;
        if (ctx.arith != null) return visit(ctx.arith);
        return visit(ctx.bool);
    }

    @Override
    public String visitExpresion(EJ3Parser.ExpresionContext ctx) {
        // expresion : left=termino (ops+=(SUMA | RESTA) rights+=termino)* ;
        String code = visit(ctx.left);
        for (int i = 0; i < ctx.rights.size(); i++) {
            String op = ctx.ops.get(i).getText(); // '+' o '-'
            String rhs = visit(ctx.rights.get(i));

            code = code + "\n" + rhs + "\n"
                    + (op.equals("+") ? "    iadd" : "    isub");
        }
        return code;
    }

    @Override
    public String visitTermino(EJ3Parser.TerminoContext ctx) {
        // termino : left=potencia (ops+=(MULT | DIV | MOD) rights+=potencia)* ;
        String code = visit(ctx.left);
        for (int i = 0; i < ctx.rights.size(); i++) {
            String op = ctx.ops.get(i).getText(); // *, /, %
            String rhs = visit(ctx.rights.get(i));

            code = code + "\n" + rhs + "\n";
            switch (op) {
                case "*" -> code += "    imul";
                case "/" -> code += "    idiv";
                case "%" -> code += "    irem";
            }
        }
        return code;
    }

    @Override
    public String visitPotencia(EJ3Parser.PotenciaContext ctx) {
        // potencia : base=factor (POT exp=potencia)? ;
        String baseCode = visit(ctx.base);
        if (ctx.exp != null) {
            // Para la práctica de Jasmin, dejamos ^ como comentario.
            String expCode = visit(ctx.exp);
            return baseCode + "\n" + expCode + "\n    ; potencia (^) no implementada en Jasmin";
        }
        return baseCode;
    }

    @Override
    public String visitFactor(EJ3Parser.FactorContext ctx) {
        // factor : RESTA neg=factor | PAREN_ABRE inner=expresion PAREN_CIERRA | atom=atomo ;
        if (ctx.neg != null) {
            String inner = visit(ctx.neg);
            return inner + "\n    ineg";
        } else if (ctx.inner != null) {
            return visit(ctx.inner);
        } else {
            return visit(ctx.atom);
        }
    }

    @Override
    public String visitAtomo(EJ3Parser.AtomoContext ctx) {
        // atomo : intLit=INT | floatLit=FLOAT | strLit=STRING | id=ID ;
        if (ctx.intLit != null) {
            int v = Integer.parseInt(ctx.intLit.getText());
            return "    ldc " + v;
        } else if (ctx.id != null) {
            String name = ctx.id.getText();
            int slot = getOrAllocLocal(name);
            return "    iload " + slot;
        } else if (ctx.floatLit != null) {
            // No generamos código float real; solo comentario.
            return "    ; FLOAT no soportado en Jasmin: " + ctx.floatLit.getText();
        } else {
            // STRING: igual, comentario. Tu EvalVisitor sí los maneja.
            return "    ; STRING no soportado en Jasmin: " + ctx.strLit.getText();
        }
    }
}
