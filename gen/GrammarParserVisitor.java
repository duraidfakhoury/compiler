// Generated from C:/Users/durai/Downloads/Telegram Desktop/compilerV4/compilerV4/GrammarParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(GrammarParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#ifBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBody(GrammarParser.IfBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(GrammarParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(GrammarParser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(GrammarParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(GrammarParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(GrammarParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(GrammarParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#variableAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssign(GrammarParser.VariableAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(GrammarParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#defaultImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultImport(GrammarParser.DefaultImportContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#namedImports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedImports(GrammarParser.NamedImportsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#importSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportSpecifier(GrammarParser.ImportSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#exportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportStatement(GrammarParser.ExportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(GrammarParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(GrammarParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#classBodyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyStatement(GrammarParser.ClassBodyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#componentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentStatement(GrammarParser.ComponentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#typeDefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefine(GrammarParser.TypeDefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#asType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsType(GrammarParser.AsTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(GrammarParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryValue(GrammarParser.PrimaryValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#binaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOp(GrammarParser.BinaryOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#operatorExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorExpression(GrammarParser.OperatorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#increase_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrease_variable(GrammarParser.Increase_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#decrease_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrease_variable(GrammarParser.Decrease_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(GrammarParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(GrammarParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(GrammarParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(GrammarParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(GrammarParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(GrammarParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#open_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_tag(GrammarParser.Open_tagContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#close_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_tag(GrammarParser.Close_tagContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#single_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_tag(GrammarParser.Single_tagContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#html}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml(GrammarParser.HtmlContext ctx);
}