package Java_Code_Of_How_ANTLR4_Works;

import java.util.List;

public class arbolAST {
    public static String print_arbol(List<List<String>> filas) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < filas.size(); i++) {
            List<String> fila = filas.get(i);
            sb.append(" |-Fila ").append(i + 1).append("\n");

            for (String celda : fila) {
                sb.append(" |   |-Celda(\"").append(celda).append("\")\n");
            }
        }

        return sb.toString();
    }
}
