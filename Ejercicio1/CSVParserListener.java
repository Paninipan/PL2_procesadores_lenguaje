// Generated from C:/Users/alvar/OneDrive/Documentos/uni/3.1Cuatri/Procesadores/Laboratorio/PL2/Ex1/Ejercicio1/CSVParser.g4 by ANTLR 4.13.2
package Ejercicio1;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CSVParser}.
 */
public interface CSVParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CSVParser#archivo}.
	 * @param ctx the parse tree
	 */
	void enterArchivo(CSVParser.ArchivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSVParser#archivo}.
	 * @param ctx the parse tree
	 */
	void exitArchivo(CSVParser.ArchivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSVParser#fila}.
	 * @param ctx the parse tree
	 */
	void enterFila(CSVParser.FilaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSVParser#fila}.
	 * @param ctx the parse tree
	 */
	void exitFila(CSVParser.FilaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSVParser#campo}.
	 * @param ctx the parse tree
	 */
	void enterCampo(CSVParser.CampoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSVParser#campo}.
	 * @param ctx the parse tree
	 */
	void exitCampo(CSVParser.CampoContext ctx);
}