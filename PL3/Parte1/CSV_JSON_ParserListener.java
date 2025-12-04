// Generated from CSV_JSON_Parser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CSV_JSON_Parser}.
 */
public interface CSV_JSON_ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CSV_JSON_Parser#archivo}.
	 * @param ctx the parse tree
	 */
	void enterArchivo(CSV_JSON_Parser.ArchivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSV_JSON_Parser#archivo}.
	 * @param ctx the parse tree
	 */
	void exitArchivo(CSV_JSON_Parser.ArchivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSV_JSON_Parser#filas}.
	 * @param ctx the parse tree
	 */
	void enterFilas(CSV_JSON_Parser.FilasContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSV_JSON_Parser#filas}.
	 * @param ctx the parse tree
	 */
	void exitFilas(CSV_JSON_Parser.FilasContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSV_JSON_Parser#fila}.
	 * @param ctx the parse tree
	 */
	void enterFila(CSV_JSON_Parser.FilaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSV_JSON_Parser#fila}.
	 * @param ctx the parse tree
	 */
	void exitFila(CSV_JSON_Parser.FilaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSV_JSON_Parser#campo}.
	 * @param ctx the parse tree
	 */
	void enterCampo(CSV_JSON_Parser.CampoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSV_JSON_Parser#campo}.
	 * @param ctx the parse tree
	 */
	void exitCampo(CSV_JSON_Parser.CampoContext ctx);
}