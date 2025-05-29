// Generated from C:/Users/durai/Downloads/Telegram Desktop/compilerV4/compilerV4/GrammarParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(GrammarParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(GrammarParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ifBody}.
	 * @param ctx the parse tree
	 */
	void enterIfBody(GrammarParser.IfBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ifBody}.
	 * @param ctx the parse tree
	 */
	void exitIfBody(GrammarParser.IfBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(GrammarParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(GrammarParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(GrammarParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(GrammarParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(GrammarParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(GrammarParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(GrammarParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(GrammarParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(GrammarParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(GrammarParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(GrammarParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(GrammarParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#variableAssign}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssign(GrammarParser.VariableAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#variableAssign}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssign(GrammarParser.VariableAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(GrammarParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(GrammarParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#defaultImport}.
	 * @param ctx the parse tree
	 */
	void enterDefaultImport(GrammarParser.DefaultImportContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#defaultImport}.
	 * @param ctx the parse tree
	 */
	void exitDefaultImport(GrammarParser.DefaultImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#namedImports}.
	 * @param ctx the parse tree
	 */
	void enterNamedImports(GrammarParser.NamedImportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#namedImports}.
	 * @param ctx the parse tree
	 */
	void exitNamedImports(GrammarParser.NamedImportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#importSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterImportSpecifier(GrammarParser.ImportSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#importSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitImportSpecifier(GrammarParser.ImportSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportStatement(GrammarParser.ExportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportStatement(GrammarParser.ExportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(GrammarParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(GrammarParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(GrammarParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(GrammarParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#classBodyStatement}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyStatement(GrammarParser.ClassBodyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#classBodyStatement}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyStatement(GrammarParser.ClassBodyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#componentStatement}.
	 * @param ctx the parse tree
	 */
	void enterComponentStatement(GrammarParser.ComponentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#componentStatement}.
	 * @param ctx the parse tree
	 */
	void exitComponentStatement(GrammarParser.ComponentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#typeDefine}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefine(GrammarParser.TypeDefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#typeDefine}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefine(GrammarParser.TypeDefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#asType}.
	 * @param ctx the parse tree
	 */
	void enterAsType(GrammarParser.AsTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#asType}.
	 * @param ctx the parse tree
	 */
	void exitAsType(GrammarParser.AsTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(GrammarParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(GrammarParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryValue(GrammarParser.PrimaryValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryValue(GrammarParser.PrimaryValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOp(GrammarParser.BinaryOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOp(GrammarParser.BinaryOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#operatorExpression}.
	 * @param ctx the parse tree
	 */
	void enterOperatorExpression(GrammarParser.OperatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#operatorExpression}.
	 * @param ctx the parse tree
	 */
	void exitOperatorExpression(GrammarParser.OperatorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#increase_variable}.
	 * @param ctx the parse tree
	 */
	void enterIncrease_variable(GrammarParser.Increase_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#increase_variable}.
	 * @param ctx the parse tree
	 */
	void exitIncrease_variable(GrammarParser.Increase_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#decrease_variable}.
	 * @param ctx the parse tree
	 */
	void enterDecrease_variable(GrammarParser.Decrease_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#decrease_variable}.
	 * @param ctx the parse tree
	 */
	void exitDecrease_variable(GrammarParser.Decrease_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(GrammarParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(GrammarParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(GrammarParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(GrammarParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(GrammarParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(GrammarParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(GrammarParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(GrammarParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(GrammarParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(GrammarParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(GrammarParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(GrammarParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#open_tag}.
	 * @param ctx the parse tree
	 */
	void enterOpen_tag(GrammarParser.Open_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#open_tag}.
	 * @param ctx the parse tree
	 */
	void exitOpen_tag(GrammarParser.Open_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#close_tag}.
	 * @param ctx the parse tree
	 */
	void enterClose_tag(GrammarParser.Close_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#close_tag}.
	 * @param ctx the parse tree
	 */
	void exitClose_tag(GrammarParser.Close_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#single_tag}.
	 * @param ctx the parse tree
	 */
	void enterSingle_tag(GrammarParser.Single_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#single_tag}.
	 * @param ctx the parse tree
	 */
	void exitSingle_tag(GrammarParser.Single_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#html}.
	 * @param ctx the parse tree
	 */
	void enterHtml(GrammarParser.HtmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#html}.
	 * @param ctx the parse tree
	 */
	void exitHtml(GrammarParser.HtmlContext ctx);
}