package Ejercicio1_2;

import org.antlr.v4.runtime.*;

public class EJ2MiErrorListener extends BaseErrorListener {

    //permite indicar con mayor precisión donde se ha dado el fallo
    /*
     Se indica el tipo de error, si ha sido en el lexer o el parser
     Y donde se a producido el error, linea y caracter involucrado.
    */
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

