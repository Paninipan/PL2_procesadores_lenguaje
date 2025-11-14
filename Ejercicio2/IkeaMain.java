import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

/**
 * IkeaMain
 *
 * Punto de entrada para el procesador de instrucciones de montaje IKEA.
 * Esta clase orquesta el uso de ANTLR para:
 *  - Leer un fichero de texto con pasos de montaje.
 *  - Construir el árbol de análisis sintáctico (ParseTree) usando IkeaLexer/IkeaParser.
 *  - Recorrer el árbol con IkeaASTPrinter para obtener:
 *      * Una representación textual "bonita" del AST.
 *      * Un pequeño resumen tipo "tabla de símbolos" con:
 *          - Lista de pasos,
 *          - Lista de herrajes con sus cantidades totales,
 *          - Lista de herramientas y número de usos.
 *  - Guardar el AST en un fichero de salida.
 *  - Mostrar por pantalla el resumen de herrajes/herramientas.
 */
public class IkeaMain {

    /**
     * Método main: punto de entrada de la aplicación.
     *
     * Flujo de trabajo:
     *  1) Valida que se reciban exactamente dos argumentos:
     *        args[0] = ruta del fichero de entrada con la secuencia de montaje.
     *        args[1] = ruta del fichero de salida donde se escribirá el AST legible.
     *  2) Crea un CharStream desde el fichero de entrada.
     *  3) Construye IkeaLexer e IkeaParser a partir del stream de caracteres.
     *  4) Sustituye los listeners de error por defecto por IkeaErrorListener
     *     para tener un control uniforme de los mensajes de error.
     *  5) Invoca la regla inicial `programa` del parser y obtiene el ParseTree.
     *  6) Utiliza un ParseTreeWalker y un listener IkeaASTPrinter para:
     *        - Construir la representación textual del AST.
     *        - Acumular información semántica simple (tabla de símbolos).
     *  7) Escribe el AST legible al fichero de salida (UTF-8).
     *  8) Muestra por consola el resumen de pasos, herrajes y herramientas.
     *
     * Uso esperado:
     *   java IkeaMain <entrada.txt> <salida_ast.txt>
     *
     * @param args argumentos de línea de comandos
     * @throws IOException en caso de error de lectura/escritura de ficheros
     */
    public static void main(String[] args) throws IOException {

        // 1) Validación básica de argumentos
        if (args.length != 2) {
            System.err.println("Uso: java IkeaMain <entrada.txt> <salida_ast.txt>");
            System.exit(1);
        }
        String inPath = args[0];
        String outPath = args[1];

        // 2) Crear CharStream desde el fichero de entrada
        CharStream input = CharStreams.fromFileName(inPath);

        // 3) Crear lexer y token stream
        IkeaLexer lexer = new IkeaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // 4) Crear parser
        IkeaParser parser = new IkeaParser(tokens);

        // 6) Invocar la regla inicial `programa` y obtener el árbol
        ParseTree tree = parser.programa();

        // 7) Recorrer el árbol con el listener IkeaASTPrinter
        IkeaASTPrinter printer = new IkeaASTPrinter();
        ParseTreeWalker.DEFAULT.walk((ParseTreeListener) printer, tree);

        // 8) Escribir el AST legible en el fichero de salida
        try (PrintWriter out = new PrintWriter(outPath, StandardCharsets.UTF_8)) {
            out.print(printer.getResult());
        }

        System.out.println("AST legible escrito en: " + outPath);

        // 9) Mostrar por consola la "tabla de símbolos" del montaje:
        //    pasos detectados, herrajes y herramientas.
        System.out.println();
        System.out.println("===== RESUMEN DEL MONTAJE (TABLA DE SÍMBOLOS SIMPLIFICADA) =====");
        System.out.println(printer.buildResumenSimbolos());
    }
}
