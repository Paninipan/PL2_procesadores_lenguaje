// Generated from C:/Users/alvar/OneDrive/Documentos/uni/3.1Cuatri/Procesadores/Laboratorio/PL2/Ex1/Ejercicio1/Parser.g4 by ANTLR 4.13.2
package gen.Ejercicio1;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserJava}.
 */
public interface ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParserJava#archivo}.
	 * @param ctx the parse tree
	 */
	void enterArchivo(ParserJava.ArchivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserJava#archivo}.
	 * @param ctx the parse tree
	 */
	void exitArchivo(ParserJava.ArchivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserJava#fila}.
	 * @param ctx the parse tree
	 */
	void enterFila(ParserJava.FilaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserJava#fila}.
	 * @param ctx the parse tree
	 */
	void exitFila(ParserJava.FilaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserJava#campo}.
	 * @param ctx the parse tree
	 */
	void enterCampo(ParserJava.CampoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserJava#campo}.
	 * @param ctx the parse tree
	 */
	void exitCampo(ParserJava.CampoContext ctx);
}