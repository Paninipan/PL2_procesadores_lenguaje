package Java_Code_Of_How_ANTLR4_Works;

import java.util.ArrayList;
import java.util.List;

public class Parser {
    private final List<Token> tokens;
    private int pos = 0;

    public Parser(List<Token> tokens) {
        this.tokens = tokens;
    }

    private Token tokenActual() {
        if (pos >= tokens.size()) return null;
        return tokens.get(pos);
    }

    private Token siguiente() {
        if (pos >= tokens.size()) return null;
        return tokens.get(pos++);
    }

    public List<List<String>> parse() {
        List<List<String>> filas = new ArrayList<>();
        List<String> filaActual = new ArrayList<>();

        for (Token t : tokens) {
            String valor = t.getValor();

            // Ignorar separadores
            if (valor.equals(",") || valor.equals(";") ||valor.equals("|")){
            }
            else if (valor.equals("\\n")) {
                // fin de línea → guardar fila actual
                filas.add(filaActual);
                filaActual = new ArrayList<>();
            } else {
                // agregar campo a la fila actual
                filaActual.add(valor);
            }
        }

        if (!filaActual.isEmpty()) {
            filas.add(filaActual);
        }

        return filas;
    }

}

