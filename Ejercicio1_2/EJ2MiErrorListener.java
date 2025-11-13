package Ejercicio1_2;

import org.antlr.v4.runtime.*;

public class EJ2MiErrorListener extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e) {
        String where = "línea " + line + ":" + charPositionInLine;
        String tipo = (recognizer instanceof Lexer) ? "Léxico" : "Sintaxis";
        System.err.println("Tipo: "+ tipo+". " + where + " -> " + msg);
    }
}

