/**
 * CSVASTPrinter
 *
 * Listener (basado en la clase generada por ANTLR) que construye una
 * representación textual 'bonita' del árbol sintáctico (AST) para un
 * fichero CSV. 
 * 
 * Cómo funciona:
 * - ANTLR invoca los métodos enter/exit correspondientes mientras
 *   recorre el parse tree.
 * - Este listener mantiene un StringBuilder donde va acumulando líneas
 *   con indentación que reflejan la jerarquía del AST.
 */
public class JSON_ASTPrinter extends CSVParserBaseListener {

    // Acumulador del texto que formará el AST 'bonito'
    private final StringBuilder sb = new StringBuilder();
    // Nivel de indentación actual (cada nivel añade 2 espacios)
    private int indentLevel = 0;
    // Contadores usados para numerar filas y campos en la salida
    private int currentRow = 0;
    private int currentField = 0;

    /**
     * Imprime una línea en el StringBuilder respetando la indentación.
     * Cada nivel de indentación añade dos espacios.
     *
     * @param text Texto a añadir (sin salto de línea final)
     */
    private void println(String text) {
        for (int i = 0; i < indentLevel; i++) {
            sb.append("  "); // 2 espacios por nivel
        }
        sb.append(text).append("\n");
    }

    /**
     * Limpia una cadena con formato CSV con comillas ("...").
     * - Si la cadena está entre comillas, se quitan las comillas externas
     *   y se desescapan las comillas dobles internas ("" -> ").
     * - Si la entrada es null devuelve cadena vacía.
     *
     * Ejemplo: ""hola"" -> "hola"
     *
     * @param raw Texto tal cual devuelve el token STRING del parser
     * @return Texto normalizado y sin comillas externas
     */
    private String cleanString(String raw) {
        if (raw == null) return "";
        if (raw.length() >= 2 && raw.charAt(0) == '"' && raw.charAt(raw.length() - 1) == '"') {
            String inner = raw.substring(1, raw.length() - 1);
            // En CSV las comillas dentro de un campo se representan como ""
            return inner.replace("\"\"", "\"");
        }
        return raw;
    }

    /**
     * Recupera el resultado construido por el listener.
     * @return Texto con la representación jerárquica del AST
     */
    public String getResult() {
        return sb.toString();
    }

    // ---- Callbacks para 'archivo' ----

    /**
     * Se llama al entrar en la regla raíz `archivo`.
     * El listener arranca la impresión del AST con la etiqueta "CSV"
     * y aumenta la indentación para los nodos hijos (filas).
     */
    @Override
    public void enterArchivo(CSVParser.ArchivoContext ctx) {
        println("CSV");
        indentLevel++;
    }

    /**
     * Se llama al salir de la regla `archivo`.
     * Reduce el nivel de indentación al volver al contexto superior.
     */
    @Override
    public void exitArchivo(CSVParser.ArchivoContext ctx) {
        indentLevel--;
    }

    // ---- Callbacks para 'fila' (row) ----

    /**
     * Al entrar en una fila aumentamos el contador de filas, reseteamos el
     * contador de campos y añadimos una línea "ROW n" con la indentación
     * adecuada. También subimos un nivel de indentación para los campos.
     */
    @Override
    public void enterFila(CSVParser.FilaContext ctx) {
        currentRow++;
        currentField = 0;
        println("ROW " + currentRow);
        indentLevel++;
    }

    /**
     * Al salir de la fila descendemos el nivel de indentación.
     */
    @Override
    public void exitFila(CSVParser.FilaContext ctx) {
        indentLevel--;
    }

    // ---- Callbacks para 'campo' (field) ----

    /**
     * Este método se ejecuta al entrar en cada campo de la fila. Determina
     * si el campo es un token TEXTO (sin comillas), un token STRING (entre
     * comillas) o si está vacío. Normaliza el contenido y lo imprime con
     * su índice: "FIELD k: valor".
     *
     * Supuestos:
     * - La gramática define tokens `TEXTO` y `STRING` para los dos casos.
     * - Si no hay ninguno de los dos, se considera campo vacío.
     */
    @Override
    public void enterCampo(CSVParser.CampoContext ctx) {
        currentField++;

        String value;
        if (ctx.TEXTO() != null) {
            // Campo sin comillas: tomamos el texto tal cual
            value = ctx.TEXTO().getText();
        } else if (ctx.STRING() != null) {
            // Campo entre comillas: limpiamos las comillas externas
            // y desescapamos comillas dobles internas
            value = cleanString(ctx.STRING().getText());
        } else {
            // Campo vacío (p. ej. ,, en CSV)
            value = "";
        }

        println("FIELD " + currentField + ": " + value);
    }
}
