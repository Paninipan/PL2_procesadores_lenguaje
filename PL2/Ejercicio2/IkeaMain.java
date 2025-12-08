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
 * Encadena:
 *   - Lectura del fichero de entrada.
 *   - Análisis léxico/sintáctico con ANTLR (IkeaLexer/IkeaParser).
 *   - Recorrido del árbol con IkeaASTPrinter para:
 *        * construir un AST legible (árbol "bonito"),
 *        * recopilar una tabla de símbolos simple (pasos, herrajes y herramientas).
 *   - Escritura de toda la información en consola y en un fichero de salida.
 */
public class IkeaMain {

    /**
     * Método principal de la aplicación.
     *
     * Uso esperado:
     *   java IkeaMain <entrada.txt> <salida_ast.txt>
     *
     * @param args args[0] = ruta del fichero de entrada con la secuencia de montaje
     *             args[1] = ruta del fichero de salida donde se escribirá el AST + resumen
     * @throws IOException si hay problemas de lectura/escritura de ficheros
     */
    public static void main(String[] args) throws IOException {

        /*
        // 1) Validación de argumentos: necesitamos exactamente entrada + salida
        if (args.length != 2) {
            System.err.println("Uso: java IkeaMain <entrada.txt> <salida_ast.txt>");
            System.exit(1);
        }
        String inPath = args[0];
        String outPath = args[1];
        */

        String inPath = "PL2/Ejercicio2/Muebeles_txt/baggebo.txt";
        String outPath = "PL2/Ejercicio2/ast.txt";

        // 2) Crear CharStream desde el fichero de entrada (texto con los pasos de montaje)
        CharStream input = CharStreams.fromFileName(inPath);

        // 3) Crear lexer y token stream
        IkeaLexer lexer = new IkeaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // 4) Crear parser
        IkeaParser parser = new IkeaParser(tokens);

        // 5) Parseo: invocamos la regla inicial `programa` y obtenemos el ParseTree
        ParseTree tree = parser.programa();

        // 6) Recorrido del árbol con IkeaASTPrinter
        IkeaASTPrinter printer = new IkeaASTPrinter();
        ParseTreeWalker.DEFAULT.walk((ParseTreeListener) printer, tree);

        // 7) Construir AST legible y resumen de símbolos a partir del listener
        String astLegible = printer.getResult();
        String resumen = printer.buildResumenSimbolos();

        // 8) Unificar salida: primero el AST, luego el resumen
        StringBuilder salida = new StringBuilder();
        salida.append(astLegible).append("\n");
        salida.append(" RESUMEN DEL MONTAJE (TABLA DE SÍMBOLOS SIMPLIFICADA) \n");
        salida.append(resumen);

        String salidaCompleta = salida.toString();

        //9) Mostrar dónde se guarda
        System.out.println("\nAST + resumen escrito en: " + outPath);

        // 11) Guardar EXACTAMENTE lo mismo en el fichero de salida (UTF-8)
        try (PrintWriter out = new PrintWriter(outPath, StandardCharsets.UTF_8)) {
            out.print(salidaCompleta);
        }
    }
}

