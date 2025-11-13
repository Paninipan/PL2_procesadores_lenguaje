
import org.antlr.v4.runtime.tree.ParseTree;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class EJ2ASTPrinter extends EJ2ParserBaseListener {

    private final StringBuilder sb = new StringBuilder();
    private int indent = 0;

    // Pila para distinguir bloques THEN/ELSE al recorrer condicionales anidados
    private static class IfFrame { int stage = 0; } // 0=nada, 1=then abierto, 2=else abierto
    private final Deque<IfFrame> ifStack = new ArrayDeque<>();

    private void println(String s) {
        for (int i = 0; i < indent; i++) sb.append("  ");
        sb.append(s).append('\n');
    }

    public String getResult() { return sb.toString(); }

    // PROGRAMA
    @Override public void enterPrograma(EJ2Parser.ProgramaContext ctx) {
        println("PROGRAMA");
        indent++;
    }
    @Override public void exitPrograma(EJ2Parser.ProgramaContext ctx) { indent--; }

    // SENTENCIAS BÁSICAS
    @Override public void enterDeclaracion(EJ2Parser.DeclaracionContext ctx) {
        println("DECLARAR " + ctx.ID().getText() + " = " + toGeneral(ctx.expr_general()));
    }

    @Override public void enterAsignacion(EJ2Parser.AsignacionContext ctx) {
        println("ASIGNAR " + ctx.ID().getText() + " = " + toGeneral(ctx.expr_general()));
    }

    @Override public void enterImpresion(EJ2Parser.ImpresionContext ctx) {
        println("MOSTRAR " + toGeneral(ctx.expr_general()));
    }


    // BUCLES

    // WHILE: bucle_mientras
    @Override public void enterBucle_mientras(EJ2Parser.Bucle_mientrasContext ctx) {
        println("MIENTRAS " + toBool(ctx.condicion()));
        indent++;
    }
    @Override public void exitBucle_mientras(EJ2Parser.Bucle_mientrasContext ctx) {
        indent--;
    }

    // FOR: bucle_para
    @Override public void enterBucle_para(EJ2Parser.Bucle_paraContext ctx) {
        // PARA i DESDE expr0 HASTA expr1 (PASO expr2)?
        StringBuilder header = new StringBuilder();
        header.append("PARA ")
                .append(ctx.ID().getText())
                .append(" DESDE ")
                .append(toExpr(ctx.expresion(0)))
                .append(" HASTA ")
                .append(toExpr(ctx.expresion(1)));

        if (ctx.PASO() != null) {
            header.append(" PASO ")
                    .append(toExpr(ctx.expresion(2)));
        }

        println(header.toString());
        indent++;
    }
    @Override public void exitBucle_para(EJ2Parser.Bucle_paraContext ctx) {
        indent--;
    }

    // IF / ELSE
    @Override public void enterCondicional(EJ2Parser.CondicionalContext ctx) {
        println("SI " + toBool(ctx.condicion()));
        indent++;                // indent del encabezado SI
        ifStack.push(new IfFrame());
    }

    @Override public void exitCondicional(EJ2Parser.CondicionalContext ctx) {
        // Al salir del condicional, cerramos el bloque THEN/ELSE si quedó abierto
        IfFrame top = ifStack.pop();
        if (top.stage == 1 || top.stage == 2) {
            indent--;            // cerrar ENTONCES o SINO
        }
        indent--;                // cerrar indent del encabezado SI
    }

    @Override public void enterBloque(EJ2Parser.BloqueContext ctx) {
        if (!ifStack.isEmpty()) {
            IfFrame top = ifStack.peek();
            if (top.stage == 0) {
                println("ENTONCES");
                indent++;
                top.stage = 1;
            } else if (top.stage == 1) {
                // Cambiamos de ENTONCES a SINO: cerramos el indent de ENTONCES y abrimos SINO
                indent--;
                println("SINO");
                indent++;
                top.stage = 2;
            }
        }
        // En otros contextos (while / for u otros bloques) no se imprime cabecera ni se toca indent aquí
    }

    @Override public void exitBloque(EJ2Parser.BloqueContext ctx) {
        // Importante: NO tocar indent aquí; se gestiona al salir del condicional (exitCondicional)
    }

    // CONTROL DE BUCLE
    @Override public void enterControl_bucle(EJ2Parser.Control_bucleContext ctx) {
        if (ctx.ROMPER() != null) println("ROMPER");
        else if (ctx.CONTINUAR() != null) println("CONTINUAR");
    }

    // HELPERS: BOOLEANOS
    private String toBool(EJ2Parser.CondicionContext c) { return toBoolO(c.bool_o()); }

    private String toBoolO(EJ2Parser.Bool_oContext c) {
        List<EJ2Parser.Bool_yContext> ys = c.bool_y();
        if (ys.size() == 1) return toBoolY(ys.get(0));
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < ys.size(); i++) {
            if (i > 0) b.append(" or ");
            b.append(toBoolY(ys.get(i)));
        }
        return b.toString();
    }

    private String toBoolY(EJ2Parser.Bool_yContext c) {
        List<EJ2Parser.Bool_noContext> ns = c.bool_no();
        if (ns.size() == 1) return toBoolNo(ns.get(0));
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < ns.size(); i++) {
            if (i > 0) b.append(" and ");
            b.append(toBoolNo(ns.get(i)));
        }
        return b.toString();
    }

    private String toBoolNo(EJ2Parser.Bool_noContext c) {
        if (c.NOT() != null) return "not " + wrapBoolNo(c.bool_no());
        if (c.PAREN_ABRE() != null) return "(" + toBool(c.condicion()) + ")";
        if (c.comparacion() != null) return toCmp(c.comparacion());
        return c.booleano().getText(); // VERDADERO | FALSO
    }

    private String wrapBoolNo(EJ2Parser.Bool_noContext child) {
        // Evita 'not ((...))' si ya viene parentetizado
        if (child.NOT() != null || child.comparacion() != null || child.booleano() != null || child.PAREN_ABRE() != null)
            return toBoolNo(child);
        return "(" + toBoolNo(child) + ")";
    }

    private String toCmp(EJ2Parser.ComparacionContext c) {
        return toExpr(c.expresion(0)) + " " + c.operador_relacional().getText() + " " + toExpr(c.expresion(1));
    }

    // HELPERS: ARITMÉTICA
    private String toExpr(EJ2Parser.ExpresionContext c) {
        // Recorremos los hijos para preservar exactamente el orden de + / -
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < c.getChildCount(); i++) {
            ParseTree ch = c.getChild(i);
            if (ch instanceof EJ2Parser.TerminoContext) {
                b.append(toTerm((EJ2Parser.TerminoContext) ch));
            } else {
                b.append(" ").append(ch.getText()).append(" ");
            }
        }
        return b.toString().trim();
    }

    private String toTerm(EJ2Parser.TerminoContext c) {
        // Igual idea para * y /
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < c.getChildCount(); i++) {
            ParseTree ch = c.getChild(i);
            if (ch instanceof EJ2Parser.FactorContext) {
                b.append(toFactor((EJ2Parser.FactorContext) ch));
            } else {
                b.append(" ").append(ch.getText()).append(" ");
            }
        }
        return b.toString().trim();
    }

    private String toFactor(EJ2Parser.FactorContext c) {
        if (c.RESTA() != null) return "-" + wrapFactor(c.factor());
        if (c.PAREN_ABRE() != null) return "(" + toExpr(c.expresion()) + ")";
        return toAtom(c.atomo());
    }

    private String wrapFactor(EJ2Parser.FactorContext f) {
        if (f.PAREN_ABRE() != null || f.atomo() != null) return toFactor(f);
        return "(" + toFactor(f) + ")";
    }

    private String toAtom(EJ2Parser.AtomoContext c) {
        if (c.INT() != null) return c.INT().getText();
        if (c.FLOAT() != null) return c.FLOAT().getText();
        if (c.STRING() != null) return c.STRING().getText();
        return c.ID().getText();
    }

    // HELPERS: expresión general (aritmética o booleana)
    private String toGeneral(EJ2Parser.Expr_generalContext c) {
        if (c.expresion() != null) {
            // Es una expresión aritmética
            return toExpr(c.expresion());
        } else {
            // Es una condición booleana
            return toBool(c.condicion());
        }
    }

}

