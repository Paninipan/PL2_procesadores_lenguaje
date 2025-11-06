package Java_Code_Of_How_ANTLR4_Works;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Ruta y archivo CSV
        String rutaArchivo = "Java_Code_Of_How_ANTLR4_Works/archivo_csv.csv";
        String csv = "";

        //leemos el csv y lo convertimos para que el parser lo tokenize
        try ( BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            StringBuilder sb = new StringBuilder();
            String linea;

            // Leer todas las líneas
            while ((linea = br.readLine()) != null) {
                sb.append(linea).append("\n");
            }

            // Convertimos el contenido a String
            csv = sb.toString();

        } catch (IOException e) {
            System.err.println("Error con el archivo: " + e.getMessage());
        }

        //Creamos el lexer y tokenizamos el csv completo
        Lexer lexer = new Lexer(csv);
        List<Token> tokens = lexer.tokenize();

        System.out.println("Tokens: ");
        for (Token t : tokens) {
            System.out.println(t);
        }

        //Creamos el parser y procesamos todos los tokens generados
        Parser parser = new Parser(tokens);
        List<List<String>> filas = parser.parse();

        System.out.println("\nEstructura: ");
        for (List<String> fila : filas) {
            System.out.println(fila);
        }

        System.out.println("\nAST:\n" + arbolAST.print_arbol(filas));
    }
}
