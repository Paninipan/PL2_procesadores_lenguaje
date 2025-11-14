// Generated from C:/Users/alvar/OneDrive/Documentos/uni/3.1Cuatri/Procesadores/Laboratorio/PL2/Ex1/Ejercicio1/CSVParser.g4 by ANTLR 4.13.2
package Ejercicio1;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CSVParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CSVParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CSVParser#archivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArchivo(CSVParser.ArchivoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSVParser#fila}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFila(CSVParser.FilaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSVParser#campo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCampo(CSVParser.CampoContext ctx);
}