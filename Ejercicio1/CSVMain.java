package Ejercicio1;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class CSVMain {

    public static void main(String[] args) throws IOException {

        if (args.length != 2) {
            System.err.println("Uso: java CSVMain <input.csv> <output.txt>");
            System.exit(1);
        }

        String inputPath = args[0];
        String outputPath = args[1];

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
        ParseTreeWalker.DEFAULT.walk(printer, tree);

        String astText = printer.getResult();

        // 7. Guardar en fichero
        try (PrintWriter out = new PrintWriter(outputPath, StandardCharsets.UTF_8)) {
            out.print(astText);
        }

        System.out.println("AST generado en: " + outputPath);
    }
}
