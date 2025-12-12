// Generated from C:/Users/alvar/OneDrive/Documentos/uni/3.1Cuatri/Procesadores/Laboratorio/PL2/PL3/Parte1/EJ1Parser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EJ1Parser}.
 */
public interface EJ1ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EJ1Parser#archivo}.
	 * @param ctx the parse tree
	 */
	void enterArchivo(EJ1Parser.ArchivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ1Parser#archivo}.
	 * @param ctx the parse tree
	 */
	void exitArchivo(EJ1Parser.ArchivoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JsonArch}
	 * labeled alternative in {@link EJ1Parser#filas}.
	 * @param ctx the parse tree
	 */
	void enterJsonArch(EJ1Parser.JsonArchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JsonArch}
	 * labeled alternative in {@link EJ1Parser#filas}.
	 * @param ctx the parse tree
	 */
	void exitJsonArch(EJ1Parser.JsonArchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JsonLine}
	 * labeled alternative in {@link EJ1Parser#fila}.
	 * @param ctx the parse tree
	 */
	void enterJsonLine(EJ1Parser.JsonLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JsonLine}
	 * labeled alternative in {@link EJ1Parser#fila}.
	 * @param ctx the parse tree
	 */
	void exitJsonLine(EJ1Parser.JsonLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ1Parser#campo}.
	 * @param ctx the parse tree
	 */
	void enterCampo(EJ1Parser.CampoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ1Parser#campo}.
	 * @param ctx the parse tree
	 */
	void exitCampo(EJ1Parser.CampoContext ctx);
}