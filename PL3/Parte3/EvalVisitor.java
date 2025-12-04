import org.antlr.v4.runtime.Token;

public class EvalVisitor extends EJ1_2ParserBaseVisitor<Value> {

    private final SymbolTable symbols = new SymbolTable();

    // buffer para guardar todo lo que “mostrar” imprime
    private final StringBuilder output = new StringBuilder();

    public String getOutput() {
        return output.toString();
    }

    // ---------- Helpers de tipos / errores ----------

    private SemanticException error(Token token, String msg) {
        return new SemanticException(
                msg + " (línea " + token.getLine() +
                        ", columna " + token.getCharPositionInLine() + ")"
        );
    }

    private void ensureBool(Value v, Token token) {
        if (v.getType() != Type.BOOL) {
            throw error(token, "Se esperaba booleano y se encontró tipo " + v.getType());
        }
    }

    private void ensureNumeric(Value v, Token token) {
        if (v.getType() != Type.INT && v.getType() != Type.FLOAT) {
            throw error(token, "Se esperaba valor numérico y se encontró tipo " + v.getType());
        }
    }

    private Value promoteNumeric(Value a, Value b) {
        // Promoción simple: si alguno es FLOAT -> ambos a FLOAT
        if (a.getType() == Type.FLOAT || b.getType() == Type.FLOAT) {
            float fa = a.asFloat();
            float fb = b.asFloat();
            return new Value(Type.FLOAT, new float[]{fa, fb});
        } else {
            int ia = a.asInt();
            int ib = b.asInt();
            return new Value(Type.INT, new int[]{ia, ib});
        }
    }

    // ---------- programa y bloques ----------

    @Override
    public Value visitPrograma(EJ1_2Parser.ProgramaContext ctx) {
        // Ejecuta todas las sentencias/condicionales en orden
        for (var child : ctx.children) {
            visit(child);
        }
        return Value.VOID;
    }

    @Override
    public Value visitBloque(EJ1_2Parser.BloqueContext ctx) {
        for (var child : ctx.children) {
            visit(child);
        }
        return Value.VOID;
    }

    // ---------- Declaración, asignación, impresión ----------

    @Override
    public Value visitDeclaracion(EJ1_2Parser.DeclaracionContext ctx) {
        String nombre = ctx.ID().getText();
        Token tokenId = ctx.ID().getSymbol();

        Value v = visit(ctx.expr_general()); // evalúa la expresión general
        symbols.declare(nombre, v, tokenId);

        return Value.VOID;
    }

    @Override
    public Value visitAsignacion(EJ1_2Parser.AsignacionContext ctx) {
        String nombre = ctx.ID().getText();
        Token tokenId = ctx.ID().getSymbol();

        Symbol s = symbols.lookup(nombre, tokenId);
        Value v = visit(ctx.expr_general());

        // Comprobación de tipo simple: mismo tipo o int->float
        Type tVar = s.getType();
        Type tVal = v.getType();

        if (tVar == Type.FLOAT && tVal == Type.INT) {
            // Promoción int -> float
            v = new Value(Type.FLOAT, (float) v.asInt());
        } else if (tVar != tVal) {
            throw error(tokenId, "No se puede asignar valor de tipo " + tVal + " a variable de tipo " + tVar);
        }

        s.setValue(v);
        return Value.VOID;
    }

    @Override
    public Value visitImpresion(EJ1_2Parser.ImpresionContext ctx) {
        Value v = visit(ctx.expr_general());
        String line = v.asString();

        // Lo mostramos por pantalla (si quieres seguir viendo la ejecución)
        System.out.println(line);

        // Y además lo guardamos en el buffer
        output.append(line).append(System.lineSeparator());

        return Value.VOID;
    }

    // ---------- Control de bucle: break / continue ----------

    @Override
    public Value visitControl_bucle(EJ1_2Parser.Control_bucleContext ctx) {
        if (ctx.ROMPER() != null) {
            throw new BreakException();
        } else if (ctx.CONTINUAR() != null) {
            throw new ContinueException();
        }
        return Value.VOID;
    }

    // ---------- If / condicional ----------

    @Override
    public Value visitCondicional(EJ1_2Parser.CondicionalContext ctx) {
        Value cond = visit(ctx.condicion());
        ensureBool(cond, ctx.condicion().start);

        boolean b = cond.asBool();
        if (b) {
            visit(ctx.bloque(0));  // bloque después de 'si ->'
        } else {
            if (ctx.SI_NO() != null) {
                visit(ctx.bloque(1)); // bloque después de 'no ->'
            }
        }
        return Value.VOID;
    }

    // ---------- Bucle mientras ----------

    @Override
    public Value visitBucle_mientras(EJ1_2Parser.Bucle_mientrasContext ctx) {
        while (true) {
            Value cond = visit(ctx.condicion());
            ensureBool(cond, ctx.condicion().start);

            if (!cond.asBool()) {
                break;
            }
            try {
                visit(ctx.bloque());
            } catch (BreakException be) {
                break;
            } catch (ContinueException ce) {
                // saltar al siguiente ciclo
            }
        }
        return Value.VOID;
    }

    // ---------- Bucle para ----------

    @Override
    public Value visitBucle_para(EJ1_2Parser.Bucle_paraContext ctx) {
        String varName = ctx.ID().getText();
        Token tokenId = ctx.ID().getSymbol();

        // inicio, fin, paso (expresiones)
        Value inicioV = visit(ctx.expresion(0));
        Value finV    = visit(ctx.expresion(1));
        Value pasoV;

        if (ctx.PASO() != null) {
            pasoV = visit(ctx.expresion(2));
        } else {
            pasoV = new Value(Type.INT, 1);  // paso por defecto = 1
        }

        // Deben ser numéricos
        ensureNumeric(inicioV, ctx.expresion(0).start);
        ensureNumeric(finV,    ctx.expresion(1).start);
        ensureNumeric(pasoV,   (ctx.PASO() != null ? ctx.expresion(2).start
                : ctx.expresion(0).start));

        // Y además, DEBEN SER ENTEROS: si no, error semántico claro
        if (inicioV.getType() != Type.INT) {
            throw error(ctx.expresion(0).start,
                    "El inicio del bucle 'para' debe ser entero (tipo actual: " + inicioV.getType() + ")");
        }
        if (finV.getType() != Type.INT) {
            throw error(ctx.expresion(1).start,
                    "El límite del bucle 'para' debe ser entero (tipo actual: " + finV.getType() + ")");
        }
        if (pasoV.getType() != Type.INT) {
            Token tPaso = (ctx.PASO() != null ? ctx.PASO().getSymbol() : ctx.expresion(0).start);
            throw error(tPaso,
                    "El paso del bucle 'para' debe ser entero (tipo actual: " + pasoV.getType() + ")");
        }

        int inicio = inicioV.asInt();
        int fin    = finV.asInt();
        int paso   = pasoV.asInt();

        if (paso == 0) {
            throw error(ctx.PASO() != null ? ctx.PASO().getSymbol() : tokenId,
                    "El paso de un bucle 'para' no puede ser 0");
        }

        // Declaramos la variable si no existe; si existe, la reutilizamos
        if (!symbols.exists(varName)) {
            symbols.declare(varName, new Value(Type.INT, inicio), tokenId);
        } else {
            Symbol s = symbols.lookup(varName, tokenId);
            if (s.getType() != Type.INT) {
                throw error(tokenId, "La variable del bucle 'para' debe ser de tipo INT");
            }
            s.setValue(new Value(Type.INT, inicio));
        }

        while (true) {
            Symbol s = symbols.lookup(varName, tokenId);
            int i = s.getValue().asInt();

            boolean dentro;
            if (paso > 0) {
                dentro = i <= fin;
            } else {
                dentro = i >= fin;
            }
            if (!dentro) break;

            try {
                visit(ctx.bloque());
            } catch (BreakException be) {
                break;
            } catch (ContinueException ce) {
                // continuar al siguiente ciclo
            }

            // i = i + paso
            s.setValue(new Value(Type.INT, i + paso));
        }

        return Value.VOID;
    }


    // ---------- Expresiones generales ----------

    @Override
    public Value visitExpr_general(EJ1_2Parser.Expr_generalContext ctx) {
        if (ctx.expresion() != null) {
            return visit(ctx.expresion());
        } else {
            return visit(ctx.condicion());
        }
    }

    // ---------- Booleanos y condiciones ----------

    @Override
    public Value visitCondicion(EJ1_2Parser.CondicionContext ctx) {
        return visit(ctx.bool_o());
    }

    @Override
    public Value visitBool_o(EJ1_2Parser.Bool_oContext ctx) {
        Value result = visit(ctx.bool_y(0));
        ensureBool(result, ctx.bool_y(0).start);

        for (int i = 1; i < ctx.bool_y().size(); i++) {
            Value rhs = visit(ctx.bool_y(i));
            ensureBool(rhs, ctx.bool_y(i).start);
            result = new Value(Type.BOOL, result.asBool() || rhs.asBool());
        }
        return result;
    }

    @Override
    public Value visitBool_y(EJ1_2Parser.Bool_yContext ctx) {
        Value result = visit(ctx.bool_no(0));
        ensureBool(result, ctx.bool_no(0).start);

        for (int i = 1; i < ctx.bool_no().size(); i++) {
            Value rhs = visit(ctx.bool_no(i));
            ensureBool(rhs, ctx.bool_no(i).start);
            result = new Value(Type.BOOL, result.asBool() && rhs.asBool());
        }
        return result;
    }

    @Override
    public Value visitBool_no(EJ1_2Parser.Bool_noContext ctx) {
        if (ctx.NOT() != null) {
            Value v = visit(ctx.bool_no());
            ensureBool(v, ctx.bool_no().start);
            return new Value(Type.BOOL, !v.asBool());
        } else if (ctx.PAREN_ABRE() != null) {
            return visit(ctx.condicion());
        } else if (ctx.comparacion() != null) {
            return visit(ctx.comparacion());
        } else {
            return visit(ctx.booleano());
        }
    }

    @Override
    public Value visitComparacion(EJ1_2Parser.ComparacionContext ctx) {
        // comparacion : operando_cmp operador_relacional operando_cmp ;

        Value left  = visit(ctx.operando_cmp(0));
        Value right = visit(ctx.operando_cmp(1));

        String op   = ctx.operador_relacional().getText();
        Token tokOp = ctx.operador_relacional().start;

        Type t1 = left.getType();
        Type t2 = right.getType();

        // DEBUG opcional
        //System.out.println("DEBUG COMPARACION: op=" + op +
        //        "  leftType=" + t1 + " rightType=" + t2 +
        //        "  leftVal=" + left.asString() +
        //        "  rightVal=" + right.asString());

        boolean ambosNumericos =
                (t1 == Type.INT || t1 == Type.FLOAT) &&
                        (t2 == Type.INT || t2 == Type.FLOAT);

        boolean ambosBool   = (t1 == Type.BOOL   && t2 == Type.BOOL);
        boolean ambosString = (t1 == Type.STRING && t2 == Type.STRING);

        // === Igualdad / desigualdad ===
        if (op.equals("==") || op.equals("!=")) {

            // Solo permitimos:
            //  - numérico == numérico
            //  - bool     == bool
            //  - string   == string
            if (!(ambosNumericos || ambosBool || ambosString)) {
                throw error(tokOp, "Comparación de igualdad entre tipos incompatibles: "
                        + t1 + " y " + t2);
            }

            boolean eq;
            if (ambosNumericos) {
                float a = left.asFloat();
                float b = right.asFloat();
                eq = (a == b);
            } else if (ambosBool) {
                eq = (left.asBool() == right.asBool());
            } else { // ambosString
                eq = left.asString().equals(right.asString());
            }

            boolean res = op.equals("==") ? eq : !eq;
            return new Value(Type.BOOL, res);
        }

        // === <, <=, >, >= -> SOLO numéricos ===
        if (!ambosNumericos) {
            throw error(tokOp,
                    "Operador relacional '" + op +
                            "' solo se puede usar con operandos numéricos (no con "
                            + t1 + " y " + t2 + ")");
        }

        float a = left.asFloat();
        float b = right.asFloat();
        boolean res;

        switch (op) {
            case "<"  -> res = a <  b;
            case "<=" -> res = a <= b;
            case ">"  -> res = a >  b;
            case ">=" -> res = a >= b;
            default   -> throw error(tokOp, "Operador relacional desconocido: " + op);
        }

        return new Value(Type.BOOL, res);
    }




    @Override
    public Value visitBooleano(EJ1_2Parser.BooleanoContext ctx) {
        if (ctx.VERDADERO() != null) {
            return new Value(Type.BOOL, true);
        } else if (ctx.FALSO() != null) {
            return new Value(Type.BOOL, false);
        } else { // ID booleano
            String name = ctx.ID().getText();
            Symbol s = symbols.lookup(name, ctx.ID().getSymbol());
            if (s.getType() != Type.BOOL) {
                throw error(ctx.ID().getSymbol(), "Se esperaba variable booleana y '" + name +
                        "' es de tipo " + s.getType());
            }
            return s.getValue();
        }
    }

    // ---------- Aritmética: expresion, termino, factor, atomo ----------

    @Override
    public Value visitExpresion(EJ1_2Parser.ExpresionContext ctx) {
        Value result = visit(ctx.termino(0));

        for (int i = 1; i < ctx.termino().size(); i++) {
            Value right = visit(ctx.termino(i));
            Token opTok = (ctx.SUMA(i - 1) != null) ? ctx.SUMA(i - 1).getSymbol()
                    : ctx.RESTA(i - 1).getSymbol();
            String op = opTok.getText();

            ensureNumeric(result, ctx.termino(i - 1).start);
            ensureNumeric(right, ctx.termino(i).start);

            float a = result.asFloat();
            float b = right.asFloat();
            float r = op.equals("+") ? a + b : a - b;

            // Si ambos eran INT y no hay coma, devolvemos INT; si no, FLOAT
            if (result.getType() == Type.INT && right.getType() == Type.INT) {
                r = (int) r;
                result = new Value(Type.INT, (int) r);
            } else {
                result = new Value(Type.FLOAT, r);
            }
        }
        return result;
    }

    @Override
    public Value visitTermino(EJ1_2Parser.TerminoContext ctx) {
        Value result = visit(ctx.factor(0));

        for (int i = 1; i < ctx.factor().size(); i++) {
            Value right = visit(ctx.factor(i));
            Token opTok = (ctx.MULT(i - 1) != null) ? ctx.MULT(i - 1).getSymbol()
                    : ctx.DIV(i - 1).getSymbol();
            String op = opTok.getText();

            ensureNumeric(result, ctx.factor(i - 1).start);
            ensureNumeric(right, ctx.factor(i).start);

            float a = result.asFloat();
            float b = right.asFloat();

            if (op.equals("/") && b == 0.0f) {
                throw error(opTok, "División por cero");
            }

            float r = op.equals("*") ? a * b : a / b;

            if (result.getType() == Type.INT && right.getType() == Type.INT && op.equals("*")) {
                result = new Value(Type.INT, (int) r);
            } else {
                result = new Value(Type.FLOAT, r);
            }
        }
        return result;
    }

    @Override
    public Value visitFactor(EJ1_2Parser.FactorContext ctx) {
        if (ctx.RESTA() != null) {
            Value v = visit(ctx.factor());
            ensureNumeric(v, ctx.factor().start);
            if (v.getType() == Type.INT) {
                return new Value(Type.INT, -v.asInt());
            } else {
                return new Value(Type.FLOAT, -v.asFloat());
            }
        } else if (ctx.PAREN_ABRE() != null) {
            return visit(ctx.expresion());
        } else {
            return visit(ctx.atomo());
        }
    }

    @Override
    public Value visitAtomo(EJ1_2Parser.AtomoContext ctx) {
        if (ctx.INT() != null) {
            int v = Integer.parseInt(ctx.INT().getText());
            return new Value(Type.INT, v);
        } else if (ctx.FLOAT() != null) {
            float f = Float.parseFloat(ctx.FLOAT().getText());
            return new Value(Type.FLOAT, f);
        } else if (ctx.STRING() != null) {
            String s = ctx.STRING().getText();
            // Quitamos comillas externas
            s = s.substring(1, s.length() - 1);
            return new Value(Type.STRING, s);
        } else { // ID
            String name = ctx.ID().getText();
            Symbol sym = symbols.lookup(name, ctx.ID().getSymbol());
            return sym.getValue();
        }
    }
}
