package Ejercicio2.Ejercicio2;
/*
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;
import java.io.PrintWriter;

public class IkeaMain {

    public static void main(String[] args) throws IOException {
        // 1. Comprobar argumentos
        if (args.length != 2) {
            System.err.println("Uso: java Ejercicio2.Ejercicio2.IkeaMain <fichero_entrada> <fichero_salida>");
            System.exit(1);
        }

        String ficheroEntrada = args[0];
        String ficheroSalida  = args[1];

        //Crear el CharStream desde el fichero de entrada
        CharStream input = CharStreams.fromFileName(ficheroEntrada);

        //Crear lexer y parser
        IkeaLexer lexer = new IkeaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        IkeaParser parser = new IkeaParser(tokens);

        //Parsear desde la regla inicial
        ParseTree tree = parser.programa();

        //AST bonito
        IkeaASTPrinter astPrinter = new IkeaASTPrinter();
        ParseTreeWalker.DEFAULT.walk(astPrinter, tree);
        String prettyAST = astPrinter.getResult();

        //Análisis (herrajes, herramientas, piezas)
        IkeaAnalyzerListener analyzer = new IkeaAnalyzerListener();
        ParseTreeWalker.DEFAULT.walk(analyzer, tree);

        //Escribir resultados en el fichero de salida
        try (PrintWriter out = new PrintWriter(ficheroSalida)) {
            out.println("AST del programa");
            out.println(prettyAST);

            out.println();
            out.println("Resumen del montaje");
            out.println();

            out.println("Pasos leídos:");
            analyzer.getPasos().stream()
                    .sorted()
                    .forEach(p -> out.println("  - Paso " + p));
            out.println();

            out.println("Herrajes utilizados (ID -> cantidad total):");
            if (analyzer.getHerrajes().isEmpty()) {
                out.println("  (ninguno)");
            } else {
                analyzer.getHerrajes().forEach((id, cant) ->
                        out.println("  - " + id + " : " + cant)
                );
            }
            out.println();

            out.println("Herramientas utilizadas:");
            if (analyzer.getHerramientas().isEmpty()) {
                out.println("  (ninguna)");
            } else {
                for (String h : analyzer.getHerramientas()) {
                    out.println("  - " + h);
                }
            }
            out.println();

            out.println("Piezas mencionadas:");
            if (analyzer.getPiezas().isEmpty()) {
                out.println("  (ninguna)");
            } else {
                for (String p : analyzer.getPiezas()) {
                    out.println("  - " + p);
                }
            }
        }

        System.out.println("Análisis completado. Resultados en: " + ficheroSalida);
    }
}
*/