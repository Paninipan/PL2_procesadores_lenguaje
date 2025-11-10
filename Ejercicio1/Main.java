package Ejercicio1;

import gen.Ejercicio1.LexerJava;
import gen.Ejercicio1.ParserJava;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        /* Quitar si se usa la consola de comandos
        *if (args.length != 2) {
        *    System.err.println("Uso: java CSVMain <input.csv> <output.txt>");
        *    System.exit(1);
        }*/

        String inputPath = "Ejercicio1/archivo.csv";
        String outputPath = "Ejercicio1/ast.txt";

        // 1. Leer fichero
        CharStream input = CharStreams.fromFileName(inputPath);

        // 2. Lexer
        LexerJava lexer = new LexerJava(input);

        // 3. Tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // 4. Parser
        ParserJava parser = new ParserJava(tokens);

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