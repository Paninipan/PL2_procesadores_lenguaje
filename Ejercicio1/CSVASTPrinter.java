
import org.antlr.v4.runtime.tree.TerminalNode;

public class CSVASTPrinter extends CSVParserBaseListener {

    private final StringBuilder sb = new StringBuilder();
    private int indentLevel = 0;
    private int currentRow = 0;
    private int currentField = 0;

    private void println(String text) {
        for (int i = 0; i < indentLevel; i++) {
            sb.append("  "); // 2 espacios por nivel
        }
        sb.append(text).append("\n");
    }

    private String cleanString(String raw) {
        if (raw == null) return "";
        if (raw.length() >= 2 && raw.charAt(0) == '"' && raw.charAt(raw.length() - 1) == '"') {
            String inner = raw.substring(1, raw.length() - 1);
            return inner.replace("\"\"", "\"");
        }
        return raw;
    }

    public String getResult() {
        return sb.toString();
    }

    // ==== archivo ====

    @Override
    public void enterArchivo(CSVParser.ArchivoContext ctx) {
        println("CSV");
        indentLevel++;
    }

    @Override
    public void exitArchivo(CSVParser.ArchivoContext ctx) {
        indentLevel--;
    }

    // ==== fila ====

    @Override
    public void enterFila(CSVParser.FilaContext ctx) {
        currentRow++;
        currentField = 0;
        println("ROW " + currentRow);
        indentLevel++;
    }

    @Override
    public void exitFila(CSVParser.FilaContext ctx) {
        indentLevel--;
    }

    // ==== campo ====

    @Override
    public void enterCampo(CSVParser.CampoContext ctx) {
        currentField++;

        String value;
        if (ctx.TEXTO() != null) {
            value = ctx.TEXTO().getText();
        } else if (ctx.STRING() != null) {
            value = cleanString(ctx.STRING().getText());
        } else {
            value = ""; // campo vacío
        }

        println("FIELD " + currentField + ": " + value);
    }
}
