import java.util.ArrayList;
import java.util.List;

/**
 * CSV_ToJSONVisitor
 *
 * Visitor que recorre el parse tree y construye un JSON con este criterio:
 * - La primera fila visitada se toma como cabecera (nombres de columnas).
 * - El resto de filas se convierten en objetos JSON usando esa cabecera.
 *
 * Gramática asumida:
 *   archivo : filas EOF;
 *   filas   : fila (SALTO_DE_LINEA fila)* (SALTO_DE_LINEA)?;
 *   fila    : campo? (SEPARADOR campo?)*;
 *   campo   : TEXTO | STRING;
 */
public class CSV_ToJSONVisitor extends CSV_JSON_ParserBaseVisitor<Void> {

    // Lista de nombres de columnas (cabecera)
    private final List<String> headers = new ArrayList<>();
    // Lista de filas de datos (cada fila es una lista de valores)
    private final List<List<String>> rows = new ArrayList<>();

    // ---------- Helpers de limpieza / escape ----------

    /**
     * Elimina comillas externas y desescapa comillas dobles internas.
     * - Si raw es null -> "".
     * - Si empieza y acaba con " -> quita comillas y reemplaza "" por ".
     */
    private String cleanCsvString(String raw) {
        if (raw == null) return "";
        if (raw.length() >= 2 &&
                raw.charAt(0) == '"' &&
                raw.charAt(raw.length() - 1) == '"') {

            String inner = raw.substring(1, raw.length() - 1);
            return inner.replace("\"\"", "\"");
        }
        return raw;
    }

    /**
     * Escapa caracteres especiales para JSON dentro de una cadena:
     * - "  -> \"
     * - \  -> \\
     * - \n -> \\n
     * - \r -> \\r
     * - \t -> \\t
     */
    private String escapeJson(String s) {
        if (s == null) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '"'  -> sb.append("\\\"");
                case '\\' -> sb.append("\\\\");
                case '\n' -> sb.append("\\n");
                case '\r' -> sb.append("\\r");
                case '\t' -> sb.append("\\t");
                default   -> sb.append(c);
            }
        }
        return sb.toString();
    }

    /**
     * Extrae todos los campos de una fila (regla `fila`) como lista de strings.
     * - ctx.campo() devuelve una lista (posiblemente vacía) de CampoContext.
     * - Cada CampoContext puede ser TEXTO o STRING.
     */
    private List<String> extractRow(CSV_JSON_Parser.FilaContext ctx) {
        List<String> values = new ArrayList<>();

        // ctx.campo() NUNCA es null: es una lista, aunque esté vacía
        for (CSV_JSON_Parser.CampoContext campoCtx : ctx.campo()) {
            String value;
            if (campoCtx.TEXTO() != null) {
                value = campoCtx.TEXTO().getText();
            } else if (campoCtx.STRING() != null) {
                value = cleanCsvString(campoCtx.STRING().getText());
            } else {
                // Caso raro: campo sin TEXTO ni STRING
                value = "";
            }
            values.add(value);
        }

        return values;
    }

    // ---------- PUNTO DE ENTRADA DEL VISITOR ----------

    /**
     * visitArchivo:
     * - Se llama desde main con visitor.visitArchivo(tree).
     * - Recorre todas las filas en orden.
     */
    @Override
    public Void visitArchivo(CSV_JSON_Parser.ArchivoContext ctx) {
        CSV_JSON_Parser.FilasContext filasCtx = ctx.filas();

        if (filasCtx == null) {
            System.err.println("No se han encontrado filas en el archivo.");
            return null;
        }

        // Recorremos todas las `fila` explícitamente
        List<CSV_JSON_Parser.FilaContext> listaFilas = filasCtx.fila();
        System.out.println("DEBUG: número de filas parseadas = " + listaFilas.size());

        for (CSV_JSON_Parser.FilaContext filaCtx : listaFilas) {
            visitFila(filaCtx);
        }

        System.out.println("DEBUG: número de headers = " + headers.size());
        System.out.println("DEBUG: número de filas de datos = " + rows.size());

        return null;
    }

    // ---------- Visita de cada fila ----------

    /**
     * visitFila:
     * - La primera fila visitada se guarda como cabecera (headers).
     * - El resto se añaden a `rows` como filas de datos.
     */
    @Override
    public Void visitFila(CSV_JSON_Parser.FilaContext ctx) {
        List<String> values = extractRow(ctx);

        // Si la fila está completamente vacía (por ejemplo, línea en blanco), la saltamos
        boolean allEmpty = values.stream().allMatch(String::isEmpty);
        if (allEmpty) {
            return null;
        }

        if (headers.isEmpty()) {
            // Primera fila -> cabecera
            headers.addAll(values);
            System.out.println("DEBUG: cabecera = " + headers);
        } else {
            // Resto de filas -> datos
            rows.add(values);
            System.out.println("DEBUG: fila añadida = " + values);
        }

        return null;
    }

    // ---------- Generación final del JSON ----------

    /**
     * Construye el JSON a partir de headers y rows.
     * Ejemplo de salida:
     * [
     *   { "nombre": "Juan", "apellido": "Pérez", ... },
     *   { "nombre": "María", "apellido": "García", ... }
     * ]
     */
    public String getJSON() {
        StringBuilder sb = new StringBuilder();
        sb.append("[\n");

        for (int i = 0; i < rows.size(); i++) {
            List<String> row = rows.get(i);
            sb.append("  {\n");

            for (int j = 0; j < headers.size(); j++) {
                String header = headers.get(j);
                String headerEscaped = escapeJson(header);

                String value = "";
                if (j < row.size()) {
                    value = row.get(j);
                }
                String valueEscaped = escapeJson(value);

                sb.append("    \"")
                        .append(headerEscaped)
                        .append("\": \"")
                        .append(valueEscaped)
                        .append("\"");

                if (j < headers.size() - 1) {
                    sb.append(",");
                }
                sb.append("\n");
            }

            sb.append("  }");
            if (i < rows.size() - 1) {
                sb.append(",");
            }
            sb.append("\n");
        }

        sb.append("]\n");
        return sb.toString();
    }
}
