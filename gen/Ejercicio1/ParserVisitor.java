// Generated from C:/Users/alvar/OneDrive/Documentos/uni/3.1Cuatri/Procesadores/Laboratorio/PL2/Ex1/Ejercicio1/Parser.g4 by ANTLR 4.13.2
package gen.Ejercicio1;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserJava}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParserJava#archivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArchivo(ParserJava.ArchivoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserJava#fila}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFila(ParserJava.FilaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserJava#campo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCampo(ParserJava.CampoContext ctx);
}