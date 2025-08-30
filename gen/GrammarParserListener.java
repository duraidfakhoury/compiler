// Generated from D:/Projects/compiler/GrammarParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code programRule}
	 * labeled alternative in {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgramRule(GrammarParser.ProgramRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code programRule}
	 * labeled alternative in {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgramRule(GrammarParser.ProgramRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtFunctionDecl}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtFunctionDecl(GrammarParser.StmtFunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtFunctionDecl}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtFunctionDecl(GrammarParser.StmtFunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtFunctionCall}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtFunctionCall(GrammarParser.StmtFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtFunctionCall}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtFunctionCall(GrammarParser.StmtFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtVarDecl}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtVarDecl(GrammarParser.StmtVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtVarDecl}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtVarDecl(GrammarParser.StmtVarDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtVarAssign}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtVarAssign(GrammarParser.StmtVarAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtVarAssign}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtVarAssign(GrammarParser.StmtVarAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtValue}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtValue(GrammarParser.StmtValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtValue}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtValue(GrammarParser.StmtValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtHtml}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtHtml(GrammarParser.StmtHtmlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtHtml}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtHtml(GrammarParser.StmtHtmlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtReturn}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtReturn(GrammarParser.StmtReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtReturn}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtReturn(GrammarParser.StmtReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtIf}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtIf(GrammarParser.StmtIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtIf}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtIf(GrammarParser.StmtIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtImport}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtImport(GrammarParser.StmtImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtImport}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtImport(GrammarParser.StmtImportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtIteration}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtIteration(GrammarParser.StmtIterationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtIteration}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtIteration(GrammarParser.StmtIterationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtComponent}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtComponent(GrammarParser.StmtComponentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtComponent}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtComponent(GrammarParser.StmtComponentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtClass}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtClass(GrammarParser.StmtClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtClass}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtClass(GrammarParser.StmtClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtExport}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtExport(GrammarParser.StmtExportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtExport}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtExport(GrammarParser.StmtExportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtTypeDecl}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtTypeDecl(GrammarParser.StmtTypeDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtTypeDecl}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtTypeDecl(GrammarParser.StmtTypeDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnRule}
	 * labeled alternative in {@link GrammarParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturnRule(GrammarParser.ReturnRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnRule}
	 * labeled alternative in {@link GrammarParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturnRule(GrammarParser.ReturnRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifBodyRule}
	 * labeled alternative in {@link GrammarParser#ifBody}.
	 * @param ctx the parse tree
	 */
	void enterIfBodyRule(GrammarParser.IfBodyRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifBodyRule}
	 * labeled alternative in {@link GrammarParser#ifBody}.
	 * @param ctx the parse tree
	 */
	void exitIfBodyRule(GrammarParser.IfBodyRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatementRule}
	 * labeled alternative in {@link GrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatementRule(GrammarParser.IfStatementRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatementRule}
	 * labeled alternative in {@link GrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatementRule(GrammarParser.IfStatementRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doWhileLoop}
	 * labeled alternative in {@link GrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileLoop(GrammarParser.DoWhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doWhileLoop}
	 * labeled alternative in {@link GrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileLoop(GrammarParser.DoWhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileLoop}
	 * labeled alternative in {@link GrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(GrammarParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileLoop}
	 * labeled alternative in {@link GrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(GrammarParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forLoopAssign}
	 * labeled alternative in {@link GrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForLoopAssign(GrammarParser.ForLoopAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forLoopAssign}
	 * labeled alternative in {@link GrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForLoopAssign(GrammarParser.ForLoopAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forLoopDecl}
	 * labeled alternative in {@link GrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForLoopDecl(GrammarParser.ForLoopDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forLoopDecl}
	 * labeled alternative in {@link GrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForLoopDecl(GrammarParser.ForLoopDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forInLoopVal}
	 * labeled alternative in {@link GrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForInLoopVal(GrammarParser.ForInLoopValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forInLoopVal}
	 * labeled alternative in {@link GrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForInLoopVal(GrammarParser.ForInLoopValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forInLoopDecl}
	 * labeled alternative in {@link GrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForInLoopDecl(GrammarParser.ForInLoopDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forInLoopDecl}
	 * labeled alternative in {@link GrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForInLoopDecl(GrammarParser.ForInLoopDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionDeclarationRule}
	 * labeled alternative in {@link GrammarParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclarationRule(GrammarParser.FunctionDeclarationRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionDeclarationRule}
	 * labeled alternative in {@link GrammarParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclarationRule(GrammarParser.FunctionDeclarationRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionBlock}
	 * labeled alternative in {@link GrammarParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBlock(GrammarParser.FunctionBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionBlock}
	 * labeled alternative in {@link GrammarParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBlock(GrammarParser.FunctionBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionArrow}
	 * labeled alternative in {@link GrammarParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArrow(GrammarParser.FunctionArrowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionArrow}
	 * labeled alternative in {@link GrammarParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArrow(GrammarParser.FunctionArrowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallRule}
	 * labeled alternative in {@link GrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallRule(GrammarParser.FunctionCallRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallRule}
	 * labeled alternative in {@link GrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallRule(GrammarParser.FunctionCallRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDeclarationRule}
	 * labeled alternative in {@link GrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclarationRule(GrammarParser.VarDeclarationRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDeclarationRule}
	 * labeled alternative in {@link GrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclarationRule(GrammarParser.VarDeclarationRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varAssignRule}
	 * labeled alternative in {@link GrammarParser#variableAssign}.
	 * @param ctx the parse tree
	 */
	void enterVarAssignRule(GrammarParser.VarAssignRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varAssignRule}
	 * labeled alternative in {@link GrammarParser#variableAssign}.
	 * @param ctx the parse tree
	 */
	void exitVarAssignRule(GrammarParser.VarAssignRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code importRule}
	 * labeled alternative in {@link GrammarParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportRule(GrammarParser.ImportRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code importRule}
	 * labeled alternative in {@link GrammarParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportRule(GrammarParser.ImportRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defaultImportRule}
	 * labeled alternative in {@link GrammarParser#defaultImport}.
	 * @param ctx the parse tree
	 */
	void enterDefaultImportRule(GrammarParser.DefaultImportRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defaultImportRule}
	 * labeled alternative in {@link GrammarParser#defaultImport}.
	 * @param ctx the parse tree
	 */
	void exitDefaultImportRule(GrammarParser.DefaultImportRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code namedImportsRule}
	 * labeled alternative in {@link GrammarParser#namedImports}.
	 * @param ctx the parse tree
	 */
	void enterNamedImportsRule(GrammarParser.NamedImportsRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code namedImportsRule}
	 * labeled alternative in {@link GrammarParser#namedImports}.
	 * @param ctx the parse tree
	 */
	void exitNamedImportsRule(GrammarParser.NamedImportsRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code importSpecifierRule}
	 * labeled alternative in {@link GrammarParser#importSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterImportSpecifierRule(GrammarParser.ImportSpecifierRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code importSpecifierRule}
	 * labeled alternative in {@link GrammarParser#importSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitImportSpecifierRule(GrammarParser.ImportSpecifierRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exportRule}
	 * labeled alternative in {@link GrammarParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportRule(GrammarParser.ExportRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exportRule}
	 * labeled alternative in {@link GrammarParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportRule(GrammarParser.ExportRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classDeclarationRule}
	 * labeled alternative in {@link GrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclarationRule(GrammarParser.ClassDeclarationRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classDeclarationRule}
	 * labeled alternative in {@link GrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclarationRule(GrammarParser.ClassDeclarationRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classBodyRule}
	 * labeled alternative in {@link GrammarParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyRule(GrammarParser.ClassBodyRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classBodyRule}
	 * labeled alternative in {@link GrammarParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyRule(GrammarParser.ClassBodyRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classVarDecl}
	 * labeled alternative in {@link GrammarParser#classBodyStatement}.
	 * @param ctx the parse tree
	 */
	void enterClassVarDecl(GrammarParser.ClassVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classVarDecl}
	 * labeled alternative in {@link GrammarParser#classBodyStatement}.
	 * @param ctx the parse tree
	 */
	void exitClassVarDecl(GrammarParser.ClassVarDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classFuncDecl}
	 * labeled alternative in {@link GrammarParser#classBodyStatement}.
	 * @param ctx the parse tree
	 */
	void enterClassFuncDecl(GrammarParser.ClassFuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classFuncDecl}
	 * labeled alternative in {@link GrammarParser#classBodyStatement}.
	 * @param ctx the parse tree
	 */
	void exitClassFuncDecl(GrammarParser.ClassFuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code componentRule}
	 * labeled alternative in {@link GrammarParser#componentStatement}.
	 * @param ctx the parse tree
	 */
	void enterComponentRule(GrammarParser.ComponentRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code componentRule}
	 * labeled alternative in {@link GrammarParser#componentStatement}.
	 * @param ctx the parse tree
	 */
	void exitComponentRule(GrammarParser.ComponentRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeDefineRule}
	 * labeled alternative in {@link GrammarParser#typeDefine}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefineRule(GrammarParser.TypeDefineRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeDefineRule}
	 * labeled alternative in {@link GrammarParser#typeDefine}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefineRule(GrammarParser.TypeDefineRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeDeclarationRule}
	 * labeled alternative in {@link GrammarParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclarationRule(GrammarParser.TypeDeclarationRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeDeclarationRule}
	 * labeled alternative in {@link GrammarParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclarationRule(GrammarParser.TypeDeclarationRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeSimple}
	 * labeled alternative in {@link GrammarParser#typeDeclarationValue}.
	 * @param ctx the parse tree
	 */
	void enterTypeSimple(GrammarParser.TypeSimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeSimple}
	 * labeled alternative in {@link GrammarParser#typeDeclarationValue}.
	 * @param ctx the parse tree
	 */
	void exitTypeSimple(GrammarParser.TypeSimpleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeObjectAssign}
	 * labeled alternative in {@link GrammarParser#typeDeclarationValue}.
	 * @param ctx the parse tree
	 */
	void enterTypeObjectAssign(GrammarParser.TypeObjectAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeObjectAssign}
	 * labeled alternative in {@link GrammarParser#typeDeclarationValue}.
	 * @param ctx the parse tree
	 */
	void exitTypeObjectAssign(GrammarParser.TypeObjectAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeObjectRule}
	 * labeled alternative in {@link GrammarParser#typeObject}.
	 * @param ctx the parse tree
	 */
	void enterTypeObjectRule(GrammarParser.TypeObjectRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeObjectRule}
	 * labeled alternative in {@link GrammarParser#typeObject}.
	 * @param ctx the parse tree
	 */
	void exitTypeObjectRule(GrammarParser.TypeObjectRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeMemberRule}
	 * labeled alternative in {@link GrammarParser#typeMember}.
	 * @param ctx the parse tree
	 */
	void enterTypeMemberRule(GrammarParser.TypeMemberRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeMemberRule}
	 * labeled alternative in {@link GrammarParser#typeMember}.
	 * @param ctx the parse tree
	 */
	void exitTypeMemberRule(GrammarParser.TypeMemberRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asTypeRule}
	 * labeled alternative in {@link GrammarParser#asType}.
	 * @param ctx the parse tree
	 */
	void enterAsTypeRule(GrammarParser.AsTypeRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asTypeRule}
	 * labeled alternative in {@link GrammarParser#asType}.
	 * @param ctx the parse tree
	 */
	void exitAsTypeRule(GrammarParser.AsTypeRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodCallValue}
	 * labeled alternative in {@link GrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallValue(GrammarParser.MethodCallValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodCallValue}
	 * labeled alternative in {@link GrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallValue(GrammarParser.MethodCallValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code propertyAccessValue}
	 * labeled alternative in {@link GrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAccessValue(GrammarParser.PropertyAccessValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code propertyAccessValue}
	 * labeled alternative in {@link GrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAccessValue(GrammarParser.PropertyAccessValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryValueExpr}
	 * labeled alternative in {@link GrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryValueExpr(GrammarParser.PrimaryValueExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryValueExpr}
	 * labeled alternative in {@link GrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryValueExpr(GrammarParser.PrimaryValueExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrowFunctionValue}
	 * labeled alternative in {@link GrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunctionValue(GrammarParser.ArrowFunctionValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrowFunctionValue}
	 * labeled alternative in {@link GrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunctionValue(GrammarParser.ArrowFunctionValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryValue}
	 * labeled alternative in {@link GrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterBinaryValue(GrammarParser.BinaryValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryValue}
	 * labeled alternative in {@link GrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitBinaryValue(GrammarParser.BinaryValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberValue}
	 * labeled alternative in {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 */
	void enterNumberValue(GrammarParser.NumberValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberValue}
	 * labeled alternative in {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 */
	void exitNumberValue(GrammarParser.NumberValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringValue}
	 * labeled alternative in {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 */
	void enterStringValue(GrammarParser.StringValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringValue}
	 * labeled alternative in {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 */
	void exitStringValue(GrammarParser.StringValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callValue}
	 * labeled alternative in {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 */
	void enterCallValue(GrammarParser.CallValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callValue}
	 * labeled alternative in {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 */
	void exitCallValue(GrammarParser.CallValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idValue}
	 * labeled alternative in {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 */
	void enterIdValue(GrammarParser.IdValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idValue}
	 * labeled alternative in {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 */
	void exitIdValue(GrammarParser.IdValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenValue}
	 * labeled alternative in {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 */
	void enterParenValue(GrammarParser.ParenValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenValue}
	 * labeled alternative in {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 */
	void exitParenValue(GrammarParser.ParenValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectValue}
	 * labeled alternative in {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 */
	void enterObjectValue(GrammarParser.ObjectValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectValue}
	 * labeled alternative in {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 */
	void exitObjectValue(GrammarParser.ObjectValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayValue}
	 * labeled alternative in {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 */
	void enterArrayValue(GrammarParser.ArrayValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayValue}
	 * labeled alternative in {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 */
	void exitArrayValue(GrammarParser.ArrayValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAccessValue}
	 * labeled alternative in {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccessValue(GrammarParser.ArrayAccessValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAccessValue}
	 * labeled alternative in {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccessValue(GrammarParser.ArrayAccessValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionValue}
	 * labeled alternative in {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 */
	void enterFunctionValue(GrammarParser.FunctionValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionValue}
	 * labeled alternative in {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 */
	void exitFunctionValue(GrammarParser.FunctionValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code incValue}
	 * labeled alternative in {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 */
	void enterIncValue(GrammarParser.IncValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code incValue}
	 * labeled alternative in {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 */
	void exitIncValue(GrammarParser.IncValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decValue}
	 * labeled alternative in {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 */
	void enterDecValue(GrammarParser.DecValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decValue}
	 * labeled alternative in {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 */
	void exitDecValue(GrammarParser.DecValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negationValue}
	 * labeled alternative in {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 */
	void enterNegationValue(GrammarParser.NegationValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negationValue}
	 * labeled alternative in {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 */
	void exitNegationValue(GrammarParser.NegationValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code templateValue}
	 * labeled alternative in {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 */
	void enterTemplateValue(GrammarParser.TemplateValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code templateValue}
	 * labeled alternative in {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 */
	void exitTemplateValue(GrammarParser.TemplateValueContext ctx);
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
	 * Enter a parse tree produced by the {@code idEqComparison}
	 * labeled alternative in {@link GrammarParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterIdEqComparison(GrammarParser.IdEqComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idEqComparison}
	 * labeled alternative in {@link GrammarParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitIdEqComparison(GrammarParser.IdEqComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqComparison}
	 * labeled alternative in {@link GrammarParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterEqComparison(GrammarParser.EqComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqComparison}
	 * labeled alternative in {@link GrammarParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitEqComparison(GrammarParser.EqComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code neqComparison}
	 * labeled alternative in {@link GrammarParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterNeqComparison(GrammarParser.NeqComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code neqComparison}
	 * labeled alternative in {@link GrammarParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitNeqComparison(GrammarParser.NeqComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rtagComparison}
	 * labeled alternative in {@link GrammarParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterRtagComparison(GrammarParser.RtagComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rtagComparison}
	 * labeled alternative in {@link GrammarParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitRtagComparison(GrammarParser.RtagComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ltagComparison}
	 * labeled alternative in {@link GrammarParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterLtagComparison(GrammarParser.LtagComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ltagComparison}
	 * labeled alternative in {@link GrammarParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitLtagComparison(GrammarParser.LtagComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectRule}
	 * labeled alternative in {@link GrammarParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObjectRule(GrammarParser.ObjectRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectRule}
	 * labeled alternative in {@link GrammarParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObjectRule(GrammarParser.ObjectRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pairRule}
	 * labeled alternative in {@link GrammarParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPairRule(GrammarParser.PairRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pairRule}
	 * labeled alternative in {@link GrammarParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPairRule(GrammarParser.PairRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayRule}
	 * labeled alternative in {@link GrammarParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArrayRule(GrammarParser.ArrayRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayRule}
	 * labeled alternative in {@link GrammarParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArrayRule(GrammarParser.ArrayRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAccessRule}
	 * labeled alternative in {@link GrammarParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccessRule(GrammarParser.ArrayAccessRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAccessRule}
	 * labeled alternative in {@link GrammarParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccessRule(GrammarParser.ArrayAccessRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#htmlElementName}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElementName(GrammarParser.HtmlElementNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#htmlElementName}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElementName(GrammarParser.HtmlElementNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code openTagRule}
	 * labeled alternative in {@link GrammarParser#open_tag}.
	 * @param ctx the parse tree
	 */
	void enterOpenTagRule(GrammarParser.OpenTagRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code openTagRule}
	 * labeled alternative in {@link GrammarParser#open_tag}.
	 * @param ctx the parse tree
	 */
	void exitOpenTagRule(GrammarParser.OpenTagRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(GrammarParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(GrammarParser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ngForAttributeRule}
	 * labeled alternative in {@link GrammarParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterNgForAttributeRule(GrammarParser.NgForAttributeRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ngForAttributeRule}
	 * labeled alternative in {@link GrammarParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitNgForAttributeRule(GrammarParser.NgForAttributeRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ngIfAttributeRule}
	 * labeled alternative in {@link GrammarParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterNgIfAttributeRule(GrammarParser.NgIfAttributeRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ngIfAttributeRule}
	 * labeled alternative in {@link GrammarParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitNgIfAttributeRule(GrammarParser.NgIfAttributeRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code regularAttribute}
	 * labeled alternative in {@link GrammarParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterRegularAttribute(GrammarParser.RegularAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code regularAttribute}
	 * labeled alternative in {@link GrammarParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitRegularAttribute(GrammarParser.RegularAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterAttributeValue(GrammarParser.AttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitAttributeValue(GrammarParser.AttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleInterpolation}
	 * labeled alternative in {@link GrammarParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void enterSimpleInterpolation(GrammarParser.SimpleInterpolationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleInterpolation}
	 * labeled alternative in {@link GrammarParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void exitSimpleInterpolation(GrammarParser.SimpleInterpolationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nestedTemplateInterpolation}
	 * labeled alternative in {@link GrammarParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void enterNestedTemplateInterpolation(GrammarParser.NestedTemplateInterpolationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nestedTemplateInterpolation}
	 * labeled alternative in {@link GrammarParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void exitNestedTemplateInterpolation(GrammarParser.NestedTemplateInterpolationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code closeTagRule}
	 * labeled alternative in {@link GrammarParser#close_tag}.
	 * @param ctx the parse tree
	 */
	void enterCloseTagRule(GrammarParser.CloseTagRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code closeTagRule}
	 * labeled alternative in {@link GrammarParser#close_tag}.
	 * @param ctx the parse tree
	 */
	void exitCloseTagRule(GrammarParser.CloseTagRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleTagRule}
	 * labeled alternative in {@link GrammarParser#single_tag}.
	 * @param ctx the parse tree
	 */
	void enterSingleTagRule(GrammarParser.SingleTagRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleTagRule}
	 * labeled alternative in {@link GrammarParser#single_tag}.
	 * @param ctx the parse tree
	 */
	void exitSingleTagRule(GrammarParser.SingleTagRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlElement}
	 * labeled alternative in {@link GrammarParser#html}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(GrammarParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlElement}
	 * labeled alternative in {@link GrammarParser#html}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(GrammarParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlSingle}
	 * labeled alternative in {@link GrammarParser#html}.
	 * @param ctx the parse tree
	 */
	void enterHtmlSingle(GrammarParser.HtmlSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlSingle}
	 * labeled alternative in {@link GrammarParser#html}.
	 * @param ctx the parse tree
	 */
	void exitHtmlSingle(GrammarParser.HtmlSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlBlock}
	 * labeled alternative in {@link GrammarParser#html}.
	 * @param ctx the parse tree
	 */
	void enterHtmlBlock(GrammarParser.HtmlBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlBlock}
	 * labeled alternative in {@link GrammarParser#html}.
	 * @param ctx the parse tree
	 */
	void exitHtmlBlock(GrammarParser.HtmlBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlText}
	 * labeled alternative in {@link GrammarParser#html}.
	 * @param ctx the parse tree
	 */
	void enterHtmlText(GrammarParser.HtmlTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlText}
	 * labeled alternative in {@link GrammarParser#html}.
	 * @param ctx the parse tree
	 */
	void exitHtmlText(GrammarParser.HtmlTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cssBrace}
	 * labeled alternative in {@link GrammarParser#html}.
	 * @param ctx the parse tree
	 */
	void enterCssBrace(GrammarParser.CssBraceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cssBrace}
	 * labeled alternative in {@link GrammarParser#html}.
	 * @param ctx the parse tree
	 */
	void exitCssBrace(GrammarParser.CssBraceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cssLeftBrace}
	 * labeled alternative in {@link GrammarParser#css_brace}.
	 * @param ctx the parse tree
	 */
	void enterCssLeftBrace(GrammarParser.CssLeftBraceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cssLeftBrace}
	 * labeled alternative in {@link GrammarParser#css_brace}.
	 * @param ctx the parse tree
	 */
	void exitCssLeftBrace(GrammarParser.CssLeftBraceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cssRightBrace}
	 * labeled alternative in {@link GrammarParser#css_brace}.
	 * @param ctx the parse tree
	 */
	void enterCssRightBrace(GrammarParser.CssRightBraceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cssRightBrace}
	 * labeled alternative in {@link GrammarParser#css_brace}.
	 * @param ctx the parse tree
	 */
	void exitCssRightBrace(GrammarParser.CssRightBraceContext ctx);
}