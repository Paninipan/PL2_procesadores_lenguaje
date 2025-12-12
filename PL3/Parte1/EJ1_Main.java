import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 * CSV_JSON_Main
 *
 * Programa principal (parte básica del Ejercicio 1):
 * - Lee un fichero CSV.
 * - Lo analiza con ANTLR usando CSV_JSON_Lexer y CSV_JSON_Parser.
 * - Recorre el parse tree con CSV_ToJSONVisitor.
 * - Genera un JSON con la primera fila como cabecera.
 * - Escribe el JSON en un fichero de salida.
 *
 * Uso:
 *   java CSV_JSON_Main entrada.csv salida.json
 */
public class EJ1_Main {

    public static void main(String[] args) throws IOException {

        // 1. Comprobación de argumentos

        String inputPath, outputPath;

        /*
        if (args.length != 2) {
            System.err.println("Uso: java CSV_JSON_Main <input.csv> <output.json>");
            System.exit(1);
        }

        inputPath = args[0];
        outputPath = args[1];
        */

        //Ejemplos comentados que pueden usarse en ejecución desde IDE
        inputPath = "PL3/Parte1/archivo.csv";
        outputPath = "PL3/Parte1/json.txt";


        // 2. Leer fichero de entrada como CharStream
        CharStream input = CharStreams.fromFileName(inputPath);

        // 3. Crear lexer para tokenizar la entrada

        EJ1Lexer lexer = new EJ1Lexer(input);

        // 4. Canal de tokens intermedio
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // 5. Crear parser a partir del flujo de tokens
        EJ1Parser parser = new EJ1Parser(tokens);

        // (Opcional pero recomendable): mostrar errores de parseo
        parser.removeErrorListeners();
        parser.addErrorListener(new DiagnosticErrorListener());

        // 6. Obtener el árbol de análisis a partir de la regla inicial `archivo`
        //   OJO: guardamos el tipo concreto ArchivoContext
        EJ1Parser.ArchivoContext tree = parser.archivo();

        // 7. Crear y aplicar el visitor que convierte el árbol a JSON
        JsonVisitor visitor = new JsonVisitor();

        // Llamamos explícitamente a visitArchivo para evitar historias raras
        visitor.visitArchivo(tree);

        // 8. Recuperar el JSON generado
        String json = visitor.getJSON();

        // 9. Guardar el JSON en el fichero de salida
        try (PrintWriter out = new PrintWriter(outputPath, StandardCharsets.UTF_8)) {
            out.print(json);
        }

        System.out.println("JSON generado en: " + outputPath);
    }
}
