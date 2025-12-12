import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.ArrayList;
import java.util.List;

/**
 * JsonVisitor
 *
 * Visitor que recorre el árbol de análisis sintáctico (Parse Tree) de un
 * archivo CSV y genera una representación JSON.
 * Utiliza la primera fila como cabecera (claves del JSON).
 */
public class JsonVisitor extends EJ1ParserBaseVisitor<Void> {

    // Lista para almacenar los nombres de las columnas (cabecera del CSV)
    private List<String> header = new ArrayList<>();
    // StringBuilder para construir el JSON
    private StringBuilder jsonBuilder = new StringBuilder();
    // Contador para saber si estamos procesando la primera fila (cabecera)
    private int rowCount = 0;

    /**
     * Devuelve el string JSON generado.
     * @return El JSON completo en formato String.
     */
    public String getJSON() {
        return jsonBuilder.toString();
    }

    /**
     * Visita la regla inicial 'archivo'.
     * @param ctx El contexto del archivo.
     * @return null (Void).
     */
    @Override
    public Void visitArchivo(EJ1Parser.ArchivoContext ctx) {
        // [
        jsonBuilder.append("[\n");
        // Visitar el contexto de las filas (JsonArch)
        visitChildren(ctx);
        // Eliminar la coma y el salto de línea sobrantes después del último objeto
        if (jsonBuilder.length() > 2) {
            jsonBuilder.setLength(jsonBuilder.length() - 2);
        }
        // ]
        jsonBuilder.append("\n]");
        return null;
    }

    /**
     * Visita la regla 'filas' (etiqueta #JsonArch).
     * Simplemente visita todas las filas.
     */
    @Override
    public Void visitJsonArch(EJ1Parser.JsonArchContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * Visita la regla 'fila' (etiqueta #JsonLine).
     * Procesa la fila actual.
     * Si es la primera, guarda los campos como cabecera.
     * Si no, crea un objeto JSON usando la cabecera como claves.
     */
    @Override
    public Void visitJsonLine(EJ1Parser.JsonLineContext ctx) {
        // Lista temporal para almacenar los valores (campos) de la fila actual
        List<String> currentFields = new ArrayList<>();

        // Recorrer todos los contextos 'campo' de la fila
        for (EJ1Parser.CampoContext campoCtx : ctx.campo()) {
            // El campo es un TerminalNode (TEXTO o STRING) o está vacío
            String fieldValue = "";

            if (campoCtx != null) {
                // Obtener el valor del campo
                if (campoCtx.TEXTO() != null) {
                    // Es un TEXTO (sin comillas)
                    fieldValue = campoCtx.getText();
                } else if (campoCtx.STRING() != null) {
                    // Es un STRING (con comillas)
                    // Quitamos las comillas exteriores y reemplazamos "" por "
                    String quotedString = campoCtx.STRING().getText();
                    fieldValue = quotedString.substring(1, quotedString.length() - 1).replace("\"\"", "\"");
                }
            }
            currentFields.add(fieldValue);
        }

        // --- Lógica de procesamiento de la fila ---
        if (rowCount == 0) {
            // Primera fila: Guardar como cabecera (nombres de las columnas)
            header.addAll(currentFields);
        } else {
            // Filas subsiguientes: Generar objeto JSON
            // Añadir coma y salto de línea para separar del objeto anterior (si no es el primero)
            if (rowCount > 1) {
                jsonBuilder.append(",\n");
            }
            // Iniciar objeto JSON: {
            jsonBuilder.append("  {\n");

            // cojemos los campos minimos por si la fila tiene mas información de la necesaria
            int numFields = Math.min(header.size(), currentFields.size());

            //Para cada elemento, lo añadimos en el json con su cabecera
            for (int i = 0; i < numFields; i++) {
                String key = header.get(i);
                String value = currentFields.get(i);

                //Cabecera : Valor ambos enter comillas
                jsonBuilder.append("    \"").append(key).append("\": \"").append(value).append("\"");

                //Si no es el último elemento añadidos la coma
                if (i < numFields - 1) {
                    jsonBuilder.append(",");
                }
                jsonBuilder.append("\n");
            }
            // Cerrar objeto JSON: }
            jsonBuilder.append("  }");
        }
        rowCount++;
        return null;
    }
}