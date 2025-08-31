// Generated from d:/Projects/compiler/GrammarParser.g4 by ANTLR 4.13.2

import {ParseTreeListener} from "antlr4";


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
 * This interface defines a complete listener for a parse tree produced by
 * `GrammarParser`.
 */
export default class GrammarParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the `programRule`
	 * labeled alternative in `GrammarParser.program`.
	 * @param ctx the parse tree
	 */
	enterProgramRule?: (ctx: ProgramRuleContext) => void;
	/**
	 * Exit a parse tree produced by the `programRule`
	 * labeled alternative in `GrammarParser.program`.
	 * @param ctx the parse tree
	 */
	exitProgramRule?: (ctx: ProgramRuleContext) => void;
	/**
	 * Enter a parse tree produced by the `stmtFunctionDecl`
	 * labeled alternative in `GrammarParser.statement`.
	 * @param ctx the parse tree
	 */
	enterStmtFunctionDecl?: (ctx: StmtFunctionDeclContext) => void;
	/**
	 * Exit a parse tree produced by the `stmtFunctionDecl`
	 * labeled alternative in `GrammarParser.statement`.
	 * @param ctx the parse tree
	 */
	exitStmtFunctionDecl?: (ctx: StmtFunctionDeclContext) => void;
	/**
	 * Enter a parse tree produced by the `stmtFunctionCall`
	 * labeled alternative in `GrammarParser.statement`.
	 * @param ctx the parse tree
	 */
	enterStmtFunctionCall?: (ctx: StmtFunctionCallContext) => void;
	/**
	 * Exit a parse tree produced by the `stmtFunctionCall`
	 * labeled alternative in `GrammarParser.statement`.
	 * @param ctx the parse tree
	 */
	exitStmtFunctionCall?: (ctx: StmtFunctionCallContext) => void;
	/**
	 * Enter a parse tree produced by the `stmtVarDecl`
	 * labeled alternative in `GrammarParser.statement`.
	 * @param ctx the parse tree
	 */
	enterStmtVarDecl?: (ctx: StmtVarDeclContext) => void;
	/**
	 * Exit a parse tree produced by the `stmtVarDecl`
	 * labeled alternative in `GrammarParser.statement`.
	 * @param ctx the parse tree
	 */
	exitStmtVarDecl?: (ctx: StmtVarDeclContext) => void;
	/**
	 * Enter a parse tree produced by the `stmtVarAssign`
	 * labeled alternative in `GrammarParser.statement`.
	 * @param ctx the parse tree
	 */
	enterStmtVarAssign?: (ctx: StmtVarAssignContext) => void;
	/**
	 * Exit a parse tree produced by the `stmtVarAssign`
	 * labeled alternative in `GrammarParser.statement`.
	 * @param ctx the parse tree
	 */
	exitStmtVarAssign?: (ctx: StmtVarAssignContext) => void;
	/**
	 * Enter a parse tree produced by the `stmtValue`
	 * labeled alternative in `GrammarParser.statement`.
	 * @param ctx the parse tree
	 */
	enterStmtValue?: (ctx: StmtValueContext) => void;
	/**
	 * Exit a parse tree produced by the `stmtValue`
	 * labeled alternative in `GrammarParser.statement`.
	 * @param ctx the parse tree
	 */
	exitStmtValue?: (ctx: StmtValueContext) => void;
	/**
	 * Enter a parse tree produced by the `stmtHtml`
	 * labeled alternative in `GrammarParser.statement`.
	 * @param ctx the parse tree
	 */
	enterStmtHtml?: (ctx: StmtHtmlContext) => void;
	/**
	 * Exit a parse tree produced by the `stmtHtml`
	 * labeled alternative in `GrammarParser.statement`.
	 * @param ctx the parse tree
	 */
	exitStmtHtml?: (ctx: StmtHtmlContext) => void;
	/**
	 * Enter a parse tree produced by the `stmtReturn`
	 * labeled alternative in `GrammarParser.statement`.
	 * @param ctx the parse tree
	 */
	enterStmtReturn?: (ctx: StmtReturnContext) => void;
	/**
	 * Exit a parse tree produced by the `stmtReturn`
	 * labeled alternative in `GrammarParser.statement`.
	 * @param ctx the parse tree
	 */
	exitStmtReturn?: (ctx: StmtReturnContext) => void;
	/**
	 * Enter a parse tree produced by the `stmtIf`
	 * labeled alternative in `GrammarParser.statement`.
	 * @param ctx the parse tree
	 */
	enterStmtIf?: (ctx: StmtIfContext) => void;
	/**
	 * Exit a parse tree produced by the `stmtIf`
	 * labeled alternative in `GrammarParser.statement`.
	 * @param ctx the parse tree
	 */
	exitStmtIf?: (ctx: StmtIfContext) => void;
	/**
	 * Enter a parse tree produced by the `stmtImport`
	 * labeled alternative in `GrammarParser.statement`.
	 * @param ctx the parse tree
	 */
	enterStmtImport?: (ctx: StmtImportContext) => void;
	/**
	 * Exit a parse tree produced by the `stmtImport`
	 * labeled alternative in `GrammarParser.statement`.
	 * @param ctx the parse tree
	 */
	exitStmtImport?: (ctx: StmtImportContext) => void;
	/**
	 * Enter a parse tree produced by the `stmtIteration`
	 * labeled alternative in `GrammarParser.statement`.
	 * @param ctx the parse tree
	 */
	enterStmtIteration?: (ctx: StmtIterationContext) => void;
	/**
	 * Exit a parse tree produced by the `stmtIteration`
	 * labeled alternative in `GrammarParser.statement`.
	 * @param ctx the parse tree
	 */
	exitStmtIteration?: (ctx: StmtIterationContext) => void;
	/**
	 * Enter a parse tree produced by the `stmtComponent`
	 * labeled alternative in `GrammarParser.statement`.
	 * @param ctx the parse tree
	 */
	enterStmtComponent?: (ctx: StmtComponentContext) => void;
	/**
	 * Exit a parse tree produced by the `stmtComponent`
	 * labeled alternative in `GrammarParser.statement`.
	 * @param ctx the parse tree
	 */
	exitStmtComponent?: (ctx: StmtComponentContext) => void;
	/**
	 * Enter a parse tree produced by the `stmtClass`
	 * labeled alternative in `GrammarParser.statement`.
	 * @param ctx the parse tree
	 */
	enterStmtClass?: (ctx: StmtClassContext) => void;
	/**
	 * Exit a parse tree produced by the `stmtClass`
	 * labeled alternative in `GrammarParser.statement`.
	 * @param ctx the parse tree
	 */
	exitStmtClass?: (ctx: StmtClassContext) => void;
	/**
	 * Enter a parse tree produced by the `stmtExport`
	 * labeled alternative in `GrammarParser.statement`.
	 * @param ctx the parse tree
	 */
	enterStmtExport?: (ctx: StmtExportContext) => void;
	/**
	 * Exit a parse tree produced by the `stmtExport`
	 * labeled alternative in `GrammarParser.statement`.
	 * @param ctx the parse tree
	 */
	exitStmtExport?: (ctx: StmtExportContext) => void;
	/**
	 * Enter a parse tree produced by the `stmtTypeDecl`
	 * labeled alternative in `GrammarParser.statement`.
	 * @param ctx the parse tree
	 */
	enterStmtTypeDecl?: (ctx: StmtTypeDeclContext) => void;
	/**
	 * Exit a parse tree produced by the `stmtTypeDecl`
	 * labeled alternative in `GrammarParser.statement`.
	 * @param ctx the parse tree
	 */
	exitStmtTypeDecl?: (ctx: StmtTypeDeclContext) => void;
	/**
	 * Enter a parse tree produced by the `returnRule`
	 * labeled alternative in `GrammarParser.return`.
	 * @param ctx the parse tree
	 */
	enterReturnRule?: (ctx: ReturnRuleContext) => void;
	/**
	 * Exit a parse tree produced by the `returnRule`
	 * labeled alternative in `GrammarParser.return`.
	 * @param ctx the parse tree
	 */
	exitReturnRule?: (ctx: ReturnRuleContext) => void;
	/**
	 * Enter a parse tree produced by the `ifBodyRule`
	 * labeled alternative in `GrammarParser.ifBody`.
	 * @param ctx the parse tree
	 */
	enterIfBodyRule?: (ctx: IfBodyRuleContext) => void;
	/**
	 * Exit a parse tree produced by the `ifBodyRule`
	 * labeled alternative in `GrammarParser.ifBody`.
	 * @param ctx the parse tree
	 */
	exitIfBodyRule?: (ctx: IfBodyRuleContext) => void;
	/**
	 * Enter a parse tree produced by the `ifStatementRule`
	 * labeled alternative in `GrammarParser.ifStatement`.
	 * @param ctx the parse tree
	 */
	enterIfStatementRule?: (ctx: IfStatementRuleContext) => void;
	/**
	 * Exit a parse tree produced by the `ifStatementRule`
	 * labeled alternative in `GrammarParser.ifStatement`.
	 * @param ctx the parse tree
	 */
	exitIfStatementRule?: (ctx: IfStatementRuleContext) => void;
	/**
	 * Enter a parse tree produced by the `doWhileLoop`
	 * labeled alternative in `GrammarParser.iterationStatement`.
	 * @param ctx the parse tree
	 */
	enterDoWhileLoop?: (ctx: DoWhileLoopContext) => void;
	/**
	 * Exit a parse tree produced by the `doWhileLoop`
	 * labeled alternative in `GrammarParser.iterationStatement`.
	 * @param ctx the parse tree
	 */
	exitDoWhileLoop?: (ctx: DoWhileLoopContext) => void;
	/**
	 * Enter a parse tree produced by the `whileLoop`
	 * labeled alternative in `GrammarParser.iterationStatement`.
	 * @param ctx the parse tree
	 */
	enterWhileLoop?: (ctx: WhileLoopContext) => void;
	/**
	 * Exit a parse tree produced by the `whileLoop`
	 * labeled alternative in `GrammarParser.iterationStatement`.
	 * @param ctx the parse tree
	 */
	exitWhileLoop?: (ctx: WhileLoopContext) => void;
	/**
	 * Enter a parse tree produced by the `forLoopAssign`
	 * labeled alternative in `GrammarParser.iterationStatement`.
	 * @param ctx the parse tree
	 */
	enterForLoopAssign?: (ctx: ForLoopAssignContext) => void;
	/**
	 * Exit a parse tree produced by the `forLoopAssign`
	 * labeled alternative in `GrammarParser.iterationStatement`.
	 * @param ctx the parse tree
	 */
	exitForLoopAssign?: (ctx: ForLoopAssignContext) => void;
	/**
	 * Enter a parse tree produced by the `forLoopDecl`
	 * labeled alternative in `GrammarParser.iterationStatement`.
	 * @param ctx the parse tree
	 */
	enterForLoopDecl?: (ctx: ForLoopDeclContext) => void;
	/**
	 * Exit a parse tree produced by the `forLoopDecl`
	 * labeled alternative in `GrammarParser.iterationStatement`.
	 * @param ctx the parse tree
	 */
	exitForLoopDecl?: (ctx: ForLoopDeclContext) => void;
	/**
	 * Enter a parse tree produced by the `forInLoopVal`
	 * labeled alternative in `GrammarParser.iterationStatement`.
	 * @param ctx the parse tree
	 */
	enterForInLoopVal?: (ctx: ForInLoopValContext) => void;
	/**
	 * Exit a parse tree produced by the `forInLoopVal`
	 * labeled alternative in `GrammarParser.iterationStatement`.
	 * @param ctx the parse tree
	 */
	exitForInLoopVal?: (ctx: ForInLoopValContext) => void;
	/**
	 * Enter a parse tree produced by the `forInLoopDecl`
	 * labeled alternative in `GrammarParser.iterationStatement`.
	 * @param ctx the parse tree
	 */
	enterForInLoopDecl?: (ctx: ForInLoopDeclContext) => void;
	/**
	 * Exit a parse tree produced by the `forInLoopDecl`
	 * labeled alternative in `GrammarParser.iterationStatement`.
	 * @param ctx the parse tree
	 */
	exitForInLoopDecl?: (ctx: ForInLoopDeclContext) => void;
	/**
	 * Enter a parse tree produced by the `functionDeclarationRule`
	 * labeled alternative in `GrammarParser.functionDeclaration`.
	 * @param ctx the parse tree
	 */
	enterFunctionDeclarationRule?: (ctx: FunctionDeclarationRuleContext) => void;
	/**
	 * Exit a parse tree produced by the `functionDeclarationRule`
	 * labeled alternative in `GrammarParser.functionDeclaration`.
	 * @param ctx the parse tree
	 */
	exitFunctionDeclarationRule?: (ctx: FunctionDeclarationRuleContext) => void;
	/**
	 * Enter a parse tree produced by the `functionBlock`
	 * labeled alternative in `GrammarParser.functionBody`.
	 * @param ctx the parse tree
	 */
	enterFunctionBlock?: (ctx: FunctionBlockContext) => void;
	/**
	 * Exit a parse tree produced by the `functionBlock`
	 * labeled alternative in `GrammarParser.functionBody`.
	 * @param ctx the parse tree
	 */
	exitFunctionBlock?: (ctx: FunctionBlockContext) => void;
	/**
	 * Enter a parse tree produced by the `functionArrow`
	 * labeled alternative in `GrammarParser.functionBody`.
	 * @param ctx the parse tree
	 */
	enterFunctionArrow?: (ctx: FunctionArrowContext) => void;
	/**
	 * Exit a parse tree produced by the `functionArrow`
	 * labeled alternative in `GrammarParser.functionBody`.
	 * @param ctx the parse tree
	 */
	exitFunctionArrow?: (ctx: FunctionArrowContext) => void;
	/**
	 * Enter a parse tree produced by the `functionCallRule`
	 * labeled alternative in `GrammarParser.functionCall`.
	 * @param ctx the parse tree
	 */
	enterFunctionCallRule?: (ctx: FunctionCallRuleContext) => void;
	/**
	 * Exit a parse tree produced by the `functionCallRule`
	 * labeled alternative in `GrammarParser.functionCall`.
	 * @param ctx the parse tree
	 */
	exitFunctionCallRule?: (ctx: FunctionCallRuleContext) => void;
	/**
	 * Enter a parse tree produced by the `varDeclarationRule`
	 * labeled alternative in `GrammarParser.variableDeclaration`.
	 * @param ctx the parse tree
	 */
	enterVarDeclarationRule?: (ctx: VarDeclarationRuleContext) => void;
	/**
	 * Exit a parse tree produced by the `varDeclarationRule`
	 * labeled alternative in `GrammarParser.variableDeclaration`.
	 * @param ctx the parse tree
	 */
	exitVarDeclarationRule?: (ctx: VarDeclarationRuleContext) => void;
	/**
	 * Enter a parse tree produced by the `varAssignRule`
	 * labeled alternative in `GrammarParser.variableAssign`.
	 * @param ctx the parse tree
	 */
	enterVarAssignRule?: (ctx: VarAssignRuleContext) => void;
	/**
	 * Exit a parse tree produced by the `varAssignRule`
	 * labeled alternative in `GrammarParser.variableAssign`.
	 * @param ctx the parse tree
	 */
	exitVarAssignRule?: (ctx: VarAssignRuleContext) => void;
	/**
	 * Enter a parse tree produced by the `importRule`
	 * labeled alternative in `GrammarParser.importStatement`.
	 * @param ctx the parse tree
	 */
	enterImportRule?: (ctx: ImportRuleContext) => void;
	/**
	 * Exit a parse tree produced by the `importRule`
	 * labeled alternative in `GrammarParser.importStatement`.
	 * @param ctx the parse tree
	 */
	exitImportRule?: (ctx: ImportRuleContext) => void;
	/**
	 * Enter a parse tree produced by the `defaultImportRule`
	 * labeled alternative in `GrammarParser.defaultImport`.
	 * @param ctx the parse tree
	 */
	enterDefaultImportRule?: (ctx: DefaultImportRuleContext) => void;
	/**
	 * Exit a parse tree produced by the `defaultImportRule`
	 * labeled alternative in `GrammarParser.defaultImport`.
	 * @param ctx the parse tree
	 */
	exitDefaultImportRule?: (ctx: DefaultImportRuleContext) => void;
	/**
	 * Enter a parse tree produced by the `namedImportsRule`
	 * labeled alternative in `GrammarParser.namedImports`.
	 * @param ctx the parse tree
	 */
	enterNamedImportsRule?: (ctx: NamedImportsRuleContext) => void;
	/**
	 * Exit a parse tree produced by the `namedImportsRule`
	 * labeled alternative in `GrammarParser.namedImports`.
	 * @param ctx the parse tree
	 */
	exitNamedImportsRule?: (ctx: NamedImportsRuleContext) => void;
	/**
	 * Enter a parse tree produced by the `importSpecifierRule`
	 * labeled alternative in `GrammarParser.importSpecifier`.
	 * @param ctx the parse tree
	 */
	enterImportSpecifierRule?: (ctx: ImportSpecifierRuleContext) => void;
	/**
	 * Exit a parse tree produced by the `importSpecifierRule`
	 * labeled alternative in `GrammarParser.importSpecifier`.
	 * @param ctx the parse tree
	 */
	exitImportSpecifierRule?: (ctx: ImportSpecifierRuleContext) => void;
	/**
	 * Enter a parse tree produced by the `exportRule`
	 * labeled alternative in `GrammarParser.exportStatement`.
	 * @param ctx the parse tree
	 */
	enterExportRule?: (ctx: ExportRuleContext) => void;
	/**
	 * Exit a parse tree produced by the `exportRule`
	 * labeled alternative in `GrammarParser.exportStatement`.
	 * @param ctx the parse tree
	 */
	exitExportRule?: (ctx: ExportRuleContext) => void;
	/**
	 * Enter a parse tree produced by the `classDeclarationRule`
	 * labeled alternative in `GrammarParser.classDeclaration`.
	 * @param ctx the parse tree
	 */
	enterClassDeclarationRule?: (ctx: ClassDeclarationRuleContext) => void;
	/**
	 * Exit a parse tree produced by the `classDeclarationRule`
	 * labeled alternative in `GrammarParser.classDeclaration`.
	 * @param ctx the parse tree
	 */
	exitClassDeclarationRule?: (ctx: ClassDeclarationRuleContext) => void;
	/**
	 * Enter a parse tree produced by the `classBodyRule`
	 * labeled alternative in `GrammarParser.classBody`.
	 * @param ctx the parse tree
	 */
	enterClassBodyRule?: (ctx: ClassBodyRuleContext) => void;
	/**
	 * Exit a parse tree produced by the `classBodyRule`
	 * labeled alternative in `GrammarParser.classBody`.
	 * @param ctx the parse tree
	 */
	exitClassBodyRule?: (ctx: ClassBodyRuleContext) => void;
	/**
	 * Enter a parse tree produced by the `classVarDecl`
	 * labeled alternative in `GrammarParser.classBodyStatement`.
	 * @param ctx the parse tree
	 */
	enterClassVarDecl?: (ctx: ClassVarDeclContext) => void;
	/**
	 * Exit a parse tree produced by the `classVarDecl`
	 * labeled alternative in `GrammarParser.classBodyStatement`.
	 * @param ctx the parse tree
	 */
	exitClassVarDecl?: (ctx: ClassVarDeclContext) => void;
	/**
	 * Enter a parse tree produced by the `classFuncDecl`
	 * labeled alternative in `GrammarParser.classBodyStatement`.
	 * @param ctx the parse tree
	 */
	enterClassFuncDecl?: (ctx: ClassFuncDeclContext) => void;
	/**
	 * Exit a parse tree produced by the `classFuncDecl`
	 * labeled alternative in `GrammarParser.classBodyStatement`.
	 * @param ctx the parse tree
	 */
	exitClassFuncDecl?: (ctx: ClassFuncDeclContext) => void;
	/**
	 * Enter a parse tree produced by the `componentRule`
	 * labeled alternative in `GrammarParser.componentStatement`.
	 * @param ctx the parse tree
	 */
	enterComponentRule?: (ctx: ComponentRuleContext) => void;
	/**
	 * Exit a parse tree produced by the `componentRule`
	 * labeled alternative in `GrammarParser.componentStatement`.
	 * @param ctx the parse tree
	 */
	exitComponentRule?: (ctx: ComponentRuleContext) => void;
	/**
	 * Enter a parse tree produced by the `typeDefineRule`
	 * labeled alternative in `GrammarParser.typeDefine`.
	 * @param ctx the parse tree
	 */
	enterTypeDefineRule?: (ctx: TypeDefineRuleContext) => void;
	/**
	 * Exit a parse tree produced by the `typeDefineRule`
	 * labeled alternative in `GrammarParser.typeDefine`.
	 * @param ctx the parse tree
	 */
	exitTypeDefineRule?: (ctx: TypeDefineRuleContext) => void;
	/**
	 * Enter a parse tree produced by the `typeDeclarationRule`
	 * labeled alternative in `GrammarParser.typeDeclaration`.
	 * @param ctx the parse tree
	 */
	enterTypeDeclarationRule?: (ctx: TypeDeclarationRuleContext) => void;
	/**
	 * Exit a parse tree produced by the `typeDeclarationRule`
	 * labeled alternative in `GrammarParser.typeDeclaration`.
	 * @param ctx the parse tree
	 */
	exitTypeDeclarationRule?: (ctx: TypeDeclarationRuleContext) => void;
	/**
	 * Enter a parse tree produced by the `typeSimple`
	 * labeled alternative in `GrammarParser.typeDeclarationValue`.
	 * @param ctx the parse tree
	 */
	enterTypeSimple?: (ctx: TypeSimpleContext) => void;
	/**
	 * Exit a parse tree produced by the `typeSimple`
	 * labeled alternative in `GrammarParser.typeDeclarationValue`.
	 * @param ctx the parse tree
	 */
	exitTypeSimple?: (ctx: TypeSimpleContext) => void;
	/**
	 * Enter a parse tree produced by the `typeObjectAssign`
	 * labeled alternative in `GrammarParser.typeDeclarationValue`.
	 * @param ctx the parse tree
	 */
	enterTypeObjectAssign?: (ctx: TypeObjectAssignContext) => void;
	/**
	 * Exit a parse tree produced by the `typeObjectAssign`
	 * labeled alternative in `GrammarParser.typeDeclarationValue`.
	 * @param ctx the parse tree
	 */
	exitTypeObjectAssign?: (ctx: TypeObjectAssignContext) => void;
	/**
	 * Enter a parse tree produced by the `typeObjectRule`
	 * labeled alternative in `GrammarParser.typeObject`.
	 * @param ctx the parse tree
	 */
	enterTypeObjectRule?: (ctx: TypeObjectRuleContext) => void;
	/**
	 * Exit a parse tree produced by the `typeObjectRule`
	 * labeled alternative in `GrammarParser.typeObject`.
	 * @param ctx the parse tree
	 */
	exitTypeObjectRule?: (ctx: TypeObjectRuleContext) => void;
	/**
	 * Enter a parse tree produced by the `typeMemberRule`
	 * labeled alternative in `GrammarParser.typeMember`.
	 * @param ctx the parse tree
	 */
	enterTypeMemberRule?: (ctx: TypeMemberRuleContext) => void;
	/**
	 * Exit a parse tree produced by the `typeMemberRule`
	 * labeled alternative in `GrammarParser.typeMember`.
	 * @param ctx the parse tree
	 */
	exitTypeMemberRule?: (ctx: TypeMemberRuleContext) => void;
	/**
	 * Enter a parse tree produced by the `asTypeRule`
	 * labeled alternative in `GrammarParser.asType`.
	 * @param ctx the parse tree
	 */
	enterAsTypeRule?: (ctx: AsTypeRuleContext) => void;
	/**
	 * Exit a parse tree produced by the `asTypeRule`
	 * labeled alternative in `GrammarParser.asType`.
	 * @param ctx the parse tree
	 */
	exitAsTypeRule?: (ctx: AsTypeRuleContext) => void;
	/**
	 * Enter a parse tree produced by the `methodCallValue`
	 * labeled alternative in `GrammarParser.value`.
	 * @param ctx the parse tree
	 */
	enterMethodCallValue?: (ctx: MethodCallValueContext) => void;
	/**
	 * Exit a parse tree produced by the `methodCallValue`
	 * labeled alternative in `GrammarParser.value`.
	 * @param ctx the parse tree
	 */
	exitMethodCallValue?: (ctx: MethodCallValueContext) => void;
	/**
	 * Enter a parse tree produced by the `propertyAccessValue`
	 * labeled alternative in `GrammarParser.value`.
	 * @param ctx the parse tree
	 */
	enterPropertyAccessValue?: (ctx: PropertyAccessValueContext) => void;
	/**
	 * Exit a parse tree produced by the `propertyAccessValue`
	 * labeled alternative in `GrammarParser.value`.
	 * @param ctx the parse tree
	 */
	exitPropertyAccessValue?: (ctx: PropertyAccessValueContext) => void;
	/**
	 * Enter a parse tree produced by the `primaryValueExpr`
	 * labeled alternative in `GrammarParser.value`.
	 * @param ctx the parse tree
	 */
	enterPrimaryValueExpr?: (ctx: PrimaryValueExprContext) => void;
	/**
	 * Exit a parse tree produced by the `primaryValueExpr`
	 * labeled alternative in `GrammarParser.value`.
	 * @param ctx the parse tree
	 */
	exitPrimaryValueExpr?: (ctx: PrimaryValueExprContext) => void;
	/**
	 * Enter a parse tree produced by the `arrowFunctionValue`
	 * labeled alternative in `GrammarParser.value`.
	 * @param ctx the parse tree
	 */
	enterArrowFunctionValue?: (ctx: ArrowFunctionValueContext) => void;
	/**
	 * Exit a parse tree produced by the `arrowFunctionValue`
	 * labeled alternative in `GrammarParser.value`.
	 * @param ctx the parse tree
	 */
	exitArrowFunctionValue?: (ctx: ArrowFunctionValueContext) => void;
	/**
	 * Enter a parse tree produced by the `binaryValue`
	 * labeled alternative in `GrammarParser.value`.
	 * @param ctx the parse tree
	 */
	enterBinaryValue?: (ctx: BinaryValueContext) => void;
	/**
	 * Exit a parse tree produced by the `binaryValue`
	 * labeled alternative in `GrammarParser.value`.
	 * @param ctx the parse tree
	 */
	exitBinaryValue?: (ctx: BinaryValueContext) => void;
	/**
	 * Enter a parse tree produced by the `numberValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 */
	enterNumberValue?: (ctx: NumberValueContext) => void;
	/**
	 * Exit a parse tree produced by the `numberValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 */
	exitNumberValue?: (ctx: NumberValueContext) => void;
	/**
	 * Enter a parse tree produced by the `stringValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 */
	enterStringValue?: (ctx: StringValueContext) => void;
	/**
	 * Exit a parse tree produced by the `stringValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 */
	exitStringValue?: (ctx: StringValueContext) => void;
	/**
	 * Enter a parse tree produced by the `callValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 */
	enterCallValue?: (ctx: CallValueContext) => void;
	/**
	 * Exit a parse tree produced by the `callValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 */
	exitCallValue?: (ctx: CallValueContext) => void;
	/**
	 * Enter a parse tree produced by the `trueValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 */
	enterTrueValue?: (ctx: TrueValueContext) => void;
	/**
	 * Exit a parse tree produced by the `trueValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 */
	exitTrueValue?: (ctx: TrueValueContext) => void;
	/**
	 * Enter a parse tree produced by the `falseValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 */
	enterFalseValue?: (ctx: FalseValueContext) => void;
	/**
	 * Exit a parse tree produced by the `falseValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 */
	exitFalseValue?: (ctx: FalseValueContext) => void;
	/**
	 * Enter a parse tree produced by the `idValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 */
	enterIdValue?: (ctx: IdValueContext) => void;
	/**
	 * Exit a parse tree produced by the `idValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 */
	exitIdValue?: (ctx: IdValueContext) => void;
	/**
	 * Enter a parse tree produced by the `parenValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 */
	enterParenValue?: (ctx: ParenValueContext) => void;
	/**
	 * Exit a parse tree produced by the `parenValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 */
	exitParenValue?: (ctx: ParenValueContext) => void;
	/**
	 * Enter a parse tree produced by the `objectValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 */
	enterObjectValue?: (ctx: ObjectValueContext) => void;
	/**
	 * Exit a parse tree produced by the `objectValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 */
	exitObjectValue?: (ctx: ObjectValueContext) => void;
	/**
	 * Enter a parse tree produced by the `arrayValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 */
	enterArrayValue?: (ctx: ArrayValueContext) => void;
	/**
	 * Exit a parse tree produced by the `arrayValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 */
	exitArrayValue?: (ctx: ArrayValueContext) => void;
	/**
	 * Enter a parse tree produced by the `arrayAccessValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 */
	enterArrayAccessValue?: (ctx: ArrayAccessValueContext) => void;
	/**
	 * Exit a parse tree produced by the `arrayAccessValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 */
	exitArrayAccessValue?: (ctx: ArrayAccessValueContext) => void;
	/**
	 * Enter a parse tree produced by the `functionValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 */
	enterFunctionValue?: (ctx: FunctionValueContext) => void;
	/**
	 * Exit a parse tree produced by the `functionValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 */
	exitFunctionValue?: (ctx: FunctionValueContext) => void;
	/**
	 * Enter a parse tree produced by the `incValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 */
	enterIncValue?: (ctx: IncValueContext) => void;
	/**
	 * Exit a parse tree produced by the `incValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 */
	exitIncValue?: (ctx: IncValueContext) => void;
	/**
	 * Enter a parse tree produced by the `decValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 */
	enterDecValue?: (ctx: DecValueContext) => void;
	/**
	 * Exit a parse tree produced by the `decValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 */
	exitDecValue?: (ctx: DecValueContext) => void;
	/**
	 * Enter a parse tree produced by the `negationValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 */
	enterNegationValue?: (ctx: NegationValueContext) => void;
	/**
	 * Exit a parse tree produced by the `negationValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 */
	exitNegationValue?: (ctx: NegationValueContext) => void;
	/**
	 * Enter a parse tree produced by the `templateValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 */
	enterTemplateValue?: (ctx: TemplateValueContext) => void;
	/**
	 * Exit a parse tree produced by the `templateValue`
	 * labeled alternative in `GrammarParser.primaryValue`.
	 * @param ctx the parse tree
	 */
	exitTemplateValue?: (ctx: TemplateValueContext) => void;
	/**
	 * Enter a parse tree produced by `GrammarParser.binaryOp`.
	 * @param ctx the parse tree
	 */
	enterBinaryOp?: (ctx: BinaryOpContext) => void;
	/**
	 * Exit a parse tree produced by `GrammarParser.binaryOp`.
	 * @param ctx the parse tree
	 */
	exitBinaryOp?: (ctx: BinaryOpContext) => void;
	/**
	 * Enter a parse tree produced by `GrammarParser.increase_variable`.
	 * @param ctx the parse tree
	 */
	enterIncrease_variable?: (ctx: Increase_variableContext) => void;
	/**
	 * Exit a parse tree produced by `GrammarParser.increase_variable`.
	 * @param ctx the parse tree
	 */
	exitIncrease_variable?: (ctx: Increase_variableContext) => void;
	/**
	 * Enter a parse tree produced by `GrammarParser.decrease_variable`.
	 * @param ctx the parse tree
	 */
	enterDecrease_variable?: (ctx: Decrease_variableContext) => void;
	/**
	 * Exit a parse tree produced by `GrammarParser.decrease_variable`.
	 * @param ctx the parse tree
	 */
	exitDecrease_variable?: (ctx: Decrease_variableContext) => void;
	/**
	 * Enter a parse tree produced by the `idEqComparison`
	 * labeled alternative in `GrammarParser.comparison`.
	 * @param ctx the parse tree
	 */
	enterIdEqComparison?: (ctx: IdEqComparisonContext) => void;
	/**
	 * Exit a parse tree produced by the `idEqComparison`
	 * labeled alternative in `GrammarParser.comparison`.
	 * @param ctx the parse tree
	 */
	exitIdEqComparison?: (ctx: IdEqComparisonContext) => void;
	/**
	 * Enter a parse tree produced by the `eqComparison`
	 * labeled alternative in `GrammarParser.comparison`.
	 * @param ctx the parse tree
	 */
	enterEqComparison?: (ctx: EqComparisonContext) => void;
	/**
	 * Exit a parse tree produced by the `eqComparison`
	 * labeled alternative in `GrammarParser.comparison`.
	 * @param ctx the parse tree
	 */
	exitEqComparison?: (ctx: EqComparisonContext) => void;
	/**
	 * Enter a parse tree produced by the `neqComparison`
	 * labeled alternative in `GrammarParser.comparison`.
	 * @param ctx the parse tree
	 */
	enterNeqComparison?: (ctx: NeqComparisonContext) => void;
	/**
	 * Exit a parse tree produced by the `neqComparison`
	 * labeled alternative in `GrammarParser.comparison`.
	 * @param ctx the parse tree
	 */
	exitNeqComparison?: (ctx: NeqComparisonContext) => void;
	/**
	 * Enter a parse tree produced by the `rtagComparison`
	 * labeled alternative in `GrammarParser.comparison`.
	 * @param ctx the parse tree
	 */
	enterRtagComparison?: (ctx: RtagComparisonContext) => void;
	/**
	 * Exit a parse tree produced by the `rtagComparison`
	 * labeled alternative in `GrammarParser.comparison`.
	 * @param ctx the parse tree
	 */
	exitRtagComparison?: (ctx: RtagComparisonContext) => void;
	/**
	 * Enter a parse tree produced by the `ltagComparison`
	 * labeled alternative in `GrammarParser.comparison`.
	 * @param ctx the parse tree
	 */
	enterLtagComparison?: (ctx: LtagComparisonContext) => void;
	/**
	 * Exit a parse tree produced by the `ltagComparison`
	 * labeled alternative in `GrammarParser.comparison`.
	 * @param ctx the parse tree
	 */
	exitLtagComparison?: (ctx: LtagComparisonContext) => void;
	/**
	 * Enter a parse tree produced by the `objectRule`
	 * labeled alternative in `GrammarParser.object`.
	 * @param ctx the parse tree
	 */
	enterObjectRule?: (ctx: ObjectRuleContext) => void;
	/**
	 * Exit a parse tree produced by the `objectRule`
	 * labeled alternative in `GrammarParser.object`.
	 * @param ctx the parse tree
	 */
	exitObjectRule?: (ctx: ObjectRuleContext) => void;
	/**
	 * Enter a parse tree produced by the `pairRule`
	 * labeled alternative in `GrammarParser.pair`.
	 * @param ctx the parse tree
	 */
	enterPairRule?: (ctx: PairRuleContext) => void;
	/**
	 * Exit a parse tree produced by the `pairRule`
	 * labeled alternative in `GrammarParser.pair`.
	 * @param ctx the parse tree
	 */
	exitPairRule?: (ctx: PairRuleContext) => void;
	/**
	 * Enter a parse tree produced by the `arrayRule`
	 * labeled alternative in `GrammarParser.array`.
	 * @param ctx the parse tree
	 */
	enterArrayRule?: (ctx: ArrayRuleContext) => void;
	/**
	 * Exit a parse tree produced by the `arrayRule`
	 * labeled alternative in `GrammarParser.array`.
	 * @param ctx the parse tree
	 */
	exitArrayRule?: (ctx: ArrayRuleContext) => void;
	/**
	 * Enter a parse tree produced by the `arrayAccessRule`
	 * labeled alternative in `GrammarParser.arrayAccess`.
	 * @param ctx the parse tree
	 */
	enterArrayAccessRule?: (ctx: ArrayAccessRuleContext) => void;
	/**
	 * Exit a parse tree produced by the `arrayAccessRule`
	 * labeled alternative in `GrammarParser.arrayAccess`.
	 * @param ctx the parse tree
	 */
	exitArrayAccessRule?: (ctx: ArrayAccessRuleContext) => void;
	/**
	 * Enter a parse tree produced by `GrammarParser.htmlElementName`.
	 * @param ctx the parse tree
	 */
	enterHtmlElementName?: (ctx: HtmlElementNameContext) => void;
	/**
	 * Exit a parse tree produced by `GrammarParser.htmlElementName`.
	 * @param ctx the parse tree
	 */
	exitHtmlElementName?: (ctx: HtmlElementNameContext) => void;
	/**
	 * Enter a parse tree produced by the `openTagRule`
	 * labeled alternative in `GrammarParser.open_tag`.
	 * @param ctx the parse tree
	 */
	enterOpenTagRule?: (ctx: OpenTagRuleContext) => void;
	/**
	 * Exit a parse tree produced by the `openTagRule`
	 * labeled alternative in `GrammarParser.open_tag`.
	 * @param ctx the parse tree
	 */
	exitOpenTagRule?: (ctx: OpenTagRuleContext) => void;
	/**
	 * Enter a parse tree produced by `GrammarParser.attributes`.
	 * @param ctx the parse tree
	 */
	enterAttributes?: (ctx: AttributesContext) => void;
	/**
	 * Exit a parse tree produced by `GrammarParser.attributes`.
	 * @param ctx the parse tree
	 */
	exitAttributes?: (ctx: AttributesContext) => void;
	/**
	 * Enter a parse tree produced by the `ngForAttributeRule`
	 * labeled alternative in `GrammarParser.attribute`.
	 * @param ctx the parse tree
	 */
	enterNgForAttributeRule?: (ctx: NgForAttributeRuleContext) => void;
	/**
	 * Exit a parse tree produced by the `ngForAttributeRule`
	 * labeled alternative in `GrammarParser.attribute`.
	 * @param ctx the parse tree
	 */
	exitNgForAttributeRule?: (ctx: NgForAttributeRuleContext) => void;
	/**
	 * Enter a parse tree produced by the `ngIfAttributeRule`
	 * labeled alternative in `GrammarParser.attribute`.
	 * @param ctx the parse tree
	 */
	enterNgIfAttributeRule?: (ctx: NgIfAttributeRuleContext) => void;
	/**
	 * Exit a parse tree produced by the `ngIfAttributeRule`
	 * labeled alternative in `GrammarParser.attribute`.
	 * @param ctx the parse tree
	 */
	exitNgIfAttributeRule?: (ctx: NgIfAttributeRuleContext) => void;
	/**
	 * Enter a parse tree produced by the `regularAttribute`
	 * labeled alternative in `GrammarParser.attribute`.
	 * @param ctx the parse tree
	 */
	enterRegularAttribute?: (ctx: RegularAttributeContext) => void;
	/**
	 * Exit a parse tree produced by the `regularAttribute`
	 * labeled alternative in `GrammarParser.attribute`.
	 * @param ctx the parse tree
	 */
	exitRegularAttribute?: (ctx: RegularAttributeContext) => void;
	/**
	 * Enter a parse tree produced by `GrammarParser.attributeValue`.
	 * @param ctx the parse tree
	 */
	enterAttributeValue?: (ctx: AttributeValueContext) => void;
	/**
	 * Exit a parse tree produced by `GrammarParser.attributeValue`.
	 * @param ctx the parse tree
	 */
	exitAttributeValue?: (ctx: AttributeValueContext) => void;
	/**
	 * Enter a parse tree produced by the `simpleInterpolation`
	 * labeled alternative in `GrammarParser.interpolation`.
	 * @param ctx the parse tree
	 */
	enterSimpleInterpolation?: (ctx: SimpleInterpolationContext) => void;
	/**
	 * Exit a parse tree produced by the `simpleInterpolation`
	 * labeled alternative in `GrammarParser.interpolation`.
	 * @param ctx the parse tree
	 */
	exitSimpleInterpolation?: (ctx: SimpleInterpolationContext) => void;
	/**
	 * Enter a parse tree produced by the `nestedTemplateInterpolation`
	 * labeled alternative in `GrammarParser.interpolation`.
	 * @param ctx the parse tree
	 */
	enterNestedTemplateInterpolation?: (ctx: NestedTemplateInterpolationContext) => void;
	/**
	 * Exit a parse tree produced by the `nestedTemplateInterpolation`
	 * labeled alternative in `GrammarParser.interpolation`.
	 * @param ctx the parse tree
	 */
	exitNestedTemplateInterpolation?: (ctx: NestedTemplateInterpolationContext) => void;
	/**
	 * Enter a parse tree produced by the `closeTagRule`
	 * labeled alternative in `GrammarParser.close_tag`.
	 * @param ctx the parse tree
	 */
	enterCloseTagRule?: (ctx: CloseTagRuleContext) => void;
	/**
	 * Exit a parse tree produced by the `closeTagRule`
	 * labeled alternative in `GrammarParser.close_tag`.
	 * @param ctx the parse tree
	 */
	exitCloseTagRule?: (ctx: CloseTagRuleContext) => void;
	/**
	 * Enter a parse tree produced by the `singleTagRule`
	 * labeled alternative in `GrammarParser.single_tag`.
	 * @param ctx the parse tree
	 */
	enterSingleTagRule?: (ctx: SingleTagRuleContext) => void;
	/**
	 * Exit a parse tree produced by the `singleTagRule`
	 * labeled alternative in `GrammarParser.single_tag`.
	 * @param ctx the parse tree
	 */
	exitSingleTagRule?: (ctx: SingleTagRuleContext) => void;
	/**
	 * Enter a parse tree produced by the `htmlElement`
	 * labeled alternative in `GrammarParser.html`.
	 * @param ctx the parse tree
	 */
	enterHtmlElement?: (ctx: HtmlElementContext) => void;
	/**
	 * Exit a parse tree produced by the `htmlElement`
	 * labeled alternative in `GrammarParser.html`.
	 * @param ctx the parse tree
	 */
	exitHtmlElement?: (ctx: HtmlElementContext) => void;
	/**
	 * Enter a parse tree produced by the `htmlSingle`
	 * labeled alternative in `GrammarParser.html`.
	 * @param ctx the parse tree
	 */
	enterHtmlSingle?: (ctx: HtmlSingleContext) => void;
	/**
	 * Exit a parse tree produced by the `htmlSingle`
	 * labeled alternative in `GrammarParser.html`.
	 * @param ctx the parse tree
	 */
	exitHtmlSingle?: (ctx: HtmlSingleContext) => void;
	/**
	 * Enter a parse tree produced by the `htmlBlock`
	 * labeled alternative in `GrammarParser.html`.
	 * @param ctx the parse tree
	 */
	enterHtmlBlock?: (ctx: HtmlBlockContext) => void;
	/**
	 * Exit a parse tree produced by the `htmlBlock`
	 * labeled alternative in `GrammarParser.html`.
	 * @param ctx the parse tree
	 */
	exitHtmlBlock?: (ctx: HtmlBlockContext) => void;
	/**
	 * Enter a parse tree produced by the `htmlText`
	 * labeled alternative in `GrammarParser.html`.
	 * @param ctx the parse tree
	 */
	enterHtmlText?: (ctx: HtmlTextContext) => void;
	/**
	 * Exit a parse tree produced by the `htmlText`
	 * labeled alternative in `GrammarParser.html`.
	 * @param ctx the parse tree
	 */
	exitHtmlText?: (ctx: HtmlTextContext) => void;
}

