package Ejercicio1_2;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class EJ2Main {
    public static void main(String[] args) throws IOException {
        /* Si se ejecuta por linea de comandos quitar comentario

        if (args.length != 2) {
            System.err.println("Uso: java EJ2Main <entrada.epp> <salida.txt>");
            System.exit(1);
        }
        String inPath = args[0];
        String outPath = args[1];
        */
        String inPath = "Ejercicio1_2/programa_IF_Bool.csv";
        String outPath = "Ejercicio1_2/ast.txt";

        CharStream input = CharStreams.fromFileName(inPath);
        EJ2Lexer lexer = new EJ2Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EJ2Parser parser = new EJ2Parser(tokens);


        // Quitar los listeners por defecto
        lexer.removeErrorListeners();
        parser.removeErrorListeners();

        // Añadir el mio
        EJ2MiErrorListener err = new EJ2MiErrorListener();
        lexer.addErrorListener(err);   // para errores léxicos
        parser.addErrorListener(err);  // para errores sintácticos


        ParseTree tree = parser.programa(); // regla inicial

        EJ2ASTPrinter printer = new EJ2ASTPrinter();
        ParseTreeWalker.DEFAULT.walk(printer, tree);

        try (PrintWriter out = new PrintWriter(outPath, StandardCharsets.UTF_8)) {
            out.print(printer.getResult());
        }
        System.out.println("AST legible escrito en: " + outPath);
    }
}
