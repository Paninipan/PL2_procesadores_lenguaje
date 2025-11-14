package Ejercicio1;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class CSVMain {

    /**
     * Punto de entrada de la aplicación que procesa un fichero CSV mediante ANTLR,
     * construye un AST (árbol sintáctico) y guarda una representación textual del AST
     * en un fichero de salida.
     *
     * El método realiza las siguientes operaciones:
     * 1. Valida que se hayan pasado exactamente dos argumentos (ruta de entrada y de salida).
     * 2. Lee el fichero de entrada como un CharStream.
     * 3. Crea un lexer (CSVLexer) para tokenizar la entrada.
     * 4. Envuelve los tokens en un CommonTokenStream.
     * 5. Construye un parser (CSVParser) y obtiene el árbol de análisis (ParseTree)
     *    usando la regla inicial 'archivo'.
     * 6. Recorre el árbol con un listener (CSVASTPrinter) para generar la representación
     *    del AST.
     * 7. Escribe el texto resultante en el fichero de salida usando UTF-8 y muestra por
     *    consola la ruta del fichero generado.
     *
     * Uso esperado:
     *   java CSVMain <input.csv> <output.txt>
     *
     * @param args array de argumentos de línea de comandos; debe contener exactamente:
     *             args[0] = ruta del fichero CSV de entrada,
     *             args[1] = ruta del fichero de salida donde se almacenará el AST.
     * @throws IOException si ocurre algún error de E/S al leer el fichero de entrada
     *                     o al escribir el fichero de salida.
     *
     * Comentario adicional:
     * - El método finaliza con System.exit(1) si no se proporcionan dos argumentos,
     *   para evitar continuar con un estado inválido.
     * - La implementación delega la lógica de recorrido y construcción del AST en
     *   CSVASTPrinter; aquí solo se orquesta la canalización de ANTLR
     *   (CharStream -> Lexer -> TokenStream -> Parser -> ParseTree -> Listener).
     */
    public static void main(String[] args) throws IOException {

        if (args.length != 2) {
            System.err.println("Uso: java CSVMain <input.csv> <output.txt>");
            System.exit(1);
        }

        String inputPath = args[0];
        String outputPath = args[1];

        // Ejemplos comentados que pueden usarse en ejecución desde IDE
        //String inputPath = "Ejercicio1/archivo.csv";
        //String outputPath = "Ejercicio1/ast.txt";

        // 1. Leer fichero
        CharStream input = CharStreams.fromFileName(inputPath);

        // 2. Lexer
        CSVLexer lexer = new CSVLexer(input);

        // 3. Tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // 4. Parser
        CSVParser parser = new CSVParser(tokens);

        // 5. Regla inicial
        ParseTree tree = parser.archivo();

        // 6. Listener + Walker para construir AST
        CSVASTPrinter printer = new CSVASTPrinter();
        // usamos el walker por defecto que proporciona ANTLR para recorrer el árbol
        ParseTreeWalker.DEFAULT.walk(printer, tree);

        String astText = printer.getResult();

        // 7. Guardar en fichero
        try (PrintWriter out = new PrintWriter(outputPath, StandardCharsets.UTF_8)) {
            out.print(astText);
        }

        System.out.println("AST generado en: " + outputPath);
    }
}
