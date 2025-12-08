import org.antlr.v4.runtime.*;

/**
 * EJ1_2MiErrorListener
 *
 * Listener personalizado para capturar y formatear errores producidos por ANTLR
 * tanto en la fase léxica (lexer) como en la fase sintáctica (parser).
 *
 * Se usa reemplazando los error listeners por defecto del lexer/parser:
 *   lexer.removeErrorListeners();
 *   parser.removeErrorListeners();
 *   lexer.addErrorListener(new EJ1_2MiErrorListener());
 *   parser.addErrorListener(new EJ1_2MiErrorListener());
 *
 */
public class EJ1_2MiErrorListener extends BaseErrorListener {

    /**
     * Callback que ANTLR invoca cuando detecta un error.
     * - Detecta si el recognizer es un Lexer para distinguir errores léxicos de
     *   errores de sintaxis (parser).
     * - Formatea y escribe el mensaje en `System.err` con el formato:
     *     "Tipo: <Léxico|Sintaxis>. línea L:C -> <msg>"
     *
     * @param recognizer          el componente que detectó el error (Lexer o Parser)
     * @param offendingSymbol     el símbolo/token que causó el error (puede ser null)
     * @param line                número de línea (1-based) donde ocurrió el error
     * @param charPositionInLine  posición del carácter dentro de la línea (0-based)
     * @param msg                 mensaje descriptivo del error generado por ANTLR
     * @param e                   excepción de reconocimiento asociada (puede ser null)
     *
     * Notas:
     * - Actualmente los errores se imprimen directamente; para pruebas automatizadas
     *   puede ser preferible acumularlos en una lista o lanzar una excepción.
     */
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e) {
        // Construye una etiqueta de ubicación legible (línea:columna)
        String where = "línea " + line + ":" + charPositionInLine;

        // Determina el tipo de error dependiendo de si el recognizer es un Lexer
        // (errores léxicos) o un Parser (errores de sintaxis)
        String tipo = (recognizer instanceof Lexer) ? "Léxico" : "Sintaxis";

        // Imprime el mensaje formateado en el error estándar.
        System.err.println("Tipo: " + tipo + ". " + where + " -> " + msg);
    }
}

