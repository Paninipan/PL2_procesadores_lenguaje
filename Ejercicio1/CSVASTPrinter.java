package Ejercicio1;
import gen.Ejercicio1.ParserBaseListener;
import gen.Ejercicio1.ParserJava;


public class CSVASTPrinter extends ParserBaseListener {

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
    public void enterArchivo(ParserJava.ArchivoContext ctx) {
        println("CSV");
        indentLevel++;
    }

    @Override
    public void exitArchivo(ParserJava.ArchivoContext ctx) {
        indentLevel--;
    }

    // ==== fila ====

    @Override
    public void enterFila(ParserJava.FilaContext ctx) {
        currentRow++;
        currentField = 0;
        println("ROW " + currentRow);
        indentLevel++;
    }

    @Override
    public void exitFila(ParserJava.FilaContext ctx) {
        indentLevel--;
    }

    // ==== campo ====

    @Override
    public void enterCampo(ParserJava.CampoContext ctx) {
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