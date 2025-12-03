import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * IkeaASTPrinter
 *
 * Esta clase actúa como un listener especializado para la gramática definida en ANTLR
 * con el objetivo de procesar un lenguaje específico de dominio orientado a describir
 * instrucciones de montaje tipo IKEA. Extiende IkeaParserBaseListener para responder
 * a los eventos generados durante el recorrido del árbol sintáctico.
 *
 * Su funcionalidad principal se organiza en dos ejes:
 *  1) Construcción de un AST textual con indentación, permitiendo visualizar de forma
 *     clara la estructura jerárquica de cada instrucción procesada.
 *  2) Generación de una tabla de símbolos simplificada que incluye:
 *        - Número total de pasos detectados.
 *        - Número de indicaciones emitidas.
 *        - Acumulación de herrajes empleados con sus cantidades.
 *        - Herramientas utilizadas con el número de usos asociados.
 *
 * Este enfoque facilita tanto la depuración de la gramática como el análisis semántico
 * posterior del programa de montaje.
 */
public class IkeaASTPrinter extends IkeaParserBaseListener {

    // StringBuilder encargado de almacenar la salida textual del AST.
    private final StringBuilder sb = new StringBuilder();

    // Control del nivel de indentación actual.
    private int indent = 0;

    // Lista de pasos detectados en el programa.
    private final List<Integer> listaPasos = new ArrayList<>();

    // Map para acumular herrajes y sus cantidades totales.
    private final Map<String, Integer> tablaHerrajes = new LinkedHashMap<>();

    // Map donde se registra cada tipo de herramienta con el número de veces utilizada.
    private final Map<String, Integer> tablaHerramientas = new LinkedHashMap<>();

    // Contador del número de indicaciones encontradas.
    private int numIndicaciones = 0;

    /**
     * Método auxiliar que imprime texto con la indentación adecuada
     * según la profundidad en el árbol sintáctico.
     */
    private void println(String text) {
        for (int i = 0; i < indent; i++) sb.append("  ");
        sb.append(text).append('\n');
    }

    /**
     * Devuelve el contenido acumulado del AST textual.
     */
    public String getResult() {
        return sb.toString();
    }

    // -------------------------------------------------------------
    // PROGRAMA
    // -------------------------------------------------------------

    @Override
    public void enterPrograma(IkeaParser.ProgramaContext ctx) {
        // Marca el inicio del programa de montaje.
        println("PROGRAMA_MONTAJE");
        indent++;
    }

    @Override
    public void exitPrograma(IkeaParser.ProgramaContext ctx) {
        // Cierra el bloque del programa.
        indent--;
    }

    // -------------------------------------------------------------
    // INICIO / FIN
    // -------------------------------------------------------------

    @Override
    public void enterDeclaracion_inicio(IkeaParser.Declaracion_inicioContext ctx) {
        /**
         * Construye la cabecera del bloque de inicio de montaje, incorporando
         * el nombre del módulo, número identificador y, en caso de existir,
         * la referencia al mueble base mediante la palabra clave COMO.
         */
        StringBuilder header = new StringBuilder("INICIO_MONTAJE");

        if (ctx.NOMBRE() != null) header.append(" ").append(ctx.NOMBRE().getText());
        if (ctx.NUMERO() != null) header.append(" ").append(ctx.NUMERO().getText());

        if (ctx.COMO() != null) {
            header.append(" COMO EXTENSION_DE ");
            header.append("MUEBLE ").append(describirMuebleReferencia(ctx.mueble_referencia()));
        }

        println(header.toString());
        indent++;
    }

    @Override
    public void exitDeclaracion_inicio(IkeaParser.Declaracion_inicioContext ctx) {
        // Fin de la declaración de inicio.
        indent--;
    }

    @Override
    public void enterDeclaracion_fin(IkeaParser.Declaracion_finContext ctx) {
        // Marca explícitamente el final del montaje.
        println("FIN_MONTAJE");
    }

    // -------------------------------------------------------------
    // PASOS
    // -------------------------------------------------------------

    @Override
    public void enterPaso(IkeaParser.PasoContext ctx) {
        /**
         * Cada paso del programa se numera y se añade a la lista de pasos
         * detectados para su recuento final.
         */
        int numPaso = Integer.parseInt(ctx.NUMERO().getText());
        listaPasos.add(numPaso);
        println("PASO " + numPaso);
        indent++;
    }

    @Override
    public void exitPaso(IkeaParser.PasoContext ctx) {
        indent--;
    }

    // -------------------------------------------------------------
    // INDICACIONES
    // -------------------------------------------------------------

    @Override
    public void enterComentario(IkeaParser.ComentarioContext ctx) {
        /**
         * Procesa indicaciones de advertencia como CUIDADO o ATENCION.
         * Conserva los símbolos '!' pero limpia los ':' para estandarizar
         * la salida final.
         */
        numIndicaciones++;

        String tipo = ctx.CUIDADO().getText().replace(":", "");
        String mensaje = ctx.ANUNCIO().getText();

        println("INDICACION [" + tipo + "]:");
        indent++;
        println(mensaje.trim());
        indent--;
    }

    // -------------------------------------------------------------
    // ACCIONES
    // -------------------------------------------------------------

    @Override
    public void enterAccion(IkeaParser.AccionContext ctx) {
        /**
         * Determina el tipo de acción a partir de los tokens presentes.
         * Este método abstrae múltiples operaciones (INSERTAR, UNIR, etc.)
         * bajo un encabezado común que facilita la generación del AST.
         */
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

    // -------------------------------------------------------------
    // HERRAJES
    // -------------------------------------------------------------

    @Override
    public void exitHerraje_lista(IkeaParser.Herraje_listaContext ctx) {
        /**
         * Procesa una lista de herrajes, sumando cantidades al mapa global
         * de herrajes. Esta sección permite identificar qué piezas de unión
         * se utilizan y cuántas se requieren en total.
         */
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
        // Devuelve el tipo del herraje o un genérico si no se identifica.
        if (ctx.TIPOHERRAJE() != null) return ctx.TIPOHERRAJE().getText();
        return "HERRAJE";
    }

    // -------------------------------------------------------------
    // HERRAMIENTAS
    // -------------------------------------------------------------

    @Override
    public void exitHerramienta(IkeaParser.HerramientaContext ctx) {
        /**
         * Registra el uso de herramientas y cuenta las unidades declaradas
         * cuando aparecen explícitas en el código fuente del montaje.
         */
        String tipoHerramienta = ctx.TIPOHERRAMIENTA().getText();
        tablaHerramientas.merge(tipoHerramienta, 1, Integer::sum);

        StringBuilder linea = new StringBuilder("HERRAMIENTA: ");
        linea.append(tipoHerramienta);
        if (ctx.NUMERO() != null) {
            linea.append(" (unidades declaradas: ").append(ctx.NUMERO().getText()).append(")");
        }
        println(linea.toString());
    }

    // -------------------------------------------------------------
    // PIEZA / MUEBLE
    // -------------------------------------------------------------

    @Override
    public void exitPieza(IkeaParser.PiezaContext ctx) {
        /**
         * Imprime la descripción de una pieza, evitando duplicados cuando
         * la pieza ya forma parte de un nodo POSICION o DISTANCIA.
         */
        ParseTree parent = ctx.getParent();
        if (parent instanceof IkeaParser.PosicionContext ||
                parent instanceof IkeaParser.DistanciaContext) {
            return;
        }

        String desc = describirPieza(ctx);
        if (desc.isEmpty()) {
            println("PIEZA");
        } else {
            println("PIEZA " + desc);
        }
    }

    private String describirPieza(IkeaParser.PiezaContext ctx) {
        /**
         * Interpreta casos como:
         *  - PIEZA ( NOMBRE [NUMERO]? )
         *  - PIEZA NOMBRE
         */
        if (ctx.getChildCount() == 1) return "";

        ParseTree second = ctx.getChild(1);
        String secondText = second.getText();

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

        return secondText;
    }

    @Override
    public void exitMueble_referencia(IkeaParser.Mueble_referenciaContext ctx) {
        /**
         * Procesa la referencia a un mueble, omitiéndola cuando ya está
         * gestionada por nodos POSICION o DISTANCIA.
         */
        ParseTree parent = ctx.getParent();
        if (parent instanceof IkeaParser.PosicionContext ||
                parent instanceof IkeaParser.DistanciaContext) {
            return;
        }

        println("MUEBLE " + describirMuebleReferencia(ctx));
    }

    private String describirMuebleReferencia(IkeaParser.Mueble_referenciaContext ctx) {
        /**
         * Construye un identificador de mueble con formato estandarizado. MUEBLE +:
         *  - "BILLY (1)"
         *  - "(1)"
         *  - "(sin id)" si no existe identificación.
         */
        if (ctx == null || ctx.id() == null) return "(sin id)";

        IkeaParser.IdContext idCtx = ctx.id();
        StringBuilder b = new StringBuilder();
        if (idCtx.NOMBRE() != null) {
            b.append(idCtx.NOMBRE().getText()).append(" ");
        }
        b.append("(").append(idCtx.NUMERO().getText()).append(")");
        return b.toString();
    }

    // -------------------------------------------------------------
    // DISTANCIA
    // -------------------------------------------------------------

    @Override
    public void exitDistancia(IkeaParser.DistanciaContext ctx) {

        /**
         * Gestiona las expresiones que indican distancias relativas
         * entre piezas o muebles, incluyendo unidades de medida y
         * posiciones de referencia.
         */
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

    // -------------------------------------------------------------
    // POSICION
    // -------------------------------------------------------------

    @Override
    public void exitPosicion(IkeaParser.PosicionContext ctx) {

        /**
         * Procesa distintas construcciones espaciales de la gramática:
         *   EN, JUNTO_A, SOBRE, BAJO...
         * y determina si la referencia se hace hacia muebles o piezas.
         */
        println("POSICION:");
        indent++;

        if (ctx.EN() != null) {

            println("EN " + ctx.getChild(1).getText());

            if (ctx.getChildCount() > 3 && "DE".equals(ctx.getChild(2).getText())) {
                if (ctx.pieza() != null) {
                    println("DE PIEZA " + describirPieza(ctx.pieza()));
                } else if (ctx.mueble_referencia() != null) {
                    println("DE MUEBLE " + describirMuebleReferencia(ctx.mueble_referencia()));
                }
            }
        }

        else if (ctx.JUNTO_A() != null) {
            if (ctx.pieza() != null) {
                println("JUNTO_A PIEZA " + describirPieza(ctx.pieza()));
            } else if (ctx.mueble_referencia() != null) {
                println("JUNTO_A MUEBLE " + describirMuebleReferencia(ctx.mueble_referencia()));
            }
        }

        else if (ctx.SOBRE() != null || ctx.BAJO() != null) {
            String prep = ctx.getChild(0).getText();
            if (ctx.pieza() != null) {
                println(prep + " PIEZA " + describirPieza(ctx.pieza()));
            } else if (ctx.mueble_referencia() != null) {
                println(prep + " MUEBLE " + describirMuebleReferencia(ctx.mueble_referencia()));
            }
        }

        indent--;
    }

    // -------------------------------------------------------------
    // RESUMEN
    // -------------------------------------------------------------

    public String buildResumenSimbolos() {
        /**
         * Genera el resumen final de la tabla de símbolos analizada,
         * proporcionando una visión cuantitativa de los elementos
         * procesados en el montaje.
         */
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
