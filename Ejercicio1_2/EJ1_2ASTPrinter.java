package Ejercicio1_2;

import org.antlr.v4.runtime.tree.ParseTree;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/**
 * EJ1_2ASTPrinter
 *
 * Listener (basado en la clase generada por ANTLR) que construye una
 * representación textual del árbol sintáctico (AST) para el lenguaje
 * definido por la gramática EJ2.
 *
 * Cómo funciona:
 * - ANTLR invoca los métodos enter/exit correspondientes mientras
 *   recorre el árbol de análisis (parse tree).
 * - Este listener mantiene un StringBuilder donde acumula líneas con
 *   indentación para reflejar la jerarquía del AST.
 */
public class EJ1_2ASTPrinter extends EJ1_2ParserBaseListener {

    // Acumulador del texto que formamos mientras caminamos el árbol.
    private final StringBuilder sb = new StringBuilder();
    // Nivel de indentación actual (cada unidad -> 2 espacios en la salida).
    private int indent = 0;

    // Pila auxiliar para manejar condicionales anidados. Cada IfFrame
    // representa el estado de un if: 0=ninguno, 1=ENTONCES abierto, 2=SINO abierto.
    private static class IfFrame { int stage = 0; } // 0=nada, 1=then abierto, 2=else abierto
    private final Deque<IfFrame> ifStack = new ArrayDeque<>();

    /**
     * Imprime una línea en el StringBuilder respetando la indentación.
     * Cada nivel de indentación añade dos espacios.
     *
     * @param s Texto a añadir (sin salto de línea final)
     */
    private void println(String s) {
        for (int i = 0; i < indent; i++) sb.append("  ");
        sb.append(s).append('\n');
    }

    // Devuelve la representación textual completa construida por el listener.
    public String getResult() { return sb.toString(); }

    // -----------------------
    // Callbacks principales
    // -----------------------
    // Se llaman al entrar/salir en la regla 'programa' de la gramática.
    @Override public void enterPrograma(EJ1_2Parser.ProgramaContext ctx) {
        println("PROGRAMA");
        indent++;
    }
    @Override public void exitPrograma(EJ1_2Parser.ProgramaContext ctx) { indent--; }

    // -----------------------
    // Sentencias básicas
    // -----------------------
    // Cada uno extrae información del contexto (ctx) y formatea una línea.
    @Override public void enterDeclaracion(EJ1_2Parser.DeclaracionContext ctx) {
        // DECLARAR <ID> = <expresion/general>
        println("DECLARAR " + ctx.ID().getText() + " = " + toGeneral(ctx.expr_general()));
    }

    @Override public void enterAsignacion(EJ1_2Parser.AsignacionContext ctx) {
        // ASIGNAR <ID> = <expresion/general>
        println("ASIGNAR " + ctx.ID().getText() + " = " + toGeneral(ctx.expr_general()));
    }

    @Override public void enterImpresion(EJ1_2Parser.ImpresionContext ctx) {
        // MOSTRAR <expresion/general>
        println("MOSTRAR " + toGeneral(ctx.expr_general()));
    }


    // -----------------------
    // Bucles
    // -----------------------
    // MIENTRAS: imprime la condición y aumenta indent para el cuerpo.
    @Override public void enterBucle_mientras(EJ1_2Parser.Bucle_mientrasContext ctx) {
        println("MIENTRAS " + toBool(ctx.condicion()));
        indent++;
    }
    @Override public void exitBucle_mientras(EJ1_2Parser.Bucle_mientrasContext ctx) {
        indent--;
    }

    // PARA: construye una cabecera robusta respetando si existe PASO.
    @Override public void enterBucle_para(EJ1_2Parser.Bucle_paraContext ctx) {
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
    @Override public void exitBucle_para(EJ1_2Parser.Bucle_paraContext ctx) {
        indent--;
    }

    // -----------------------
    // Condicionales (IF / ELSE)
    // -----------------------
    @Override public void enterCondicional(EJ1_2Parser.CondicionalContext ctx) {
        // Imprime la cabecera del IF con la condición y prepara la pila
        println("SI " + toBool(ctx.condicion()));
        indent++;                // indent del encabezado SI
        ifStack.push(new IfFrame());
    }

    @Override public void exitCondicional(EJ1_2Parser.CondicionalContext ctx) {
        // Al salir cerramos cualquier bloque THEN/ELSE que quede abierto
        IfFrame top = ifStack.pop();
        if (top.stage == 1 || top.stage == 2) {
            indent--;            // cerrar ENTONCES o SINO
        }
        indent--;                // cerrar indent del encabezado SI
    }

    @Override public void enterBloque(EJ1_2Parser.BloqueContext ctx) {
        // Gestiona la transición ENTONCES -> SINO en condicionales anidados,
        // actualizando la indentación y el estado en la pila.
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

    @Override public void exitBloque(EJ1_2Parser.BloqueContext ctx) {
        // Importante: NO tocar indent aquí; se gestiona al salir del condicional (exitCondicional)
    }

    // -----------------------
    // Control de bucle: ROMPER / CONTINUAR
    // -----------------------
    @Override public void enterControl_bucle(EJ1_2Parser.Control_bucleContext ctx) {
        if (ctx.ROMPER() != null) println("ROMPER");
        else if (ctx.CONTINUAR() != null) println("CONTINUAR");
    }

    // -----------------------
    // HELPERS: Booleanos
    // Estas funciones convierten subárboles booleanos a cadenas legibles,
    // preservando el orden y priorización según la gramática.
    // -----------------------
    private String toBool(EJ1_2Parser.CondicionContext c) { return toBoolO(c.bool_o()); }

    private String toBoolO(EJ1_2Parser.Bool_oContext c) {
        List<EJ1_2Parser.Bool_yContext> ys = c.bool_y();
        if (ys.size() == 1) return toBoolY(ys.get(0));
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < ys.size(); i++) {
            if (i > 0) b.append(" or ");
            b.append(toBoolY(ys.get(i)));
        }
        return b.toString();
    }

    private String toBoolY(EJ1_2Parser.Bool_yContext c) {
        List<EJ1_2Parser.Bool_noContext> ns = c.bool_no();
        if (ns.size() == 1) return toBoolNo(ns.get(0));
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < ns.size(); i++) {
            if (i > 0) b.append(" and ");
            b.append(toBoolNo(ns.get(i)));
        }
        return b.toString();
    }

    private String toBoolNo(EJ1_2Parser.Bool_noContext c) {
        if (c.NOT() != null) return "not " + wrapBoolNo(c.bool_no());
        if (c.PAREN_ABRE() != null) return "(" + toBool(c.condicion()) + ")";
        if (c.comparacion() != null) return toCmp(c.comparacion());
        return c.booleano().getText(); // VERDADERO | FALSO
    }

    private String wrapBoolNo(EJ1_2Parser.Bool_noContext child) {
        // Evita 'not ((...))' si ya viene parentetizado
        if (child.NOT() != null || child.comparacion() != null || child.booleano() != null || child.PAREN_ABRE() != null)
            return toBoolNo(child);
        return "(" + toBoolNo(child) + ")";
    }

    private String toCmp(EJ1_2Parser.ComparacionContext c) {
        return toExpr(c.expresion(0)) + " " + c.operador_relacional().getText() + " " + toExpr(c.expresion(1));
    }

    // -----------------------
    // HELPERS: Aritmética
    // toExpr/toTerm/toFactor reconstruyen la expresión respetando el orden
    // de operadores tal y como aparecen en el parse tree.
    // -----------------------
    private String toExpr(EJ1_2Parser.ExpresionContext c) {
        // Recorremos los hijos para preservar exactamente el orden de + / -
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < c.getChildCount(); i++) {
            ParseTree ch = c.getChild(i);
            if (ch instanceof EJ1_2Parser.TerminoContext) {
                b.append(toTerm((EJ1_2Parser.TerminoContext) ch));
            } else {
                b.append(" ").append(ch.getText()).append(" ");
            }
        }
        return b.toString().trim();
    }

    private String toTerm(EJ1_2Parser.TerminoContext c) {
        // Igual idea para * y /
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < c.getChildCount(); i++) {
            ParseTree ch = c.getChild(i);
            if (ch instanceof EJ1_2Parser.FactorContext) {
                b.append(toFactor((EJ1_2Parser.FactorContext) ch));
            } else {
                b.append(" ").append(ch.getText()).append(" ");
            }
        }
        return b.toString().trim();
    }

    private String toFactor(EJ1_2Parser.FactorContext c) {
        if (c.RESTA() != null) return "-" + wrapFactor(c.factor());
        if (c.PAREN_ABRE() != null) return "(" + toExpr(c.expresion()) + ")";
        return toAtom(c.atomo());
    }

    private String wrapFactor(EJ1_2Parser.FactorContext f) {
        if (f.PAREN_ABRE() != null || f.atomo() != null) return toFactor(f);
        return "(" + toFactor(f) + ")";
    }

    private String toAtom(EJ1_2Parser.AtomoContext c) {
        if (c.INT() != null) return c.INT().getText();
        if (c.FLOAT() != null) return c.FLOAT().getText();
        if (c.STRING() != null) return c.STRING().getText();
        return c.ID().getText();
    }

    // -----------------------
    // HELPERS: expresión general (aritmética o booleana)
    // Decide en tiempo de ejecución si el subárbol contiene una expresión
    // aritmética o una condición booleana y delega al helper correspondiente.
    // -----------------------
    private String toGeneral(EJ1_2Parser.Expr_generalContext c) {
        if (c.expresion() != null) {
            // Es una expresión aritmética
            return toExpr(c.expresion());
        } else {
            // Es una condición booleana
            return toBool(c.condicion());
        }
    }

}

