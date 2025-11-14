import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * IkeaASTPrinter
 *
 * Listener que:
 *  1) Construye un AST textual legible con indentación.
 *  2) Acumula una "tabla de símbolos" simplificada:
 *        - Número de pasos.
 *        - Número de indicaciones.
 *        - Lista de herrajes con cantidades.
 *        - Lista de herramientas con usos.
 */
public class IkeaASTPrinter extends IkeaParserBaseListener {

    private final StringBuilder sb = new StringBuilder();
    private int indent = 0;

    private final List<Integer> listaPasos = new ArrayList<>();
    private final Map<String, Integer> tablaHerrajes = new LinkedHashMap<>();
    private final Map<String, Integer> tablaHerramientas = new LinkedHashMap<>();
    private int numIndicaciones = 0;

    private void println(String text) {
        for (int i = 0; i < indent; i++) sb.append("  ");
        sb.append(text).append('\n');
    }

    public String getResult() {
        return sb.toString();
    }

    // ------ PROGRAMA ------

    @Override
    public void enterPrograma(IkeaParser.ProgramaContext ctx) {
        println("PROGRAMA_MONTAJE");
        indent++;
    }

    @Override
    public void exitPrograma(IkeaParser.ProgramaContext ctx) {
        indent--;
    }

    // ------ INICIO / FIN ------

    @Override
    public void enterDeclaracion_inicio(IkeaParser.Declaracion_inicioContext ctx) {
        StringBuilder header = new StringBuilder("INICIO_MONTAJE");

        if (ctx.NOMBRE() != null) header.append(" ").append(ctx.NOMBRE().getText());
        if (ctx.NUMERO() != null) header.append(" ").append(ctx.NUMERO().getText());

        if (ctx.COMO() != null) {
            header.append(" COMO EXTENSION_DE ");
            header.append(describirMuebleReferencia(ctx.mueble_referencia()));
        }

        println(header.toString());
        indent++;
    }

    @Override
    public void exitDeclaracion_inicio(IkeaParser.Declaracion_inicioContext ctx) {
        indent--;
    }

    @Override
    public void enterDeclaracion_fin(IkeaParser.Declaracion_finContext ctx) {
        println("FIN_MONTAJE");
    }

    // ------ PASOS------

    @Override
    public void enterPaso(IkeaParser.PasoContext ctx) {
        int numPaso = Integer.parseInt(ctx.NUMERO().getText());
        listaPasos.add(numPaso);
        println("PASO " + numPaso);
        indent++;
    }

    @Override
    public void exitPaso(IkeaParser.PasoContext ctx) {
        indent--;
    }

    // ------INDICACIONES------

    @Override
    public void enterComentario(IkeaParser.ComentarioContext ctx) {
        numIndicaciones++;

        String tipo = ctx.CUIDADO().getText().replace(":", "");
        String mensaje = ctx.ANUNCIO().getText();

        println("INDICACION [" + tipo + "]:");
        indent++;
        println(mensaje.trim());
        indent--;
    }

    // ------ ACCIONES ------

    @Override
    public void enterAccion(IkeaParser.AccionContext ctx) {
        String encabezado = "ACCION ";

        if (ctx.INSERTAR() != null) encabezado += "INSERTAR";
        else if (ctx.UNIR() != null) encabezado += "UNIR";
        else if (ctx.COLOCAR() != null) encabezado += "COLOCAR";
        else if (ctx.GIRAR() != null) encabezado += "GIRAR";
        else if (ctx.CONECTAR() != null) encabezado += "CONECTAR";
        else if (ctx.MARCAR() != null) encabezado += "MARCAR";
        else if (ctx.NIVELAR() != null) encabezado += "NIVELAR";
        else if (ctx.FIJAR() != null) encabezado += "FIJAR";
        else encabezado += "(DESCONOCIDA)";

        println(encabezado);
        indent++;
    }

    @Override
    public void exitAccion(IkeaParser.AccionContext ctx) {
        indent--;
    }

    // ------ HERRAJES ------

    @Override
    public void exitHerraje_lista(IkeaParser.Herraje_listaContext ctx) {
        List<TerminalNode> cantidades = ctx.NUMERO();
        List<IkeaParser.Id_herrajeContext> ids = ctx.id_herraje();

        for (int i = 0; i < ids.size(); i++) {
            int cantidad = Integer.parseInt(cantidades.get(i).getText());
            String tipoHerraje = describirIdHerraje(ids.get(i));
            tablaHerrajes.merge(tipoHerraje, cantidad, Integer::sum);
        }

        StringBuilder linea = new StringBuilder("HERRAJES_EN_ESTA_ACCION: ");
        for (int i = 0; i < ids.size(); i++) {
            if (i > 0) linea.append(" ; ");
            linea.append(cantidades.get(i).getText())
                    .append(" x ")
                    .append(describirIdHerraje(ids.get(i)));
        }
        println(linea.toString());
    }

    private String describirIdHerraje(IkeaParser.Id_herrajeContext ctx) {
        if (ctx.TIPOHERRAJE() != null) return ctx.TIPOHERRAJE().getText();
        return "HERRAJE";
    }

    // ------ HERRAMIENTAS ------

    @Override
    public void exitHerramienta(IkeaParser.HerramientaContext ctx) {
        String tipoHerramienta = ctx.TIPOHERRAMIENTA().getText();
        tablaHerramientas.merge(tipoHerramienta, 1, Integer::sum);

        StringBuilder linea = new StringBuilder("HERRAMIENTA: ");
        linea.append(tipoHerramienta);
        if (ctx.NUMERO() != null) {
            linea.append(" (unidades declaradas: ").append(ctx.NUMERO().getText()).append(")");
        }
        println(linea.toString());
    }

    // ------PIEZA / MUEBLE ------

    @Override
    public void exitPieza(IkeaParser.PiezaContext ctx) {
        // No queremos imprimir PIEZA dos veces cuando ya aparece dentro de
        // una POSICION o una DISTANCIA (DE PIEZA ...).
        ParseTree parent = ctx.getParent();
        if (parent instanceof IkeaParser.PosicionContext ||
                parent instanceof IkeaParser.DistanciaContext) {
            return; // ya se imprime como parte de POSICION/DISTANCIA
        }

        String desc = describirPieza(ctx);
        if (desc.isEmpty()) {
            println("PIEZA");
        } else {
            println("PIEZA " + desc);
        }
    }

    private String describirPieza(IkeaParser.PiezaContext ctx) {
        if (ctx.getChildCount() == 1) return "";

        ParseTree second = ctx.getChild(1);
        String secondText = second.getText();

        // Caso PIEZA ( NOMBRE [NUMERO]? )
        if ("(".equals(secondText)) {
            String nombre = null;
            String numero = null;
            for (int i = 2; i < ctx.getChildCount() - 1; i++) {
                String t = ctx.getChild(i).getText();
                if (nombre == null) nombre = t;
                else numero = t;
            }
            if (numero == null) return "(" + nombre + ")";
            return "(" + nombre + " " + numero + ")";
        }

        // Caso PIEZA NOMBRE
        return secondText;
    }

    @Override
    public void exitMueble_referencia(IkeaParser.Mueble_referenciaContext ctx) {
        // Igual que con PIEZA: no duplicar dentro de POSICION/DISTANCIA
        ParseTree parent = ctx.getParent();
        if (parent instanceof IkeaParser.PosicionContext ||
                parent instanceof IkeaParser.DistanciaContext) {
            return;
        }

        println("MUEBLE_REF " + describirMuebleReferencia(ctx));
    }

    private String describirMuebleReferencia(IkeaParser.Mueble_referenciaContext ctx) {
        if (ctx == null || ctx.id() == null) return "(sin_id)";

        IkeaParser.IdContext idCtx = ctx.id();
        StringBuilder b = new StringBuilder();
        if (idCtx.NOMBRE() != null) {
            b.append(idCtx.NOMBRE().getText()).append(" ");
        }
        b.append("(").append(idCtx.NUMERO().getText()).append(")");
        return b.toString();
    }

    // ------ DISTANCIA ------

    @Override
    public void exitDistancia(IkeaParser.DistanciaContext ctx) {

        println("DISTANCIA:");
        indent++;

        println("A " + ctx.NUMERO().getText() + " " + ctx.UD_MEDIDA().getText());

        if (ctx.POSICION() != null) {
            println("DE POSICION " + ctx.POSICION().getText());
        }

        if (ctx.pieza() != null) {
            println("DE PIEZA " + describirPieza(ctx.pieza()));
        } else if (ctx.mueble_referencia() != null) {
            println("DE MUEBLE " + describirMuebleReferencia(ctx.mueble_referencia()));
        }

        indent--;
    }

    // ------ POSICION ------

    @Override
    public void exitPosicion(IkeaParser.PosicionContext ctx) {

        println("POSICION:");
        indent++;

        // Caso EN <ORIENTACION|POSICION> (DE (mueble|pieza))?
        if (ctx.EN() != null) {
            // EN X
            println("EN " + ctx.getChild(1).getText());

            // Opcional "DE PIEZA/MUEBLE ..."
            if (ctx.getChildCount() > 3 && "DE".equals(ctx.getChild(2).getText())) {
                if (ctx.pieza() != null) {
                    println("DE PIEZA " + describirPieza(ctx.pieza()));
                } else if (ctx.mueble_referencia() != null) {
                    println("DE MUEBLE " + describirMuebleReferencia(ctx.mueble_referencia()));
                }
            }
        }

        // Caso JUNTO_A (mueble|pieza)
        else if (ctx.JUNTO_A() != null) {
            if (ctx.pieza() != null) {
                println("JUNTO_A PIEZA " + describirPieza(ctx.pieza()));
            } else if (ctx.mueble_referencia() != null) {
                println("JUNTO_A MUEBLE " + describirMuebleReferencia(ctx.mueble_referencia()));
            }
        }

        // Caso SOBRE/BAJO (mueble|pieza)
        else if (ctx.SOBRE() != null || ctx.BAJO() != null) {
            String prep = ctx.getChild(0).getText(); // SOBRE o BAJO
            if (ctx.pieza() != null) {
                println(prep + " PIEZA " + describirPieza(ctx.pieza()));
            } else if (ctx.mueble_referencia() != null) {
                println(prep + " MUEBLE " + describirMuebleReferencia(ctx.mueble_referencia()));
            }
        }

        indent--;
    }

    // ------ RESUMEN ------

    public String buildResumenSimbolos() {
        StringBuilder r = new StringBuilder();

        r.append("PASOS DETECTADOS: ").append(listaPasos.size()).append("\n\n");
        r.append("NUMERO DE INDICACIONES: ").append(numIndicaciones).append("\n\n");

        r.append("LISTA DE HERRAJES (TOTAL ACUMULADO):\n");
        if (tablaHerrajes.isEmpty()) {
            r.append("  (No se han detectado herrajes)\n");
        } else {
            for (Map.Entry<String, Integer> e : tablaHerrajes.entrySet()) {
                r.append("  - ").append(e.getKey())
                        .append(" : ").append(e.getValue())
                        .append(" unidades\n");
            }
        }
        r.append("\n");

        r.append("LISTA DE HERRAMIENTAS A UTILIZAR:\n");
        if (tablaHerramientas.isEmpty()) {
            r.append("  (No se han detectado herramientas)\n");
        } else {
            for (Map.Entry<String, Integer> e : tablaHerramientas.entrySet()) {
                r.append("  - ").append(e.getKey())
                        .append(" (usos: ").append(e.getValue()).append(")\n");
            }
        }

        return r.toString();
    }
}
