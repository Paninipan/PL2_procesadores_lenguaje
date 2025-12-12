import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EJ3_Main {

    // Envuelve el cuerpo generado por CompileVisitor en una clase Jasmin
    // Ahora recibe el nombre de la clase (sin extensión) para usarlo como nombre público
    private static String createJasminFile(String body, String className) {
        return ""
                + ".class public " + className + "\n"
                + ".super java/lang/Object\n\n"
                + ".method public static main([Ljava/lang/String;)V\n"
                + "   .limit stack 100\n"
                + "   .limit locals 100\n\n"
                + body
                + "   return\n"
                + "\n"
                + ".end method\n";
    }

    public static void main(String[] args) throws Exception {
        // Si se pasa un argumento, lo usamos como fichero; si no, usamos la ruta por defecto.
        String defaultPath = "PL3/Parte3/Archivos_txt/programas_error_individuales/Error11_DivisionPorCero.txt";
        String nombreFichero;
        if (args.length >= 1 && args[0] != null && !args[0].isEmpty()) {
            nombreFichero = args[0];
        } else {
            nombreFichero = defaultPath;
        }

        System.out.println("Leyendo fichero: " + nombreFichero);

        // 1) Leemos el código fuente
        CharStream input = CharStreams.fromFileName(nombreFichero);

        // 2) Creamos lexer y parser
        EJ3Lexer lexer = new EJ3Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EJ3Parser parser = new EJ3Parser(tokens);

        // 3) Añadimos nuestro error listener para léxico + sintaxis
        EJ3MiErrorListener errListener = new EJ3MiErrorListener();
        lexer.removeErrorListeners();
        parser.removeErrorListeners();
        lexer.addErrorListener(errListener);
        parser.addErrorListener(errListener);

        // 4) Parseamos a partir de la regla inicial 'programa'
        ParseTree tree = parser.programa();

        // Si hubo errores léxicos o sintácticos, paramos aquí
        if (errListener.hasErrors()) {
            System.err.println(">> Se han detectado errores léxicos/sintácticos. No se genera Jasmin.");
            return;
        }

        // 5) Visitamos el árbol para generar Jasmin
        CompileVisitor visitor = new CompileVisitor();
        String body = visitor.visit(tree);

        // 6) Comprobamos errores semánticos acumulados en la tabla de símbolos
        if (visitor.getTabla().tieneErrores()) {
            System.err.println(">> Se han detectado errores semánticos:");
            System.err.print(visitor.getTabla().getErrores());
            System.err.println("No se genera Jasmin.");
            return;
        }

        // 7) Extraemos el nombre base del fichero de entrada para usarlo como nombre de clase
        String inputFileName = Paths.get(nombreFichero).getFileName().toString();
        String baseName = inputFileName;
        if (baseName.toLowerCase().endsWith(".txt")) {
            baseName = baseName.substring(0, baseName.length() - 4);
        }

        // 8) Creamos el fichero Jasmin completo usando baseName como nombre de clase
        String jasmin = createJasminFile(body, baseName);

        // 9) Guardamos el .j en el directorio Exj_jasmine
        java.nio.file.Path outputPath = Paths.get("PL3/Parte3/Exj_jasmine/", baseName + ".j");
        // Asegurarnos de que el directorio existe
        if (outputPath.getParent() != null) {
            Files.createDirectories(outputPath.getParent());
        }

        Files.write(outputPath, jasmin.getBytes(StandardCharsets.UTF_8));
        System.out.println("Generado " + outputPath.toString() + ". Ahora puedes ensamblarlo con Jasmin.");
    }
}