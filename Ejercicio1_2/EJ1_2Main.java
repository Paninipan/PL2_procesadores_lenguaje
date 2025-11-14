
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

/**
 * EJ1_2Main
 * Punto de entrada para el ejercicio 1_2. Esta clase orquesta el procesamiento
 * de un fichero de entrada mediante ANTLR
 */
public class EJ1_2Main {
    /**
     * Punto de entrada de la aplicación que procesa un fichero mediante ANTLR,
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
     * 6. Sustituye los listeners por defecto de ANTLR por un listener propio para capturar y formatear errores léxicos/sintácticos.
     * 7. Recorre el árbol con un listener (CSVASTPrinter) para generar la representación
     *    del AST.
     * 8. Escribe el texto resultante en el fichero de salida usando UTF-8 y muestra por
     *    consola la ruta del fichero generado.
     *
     * Uso esperado:
     *   java EJ1_2Main <input.txt> <output.txt>
     *
     * @param args array de argumentos de línea de comandos; debe contener exactamente:
     *             args[0] = ruta del fichero txt de entrada,
     *             args[1] = ruta del fichero de salida donde se almacenará el AST.
     * @throws IOException si ocurre algún error de E/S al leer el fichero de entrada
     *                     o al escribir el fichero de salida.
     *
     * Comentario adicional:
     * - El método finaliza con System.exit(1) si no se proporcionan dos argumentos,
     *   para evitar continuar con un estado inválido.
     * - La implementación delega la lógica de recorrido y construcción del AST en
     *   EJ1_2ASTPrinter; aquí solo se orquesta la canalización de ANTLR
     *   (CharStream -> Lexer -> TokenStream -> Parser -> ParseTree -> Listener).
     */
    public static void main(String[] args) throws IOException {

        // Validación de argumentos: exigimos exactamente entrada + salida
        if (args.length != 2) {
            System.err.println("Uso: java EJ1_2Main <entrada.txt> <salida.txt>");
            System.exit(1);
        }
        String inPath = args[0];
        String outPath = args[1];

        // Ejemplos comentados que pueden usarse en ejecución desde IDE
        // String inPath = "Ejercicio1_2/programa_IF_Bool.csv";
        // String outPath = "Ejercicio1_2/ast.txt";

        // 1) Crear CharStream desde fichero. Lanza IOException si no existe/permiso.
        CharStream input = CharStreams.fromFileName(inPath);

        // 2) Crear lexer y token stream
        EJ1_2Lexer lexer = new EJ1_2Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // 3) Crear parser
        EJ1_2Parser parser = new EJ1_2Parser(tokens);
        // 4) Manejo de errores: por defecto ANTLR imprime errores en stderr.
        //    Aquí reemplazamos los listeners por defecto por uno propio para
        //    capturar errores léxicos y sintácticos y tratarlos de forma controlada.
        lexer.removeErrorListeners();
        parser.removeErrorListeners();

        // Listener personalizado que implementa la interfaz de ANTLR para errores.
        // - Añadirlo tanto al lexer como al parser permite distinguir y formatear
        //   mensajes léxicos vs sintácticos.
        EJ1_2MiErrorListener err = new EJ1_2MiErrorListener();
        lexer.addErrorListener(err);   // para errores léxicos
        parser.addErrorListener(err);  // para errores sintácticos

        // 5) Parse: invocamos la regla inicial `programa` y obtenemos el ParseTree.
        ParseTree tree = parser.programa(); // regla inicial

        // 6) Recorrido del árbol con un listener que construye una representación
        //    legible (AST). El walker por defecto de ANTLR aplicará el listener
        //    en cada nodo del árbol.
        EJ1_2ASTPrinter printer = new EJ1_2ASTPrinter();
        ParseTreeWalker.DEFAULT.walk(printer, tree);

        // 7) Escribir el resultado en el fichero de salida usando UTF-8.
        try (PrintWriter out = new PrintWriter(outPath, StandardCharsets.UTF_8)) {
            out.print(printer.getResult());
        }

        System.out.println("AST legible escrito en: " + outPath);
    }
}
