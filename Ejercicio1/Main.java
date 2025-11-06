package Ejercicio1;

import gen.Ejercicio1.LexerJava;
import gen.Ejercicio1.ParserJava;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.*;

  /*
   Todo Asegurar que los archvios de gen.Ejercicio1
    aparecen todos en el package correcto
    las clases de ParserJava y LexerJava no se extienenden a si mismas
    deben extender a la clase Parser y Lexer
 */

public class Main {
    public static void main(String[] args) {
        try {
            /*Cargar el archivo CSV desde la carpeta correspondiente
             * y se formatea a una cadena de caracteres para que el lexer lo pueda
             * pasar to-do a tokens
             */
            Path ruta_archivo = Paths.get("Ejercicio1/archivo.csv");
            CharStream csv_formateado = CharStreams.fromPath(ruta_archivo);

            //Crear el lexer y se le pasa la cadena de caracteres
            LexerJava lexer = new LexerJava(csv_formateado);

            //cojemos los tokens generados por el lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            //Crear el parser con esos tokens
            ParserJava parser = new ParserJava(tokens);

            //llamamos a la funcion para parsear los tokens y crear el arbol
            ParseTree tree = parser.archivo();

            //funcion para imprimir el arbol AST generado por el parser
            //System.out.println("AST:");
            //imprimir_arbol(tree, parser, 1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
