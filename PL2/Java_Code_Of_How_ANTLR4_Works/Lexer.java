package Java_Code_Of_How_ANTLR4_Works;

import java.util.ArrayList;
import java.util.List;

public class Lexer {
    private final String input;
    private int pos = 0;
    private final int length;

    public Lexer(String input) {
        this.input = input;
        this.length = input.length();
    }

    private char mirar_caracter_actual() {
        if (pos >= length) return '\0';
        return input.charAt(pos);
    }

    private char siguiente_caracter() {
        if (pos >= length) return '\0';
        return input.charAt(pos++);
    }
    //Tokeniza completo el CSV
    public List<Token> tokenize() {
        List<Token> tokens = new ArrayList<>();
        StringBuilder campo = new StringBuilder();

        while (mirar_caracter_actual() != '\0') {
            char c = mirar_caracter_actual(); // 👈 solo miramos el caracter, no avanzamos aún

            if (c == ',' || c == ';' || c == '|') {
                if (!campo.isEmpty()) {
                    tokens.add(new Token(campo.toString()));
                    campo.setLength(0);
                }
                tokens.add(new Token(String.valueOf(c)));
                siguiente_caracter();
            }
            else if (c == '\n') {
                if (!campo.isEmpty()) {
                    tokens.add(new Token(campo.toString()));
                    campo.setLength(0);
                }
                tokens.add(new Token("\\n"));
                siguiente_caracter();
            }
            else {
                campo.append(c);
                siguiente_caracter();
            }

        }

        if (!campo.isEmpty()) {
            tokens.add(new Token(campo.toString()));
        }

        return tokens;
    }

}

