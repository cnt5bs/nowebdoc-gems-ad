// Generated from NowebDocGemsAd.g4 by ANTLR 4.6
package nowebDocGems.gram;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NowebDocGemsAdParser}.
 */
public interface NowebDocGemsAdListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NowebDocGemsAdParser#spec}.
	 * @param ctx the parse tree
	 */
	void enterSpec(NowebDocGemsAdParser.SpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link NowebDocGemsAdParser#spec}.
	 * @param ctx the parse tree
	 */
	void exitSpec(NowebDocGemsAdParser.SpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link NowebDocGemsAdParser#frag}.
	 * @param ctx the parse tree
	 */
	void enterFrag(NowebDocGemsAdParser.FragContext ctx);
	/**
	 * Exit a parse tree produced by {@link NowebDocGemsAdParser#frag}.
	 * @param ctx the parse tree
	 */
	void exitFrag(NowebDocGemsAdParser.FragContext ctx);
	/**
	 * Enter a parse tree produced by {@link NowebDocGemsAdParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(NowebDocGemsAdParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NowebDocGemsAdParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(NowebDocGemsAdParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NowebDocGemsAdParser#macro}.
	 * @param ctx the parse tree
	 */
	void enterMacro(NowebDocGemsAdParser.MacroContext ctx);
	/**
	 * Exit a parse tree produced by {@link NowebDocGemsAdParser#macro}.
	 * @param ctx the parse tree
	 */
	void exitMacro(NowebDocGemsAdParser.MacroContext ctx);
	/**
	 * Enter a parse tree produced by {@link NowebDocGemsAdParser#rawcode}.
	 * @param ctx the parse tree
	 */
	void enterRawcode(NowebDocGemsAdParser.RawcodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NowebDocGemsAdParser#rawcode}.
	 * @param ctx the parse tree
	 */
	void exitRawcode(NowebDocGemsAdParser.RawcodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NowebDocGemsAdParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(NowebDocGemsAdParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link NowebDocGemsAdParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(NowebDocGemsAdParser.TextContext ctx);
}