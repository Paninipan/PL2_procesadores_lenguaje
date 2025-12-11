
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

/**
 * Parte3 Main Punto de entrada para el ejercicio de la parte 3. - Genera el AST
 * legible en un fichero de salida (solo si no hay errores léx./sint.). -
 * Ejecuta el programa E++ con EvalVisitor (solo si no hay errores léx./sint.).
 * - Guarda la salida de 'mostrar' en un fichero aparte.
 */
public class EJ3_Main {

    public static void main(String[] args) throws IOException {

        /*
        // 1) Validación de argumentos
        if (args.length != 2) {
            System.err.println("Uso: java EJ1_2Main <entrada.txt> <salida_ast.txt>");
            System.exit(1);
        }
        String inPath = args[0];
        String outPath = args[1];
         */
        //Ejemplos comentados que pueden usarse en ejecución desde IDE
        String inPath = "PL3/Parte3/Code_Ejm/programa_IF_Bool.txt";
        String outPath = "PL3/Parte3/ast.txt";

        // 2) Crear CharStream desde fichero
        CharStream input = CharStreams.fromFileName(inPath);

        // 3) Crear lexer y token stream
        EJ3Lexer lexer = new EJ3Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // 4) Crear parser
        EJ3Parser parser = new EJ3Parser(tokens);

        // 5) Listener de errores léxicos y sintácticos
        lexer.removeErrorListeners();
        parser.removeErrorListeners();
        EJ3MiErrorListener err = new EJ3MiErrorListener();
        lexer.addErrorListener(err);
        parser.addErrorListener(err);

        // 6) Parse: regla inicial `programa`
        EJ3Parser.ProgramaContext tree = parser.programa();

        // 7) Si hay errores léxicos/sintácticos, NO generamos AST ni ejecutamos
        if (err.hasErrors()) {
            // Opcional: escribir algo mínimo en el fichero de AST
            try (PrintWriter out = new PrintWriter(outPath, StandardCharsets.UTF_8)) {
                out.println("AST no generado debido a errores léxicos/sintácticos.");
            }
            System.err.println("Se han detectado errores léxicos/sintácticos. No se ejecuta el programa.");
            System.exit(1);
        }

        // 8) Generar AST legible
        EJ3ASTPrinter printer = new EJ3ASTPrinter();
        ParseTreeWalker.DEFAULT.walk((ParseTreeListener) printer, (ParseTree) tree);

        try (PrintWriter out = new PrintWriter(outPath, StandardCharsets.UTF_8)) {
            out.print(printer.getResult());
        }
        System.out.println("AST legible escrito en: " + outPath);

        // 9) Ejecutar programa con EvalVisitor (semántica)
        try {
            EvalVisitor evaluator = new EvalVisitor();
            evaluator.visit(tree);  // ejecuta el programa
            System.out.println("Ejecución terminada sin errores semánticos.");

            // 10) Guardar la salida de 'mostrar' en un fichero aparte
            String execOutput = evaluator.getOutput();

            // Derivar nombre del fichero de salida: <salida_ast>_salida.txt
            String semOutPath;
            int dot = outPath.lastIndexOf('.');
            if (dot != -1) {
                semOutPath = outPath.substring(0, dot) + "_salida" + outPath.substring(dot);
            } else {
                semOutPath = outPath + "_salida.txt";
            }

            try (PrintWriter outSem = new PrintWriter(semOutPath, StandardCharsets.UTF_8)) {
                outSem.print(execOutput);
            }
            System.out.println("Salida de ejecución escrita en: " + semOutPath);

        } catch (SemanticException se) {
            System.err.println("ERROR SEMÁNTICO: " + se.getMessage());
            System.exit(1);
        } catch (BreakException | ContinueException ce) {
            System.err.println("ERROR DE CONTROL DE BUCLE: 'romper' o 'continuar' fuera de un bucle.");
            System.exit(1);
        }

        EJ3CodeGenVisitor codegen = new EJ3CodeGenVisitor();
        String body = codegen.visit(tree);

        String jasmin = createJasminFile(body); // la función que envuelve con .class/.method

    }
}
