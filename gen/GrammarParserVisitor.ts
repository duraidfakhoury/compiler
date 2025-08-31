// Generated from d:/Projects/compiler/GrammarParser.g4 by ANTLR 4.13.2

import {ParseTreeVisitor} from 'antlr4';


import { ProgramRuleContext } from "./GrammarParser.js";
import { StmtFunctionDeclContext } from "./GrammarParser.js";
import { StmtFunctionCallContext } from "./GrammarParser.js";
import { StmtVarDeclContext } from "./GrammarParser.js";
import { StmtVarAssignContext } from "./GrammarParser.js";
import { StmtValueContext } from "./GrammarParser.js";
import { StmtHtmlContext } from "./GrammarParser.js";
import { StmtReturnContext } from "./GrammarParser.js";
import { StmtIfContext } from "./GrammarParser.js";
import { StmtImportContext } from "./GrammarParser.js";
import { StmtIterationContext } from "./GrammarParser.js";
import { StmtComponentContext } from "./GrammarParser.js";
import { StmtClassContext } from "./GrammarParser.js";
import { StmtExportContext } from "./GrammarParser.js";
import { StmtTypeDeclContext } from "./GrammarParser.js";
import { ReturnRuleContext } from "./GrammarParser.js";
import { IfBodyRuleContext } from "./GrammarParser.js";
import { IfStatementRuleContext } from "./GrammarParser.js";
import { DoWhileLoopContext } from "./GrammarParser.js";
import { WhileLoopContext } from "./GrammarParser.js";
import { ForLoopAssignContext } from "./GrammarParser.js";
import { ForLoopDeclContext } from "./GrammarParser.js";
import { ForInLoopValContext } from "./GrammarParser.js";
import { ForInLoopDeclContext } from "./GrammarParser.js";
import { FunctionDeclarationRuleContext } from "./GrammarParser.js";
import { FunctionBlockContext } from "./GrammarParser.js";
import { FunctionArrowContext } from "./GrammarParser.js";
import { FunctionCallRuleContext } from "./GrammarParser.js";
import { VarDeclarationRuleContext } from "./GrammarParser.js";
import { VarAssignRuleContext } from "./GrammarParser.js";
import { ImportRuleContext } from "./GrammarParser.js";
import { DefaultImportRuleContext } from "./GrammarParser.js";
import { NamedImportsRuleContext } from "./GrammarParser.js";
import { ImportSpecifierRuleContext } from "./GrammarParser.js";
import { ExportRuleContext } from "./GrammarParser.js";
import { ClassDeclarationRuleContext } from "./GrammarParser.js";
import { ClassBodyRuleContext } from "./GrammarParser.js";
import { ClassVarDeclContext } from "./GrammarParser.js";
import { ClassFuncDeclContext } from "./GrammarParser.js";
import { ComponentRuleContext } from "./GrammarParser.js";
import { TypeDefineRuleContext } from "./GrammarParser.js";
import { TypeDeclarationRuleContext } from "./GrammarParser.js";
import { TypeSimpleContext } from "./GrammarParser.js";
import { TypeObjectAssignContext } from "./GrammarParser.js";
import { TypeObjectRuleContext } from "./GrammarParser.js";
import { TypeMemberRuleContext } from "./GrammarParser.js";
import { AsTypeRuleContext } from "./GrammarParser.js";
import { MethodCallValueContext } from "./GrammarParser.js";
import { PropertyAccessValueContext } from "./GrammarParser.js";
import { PrimaryValueExprContext } from "./GrammarParser.js";
import { ArrowFunctionValueContext } from "./GrammarParser.js";
import { BinaryValueContext } from "./GrammarParser.js";
import { NumberValueContext } from "./GrammarParser.js";
import { StringValueContext } from "./GrammarParser.js";
import { CallValueContext } from "./GrammarParser.js";
import { TrueValueContext } from "./GrammarParser.js";
import { FalseValueContext } from "./GrammarParser.js";
import { IdValueContext } from "./GrammarParser.js";
import { ParenValueContext } from "./GrammarParser.js";
import { ObjectValueContext } from "./GrammarParser.js";
import { ArrayValueContext } from "./GrammarParser.js";
import { ArrayAccessValueContext } from "./GrammarParser.js";
import { FunctionValueContext } from "./GrammarParser.js";
import { IncValueContext } from "./GrammarParser.js";
import { DecValueContext } from "./GrammarParser.js";
import { NegationValueContext } from "./GrammarParser.js";
import { TemplateValueContext } from "./GrammarParser.js";
import { BinaryOpContext } from "./GrammarParser.js";
import { Increase_variableContext } from "./GrammarParser.js";
import { Decrease_variableContext } from "./GrammarParser.js";
import { IdEqComparisonContext } from "./GrammarParser.js";
import { EqComparisonContext } from "./GrammarParser.js";
import { NeqComparisonContext } from "./GrammarParser.js";
import { RtagComparisonContext } from "./GrammarParser.js";
import { LtagComparisonContext } from "./GrammarParser.js";
import { ObjectRuleContext } from "./GrammarParser.js";
import { PairRuleContext } from "./GrammarParser.js";
import { ArrayRuleContext } from "./GrammarParser.js";
import { ArrayAccessRuleContext } from "./GrammarParser.js";
import { HtmlElementNameContext } from "./GrammarParser.js";
import { OpenTagRuleContext } from "./GrammarParser.js";
import { AttributesContext } from "./GrammarParser.js";
import { NgForAttributeRuleContext } from "./GrammarParser.js";
import { NgIfAttributeRuleContext } from "./GrammarParser.js";
import { RegularAttributeContext } from "./GrammarParser.js";
import { AttributeValueContext } from "./GrammarParser.js";
import { SimpleInterpolationContext } from "./GrammarParser.js";
import { NestedTemplateInterpolationContext } from "./GrammarParser.js";
import { CloseTagRuleContext } from "./GrammarParser.js";
import { SingleTagRuleContext } from "./GrammarParser.js";
import { HtmlElementContext } from "./GrammarParser.js";
import { HtmlSingleContext } from "./GrammarParser.js";
import { HtmlBlockContext } from "./GrammarParser.js";
import { HtmlTextContext } from "./GrammarParser.js";


/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by `GrammarParser`.
 *
 * @param <Result> The return type of the visit operation. Use `void` for
 * operations with no return type.
 */
export default class GrammarParserVisitor<Result> extends ParseTreeVisitor<Result> {
	/**
	 * Visit a parse tree produced by the `programRule`
	 * labeled alternative in `GrammarParser.program`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitProgramRule?: (ctx: ProgramRuleContext) => Result;
	/**
	 * Visit a parse tree produced by the `stmtFunctionDecl`
	 * labeled alternative in `GrammarParser.statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStmtFunctionDecl?: (ctx: StmtFunctionDeclContext) => Result;
	/**
	 * Visit a parse tree produced by the `stmtFunctionCall`
	 * labeled alternative in `GrammarParser.statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStmtFunctionCall?: (ctx: StmtFunctionCallContext) => Result;
	/**
	 * Visit a parse tree produced by the `stmtVarDecl`
	 * labeled alternative in `GrammarParser.statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStmtVarDecl?: (ctx: StmtVarDeclContext) => Result;
	/**
	 * Visit a parse tree produced by the `stmtVarAssign`
	 * labeled alternative in `GrammarParser.statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStmtVarAssign?: (ctx: StmtVarAssignContext) => Result;
	/**
	 * Visit a parse tree produced by the `stmtValue`
	 * labeled alternative in `GrammarParser.statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStmtValue?: (ctx: StmtValueContext) => Result;
	/**
	 * Visit a parse tree produced by the `stmtHtml`
	 * labeled alternative in `GrammarParser.statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStmtHtml?: (ctx: StmtHtmlContext) => Result;
	/**
	 * Visit a parse tree produced by the `stmtReturn`
	 * labeled alternative in `GrammarParser.statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStmtReturn?: (ctx: StmtReturnContext) => Result;
	/**
	 * Visit a parse tree produced by the `stmtIf`
	 * labeled alternative in `GrammarParser.statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStmtIf?: (ctx: StmtIfContext) => Result;
	/**
	 * Visit a parse tree produced by the `stmtImport`
	 * labeled alternative in `GrammarParser.statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStmtImport?: (ctx: StmtImportContext) => Result;
	/**
	 * Visit a parse tree produced by the `stmtIteration`
	 * labeled alternative in `GrammarParser.statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStmtIteration?: (ctx: StmtIterationContext) => Result;
	/**
	 * Visit a parse tree produced by the `stmtComponent`
	 * labeled alternative in `GrammarParser.statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStmtComponent?: (ctx: StmtComponentContext) => Result;
	/**
	 * Visit a parse tree produced by the `stmtClass`
	 * labeled alternative in `GrammarParser.statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStmtClass?: (ctx: StmtClassContext) => Result;
	/**
	 * Visit a parse tree produced by the `stmtExport`
	 * labeled alternative in `GrammarParser.statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStmtExport?: (ctx: StmtExportContext) => Result;
	/**
	 * Visit a parse tree produced by the `stmtTypeDecl`
	 * labeled alternative in `GrammarParser.statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStmtTypeDecl?: (ctx: StmtTypeDeclContext) => Result;
	/**
	 * Visit a parse tree produced by the `returnRule`
	 * labeled alternative in `GrammarParser.return`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitReturnRule?: (ctx: ReturnRuleContext) => Result;
	/**
	 * Visit a parse tree produced by the `ifBodyRule`
	 * labeled alternative in `GrammarParser.ifBody`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIfBodyRule?: (ctx: IfBodyRuleContext) => Result;
	/**
	 * Visit a parse tree produced by the `ifStatementRule`
	 * labeled alternative in `GrammarParser.ifStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIfStatementRule?: (ctx: IfStatementRuleContext) => Result;
	/**
	 * Visit a parse tree produced by the `doWhileLoop`
	 * labeled alternative in `GrammarParser.iterationStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDoWhileLoop?: (ctx: DoWhileLoopContext) => Result;
	/**
	 * Visit a parse tree produced by the `whileLoop`
	 * labeled alternative in `GrammarParser.iterationStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitWhileLoop?: (ctx: WhileLoopContext) => Result;
	/**
	 * Visit a parse tree produced by the `forLoopAssign`
	 * labeled alternative in `GrammarParser.iterationStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitForLoopAssign?: (ctx: ForLoopAssignContext) => Result;
	/**
	 * Visit a parse tree produced by the `forLoopDecl`
	 * labeled alternative in `GrammarParser.iterationStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitForLoopDecl?: (ctx: ForLoopDeclContext) => Result;
	/**
	 * Visit a parse tree produced by the `forInLoopVal`
	 * labeled alternative in `GrammarParser.iterationStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitForInLoopVal?: (ctx: ForInLoopValContext) => Result;
	/**
	 * Visit a parse tree produced by the `forInLoopDecl`
	 * labeled alternative in `GrammarParser.iterationStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitForInLoopDecl?: (ctx: ForInLoopDeclContext) => Result;
	/**
	 * Visit a parse tree produced by the `functionDeclarationRule`
	 * labeled alternative in `GrammarParser.functionDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFunctionDeclarationRule?: (ctx: FunctionDeclarationRuleContext) => Result;
	/**
	 * Visit a parse tree produced by the `functionBlock`
	 * labeled alternative in `GrammarParser.functionBody`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFunctionBlock?: (ctx: FunctionBlockContext) => Result;
	/**
	 * Visit a parse tree produced by the `functionArrow`
	 * labeled alternative in `GrammarParser.functionBody`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFunctionArrow?: (ctx: FunctionArrowContext) => Result;
	/**
	 * Visit a parse tree produced by the `functionCallRule`
	 * labeled alternative in `GrammarParser.functionCall`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFunctionCallRule?: (ctx: FunctionCallRuleContext) => Result;
	/**
	 * Visit a parse tree produced by the `varDeclarationRule`
	 * labeled alternative in `GrammarParser.variableDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitVarDeclarationRule?: (ctx: VarDeclarationRuleContext) => Result;
	/**
	 * Visit a parse tree produced by the `varAssignRule`
	 * labeled alternative in `GrammarParser.variableAssign`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitVarAssignRule?: (ctx: VarAssignRuleContext) => Result;
	/**
	 * Visit a parse tree produced by the `importRule`
	 * labeled alternative in `GrammarParser.importStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitImportRule?: (ctx: ImportRuleContext) => Result;
	/**
	 * Visit a parse tree produced by the `defaultImportRule`
	 * labeled alternative in `GrammarParser.defaultImport`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDefaultImportRule?: (ctx: DefaultImportRuleContext) => Result;
	/**
	 * Visit a parse tree produced by the `namedImportsRule`
	 * labeled alternative in `GrammarParser.namedImports`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitNamedImportsRule?: (ctx: NamedImportsRuleContext) => Result;
	/**
	 * Visit a parse tree produced by the `importSpecifierRule`
	 * labeled alternative in `GrammarParser.importSpecifier`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitImportSpecifierRule?: (ctx: ImportSpecifierRuleContext) => Result;
	/**
	 * Visit a parse tree produced by the `exportRule`
	 * labeled alternative in `GrammarParser.exportStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExportRule?: (ctx: ExportRuleContext) => Result;
	/**
	 * Visit a parse tree produced by the `classDeclarationRule`
	 * labeled alternative in `GrammarParser.classDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitClassDeclarationRule?: (ctx: ClassDeclarationRuleContext) => Result;
	/**
	 * Visit a parse tree produced by the `classBodyRule`
	 * labeled alternative in `GrammarParser.classBody`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitClassBodyRule?: (ctx: ClassBodyRuleContext) => Result;
	/**
	 * Visit a parse tree produced by the `classVarDecl`
	 * labeled alternative in `GrammarParser.classBodyStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitClassVarDecl?: (ctx: ClassVarDeclContext) => Result;
	/**
	 * Visit a parse tree produced by the `classFuncDecl`
	 * labeled alternative in `GrammarParser.classBodyStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitClassFuncDecl?: (ctx: ClassFuncDeclContext) => Result;
	/**
	 * Visit a parse tree produced by the `componentRule`
	 * labeled alternative in `GrammarParser.componentStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitComponentRule?: (ctx: ComponentRuleContext) => Result;
	/**
	 * Visit a parse tree produced by the `typeDefineRule`
	 * labeled alternative in `GrammarParser.typeDefine`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTypeDefineRule?: (ctx: TypeDefineRuleContext) => Result;
	/**
	 * Visit a parse tree produced by the `typeDeclarationRule`
	 * labeled alternative in `GrammarParser.typeDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTypeDeclarationRule?: (ctx: TypeDeclarationRuleContext) => Result;
	/**
	 * Visit a parse tree produced by the `typeSimple`
	 * labeled alternative in `GrammarParser.typeDeclarationValue`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTypeSimple?: (ctx: TypeSimpleContext) => Result;
	/**
	 * Visit a parse tree produced by the `typeObjectAssign`
	 * labeled alternative in `GrammarParser.typeDeclarationValue`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTypeObjectAssign?: (ctx: TypeObjectAssignContext) => Result;
	/**
	 * Visit a parse tree produced by the `typeObjectRule`
	 * labeled alternative in `GrammarParser.typeObject`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTypeObjectRule?: (ctx: TypeObjectRuleContext) => Result;
	/**
	 * Visit a parse tree produced by the `typeMemberRule`
	 * labeled alternative in `GrammarParser.typeMember`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTypeMemberRule?: (ctx: TypeMemberRuleContext) => Result;
	/**
	 * Visit a parse tree produced by the `asTypeRule`
	 * labeled alternative in `GrammarParser.asType`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAsTypeRule?: (ctx: AsTypeRuleContext) => Result;
	/**
	 * Visit a parse tree produced by the `methodCallValue`
	 * labeled alternative in `GrammarParser.value`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMethodCallValue?: (ctx: MethodCallValueContext) => Result;
	/**
	 * Visit a parse tree produced by the `propertyAccessValue`
	 * labeled alternative in `GrammarParser.value`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPropertyAccessValue?: (ctx: PropertyAccessValueContext) => Result;
	/**
	 * Visit a parse tree produced by the `primaryValueExpr`
	 * labeled alternative in `GrammarParser.value`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPrimaryValueExpr?: (ctx: PrimaryValueExprContext) => Result;
	/**
	 * Visit a parse tree produced by the `arrowFunctionValue`
	 * labeled alternative in `GrammarParser.value`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitArrowFunctionValue?: (ctx: ArrowFunctionValueContext) => Result;
	/**
	 * Visit a parse tree produced by the `binaryValue`
	 * labeled alternative in `GrammarParser.value`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitBinaryValue?: (ctx: BinaryValueContext) => Result;
	/**
	 * Visit a parse tree produced by the `numberValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitNumberValue?: (ctx: NumberValueContext) => Result;
	/**
	 * Visit a parse tree produced by the `stringValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStringValue?: (ctx: StringValueContext) => Result;
	/**
	 * Visit a parse tree produced by the `callValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCallValue?: (ctx: CallValueContext) => Result;
	/**
	 * Visit a parse tree produced by the `trueValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTrueValue?: (ctx: TrueValueContext) => Result;
	/**
	 * Visit a parse tree produced by the `falseValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFalseValue?: (ctx: FalseValueContext) => Result;
	/**
	 * Visit a parse tree produced by the `idValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIdValue?: (ctx: IdValueContext) => Result;
	/**
	 * Visit a parse tree produced by the `parenValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParenValue?: (ctx: ParenValueContext) => Result;
	/**
	 * Visit a parse tree produced by the `objectValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitObjectValue?: (ctx: ObjectValueContext) => Result;
	/**
	 * Visit a parse tree produced by the `arrayValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitArrayValue?: (ctx: ArrayValueContext) => Result;
	/**
	 * Visit a parse tree produced by the `arrayAccessValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitArrayAccessValue?: (ctx: ArrayAccessValueContext) => Result;
	/**
	 * Visit a parse tree produced by the `functionValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFunctionValue?: (ctx: FunctionValueContext) => Result;
	/**
	 * Visit a parse tree produced by the `incValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIncValue?: (ctx: IncValueContext) => Result;
	/**
	 * Visit a parse tree produced by the `decValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDecValue?: (ctx: DecValueContext) => Result;
	/**
	 * Visit a parse tree produced by the `negationValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitNegationValue?: (ctx: NegationValueContext) => Result;
	/**
	 * Visit a parse tree produced by the `templateValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTemplateValue?: (ctx: TemplateValueContext) => Result;
	/**
	 * Visit a parse tree produced by `GrammarParser.binaryOp`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitBinaryOp?: (ctx: BinaryOpContext) => Result;
	/**
	 * Visit a parse tree produced by `GrammarParser.increase_variable`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIncrease_variable?: (ctx: Increase_variableContext) => Result;
	/**
	 * Visit a parse tree produced by `GrammarParser.decrease_variable`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDecrease_variable?: (ctx: Decrease_variableContext) => Result;
	/**
	 * Visit a parse tree produced by the `idEqComparison`
	 * labeled alternative in `GrammarParser.comparison`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIdEqComparison?: (ctx: IdEqComparisonContext) => Result;
	/**
	 * Visit a parse tree produced by the `eqComparison`
	 * labeled alternative in `GrammarParser.comparison`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEqComparison?: (ctx: EqComparisonContext) => Result;
	/**
	 * Visit a parse tree produced by the `neqComparison`
	 * labeled alternative in `GrammarParser.comparison`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitNeqComparison?: (ctx: NeqComparisonContext) => Result;
	/**
	 * Visit a parse tree produced by the `rtagComparison`
	 * labeled alternative in `GrammarParser.comparison`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRtagComparison?: (ctx: RtagComparisonContext) => Result;
	/**
	 * Visit a parse tree produced by the `ltagComparison`
	 * labeled alternative in `GrammarParser.comparison`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLtagComparison?: (ctx: LtagComparisonContext) => Result;
	/**
	 * Visit a parse tree produced by the `objectRule`
	 * labeled alternative in `GrammarParser.object`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitObjectRule?: (ctx: ObjectRuleContext) => Result;
	/**
	 * Visit a parse tree produced by the `pairRule`
	 * labeled alternative in `GrammarParser.pair`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPairRule?: (ctx: PairRuleContext) => Result;
	/**
	 * Visit a parse tree produced by the `arrayRule`
	 * labeled alternative in `GrammarParser.array`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitArrayRule?: (ctx: ArrayRuleContext) => Result;
	/**
	 * Visit a parse tree produced by the `arrayAccessRule`
	 * labeled alternative in `GrammarParser.arrayAccess`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitArrayAccessRule?: (ctx: ArrayAccessRuleContext) => Result;
	/**
	 * Visit a parse tree produced by `GrammarParser.htmlElementName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitHtmlElementName?: (ctx: HtmlElementNameContext) => Result;
	/**
	 * Visit a parse tree produced by the `openTagRule`
	 * labeled alternative in `GrammarParser.open_tag`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOpenTagRule?: (ctx: OpenTagRuleContext) => Result;
	/**
	 * Visit a parse tree produced by `GrammarParser.attributes`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAttributes?: (ctx: AttributesContext) => Result;
	/**
	 * Visit a parse tree produced by the `ngForAttributeRule`
	 * labeled alternative in `GrammarParser.attribute`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitNgForAttributeRule?: (ctx: NgForAttributeRuleContext) => Result;
	/**
	 * Visit a parse tree produced by the `ngIfAttributeRule`
	 * labeled alternative in `GrammarParser.attribute`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitNgIfAttributeRule?: (ctx: NgIfAttributeRuleContext) => Result;
	/**
	 * Visit a parse tree produced by the `regularAttribute`
	 * labeled alternative in `GrammarParser.attribute`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRegularAttribute?: (ctx: RegularAttributeContext) => Result;
	/**
	 * Visit a parse tree produced by `GrammarParser.attributeValue`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAttributeValue?: (ctx: AttributeValueContext) => Result;
	/**
	 * Visit a parse tree produced by the `simpleInterpolation`
	 * labeled alternative in `GrammarParser.interpolation`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSimpleInterpolation?: (ctx: SimpleInterpolationContext) => Result;
	/**
	 * Visit a parse tree produced by the `nestedTemplateInterpolation`
	 * labeled alternative in `GrammarParser.interpolation`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitNestedTemplateInterpolation?: (ctx: NestedTemplateInterpolationContext) => Result;
	/**
	 * Visit a parse tree produced by the `closeTagRule`
	 * labeled alternative in `GrammarParser.close_tag`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCloseTagRule?: (ctx: CloseTagRuleContext) => Result;
	/**
	 * Visit a parse tree produced by the `singleTagRule`
	 * labeled alternative in `GrammarParser.single_tag`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSingleTagRule?: (ctx: SingleTagRuleContext) => Result;
	/**
	 * Visit a parse tree produced by the `htmlElement`
	 * labeled alternative in `GrammarParser.html`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitHtmlElement?: (ctx: HtmlElementContext) => Result;
	/**
	 * Visit a parse tree produced by the `htmlSingle`
	 * labeled alternative in `GrammarParser.html`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitHtmlSingle?: (ctx: HtmlSingleContext) => Result;
	/**
	 * Visit a parse tree produced by the `htmlBlock`
	 * labeled alternative in `GrammarParser.html`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitHtmlBlock?: (ctx: HtmlBlockContext) => Result;
	/**
	 * Visit a parse tree produced by the `htmlText`
	 * labeled alternative in `GrammarParser.html`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitHtmlText?: (ctx: HtmlTextContext) => Result;
}

