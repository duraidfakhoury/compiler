// Generated from D:/Projects/compiler/GrammarParser.g4 by ANTLR 4.13.2
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
	 * Visit a parse tree produced by the {@code programRule}
	 * labeled alternative in {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramRule(GrammarParser.ProgramRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtFunctionDecl}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtFunctionDecl(GrammarParser.StmtFunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtFunctionCall}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtFunctionCall(GrammarParser.StmtFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtVarDecl}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtVarDecl(GrammarParser.StmtVarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtVarAssign}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtVarAssign(GrammarParser.StmtVarAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtValue}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtValue(GrammarParser.StmtValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtHtml}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtHtml(GrammarParser.StmtHtmlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtReturn}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtReturn(GrammarParser.StmtReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtIf}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtIf(GrammarParser.StmtIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtImport}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtImport(GrammarParser.StmtImportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtIteration}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtIteration(GrammarParser.StmtIterationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtComponent}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtComponent(GrammarParser.StmtComponentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtClass}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtClass(GrammarParser.StmtClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtExport}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtExport(GrammarParser.StmtExportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtTypeDecl}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtTypeDecl(GrammarParser.StmtTypeDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnRule}
	 * labeled alternative in {@link GrammarParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnRule(GrammarParser.ReturnRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifBodyRule}
	 * labeled alternative in {@link GrammarParser#ifBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBodyRule(GrammarParser.IfBodyRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatementRule}
	 * labeled alternative in {@link GrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatementRule(GrammarParser.IfStatementRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doWhileLoop}
	 * labeled alternative in {@link GrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileLoop(GrammarParser.DoWhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileLoop}
	 * labeled alternative in {@link GrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(GrammarParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forLoopAssign}
	 * labeled alternative in {@link GrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoopAssign(GrammarParser.ForLoopAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forLoopDecl}
	 * labeled alternative in {@link GrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoopDecl(GrammarParser.ForLoopDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forInLoopVal}
	 * labeled alternative in {@link GrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInLoopVal(GrammarParser.ForInLoopValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forInLoopDecl}
	 * labeled alternative in {@link GrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInLoopDecl(GrammarParser.ForInLoopDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionDeclarationRule}
	 * labeled alternative in {@link GrammarParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclarationRule(GrammarParser.FunctionDeclarationRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionBlock}
	 * labeled alternative in {@link GrammarParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBlock(GrammarParser.FunctionBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionArrow}
	 * labeled alternative in {@link GrammarParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArrow(GrammarParser.FunctionArrowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallRule}
	 * labeled alternative in {@link GrammarParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallRule(GrammarParser.FunctionCallRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDeclarationRule}
	 * labeled alternative in {@link GrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclarationRule(GrammarParser.VarDeclarationRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varAssignRule}
	 * labeled alternative in {@link GrammarParser#variableAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssignRule(GrammarParser.VarAssignRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code importRule}
	 * labeled alternative in {@link GrammarParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportRule(GrammarParser.ImportRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defaultImportRule}
	 * labeled alternative in {@link GrammarParser#defaultImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultImportRule(GrammarParser.DefaultImportRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code namedImportsRule}
	 * labeled alternative in {@link GrammarParser#namedImports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedImportsRule(GrammarParser.NamedImportsRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code importSpecifierRule}
	 * labeled alternative in {@link GrammarParser#importSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportSpecifierRule(GrammarParser.ImportSpecifierRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exportRule}
	 * labeled alternative in {@link GrammarParser#exportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportRule(GrammarParser.ExportRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classDeclarationRule}
	 * labeled alternative in {@link GrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclarationRule(GrammarParser.ClassDeclarationRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classBodyRule}
	 * labeled alternative in {@link GrammarParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyRule(GrammarParser.ClassBodyRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classVarDecl}
	 * labeled alternative in {@link GrammarParser#classBodyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassVarDecl(GrammarParser.ClassVarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classFuncDecl}
	 * labeled alternative in {@link GrammarParser#classBodyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassFuncDecl(GrammarParser.ClassFuncDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code componentRule}
	 * labeled alternative in {@link GrammarParser#componentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentRule(GrammarParser.ComponentRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeDefineRule}
	 * labeled alternative in {@link GrammarParser#typeDefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefineRule(GrammarParser.TypeDefineRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeDeclarationRule}
	 * labeled alternative in {@link GrammarParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclarationRule(GrammarParser.TypeDeclarationRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeSimple}
	 * labeled alternative in {@link GrammarParser#typeDeclarationValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSimple(GrammarParser.TypeSimpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeObjectAssign}
	 * labeled alternative in {@link GrammarParser#typeDeclarationValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeObjectAssign(GrammarParser.TypeObjectAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeObjectRule}
	 * labeled alternative in {@link GrammarParser#typeObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeObjectRule(GrammarParser.TypeObjectRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeMemberRule}
	 * labeled alternative in {@link GrammarParser#typeMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeMemberRule(GrammarParser.TypeMemberRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asTypeRule}
	 * labeled alternative in {@link GrammarParser#asType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsTypeRule(GrammarParser.AsTypeRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodCallValue}
	 * labeled alternative in {@link GrammarParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallValue(GrammarParser.MethodCallValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code propertyAccessValue}
	 * labeled alternative in {@link GrammarParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAccessValue(GrammarParser.PropertyAccessValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryValueExpr}
	 * labeled alternative in {@link GrammarParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryValueExpr(GrammarParser.PrimaryValueExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrowFunctionValue}
	 * labeled alternative in {@link GrammarParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunctionValue(GrammarParser.ArrowFunctionValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryValue}
	 * labeled alternative in {@link GrammarParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryValue(GrammarParser.BinaryValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberValue}
	 * labeled alternative in {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberValue(GrammarParser.NumberValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringValue}
	 * labeled alternative in {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringValue(GrammarParser.StringValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callValue}
	 * labeled alternative in {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallValue(GrammarParser.CallValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trueValue}
	 * labeled alternative in {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueValue(GrammarParser.TrueValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falseValue}
	 * labeled alternative in {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseValue(GrammarParser.FalseValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idValue}
	 * labeled alternative in {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdValue(GrammarParser.IdValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenValue}
	 * labeled alternative in {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenValue(GrammarParser.ParenValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectValue}
	 * labeled alternative in {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectValue(GrammarParser.ObjectValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayValue}
	 * labeled alternative in {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayValue(GrammarParser.ArrayValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAccessValue}
	 * labeled alternative in {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccessValue(GrammarParser.ArrayAccessValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionValue}
	 * labeled alternative in {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionValue(GrammarParser.FunctionValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code incValue}
	 * labeled alternative in {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncValue(GrammarParser.IncValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decValue}
	 * labeled alternative in {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecValue(GrammarParser.DecValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negationValue}
	 * labeled alternative in {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegationValue(GrammarParser.NegationValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code templateValue}
	 * labeled alternative in {@link GrammarParser#primaryValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateValue(GrammarParser.TemplateValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#binaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOp(GrammarParser.BinaryOpContext ctx);
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
	 * Visit a parse tree produced by the {@code idEqComparison}
	 * labeled alternative in {@link GrammarParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdEqComparison(GrammarParser.IdEqComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqComparison}
	 * labeled alternative in {@link GrammarParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqComparison(GrammarParser.EqComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code neqComparison}
	 * labeled alternative in {@link GrammarParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeqComparison(GrammarParser.NeqComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rtagComparison}
	 * labeled alternative in {@link GrammarParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRtagComparison(GrammarParser.RtagComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ltagComparison}
	 * labeled alternative in {@link GrammarParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtagComparison(GrammarParser.LtagComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectRule}
	 * labeled alternative in {@link GrammarParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectRule(GrammarParser.ObjectRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pairRule}
	 * labeled alternative in {@link GrammarParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPairRule(GrammarParser.PairRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayRule}
	 * labeled alternative in {@link GrammarParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayRule(GrammarParser.ArrayRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAccessRule}
	 * labeled alternative in {@link GrammarParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccessRule(GrammarParser.ArrayAccessRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#htmlElementName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElementName(GrammarParser.HtmlElementNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code openTagRule}
	 * labeled alternative in {@link GrammarParser#open_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenTagRule(GrammarParser.OpenTagRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(GrammarParser.AttributesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ngForAttributeRule}
	 * labeled alternative in {@link GrammarParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgForAttributeRule(GrammarParser.NgForAttributeRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ngIfAttributeRule}
	 * labeled alternative in {@link GrammarParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgIfAttributeRule(GrammarParser.NgIfAttributeRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code regularAttribute}
	 * labeled alternative in {@link GrammarParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularAttribute(GrammarParser.RegularAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#attributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeValue(GrammarParser.AttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleInterpolation}
	 * labeled alternative in {@link GrammarParser#interpolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleInterpolation(GrammarParser.SimpleInterpolationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nestedTemplateInterpolation}
	 * labeled alternative in {@link GrammarParser#interpolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedTemplateInterpolation(GrammarParser.NestedTemplateInterpolationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code closeTagRule}
	 * labeled alternative in {@link GrammarParser#close_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseTagRule(GrammarParser.CloseTagRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleTagRule}
	 * labeled alternative in {@link GrammarParser#single_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTagRule(GrammarParser.SingleTagRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlElement}
	 * labeled alternative in {@link GrammarParser#html}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(GrammarParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlSingle}
	 * labeled alternative in {@link GrammarParser#html}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlSingle(GrammarParser.HtmlSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlBlock}
	 * labeled alternative in {@link GrammarParser#html}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlBlock(GrammarParser.HtmlBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlText}
	 * labeled alternative in {@link GrammarParser#html}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlText(GrammarParser.HtmlTextContext ctx);
}