import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * IkeaASTPrinter
 *
 * Listener basado en IkeaParserBaseListener que construye:
 *  1) Una representación textual del árbol sintáctico (AST) con indentación,
 *     pensada para ser fácilmente legible en un fichero de texto.
 *  2) Una "tabla de símbolos" simplificada para la secuencia de montaje, que
 *     acumula:
 *        - Números de paso (orden de los pasos).
 *        - Lista de herrajes utilizados, con la suma total de cantidades.
 *        - Lista de herramientas que aparecen, junto con el número de usos.
 *
 * Este listener es el núcleo del "analizador" solicitado: al visitar el árbol,
 * va recogiendo información semántica mínima sin dejar de mostrar el AST.
 */
public class IkeaASTPrinter extends IkeaParserBaseListener {

    // Acumulador del texto del AST "bonito".
    private final StringBuilder sb = new StringBuilder();
    // Nivel de indentación actual (cada nivel = 2 espacios).
    private int indent = 0;

    // --- Estructuras de datos para la "tabla de símbolos" ---

    // Lista de números de paso detectados (en orden de aparición).
    private final List<Integer> listaPasos = new ArrayList<>();

    // Herrajes -> cantidad total global.
    // Se usa LinkedHashMap para preservar el orden de primera aparición.
    private final Map<String, Integer> tablaHerrajes = new LinkedHashMap<>();

    // Herramientas -> número de veces que se mencionan en la secuencia.
    private final Map<String, Integer> tablaHerramientas = new LinkedHashMap<>();

    /**
     * Añade una línea al AST respetando la indentación actual.
     *
     * @param text texto a imprimir en la línea (sin salto final)
     */
    private void println(String text) {
        for (int i = 0; i < indent; i++) {
            sb.append("  ");  // 2 espacios por nivel
        }
        sb.append(text).append('\n');
    }

    /**
     * Devuelve el AST textual completo construido durante el recorrido.
     *
     * @return representación del AST con indentación.
     */
    public String getResult() {
        return sb.toString();
    }

    // =========================================================
    //  REGLA INICIAL: programa
    // =========================================================

    @Override
    public void enterPrograma(IkeaParser.ProgramaContext ctx) {
        println("PROGRAMA_MONTAJE");
        indent++;
    }

    @Override
    public void exitPrograma(IkeaParser.ProgramaContext ctx) {
        indent--;
    }

    // =========================================================
    //  DECLARACIÓN DE INICIO Y FIN
    // =========================================================

    @Override
    public void enterDeclaracion_inicio(IkeaParser.Declaracion_inicioContext ctx) {
        // Ejemplo de posibles formas:
        //  INICIO_MONTAJE BILLY 1.
        //  INICIO_MONTAJE MODULO COMO EXTENSION_DE MUEBLE (BILLY 1).
        StringBuilder header = new StringBuilder("INICIO_MONTAJE");

        if (ctx.NOMBRE() != null) {
            header.append(" ").append(ctx.NOMBRE().getText());
        }
        if (ctx.NUMERO() != null) {
            header.append(" ").append(ctx.NUMERO().getText());
        }
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

    // =========================================================
    //  PASOS DE MONTAJE
    // =========================================================

    @Override
    public void enterPaso(IkeaParser.PasoContext ctx) {
        // Forma: NUMERO GUION accion ( ; accion )* .
        int numPaso = Integer.parseInt(ctx.NUMERO().getText());
        listaPasos.add(numPaso);  // <<--- almacenamos número de paso

        println("PASO " + numPaso);
        indent++;
    }

    @Override
    public void exitPaso(IkeaParser.PasoContext ctx) {
        indent--;
    }

    // =========================================================
    //  COMENTARIOS CUIDADO / ATENCIÓN
    // =========================================================

    @Override
    public void enterComentario(IkeaParser.ComentarioContext ctx) {
        // comentario: CUIDADO ANUNCIO;
        String tipo = ctx.CUIDADO().getText();
        String texto = ctx.ANUNCIO().getText();
        println("COMENTARIO " + tipo + ": " + texto);
    }

    // =========================================================
    //  ACCIONES DE MONTAJE
    // =========================================================

    @Override
    public void enterAccion(IkeaParser.AccionContext ctx) {
        // Identificamos qué verbo de acción se ha usado para etiquetar el nodo.
        String encabezado = "ACCION ";

        if (ctx.INSERTAR() != null) encabezado += "INSERTAR";
        else if (ctx.UNIR() != null) encabezado += "UNIR";
        else if (ctx.COLOCAR() != null) encabezado += "COLOCAR";
        else if (ctx.GIRAR() != null) encabezado += "GIRAR";
        else if (ctx.CONECTAR() != null) encabezado += "CONECTAR";
        else if (ctx.MARCAR() != null) encabezado += "MARCAR";
        else if (ctx.NIVELAR() != null) encabezado += "NIVELAR";
        else if (ctx.FIJAR() != null) encabezado += "FIJAR";
        else encabezado += "(desconocida)";

        println(encabezado);
        indent++;
    }

    @Override
    public void exitAccion(IkeaParser.AccionContext ctx) {
        indent--;
    }

    // =========================================================
    //  HERRAJES: recogida de cantidades
    // =========================================================

    @Override
    public void exitHerraje_lista(IkeaParser.Herraje_listaContext ctx) {
        // herraje_lista: NUMERO id_herraje (Y NUMERO id_herraje)* ;
        //
        // Por ejemplo: 4 HERRAJE TORNILLO Y 2 HERRAJE TACO
        // Queremos acumular:
        //   TORNILLO -> 4
        //   TACO     -> 2

        List<TerminalNode> cantidades = ctx.NUMERO();
        List<IkeaParser.Id_herrajeContext> ids = ctx.id_herraje();

        for (int i = 0; i < ids.size(); i++) {
            int cantidad = Integer.parseInt(cantidades.get(i).getText());
            String tipoHerraje = describirIdHerraje(ids.get(i));

            // Actualizamos la cantidad total en la tabla de herrajes
            tablaHerrajes.merge(tipoHerraje, cantidad, Integer::sum);
        }

        // Opcional: mostrar en el AST la lista de herrajes de este paso
        StringBuilder linea = new StringBuilder("HERRAJES_EN_ESTA_ACCION: ");
        for (int i = 0; i < ids.size(); i++) {
            if (i > 0) linea.append(" ; ");
            linea.append(cantidades.get(i).getText())
                    .append(" x ")
                    .append(describirIdHerraje(ids.get(i)));
        }
        println(linea.toString());
    }

    /**
     * Construye una representación legible del identificador de herraje.
     * Regla: id_herraje: HERRAJE TIPOHERRAJE;
     *
     * @param ctx contexto de id_herraje
     * @return texto tipo "TORNILLO", "TACO_PARED_10291", etc.
     */
    private String describirIdHerraje(IkeaParser.Id_herrajeContext ctx) {
        // Normalmente querremos el TIPOHERRAJE, que es lo que distingue tornillos, tacos, etc.
        if (ctx.TIPOHERRAJE() != null) {
            return ctx.TIPOHERRAJE().getText();
        }
        // Como reserva, devolvemos la palabra genérica HERRAJE si algo falla.
        return "HERRAJE";
    }

    // =========================================================
    //  HERRAMIENTAS: recogida de usos
    // =========================================================

    @Override
    public void exitHerramienta(IkeaParser.HerramientaContext ctx) {
        // herramienta: HERRAMIENTA TIPOHERRAMIENTA (PAREN_ABRE NUMERO PAREN_CIERRA)? ;
        //
        // Por ejemplo: HERRAMIENTA DESTORNILLADOR (1)
        String tipoHerramienta = ctx.TIPOHERRAMIENTA().getText();

        // Sumamos 1 uso cada vez que aparece la herramienta en el árbol.
        tablaHerramientas.merge(tipoHerramienta, 1, Integer::sum);

        // Opcional: mostrar la herramienta como nodo en el AST
        StringBuilder linea = new StringBuilder("HERRAMIENTA: ");
        linea.append(tipoHerramienta);
        if (ctx.NUMERO() != null) {
            linea.append(" (unidades declaradas: ").append(ctx.NUMERO().getText()).append(")");
        }
        println(linea.toString());
    }

    // =========================================================
    //  DESCRIPCCIÓN DE MUEBLE/PIEZA (para cabeceras legibles)
    // =========================================================

    /**
     * Genera una descripción compacta de un mueble_referencia.
     * Regla: mueble_referencia: MUEBLE id? ;
     *
     * @param ctx contexto mueble_referencia
     * @return texto tipo "MUEBLE (BILLY 1)" o simplemente "MUEBLE"
     */
    private String describirMuebleReferencia(IkeaParser.Mueble_referenciaContext ctx) {
        if (ctx == null) return "";
        StringBuilder b = new StringBuilder("MUEBLE");
        if (ctx.id() != null) {
            IkeaParser.IdContext idCtx = ctx.id();
            // id: NOMBRE? PAREN_ABRE NUMERO PAREN_CIERRA ;
            b.append(" ");
            if (idCtx.NOMBRE() != null) {
                b.append(idCtx.NOMBRE().getText()).append(" ");
            }
            b.append("(").append(idCtx.NUMERO().getText()).append(")");
        }
        return b.toString();
    }

    // =========================================================
    //  RESUMEN / "TABLA DE SÍMBOLOS"
    // =========================================================

    /**
     * Construye un resumen textual con la información acumulada:
     *  - Pasos detectados.
     *  - Lista de herrajes y cantidades totales.
     *  - Lista de herramientas y número de usos.
     *
     * Este método está pensado para escribir directamente por pantalla
     * el resultado del "analizador" sobre la secuencia de montaje.
     *
     * @return resumen formateado en varias líneas
     */
    public String buildResumenSimbolos() {
        StringBuilder r = new StringBuilder();

        // 1) Pasos del montaje
        r.append("PASOS DETECTADOS: ").append(listaPasos.size()).append("\n");
        r.append("  Números de paso: ").append(listaPasos).append("\n\n");

        // 2) Herrajes
        r.append("LISTA DE HERRAJES (TOTAL ACUMULADO):\n");
        if (tablaHerrajes.isEmpty()) {
            r.append("  (No se han detectado herrajes en el programa)\n");
        } else {
            for (Map.Entry<String, Integer> e : tablaHerrajes.entrySet()) {
                r.append("  - ").append(e.getKey())
                        .append(" : ").append(e.getValue())
                        .append(" unidades\n");
            }
        }
        r.append("\n");

        // 3) Herramientas
        r.append("LISTA DE HERRAMIENTAS A UTILIZAR:\n");
        if (tablaHerramientas.isEmpty()) {
            r.append("  (No se han detectado herramientas en el programa)\n");
        } else {
            for (Map.Entry<String, Integer> e : tablaHerramientas.entrySet()) {
                r.append("  - ").append(e.getKey())
                        .append(" (usos en el texto: ").append(e.getValue())
                        .append(")\n");
            }
        }

        return r.toString();
    }
}
