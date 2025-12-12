import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class CompileVisitor extends EJ3ParserBaseVisitor<String> {

    // ==========================
    // 0. CAMPOS Y UTILIDADES
    // ==========================

    private final TablaSimbolos tabla = new TablaSimbolos();

    private final Deque<String> pilaBreak = new ArrayDeque<>();
    private final Deque<String> pilaContinue = new ArrayDeque<>();

    private int labelCounter = 0;
    private String newLabel() { return "L" + (labelCounter++); }

    public TablaSimbolos getTabla() { return tabla; }

    // ==========================
    // 1. PROGRAMA Y SENTENCIAS
    // ==========================

    @Override
    public String visitPrograma(EJ3Parser.ProgramaContext ctx) {
        StringBuilder sb = new StringBuilder();
        if (ctx.children != null) {
            for (ParseTree child : ctx.children) {
                String code = visit(child);
                if (code != null) sb.append(code);
            }
        }
        return sb.toString();
    }

    @Override
    public String visitSentencia(EJ3Parser.SentenciaContext ctx) {
        if (ctx.declaracion()   != null) return visit(ctx.declaracion());
        if (ctx.asignacion()    != null) return visit(ctx.asignacion());
        if (ctx.impresion()     != null) return visit(ctx.impresion());
        if (ctx.bucle()         != null) return visit(ctx.bucle());
        if (ctx.control_bucle() != null) return visit(ctx.control_bucle());
        return "";
    }

    @Override
    public String visitBloque(EJ3Parser.BloqueContext ctx) {
        StringBuilder sb = new StringBuilder();
        if (ctx.children != null) {
            for (ParseTree child : ctx.children) {
                String code = visit(child);
                if (code != null) sb.append(code);
            }
        }
        return sb.toString();
    }

    // ======================================
    // 2. DECLARACIÓN / ASIGNACIÓN (5,6,7)
    // ======================================

    @Override
    public String visitDeclaracion(EJ3Parser.DeclaracionContext ctx) {
        String nombre = ctx.id.getText();
        Tipo tipo = tipoExprGeneral(ctx.valor);

        // Error 6 incluido en insertar(nombre, tipo, tok)
        Simbolo s = tabla.insertar(nombre, tipo, ctx.id);

        String codigoValor = visit(ctx.valor);
        return codigoValor + instruccionStore(tipo, s.direccion);
    }

    @Override
    public String visitAsignacion(EJ3Parser.AsignacionContext ctx) {
        String nombre = ctx.id.getText();
        Simbolo s = tabla.buscar(nombre);

        if (s == null) {
            // Error 5
            tabla.semanticError(ctx.id, "Variable '" + nombre + "' no declarada");
            return "";
        }

        Tipo tipoExpr = tipoExprGeneral(ctx.valor);

        // Promoción INT → FLOAT
        if (s.tipo == Tipo.FLOAT && tipoExpr == Tipo.INT) {
            String code = visit(ctx.valor) + "   i2f\n";
            return code + instruccionStore(Tipo.FLOAT, s.direccion);
        }

        // Error 7
        if (s.tipo != tipoExpr) {
            tabla.semanticError(ctx.id,
                    "No se puede asignar valor de tipo " + tipoExpr +
                            " a variable de tipo " + s.tipo);
            return "";
        }

        String codigoValor = visit(ctx.valor);
        return codigoValor + instruccionStore(s.tipo, s.direccion);
    }

    private String instruccionStore(Tipo tipo, int dir) {
        switch (tipo) {
            case STRING: return "   astore " + dir + "\n";
            case FLOAT:  return "   fstore " + dir + "\n";
            default:     return "   istore " + dir + "\n"; // INT, BOOL
        }
    }

    private String instruccionLoad(Tipo tipo, int dir) {
        switch (tipo) {
            case STRING: return "   aload " + dir + "\n";
            case FLOAT:  return "   fload " + dir + "\n";
            default:     return "   iload " + dir + "\n";
        }
    }

    // =====================
    // 3. MOSTRAR
    // =====================

    @Override
    public String visitImpresion(EJ3Parser.ImpresionContext ctx) {
        Tipo tipo = tipoExprGeneral(ctx.expr);
        StringBuilder sb = new StringBuilder();

        sb.append("   getstatic java/lang/System/out Ljava/io/PrintStream;\n");
        sb.append(visit(ctx.expr));

        switch (tipo) {
            case STRING:
                sb.append("   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\n");
                break;
            case FLOAT:
                sb.append("   invokevirtual java/io/PrintStream/println(F)V\n");
                break;
            default: // INT, BOOL
                sb.append("   invokevirtual java/io/PrintStream/println(I)V\n");
                break;
        }

        return sb.toString();
    }

    // =====================================
    // 4. IF / WHILE / FOR / BREAK / CONTINUE
    // =====================================

    @Override
    public String visitCondicional(EJ3Parser.CondicionalContext ctx) {
        String labelElse = newLabel();
        String labelEnd  = newLabel();
        StringBuilder sb = new StringBuilder();

        sb.append(visit(ctx.cond));                 // 0/1 en pila
        sb.append("   ifeq ").append(labelElse).append("\n");

        sb.append(visit(ctx.thenBlock));
        sb.append("   goto ").append(labelEnd).append("\n");

        sb.append(labelElse).append(":\n");
        if (ctx.elseBlock != null) {
            sb.append(visit(ctx.elseBlock));
        }

        sb.append(labelEnd).append(":\n");
        return sb.toString();
    }

    @Override
    public String visitBucle_mientras(EJ3Parser.Bucle_mientrasContext ctx) {
        String labelInicio = newLabel();
        String labelFin    = newLabel();

        pilaBreak.push(labelFin);
        pilaContinue.push(labelInicio);

        StringBuilder sb = new StringBuilder();
        sb.append(labelInicio).append(":\n");
        sb.append(visit(ctx.cond));
        sb.append("   ifeq ").append(labelFin).append("\n");
        sb.append(visit(ctx.cuerpo));
        sb.append("   goto ").append(labelInicio).append("\n");
        sb.append(labelFin).append(":\n");

        pilaBreak.pop();
        pilaContinue.pop();
        return sb.toString();
    }

    @Override
    public String visitBucle_para(EJ3Parser.Bucle_paraContext ctx) {
        String nombreVar = ctx.var.getText();

        // Control del for debe ser INT
        Simbolo var = tabla.buscar(nombreVar);
        if (var == null) {
            var = tabla.insertar(nombreVar, Tipo.INT, ctx.var);
        } else if (var.tipo != Tipo.INT) {
            // Error 14
            tabla.semanticError(ctx.var,
                    "La variable del bucle 'para' debe ser de tipo INT");
            return "";
        }

        // Rango inicio/fin deben ser INT (Error 15)
        Tipo tInicio = tipoExpresion(ctx.inicio);
        Tipo tFin    = tipoExpresion(ctx.fin);

        if (tInicio != Tipo.INT) {
            tabla.semanticError(ctx.inicio.start,
                    "El inicio del bucle 'para' debe ser entero (tipo actual: " + tInicio + ")");
            return "";
        }
        if (tFin != Tipo.INT) {
            tabla.semanticError(ctx.fin.start,
                    "El límite del bucle 'para' debe ser entero (tipo actual: " + tFin + ")");
            return "";
        }

        // Tipo del paso y paso != 0, sigue siendo INT
        Tipo tPaso = Tipo.INT;
        if (ctx.paso != null) {
            tPaso = tipoExpresion(ctx.paso);
            if (tPaso != Tipo.INT) {
                tabla.semanticError(ctx.paso.start,
                        "El paso del bucle 'para' debe ser entero (tipo actual: " + tPaso + ")");
                return "";
            }
            if (esConstanteCeroEnExpresion(ctx.paso)) {
                tabla.semanticError(ctx.paso.start,
                        "El paso del bucle 'para' no puede ser 0");
                return "";
            }
        }

        // Reservar dirección para el paso (INT)
        int dirPaso = tabla.nuevaDireccionAnonima();

        String labelInicio       = newLabel();
        String labelFin          = newLabel();
        String labelIncremento   = newLabel();
        String labelCheckPositivo = newLabel();    // para distinguir paso >= 0
        String labelDespuesCheck  = newLabel();    // punto común tras elegir condición

        pilaBreak.push(labelFin);
        pilaContinue.push(labelIncremento); // 'continuar' salta al incremento

        StringBuilder sb = new StringBuilder();

        // i = inicio (Inicialización)
        sb.append(visit(ctx.inicio));
        sb.append(instruccionStore(Tipo.INT, var.direccion));

        // Calcular paso una sola vez y guardarlo en dirPaso
        if (ctx.paso != null) {
            sb.append(visit(ctx.paso));         // deja INT en pila
        } else {
            sb.append("   ldc 1\n");           // paso por defecto = 1
        }
        sb.append(instruccionStore(Tipo.INT, dirPaso)); // store paso

        // inicio bucle
        sb.append(labelInicio).append(":\n");

        // Según signo del paso, elegimos la condición
        // if (paso >= 0) goto labelCheckPositivo
        sb.append("   iload ").append(dirPaso).append("\n");
        sb.append("   ifge ").append(labelCheckPositivo).append("\n");

        // Caso paso < 0: condición i >= fin
        sb.append(instruccionLoad(Tipo.INT, var.direccion));
        sb.append(visit(ctx.fin));
        sb.append("   if_icmplt ").append(labelFin).append("\n"); // si i < fin -> salimos
        sb.append("   goto ").append(labelDespuesCheck).append("\n");

        // Caso paso >= 0: condición i <= fin
        sb.append(labelCheckPositivo).append(":\n");
        sb.append(instruccionLoad(Tipo.INT, var.direccion));
        sb.append(visit(ctx.fin));
        sb.append("   if_icmpgt ").append(labelFin).append("\n"); // si i > fin -> salimos

        sb.append(labelDespuesCheck).append(":\n");

        // cuerpo
        sb.append(visit(ctx.cuerpo));
        sb.append("   goto ").append(labelIncremento).append("\n");

        // actualización i = i + paso
        sb.append(labelIncremento).append(":\n");
        sb.append(instruccionLoad(Tipo.INT, var.direccion));  // i
        sb.append("   iload ").append(dirPaso).append("\n");  // paso
        sb.append("   iadd\n");
        sb.append(instruccionStore(Tipo.INT, var.direccion)); // i = i + paso

        sb.append("   goto ").append(labelInicio).append("\n"); // vuelta a la condición
        sb.append(labelFin).append(":\n");

        pilaBreak.pop();
        pilaContinue.pop();

        return sb.toString();
    }

    @Override
    public String visitControl_bucle(EJ3Parser.Control_bucleContext ctx) {
        if (pilaBreak.isEmpty()) {
            // Error 12
            Token t = (ctx.ROMPER() != null)
                    ? ctx.ROMPER().getSymbol()
                    : ctx.CONTINUAR().getSymbol();
            tabla.controlError(t, "'romper' o 'continuar' fuera de un bucle.");
            return "";
        }

        if (ctx.ROMPER() != null) {
            return "   goto " + pilaBreak.peek() + "\n";
        } else {
            return "   goto " + pilaContinue.peek() + "\n";
        }
    }

    // ===================================
    // 5. expr_general → arith / bool
    // ===================================

    @Override
    public String visitExprGeneralArith(EJ3Parser.ExprGeneralArithContext ctx) {
        return visit(ctx.arith);
    }

    @Override
    public String visitExprGeneralBool(EJ3Parser.ExprGeneralBoolContext ctx) {
        return visit(ctx.bool);  // deja 0/1 en pila
    }

    // ===================================
    // 6. BOOLEANOS: OR, AND, NOT, etc.
    // ===================================

    @Override
    public String visitCondicion(EJ3Parser.CondicionContext ctx) {
        return visit(ctx.raiz);
    }

    @Override
    public String visitBoolOr(EJ3Parser.BoolOrContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(visit(ctx.left));
        for (EJ3Parser.Bool_yContext r : ctx.rights) {
            sb.append(visit(r));
            sb.append("   ior\n");
        }
        return sb.toString();
    }

    @Override
    public String visitBoolAnd(EJ3Parser.BoolAndContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(visit(ctx.left));
        for (EJ3Parser.Bool_noContext r : ctx.rights) {
            sb.append(visit(r));
            sb.append("   iand\n");
        }
        return sb.toString();
    }

    @Override
    public String visitBoolNot(EJ3Parser.BoolNotContext ctx) {
        String labelZero = newLabel();
        String labelEnd  = newLabel();
        StringBuilder sb = new StringBuilder();

        sb.append(visit(ctx.negado));              // 0/1
        sb.append("   ifeq ").append(labelZero).append("\n");
        sb.append("   ldc 0\n");
        sb.append("   goto ").append(labelEnd).append("\n");
        sb.append(labelZero).append(":\n");
        sb.append("   ldc 1\n");
        sb.append(labelEnd).append(":\n");

        return sb.toString();
    }

    @Override
    public String visitBoolParen(EJ3Parser.BoolParenContext ctx) {
        return visit(ctx.inner);
    }

    @Override
    public String visitBoolComp(EJ3Parser.BoolCompContext ctx) {
        return visit(ctx.comp);
    }

    @Override
    public String visitBoolAtom(EJ3Parser.BoolAtomContext ctx) {
        return visit(ctx.bool);
    }

    @Override
    public String visitBooleano(EJ3Parser.BooleanoContext ctx) {
        if (ctx.VERDADERO() != null) return "   ldc 1\n";
        if (ctx.FALSO() != null)     return "   ldc 0\n";

        // id → BOOL
        String nombre = ctx.id.getText();
        Simbolo s = tabla.buscar(nombre);
        if (s == null) {
            tabla.semanticError(ctx.id, "Variable '" + nombre + "' no declarada");
            return "";
        }
        if (s.tipo != Tipo.BOOL) {
            // Error 9
            tabla.semanticError(ctx.id,
                    "Se esperaba booleano y se encontró tipo " + s.tipo);
            return "";
        }
        return instruccionLoad(s.tipo, s.direccion);
    }

    @Override
    public String visitOperando_cmp(EJ3Parser.Operando_cmpContext ctx) {
        if (ctx.expr != null) return visit(ctx.expr);
        else                  return visit(ctx.bool);
    }

    @Override
    public String visitComparacion(EJ3Parser.ComparacionContext ctx) {
        Tipo tLeft  = tipoOperandoCmp(ctx.left);
        Tipo tRight = tipoOperandoCmp(ctx.right);
        EJ3Parser.Operador_relacionalContext opCtx = ctx.op;
        Token opTok = operadorToken(opCtx);
        int   op    = operadorType(opCtx);

        boolean esIgualdad   = (op == EJ3Lexer.IGUAL || op == EJ3Lexer.DISTINTO);
        boolean leftNum      = esNumerico(tLeft);
        boolean rightNum     = esNumerico(tRight);
        boolean ambosNumeros = leftNum && rightNum;

        // Igualdad
        if (esIgualdad) {
            if (tLeft == Tipo.STRING && tRight == Tipo.STRING) {
                return compararStrings(ctx, op);
            }
            if (tLeft == Tipo.BOOL && tRight == Tipo.BOOL) {
                return compararInts(ctx, op);
            }
            if (ambosNumeros) {
                if (tLeft == Tipo.FLOAT || tRight == Tipo.FLOAT) {
                    return compararFloats(ctx, tLeft, tRight, op);
                } else {
                    return compararInts(ctx, op);
                }
            }
            // Error 16
            tabla.semanticError(opTok,
                    "Comparación de igualdad entre tipos incompatibles: " +
                            tLeft + " y " + tRight);
            return "";
        }

        // Relacionales
        if (ambosNumeros) {
            if (tLeft == Tipo.FLOAT || tRight == Tipo.FLOAT) {
                return compararFloats(ctx, tLeft, tRight, op);
            } else {
                return compararInts(ctx, op);
            }
        }

        // Solo uno numérico → Error 10
        if (leftNum ^ rightNum) {
            Tipo malo = leftNum ? tRight : tLeft;
            tabla.semanticError(opTok,
                    "Se esperaba valor numérico y se encontró tipo " + malo);
            return "";
        }

        // BOOL–BOOL → Error 17
        if (tLeft == Tipo.BOOL && tRight == Tipo.BOOL) {
            tabla.semanticError(opTok,
                    "Operador relacional '" + opTok.getText() +
                            "' solo se puede usar con operandos numéricos (no con BOOL y BOOL)");
            return "";
        }

        // STRING–STRING → Error 18
        if (tLeft == Tipo.STRING && tRight == Tipo.STRING) {
            tabla.semanticError(opTok,
                    "Operador relacional '" + opTok.getText() +
                            "' solo se puede usar con operandos numéricos (no con STRING y STRING)");
            return "";
        }

        // Mezclas raras
        tabla.semanticError(opTok,
                "Operador relacional '" + opTok.getText() +
                        "' solo se puede usar con operandos numéricos (no con " +
                        tLeft + " y " + tRight + ")");
        return "";
    }

    private Token operadorToken(EJ3Parser.Operador_relacionalContext ctx) {
        if (ctx.IGUAL()       != null) return ctx.IGUAL().getSymbol();
        if (ctx.DISTINTO()    != null) return ctx.DISTINTO().getSymbol();
        if (ctx.MENOR()       != null) return ctx.MENOR().getSymbol();
        if (ctx.MENOR_IGUAL() != null) return ctx.MENOR_IGUAL().getSymbol();
        if (ctx.MAYOR()       != null) return ctx.MAYOR().getSymbol();
        if (ctx.MAYOR_IGUAL() != null) return ctx.MAYOR_IGUAL().getSymbol();
        return null;
    }

    private int operadorType(EJ3Parser.Operador_relacionalContext ctx) {
        if (ctx.IGUAL()       != null) return EJ3Lexer.IGUAL;
        if (ctx.DISTINTO()    != null) return EJ3Lexer.DISTINTO;
        if (ctx.MENOR()       != null) return EJ3Lexer.MENOR;
        if (ctx.MENOR_IGUAL() != null) return EJ3Lexer.MENOR_IGUAL;
        if (ctx.MAYOR()       != null) return EJ3Lexer.MAYOR;
        if (ctx.MAYOR_IGUAL() != null) return EJ3Lexer.MAYOR_IGUAL;
        return -1;
    }

    private String compararStrings(EJ3Parser.ComparacionContext ctx, int opType) {
        String labelTrue = newLabel();
        String labelEnd  = newLabel();
        StringBuilder sb = new StringBuilder();

        sb.append(visit(ctx.left));
        sb.append(visit(ctx.right));
        sb.append("   invokevirtual java/lang/String/equals(Ljava/lang/Object;)Z\n");

        if (opType == EJ3Lexer.IGUAL) {
            sb.append("   ifne ").append(labelTrue).append("\n");
        } else {
            sb.append("   ifeq ").append(labelTrue).append("\n");
        }

        sb.append("   ldc 0\n");
        sb.append("   goto ").append(labelEnd).append("\n");
        sb.append(labelTrue).append(":\n");
        sb.append("   ldc 1\n");
        sb.append(labelEnd).append(":\n");
        return sb.toString();
    }

    private String compararFloats(EJ3Parser.ComparacionContext ctx,
                                  Tipo tLeft, Tipo tRight, int opType) {
        String labelTrue = newLabel();
        String labelEnd  = newLabel();
        StringBuilder sb = new StringBuilder();

        sb.append(visit(ctx.left));
        if (tLeft != Tipo.FLOAT) sb.append("   i2f\n");

        sb.append(visit(ctx.right));
        if (tRight != Tipo.FLOAT) sb.append("   i2f\n");

        sb.append("   fcmpg\n");

        switch (opType) {
            case EJ3Lexer.MENOR:        sb.append("   iflt "); break;
            case EJ3Lexer.MAYOR:        sb.append("   ifgt "); break;
            case EJ3Lexer.MENOR_IGUAL:  sb.append("   ifle "); break;
            case EJ3Lexer.MAYOR_IGUAL:  sb.append("   ifge "); break;
            case EJ3Lexer.IGUAL:        sb.append("   ifeq "); break;
            case EJ3Lexer.DISTINTO:     sb.append("   ifne "); break;
        }
        sb.append(labelTrue).append("\n");

        sb.append("   ldc 0\n");
        sb.append("   goto ").append(labelEnd).append("\n");
        sb.append(labelTrue).append(":\n");
        sb.append("   ldc 1\n");
        sb.append(labelEnd).append(":\n");
        return sb.toString();
    }

    private String compararInts(EJ3Parser.ComparacionContext ctx, int opType) {
        String labelTrue = newLabel();
        String labelEnd  = newLabel();
        StringBuilder sb = new StringBuilder();

        sb.append(visit(ctx.left));
        sb.append(visit(ctx.right));

        switch (opType) {
            case EJ3Lexer.MENOR:        sb.append("   if_icmplt "); break;
            case EJ3Lexer.MAYOR:        sb.append("   if_icmpgt "); break;
            case EJ3Lexer.MENOR_IGUAL:  sb.append("   if_icmple "); break;
            case EJ3Lexer.MAYOR_IGUAL:  sb.append("   if_icmpge "); break;
            case EJ3Lexer.IGUAL:        sb.append("   if_icmpeq "); break;
            case EJ3Lexer.DISTINTO:     sb.append("   if_icmpne "); break;
        }
        sb.append(labelTrue).append("\n");

        sb.append("   ldc 0\n");
        sb.append("   goto ").append(labelEnd).append("\n");
        sb.append(labelTrue).append(":\n");
        sb.append("   ldc 1\n");
        sb.append(labelEnd).append(":\n");
        return sb.toString();
    }

    // ==========================================
    // 7. ARITMÉTICA: ExprSumRes, ExprMulDivMod,
    //    ExprPow, ExprNeg, ExprParen, ExprAtom
    // ==========================================

    @Override
    public String visitExprSumRes(EJ3Parser.ExprSumResContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(visit(ctx.left));

        Tipo tipoActual = tipoTermino(ctx.left);

        List<Token> ops = ctx.ops;
        List<EJ3Parser.TerminoContext> rights = ctx.rights;

        for (int i = 0; i < rights.size(); i++) {
            EJ3Parser.TerminoContext tRight = rights.get(i);
            Token op = ops.get(i);
            Tipo tipoRight = tipoTermino(tRight);

            if (!esNumerico(tipoActual)) {
                tabla.semanticError(op,
                        "Se esperaba valor numérico y se encontró tipo " + tipoActual);
                return "";
            }
            if (!esNumerico(tipoRight)) {
                tabla.semanticError(op,
                        "Se esperaba valor numérico y se encontró tipo " + tipoRight);
                return "";
            }

            boolean floatOp = (tipoActual == Tipo.FLOAT || tipoRight == Tipo.FLOAT);

            if (floatOp && tipoActual != Tipo.FLOAT) sb.append("   i2f\n");

            sb.append(visit(tRight));
            if (floatOp && tipoRight != Tipo.FLOAT) sb.append("   i2f\n");

            if (op.getType() == EJ3Lexer.SUMA) {
                sb.append(floatOp ? "   fadd\n" : "   iadd\n");
            } else {
                sb.append(floatOp ? "   fsub\n" : "   isub\n");
            }

            tipoActual = floatOp ? Tipo.FLOAT : Tipo.INT;
        }

        return sb.toString();
    }

    @Override
    public String visitExprMulDivMod(EJ3Parser.ExprMulDivModContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(visit(ctx.left));

        Tipo tipoActual = tipoPotencia(ctx.left);

        List<Token> ops = ctx.ops;
        List<EJ3Parser.PotenciaContext> rights = ctx.rights;

        for (int i = 0; i < rights.size(); i++) {
            EJ3Parser.PotenciaContext pRight = rights.get(i);
            Token op = ops.get(i);
            Tipo tipoRight = tipoPotencia(pRight);

            if (!esNumerico(tipoActual)) {
                tabla.semanticError(op,
                        "Se esperaba valor numérico y se encontró tipo " + tipoActual);
                return "";
            }
            if (!esNumerico(tipoRight)) {
                tabla.semanticError(op,
                        "Se esperaba valor numérico y se encontró tipo " + tipoRight);
                return "";
            }

            // Error 11: división por cero
            if (op.getType() == EJ3Lexer.DIV && esConstanteCero(pRight)) {
                tabla.semanticError(op, "División por cero");
                return "";
            }

            boolean floatOp = (tipoActual == Tipo.FLOAT || tipoRight == Tipo.FLOAT);

            if (floatOp && tipoActual != Tipo.FLOAT) sb.append("   i2f\n");

            sb.append(visit(pRight));
            if (floatOp && tipoRight != Tipo.FLOAT) sb.append("   i2f\n");

            switch (op.getType()) {
                case EJ3Lexer.MULT:
                    sb.append(floatOp ? "   fmul\n" : "   imul\n");
                    break;
                case EJ3Lexer.DIV:
                    sb.append(floatOp ? "   fdiv\n" : "   idiv\n");
                    break;
                case EJ3Lexer.MOD:
                    sb.append(floatOp ? "   frem\n" : "   irem\n");
                    break;
            }

            tipoActual = floatOp ? Tipo.FLOAT : Tipo.INT;
        }

        return sb.toString();
    }

    @Override
    public String visitExprPow(EJ3Parser.ExprPowContext ctx) {
        if (ctx.exp == null) {
            return visit(ctx.base);
        }

        Tipo tBase = tipoFactor(ctx.base);
        Tipo tExp  = tipoPotencia(ctx.exp);

        if (!esNumerico(tBase) || !esNumerico(tExp)) {
            Token potTok = ctx.POT().getSymbol();
            Tipo malo = !esNumerico(tBase) ? tBase : tExp;
            tabla.semanticError(potTok,
                    "Se esperaba valor numérico y se encontró tipo " + malo);
            return "";
        }

        StringBuilder sb = new StringBuilder();

        sb.append(visit(ctx.base));
        if (tBase == Tipo.INT || tBase == Tipo.BOOL) sb.append("   i2d\n");
        else if (tBase == Tipo.FLOAT)               sb.append("   f2d\n");

        sb.append(visit(ctx.exp));
        if (tExp == Tipo.INT || tExp == Tipo.BOOL) sb.append("   i2d\n");
        else if (tExp == Tipo.FLOAT)               sb.append("   f2d\n");

        sb.append("   invokestatic java/lang/Math/pow(DD)D\n");
        sb.append("   d2f\n");
        return sb.toString();
    }

    @Override
    public String visitExprNeg(EJ3Parser.ExprNegContext ctx) {
        Tipo t = tipoFactor(ctx.neg);
        if (!esNumerico(t)) {
            tabla.semanticError(ctx.RESTA().getSymbol(),
                    "Se esperaba valor numérico y se encontró tipo " + t);
            return "";
        }

        StringBuilder sb = new StringBuilder();
        sb.append(visit(ctx.neg));
        if (t == Tipo.FLOAT) sb.append("   fneg\n");
        else                 sb.append("   ineg\n");
        return sb.toString();
    }

    @Override
    public String visitExprParen(EJ3Parser.ExprParenContext ctx) {
        return visit(ctx.inner);
    }

    @Override
    public String visitExprAtom(EJ3Parser.ExprAtomContext ctx) {
        return visit(ctx.atom);
    }

    @Override
    public String visitAtomo(EJ3Parser.AtomoContext ctx) {
        if (ctx.intLit   != null) return "   ldc " + ctx.intLit.getText() + "\n";
        if (ctx.floatLit != null) return "   ldc " + ctx.floatLit.getText() + "\n";
        if (ctx.strLit   != null) return "   ldc " + ctx.strLit.getText() + "\n";

        String nombre = ctx.id.getText();
        Simbolo s = tabla.buscar(nombre);
        if (s == null) {
            // Error 5
            tabla.semanticError(ctx.id, "Variable '" + nombre + "' no declarada");
            return "";
        }
        return instruccionLoad(s.tipo, s.direccion);
    }

    // ======================
    // 8. TERMINALES
    // ======================

    @Override
    public String visitTerminal(TerminalNode node) {
        return null;
    }

    // ======================
    // 9. HELPERS DE TIPOS
    // ======================

    private Tipo tipoExprGeneral(EJ3Parser.Expr_generalContext ctx) {
        if (ctx instanceof EJ3Parser.ExprGeneralArithContext) {
            return tipoExpresion(((EJ3Parser.ExprGeneralArithContext) ctx).arith);
        } else if (ctx instanceof EJ3Parser.ExprGeneralBoolContext) {
            return Tipo.BOOL;
        }
        return Tipo.DESCONOCIDO;
    }

    private Tipo tipoExpresion(EJ3Parser.ExpresionContext ctx) {
        if (ctx instanceof EJ3Parser.ExprSumResContext) {
            EJ3Parser.ExprSumResContext c = (EJ3Parser.ExprSumResContext) ctx;
            Tipo tipo = tipoTermino(c.left);
            for (EJ3Parser.TerminoContext t : c.rights) {
                Tipo tr = tipoTermino(t);
                if (!esNumerico(tipo) || !esNumerico(tr)) return Tipo.DESCONOCIDO;
                if (tipo == Tipo.FLOAT || tr == Tipo.FLOAT) tipo = Tipo.FLOAT;
                else tipo = Tipo.INT;
            }
            return tipo;
        }
        return Tipo.DESCONOCIDO;
    }

    private Tipo tipoTermino(EJ3Parser.TerminoContext ctx) {
        if (ctx instanceof EJ3Parser.ExprMulDivModContext) {
            EJ3Parser.ExprMulDivModContext c = (EJ3Parser.ExprMulDivModContext) ctx;
            Tipo tipo = tipoPotencia(c.left);
            for (EJ3Parser.PotenciaContext p : c.rights) {
                Tipo tr = tipoPotencia(p);
                if (!esNumerico(tipo) || !esNumerico(tr)) return Tipo.DESCONOCIDO;
                if (tipo == Tipo.FLOAT || tr == Tipo.FLOAT) tipo = Tipo.FLOAT;
                else tipo = Tipo.INT;
            }
            return tipo;
        }
        return Tipo.DESCONOCIDO;
    }

    private Tipo tipoPotencia(EJ3Parser.PotenciaContext ctx) {
        if (ctx instanceof EJ3Parser.ExprPowContext) {
            EJ3Parser.ExprPowContext p = (EJ3Parser.ExprPowContext) ctx;
            if (p.exp == null) return tipoFactor(p.base);
            return Tipo.FLOAT; // pow retorna float (aprox)
        }
        return Tipo.DESCONOCIDO;
    }

    private Tipo tipoFactor(EJ3Parser.FactorContext ctx) {
        if (ctx instanceof EJ3Parser.ExprNegContext) {
            return tipoFactor(((EJ3Parser.ExprNegContext) ctx).neg);
        }
        if (ctx instanceof EJ3Parser.ExprParenContext) {
            return tipoExpresion(((EJ3Parser.ExprParenContext) ctx).inner);
        }
        if (ctx instanceof EJ3Parser.ExprAtomContext) {
            return tipoAtomo(((EJ3Parser.ExprAtomContext) ctx).atom);
        }
        return Tipo.DESCONOCIDO;
    }

    private Tipo tipoAtomo(EJ3Parser.AtomoContext ctx) {
        if (ctx.intLit   != null) return Tipo.INT;
        if (ctx.floatLit != null) return Tipo.FLOAT;
        if (ctx.strLit   != null) return Tipo.STRING;
        Simbolo s = tabla.buscar(ctx.id.getText());
        return (s == null) ? Tipo.DESCONOCIDO : s.tipo;
    }

    private Tipo tipoOperandoCmp(EJ3Parser.Operando_cmpContext ctx) {
        if (ctx.expr != null) return tipoExpresion(ctx.expr);
        if (ctx.bool != null) return Tipo.BOOL;
        return Tipo.DESCONOCIDO;
    }

    private boolean esNumerico(Tipo t) {
        return t == Tipo.INT || t == Tipo.FLOAT;
    }

    private boolean esConstanteCero(EJ3Parser.PotenciaContext ctx) {
        if (!(ctx instanceof EJ3Parser.ExprPowContext)) return false;
        EJ3Parser.ExprPowContext p = (EJ3Parser.ExprPowContext) ctx;
        if (p.exp != null) return false;

        EJ3Parser.FactorContext f = p.base;
        if (!(f instanceof EJ3Parser.ExprAtomContext)) return false;

        EJ3Parser.AtomoContext a = ((EJ3Parser.ExprAtomContext) f).atom;

        if (a.intLit != null) {
            return a.intLit.getText().equals("0");
        }
        if (a.floatLit != null) {
            String txt = a.floatLit.getText();
            return txt.equals("0") || txt.equals("0.0") || txt.equals("0.");
        }
        return false;
    }

    private boolean esConstanteCeroEnExpresion(EJ3Parser.ExpresionContext e) {
        if (!(e instanceof EJ3Parser.ExprSumResContext)) return false;
        EJ3Parser.ExprSumResContext s = (EJ3Parser.ExprSumResContext) e;

        if (!s.rights.isEmpty()) return false;
        EJ3Parser.TerminoContext t = s.left;
        if (!(t instanceof EJ3Parser.ExprMulDivModContext)) return false;

        EJ3Parser.ExprMulDivModContext m = (EJ3Parser.ExprMulDivModContext) t;
        if (!m.rights.isEmpty()) return false;

        EJ3Parser.PotenciaContext p = m.left;
        return esConstanteCero(p);
    }
}
