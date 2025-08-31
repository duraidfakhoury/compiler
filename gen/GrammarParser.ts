// Generated from d:/Projects/compiler/GrammarParser.g4 by ANTLR 4.13.2
// noinspection ES6UnusedImports,JSUnusedGlobalSymbols,JSUnusedLocalSymbols

import {
	ATN,
	ATNDeserializer, DecisionState, DFA, FailedPredicateException,
	RecognitionException, NoViableAltException, BailErrorStrategy,
	Parser, ParserATNSimulator,
	RuleContext, ParserRuleContext, PredictionMode, PredictionContextCache,
	TerminalNode, RuleNode,
	Token, TokenStream,
	Interval, IntervalSet
} from 'antlr4';
import GrammarParserListener from "./GrammarParserListener.js";
import GrammarParserVisitor from "./GrammarParserVisitor.js";

// for running tests with parameters, TODO: discuss strategy for typed parameters in CI
// eslint-disable-next-line no-unused-vars
type int = number;

export default class GrammarParser extends Parser {
	public static readonly NG_FOR = 1;
	public static readonly NG_IF = 2;
	public static readonly CLICK_EVENT = 3;
	public static readonly IMPORT = 4;
	public static readonly CLASS = 5;
	public static readonly CONST = 6;
	public static readonly LET = 7;
	public static readonly VAR = 8;
	public static readonly FUNCTION = 9;
	public static readonly RETURN = 10;
	public static readonly IF = 11;
	public static readonly ELSE = 12;
	public static readonly FOR = 13;
	public static readonly WHILE = 14;
	public static readonly ARROW = 15;
	public static readonly FROM = 16;
	public static readonly DO = 17;
	public static readonly IN = 18;
	public static readonly EXPORT = 19;
	public static readonly SELECTOR = 20;
	public static readonly COMPONENT = 21;
	public static readonly TEMPLATE = 22;
	public static readonly AS = 23;
	public static readonly TYPE = 24;
	public static readonly OF = 25;
	public static readonly TRUE = 26;
	public static readonly FALSE = 27;
	public static readonly ID = 28;
	public static readonly NUMBER = 29;
	public static readonly STRING = 30;
	public static readonly ASSIGN = 31;
	public static readonly PLUS = 32;
	public static readonly MINUS = 33;
	public static readonly MULT = 34;
	public static readonly DOUBLE_ASSIGN = 35;
	public static readonly NOT_EQUAL = 36;
	public static readonly DOUBLE_ASSIGN_ID = 37;
	public static readonly LBRACE = 38;
	public static readonly RBRACE = 39;
	public static readonly LBRACKET = 40;
	public static readonly RBRACKET = 41;
	public static readonly COLON = 42;
	public static readonly COMMA = 43;
	public static readonly SEMICOLON = 44;
	public static readonly DOT = 45;
	public static readonly WHITESPACE = 46;
	public static readonly COMMENT = 47;
	public static readonly LPAREN = 48;
	public static readonly RPAREN = 49;
	public static readonly LTAG = 50;
	public static readonly RTAG = 51;
	public static readonly SLASH = 52;
	public static readonly PLUSPLUS = 53;
	public static readonly MINUSMINUS = 54;
	public static readonly QMARK = 55;
	public static readonly EMARK = 56;
	public static readonly DOUBLE_QMARK = 57;
	public static readonly OR = 58;
	public static readonly AND = 59;
	public static readonly BACKTICK = 60;
	public static readonly LTAG_HTML = 61;
	public static readonly LBRACE_HTML = 62;
	public static readonly RBRACE_HTML = 63;
	public static readonly BACKTICK_HTML = 64;
	public static readonly TEXT_HTML = 65;
	public static readonly WS = 66;
	public static readonly DIV = 67;
	public static readonly P = 68;
	public static readonly H1 = 69;
	public static readonly H2 = 70;
	public static readonly H3 = 71;
	public static readonly H4 = 72;
	public static readonly H5 = 73;
	public static readonly H6 = 74;
	public static readonly BUTTON = 75;
	public static readonly SPAN = 76;
	public static readonly A = 77;
	public static readonly IMG = 78;
	public static readonly INPUT = 79;
	public static readonly FORM = 80;
	public static override readonly EOF = Token.EOF;
	public static readonly RULE_program = 0;
	public static readonly RULE_statement = 1;
	public static readonly RULE_return = 2;
	public static readonly RULE_ifBody = 3;
	public static readonly RULE_ifStatement = 4;
	public static readonly RULE_iterationStatement = 5;
	public static readonly RULE_functionDeclaration = 6;
	public static readonly RULE_functionBody = 7;
	public static readonly RULE_functionCall = 8;
	public static readonly RULE_variableDeclaration = 9;
	public static readonly RULE_variableAssign = 10;
	public static readonly RULE_importStatement = 11;
	public static readonly RULE_defaultImport = 12;
	public static readonly RULE_namedImports = 13;
	public static readonly RULE_importSpecifier = 14;
	public static readonly RULE_exportStatement = 15;
	public static readonly RULE_classDeclaration = 16;
	public static readonly RULE_classBody = 17;
	public static readonly RULE_classBodyStatement = 18;
	public static readonly RULE_componentStatement = 19;
	public static readonly RULE_typeDefine = 20;
	public static readonly RULE_typeDeclaration = 21;
	public static readonly RULE_typeDeclarationValue = 22;
	public static readonly RULE_typeObject = 23;
	public static readonly RULE_typeMember = 24;
	public static readonly RULE_asType = 25;
	public static readonly RULE_value = 26;
	public static readonly RULE_primaryValue = 27;
	public static readonly RULE_binaryOp = 28;
	public static readonly RULE_increase_variable = 29;
	public static readonly RULE_decrease_variable = 30;
	public static readonly RULE_comparison = 31;
	public static readonly RULE_object = 32;
	public static readonly RULE_pair = 33;
	public static readonly RULE_array = 34;
	public static readonly RULE_arrayAccess = 35;
	public static readonly RULE_htmlElementName = 36;
	public static readonly RULE_open_tag = 37;
	public static readonly RULE_attributes = 38;
	public static readonly RULE_attribute = 39;
	public static readonly RULE_attributeValue = 40;
	public static readonly RULE_interpolation = 41;
	public static readonly RULE_close_tag = 42;
	public static readonly RULE_single_tag = 43;
	public static readonly RULE_html = 44;
	public static readonly literalNames: (string | null)[] = [ null, "'*ngFor'", 
                                                            "'*ngIf'", "'[click]'", 
                                                            "'import'", 
                                                            "'class'", "'const'", 
                                                            "'let'", "'var'", 
                                                            "'function'", 
                                                            "'return'", 
                                                            "'if'", "'else'", 
                                                            "'for'", "'while'", 
                                                            "'=>'", "'from'", 
                                                            "'do'", "'in'", 
                                                            "'export'", 
                                                            "'selector'", 
                                                            "'@component'", 
                                                            "'template'", 
                                                            "'as'", "'type'", 
                                                            "'of'", "'true'", 
                                                            "'false'", null, 
                                                            null, null, 
                                                            "'='", "'+'", 
                                                            "'-'", "'*'", 
                                                            "'=='", "'!=='", 
                                                            "'==='", "'{'", 
                                                            "'}'", "'['", 
                                                            "']'", "':'", 
                                                            "','", "';'", 
                                                            "'.'", null, 
                                                            null, "'('", 
                                                            "')'", null, 
                                                            "'>'", "'/'", 
                                                            "'++'", "'--'", 
                                                            "'?'", "'!'", 
                                                            "'??'", "'||'", 
                                                            "'&&'", null, 
                                                            null, "'{{'", 
                                                            "'}}'", null, 
                                                            null, null, 
                                                            "'div'", "'p'", 
                                                            "'h1'", "'h2'", 
                                                            "'h3'", "'h4'", 
                                                            "'h5'", "'h6'", 
                                                            "'button'", 
                                                            "'span'", "'a'", 
                                                            "'img'", "'input'", 
                                                            "'form'" ];
	public static readonly symbolicNames: (string | null)[] = [ null, "NG_FOR", 
                                                             "NG_IF", "CLICK_EVENT", 
                                                             "IMPORT", "CLASS", 
                                                             "CONST", "LET", 
                                                             "VAR", "FUNCTION", 
                                                             "RETURN", "IF", 
                                                             "ELSE", "FOR", 
                                                             "WHILE", "ARROW", 
                                                             "FROM", "DO", 
                                                             "IN", "EXPORT", 
                                                             "SELECTOR", 
                                                             "COMPONENT", 
                                                             "TEMPLATE", 
                                                             "AS", "TYPE", 
                                                             "OF", "TRUE", 
                                                             "FALSE", "ID", 
                                                             "NUMBER", "STRING", 
                                                             "ASSIGN", "PLUS", 
                                                             "MINUS", "MULT", 
                                                             "DOUBLE_ASSIGN", 
                                                             "NOT_EQUAL", 
                                                             "DOUBLE_ASSIGN_ID", 
                                                             "LBRACE", "RBRACE", 
                                                             "LBRACKET", 
                                                             "RBRACKET", 
                                                             "COLON", "COMMA", 
                                                             "SEMICOLON", 
                                                             "DOT", "WHITESPACE", 
                                                             "COMMENT", 
                                                             "LPAREN", "RPAREN", 
                                                             "LTAG", "RTAG", 
                                                             "SLASH", "PLUSPLUS", 
                                                             "MINUSMINUS", 
                                                             "QMARK", "EMARK", 
                                                             "DOUBLE_QMARK", 
                                                             "OR", "AND", 
                                                             "BACKTICK", 
                                                             "LTAG_HTML", 
                                                             "LBRACE_HTML", 
                                                             "RBRACE_HTML", 
                                                             "BACKTICK_HTML", 
                                                             "TEXT_HTML", 
                                                             "WS", "DIV", 
                                                             "P", "H1", 
                                                             "H2", "H3", 
                                                             "H4", "H5", 
                                                             "H6", "BUTTON", 
                                                             "SPAN", "A", 
                                                             "IMG", "INPUT", 
                                                             "FORM" ];
	// tslint:disable:no-trailing-whitespace
	public static readonly ruleNames: string[] = [
		"program", "statement", "return", "ifBody", "ifStatement", "iterationStatement", 
		"functionDeclaration", "functionBody", "functionCall", "variableDeclaration", 
		"variableAssign", "importStatement", "defaultImport", "namedImports", 
		"importSpecifier", "exportStatement", "classDeclaration", "classBody", 
		"classBodyStatement", "componentStatement", "typeDefine", "typeDeclaration", 
		"typeDeclarationValue", "typeObject", "typeMember", "asType", "value", 
		"primaryValue", "binaryOp", "increase_variable", "decrease_variable", 
		"comparison", "object", "pair", "array", "arrayAccess", "htmlElementName", 
		"open_tag", "attributes", "attribute", "attributeValue", "interpolation", 
		"close_tag", "single_tag", "html",
	];
	public get grammarFileName(): string { return "GrammarParser.g4"; }
	public get literalNames(): (string | null)[] { return GrammarParser.literalNames; }
	public get symbolicNames(): (string | null)[] { return GrammarParser.symbolicNames; }
	public get ruleNames(): string[] { return GrammarParser.ruleNames; }
	public get serializedATN(): number[] { return GrammarParser._serializedATN; }

	protected createFailedPredicateException(predicate?: string, message?: string): FailedPredicateException {
		return new FailedPredicateException(this, predicate, message);
	}

	constructor(input: TokenStream) {
		super(input);
		this._interp = new ParserATNSimulator(this, GrammarParser._ATN, GrammarParser.DecisionsToDFA, new PredictionContextCache());
	}
	// @RuleVersion(0)
	public program(): ProgramContext {
		let localctx: ProgramContext = new ProgramContext(this, this._ctx, this.state);
		this.enterRule(localctx, 0, GrammarParser.RULE_program);
		let _la: number;
		try {
			localctx = new ProgramRuleContext(this, localctx);
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 91;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			do {
				{
				{
				this.state = 90;
				(localctx as ProgramRuleContext)._statement = this.statement();
				(localctx as ProgramRuleContext)._statements.push((localctx as ProgramRuleContext)._statement);
				}
				}
				this.state = 93;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			} while ((((_la) & ~0x1F) === 0 && ((1 << _la) & 2099933168) !== 0) || ((((_la - 38)) & ~0x1F) === 0 && ((1 << (_la - 38)) & 231052309) !== 0));
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public statement(): StatementContext {
		let localctx: StatementContext = new StatementContext(this, this._ctx, this.state);
		this.enterRule(localctx, 2, GrammarParser.RULE_statement);
		try {
			this.state = 133;
			this._errHandler.sync(this);
			switch ( this._interp.adaptivePredict(this._input, 9, this._ctx) ) {
			case 1:
				localctx = new StmtFunctionDeclContext(this, localctx);
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 95;
				(localctx as StmtFunctionDeclContext)._decl = this.functionDeclaration();
				this.state = 97;
				this._errHandler.sync(this);
				switch ( this._interp.adaptivePredict(this._input, 1, this._ctx) ) {
				case 1:
					{
					this.state = 96;
					this.match(GrammarParser.SEMICOLON);
					}
					break;
				}
				}
				break;
			case 2:
				localctx = new StmtFunctionCallContext(this, localctx);
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 99;
				(localctx as StmtFunctionCallContext)._call = this.functionCall();
				this.state = 101;
				this._errHandler.sync(this);
				switch ( this._interp.adaptivePredict(this._input, 2, this._ctx) ) {
				case 1:
					{
					this.state = 100;
					this.match(GrammarParser.SEMICOLON);
					}
					break;
				}
				}
				break;
			case 3:
				localctx = new StmtVarDeclContext(this, localctx);
				this.enterOuterAlt(localctx, 3);
				{
				this.state = 103;
				(localctx as StmtVarDeclContext)._vardecl = this.variableDeclaration();
				this.state = 105;
				this._errHandler.sync(this);
				switch ( this._interp.adaptivePredict(this._input, 3, this._ctx) ) {
				case 1:
					{
					this.state = 104;
					this.match(GrammarParser.SEMICOLON);
					}
					break;
				}
				}
				break;
			case 4:
				localctx = new StmtVarAssignContext(this, localctx);
				this.enterOuterAlt(localctx, 4);
				{
				this.state = 107;
				(localctx as StmtVarAssignContext)._varassign = this.variableAssign();
				this.state = 109;
				this._errHandler.sync(this);
				switch ( this._interp.adaptivePredict(this._input, 4, this._ctx) ) {
				case 1:
					{
					this.state = 108;
					this.match(GrammarParser.SEMICOLON);
					}
					break;
				}
				}
				break;
			case 5:
				localctx = new StmtValueContext(this, localctx);
				this.enterOuterAlt(localctx, 5);
				{
				this.state = 111;
				(localctx as StmtValueContext)._val = this.value(0);
				this.state = 113;
				this._errHandler.sync(this);
				switch ( this._interp.adaptivePredict(this._input, 5, this._ctx) ) {
				case 1:
					{
					this.state = 112;
					this.match(GrammarParser.SEMICOLON);
					}
					break;
				}
				}
				break;
			case 6:
				localctx = new StmtHtmlContext(this, localctx);
				this.enterOuterAlt(localctx, 6);
				{
				this.state = 115;
				(localctx as StmtHtmlContext)._h = this.html();
				this.state = 117;
				this._errHandler.sync(this);
				switch ( this._interp.adaptivePredict(this._input, 6, this._ctx) ) {
				case 1:
					{
					this.state = 116;
					this.match(GrammarParser.SEMICOLON);
					}
					break;
				}
				}
				break;
			case 7:
				localctx = new StmtReturnContext(this, localctx);
				this.enterOuterAlt(localctx, 7);
				{
				this.state = 119;
				(localctx as StmtReturnContext)._ret = this.return_();
				this.state = 121;
				this._errHandler.sync(this);
				switch ( this._interp.adaptivePredict(this._input, 7, this._ctx) ) {
				case 1:
					{
					this.state = 120;
					this.match(GrammarParser.SEMICOLON);
					}
					break;
				}
				}
				break;
			case 8:
				localctx = new StmtIfContext(this, localctx);
				this.enterOuterAlt(localctx, 8);
				{
				this.state = 123;
				(localctx as StmtIfContext)._ifstmt = this.ifStatement();
				}
				break;
			case 9:
				localctx = new StmtImportContext(this, localctx);
				this.enterOuterAlt(localctx, 9);
				{
				this.state = 124;
				(localctx as StmtImportContext)._imp = this.importStatement();
				}
				break;
			case 10:
				localctx = new StmtIterationContext(this, localctx);
				this.enterOuterAlt(localctx, 10);
				{
				this.state = 125;
				(localctx as StmtIterationContext)._loop = this.iterationStatement();
				}
				break;
			case 11:
				localctx = new StmtComponentContext(this, localctx);
				this.enterOuterAlt(localctx, 11);
				{
				this.state = 126;
				(localctx as StmtComponentContext)._comp = this.componentStatement();
				}
				break;
			case 12:
				localctx = new StmtClassContext(this, localctx);
				this.enterOuterAlt(localctx, 12);
				{
				this.state = 127;
				(localctx as StmtClassContext)._classDecl = this.classDeclaration();
				}
				break;
			case 13:
				localctx = new StmtExportContext(this, localctx);
				this.enterOuterAlt(localctx, 13);
				{
				this.state = 128;
				(localctx as StmtExportContext)._exp = this.exportStatement();
				}
				break;
			case 14:
				localctx = new StmtTypeDeclContext(this, localctx);
				this.enterOuterAlt(localctx, 14);
				{
				this.state = 129;
				(localctx as StmtTypeDeclContext)._typeDecl = this.typeDeclaration();
				this.state = 131;
				this._errHandler.sync(this);
				switch ( this._interp.adaptivePredict(this._input, 8, this._ctx) ) {
				case 1:
					{
					this.state = 130;
					this.match(GrammarParser.SEMICOLON);
					}
					break;
				}
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public return_(): ReturnContext {
		let localctx: ReturnContext = new ReturnContext(this, this._ctx, this.state);
		this.enterRule(localctx, 4, GrammarParser.RULE_return);
		try {
			localctx = new ReturnRuleContext(this, localctx);
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 135;
			this.match(GrammarParser.RETURN);
			this.state = 136;
			(localctx as ReturnRuleContext)._expr = this.value(0);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public ifBody(): IfBodyContext {
		let localctx: IfBodyContext = new IfBodyContext(this, this._ctx, this.state);
		this.enterRule(localctx, 6, GrammarParser.RULE_ifBody);
		let _la: number;
		try {
			localctx = new IfBodyRuleContext(this, localctx);
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 138;
			this.match(GrammarParser.IF);
			this.state = 139;
			this.match(GrammarParser.LPAREN);
			this.state = 140;
			(localctx as IfBodyRuleContext)._left = this.value(0);
			this.state = 145;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (((((_la - 35)) & ~0x1F) === 0 && ((1 << (_la - 35)) & 7) !== 0)) {
				{
				{
				this.state = 141;
				(localctx as IfBodyRuleContext).__tset214 = this._input.LT(1);
				_la = this._input.LA(1);
				if(!(((((_la - 35)) & ~0x1F) === 0 && ((1 << (_la - 35)) & 7) !== 0))) {
				    (localctx as IfBodyRuleContext).__tset214 = this._errHandler.recoverInline(this);
				}
				else {
					this._errHandler.reportMatch(this);
				    this.consume();
				}
				(localctx as IfBodyRuleContext)._condOps.push((localctx as IfBodyRuleContext).__tset214);
				this.state = 142;
				(localctx as IfBodyRuleContext)._value = this.value(0);
				(localctx as IfBodyRuleContext)._right.push((localctx as IfBodyRuleContext)._value);
				}
				}
				this.state = 147;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 148;
			this.match(GrammarParser.RPAREN);
			this.state = 149;
			this.match(GrammarParser.LBRACE);
			this.state = 153;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & 2099933168) !== 0) || ((((_la - 38)) & ~0x1F) === 0 && ((1 << (_la - 38)) & 231052309) !== 0)) {
				{
				{
				this.state = 150;
				(localctx as IfBodyRuleContext)._statement = this.statement();
				(localctx as IfBodyRuleContext)._stmts.push((localctx as IfBodyRuleContext)._statement);
				}
				}
				this.state = 155;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 156;
			this.match(GrammarParser.RBRACE);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public ifStatement(): IfStatementContext {
		let localctx: IfStatementContext = new IfStatementContext(this, this._ctx, this.state);
		this.enterRule(localctx, 8, GrammarParser.RULE_ifStatement);
		let _la: number;
		try {
			let _alt: number;
			localctx = new IfStatementRuleContext(this, localctx);
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 158;
			(localctx as IfStatementRuleContext)._ifBody = this.ifBody();
			(localctx as IfStatementRuleContext)._ifBlocks.push((localctx as IfStatementRuleContext)._ifBody);
			this.state = 163;
			this._errHandler.sync(this);
			_alt = this._interp.adaptivePredict(this._input, 12, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 159;
					this.match(GrammarParser.ELSE);
					this.state = 160;
					(localctx as IfStatementRuleContext)._ifBody = this.ifBody();
					(localctx as IfStatementRuleContext)._elseIfs.push((localctx as IfStatementRuleContext)._ifBody);
					}
					}
				}
				this.state = 165;
				this._errHandler.sync(this);
				_alt = this._interp.adaptivePredict(this._input, 12, this._ctx);
			}
			this.state = 175;
			this._errHandler.sync(this);
			switch ( this._interp.adaptivePredict(this._input, 14, this._ctx) ) {
			case 1:
				{
				this.state = 166;
				this.match(GrammarParser.ELSE);
				this.state = 167;
				(localctx as IfStatementRuleContext)._elseBlock = this.match(GrammarParser.LBRACE);
				this.state = 171;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while ((((_la) & ~0x1F) === 0 && ((1 << _la) & 2099933168) !== 0) || ((((_la - 38)) & ~0x1F) === 0 && ((1 << (_la - 38)) & 231052309) !== 0)) {
					{
					{
					this.state = 168;
					(localctx as IfStatementRuleContext)._statement = this.statement();
					(localctx as IfStatementRuleContext)._elseStmts.push((localctx as IfStatementRuleContext)._statement);
					}
					}
					this.state = 173;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 174;
				this.match(GrammarParser.RBRACE);
				}
				break;
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public iterationStatement(): IterationStatementContext {
		let localctx: IterationStatementContext = new IterationStatementContext(this, this._ctx, this.state);
		this.enterRule(localctx, 10, GrammarParser.RULE_iterationStatement);
		let _la: number;
		try {
			this.state = 279;
			this._errHandler.sync(this);
			switch ( this._interp.adaptivePredict(this._input, 27, this._ctx) ) {
			case 1:
				localctx = new DoWhileLoopContext(this, localctx);
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 177;
				this.match(GrammarParser.DO);
				this.state = 178;
				this.match(GrammarParser.LBRACE);
				this.state = 182;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while ((((_la) & ~0x1F) === 0 && ((1 << _la) & 2099933168) !== 0) || ((((_la - 38)) & ~0x1F) === 0 && ((1 << (_la - 38)) & 231052309) !== 0)) {
					{
					{
					this.state = 179;
					(localctx as DoWhileLoopContext)._statement = this.statement();
					(localctx as DoWhileLoopContext)._body.push((localctx as DoWhileLoopContext)._statement);
					}
					}
					this.state = 184;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 185;
				this.match(GrammarParser.RBRACE);
				this.state = 186;
				this.match(GrammarParser.WHILE);
				this.state = 187;
				this.match(GrammarParser.LPAREN);
				this.state = 188;
				(localctx as DoWhileLoopContext)._cond = this.value(0);
				this.state = 189;
				this.match(GrammarParser.RPAREN);
				}
				break;
			case 2:
				localctx = new WhileLoopContext(this, localctx);
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 191;
				this.match(GrammarParser.WHILE);
				this.state = 192;
				this.match(GrammarParser.LPAREN);
				this.state = 193;
				(localctx as WhileLoopContext)._cond = this.value(0);
				this.state = 194;
				this.match(GrammarParser.RPAREN);
				this.state = 204;
				this._errHandler.sync(this);
				switch ( this._interp.adaptivePredict(this._input, 17, this._ctx) ) {
				case 1:
					{
					this.state = 195;
					(localctx as WhileLoopContext)._block = this._input.LT(1);
					_la = this._input.LA(1);
					if(!(_la===38 || _la===62)) {
					    (localctx as WhileLoopContext)._block = this._errHandler.recoverInline(this);
					}
					else {
						this._errHandler.reportMatch(this);
					    this.consume();
					}
					this.state = 199;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while ((((_la) & ~0x1F) === 0 && ((1 << _la) & 2099933168) !== 0) || ((((_la - 38)) & ~0x1F) === 0 && ((1 << (_la - 38)) & 231052309) !== 0)) {
						{
						{
						this.state = 196;
						(localctx as WhileLoopContext)._statement = this.statement();
						(localctx as WhileLoopContext)._stmts.push((localctx as WhileLoopContext)._statement);
						}
						}
						this.state = 201;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					this.state = 202;
					_la = this._input.LA(1);
					if(!(_la===39 || _la===63)) {
					this._errHandler.recoverInline(this);
					}
					else {
						this._errHandler.reportMatch(this);
					    this.consume();
					}
					}
					break;
				case 2:
					{
					this.state = 203;
					(localctx as WhileLoopContext)._single = this.statement();
					}
					break;
				}
				}
				break;
			case 3:
				localctx = new ForLoopAssignContext(this, localctx);
				this.enterOuterAlt(localctx, 3);
				{
				this.state = 206;
				this.match(GrammarParser.FOR);
				this.state = 207;
				this.match(GrammarParser.LPAREN);
				this.state = 209;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la===28) {
					{
					this.state = 208;
					(localctx as ForLoopAssignContext)._initVal = this.variableAssign();
					}
				}

				this.state = 211;
				this.match(GrammarParser.SEMICOLON);
				this.state = 213;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if ((((_la) & ~0x1F) === 0 && ((1 << _la) & 2080374784) !== 0) || ((((_la - 38)) & ~0x1F) === 0 && ((1 << (_la - 38)) & 71664661) !== 0)) {
					{
					this.state = 212;
					(localctx as ForLoopAssignContext)._cond = this.value(0);
					}
				}

				this.state = 215;
				this.match(GrammarParser.SEMICOLON);
				this.state = 217;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if ((((_la) & ~0x1F) === 0 && ((1 << _la) & 2080374784) !== 0) || ((((_la - 38)) & ~0x1F) === 0 && ((1 << (_la - 38)) & 71664661) !== 0)) {
					{
					this.state = 216;
					(localctx as ForLoopAssignContext)._step = this.value(0);
					}
				}

				this.state = 219;
				this.match(GrammarParser.RPAREN);
				this.state = 220;
				this.match(GrammarParser.LBRACE);
				this.state = 224;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while ((((_la) & ~0x1F) === 0 && ((1 << _la) & 2099933168) !== 0) || ((((_la - 38)) & ~0x1F) === 0 && ((1 << (_la - 38)) & 231052309) !== 0)) {
					{
					{
					this.state = 221;
					(localctx as ForLoopAssignContext)._statement = this.statement();
					(localctx as ForLoopAssignContext)._body.push((localctx as ForLoopAssignContext)._statement);
					}
					}
					this.state = 226;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 227;
				this.match(GrammarParser.RBRACE);
				}
				break;
			case 4:
				localctx = new ForLoopDeclContext(this, localctx);
				this.enterOuterAlt(localctx, 4);
				{
				this.state = 228;
				this.match(GrammarParser.FOR);
				this.state = 229;
				this.match(GrammarParser.LPAREN);
				this.state = 230;
				(localctx as ForLoopDeclContext)._initDecl = this.variableDeclaration();
				this.state = 231;
				this.match(GrammarParser.SEMICOLON);
				this.state = 233;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if ((((_la) & ~0x1F) === 0 && ((1 << _la) & 2080374784) !== 0) || ((((_la - 38)) & ~0x1F) === 0 && ((1 << (_la - 38)) & 71664661) !== 0)) {
					{
					this.state = 232;
					(localctx as ForLoopDeclContext)._cond = this.value(0);
					}
				}

				this.state = 235;
				this.match(GrammarParser.SEMICOLON);
				this.state = 237;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if ((((_la) & ~0x1F) === 0 && ((1 << _la) & 2080374784) !== 0) || ((((_la - 38)) & ~0x1F) === 0 && ((1 << (_la - 38)) & 71664661) !== 0)) {
					{
					this.state = 236;
					(localctx as ForLoopDeclContext)._step = this.value(0);
					}
				}

				this.state = 239;
				this.match(GrammarParser.RPAREN);
				this.state = 240;
				this.match(GrammarParser.LBRACE);
				this.state = 244;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while ((((_la) & ~0x1F) === 0 && ((1 << _la) & 2099933168) !== 0) || ((((_la - 38)) & ~0x1F) === 0 && ((1 << (_la - 38)) & 231052309) !== 0)) {
					{
					{
					this.state = 241;
					(localctx as ForLoopDeclContext)._statement = this.statement();
					(localctx as ForLoopDeclContext)._body.push((localctx as ForLoopDeclContext)._statement);
					}
					}
					this.state = 246;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 247;
				this.match(GrammarParser.RBRACE);
				}
				break;
			case 5:
				localctx = new ForInLoopValContext(this, localctx);
				this.enterOuterAlt(localctx, 5);
				{
				this.state = 249;
				this.match(GrammarParser.FOR);
				this.state = 250;
				this.match(GrammarParser.LPAREN);
				this.state = 251;
				(localctx as ForInLoopValContext)._iterVal = this.value(0);
				this.state = 252;
				this.match(GrammarParser.IN);
				this.state = 253;
				(localctx as ForInLoopValContext)._iterable = this.value(0);
				this.state = 254;
				this.match(GrammarParser.RPAREN);
				this.state = 255;
				this.match(GrammarParser.LBRACE);
				this.state = 259;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while ((((_la) & ~0x1F) === 0 && ((1 << _la) & 2099933168) !== 0) || ((((_la - 38)) & ~0x1F) === 0 && ((1 << (_la - 38)) & 231052309) !== 0)) {
					{
					{
					this.state = 256;
					(localctx as ForInLoopValContext)._statement = this.statement();
					(localctx as ForInLoopValContext)._body.push((localctx as ForInLoopValContext)._statement);
					}
					}
					this.state = 261;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 262;
				this.match(GrammarParser.RBRACE);
				}
				break;
			case 6:
				localctx = new ForInLoopDeclContext(this, localctx);
				this.enterOuterAlt(localctx, 6);
				{
				this.state = 264;
				this.match(GrammarParser.FOR);
				this.state = 265;
				this.match(GrammarParser.LPAREN);
				this.state = 266;
				(localctx as ForInLoopDeclContext)._iterDecl = this.variableDeclaration();
				this.state = 267;
				this.match(GrammarParser.IN);
				this.state = 268;
				(localctx as ForInLoopDeclContext)._iterable = this.value(0);
				this.state = 269;
				this.match(GrammarParser.RPAREN);
				this.state = 270;
				this.match(GrammarParser.LBRACE);
				this.state = 274;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while ((((_la) & ~0x1F) === 0 && ((1 << _la) & 2099933168) !== 0) || ((((_la - 38)) & ~0x1F) === 0 && ((1 << (_la - 38)) & 231052309) !== 0)) {
					{
					{
					this.state = 271;
					(localctx as ForInLoopDeclContext)._statement = this.statement();
					(localctx as ForInLoopDeclContext)._body.push((localctx as ForInLoopDeclContext)._statement);
					}
					}
					this.state = 276;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 277;
				this.match(GrammarParser.RBRACE);
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public functionDeclaration(): FunctionDeclarationContext {
		let localctx: FunctionDeclarationContext = new FunctionDeclarationContext(this, this._ctx, this.state);
		this.enterRule(localctx, 12, GrammarParser.RULE_functionDeclaration);
		let _la: number;
		try {
			localctx = new FunctionDeclarationRuleContext(this, localctx);
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 281;
			this.match(GrammarParser.FUNCTION);
			this.state = 282;
			(localctx as FunctionDeclarationRuleContext)._funcName = this.match(GrammarParser.ID);
			this.state = 283;
			this.match(GrammarParser.LPAREN);
			this.state = 292;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la===28) {
				{
				this.state = 284;
				(localctx as FunctionDeclarationRuleContext)._ID = this.match(GrammarParser.ID);
				(localctx as FunctionDeclarationRuleContext)._params.push((localctx as FunctionDeclarationRuleContext)._ID);
				this.state = 289;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la===43) {
					{
					{
					this.state = 285;
					this.match(GrammarParser.COMMA);
					this.state = 286;
					(localctx as FunctionDeclarationRuleContext)._ID = this.match(GrammarParser.ID);
					(localctx as FunctionDeclarationRuleContext)._params.push((localctx as FunctionDeclarationRuleContext)._ID);
					}
					}
					this.state = 291;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				}
			}

			this.state = 294;
			this.match(GrammarParser.RPAREN);
			this.state = 295;
			(localctx as FunctionDeclarationRuleContext)._body = this.functionBody();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public functionBody(): FunctionBodyContext {
		let localctx: FunctionBodyContext = new FunctionBodyContext(this, this._ctx, this.state);
		this.enterRule(localctx, 14, GrammarParser.RULE_functionBody);
		let _la: number;
		try {
			let _alt: number;
			this.state = 336;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case 38:
			case 42:
				localctx = new FunctionBlockContext(this, localctx);
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 298;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la===42) {
					{
					this.state = 297;
					(localctx as FunctionBlockContext)._type_ = this.typeDefine();
					}
				}

				this.state = 300;
				this.match(GrammarParser.LBRACE);
				this.state = 304;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while ((((_la) & ~0x1F) === 0 && ((1 << _la) & 2099933168) !== 0) || ((((_la - 38)) & ~0x1F) === 0 && ((1 << (_la - 38)) & 231052309) !== 0)) {
					{
					{
					this.state = 301;
					(localctx as FunctionBlockContext)._statement = this.statement();
					(localctx as FunctionBlockContext)._stmts.push((localctx as FunctionBlockContext)._statement);
					}
					}
					this.state = 306;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 307;
				this.match(GrammarParser.RBRACE);
				}
				break;
			case 28:
			case 48:
				localctx = new FunctionArrowContext(this, localctx);
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 321;
				this._errHandler.sync(this);
				switch (this._input.LA(1)) {
				case 48:
					{
					{
					this.state = 308;
					this.match(GrammarParser.LPAREN);
					this.state = 317;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la===28) {
						{
						this.state = 309;
						(localctx as FunctionArrowContext)._ID = this.match(GrammarParser.ID);
						(localctx as FunctionArrowContext)._params.push((localctx as FunctionArrowContext)._ID);
						this.state = 314;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						while (_la===43) {
							{
							{
							this.state = 310;
							this.match(GrammarParser.COMMA);
							this.state = 311;
							(localctx as FunctionArrowContext)._ID = this.match(GrammarParser.ID);
							(localctx as FunctionArrowContext)._params.push((localctx as FunctionArrowContext)._ID);
							}
							}
							this.state = 316;
							this._errHandler.sync(this);
							_la = this._input.LA(1);
						}
						}
					}

					this.state = 319;
					this.match(GrammarParser.RPAREN);
					}
					}
					break;
				case 28:
					{
					this.state = 320;
					(localctx as FunctionArrowContext)._singleParam = this.match(GrammarParser.ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				this.state = 324;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la===42) {
					{
					this.state = 323;
					(localctx as FunctionArrowContext)._type_ = this.typeDefine();
					}
				}

				this.state = 326;
				this.match(GrammarParser.ARROW);
				this.state = 334;
				this._errHandler.sync(this);
				switch ( this._interp.adaptivePredict(this._input, 37, this._ctx) ) {
				case 1:
					{
					this.state = 327;
					(localctx as FunctionArrowContext)._expr = this.value(0);
					}
					break;
				case 2:
					{
					this.state = 331;
					this._errHandler.sync(this);
					_alt = this._interp.adaptivePredict(this._input, 36, this._ctx);
					while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
						if (_alt === 1) {
							{
							{
							this.state = 328;
							(localctx as FunctionArrowContext)._statement = this.statement();
							(localctx as FunctionArrowContext)._stmts.push((localctx as FunctionArrowContext)._statement);
							}
							}
						}
						this.state = 333;
						this._errHandler.sync(this);
						_alt = this._interp.adaptivePredict(this._input, 36, this._ctx);
					}
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public functionCall(): FunctionCallContext {
		let localctx: FunctionCallContext = new FunctionCallContext(this, this._ctx, this.state);
		this.enterRule(localctx, 16, GrammarParser.RULE_functionCall);
		let _la: number;
		try {
			localctx = new FunctionCallRuleContext(this, localctx);
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 338;
			(localctx as FunctionCallRuleContext)._funcName = this.match(GrammarParser.ID);
			this.state = 339;
			this.match(GrammarParser.LPAREN);
			this.state = 348;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if ((((_la) & ~0x1F) === 0 && ((1 << _la) & 2080374784) !== 0) || ((((_la - 38)) & ~0x1F) === 0 && ((1 << (_la - 38)) & 71664661) !== 0)) {
				{
				this.state = 340;
				(localctx as FunctionCallRuleContext)._value = this.value(0);
				(localctx as FunctionCallRuleContext)._args.push((localctx as FunctionCallRuleContext)._value);
				this.state = 345;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la===43) {
					{
					{
					this.state = 341;
					this.match(GrammarParser.COMMA);
					this.state = 342;
					(localctx as FunctionCallRuleContext)._value = this.value(0);
					(localctx as FunctionCallRuleContext)._args.push((localctx as FunctionCallRuleContext)._value);
					}
					}
					this.state = 347;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				}
			}

			this.state = 350;
			this.match(GrammarParser.RPAREN);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public variableDeclaration(): VariableDeclarationContext {
		let localctx: VariableDeclarationContext = new VariableDeclarationContext(this, this._ctx, this.state);
		this.enterRule(localctx, 18, GrammarParser.RULE_variableDeclaration);
		let _la: number;
		try {
			localctx = new VarDeclarationRuleContext(this, localctx);
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 352;
			(localctx as VarDeclarationRuleContext)._kind = this._input.LT(1);
			_la = this._input.LA(1);
			if(!((((_la) & ~0x1F) === 0 && ((1 << _la) & 448) !== 0))) {
			    (localctx as VarDeclarationRuleContext)._kind = this._errHandler.recoverInline(this);
			}
			else {
				this._errHandler.reportMatch(this);
			    this.consume();
			}
			this.state = 353;
			(localctx as VarDeclarationRuleContext)._assign = this.variableAssign();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public variableAssign(): VariableAssignContext {
		let localctx: VariableAssignContext = new VariableAssignContext(this, this._ctx, this.state);
		this.enterRule(localctx, 20, GrammarParser.RULE_variableAssign);
		try {
			localctx = new VarAssignRuleContext(this, localctx);
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 355;
			(localctx as VarAssignRuleContext)._varName = this.match(GrammarParser.ID);
			this.state = 357;
			this._errHandler.sync(this);
			switch ( this._interp.adaptivePredict(this._input, 41, this._ctx) ) {
			case 1:
				{
				this.state = 356;
				(localctx as VarAssignRuleContext)._type_ = this.typeDefine();
				}
				break;
			}
			this.state = 361;
			this._errHandler.sync(this);
			switch ( this._interp.adaptivePredict(this._input, 42, this._ctx) ) {
			case 1:
				{
				this.state = 359;
				this.match(GrammarParser.ASSIGN);
				this.state = 360;
				(localctx as VarAssignRuleContext)._expr = this.value(0);
				}
				break;
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public importStatement(): ImportStatementContext {
		let localctx: ImportStatementContext = new ImportStatementContext(this, this._ctx, this.state);
		this.enterRule(localctx, 22, GrammarParser.RULE_importStatement);
		try {
			localctx = new ImportRuleContext(this, localctx);
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 363;
			this.match(GrammarParser.IMPORT);
			this.state = 366;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case 28:
				{
				this.state = 364;
				(localctx as ImportRuleContext)._def = this.defaultImport();
				}
				break;
			case 38:
			case 62:
				{
				this.state = 365;
				(localctx as ImportRuleContext)._named = this.namedImports();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			this.state = 368;
			this.match(GrammarParser.FROM);
			this.state = 369;
			(localctx as ImportRuleContext)._path = this.match(GrammarParser.STRING);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public defaultImport(): DefaultImportContext {
		let localctx: DefaultImportContext = new DefaultImportContext(this, this._ctx, this.state);
		this.enterRule(localctx, 24, GrammarParser.RULE_defaultImport);
		try {
			localctx = new DefaultImportRuleContext(this, localctx);
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 371;
			(localctx as DefaultImportRuleContext)._id = this.match(GrammarParser.ID);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public namedImports(): NamedImportsContext {
		let localctx: NamedImportsContext = new NamedImportsContext(this, this._ctx, this.state);
		this.enterRule(localctx, 26, GrammarParser.RULE_namedImports);
		let _la: number;
		try {
			localctx = new NamedImportsRuleContext(this, localctx);
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 373;
			_la = this._input.LA(1);
			if(!(_la===38 || _la===62)) {
			this._errHandler.recoverInline(this);
			}
			else {
				this._errHandler.reportMatch(this);
			    this.consume();
			}
			this.state = 374;
			(localctx as NamedImportsRuleContext)._importSpecifier = this.importSpecifier();
			(localctx as NamedImportsRuleContext)._imports.push((localctx as NamedImportsRuleContext)._importSpecifier);
			this.state = 379;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la===43) {
				{
				{
				this.state = 375;
				this.match(GrammarParser.COMMA);
				this.state = 376;
				(localctx as NamedImportsRuleContext)._importSpecifier = this.importSpecifier();
				(localctx as NamedImportsRuleContext)._imports.push((localctx as NamedImportsRuleContext)._importSpecifier);
				}
				}
				this.state = 381;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 382;
			_la = this._input.LA(1);
			if(!(_la===39 || _la===63)) {
			this._errHandler.recoverInline(this);
			}
			else {
				this._errHandler.reportMatch(this);
			    this.consume();
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public importSpecifier(): ImportSpecifierContext {
		let localctx: ImportSpecifierContext = new ImportSpecifierContext(this, this._ctx, this.state);
		this.enterRule(localctx, 28, GrammarParser.RULE_importSpecifier);
		let _la: number;
		try {
			localctx = new ImportSpecifierRuleContext(this, localctx);
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 384;
			(localctx as ImportSpecifierRuleContext)._name = this.match(GrammarParser.ID);
			this.state = 387;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la===23) {
				{
				this.state = 385;
				this.match(GrammarParser.AS);
				this.state = 386;
				(localctx as ImportSpecifierRuleContext)._alias = this.match(GrammarParser.ID);
				}
			}

			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public exportStatement(): ExportStatementContext {
		let localctx: ExportStatementContext = new ExportStatementContext(this, this._ctx, this.state);
		this.enterRule(localctx, 30, GrammarParser.RULE_exportStatement);
		try {
			localctx = new ExportRuleContext(this, localctx);
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 389;
			this.match(GrammarParser.EXPORT);
			this.state = 393;
			this._errHandler.sync(this);
			switch ( this._interp.adaptivePredict(this._input, 46, this._ctx) ) {
			case 1:
				{
				this.state = 390;
				(localctx as ExportRuleContext)._cls = this.classDeclaration();
				}
				break;
			case 2:
				{
				this.state = 391;
				(localctx as ExportRuleContext)._val = this.value(0);
				}
				break;
			case 3:
				{
				this.state = 392;
				(localctx as ExportRuleContext)._func = this.functionBody();
				}
				break;
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public classDeclaration(): ClassDeclarationContext {
		let localctx: ClassDeclarationContext = new ClassDeclarationContext(this, this._ctx, this.state);
		this.enterRule(localctx, 32, GrammarParser.RULE_classDeclaration);
		try {
			localctx = new ClassDeclarationRuleContext(this, localctx);
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 395;
			this.match(GrammarParser.CLASS);
			this.state = 396;
			(localctx as ClassDeclarationRuleContext)._name = this.match(GrammarParser.ID);
			this.state = 397;
			(localctx as ClassDeclarationRuleContext)._body = this.classBody();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public classBody(): ClassBodyContext {
		let localctx: ClassBodyContext = new ClassBodyContext(this, this._ctx, this.state);
		this.enterRule(localctx, 34, GrammarParser.RULE_classBody);
		let _la: number;
		try {
			localctx = new ClassBodyRuleContext(this, localctx);
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 399;
			this.match(GrammarParser.LBRACE);
			this.state = 403;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & 960) !== 0)) {
				{
				{
				this.state = 400;
				(localctx as ClassBodyRuleContext)._classBodyStatement = this.classBodyStatement();
				(localctx as ClassBodyRuleContext)._stmts.push((localctx as ClassBodyRuleContext)._classBodyStatement);
				}
				}
				this.state = 405;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 406;
			this.match(GrammarParser.RBRACE);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public classBodyStatement(): ClassBodyStatementContext {
		let localctx: ClassBodyStatementContext = new ClassBodyStatementContext(this, this._ctx, this.state);
		this.enterRule(localctx, 36, GrammarParser.RULE_classBodyStatement);
		try {
			this.state = 410;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case 6:
			case 7:
			case 8:
				localctx = new ClassVarDeclContext(this, localctx);
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 408;
				(localctx as ClassVarDeclContext)._var_ = this.variableDeclaration();
				}
				break;
			case 9:
				localctx = new ClassFuncDeclContext(this, localctx);
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 409;
				(localctx as ClassFuncDeclContext)._func = this.functionDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public componentStatement(): ComponentStatementContext {
		let localctx: ComponentStatementContext = new ComponentStatementContext(this, this._ctx, this.state);
		this.enterRule(localctx, 38, GrammarParser.RULE_componentStatement);
		let _la: number;
		try {
			localctx = new ComponentRuleContext(this, localctx);
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 412;
			this.match(GrammarParser.COMPONENT);
			this.state = 413;
			this.match(GrammarParser.LPAREN);
			this.state = 414;
			this.match(GrammarParser.LBRACE);
			this.state = 419;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la===20) {
				{
				this.state = 415;
				this.match(GrammarParser.SELECTOR);
				this.state = 416;
				this.match(GrammarParser.COLON);
				this.state = 417;
				(localctx as ComponentRuleContext)._selector = this.match(GrammarParser.STRING);
				this.state = 418;
				this.match(GrammarParser.COMMA);
				}
			}

			this.state = 421;
			this.match(GrammarParser.TEMPLATE);
			this.state = 422;
			this.match(GrammarParser.COLON);
			this.state = 423;
			(localctx as ComponentRuleContext)._template = this.value(0);
			this.state = 430;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la===43) {
				{
				{
				this.state = 424;
				this.match(GrammarParser.COMMA);
				this.state = 425;
				(localctx as ComponentRuleContext)._ID = this.match(GrammarParser.ID);
				(localctx as ComponentRuleContext)._keys.push((localctx as ComponentRuleContext)._ID);
				this.state = 426;
				this.match(GrammarParser.COLON);
				this.state = 427;
				(localctx as ComponentRuleContext)._value = this.value(0);
				(localctx as ComponentRuleContext)._vals.push((localctx as ComponentRuleContext)._value);
				}
				}
				this.state = 432;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 433;
			this.match(GrammarParser.RBRACE);
			this.state = 434;
			this.match(GrammarParser.RPAREN);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public typeDefine(): TypeDefineContext {
		let localctx: TypeDefineContext = new TypeDefineContext(this, this._ctx, this.state);
		this.enterRule(localctx, 40, GrammarParser.RULE_typeDefine);
		try {
			localctx = new TypeDefineRuleContext(this, localctx);
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 436;
			this.match(GrammarParser.COLON);
			this.state = 437;
			(localctx as TypeDefineRuleContext)._type_ = this.match(GrammarParser.ID);
			this.state = 440;
			this._errHandler.sync(this);
			switch ( this._interp.adaptivePredict(this._input, 51, this._ctx) ) {
			case 1:
				{
				this.state = 438;
				this.match(GrammarParser.LBRACKET);
				this.state = 439;
				this.match(GrammarParser.RBRACKET);
				}
				break;
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public typeDeclaration(): TypeDeclarationContext {
		let localctx: TypeDeclarationContext = new TypeDeclarationContext(this, this._ctx, this.state);
		this.enterRule(localctx, 42, GrammarParser.RULE_typeDeclaration);
		try {
			localctx = new TypeDeclarationRuleContext(this, localctx);
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 442;
			this.match(GrammarParser.TYPE);
			this.state = 443;
			(localctx as TypeDeclarationRuleContext)._name = this.match(GrammarParser.ID);
			this.state = 444;
			this.match(GrammarParser.ASSIGN);
			this.state = 445;
			(localctx as TypeDeclarationRuleContext)._typeValue = this.typeDeclarationValue();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public typeDeclarationValue(): TypeDeclarationValueContext {
		let localctx: TypeDeclarationValueContext = new TypeDeclarationValueContext(this, this._ctx, this.state);
		this.enterRule(localctx, 44, GrammarParser.RULE_typeDeclarationValue);
		try {
			this.state = 453;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case 28:
				localctx = new TypeSimpleContext(this, localctx);
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 447;
				(localctx as TypeSimpleContext)._type_ = this.match(GrammarParser.ID);
				this.state = 450;
				this._errHandler.sync(this);
				switch ( this._interp.adaptivePredict(this._input, 52, this._ctx) ) {
				case 1:
					{
					this.state = 448;
					this.match(GrammarParser.LBRACKET);
					this.state = 449;
					this.match(GrammarParser.RBRACKET);
					}
					break;
				}
				}
				break;
			case 38:
				localctx = new TypeObjectAssignContext(this, localctx);
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 452;
				(localctx as TypeObjectAssignContext)._obj = this.typeObject();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public typeObject(): TypeObjectContext {
		let localctx: TypeObjectContext = new TypeObjectContext(this, this._ctx, this.state);
		this.enterRule(localctx, 46, GrammarParser.RULE_typeObject);
		let _la: number;
		try {
			localctx = new TypeObjectRuleContext(this, localctx);
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 455;
			this.match(GrammarParser.LBRACE);
			this.state = 456;
			(localctx as TypeObjectRuleContext)._typeMember = this.typeMember();
			(localctx as TypeObjectRuleContext)._typeMembers.push((localctx as TypeObjectRuleContext)._typeMember);
			this.state = 460;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la===28) {
				{
				{
				this.state = 457;
				(localctx as TypeObjectRuleContext)._typeMember = this.typeMember();
				(localctx as TypeObjectRuleContext)._typeMembers.push((localctx as TypeObjectRuleContext)._typeMember);
				}
				}
				this.state = 462;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 463;
			this.match(GrammarParser.RBRACE);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public typeMember(): TypeMemberContext {
		let localctx: TypeMemberContext = new TypeMemberContext(this, this._ctx, this.state);
		this.enterRule(localctx, 48, GrammarParser.RULE_typeMember);
		try {
			localctx = new TypeMemberRuleContext(this, localctx);
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 465;
			(localctx as TypeMemberRuleContext)._name = this.match(GrammarParser.ID);
			this.state = 466;
			this.match(GrammarParser.COLON);
			this.state = 467;
			(localctx as TypeMemberRuleContext)._type_ = this.typeDeclarationValue();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public asType(): AsTypeContext {
		let localctx: AsTypeContext = new AsTypeContext(this, this._ctx, this.state);
		this.enterRule(localctx, 50, GrammarParser.RULE_asType);
		try {
			localctx = new AsTypeRuleContext(this, localctx);
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 469;
			this.match(GrammarParser.AS);
			this.state = 470;
			(localctx as AsTypeRuleContext)._type_ = this.match(GrammarParser.ID);
			this.state = 473;
			this._errHandler.sync(this);
			switch ( this._interp.adaptivePredict(this._input, 55, this._ctx) ) {
			case 1:
				{
				this.state = 471;
				this.match(GrammarParser.LBRACKET);
				this.state = 472;
				this.match(GrammarParser.RBRACKET);
				}
				break;
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}

	public value(): ValueContext;
	public value(_p: number): ValueContext;
	// @RuleVersion(0)
	public value(_p?: number): ValueContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let localctx: ValueContext = new ValueContext(this, this._ctx, _parentState);
		let _prevctx: ValueContext = localctx;
		let _startState: number = 52;
		this.enterRecursionRule(localctx, 52, GrammarParser.RULE_value, _p);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 532;
			this._errHandler.sync(this);
			switch ( this._interp.adaptivePredict(this._input, 65, this._ctx) ) {
			case 1:
				{
				localctx = new PrimaryValueExprContext(this, localctx);
				this._ctx = localctx;
				_prevctx = localctx;

				this.state = 476;
				(localctx as PrimaryValueExprContext)._pv = this.primaryValue();
				this.state = 478;
				this._errHandler.sync(this);
				switch ( this._interp.adaptivePredict(this._input, 56, this._ctx) ) {
				case 1:
					{
					this.state = 477;
					(localctx as PrimaryValueExprContext)._qm = this._input.LT(1);
					_la = this._input.LA(1);
					if(!(_la===55 || _la===56)) {
					    (localctx as PrimaryValueExprContext)._qm = this._errHandler.recoverInline(this);
					}
					else {
						this._errHandler.reportMatch(this);
					    this.consume();
					}
					}
					break;
				}
				this.state = 481;
				this._errHandler.sync(this);
				switch ( this._interp.adaptivePredict(this._input, 57, this._ctx) ) {
				case 1:
					{
					this.state = 480;
					(localctx as PrimaryValueExprContext)._type_ = this.asType();
					}
					break;
				}
				}
				break;
			case 2:
				{
				localctx = new ArrowFunctionValueContext(this, localctx);
				this._ctx = localctx;
				_prevctx = localctx;
				this.state = 483;
				this.match(GrammarParser.LPAREN);
				this.state = 484;
				(localctx as ArrowFunctionValueContext)._ID = this.match(GrammarParser.ID);
				(localctx as ArrowFunctionValueContext)._params.push((localctx as ArrowFunctionValueContext)._ID);
				this.state = 489;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la===43) {
					{
					{
					this.state = 485;
					this.match(GrammarParser.COMMA);
					this.state = 486;
					(localctx as ArrowFunctionValueContext)._ID = this.match(GrammarParser.ID);
					(localctx as ArrowFunctionValueContext)._params.push((localctx as ArrowFunctionValueContext)._ID);
					}
					}
					this.state = 491;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 492;
				this.match(GrammarParser.RPAREN);
				this.state = 493;
				this.match(GrammarParser.ARROW);
				this.state = 503;
				this._errHandler.sync(this);
				switch ( this._interp.adaptivePredict(this._input, 60, this._ctx) ) {
				case 1:
					{
					this.state = 494;
					this.match(GrammarParser.LBRACE);
					this.state = 498;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while ((((_la) & ~0x1F) === 0 && ((1 << _la) & 2099933168) !== 0) || ((((_la - 38)) & ~0x1F) === 0 && ((1 << (_la - 38)) & 231052309) !== 0)) {
						{
						{
						this.state = 495;
						(localctx as ArrowFunctionValueContext)._statement = this.statement();
						(localctx as ArrowFunctionValueContext)._stmts.push((localctx as ArrowFunctionValueContext)._statement);
						}
						}
						this.state = 500;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					this.state = 501;
					this.match(GrammarParser.RBRACE);
					}
					break;
				case 2:
					{
					this.state = 502;
					this.value(0);
					}
					break;
				}
				}
				break;
			case 3:
				{
				localctx = new ArrowFunctionValueContext(this, localctx);
				this._ctx = localctx;
				_prevctx = localctx;
				this.state = 505;
				(localctx as ArrowFunctionValueContext)._param = this.match(GrammarParser.ID);
				this.state = 506;
				this.match(GrammarParser.ARROW);
				this.state = 516;
				this._errHandler.sync(this);
				switch ( this._interp.adaptivePredict(this._input, 62, this._ctx) ) {
				case 1:
					{
					this.state = 507;
					this.match(GrammarParser.LBRACE);
					this.state = 511;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while ((((_la) & ~0x1F) === 0 && ((1 << _la) & 2099933168) !== 0) || ((((_la - 38)) & ~0x1F) === 0 && ((1 << (_la - 38)) & 231052309) !== 0)) {
						{
						{
						this.state = 508;
						(localctx as ArrowFunctionValueContext)._statement = this.statement();
						(localctx as ArrowFunctionValueContext)._stmts.push((localctx as ArrowFunctionValueContext)._statement);
						}
						}
						this.state = 513;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					this.state = 514;
					this.match(GrammarParser.RBRACE);
					}
					break;
				case 2:
					{
					this.state = 515;
					this.value(0);
					}
					break;
				}
				}
				break;
			case 4:
				{
				localctx = new ArrowFunctionValueContext(this, localctx);
				this._ctx = localctx;
				_prevctx = localctx;
				this.state = 518;
				this.match(GrammarParser.LPAREN);
				this.state = 519;
				this.match(GrammarParser.RPAREN);
				this.state = 520;
				this.match(GrammarParser.ARROW);
				this.state = 530;
				this._errHandler.sync(this);
				switch ( this._interp.adaptivePredict(this._input, 64, this._ctx) ) {
				case 1:
					{
					this.state = 521;
					this.match(GrammarParser.LBRACE);
					this.state = 525;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while ((((_la) & ~0x1F) === 0 && ((1 << _la) & 2099933168) !== 0) || ((((_la - 38)) & ~0x1F) === 0 && ((1 << (_la - 38)) & 231052309) !== 0)) {
						{
						{
						this.state = 522;
						(localctx as ArrowFunctionValueContext)._statement = this.statement();
						(localctx as ArrowFunctionValueContext)._stmts.push((localctx as ArrowFunctionValueContext)._statement);
						}
						}
						this.state = 527;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					this.state = 528;
					this.match(GrammarParser.RBRACE);
					}
					break;
				case 2:
					{
					this.state = 529;
					this.value(0);
					}
					break;
				}
				}
				break;
			}
			this._ctx.stop = this._input.LT(-1);
			this.state = 555;
			this._errHandler.sync(this);
			_alt = this._interp.adaptivePredict(this._input, 68, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = localctx;
					{
					this.state = 553;
					this._errHandler.sync(this);
					switch ( this._interp.adaptivePredict(this._input, 67, this._ctx) ) {
					case 1:
						{
						localctx = new BinaryValueContext(this, new ValueContext(this, _parentctx, _parentState));
						(localctx as BinaryValueContext)._left = _prevctx;
						this.pushNewRecursionContext(localctx, _startState, GrammarParser.RULE_value);
						this.state = 534;
						if (!(this.precpred(this._ctx, 7))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 7)");
						}
						this.state = 535;
						(localctx as BinaryValueContext)._op = this.binaryOp();
						this.state = 536;
						(localctx as BinaryValueContext)._right = this.value(8);
						}
						break;
					case 2:
						{
						localctx = new PropertyAccessValueContext(this, new ValueContext(this, _parentctx, _parentState));
						(localctx as PropertyAccessValueContext)._left = _prevctx;
						this.pushNewRecursionContext(localctx, _startState, GrammarParser.RULE_value);
						this.state = 538;
						if (!(this.precpred(this._ctx, 5))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 5)");
						}
						this.state = 539;
						this.match(GrammarParser.DOT);
						this.state = 540;
						(localctx as PropertyAccessValueContext)._right = this.value(6);
						}
						break;
					case 3:
						{
						localctx = new MethodCallValueContext(this, new ValueContext(this, _parentctx, _parentState));
						(localctx as MethodCallValueContext)._left = _prevctx;
						this.pushNewRecursionContext(localctx, _startState, GrammarParser.RULE_value);
						this.state = 541;
						if (!(this.precpred(this._ctx, 4))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 4)");
						}
						this.state = 542;
						this.match(GrammarParser.LPAREN);
						this.state = 543;
						(localctx as MethodCallValueContext)._value = this.value(0);
						(localctx as MethodCallValueContext)._args.push((localctx as MethodCallValueContext)._value);
						this.state = 548;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						while (_la===43) {
							{
							{
							this.state = 544;
							this.match(GrammarParser.COMMA);
							this.state = 545;
							(localctx as MethodCallValueContext)._value = this.value(0);
							(localctx as MethodCallValueContext)._args.push((localctx as MethodCallValueContext)._value);
							}
							}
							this.state = 550;
							this._errHandler.sync(this);
							_la = this._input.LA(1);
						}
						this.state = 551;
						this.match(GrammarParser.RPAREN);
						}
						break;
					}
					}
				}
				this.state = 557;
				this._errHandler.sync(this);
				_alt = this._interp.adaptivePredict(this._input, 68, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return localctx;
	}
	// @RuleVersion(0)
	public primaryValue(): PrimaryValueContext {
		let localctx: PrimaryValueContext = new PrimaryValueContext(this, this._ctx, this.state);
		this.enterRule(localctx, 54, GrammarParser.RULE_primaryValue);
		let _la: number;
		try {
			this.state = 584;
			this._errHandler.sync(this);
			switch ( this._interp.adaptivePredict(this._input, 70, this._ctx) ) {
			case 1:
				localctx = new NumberValueContext(this, localctx);
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 558;
				(localctx as NumberValueContext)._num = this.match(GrammarParser.NUMBER);
				}
				break;
			case 2:
				localctx = new StringValueContext(this, localctx);
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 559;
				(localctx as StringValueContext)._str = this.match(GrammarParser.STRING);
				}
				break;
			case 3:
				localctx = new CallValueContext(this, localctx);
				this.enterOuterAlt(localctx, 3);
				{
				this.state = 560;
				(localctx as CallValueContext)._call = this.functionCall();
				}
				break;
			case 4:
				localctx = new TrueValueContext(this, localctx);
				this.enterOuterAlt(localctx, 4);
				{
				this.state = 561;
				this.match(GrammarParser.TRUE);
				}
				break;
			case 5:
				localctx = new FalseValueContext(this, localctx);
				this.enterOuterAlt(localctx, 5);
				{
				this.state = 562;
				this.match(GrammarParser.FALSE);
				}
				break;
			case 6:
				localctx = new IdValueContext(this, localctx);
				this.enterOuterAlt(localctx, 6);
				{
				this.state = 563;
				(localctx as IdValueContext)._id = this.match(GrammarParser.ID);
				}
				break;
			case 7:
				localctx = new ParenValueContext(this, localctx);
				this.enterOuterAlt(localctx, 7);
				{
				this.state = 564;
				this.match(GrammarParser.LPAREN);
				this.state = 565;
				(localctx as ParenValueContext)._inner = this.value(0);
				this.state = 566;
				this.match(GrammarParser.RPAREN);
				}
				break;
			case 8:
				localctx = new ObjectValueContext(this, localctx);
				this.enterOuterAlt(localctx, 8);
				{
				this.state = 568;
				(localctx as ObjectValueContext)._obj = this.object();
				}
				break;
			case 9:
				localctx = new ArrayValueContext(this, localctx);
				this.enterOuterAlt(localctx, 9);
				{
				this.state = 569;
				(localctx as ArrayValueContext)._arr = this.array();
				}
				break;
			case 10:
				localctx = new ArrayAccessValueContext(this, localctx);
				this.enterOuterAlt(localctx, 10);
				{
				this.state = 570;
				(localctx as ArrayAccessValueContext)._access = this.arrayAccess();
				}
				break;
			case 11:
				localctx = new FunctionValueContext(this, localctx);
				this.enterOuterAlt(localctx, 11);
				{
				this.state = 571;
				(localctx as FunctionValueContext)._body = this.functionBody();
				}
				break;
			case 12:
				localctx = new IncValueContext(this, localctx);
				this.enterOuterAlt(localctx, 12);
				{
				this.state = 572;
				(localctx as IncValueContext)._inc = this.increase_variable();
				}
				break;
			case 13:
				localctx = new DecValueContext(this, localctx);
				this.enterOuterAlt(localctx, 13);
				{
				this.state = 573;
				(localctx as DecValueContext)._dec = this.decrease_variable();
				}
				break;
			case 14:
				localctx = new NegationValueContext(this, localctx);
				this.enterOuterAlt(localctx, 14);
				{
				this.state = 574;
				this.match(GrammarParser.EMARK);
				this.state = 575;
				(localctx as NegationValueContext)._right = this.value(0);
				}
				break;
			case 15:
				localctx = new TemplateValueContext(this, localctx);
				this.enterOuterAlt(localctx, 15);
				{
				this.state = 576;
				(localctx as TemplateValueContext)._bt = this._input.LT(1);
				_la = this._input.LA(1);
				if(!(_la===60 || _la===64)) {
				    (localctx as TemplateValueContext)._bt = this._errHandler.recoverInline(this);
				}
				else {
					this._errHandler.reportMatch(this);
				    this.consume();
				}
				this.state = 580;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (((((_la - 50)) & ~0x1F) === 0 && ((1 << (_la - 50)) & 38913) !== 0)) {
					{
					{
					this.state = 577;
					(localctx as TemplateValueContext)._html = this.html();
					(localctx as TemplateValueContext)._content.push((localctx as TemplateValueContext)._html);
					}
					}
					this.state = 582;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 583;
				_la = this._input.LA(1);
				if(!(_la===60 || _la===64)) {
				this._errHandler.recoverInline(this);
				}
				else {
					this._errHandler.reportMatch(this);
				    this.consume();
				}
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public binaryOp(): BinaryOpContext {
		let localctx: BinaryOpContext = new BinaryOpContext(this, this._ctx, this.state);
		this.enterRule(localctx, 56, GrammarParser.RULE_binaryOp);
		let _la: number;
		try {
			this.state = 604;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case 35:
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 586;
				this.match(GrammarParser.DOUBLE_ASSIGN);
				}
				break;
			case 37:
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 587;
				this.match(GrammarParser.DOUBLE_ASSIGN_ID);
				}
				break;
			case 36:
				this.enterOuterAlt(localctx, 3);
				{
				this.state = 588;
				this.match(GrammarParser.NOT_EQUAL);
				}
				break;
			case 58:
				this.enterOuterAlt(localctx, 4);
				{
				this.state = 589;
				this.match(GrammarParser.OR);
				}
				break;
			case 59:
				this.enterOuterAlt(localctx, 5);
				{
				this.state = 590;
				this.match(GrammarParser.AND);
				}
				break;
			case 57:
				this.enterOuterAlt(localctx, 6);
				{
				this.state = 591;
				this.match(GrammarParser.DOUBLE_QMARK);
				}
				break;
			case 51:
				this.enterOuterAlt(localctx, 7);
				{
				{
				this.state = 592;
				this.match(GrammarParser.RTAG);
				this.state = 594;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la===31 || _la===35) {
					{
					this.state = 593;
					_la = this._input.LA(1);
					if(!(_la===31 || _la===35)) {
					this._errHandler.recoverInline(this);
					}
					else {
						this._errHandler.reportMatch(this);
					    this.consume();
					}
					}
				}

				}
				}
				break;
			case 50:
			case 61:
				this.enterOuterAlt(localctx, 8);
				{
				{
				this.state = 596;
				_la = this._input.LA(1);
				if(!(_la===50 || _la===61)) {
				this._errHandler.recoverInline(this);
				}
				else {
					this._errHandler.reportMatch(this);
				    this.consume();
				}
				this.state = 598;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la===31 || _la===35) {
					{
					this.state = 597;
					_la = this._input.LA(1);
					if(!(_la===31 || _la===35)) {
					this._errHandler.recoverInline(this);
					}
					else {
						this._errHandler.reportMatch(this);
					    this.consume();
					}
					}
				}

				}
				}
				break;
			case 32:
				this.enterOuterAlt(localctx, 9);
				{
				this.state = 600;
				this.match(GrammarParser.PLUS);
				}
				break;
			case 33:
				this.enterOuterAlt(localctx, 10);
				{
				this.state = 601;
				this.match(GrammarParser.MINUS);
				}
				break;
			case 34:
				this.enterOuterAlt(localctx, 11);
				{
				this.state = 602;
				this.match(GrammarParser.MULT);
				}
				break;
			case 52:
				this.enterOuterAlt(localctx, 12);
				{
				this.state = 603;
				this.match(GrammarParser.SLASH);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public increase_variable(): Increase_variableContext {
		let localctx: Increase_variableContext = new Increase_variableContext(this, this._ctx, this.state);
		this.enterRule(localctx, 58, GrammarParser.RULE_increase_variable);
		try {
			this.state = 610;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case 28:
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 606;
				localctx._id = this.match(GrammarParser.ID);
				this.state = 607;
				this.match(GrammarParser.PLUSPLUS);
				}
				break;
			case 53:
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 608;
				this.match(GrammarParser.PLUSPLUS);
				this.state = 609;
				localctx._id = this.match(GrammarParser.ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public decrease_variable(): Decrease_variableContext {
		let localctx: Decrease_variableContext = new Decrease_variableContext(this, this._ctx, this.state);
		this.enterRule(localctx, 60, GrammarParser.RULE_decrease_variable);
		try {
			this.state = 616;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case 28:
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 612;
				localctx._id = this.match(GrammarParser.ID);
				this.state = 613;
				this.match(GrammarParser.MINUSMINUS);
				}
				break;
			case 54:
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 614;
				this.match(GrammarParser.MINUSMINUS);
				this.state = 615;
				localctx._id = this.match(GrammarParser.ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public comparison(): ComparisonContext {
		let localctx: ComparisonContext = new ComparisonContext(this, this._ctx, this.state);
		this.enterRule(localctx, 62, GrammarParser.RULE_comparison);
		let _la: number;
		try {
			this.state = 634;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case 37:
				localctx = new IdEqComparisonContext(this, localctx);
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 618;
				this.match(GrammarParser.DOUBLE_ASSIGN_ID);
				this.state = 619;
				(localctx as IdEqComparisonContext)._right = this.value(0);
				}
				break;
			case 35:
				localctx = new EqComparisonContext(this, localctx);
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 620;
				this.match(GrammarParser.DOUBLE_ASSIGN);
				this.state = 621;
				(localctx as EqComparisonContext)._right = this.value(0);
				}
				break;
			case 36:
				localctx = new NeqComparisonContext(this, localctx);
				this.enterOuterAlt(localctx, 3);
				{
				this.state = 622;
				this.match(GrammarParser.NOT_EQUAL);
				this.state = 623;
				(localctx as NeqComparisonContext)._right = this.value(0);
				}
				break;
			case 51:
				localctx = new RtagComparisonContext(this, localctx);
				this.enterOuterAlt(localctx, 4);
				{
				this.state = 624;
				this.match(GrammarParser.RTAG);
				this.state = 626;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la===31 || _la===35) {
					{
					this.state = 625;
					_la = this._input.LA(1);
					if(!(_la===31 || _la===35)) {
					this._errHandler.recoverInline(this);
					}
					else {
						this._errHandler.reportMatch(this);
					    this.consume();
					}
					}
				}

				this.state = 628;
				(localctx as RtagComparisonContext)._right = this.value(0);
				}
				break;
			case 50:
			case 61:
				localctx = new LtagComparisonContext(this, localctx);
				this.enterOuterAlt(localctx, 5);
				{
				this.state = 629;
				_la = this._input.LA(1);
				if(!(_la===50 || _la===61)) {
				this._errHandler.recoverInline(this);
				}
				else {
					this._errHandler.reportMatch(this);
				    this.consume();
				}
				this.state = 631;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la===31 || _la===35) {
					{
					this.state = 630;
					_la = this._input.LA(1);
					if(!(_la===31 || _la===35)) {
					this._errHandler.recoverInline(this);
					}
					else {
						this._errHandler.reportMatch(this);
					    this.consume();
					}
					}
				}

				this.state = 633;
				(localctx as LtagComparisonContext)._right = this.value(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public object(): ObjectContext {
		let localctx: ObjectContext = new ObjectContext(this, this._ctx, this.state);
		this.enterRule(localctx, 64, GrammarParser.RULE_object);
		try {
			let _alt: number;
			localctx = new ObjectRuleContext(this, localctx);
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 636;
			this.match(GrammarParser.LBRACE);
			this.state = 637;
			(localctx as ObjectRuleContext)._pair = this.pair();
			(localctx as ObjectRuleContext)._pairs.push((localctx as ObjectRuleContext)._pair);
			this.state = 642;
			this._errHandler.sync(this);
			_alt = this._interp.adaptivePredict(this._input, 79, this._ctx);
			while (_alt !== 1 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1 + 1) {
					{
					{
					this.state = 638;
					this.match(GrammarParser.COMMA);
					this.state = 639;
					(localctx as ObjectRuleContext)._pair = this.pair();
					(localctx as ObjectRuleContext)._pairs.push((localctx as ObjectRuleContext)._pair);
					}
					}
				}
				this.state = 644;
				this._errHandler.sync(this);
				_alt = this._interp.adaptivePredict(this._input, 79, this._ctx);
			}
			this.state = 645;
			this.match(GrammarParser.RBRACE);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public pair(): PairContext {
		let localctx: PairContext = new PairContext(this, this._ctx, this.state);
		this.enterRule(localctx, 66, GrammarParser.RULE_pair);
		try {
			localctx = new PairRuleContext(this, localctx);
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 647;
			(localctx as PairRuleContext)._key = this.match(GrammarParser.ID);
			this.state = 648;
			this.match(GrammarParser.COLON);
			this.state = 649;
			(localctx as PairRuleContext)._val = this.value(0);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public array(): ArrayContext {
		let localctx: ArrayContext = new ArrayContext(this, this._ctx, this.state);
		this.enterRule(localctx, 68, GrammarParser.RULE_array);
		let _la: number;
		try {
			localctx = new ArrayRuleContext(this, localctx);
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 651;
			this.match(GrammarParser.LBRACKET);
			this.state = 660;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if ((((_la) & ~0x1F) === 0 && ((1 << _la) & 2080374784) !== 0) || ((((_la - 38)) & ~0x1F) === 0 && ((1 << (_la - 38)) & 71664661) !== 0)) {
				{
				this.state = 652;
				(localctx as ArrayRuleContext)._value = this.value(0);
				(localctx as ArrayRuleContext)._elems.push((localctx as ArrayRuleContext)._value);
				this.state = 657;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la===43) {
					{
					{
					this.state = 653;
					this.match(GrammarParser.COMMA);
					this.state = 654;
					(localctx as ArrayRuleContext)._value = this.value(0);
					(localctx as ArrayRuleContext)._elems.push((localctx as ArrayRuleContext)._value);
					}
					}
					this.state = 659;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				}
			}

			this.state = 662;
			this.match(GrammarParser.RBRACKET);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public arrayAccess(): ArrayAccessContext {
		let localctx: ArrayAccessContext = new ArrayAccessContext(this, this._ctx, this.state);
		this.enterRule(localctx, 70, GrammarParser.RULE_arrayAccess);
		try {
			localctx = new ArrayAccessRuleContext(this, localctx);
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 664;
			(localctx as ArrayAccessRuleContext)._arr = this.match(GrammarParser.ID);
			this.state = 665;
			this.match(GrammarParser.LBRACKET);
			this.state = 666;
			(localctx as ArrayAccessRuleContext)._idx = this.value(0);
			this.state = 667;
			this.match(GrammarParser.RBRACKET);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public htmlElementName(): HtmlElementNameContext {
		let localctx: HtmlElementNameContext = new HtmlElementNameContext(this, this._ctx, this.state);
		this.enterRule(localctx, 72, GrammarParser.RULE_htmlElementName);
		let _la: number;
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 669;
			_la = this._input.LA(1);
			if(!(_la===28 || ((((_la - 67)) & ~0x1F) === 0 && ((1 << (_la - 67)) & 16383) !== 0))) {
			this._errHandler.recoverInline(this);
			}
			else {
				this._errHandler.reportMatch(this);
			    this.consume();
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public open_tag(): Open_tagContext {
		let localctx: Open_tagContext = new Open_tagContext(this, this._ctx, this.state);
		this.enterRule(localctx, 74, GrammarParser.RULE_open_tag);
		let _la: number;
		try {
			localctx = new OpenTagRuleContext(this, localctx);
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 671;
			_la = this._input.LA(1);
			if(!(_la===50 || _la===61)) {
			this._errHandler.recoverInline(this);
			}
			else {
				this._errHandler.reportMatch(this);
			    this.consume();
			}
			this.state = 672;
			(localctx as OpenTagRuleContext)._name = this.htmlElementName();
			this.state = 676;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & 268435470) !== 0)) {
				{
				{
				this.state = 673;
				this.attributes();
				}
				}
				this.state = 678;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 679;
			this.match(GrammarParser.RTAG);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public attributes(): AttributesContext {
		let localctx: AttributesContext = new AttributesContext(this, this._ctx, this.state);
		this.enterRule(localctx, 76, GrammarParser.RULE_attributes);
		try {
			let _alt: number;
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 682;
			this._errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					this.state = 681;
					this.attribute();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				this.state = 684;
				this._errHandler.sync(this);
				_alt = this._interp.adaptivePredict(this._input, 83, this._ctx);
			} while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public attribute(): AttributeContext {
		let localctx: AttributeContext = new AttributeContext(this, this._ctx, this.state);
		this.enterRule(localctx, 78, GrammarParser.RULE_attribute);
		try {
			this.state = 706;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case 1:
				localctx = new NgForAttributeRuleContext(this, localctx);
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 686;
				this.match(GrammarParser.NG_FOR);
				this.state = 687;
				this.match(GrammarParser.ASSIGN);
				this.state = 688;
				this.match(GrammarParser.BACKTICK);
				this.state = 689;
				this.match(GrammarParser.LET);
				this.state = 690;
				(localctx as NgForAttributeRuleContext)._varName = this.match(GrammarParser.ID);
				this.state = 691;
				this.match(GrammarParser.OF);
				this.state = 692;
				(localctx as NgForAttributeRuleContext)._collection = this.match(GrammarParser.ID);
				this.state = 693;
				this.match(GrammarParser.BACKTICK);
				}
				break;
			case 2:
				localctx = new NgIfAttributeRuleContext(this, localctx);
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 694;
				this.match(GrammarParser.NG_IF);
				this.state = 695;
				this.match(GrammarParser.ASSIGN);
				this.state = 696;
				this.match(GrammarParser.BACKTICK);
				this.state = 697;
				(localctx as NgIfAttributeRuleContext)._condition = this.value(0);
				this.state = 698;
				this.match(GrammarParser.BACKTICK);
				}
				break;
			case 3:
				localctx = new ClickEventAttributeRuleContext(this, localctx);
				this.enterOuterAlt(localctx, 3);
				{
				this.state = 700;
				this.match(GrammarParser.CLICK_EVENT);
				this.state = 701;
				this.match(GrammarParser.ASSIGN);
				this.state = 702;
				(localctx as ClickEventAttributeRuleContext)._val = this.attributeValue();
				}
				break;
			case 28:
				localctx = new RegularAttributeContext(this, localctx);
				this.enterOuterAlt(localctx, 4);
				{
				this.state = 703;
				(localctx as RegularAttributeContext)._name = this.match(GrammarParser.ID);
				this.state = 704;
				this.match(GrammarParser.ASSIGN);
				this.state = 705;
				(localctx as RegularAttributeContext)._val = this.attributeValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public attributeValue(): AttributeValueContext {
		let localctx: AttributeValueContext = new AttributeValueContext(this, this._ctx, this.state);
		this.enterRule(localctx, 80, GrammarParser.RULE_attributeValue);
		try {
			this.state = 711;
			this._errHandler.sync(this);
			switch ( this._interp.adaptivePredict(this._input, 85, this._ctx) ) {
			case 1:
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 708;
				this.match(GrammarParser.STRING);
				}
				break;
			case 2:
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 709;
				this.interpolation();
				}
				break;
			case 3:
				this.enterOuterAlt(localctx, 3);
				{
				this.state = 710;
				this.value(0);
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public interpolation(): InterpolationContext {
		let localctx: InterpolationContext = new InterpolationContext(this, this._ctx, this.state);
		this.enterRule(localctx, 82, GrammarParser.RULE_interpolation);
		let _la: number;
		try {
			this.state = 741;
			this._errHandler.sync(this);
			switch ( this._interp.adaptivePredict(this._input, 91, this._ctx) ) {
			case 1:
				localctx = new SimpleInterpolationContext(this, localctx);
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 716;
				this._errHandler.sync(this);
				switch (this._input.LA(1)) {
				case 62:
					{
					this.state = 713;
					this.match(GrammarParser.LBRACE_HTML);
					}
					break;
				case 38:
					{
					{
					this.state = 714;
					this.match(GrammarParser.LBRACE);
					this.state = 715;
					this.match(GrammarParser.LBRACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				this.state = 718;
				(localctx as SimpleInterpolationContext)._expr = this.value(0);
				this.state = 722;
				this._errHandler.sync(this);
				switch (this._input.LA(1)) {
				case 63:
					{
					this.state = 719;
					this.match(GrammarParser.RBRACE_HTML);
					}
					break;
				case 39:
					{
					{
					this.state = 720;
					this.match(GrammarParser.RBRACE);
					this.state = 721;
					this.match(GrammarParser.RBRACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				localctx = new NestedTemplateInterpolationContext(this, localctx);
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 727;
				this._errHandler.sync(this);
				switch (this._input.LA(1)) {
				case 62:
					{
					this.state = 724;
					this.match(GrammarParser.LBRACE_HTML);
					}
					break;
				case 38:
					{
					{
					this.state = 725;
					this.match(GrammarParser.LBRACE);
					this.state = 726;
					this.match(GrammarParser.LBRACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				this.state = 729;
				this.match(GrammarParser.LBRACE_HTML);
				this.state = 733;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (((((_la - 50)) & ~0x1F) === 0 && ((1 << (_la - 50)) & 38913) !== 0)) {
					{
					{
					this.state = 730;
					(localctx as NestedTemplateInterpolationContext)._html = this.html();
					(localctx as NestedTemplateInterpolationContext)._nested.push((localctx as NestedTemplateInterpolationContext)._html);
					}
					}
					this.state = 735;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 739;
				this._errHandler.sync(this);
				switch (this._input.LA(1)) {
				case 63:
					{
					this.state = 736;
					this.match(GrammarParser.RBRACE_HTML);
					}
					break;
				case 39:
					{
					{
					this.state = 737;
					this.match(GrammarParser.RBRACE);
					this.state = 738;
					this.match(GrammarParser.RBRACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public close_tag(): Close_tagContext {
		let localctx: Close_tagContext = new Close_tagContext(this, this._ctx, this.state);
		this.enterRule(localctx, 84, GrammarParser.RULE_close_tag);
		let _la: number;
		try {
			localctx = new CloseTagRuleContext(this, localctx);
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 743;
			_la = this._input.LA(1);
			if(!(_la===50 || _la===61)) {
			this._errHandler.recoverInline(this);
			}
			else {
				this._errHandler.reportMatch(this);
			    this.consume();
			}
			this.state = 744;
			this.match(GrammarParser.SLASH);
			this.state = 745;
			(localctx as CloseTagRuleContext)._name = this.htmlElementName();
			this.state = 746;
			this.match(GrammarParser.RTAG);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public single_tag(): Single_tagContext {
		let localctx: Single_tagContext = new Single_tagContext(this, this._ctx, this.state);
		this.enterRule(localctx, 86, GrammarParser.RULE_single_tag);
		let _la: number;
		try {
			localctx = new SingleTagRuleContext(this, localctx);
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 748;
			_la = this._input.LA(1);
			if(!(_la===50 || _la===61)) {
			this._errHandler.recoverInline(this);
			}
			else {
				this._errHandler.reportMatch(this);
			    this.consume();
			}
			this.state = 749;
			(localctx as SingleTagRuleContext)._name = this.htmlElementName();
			this.state = 750;
			this.match(GrammarParser.SLASH);
			this.state = 751;
			this.match(GrammarParser.RTAG);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public html(): HtmlContext {
		let localctx: HtmlContext = new HtmlContext(this, this._ctx, this.state);
		this.enterRule(localctx, 88, GrammarParser.RULE_html);
		let _la: number;
		try {
			let _alt: number;
			this.state = 776;
			this._errHandler.sync(this);
			switch ( this._interp.adaptivePredict(this._input, 95, this._ctx) ) {
			case 1:
				localctx = new HtmlElementContext(this, localctx);
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 753;
				(localctx as HtmlElementContext)._open = this.open_tag();
				this.state = 757;
				this._errHandler.sync(this);
				_alt = this._interp.adaptivePredict(this._input, 92, this._ctx);
				while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
					if (_alt === 1) {
						{
						{
						this.state = 754;
						(localctx as HtmlElementContext)._html = this.html();
						(localctx as HtmlElementContext)._inner.push((localctx as HtmlElementContext)._html);
						}
						}
					}
					this.state = 759;
					this._errHandler.sync(this);
					_alt = this._interp.adaptivePredict(this._input, 92, this._ctx);
				}
				this.state = 760;
				(localctx as HtmlElementContext)._close = this.close_tag();
				}
				break;
			case 2:
				localctx = new HtmlSingleContext(this, localctx);
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 762;
				(localctx as HtmlSingleContext)._single = this.single_tag();
				}
				break;
			case 3:
				localctx = new HtmlBlockContext(this, localctx);
				this.enterOuterAlt(localctx, 3);
				{
				this.state = 763;
				(localctx as HtmlBlockContext)._block = this.match(GrammarParser.LBRACE_HTML);
				this.state = 767;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while ((((_la) & ~0x1F) === 0 && ((1 << _la) & 2099933168) !== 0) || ((((_la - 38)) & ~0x1F) === 0 && ((1 << (_la - 38)) & 231052309) !== 0)) {
					{
					{
					this.state = 764;
					(localctx as HtmlBlockContext)._statement = this.statement();
					(localctx as HtmlBlockContext)._stmts.push((localctx as HtmlBlockContext)._statement);
					}
					}
					this.state = 769;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 773;
				this._errHandler.sync(this);
				switch (this._input.LA(1)) {
				case 63:
					{
					this.state = 770;
					this.match(GrammarParser.RBRACE_HTML);
					}
					break;
				case 39:
					{
					{
					this.state = 771;
					this.match(GrammarParser.RBRACE);
					this.state = 772;
					this.match(GrammarParser.RBRACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				localctx = new HtmlTextContext(this, localctx);
				this.enterOuterAlt(localctx, 4);
				{
				this.state = 775;
				(localctx as HtmlTextContext)._text = this.match(GrammarParser.TEXT_HTML);
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}

	public sempred(localctx: RuleContext, ruleIndex: number, predIndex: number): boolean {
		switch (ruleIndex) {
		case 26:
			return this.value_sempred(localctx as ValueContext, predIndex);
		}
		return true;
	}
	private value_sempred(localctx: ValueContext, predIndex: number): boolean {
		switch (predIndex) {
		case 0:
			return this.precpred(this._ctx, 7);
		case 1:
			return this.precpred(this._ctx, 5);
		case 2:
			return this.precpred(this._ctx, 4);
		}
		return true;
	}

	public static readonly _serializedATN: number[] = [4,1,80,779,2,0,7,0,2,
	1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,
	10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,2,14,7,14,2,15,7,15,2,16,7,16,2,17,
	7,17,2,18,7,18,2,19,7,19,2,20,7,20,2,21,7,21,2,22,7,22,2,23,7,23,2,24,7,
	24,2,25,7,25,2,26,7,26,2,27,7,27,2,28,7,28,2,29,7,29,2,30,7,30,2,31,7,31,
	2,32,7,32,2,33,7,33,2,34,7,34,2,35,7,35,2,36,7,36,2,37,7,37,2,38,7,38,2,
	39,7,39,2,40,7,40,2,41,7,41,2,42,7,42,2,43,7,43,2,44,7,44,1,0,4,0,92,8,
	0,11,0,12,0,93,1,1,1,1,3,1,98,8,1,1,1,1,1,3,1,102,8,1,1,1,1,1,3,1,106,8,
	1,1,1,1,1,3,1,110,8,1,1,1,1,1,3,1,114,8,1,1,1,1,1,3,1,118,8,1,1,1,1,1,3,
	1,122,8,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,3,1,132,8,1,3,1,134,8,1,1,2,1,
	2,1,2,1,3,1,3,1,3,1,3,1,3,5,3,144,8,3,10,3,12,3,147,9,3,1,3,1,3,1,3,5,3,
	152,8,3,10,3,12,3,155,9,3,1,3,1,3,1,4,1,4,1,4,5,4,162,8,4,10,4,12,4,165,
	9,4,1,4,1,4,1,4,5,4,170,8,4,10,4,12,4,173,9,4,1,4,3,4,176,8,4,1,5,1,5,1,
	5,5,5,181,8,5,10,5,12,5,184,9,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,
	1,5,1,5,5,5,198,8,5,10,5,12,5,201,9,5,1,5,1,5,3,5,205,8,5,1,5,1,5,1,5,3,
	5,210,8,5,1,5,1,5,3,5,214,8,5,1,5,1,5,3,5,218,8,5,1,5,1,5,1,5,5,5,223,8,
	5,10,5,12,5,226,9,5,1,5,1,5,1,5,1,5,1,5,1,5,3,5,234,8,5,1,5,1,5,3,5,238,
	8,5,1,5,1,5,1,5,5,5,243,8,5,10,5,12,5,246,9,5,1,5,1,5,1,5,1,5,1,5,1,5,1,
	5,1,5,1,5,1,5,5,5,258,8,5,10,5,12,5,261,9,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,
	1,5,1,5,1,5,5,5,273,8,5,10,5,12,5,276,9,5,1,5,1,5,3,5,280,8,5,1,6,1,6,1,
	6,1,6,1,6,1,6,5,6,288,8,6,10,6,12,6,291,9,6,3,6,293,8,6,1,6,1,6,1,6,1,7,
	3,7,299,8,7,1,7,1,7,5,7,303,8,7,10,7,12,7,306,9,7,1,7,1,7,1,7,1,7,1,7,5,
	7,313,8,7,10,7,12,7,316,9,7,3,7,318,8,7,1,7,1,7,3,7,322,8,7,1,7,3,7,325,
	8,7,1,7,1,7,1,7,5,7,330,8,7,10,7,12,7,333,9,7,3,7,335,8,7,3,7,337,8,7,1,
	8,1,8,1,8,1,8,1,8,5,8,344,8,8,10,8,12,8,347,9,8,3,8,349,8,8,1,8,1,8,1,9,
	1,9,1,9,1,10,1,10,3,10,358,8,10,1,10,1,10,3,10,362,8,10,1,11,1,11,1,11,
	3,11,367,8,11,1,11,1,11,1,11,1,12,1,12,1,13,1,13,1,13,1,13,5,13,378,8,13,
	10,13,12,13,381,9,13,1,13,1,13,1,14,1,14,1,14,3,14,388,8,14,1,15,1,15,1,
	15,1,15,3,15,394,8,15,1,16,1,16,1,16,1,16,1,17,1,17,5,17,402,8,17,10,17,
	12,17,405,9,17,1,17,1,17,1,18,1,18,3,18,411,8,18,1,19,1,19,1,19,1,19,1,
	19,1,19,1,19,3,19,420,8,19,1,19,1,19,1,19,1,19,1,19,1,19,1,19,5,19,429,
	8,19,10,19,12,19,432,9,19,1,19,1,19,1,19,1,20,1,20,1,20,1,20,3,20,441,8,
	20,1,21,1,21,1,21,1,21,1,21,1,22,1,22,1,22,3,22,451,8,22,1,22,3,22,454,
	8,22,1,23,1,23,1,23,5,23,459,8,23,10,23,12,23,462,9,23,1,23,1,23,1,24,1,
	24,1,24,1,24,1,25,1,25,1,25,1,25,3,25,474,8,25,1,26,1,26,1,26,3,26,479,
	8,26,1,26,3,26,482,8,26,1,26,1,26,1,26,1,26,5,26,488,8,26,10,26,12,26,491,
	9,26,1,26,1,26,1,26,1,26,5,26,497,8,26,10,26,12,26,500,9,26,1,26,1,26,3,
	26,504,8,26,1,26,1,26,1,26,1,26,5,26,510,8,26,10,26,12,26,513,9,26,1,26,
	1,26,3,26,517,8,26,1,26,1,26,1,26,1,26,1,26,5,26,524,8,26,10,26,12,26,527,
	9,26,1,26,1,26,3,26,531,8,26,3,26,533,8,26,1,26,1,26,1,26,1,26,1,26,1,26,
	1,26,1,26,1,26,1,26,1,26,1,26,5,26,547,8,26,10,26,12,26,550,9,26,1,26,1,
	26,5,26,554,8,26,10,26,12,26,557,9,26,1,27,1,27,1,27,1,27,1,27,1,27,1,27,
	1,27,1,27,1,27,1,27,1,27,1,27,1,27,1,27,1,27,1,27,1,27,1,27,1,27,5,27,579,
	8,27,10,27,12,27,582,9,27,1,27,3,27,585,8,27,1,28,1,28,1,28,1,28,1,28,1,
	28,1,28,1,28,3,28,595,8,28,1,28,1,28,3,28,599,8,28,1,28,1,28,1,28,1,28,
	3,28,605,8,28,1,29,1,29,1,29,1,29,3,29,611,8,29,1,30,1,30,1,30,1,30,3,30,
	617,8,30,1,31,1,31,1,31,1,31,1,31,1,31,1,31,1,31,3,31,627,8,31,1,31,1,31,
	1,31,3,31,632,8,31,1,31,3,31,635,8,31,1,32,1,32,1,32,1,32,5,32,641,8,32,
	10,32,12,32,644,9,32,1,32,1,32,1,33,1,33,1,33,1,33,1,34,1,34,1,34,1,34,
	5,34,656,8,34,10,34,12,34,659,9,34,3,34,661,8,34,1,34,1,34,1,35,1,35,1,
	35,1,35,1,35,1,36,1,36,1,37,1,37,1,37,5,37,675,8,37,10,37,12,37,678,9,37,
	1,37,1,37,1,38,4,38,683,8,38,11,38,12,38,684,1,39,1,39,1,39,1,39,1,39,1,
	39,1,39,1,39,1,39,1,39,1,39,1,39,1,39,1,39,1,39,1,39,1,39,1,39,1,39,1,39,
	3,39,707,8,39,1,40,1,40,1,40,3,40,712,8,40,1,41,1,41,1,41,3,41,717,8,41,
	1,41,1,41,1,41,1,41,3,41,723,8,41,1,41,1,41,1,41,3,41,728,8,41,1,41,1,41,
	5,41,732,8,41,10,41,12,41,735,9,41,1,41,1,41,1,41,3,41,740,8,41,3,41,742,
	8,41,1,42,1,42,1,42,1,42,1,42,1,43,1,43,1,43,1,43,1,43,1,44,1,44,5,44,756,
	8,44,10,44,12,44,759,9,44,1,44,1,44,1,44,1,44,1,44,5,44,766,8,44,10,44,
	12,44,769,9,44,1,44,1,44,1,44,3,44,774,8,44,1,44,3,44,777,8,44,1,44,1,642,
	1,52,45,0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40,42,44,
	46,48,50,52,54,56,58,60,62,64,66,68,70,72,74,76,78,80,82,84,86,88,0,9,1,
	0,35,37,2,0,38,38,62,62,2,0,39,39,63,63,1,0,6,8,1,0,55,56,2,0,60,60,64,
	64,2,0,31,31,35,35,2,0,50,50,61,61,2,0,28,28,67,80,880,0,91,1,0,0,0,2,133,
	1,0,0,0,4,135,1,0,0,0,6,138,1,0,0,0,8,158,1,0,0,0,10,279,1,0,0,0,12,281,
	1,0,0,0,14,336,1,0,0,0,16,338,1,0,0,0,18,352,1,0,0,0,20,355,1,0,0,0,22,
	363,1,0,0,0,24,371,1,0,0,0,26,373,1,0,0,0,28,384,1,0,0,0,30,389,1,0,0,0,
	32,395,1,0,0,0,34,399,1,0,0,0,36,410,1,0,0,0,38,412,1,0,0,0,40,436,1,0,
	0,0,42,442,1,0,0,0,44,453,1,0,0,0,46,455,1,0,0,0,48,465,1,0,0,0,50,469,
	1,0,0,0,52,532,1,0,0,0,54,584,1,0,0,0,56,604,1,0,0,0,58,610,1,0,0,0,60,
	616,1,0,0,0,62,634,1,0,0,0,64,636,1,0,0,0,66,647,1,0,0,0,68,651,1,0,0,0,
	70,664,1,0,0,0,72,669,1,0,0,0,74,671,1,0,0,0,76,682,1,0,0,0,78,706,1,0,
	0,0,80,711,1,0,0,0,82,741,1,0,0,0,84,743,1,0,0,0,86,748,1,0,0,0,88,776,
	1,0,0,0,90,92,3,2,1,0,91,90,1,0,0,0,92,93,1,0,0,0,93,91,1,0,0,0,93,94,1,
	0,0,0,94,1,1,0,0,0,95,97,3,12,6,0,96,98,5,44,0,0,97,96,1,0,0,0,97,98,1,
	0,0,0,98,134,1,0,0,0,99,101,3,16,8,0,100,102,5,44,0,0,101,100,1,0,0,0,101,
	102,1,0,0,0,102,134,1,0,0,0,103,105,3,18,9,0,104,106,5,44,0,0,105,104,1,
	0,0,0,105,106,1,0,0,0,106,134,1,0,0,0,107,109,3,20,10,0,108,110,5,44,0,
	0,109,108,1,0,0,0,109,110,1,0,0,0,110,134,1,0,0,0,111,113,3,52,26,0,112,
	114,5,44,0,0,113,112,1,0,0,0,113,114,1,0,0,0,114,134,1,0,0,0,115,117,3,
	88,44,0,116,118,5,44,0,0,117,116,1,0,0,0,117,118,1,0,0,0,118,134,1,0,0,
	0,119,121,3,4,2,0,120,122,5,44,0,0,121,120,1,0,0,0,121,122,1,0,0,0,122,
	134,1,0,0,0,123,134,3,8,4,0,124,134,3,22,11,0,125,134,3,10,5,0,126,134,
	3,38,19,0,127,134,3,32,16,0,128,134,3,30,15,0,129,131,3,42,21,0,130,132,
	5,44,0,0,131,130,1,0,0,0,131,132,1,0,0,0,132,134,1,0,0,0,133,95,1,0,0,0,
	133,99,1,0,0,0,133,103,1,0,0,0,133,107,1,0,0,0,133,111,1,0,0,0,133,115,
	1,0,0,0,133,119,1,0,0,0,133,123,1,0,0,0,133,124,1,0,0,0,133,125,1,0,0,0,
	133,126,1,0,0,0,133,127,1,0,0,0,133,128,1,0,0,0,133,129,1,0,0,0,134,3,1,
	0,0,0,135,136,5,10,0,0,136,137,3,52,26,0,137,5,1,0,0,0,138,139,5,11,0,0,
	139,140,5,48,0,0,140,145,3,52,26,0,141,142,7,0,0,0,142,144,3,52,26,0,143,
	141,1,0,0,0,144,147,1,0,0,0,145,143,1,0,0,0,145,146,1,0,0,0,146,148,1,0,
	0,0,147,145,1,0,0,0,148,149,5,49,0,0,149,153,5,38,0,0,150,152,3,2,1,0,151,
	150,1,0,0,0,152,155,1,0,0,0,153,151,1,0,0,0,153,154,1,0,0,0,154,156,1,0,
	0,0,155,153,1,0,0,0,156,157,5,39,0,0,157,7,1,0,0,0,158,163,3,6,3,0,159,
	160,5,12,0,0,160,162,3,6,3,0,161,159,1,0,0,0,162,165,1,0,0,0,163,161,1,
	0,0,0,163,164,1,0,0,0,164,175,1,0,0,0,165,163,1,0,0,0,166,167,5,12,0,0,
	167,171,5,38,0,0,168,170,3,2,1,0,169,168,1,0,0,0,170,173,1,0,0,0,171,169,
	1,0,0,0,171,172,1,0,0,0,172,174,1,0,0,0,173,171,1,0,0,0,174,176,5,39,0,
	0,175,166,1,0,0,0,175,176,1,0,0,0,176,9,1,0,0,0,177,178,5,17,0,0,178,182,
	5,38,0,0,179,181,3,2,1,0,180,179,1,0,0,0,181,184,1,0,0,0,182,180,1,0,0,
	0,182,183,1,0,0,0,183,185,1,0,0,0,184,182,1,0,0,0,185,186,5,39,0,0,186,
	187,5,14,0,0,187,188,5,48,0,0,188,189,3,52,26,0,189,190,5,49,0,0,190,280,
	1,0,0,0,191,192,5,14,0,0,192,193,5,48,0,0,193,194,3,52,26,0,194,204,5,49,
	0,0,195,199,7,1,0,0,196,198,3,2,1,0,197,196,1,0,0,0,198,201,1,0,0,0,199,
	197,1,0,0,0,199,200,1,0,0,0,200,202,1,0,0,0,201,199,1,0,0,0,202,205,7,2,
	0,0,203,205,3,2,1,0,204,195,1,0,0,0,204,203,1,0,0,0,205,280,1,0,0,0,206,
	207,5,13,0,0,207,209,5,48,0,0,208,210,3,20,10,0,209,208,1,0,0,0,209,210,
	1,0,0,0,210,211,1,0,0,0,211,213,5,44,0,0,212,214,3,52,26,0,213,212,1,0,
	0,0,213,214,1,0,0,0,214,215,1,0,0,0,215,217,5,44,0,0,216,218,3,52,26,0,
	217,216,1,0,0,0,217,218,1,0,0,0,218,219,1,0,0,0,219,220,5,49,0,0,220,224,
	5,38,0,0,221,223,3,2,1,0,222,221,1,0,0,0,223,226,1,0,0,0,224,222,1,0,0,
	0,224,225,1,0,0,0,225,227,1,0,0,0,226,224,1,0,0,0,227,280,5,39,0,0,228,
	229,5,13,0,0,229,230,5,48,0,0,230,231,3,18,9,0,231,233,5,44,0,0,232,234,
	3,52,26,0,233,232,1,0,0,0,233,234,1,0,0,0,234,235,1,0,0,0,235,237,5,44,
	0,0,236,238,3,52,26,0,237,236,1,0,0,0,237,238,1,0,0,0,238,239,1,0,0,0,239,
	240,5,49,0,0,240,244,5,38,0,0,241,243,3,2,1,0,242,241,1,0,0,0,243,246,1,
	0,0,0,244,242,1,0,0,0,244,245,1,0,0,0,245,247,1,0,0,0,246,244,1,0,0,0,247,
	248,5,39,0,0,248,280,1,0,0,0,249,250,5,13,0,0,250,251,5,48,0,0,251,252,
	3,52,26,0,252,253,5,18,0,0,253,254,3,52,26,0,254,255,5,49,0,0,255,259,5,
	38,0,0,256,258,3,2,1,0,257,256,1,0,0,0,258,261,1,0,0,0,259,257,1,0,0,0,
	259,260,1,0,0,0,260,262,1,0,0,0,261,259,1,0,0,0,262,263,5,39,0,0,263,280,
	1,0,0,0,264,265,5,13,0,0,265,266,5,48,0,0,266,267,3,18,9,0,267,268,5,18,
	0,0,268,269,3,52,26,0,269,270,5,49,0,0,270,274,5,38,0,0,271,273,3,2,1,0,
	272,271,1,0,0,0,273,276,1,0,0,0,274,272,1,0,0,0,274,275,1,0,0,0,275,277,
	1,0,0,0,276,274,1,0,0,0,277,278,5,39,0,0,278,280,1,0,0,0,279,177,1,0,0,
	0,279,191,1,0,0,0,279,206,1,0,0,0,279,228,1,0,0,0,279,249,1,0,0,0,279,264,
	1,0,0,0,280,11,1,0,0,0,281,282,5,9,0,0,282,283,5,28,0,0,283,292,5,48,0,
	0,284,289,5,28,0,0,285,286,5,43,0,0,286,288,5,28,0,0,287,285,1,0,0,0,288,
	291,1,0,0,0,289,287,1,0,0,0,289,290,1,0,0,0,290,293,1,0,0,0,291,289,1,0,
	0,0,292,284,1,0,0,0,292,293,1,0,0,0,293,294,1,0,0,0,294,295,5,49,0,0,295,
	296,3,14,7,0,296,13,1,0,0,0,297,299,3,40,20,0,298,297,1,0,0,0,298,299,1,
	0,0,0,299,300,1,0,0,0,300,304,5,38,0,0,301,303,3,2,1,0,302,301,1,0,0,0,
	303,306,1,0,0,0,304,302,1,0,0,0,304,305,1,0,0,0,305,307,1,0,0,0,306,304,
	1,0,0,0,307,337,5,39,0,0,308,317,5,48,0,0,309,314,5,28,0,0,310,311,5,43,
	0,0,311,313,5,28,0,0,312,310,1,0,0,0,313,316,1,0,0,0,314,312,1,0,0,0,314,
	315,1,0,0,0,315,318,1,0,0,0,316,314,1,0,0,0,317,309,1,0,0,0,317,318,1,0,
	0,0,318,319,1,0,0,0,319,322,5,49,0,0,320,322,5,28,0,0,321,308,1,0,0,0,321,
	320,1,0,0,0,322,324,1,0,0,0,323,325,3,40,20,0,324,323,1,0,0,0,324,325,1,
	0,0,0,325,326,1,0,0,0,326,334,5,15,0,0,327,335,3,52,26,0,328,330,3,2,1,
	0,329,328,1,0,0,0,330,333,1,0,0,0,331,329,1,0,0,0,331,332,1,0,0,0,332,335,
	1,0,0,0,333,331,1,0,0,0,334,327,1,0,0,0,334,331,1,0,0,0,335,337,1,0,0,0,
	336,298,1,0,0,0,336,321,1,0,0,0,337,15,1,0,0,0,338,339,5,28,0,0,339,348,
	5,48,0,0,340,345,3,52,26,0,341,342,5,43,0,0,342,344,3,52,26,0,343,341,1,
	0,0,0,344,347,1,0,0,0,345,343,1,0,0,0,345,346,1,0,0,0,346,349,1,0,0,0,347,
	345,1,0,0,0,348,340,1,0,0,0,348,349,1,0,0,0,349,350,1,0,0,0,350,351,5,49,
	0,0,351,17,1,0,0,0,352,353,7,3,0,0,353,354,3,20,10,0,354,19,1,0,0,0,355,
	357,5,28,0,0,356,358,3,40,20,0,357,356,1,0,0,0,357,358,1,0,0,0,358,361,
	1,0,0,0,359,360,5,31,0,0,360,362,3,52,26,0,361,359,1,0,0,0,361,362,1,0,
	0,0,362,21,1,0,0,0,363,366,5,4,0,0,364,367,3,24,12,0,365,367,3,26,13,0,
	366,364,1,0,0,0,366,365,1,0,0,0,367,368,1,0,0,0,368,369,5,16,0,0,369,370,
	5,30,0,0,370,23,1,0,0,0,371,372,5,28,0,0,372,25,1,0,0,0,373,374,7,1,0,0,
	374,379,3,28,14,0,375,376,5,43,0,0,376,378,3,28,14,0,377,375,1,0,0,0,378,
	381,1,0,0,0,379,377,1,0,0,0,379,380,1,0,0,0,380,382,1,0,0,0,381,379,1,0,
	0,0,382,383,7,2,0,0,383,27,1,0,0,0,384,387,5,28,0,0,385,386,5,23,0,0,386,
	388,5,28,0,0,387,385,1,0,0,0,387,388,1,0,0,0,388,29,1,0,0,0,389,393,5,19,
	0,0,390,394,3,32,16,0,391,394,3,52,26,0,392,394,3,14,7,0,393,390,1,0,0,
	0,393,391,1,0,0,0,393,392,1,0,0,0,394,31,1,0,0,0,395,396,5,5,0,0,396,397,
	5,28,0,0,397,398,3,34,17,0,398,33,1,0,0,0,399,403,5,38,0,0,400,402,3,36,
	18,0,401,400,1,0,0,0,402,405,1,0,0,0,403,401,1,0,0,0,403,404,1,0,0,0,404,
	406,1,0,0,0,405,403,1,0,0,0,406,407,5,39,0,0,407,35,1,0,0,0,408,411,3,18,
	9,0,409,411,3,12,6,0,410,408,1,0,0,0,410,409,1,0,0,0,411,37,1,0,0,0,412,
	413,5,21,0,0,413,414,5,48,0,0,414,419,5,38,0,0,415,416,5,20,0,0,416,417,
	5,42,0,0,417,418,5,30,0,0,418,420,5,43,0,0,419,415,1,0,0,0,419,420,1,0,
	0,0,420,421,1,0,0,0,421,422,5,22,0,0,422,423,5,42,0,0,423,430,3,52,26,0,
	424,425,5,43,0,0,425,426,5,28,0,0,426,427,5,42,0,0,427,429,3,52,26,0,428,
	424,1,0,0,0,429,432,1,0,0,0,430,428,1,0,0,0,430,431,1,0,0,0,431,433,1,0,
	0,0,432,430,1,0,0,0,433,434,5,39,0,0,434,435,5,49,0,0,435,39,1,0,0,0,436,
	437,5,42,0,0,437,440,5,28,0,0,438,439,5,40,0,0,439,441,5,41,0,0,440,438,
	1,0,0,0,440,441,1,0,0,0,441,41,1,0,0,0,442,443,5,24,0,0,443,444,5,28,0,
	0,444,445,5,31,0,0,445,446,3,44,22,0,446,43,1,0,0,0,447,450,5,28,0,0,448,
	449,5,40,0,0,449,451,5,41,0,0,450,448,1,0,0,0,450,451,1,0,0,0,451,454,1,
	0,0,0,452,454,3,46,23,0,453,447,1,0,0,0,453,452,1,0,0,0,454,45,1,0,0,0,
	455,456,5,38,0,0,456,460,3,48,24,0,457,459,3,48,24,0,458,457,1,0,0,0,459,
	462,1,0,0,0,460,458,1,0,0,0,460,461,1,0,0,0,461,463,1,0,0,0,462,460,1,0,
	0,0,463,464,5,39,0,0,464,47,1,0,0,0,465,466,5,28,0,0,466,467,5,42,0,0,467,
	468,3,44,22,0,468,49,1,0,0,0,469,470,5,23,0,0,470,473,5,28,0,0,471,472,
	5,40,0,0,472,474,5,41,0,0,473,471,1,0,0,0,473,474,1,0,0,0,474,51,1,0,0,
	0,475,476,6,26,-1,0,476,478,3,54,27,0,477,479,7,4,0,0,478,477,1,0,0,0,478,
	479,1,0,0,0,479,481,1,0,0,0,480,482,3,50,25,0,481,480,1,0,0,0,481,482,1,
	0,0,0,482,533,1,0,0,0,483,484,5,48,0,0,484,489,5,28,0,0,485,486,5,43,0,
	0,486,488,5,28,0,0,487,485,1,0,0,0,488,491,1,0,0,0,489,487,1,0,0,0,489,
	490,1,0,0,0,490,492,1,0,0,0,491,489,1,0,0,0,492,493,5,49,0,0,493,503,5,
	15,0,0,494,498,5,38,0,0,495,497,3,2,1,0,496,495,1,0,0,0,497,500,1,0,0,0,
	498,496,1,0,0,0,498,499,1,0,0,0,499,501,1,0,0,0,500,498,1,0,0,0,501,504,
	5,39,0,0,502,504,3,52,26,0,503,494,1,0,0,0,503,502,1,0,0,0,504,533,1,0,
	0,0,505,506,5,28,0,0,506,516,5,15,0,0,507,511,5,38,0,0,508,510,3,2,1,0,
	509,508,1,0,0,0,510,513,1,0,0,0,511,509,1,0,0,0,511,512,1,0,0,0,512,514,
	1,0,0,0,513,511,1,0,0,0,514,517,5,39,0,0,515,517,3,52,26,0,516,507,1,0,
	0,0,516,515,1,0,0,0,517,533,1,0,0,0,518,519,5,48,0,0,519,520,5,49,0,0,520,
	530,5,15,0,0,521,525,5,38,0,0,522,524,3,2,1,0,523,522,1,0,0,0,524,527,1,
	0,0,0,525,523,1,0,0,0,525,526,1,0,0,0,526,528,1,0,0,0,527,525,1,0,0,0,528,
	531,5,39,0,0,529,531,3,52,26,0,530,521,1,0,0,0,530,529,1,0,0,0,531,533,
	1,0,0,0,532,475,1,0,0,0,532,483,1,0,0,0,532,505,1,0,0,0,532,518,1,0,0,0,
	533,555,1,0,0,0,534,535,10,7,0,0,535,536,3,56,28,0,536,537,3,52,26,8,537,
	554,1,0,0,0,538,539,10,5,0,0,539,540,5,45,0,0,540,554,3,52,26,6,541,542,
	10,4,0,0,542,543,5,48,0,0,543,548,3,52,26,0,544,545,5,43,0,0,545,547,3,
	52,26,0,546,544,1,0,0,0,547,550,1,0,0,0,548,546,1,0,0,0,548,549,1,0,0,0,
	549,551,1,0,0,0,550,548,1,0,0,0,551,552,5,49,0,0,552,554,1,0,0,0,553,534,
	1,0,0,0,553,538,1,0,0,0,553,541,1,0,0,0,554,557,1,0,0,0,555,553,1,0,0,0,
	555,556,1,0,0,0,556,53,1,0,0,0,557,555,1,0,0,0,558,585,5,29,0,0,559,585,
	5,30,0,0,560,585,3,16,8,0,561,585,5,26,0,0,562,585,5,27,0,0,563,585,5,28,
	0,0,564,565,5,48,0,0,565,566,3,52,26,0,566,567,5,49,0,0,567,585,1,0,0,0,
	568,585,3,64,32,0,569,585,3,68,34,0,570,585,3,70,35,0,571,585,3,14,7,0,
	572,585,3,58,29,0,573,585,3,60,30,0,574,575,5,56,0,0,575,585,3,52,26,0,
	576,580,7,5,0,0,577,579,3,88,44,0,578,577,1,0,0,0,579,582,1,0,0,0,580,578,
	1,0,0,0,580,581,1,0,0,0,581,583,1,0,0,0,582,580,1,0,0,0,583,585,7,5,0,0,
	584,558,1,0,0,0,584,559,1,0,0,0,584,560,1,0,0,0,584,561,1,0,0,0,584,562,
	1,0,0,0,584,563,1,0,0,0,584,564,1,0,0,0,584,568,1,0,0,0,584,569,1,0,0,0,
	584,570,1,0,0,0,584,571,1,0,0,0,584,572,1,0,0,0,584,573,1,0,0,0,584,574,
	1,0,0,0,584,576,1,0,0,0,585,55,1,0,0,0,586,605,5,35,0,0,587,605,5,37,0,
	0,588,605,5,36,0,0,589,605,5,58,0,0,590,605,5,59,0,0,591,605,5,57,0,0,592,
	594,5,51,0,0,593,595,7,6,0,0,594,593,1,0,0,0,594,595,1,0,0,0,595,605,1,
	0,0,0,596,598,7,7,0,0,597,599,7,6,0,0,598,597,1,0,0,0,598,599,1,0,0,0,599,
	605,1,0,0,0,600,605,5,32,0,0,601,605,5,33,0,0,602,605,5,34,0,0,603,605,
	5,52,0,0,604,586,1,0,0,0,604,587,1,0,0,0,604,588,1,0,0,0,604,589,1,0,0,
	0,604,590,1,0,0,0,604,591,1,0,0,0,604,592,1,0,0,0,604,596,1,0,0,0,604,600,
	1,0,0,0,604,601,1,0,0,0,604,602,1,0,0,0,604,603,1,0,0,0,605,57,1,0,0,0,
	606,607,5,28,0,0,607,611,5,53,0,0,608,609,5,53,0,0,609,611,5,28,0,0,610,
	606,1,0,0,0,610,608,1,0,0,0,611,59,1,0,0,0,612,613,5,28,0,0,613,617,5,54,
	0,0,614,615,5,54,0,0,615,617,5,28,0,0,616,612,1,0,0,0,616,614,1,0,0,0,617,
	61,1,0,0,0,618,619,5,37,0,0,619,635,3,52,26,0,620,621,5,35,0,0,621,635,
	3,52,26,0,622,623,5,36,0,0,623,635,3,52,26,0,624,626,5,51,0,0,625,627,7,
	6,0,0,626,625,1,0,0,0,626,627,1,0,0,0,627,628,1,0,0,0,628,635,3,52,26,0,
	629,631,7,7,0,0,630,632,7,6,0,0,631,630,1,0,0,0,631,632,1,0,0,0,632,633,
	1,0,0,0,633,635,3,52,26,0,634,618,1,0,0,0,634,620,1,0,0,0,634,622,1,0,0,
	0,634,624,1,0,0,0,634,629,1,0,0,0,635,63,1,0,0,0,636,637,5,38,0,0,637,642,
	3,66,33,0,638,639,5,43,0,0,639,641,3,66,33,0,640,638,1,0,0,0,641,644,1,
	0,0,0,642,643,1,0,0,0,642,640,1,0,0,0,643,645,1,0,0,0,644,642,1,0,0,0,645,
	646,5,39,0,0,646,65,1,0,0,0,647,648,5,28,0,0,648,649,5,42,0,0,649,650,3,
	52,26,0,650,67,1,0,0,0,651,660,5,40,0,0,652,657,3,52,26,0,653,654,5,43,
	0,0,654,656,3,52,26,0,655,653,1,0,0,0,656,659,1,0,0,0,657,655,1,0,0,0,657,
	658,1,0,0,0,658,661,1,0,0,0,659,657,1,0,0,0,660,652,1,0,0,0,660,661,1,0,
	0,0,661,662,1,0,0,0,662,663,5,41,0,0,663,69,1,0,0,0,664,665,5,28,0,0,665,
	666,5,40,0,0,666,667,3,52,26,0,667,668,5,41,0,0,668,71,1,0,0,0,669,670,
	7,8,0,0,670,73,1,0,0,0,671,672,7,7,0,0,672,676,3,72,36,0,673,675,3,76,38,
	0,674,673,1,0,0,0,675,678,1,0,0,0,676,674,1,0,0,0,676,677,1,0,0,0,677,679,
	1,0,0,0,678,676,1,0,0,0,679,680,5,51,0,0,680,75,1,0,0,0,681,683,3,78,39,
	0,682,681,1,0,0,0,683,684,1,0,0,0,684,682,1,0,0,0,684,685,1,0,0,0,685,77,
	1,0,0,0,686,687,5,1,0,0,687,688,5,31,0,0,688,689,5,60,0,0,689,690,5,7,0,
	0,690,691,5,28,0,0,691,692,5,25,0,0,692,693,5,28,0,0,693,707,5,60,0,0,694,
	695,5,2,0,0,695,696,5,31,0,0,696,697,5,60,0,0,697,698,3,52,26,0,698,699,
	5,60,0,0,699,707,1,0,0,0,700,701,5,3,0,0,701,702,5,31,0,0,702,707,3,80,
	40,0,703,704,5,28,0,0,704,705,5,31,0,0,705,707,3,80,40,0,706,686,1,0,0,
	0,706,694,1,0,0,0,706,700,1,0,0,0,706,703,1,0,0,0,707,79,1,0,0,0,708,712,
	5,30,0,0,709,712,3,82,41,0,710,712,3,52,26,0,711,708,1,0,0,0,711,709,1,
	0,0,0,711,710,1,0,0,0,712,81,1,0,0,0,713,717,5,62,0,0,714,715,5,38,0,0,
	715,717,5,38,0,0,716,713,1,0,0,0,716,714,1,0,0,0,717,718,1,0,0,0,718,722,
	3,52,26,0,719,723,5,63,0,0,720,721,5,39,0,0,721,723,5,39,0,0,722,719,1,
	0,0,0,722,720,1,0,0,0,723,742,1,0,0,0,724,728,5,62,0,0,725,726,5,38,0,0,
	726,728,5,38,0,0,727,724,1,0,0,0,727,725,1,0,0,0,728,729,1,0,0,0,729,733,
	5,62,0,0,730,732,3,88,44,0,731,730,1,0,0,0,732,735,1,0,0,0,733,731,1,0,
	0,0,733,734,1,0,0,0,734,739,1,0,0,0,735,733,1,0,0,0,736,740,5,63,0,0,737,
	738,5,39,0,0,738,740,5,39,0,0,739,736,1,0,0,0,739,737,1,0,0,0,740,742,1,
	0,0,0,741,716,1,0,0,0,741,727,1,0,0,0,742,83,1,0,0,0,743,744,7,7,0,0,744,
	745,5,52,0,0,745,746,3,72,36,0,746,747,5,51,0,0,747,85,1,0,0,0,748,749,
	7,7,0,0,749,750,3,72,36,0,750,751,5,52,0,0,751,752,5,51,0,0,752,87,1,0,
	0,0,753,757,3,74,37,0,754,756,3,88,44,0,755,754,1,0,0,0,756,759,1,0,0,0,
	757,755,1,0,0,0,757,758,1,0,0,0,758,760,1,0,0,0,759,757,1,0,0,0,760,761,
	3,84,42,0,761,777,1,0,0,0,762,777,3,86,43,0,763,767,5,62,0,0,764,766,3,
	2,1,0,765,764,1,0,0,0,766,769,1,0,0,0,767,765,1,0,0,0,767,768,1,0,0,0,768,
	773,1,0,0,0,769,767,1,0,0,0,770,774,5,63,0,0,771,772,5,39,0,0,772,774,5,
	39,0,0,773,770,1,0,0,0,773,771,1,0,0,0,774,777,1,0,0,0,775,777,5,65,0,0,
	776,753,1,0,0,0,776,762,1,0,0,0,776,763,1,0,0,0,776,775,1,0,0,0,777,89,
	1,0,0,0,96,93,97,101,105,109,113,117,121,131,133,145,153,163,171,175,182,
	199,204,209,213,217,224,233,237,244,259,274,279,289,292,298,304,314,317,
	321,324,331,334,336,345,348,357,361,366,379,387,393,403,410,419,430,440,
	450,453,460,473,478,481,489,498,503,511,516,525,530,532,548,553,555,580,
	584,594,598,604,610,616,626,631,634,642,657,660,676,684,706,711,716,722,
	727,733,739,741,757,767,773,776];

	private static __ATN: ATN;
	public static get _ATN(): ATN {
		if (!GrammarParser.__ATN) {
			GrammarParser.__ATN = new ATNDeserializer().deserialize(GrammarParser._serializedATN);
		}

		return GrammarParser.__ATN;
	}


	static DecisionsToDFA = GrammarParser._ATN.decisionToState.map( (ds: DecisionState, index: number) => new DFA(ds, index) );

}

export class ProgramContext extends ParserRuleContext {
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_program;
	}
	public override copyFrom(ctx: ProgramContext): void {
		super.copyFrom(ctx);
	}
}
export class ProgramRuleContext extends ProgramContext {
	public _statement!: StatementContext;
	public _statements: StatementContext[] = [];
	constructor(parser: GrammarParser, ctx: ProgramContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public statement_list(): StatementContext[] {
		return this.getTypedRuleContexts(StatementContext) as StatementContext[];
	}
	public statement(i: number): StatementContext {
		return this.getTypedRuleContext(StatementContext, i) as StatementContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterProgramRule) {
	 		listener.enterProgramRule(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitProgramRule) {
	 		listener.exitProgramRule(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitProgramRule) {
			return visitor.visitProgramRule(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class StatementContext extends ParserRuleContext {
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_statement;
	}
	public override copyFrom(ctx: StatementContext): void {
		super.copyFrom(ctx);
	}
}
export class StmtValueContext extends StatementContext {
	public _val!: ValueContext;
	constructor(parser: GrammarParser, ctx: StatementContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public value(): ValueContext {
		return this.getTypedRuleContext(ValueContext, 0) as ValueContext;
	}
	public SEMICOLON(): TerminalNode {
		return this.getToken(GrammarParser.SEMICOLON, 0);
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterStmtValue) {
	 		listener.enterStmtValue(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitStmtValue) {
	 		listener.exitStmtValue(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitStmtValue) {
			return visitor.visitStmtValue(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class StmtVarAssignContext extends StatementContext {
	public _varassign!: VariableAssignContext;
	constructor(parser: GrammarParser, ctx: StatementContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public variableAssign(): VariableAssignContext {
		return this.getTypedRuleContext(VariableAssignContext, 0) as VariableAssignContext;
	}
	public SEMICOLON(): TerminalNode {
		return this.getToken(GrammarParser.SEMICOLON, 0);
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterStmtVarAssign) {
	 		listener.enterStmtVarAssign(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitStmtVarAssign) {
	 		listener.exitStmtVarAssign(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitStmtVarAssign) {
			return visitor.visitStmtVarAssign(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class StmtFunctionDeclContext extends StatementContext {
	public _decl!: FunctionDeclarationContext;
	constructor(parser: GrammarParser, ctx: StatementContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public functionDeclaration(): FunctionDeclarationContext {
		return this.getTypedRuleContext(FunctionDeclarationContext, 0) as FunctionDeclarationContext;
	}
	public SEMICOLON(): TerminalNode {
		return this.getToken(GrammarParser.SEMICOLON, 0);
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterStmtFunctionDecl) {
	 		listener.enterStmtFunctionDecl(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitStmtFunctionDecl) {
	 		listener.exitStmtFunctionDecl(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitStmtFunctionDecl) {
			return visitor.visitStmtFunctionDecl(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class StmtHtmlContext extends StatementContext {
	public _h!: HtmlContext;
	constructor(parser: GrammarParser, ctx: StatementContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public html(): HtmlContext {
		return this.getTypedRuleContext(HtmlContext, 0) as HtmlContext;
	}
	public SEMICOLON(): TerminalNode {
		return this.getToken(GrammarParser.SEMICOLON, 0);
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterStmtHtml) {
	 		listener.enterStmtHtml(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitStmtHtml) {
	 		listener.exitStmtHtml(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitStmtHtml) {
			return visitor.visitStmtHtml(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class StmtIterationContext extends StatementContext {
	public _loop!: IterationStatementContext;
	constructor(parser: GrammarParser, ctx: StatementContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public iterationStatement(): IterationStatementContext {
		return this.getTypedRuleContext(IterationStatementContext, 0) as IterationStatementContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterStmtIteration) {
	 		listener.enterStmtIteration(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitStmtIteration) {
	 		listener.exitStmtIteration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitStmtIteration) {
			return visitor.visitStmtIteration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class StmtClassContext extends StatementContext {
	public _classDecl!: ClassDeclarationContext;
	constructor(parser: GrammarParser, ctx: StatementContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public classDeclaration(): ClassDeclarationContext {
		return this.getTypedRuleContext(ClassDeclarationContext, 0) as ClassDeclarationContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterStmtClass) {
	 		listener.enterStmtClass(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitStmtClass) {
	 		listener.exitStmtClass(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitStmtClass) {
			return visitor.visitStmtClass(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class StmtFunctionCallContext extends StatementContext {
	public _call!: FunctionCallContext;
	constructor(parser: GrammarParser, ctx: StatementContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public functionCall(): FunctionCallContext {
		return this.getTypedRuleContext(FunctionCallContext, 0) as FunctionCallContext;
	}
	public SEMICOLON(): TerminalNode {
		return this.getToken(GrammarParser.SEMICOLON, 0);
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterStmtFunctionCall) {
	 		listener.enterStmtFunctionCall(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitStmtFunctionCall) {
	 		listener.exitStmtFunctionCall(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitStmtFunctionCall) {
			return visitor.visitStmtFunctionCall(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class StmtImportContext extends StatementContext {
	public _imp!: ImportStatementContext;
	constructor(parser: GrammarParser, ctx: StatementContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public importStatement(): ImportStatementContext {
		return this.getTypedRuleContext(ImportStatementContext, 0) as ImportStatementContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterStmtImport) {
	 		listener.enterStmtImport(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitStmtImport) {
	 		listener.exitStmtImport(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitStmtImport) {
			return visitor.visitStmtImport(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class StmtTypeDeclContext extends StatementContext {
	public _typeDecl!: TypeDeclarationContext;
	constructor(parser: GrammarParser, ctx: StatementContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public typeDeclaration(): TypeDeclarationContext {
		return this.getTypedRuleContext(TypeDeclarationContext, 0) as TypeDeclarationContext;
	}
	public SEMICOLON(): TerminalNode {
		return this.getToken(GrammarParser.SEMICOLON, 0);
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterStmtTypeDecl) {
	 		listener.enterStmtTypeDecl(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitStmtTypeDecl) {
	 		listener.exitStmtTypeDecl(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitStmtTypeDecl) {
			return visitor.visitStmtTypeDecl(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class StmtIfContext extends StatementContext {
	public _ifstmt!: IfStatementContext;
	constructor(parser: GrammarParser, ctx: StatementContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public ifStatement(): IfStatementContext {
		return this.getTypedRuleContext(IfStatementContext, 0) as IfStatementContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterStmtIf) {
	 		listener.enterStmtIf(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitStmtIf) {
	 		listener.exitStmtIf(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitStmtIf) {
			return visitor.visitStmtIf(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class StmtComponentContext extends StatementContext {
	public _comp!: ComponentStatementContext;
	constructor(parser: GrammarParser, ctx: StatementContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public componentStatement(): ComponentStatementContext {
		return this.getTypedRuleContext(ComponentStatementContext, 0) as ComponentStatementContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterStmtComponent) {
	 		listener.enterStmtComponent(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitStmtComponent) {
	 		listener.exitStmtComponent(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitStmtComponent) {
			return visitor.visitStmtComponent(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class StmtVarDeclContext extends StatementContext {
	public _vardecl!: VariableDeclarationContext;
	constructor(parser: GrammarParser, ctx: StatementContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public variableDeclaration(): VariableDeclarationContext {
		return this.getTypedRuleContext(VariableDeclarationContext, 0) as VariableDeclarationContext;
	}
	public SEMICOLON(): TerminalNode {
		return this.getToken(GrammarParser.SEMICOLON, 0);
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterStmtVarDecl) {
	 		listener.enterStmtVarDecl(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitStmtVarDecl) {
	 		listener.exitStmtVarDecl(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitStmtVarDecl) {
			return visitor.visitStmtVarDecl(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class StmtExportContext extends StatementContext {
	public _exp!: ExportStatementContext;
	constructor(parser: GrammarParser, ctx: StatementContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public exportStatement(): ExportStatementContext {
		return this.getTypedRuleContext(ExportStatementContext, 0) as ExportStatementContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterStmtExport) {
	 		listener.enterStmtExport(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitStmtExport) {
	 		listener.exitStmtExport(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitStmtExport) {
			return visitor.visitStmtExport(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class StmtReturnContext extends StatementContext {
	public _ret!: ReturnContext;
	constructor(parser: GrammarParser, ctx: StatementContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public return_(): ReturnContext {
		return this.getTypedRuleContext(ReturnContext, 0) as ReturnContext;
	}
	public SEMICOLON(): TerminalNode {
		return this.getToken(GrammarParser.SEMICOLON, 0);
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterStmtReturn) {
	 		listener.enterStmtReturn(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitStmtReturn) {
	 		listener.exitStmtReturn(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitStmtReturn) {
			return visitor.visitStmtReturn(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ReturnContext extends ParserRuleContext {
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_return;
	}
	public override copyFrom(ctx: ReturnContext): void {
		super.copyFrom(ctx);
	}
}
export class ReturnRuleContext extends ReturnContext {
	public _expr!: ValueContext;
	constructor(parser: GrammarParser, ctx: ReturnContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public RETURN(): TerminalNode {
		return this.getToken(GrammarParser.RETURN, 0);
	}
	public value(): ValueContext {
		return this.getTypedRuleContext(ValueContext, 0) as ValueContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterReturnRule) {
	 		listener.enterReturnRule(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitReturnRule) {
	 		listener.exitReturnRule(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitReturnRule) {
			return visitor.visitReturnRule(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class IfBodyContext extends ParserRuleContext {
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_ifBody;
	}
	public override copyFrom(ctx: IfBodyContext): void {
		super.copyFrom(ctx);
	}
}
export class IfBodyRuleContext extends IfBodyContext {
	public _left!: ValueContext;
	public _DOUBLE_ASSIGN_ID!: Token;
	public _condOps: Token[] = [];
	public _NOT_EQUAL!: Token;
	public _DOUBLE_ASSIGN!: Token;
	public __tset214!: Token;
	public _value!: ValueContext;
	public _right: ValueContext[] = [];
	public _statement!: StatementContext;
	public _stmts: StatementContext[] = [];
	constructor(parser: GrammarParser, ctx: IfBodyContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public IF(): TerminalNode {
		return this.getToken(GrammarParser.IF, 0);
	}
	public LPAREN(): TerminalNode {
		return this.getToken(GrammarParser.LPAREN, 0);
	}
	public RPAREN(): TerminalNode {
		return this.getToken(GrammarParser.RPAREN, 0);
	}
	public LBRACE(): TerminalNode {
		return this.getToken(GrammarParser.LBRACE, 0);
	}
	public RBRACE(): TerminalNode {
		return this.getToken(GrammarParser.RBRACE, 0);
	}
	public value_list(): ValueContext[] {
		return this.getTypedRuleContexts(ValueContext) as ValueContext[];
	}
	public value(i: number): ValueContext {
		return this.getTypedRuleContext(ValueContext, i) as ValueContext;
	}
	public statement_list(): StatementContext[] {
		return this.getTypedRuleContexts(StatementContext) as StatementContext[];
	}
	public statement(i: number): StatementContext {
		return this.getTypedRuleContext(StatementContext, i) as StatementContext;
	}
	public DOUBLE_ASSIGN_ID_list(): TerminalNode[] {
	    	return this.getTokens(GrammarParser.DOUBLE_ASSIGN_ID);
	}
	public DOUBLE_ASSIGN_ID(i: number): TerminalNode {
		return this.getToken(GrammarParser.DOUBLE_ASSIGN_ID, i);
	}
	public NOT_EQUAL_list(): TerminalNode[] {
	    	return this.getTokens(GrammarParser.NOT_EQUAL);
	}
	public NOT_EQUAL(i: number): TerminalNode {
		return this.getToken(GrammarParser.NOT_EQUAL, i);
	}
	public DOUBLE_ASSIGN_list(): TerminalNode[] {
	    	return this.getTokens(GrammarParser.DOUBLE_ASSIGN);
	}
	public DOUBLE_ASSIGN(i: number): TerminalNode {
		return this.getToken(GrammarParser.DOUBLE_ASSIGN, i);
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterIfBodyRule) {
	 		listener.enterIfBodyRule(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitIfBodyRule) {
	 		listener.exitIfBodyRule(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitIfBodyRule) {
			return visitor.visitIfBodyRule(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class IfStatementContext extends ParserRuleContext {
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_ifStatement;
	}
	public override copyFrom(ctx: IfStatementContext): void {
		super.copyFrom(ctx);
	}
}
export class IfStatementRuleContext extends IfStatementContext {
	public _ifBody!: IfBodyContext;
	public _ifBlocks: IfBodyContext[] = [];
	public _elseIfs: IfBodyContext[] = [];
	public _elseBlock!: Token;
	public _statement!: StatementContext;
	public _elseStmts: StatementContext[] = [];
	constructor(parser: GrammarParser, ctx: IfStatementContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public ifBody_list(): IfBodyContext[] {
		return this.getTypedRuleContexts(IfBodyContext) as IfBodyContext[];
	}
	public ifBody(i: number): IfBodyContext {
		return this.getTypedRuleContext(IfBodyContext, i) as IfBodyContext;
	}
	public ELSE_list(): TerminalNode[] {
	    	return this.getTokens(GrammarParser.ELSE);
	}
	public ELSE(i: number): TerminalNode {
		return this.getToken(GrammarParser.ELSE, i);
	}
	public RBRACE(): TerminalNode {
		return this.getToken(GrammarParser.RBRACE, 0);
	}
	public LBRACE(): TerminalNode {
		return this.getToken(GrammarParser.LBRACE, 0);
	}
	public statement_list(): StatementContext[] {
		return this.getTypedRuleContexts(StatementContext) as StatementContext[];
	}
	public statement(i: number): StatementContext {
		return this.getTypedRuleContext(StatementContext, i) as StatementContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterIfStatementRule) {
	 		listener.enterIfStatementRule(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitIfStatementRule) {
	 		listener.exitIfStatementRule(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitIfStatementRule) {
			return visitor.visitIfStatementRule(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class IterationStatementContext extends ParserRuleContext {
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_iterationStatement;
	}
	public override copyFrom(ctx: IterationStatementContext): void {
		super.copyFrom(ctx);
	}
}
export class ForInLoopValContext extends IterationStatementContext {
	public _iterVal!: ValueContext;
	public _iterable!: ValueContext;
	public _statement!: StatementContext;
	public _body: StatementContext[] = [];
	constructor(parser: GrammarParser, ctx: IterationStatementContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public FOR(): TerminalNode {
		return this.getToken(GrammarParser.FOR, 0);
	}
	public LPAREN(): TerminalNode {
		return this.getToken(GrammarParser.LPAREN, 0);
	}
	public IN(): TerminalNode {
		return this.getToken(GrammarParser.IN, 0);
	}
	public RPAREN(): TerminalNode {
		return this.getToken(GrammarParser.RPAREN, 0);
	}
	public LBRACE(): TerminalNode {
		return this.getToken(GrammarParser.LBRACE, 0);
	}
	public RBRACE(): TerminalNode {
		return this.getToken(GrammarParser.RBRACE, 0);
	}
	public value_list(): ValueContext[] {
		return this.getTypedRuleContexts(ValueContext) as ValueContext[];
	}
	public value(i: number): ValueContext {
		return this.getTypedRuleContext(ValueContext, i) as ValueContext;
	}
	public statement_list(): StatementContext[] {
		return this.getTypedRuleContexts(StatementContext) as StatementContext[];
	}
	public statement(i: number): StatementContext {
		return this.getTypedRuleContext(StatementContext, i) as StatementContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterForInLoopVal) {
	 		listener.enterForInLoopVal(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitForInLoopVal) {
	 		listener.exitForInLoopVal(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitForInLoopVal) {
			return visitor.visitForInLoopVal(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class ForInLoopDeclContext extends IterationStatementContext {
	public _iterDecl!: VariableDeclarationContext;
	public _iterable!: ValueContext;
	public _statement!: StatementContext;
	public _body: StatementContext[] = [];
	constructor(parser: GrammarParser, ctx: IterationStatementContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public FOR(): TerminalNode {
		return this.getToken(GrammarParser.FOR, 0);
	}
	public LPAREN(): TerminalNode {
		return this.getToken(GrammarParser.LPAREN, 0);
	}
	public IN(): TerminalNode {
		return this.getToken(GrammarParser.IN, 0);
	}
	public RPAREN(): TerminalNode {
		return this.getToken(GrammarParser.RPAREN, 0);
	}
	public LBRACE(): TerminalNode {
		return this.getToken(GrammarParser.LBRACE, 0);
	}
	public RBRACE(): TerminalNode {
		return this.getToken(GrammarParser.RBRACE, 0);
	}
	public variableDeclaration(): VariableDeclarationContext {
		return this.getTypedRuleContext(VariableDeclarationContext, 0) as VariableDeclarationContext;
	}
	public value(): ValueContext {
		return this.getTypedRuleContext(ValueContext, 0) as ValueContext;
	}
	public statement_list(): StatementContext[] {
		return this.getTypedRuleContexts(StatementContext) as StatementContext[];
	}
	public statement(i: number): StatementContext {
		return this.getTypedRuleContext(StatementContext, i) as StatementContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterForInLoopDecl) {
	 		listener.enterForInLoopDecl(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitForInLoopDecl) {
	 		listener.exitForInLoopDecl(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitForInLoopDecl) {
			return visitor.visitForInLoopDecl(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class WhileLoopContext extends IterationStatementContext {
	public _cond!: ValueContext;
	public _block!: Token;
	public _statement!: StatementContext;
	public _stmts: StatementContext[] = [];
	public _single!: StatementContext;
	constructor(parser: GrammarParser, ctx: IterationStatementContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public WHILE(): TerminalNode {
		return this.getToken(GrammarParser.WHILE, 0);
	}
	public LPAREN(): TerminalNode {
		return this.getToken(GrammarParser.LPAREN, 0);
	}
	public RPAREN(): TerminalNode {
		return this.getToken(GrammarParser.RPAREN, 0);
	}
	public value(): ValueContext {
		return this.getTypedRuleContext(ValueContext, 0) as ValueContext;
	}
	public RBRACE(): TerminalNode {
		return this.getToken(GrammarParser.RBRACE, 0);
	}
	public RBRACE_HTML(): TerminalNode {
		return this.getToken(GrammarParser.RBRACE_HTML, 0);
	}
	public statement_list(): StatementContext[] {
		return this.getTypedRuleContexts(StatementContext) as StatementContext[];
	}
	public statement(i: number): StatementContext {
		return this.getTypedRuleContext(StatementContext, i) as StatementContext;
	}
	public LBRACE(): TerminalNode {
		return this.getToken(GrammarParser.LBRACE, 0);
	}
	public LBRACE_HTML(): TerminalNode {
		return this.getToken(GrammarParser.LBRACE_HTML, 0);
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterWhileLoop) {
	 		listener.enterWhileLoop(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitWhileLoop) {
	 		listener.exitWhileLoop(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitWhileLoop) {
			return visitor.visitWhileLoop(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class ForLoopAssignContext extends IterationStatementContext {
	public _initVal!: VariableAssignContext;
	public _cond!: ValueContext;
	public _step!: ValueContext;
	public _statement!: StatementContext;
	public _body: StatementContext[] = [];
	constructor(parser: GrammarParser, ctx: IterationStatementContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public FOR(): TerminalNode {
		return this.getToken(GrammarParser.FOR, 0);
	}
	public LPAREN(): TerminalNode {
		return this.getToken(GrammarParser.LPAREN, 0);
	}
	public SEMICOLON_list(): TerminalNode[] {
	    	return this.getTokens(GrammarParser.SEMICOLON);
	}
	public SEMICOLON(i: number): TerminalNode {
		return this.getToken(GrammarParser.SEMICOLON, i);
	}
	public RPAREN(): TerminalNode {
		return this.getToken(GrammarParser.RPAREN, 0);
	}
	public LBRACE(): TerminalNode {
		return this.getToken(GrammarParser.LBRACE, 0);
	}
	public RBRACE(): TerminalNode {
		return this.getToken(GrammarParser.RBRACE, 0);
	}
	public variableAssign(): VariableAssignContext {
		return this.getTypedRuleContext(VariableAssignContext, 0) as VariableAssignContext;
	}
	public value_list(): ValueContext[] {
		return this.getTypedRuleContexts(ValueContext) as ValueContext[];
	}
	public value(i: number): ValueContext {
		return this.getTypedRuleContext(ValueContext, i) as ValueContext;
	}
	public statement_list(): StatementContext[] {
		return this.getTypedRuleContexts(StatementContext) as StatementContext[];
	}
	public statement(i: number): StatementContext {
		return this.getTypedRuleContext(StatementContext, i) as StatementContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterForLoopAssign) {
	 		listener.enterForLoopAssign(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitForLoopAssign) {
	 		listener.exitForLoopAssign(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitForLoopAssign) {
			return visitor.visitForLoopAssign(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class ForLoopDeclContext extends IterationStatementContext {
	public _initDecl!: VariableDeclarationContext;
	public _cond!: ValueContext;
	public _step!: ValueContext;
	public _statement!: StatementContext;
	public _body: StatementContext[] = [];
	constructor(parser: GrammarParser, ctx: IterationStatementContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public FOR(): TerminalNode {
		return this.getToken(GrammarParser.FOR, 0);
	}
	public LPAREN(): TerminalNode {
		return this.getToken(GrammarParser.LPAREN, 0);
	}
	public SEMICOLON_list(): TerminalNode[] {
	    	return this.getTokens(GrammarParser.SEMICOLON);
	}
	public SEMICOLON(i: number): TerminalNode {
		return this.getToken(GrammarParser.SEMICOLON, i);
	}
	public RPAREN(): TerminalNode {
		return this.getToken(GrammarParser.RPAREN, 0);
	}
	public LBRACE(): TerminalNode {
		return this.getToken(GrammarParser.LBRACE, 0);
	}
	public RBRACE(): TerminalNode {
		return this.getToken(GrammarParser.RBRACE, 0);
	}
	public variableDeclaration(): VariableDeclarationContext {
		return this.getTypedRuleContext(VariableDeclarationContext, 0) as VariableDeclarationContext;
	}
	public value_list(): ValueContext[] {
		return this.getTypedRuleContexts(ValueContext) as ValueContext[];
	}
	public value(i: number): ValueContext {
		return this.getTypedRuleContext(ValueContext, i) as ValueContext;
	}
	public statement_list(): StatementContext[] {
		return this.getTypedRuleContexts(StatementContext) as StatementContext[];
	}
	public statement(i: number): StatementContext {
		return this.getTypedRuleContext(StatementContext, i) as StatementContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterForLoopDecl) {
	 		listener.enterForLoopDecl(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitForLoopDecl) {
	 		listener.exitForLoopDecl(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitForLoopDecl) {
			return visitor.visitForLoopDecl(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class DoWhileLoopContext extends IterationStatementContext {
	public _statement!: StatementContext;
	public _body: StatementContext[] = [];
	public _cond!: ValueContext;
	constructor(parser: GrammarParser, ctx: IterationStatementContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public DO(): TerminalNode {
		return this.getToken(GrammarParser.DO, 0);
	}
	public LBRACE(): TerminalNode {
		return this.getToken(GrammarParser.LBRACE, 0);
	}
	public RBRACE(): TerminalNode {
		return this.getToken(GrammarParser.RBRACE, 0);
	}
	public WHILE(): TerminalNode {
		return this.getToken(GrammarParser.WHILE, 0);
	}
	public LPAREN(): TerminalNode {
		return this.getToken(GrammarParser.LPAREN, 0);
	}
	public RPAREN(): TerminalNode {
		return this.getToken(GrammarParser.RPAREN, 0);
	}
	public value(): ValueContext {
		return this.getTypedRuleContext(ValueContext, 0) as ValueContext;
	}
	public statement_list(): StatementContext[] {
		return this.getTypedRuleContexts(StatementContext) as StatementContext[];
	}
	public statement(i: number): StatementContext {
		return this.getTypedRuleContext(StatementContext, i) as StatementContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterDoWhileLoop) {
	 		listener.enterDoWhileLoop(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitDoWhileLoop) {
	 		listener.exitDoWhileLoop(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitDoWhileLoop) {
			return visitor.visitDoWhileLoop(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FunctionDeclarationContext extends ParserRuleContext {
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_functionDeclaration;
	}
	public override copyFrom(ctx: FunctionDeclarationContext): void {
		super.copyFrom(ctx);
	}
}
export class FunctionDeclarationRuleContext extends FunctionDeclarationContext {
	public _funcName!: Token;
	public _ID!: Token;
	public _params: Token[] = [];
	public _body!: FunctionBodyContext;
	constructor(parser: GrammarParser, ctx: FunctionDeclarationContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public FUNCTION(): TerminalNode {
		return this.getToken(GrammarParser.FUNCTION, 0);
	}
	public LPAREN(): TerminalNode {
		return this.getToken(GrammarParser.LPAREN, 0);
	}
	public RPAREN(): TerminalNode {
		return this.getToken(GrammarParser.RPAREN, 0);
	}
	public ID_list(): TerminalNode[] {
	    	return this.getTokens(GrammarParser.ID);
	}
	public ID(i: number): TerminalNode {
		return this.getToken(GrammarParser.ID, i);
	}
	public functionBody(): FunctionBodyContext {
		return this.getTypedRuleContext(FunctionBodyContext, 0) as FunctionBodyContext;
	}
	public COMMA_list(): TerminalNode[] {
	    	return this.getTokens(GrammarParser.COMMA);
	}
	public COMMA(i: number): TerminalNode {
		return this.getToken(GrammarParser.COMMA, i);
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterFunctionDeclarationRule) {
	 		listener.enterFunctionDeclarationRule(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitFunctionDeclarationRule) {
	 		listener.exitFunctionDeclarationRule(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitFunctionDeclarationRule) {
			return visitor.visitFunctionDeclarationRule(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FunctionBodyContext extends ParserRuleContext {
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_functionBody;
	}
	public override copyFrom(ctx: FunctionBodyContext): void {
		super.copyFrom(ctx);
	}
}
export class FunctionArrowContext extends FunctionBodyContext {
	public _ID!: Token;
	public _params: Token[] = [];
	public _singleParam!: Token;
	public _type_!: TypeDefineContext;
	public _expr!: ValueContext;
	public _statement!: StatementContext;
	public _stmts: StatementContext[] = [];
	constructor(parser: GrammarParser, ctx: FunctionBodyContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public ARROW(): TerminalNode {
		return this.getToken(GrammarParser.ARROW, 0);
	}
	public ID_list(): TerminalNode[] {
	    	return this.getTokens(GrammarParser.ID);
	}
	public ID(i: number): TerminalNode {
		return this.getToken(GrammarParser.ID, i);
	}
	public value(): ValueContext {
		return this.getTypedRuleContext(ValueContext, 0) as ValueContext;
	}
	public LPAREN(): TerminalNode {
		return this.getToken(GrammarParser.LPAREN, 0);
	}
	public RPAREN(): TerminalNode {
		return this.getToken(GrammarParser.RPAREN, 0);
	}
	public typeDefine(): TypeDefineContext {
		return this.getTypedRuleContext(TypeDefineContext, 0) as TypeDefineContext;
	}
	public statement_list(): StatementContext[] {
		return this.getTypedRuleContexts(StatementContext) as StatementContext[];
	}
	public statement(i: number): StatementContext {
		return this.getTypedRuleContext(StatementContext, i) as StatementContext;
	}
	public COMMA_list(): TerminalNode[] {
	    	return this.getTokens(GrammarParser.COMMA);
	}
	public COMMA(i: number): TerminalNode {
		return this.getToken(GrammarParser.COMMA, i);
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterFunctionArrow) {
	 		listener.enterFunctionArrow(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitFunctionArrow) {
	 		listener.exitFunctionArrow(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitFunctionArrow) {
			return visitor.visitFunctionArrow(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class FunctionBlockContext extends FunctionBodyContext {
	public _type_!: TypeDefineContext;
	public _statement!: StatementContext;
	public _stmts: StatementContext[] = [];
	constructor(parser: GrammarParser, ctx: FunctionBodyContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public LBRACE(): TerminalNode {
		return this.getToken(GrammarParser.LBRACE, 0);
	}
	public RBRACE(): TerminalNode {
		return this.getToken(GrammarParser.RBRACE, 0);
	}
	public typeDefine(): TypeDefineContext {
		return this.getTypedRuleContext(TypeDefineContext, 0) as TypeDefineContext;
	}
	public statement_list(): StatementContext[] {
		return this.getTypedRuleContexts(StatementContext) as StatementContext[];
	}
	public statement(i: number): StatementContext {
		return this.getTypedRuleContext(StatementContext, i) as StatementContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterFunctionBlock) {
	 		listener.enterFunctionBlock(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitFunctionBlock) {
	 		listener.exitFunctionBlock(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitFunctionBlock) {
			return visitor.visitFunctionBlock(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FunctionCallContext extends ParserRuleContext {
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_functionCall;
	}
	public override copyFrom(ctx: FunctionCallContext): void {
		super.copyFrom(ctx);
	}
}
export class FunctionCallRuleContext extends FunctionCallContext {
	public _funcName!: Token;
	public _value!: ValueContext;
	public _args: ValueContext[] = [];
	constructor(parser: GrammarParser, ctx: FunctionCallContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public LPAREN(): TerminalNode {
		return this.getToken(GrammarParser.LPAREN, 0);
	}
	public RPAREN(): TerminalNode {
		return this.getToken(GrammarParser.RPAREN, 0);
	}
	public ID(): TerminalNode {
		return this.getToken(GrammarParser.ID, 0);
	}
	public value_list(): ValueContext[] {
		return this.getTypedRuleContexts(ValueContext) as ValueContext[];
	}
	public value(i: number): ValueContext {
		return this.getTypedRuleContext(ValueContext, i) as ValueContext;
	}
	public COMMA_list(): TerminalNode[] {
	    	return this.getTokens(GrammarParser.COMMA);
	}
	public COMMA(i: number): TerminalNode {
		return this.getToken(GrammarParser.COMMA, i);
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterFunctionCallRule) {
	 		listener.enterFunctionCallRule(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitFunctionCallRule) {
	 		listener.exitFunctionCallRule(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitFunctionCallRule) {
			return visitor.visitFunctionCallRule(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class VariableDeclarationContext extends ParserRuleContext {
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_variableDeclaration;
	}
	public override copyFrom(ctx: VariableDeclarationContext): void {
		super.copyFrom(ctx);
	}
}
export class VarDeclarationRuleContext extends VariableDeclarationContext {
	public _kind!: Token;
	public _assign!: VariableAssignContext;
	constructor(parser: GrammarParser, ctx: VariableDeclarationContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public variableAssign(): VariableAssignContext {
		return this.getTypedRuleContext(VariableAssignContext, 0) as VariableAssignContext;
	}
	public CONST(): TerminalNode {
		return this.getToken(GrammarParser.CONST, 0);
	}
	public LET(): TerminalNode {
		return this.getToken(GrammarParser.LET, 0);
	}
	public VAR(): TerminalNode {
		return this.getToken(GrammarParser.VAR, 0);
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterVarDeclarationRule) {
	 		listener.enterVarDeclarationRule(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitVarDeclarationRule) {
	 		listener.exitVarDeclarationRule(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitVarDeclarationRule) {
			return visitor.visitVarDeclarationRule(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class VariableAssignContext extends ParserRuleContext {
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_variableAssign;
	}
	public override copyFrom(ctx: VariableAssignContext): void {
		super.copyFrom(ctx);
	}
}
export class VarAssignRuleContext extends VariableAssignContext {
	public _varName!: Token;
	public _type_!: TypeDefineContext;
	public _expr!: ValueContext;
	constructor(parser: GrammarParser, ctx: VariableAssignContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public ID(): TerminalNode {
		return this.getToken(GrammarParser.ID, 0);
	}
	public ASSIGN(): TerminalNode {
		return this.getToken(GrammarParser.ASSIGN, 0);
	}
	public typeDefine(): TypeDefineContext {
		return this.getTypedRuleContext(TypeDefineContext, 0) as TypeDefineContext;
	}
	public value(): ValueContext {
		return this.getTypedRuleContext(ValueContext, 0) as ValueContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterVarAssignRule) {
	 		listener.enterVarAssignRule(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitVarAssignRule) {
	 		listener.exitVarAssignRule(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitVarAssignRule) {
			return visitor.visitVarAssignRule(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ImportStatementContext extends ParserRuleContext {
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_importStatement;
	}
	public override copyFrom(ctx: ImportStatementContext): void {
		super.copyFrom(ctx);
	}
}
export class ImportRuleContext extends ImportStatementContext {
	public _def!: DefaultImportContext;
	public _named!: NamedImportsContext;
	public _path!: Token;
	constructor(parser: GrammarParser, ctx: ImportStatementContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public IMPORT(): TerminalNode {
		return this.getToken(GrammarParser.IMPORT, 0);
	}
	public FROM(): TerminalNode {
		return this.getToken(GrammarParser.FROM, 0);
	}
	public STRING(): TerminalNode {
		return this.getToken(GrammarParser.STRING, 0);
	}
	public defaultImport(): DefaultImportContext {
		return this.getTypedRuleContext(DefaultImportContext, 0) as DefaultImportContext;
	}
	public namedImports(): NamedImportsContext {
		return this.getTypedRuleContext(NamedImportsContext, 0) as NamedImportsContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterImportRule) {
	 		listener.enterImportRule(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitImportRule) {
	 		listener.exitImportRule(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitImportRule) {
			return visitor.visitImportRule(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class DefaultImportContext extends ParserRuleContext {
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_defaultImport;
	}
	public override copyFrom(ctx: DefaultImportContext): void {
		super.copyFrom(ctx);
	}
}
export class DefaultImportRuleContext extends DefaultImportContext {
	public _id!: Token;
	constructor(parser: GrammarParser, ctx: DefaultImportContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public ID(): TerminalNode {
		return this.getToken(GrammarParser.ID, 0);
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterDefaultImportRule) {
	 		listener.enterDefaultImportRule(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitDefaultImportRule) {
	 		listener.exitDefaultImportRule(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitDefaultImportRule) {
			return visitor.visitDefaultImportRule(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class NamedImportsContext extends ParserRuleContext {
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_namedImports;
	}
	public override copyFrom(ctx: NamedImportsContext): void {
		super.copyFrom(ctx);
	}
}
export class NamedImportsRuleContext extends NamedImportsContext {
	public _importSpecifier!: ImportSpecifierContext;
	public _imports: ImportSpecifierContext[] = [];
	constructor(parser: GrammarParser, ctx: NamedImportsContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public LBRACE(): TerminalNode {
		return this.getToken(GrammarParser.LBRACE, 0);
	}
	public LBRACE_HTML(): TerminalNode {
		return this.getToken(GrammarParser.LBRACE_HTML, 0);
	}
	public importSpecifier_list(): ImportSpecifierContext[] {
		return this.getTypedRuleContexts(ImportSpecifierContext) as ImportSpecifierContext[];
	}
	public importSpecifier(i: number): ImportSpecifierContext {
		return this.getTypedRuleContext(ImportSpecifierContext, i) as ImportSpecifierContext;
	}
	public RBRACE(): TerminalNode {
		return this.getToken(GrammarParser.RBRACE, 0);
	}
	public RBRACE_HTML(): TerminalNode {
		return this.getToken(GrammarParser.RBRACE_HTML, 0);
	}
	public COMMA_list(): TerminalNode[] {
	    	return this.getTokens(GrammarParser.COMMA);
	}
	public COMMA(i: number): TerminalNode {
		return this.getToken(GrammarParser.COMMA, i);
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterNamedImportsRule) {
	 		listener.enterNamedImportsRule(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitNamedImportsRule) {
	 		listener.exitNamedImportsRule(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitNamedImportsRule) {
			return visitor.visitNamedImportsRule(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ImportSpecifierContext extends ParserRuleContext {
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_importSpecifier;
	}
	public override copyFrom(ctx: ImportSpecifierContext): void {
		super.copyFrom(ctx);
	}
}
export class ImportSpecifierRuleContext extends ImportSpecifierContext {
	public _name!: Token;
	public _alias!: Token;
	constructor(parser: GrammarParser, ctx: ImportSpecifierContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public ID_list(): TerminalNode[] {
	    	return this.getTokens(GrammarParser.ID);
	}
	public ID(i: number): TerminalNode {
		return this.getToken(GrammarParser.ID, i);
	}
	public AS(): TerminalNode {
		return this.getToken(GrammarParser.AS, 0);
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterImportSpecifierRule) {
	 		listener.enterImportSpecifierRule(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitImportSpecifierRule) {
	 		listener.exitImportSpecifierRule(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitImportSpecifierRule) {
			return visitor.visitImportSpecifierRule(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ExportStatementContext extends ParserRuleContext {
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_exportStatement;
	}
	public override copyFrom(ctx: ExportStatementContext): void {
		super.copyFrom(ctx);
	}
}
export class ExportRuleContext extends ExportStatementContext {
	public _cls!: ClassDeclarationContext;
	public _val!: ValueContext;
	public _func!: FunctionBodyContext;
	constructor(parser: GrammarParser, ctx: ExportStatementContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public EXPORT(): TerminalNode {
		return this.getToken(GrammarParser.EXPORT, 0);
	}
	public classDeclaration(): ClassDeclarationContext {
		return this.getTypedRuleContext(ClassDeclarationContext, 0) as ClassDeclarationContext;
	}
	public value(): ValueContext {
		return this.getTypedRuleContext(ValueContext, 0) as ValueContext;
	}
	public functionBody(): FunctionBodyContext {
		return this.getTypedRuleContext(FunctionBodyContext, 0) as FunctionBodyContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterExportRule) {
	 		listener.enterExportRule(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitExportRule) {
	 		listener.exitExportRule(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitExportRule) {
			return visitor.visitExportRule(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ClassDeclarationContext extends ParserRuleContext {
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_classDeclaration;
	}
	public override copyFrom(ctx: ClassDeclarationContext): void {
		super.copyFrom(ctx);
	}
}
export class ClassDeclarationRuleContext extends ClassDeclarationContext {
	public _name!: Token;
	public _body!: ClassBodyContext;
	constructor(parser: GrammarParser, ctx: ClassDeclarationContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public CLASS(): TerminalNode {
		return this.getToken(GrammarParser.CLASS, 0);
	}
	public ID(): TerminalNode {
		return this.getToken(GrammarParser.ID, 0);
	}
	public classBody(): ClassBodyContext {
		return this.getTypedRuleContext(ClassBodyContext, 0) as ClassBodyContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterClassDeclarationRule) {
	 		listener.enterClassDeclarationRule(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitClassDeclarationRule) {
	 		listener.exitClassDeclarationRule(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitClassDeclarationRule) {
			return visitor.visitClassDeclarationRule(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ClassBodyContext extends ParserRuleContext {
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_classBody;
	}
	public override copyFrom(ctx: ClassBodyContext): void {
		super.copyFrom(ctx);
	}
}
export class ClassBodyRuleContext extends ClassBodyContext {
	public _classBodyStatement!: ClassBodyStatementContext;
	public _stmts: ClassBodyStatementContext[] = [];
	constructor(parser: GrammarParser, ctx: ClassBodyContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public LBRACE(): TerminalNode {
		return this.getToken(GrammarParser.LBRACE, 0);
	}
	public RBRACE(): TerminalNode {
		return this.getToken(GrammarParser.RBRACE, 0);
	}
	public classBodyStatement_list(): ClassBodyStatementContext[] {
		return this.getTypedRuleContexts(ClassBodyStatementContext) as ClassBodyStatementContext[];
	}
	public classBodyStatement(i: number): ClassBodyStatementContext {
		return this.getTypedRuleContext(ClassBodyStatementContext, i) as ClassBodyStatementContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterClassBodyRule) {
	 		listener.enterClassBodyRule(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitClassBodyRule) {
	 		listener.exitClassBodyRule(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitClassBodyRule) {
			return visitor.visitClassBodyRule(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ClassBodyStatementContext extends ParserRuleContext {
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_classBodyStatement;
	}
	public override copyFrom(ctx: ClassBodyStatementContext): void {
		super.copyFrom(ctx);
	}
}
export class ClassFuncDeclContext extends ClassBodyStatementContext {
	public _func!: FunctionDeclarationContext;
	constructor(parser: GrammarParser, ctx: ClassBodyStatementContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public functionDeclaration(): FunctionDeclarationContext {
		return this.getTypedRuleContext(FunctionDeclarationContext, 0) as FunctionDeclarationContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterClassFuncDecl) {
	 		listener.enterClassFuncDecl(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitClassFuncDecl) {
	 		listener.exitClassFuncDecl(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitClassFuncDecl) {
			return visitor.visitClassFuncDecl(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class ClassVarDeclContext extends ClassBodyStatementContext {
	public _var_!: VariableDeclarationContext;
	constructor(parser: GrammarParser, ctx: ClassBodyStatementContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public variableDeclaration(): VariableDeclarationContext {
		return this.getTypedRuleContext(VariableDeclarationContext, 0) as VariableDeclarationContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterClassVarDecl) {
	 		listener.enterClassVarDecl(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitClassVarDecl) {
	 		listener.exitClassVarDecl(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitClassVarDecl) {
			return visitor.visitClassVarDecl(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ComponentStatementContext extends ParserRuleContext {
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_componentStatement;
	}
	public override copyFrom(ctx: ComponentStatementContext): void {
		super.copyFrom(ctx);
	}
}
export class ComponentRuleContext extends ComponentStatementContext {
	public _selector!: Token;
	public _template!: ValueContext;
	public _ID!: Token;
	public _keys: Token[] = [];
	public _value!: ValueContext;
	public _vals: ValueContext[] = [];
	constructor(parser: GrammarParser, ctx: ComponentStatementContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public COMPONENT(): TerminalNode {
		return this.getToken(GrammarParser.COMPONENT, 0);
	}
	public LPAREN(): TerminalNode {
		return this.getToken(GrammarParser.LPAREN, 0);
	}
	public LBRACE(): TerminalNode {
		return this.getToken(GrammarParser.LBRACE, 0);
	}
	public TEMPLATE(): TerminalNode {
		return this.getToken(GrammarParser.TEMPLATE, 0);
	}
	public COLON_list(): TerminalNode[] {
	    	return this.getTokens(GrammarParser.COLON);
	}
	public COLON(i: number): TerminalNode {
		return this.getToken(GrammarParser.COLON, i);
	}
	public RBRACE(): TerminalNode {
		return this.getToken(GrammarParser.RBRACE, 0);
	}
	public RPAREN(): TerminalNode {
		return this.getToken(GrammarParser.RPAREN, 0);
	}
	public value_list(): ValueContext[] {
		return this.getTypedRuleContexts(ValueContext) as ValueContext[];
	}
	public value(i: number): ValueContext {
		return this.getTypedRuleContext(ValueContext, i) as ValueContext;
	}
	public SELECTOR(): TerminalNode {
		return this.getToken(GrammarParser.SELECTOR, 0);
	}
	public COMMA_list(): TerminalNode[] {
	    	return this.getTokens(GrammarParser.COMMA);
	}
	public COMMA(i: number): TerminalNode {
		return this.getToken(GrammarParser.COMMA, i);
	}
	public STRING(): TerminalNode {
		return this.getToken(GrammarParser.STRING, 0);
	}
	public ID_list(): TerminalNode[] {
	    	return this.getTokens(GrammarParser.ID);
	}
	public ID(i: number): TerminalNode {
		return this.getToken(GrammarParser.ID, i);
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterComponentRule) {
	 		listener.enterComponentRule(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitComponentRule) {
	 		listener.exitComponentRule(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitComponentRule) {
			return visitor.visitComponentRule(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TypeDefineContext extends ParserRuleContext {
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_typeDefine;
	}
	public override copyFrom(ctx: TypeDefineContext): void {
		super.copyFrom(ctx);
	}
}
export class TypeDefineRuleContext extends TypeDefineContext {
	public _type_!: Token;
	constructor(parser: GrammarParser, ctx: TypeDefineContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public COLON(): TerminalNode {
		return this.getToken(GrammarParser.COLON, 0);
	}
	public ID(): TerminalNode {
		return this.getToken(GrammarParser.ID, 0);
	}
	public LBRACKET(): TerminalNode {
		return this.getToken(GrammarParser.LBRACKET, 0);
	}
	public RBRACKET(): TerminalNode {
		return this.getToken(GrammarParser.RBRACKET, 0);
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterTypeDefineRule) {
	 		listener.enterTypeDefineRule(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitTypeDefineRule) {
	 		listener.exitTypeDefineRule(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitTypeDefineRule) {
			return visitor.visitTypeDefineRule(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TypeDeclarationContext extends ParserRuleContext {
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_typeDeclaration;
	}
	public override copyFrom(ctx: TypeDeclarationContext): void {
		super.copyFrom(ctx);
	}
}
export class TypeDeclarationRuleContext extends TypeDeclarationContext {
	public _name!: Token;
	public _typeValue!: TypeDeclarationValueContext;
	constructor(parser: GrammarParser, ctx: TypeDeclarationContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public TYPE(): TerminalNode {
		return this.getToken(GrammarParser.TYPE, 0);
	}
	public ASSIGN(): TerminalNode {
		return this.getToken(GrammarParser.ASSIGN, 0);
	}
	public ID(): TerminalNode {
		return this.getToken(GrammarParser.ID, 0);
	}
	public typeDeclarationValue(): TypeDeclarationValueContext {
		return this.getTypedRuleContext(TypeDeclarationValueContext, 0) as TypeDeclarationValueContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterTypeDeclarationRule) {
	 		listener.enterTypeDeclarationRule(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitTypeDeclarationRule) {
	 		listener.exitTypeDeclarationRule(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitTypeDeclarationRule) {
			return visitor.visitTypeDeclarationRule(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TypeDeclarationValueContext extends ParserRuleContext {
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_typeDeclarationValue;
	}
	public override copyFrom(ctx: TypeDeclarationValueContext): void {
		super.copyFrom(ctx);
	}
}
export class TypeObjectAssignContext extends TypeDeclarationValueContext {
	public _obj!: TypeObjectContext;
	constructor(parser: GrammarParser, ctx: TypeDeclarationValueContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public typeObject(): TypeObjectContext {
		return this.getTypedRuleContext(TypeObjectContext, 0) as TypeObjectContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterTypeObjectAssign) {
	 		listener.enterTypeObjectAssign(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitTypeObjectAssign) {
	 		listener.exitTypeObjectAssign(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitTypeObjectAssign) {
			return visitor.visitTypeObjectAssign(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class TypeSimpleContext extends TypeDeclarationValueContext {
	public _type_!: Token;
	constructor(parser: GrammarParser, ctx: TypeDeclarationValueContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public ID(): TerminalNode {
		return this.getToken(GrammarParser.ID, 0);
	}
	public LBRACKET(): TerminalNode {
		return this.getToken(GrammarParser.LBRACKET, 0);
	}
	public RBRACKET(): TerminalNode {
		return this.getToken(GrammarParser.RBRACKET, 0);
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterTypeSimple) {
	 		listener.enterTypeSimple(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitTypeSimple) {
	 		listener.exitTypeSimple(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitTypeSimple) {
			return visitor.visitTypeSimple(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TypeObjectContext extends ParserRuleContext {
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_typeObject;
	}
	public override copyFrom(ctx: TypeObjectContext): void {
		super.copyFrom(ctx);
	}
}
export class TypeObjectRuleContext extends TypeObjectContext {
	public _typeMember!: TypeMemberContext;
	public _typeMembers: TypeMemberContext[] = [];
	constructor(parser: GrammarParser, ctx: TypeObjectContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public LBRACE(): TerminalNode {
		return this.getToken(GrammarParser.LBRACE, 0);
	}
	public RBRACE(): TerminalNode {
		return this.getToken(GrammarParser.RBRACE, 0);
	}
	public typeMember_list(): TypeMemberContext[] {
		return this.getTypedRuleContexts(TypeMemberContext) as TypeMemberContext[];
	}
	public typeMember(i: number): TypeMemberContext {
		return this.getTypedRuleContext(TypeMemberContext, i) as TypeMemberContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterTypeObjectRule) {
	 		listener.enterTypeObjectRule(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitTypeObjectRule) {
	 		listener.exitTypeObjectRule(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitTypeObjectRule) {
			return visitor.visitTypeObjectRule(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TypeMemberContext extends ParserRuleContext {
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_typeMember;
	}
	public override copyFrom(ctx: TypeMemberContext): void {
		super.copyFrom(ctx);
	}
}
export class TypeMemberRuleContext extends TypeMemberContext {
	public _name!: Token;
	public _type_!: TypeDeclarationValueContext;
	constructor(parser: GrammarParser, ctx: TypeMemberContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public COLON(): TerminalNode {
		return this.getToken(GrammarParser.COLON, 0);
	}
	public ID(): TerminalNode {
		return this.getToken(GrammarParser.ID, 0);
	}
	public typeDeclarationValue(): TypeDeclarationValueContext {
		return this.getTypedRuleContext(TypeDeclarationValueContext, 0) as TypeDeclarationValueContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterTypeMemberRule) {
	 		listener.enterTypeMemberRule(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitTypeMemberRule) {
	 		listener.exitTypeMemberRule(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitTypeMemberRule) {
			return visitor.visitTypeMemberRule(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class AsTypeContext extends ParserRuleContext {
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_asType;
	}
	public override copyFrom(ctx: AsTypeContext): void {
		super.copyFrom(ctx);
	}
}
export class AsTypeRuleContext extends AsTypeContext {
	public _type_!: Token;
	constructor(parser: GrammarParser, ctx: AsTypeContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public AS(): TerminalNode {
		return this.getToken(GrammarParser.AS, 0);
	}
	public ID(): TerminalNode {
		return this.getToken(GrammarParser.ID, 0);
	}
	public LBRACKET(): TerminalNode {
		return this.getToken(GrammarParser.LBRACKET, 0);
	}
	public RBRACKET(): TerminalNode {
		return this.getToken(GrammarParser.RBRACKET, 0);
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterAsTypeRule) {
	 		listener.enterAsTypeRule(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitAsTypeRule) {
	 		listener.exitAsTypeRule(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitAsTypeRule) {
			return visitor.visitAsTypeRule(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ValueContext extends ParserRuleContext {
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_value;
	}
	public override copyFrom(ctx: ValueContext): void {
		super.copyFrom(ctx);
	}
}
export class MethodCallValueContext extends ValueContext {
	public _left!: ValueContext;
	public _value!: ValueContext;
	public _args: ValueContext[] = [];
	constructor(parser: GrammarParser, ctx: ValueContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public LPAREN(): TerminalNode {
		return this.getToken(GrammarParser.LPAREN, 0);
	}
	public RPAREN(): TerminalNode {
		return this.getToken(GrammarParser.RPAREN, 0);
	}
	public value_list(): ValueContext[] {
		return this.getTypedRuleContexts(ValueContext) as ValueContext[];
	}
	public value(i: number): ValueContext {
		return this.getTypedRuleContext(ValueContext, i) as ValueContext;
	}
	public COMMA_list(): TerminalNode[] {
	    	return this.getTokens(GrammarParser.COMMA);
	}
	public COMMA(i: number): TerminalNode {
		return this.getToken(GrammarParser.COMMA, i);
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterMethodCallValue) {
	 		listener.enterMethodCallValue(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitMethodCallValue) {
	 		listener.exitMethodCallValue(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitMethodCallValue) {
			return visitor.visitMethodCallValue(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class PropertyAccessValueContext extends ValueContext {
	public _left!: ValueContext;
	public _right!: ValueContext;
	constructor(parser: GrammarParser, ctx: ValueContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public DOT(): TerminalNode {
		return this.getToken(GrammarParser.DOT, 0);
	}
	public value_list(): ValueContext[] {
		return this.getTypedRuleContexts(ValueContext) as ValueContext[];
	}
	public value(i: number): ValueContext {
		return this.getTypedRuleContext(ValueContext, i) as ValueContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterPropertyAccessValue) {
	 		listener.enterPropertyAccessValue(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitPropertyAccessValue) {
	 		listener.exitPropertyAccessValue(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitPropertyAccessValue) {
			return visitor.visitPropertyAccessValue(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class PrimaryValueExprContext extends ValueContext {
	public _pv!: PrimaryValueContext;
	public _qm!: Token;
	public _type_!: AsTypeContext;
	constructor(parser: GrammarParser, ctx: ValueContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public primaryValue(): PrimaryValueContext {
		return this.getTypedRuleContext(PrimaryValueContext, 0) as PrimaryValueContext;
	}
	public asType(): AsTypeContext {
		return this.getTypedRuleContext(AsTypeContext, 0) as AsTypeContext;
	}
	public QMARK(): TerminalNode {
		return this.getToken(GrammarParser.QMARK, 0);
	}
	public EMARK(): TerminalNode {
		return this.getToken(GrammarParser.EMARK, 0);
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterPrimaryValueExpr) {
	 		listener.enterPrimaryValueExpr(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitPrimaryValueExpr) {
	 		listener.exitPrimaryValueExpr(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitPrimaryValueExpr) {
			return visitor.visitPrimaryValueExpr(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class ArrowFunctionValueContext extends ValueContext {
	public _ID!: Token;
	public _params: Token[] = [];
	public _statement!: StatementContext;
	public _stmts: StatementContext[] = [];
	public _param!: Token;
	constructor(parser: GrammarParser, ctx: ValueContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public LPAREN(): TerminalNode {
		return this.getToken(GrammarParser.LPAREN, 0);
	}
	public RPAREN(): TerminalNode {
		return this.getToken(GrammarParser.RPAREN, 0);
	}
	public ARROW(): TerminalNode {
		return this.getToken(GrammarParser.ARROW, 0);
	}
	public ID_list(): TerminalNode[] {
	    	return this.getTokens(GrammarParser.ID);
	}
	public ID(i: number): TerminalNode {
		return this.getToken(GrammarParser.ID, i);
	}
	public LBRACE(): TerminalNode {
		return this.getToken(GrammarParser.LBRACE, 0);
	}
	public RBRACE(): TerminalNode {
		return this.getToken(GrammarParser.RBRACE, 0);
	}
	public value(): ValueContext {
		return this.getTypedRuleContext(ValueContext, 0) as ValueContext;
	}
	public COMMA_list(): TerminalNode[] {
	    	return this.getTokens(GrammarParser.COMMA);
	}
	public COMMA(i: number): TerminalNode {
		return this.getToken(GrammarParser.COMMA, i);
	}
	public statement_list(): StatementContext[] {
		return this.getTypedRuleContexts(StatementContext) as StatementContext[];
	}
	public statement(i: number): StatementContext {
		return this.getTypedRuleContext(StatementContext, i) as StatementContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterArrowFunctionValue) {
	 		listener.enterArrowFunctionValue(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitArrowFunctionValue) {
	 		listener.exitArrowFunctionValue(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitArrowFunctionValue) {
			return visitor.visitArrowFunctionValue(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class BinaryValueContext extends ValueContext {
	public _left!: ValueContext;
	public _op!: BinaryOpContext;
	public _right!: ValueContext;
	constructor(parser: GrammarParser, ctx: ValueContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public value_list(): ValueContext[] {
		return this.getTypedRuleContexts(ValueContext) as ValueContext[];
	}
	public value(i: number): ValueContext {
		return this.getTypedRuleContext(ValueContext, i) as ValueContext;
	}
	public binaryOp(): BinaryOpContext {
		return this.getTypedRuleContext(BinaryOpContext, 0) as BinaryOpContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterBinaryValue) {
	 		listener.enterBinaryValue(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitBinaryValue) {
	 		listener.exitBinaryValue(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitBinaryValue) {
			return visitor.visitBinaryValue(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class PrimaryValueContext extends ParserRuleContext {
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_primaryValue;
	}
	public override copyFrom(ctx: PrimaryValueContext): void {
		super.copyFrom(ctx);
	}
}
export class ArrayAccessValueContext extends PrimaryValueContext {
	public _access!: ArrayAccessContext;
	constructor(parser: GrammarParser, ctx: PrimaryValueContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public arrayAccess(): ArrayAccessContext {
		return this.getTypedRuleContext(ArrayAccessContext, 0) as ArrayAccessContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterArrayAccessValue) {
	 		listener.enterArrayAccessValue(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitArrayAccessValue) {
	 		listener.exitArrayAccessValue(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitArrayAccessValue) {
			return visitor.visitArrayAccessValue(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class NegationValueContext extends PrimaryValueContext {
	public _right!: ValueContext;
	constructor(parser: GrammarParser, ctx: PrimaryValueContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public EMARK(): TerminalNode {
		return this.getToken(GrammarParser.EMARK, 0);
	}
	public value(): ValueContext {
		return this.getTypedRuleContext(ValueContext, 0) as ValueContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterNegationValue) {
	 		listener.enterNegationValue(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitNegationValue) {
	 		listener.exitNegationValue(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitNegationValue) {
			return visitor.visitNegationValue(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class TrueValueContext extends PrimaryValueContext {
	constructor(parser: GrammarParser, ctx: PrimaryValueContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public TRUE(): TerminalNode {
		return this.getToken(GrammarParser.TRUE, 0);
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterTrueValue) {
	 		listener.enterTrueValue(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitTrueValue) {
	 		listener.exitTrueValue(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitTrueValue) {
			return visitor.visitTrueValue(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class IdValueContext extends PrimaryValueContext {
	public _id!: Token;
	constructor(parser: GrammarParser, ctx: PrimaryValueContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public ID(): TerminalNode {
		return this.getToken(GrammarParser.ID, 0);
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterIdValue) {
	 		listener.enterIdValue(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitIdValue) {
	 		listener.exitIdValue(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitIdValue) {
			return visitor.visitIdValue(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class ObjectValueContext extends PrimaryValueContext {
	public _obj!: ObjectContext;
	constructor(parser: GrammarParser, ctx: PrimaryValueContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public object(): ObjectContext {
		return this.getTypedRuleContext(ObjectContext, 0) as ObjectContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterObjectValue) {
	 		listener.enterObjectValue(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitObjectValue) {
	 		listener.exitObjectValue(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitObjectValue) {
			return visitor.visitObjectValue(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class TemplateValueContext extends PrimaryValueContext {
	public _bt!: Token;
	public _html!: HtmlContext;
	public _content: HtmlContext[] = [];
	constructor(parser: GrammarParser, ctx: PrimaryValueContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public BACKTICK_list(): TerminalNode[] {
	    	return this.getTokens(GrammarParser.BACKTICK);
	}
	public BACKTICK(i: number): TerminalNode {
		return this.getToken(GrammarParser.BACKTICK, i);
	}
	public BACKTICK_HTML_list(): TerminalNode[] {
	    	return this.getTokens(GrammarParser.BACKTICK_HTML);
	}
	public BACKTICK_HTML(i: number): TerminalNode {
		return this.getToken(GrammarParser.BACKTICK_HTML, i);
	}
	public html_list(): HtmlContext[] {
		return this.getTypedRuleContexts(HtmlContext) as HtmlContext[];
	}
	public html(i: number): HtmlContext {
		return this.getTypedRuleContext(HtmlContext, i) as HtmlContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterTemplateValue) {
	 		listener.enterTemplateValue(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitTemplateValue) {
	 		listener.exitTemplateValue(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitTemplateValue) {
			return visitor.visitTemplateValue(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class ArrayValueContext extends PrimaryValueContext {
	public _arr!: ArrayContext;
	constructor(parser: GrammarParser, ctx: PrimaryValueContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public array(): ArrayContext {
		return this.getTypedRuleContext(ArrayContext, 0) as ArrayContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterArrayValue) {
	 		listener.enterArrayValue(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitArrayValue) {
	 		listener.exitArrayValue(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitArrayValue) {
			return visitor.visitArrayValue(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class DecValueContext extends PrimaryValueContext {
	public _dec!: Decrease_variableContext;
	constructor(parser: GrammarParser, ctx: PrimaryValueContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public decrease_variable(): Decrease_variableContext {
		return this.getTypedRuleContext(Decrease_variableContext, 0) as Decrease_variableContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterDecValue) {
	 		listener.enterDecValue(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitDecValue) {
	 		listener.exitDecValue(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitDecValue) {
			return visitor.visitDecValue(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class CallValueContext extends PrimaryValueContext {
	public _call!: FunctionCallContext;
	constructor(parser: GrammarParser, ctx: PrimaryValueContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public functionCall(): FunctionCallContext {
		return this.getTypedRuleContext(FunctionCallContext, 0) as FunctionCallContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterCallValue) {
	 		listener.enterCallValue(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitCallValue) {
	 		listener.exitCallValue(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitCallValue) {
			return visitor.visitCallValue(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class ParenValueContext extends PrimaryValueContext {
	public _inner!: ValueContext;
	constructor(parser: GrammarParser, ctx: PrimaryValueContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public LPAREN(): TerminalNode {
		return this.getToken(GrammarParser.LPAREN, 0);
	}
	public RPAREN(): TerminalNode {
		return this.getToken(GrammarParser.RPAREN, 0);
	}
	public value(): ValueContext {
		return this.getTypedRuleContext(ValueContext, 0) as ValueContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterParenValue) {
	 		listener.enterParenValue(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitParenValue) {
	 		listener.exitParenValue(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitParenValue) {
			return visitor.visitParenValue(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class FalseValueContext extends PrimaryValueContext {
	constructor(parser: GrammarParser, ctx: PrimaryValueContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public FALSE(): TerminalNode {
		return this.getToken(GrammarParser.FALSE, 0);
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterFalseValue) {
	 		listener.enterFalseValue(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitFalseValue) {
	 		listener.exitFalseValue(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitFalseValue) {
			return visitor.visitFalseValue(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class IncValueContext extends PrimaryValueContext {
	public _inc!: Increase_variableContext;
	constructor(parser: GrammarParser, ctx: PrimaryValueContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public increase_variable(): Increase_variableContext {
		return this.getTypedRuleContext(Increase_variableContext, 0) as Increase_variableContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterIncValue) {
	 		listener.enterIncValue(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitIncValue) {
	 		listener.exitIncValue(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitIncValue) {
			return visitor.visitIncValue(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class StringValueContext extends PrimaryValueContext {
	public _str!: Token;
	constructor(parser: GrammarParser, ctx: PrimaryValueContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public STRING(): TerminalNode {
		return this.getToken(GrammarParser.STRING, 0);
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterStringValue) {
	 		listener.enterStringValue(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitStringValue) {
	 		listener.exitStringValue(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitStringValue) {
			return visitor.visitStringValue(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class FunctionValueContext extends PrimaryValueContext {
	public _body!: FunctionBodyContext;
	constructor(parser: GrammarParser, ctx: PrimaryValueContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public functionBody(): FunctionBodyContext {
		return this.getTypedRuleContext(FunctionBodyContext, 0) as FunctionBodyContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterFunctionValue) {
	 		listener.enterFunctionValue(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitFunctionValue) {
	 		listener.exitFunctionValue(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitFunctionValue) {
			return visitor.visitFunctionValue(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class NumberValueContext extends PrimaryValueContext {
	public _num!: Token;
	constructor(parser: GrammarParser, ctx: PrimaryValueContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public NUMBER(): TerminalNode {
		return this.getToken(GrammarParser.NUMBER, 0);
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterNumberValue) {
	 		listener.enterNumberValue(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitNumberValue) {
	 		listener.exitNumberValue(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitNumberValue) {
			return visitor.visitNumberValue(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class BinaryOpContext extends ParserRuleContext {
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public DOUBLE_ASSIGN(): TerminalNode {
		return this.getToken(GrammarParser.DOUBLE_ASSIGN, 0);
	}
	public DOUBLE_ASSIGN_ID(): TerminalNode {
		return this.getToken(GrammarParser.DOUBLE_ASSIGN_ID, 0);
	}
	public NOT_EQUAL(): TerminalNode {
		return this.getToken(GrammarParser.NOT_EQUAL, 0);
	}
	public OR(): TerminalNode {
		return this.getToken(GrammarParser.OR, 0);
	}
	public AND(): TerminalNode {
		return this.getToken(GrammarParser.AND, 0);
	}
	public DOUBLE_QMARK(): TerminalNode {
		return this.getToken(GrammarParser.DOUBLE_QMARK, 0);
	}
	public RTAG(): TerminalNode {
		return this.getToken(GrammarParser.RTAG, 0);
	}
	public ASSIGN(): TerminalNode {
		return this.getToken(GrammarParser.ASSIGN, 0);
	}
	public LTAG(): TerminalNode {
		return this.getToken(GrammarParser.LTAG, 0);
	}
	public LTAG_HTML(): TerminalNode {
		return this.getToken(GrammarParser.LTAG_HTML, 0);
	}
	public PLUS(): TerminalNode {
		return this.getToken(GrammarParser.PLUS, 0);
	}
	public MINUS(): TerminalNode {
		return this.getToken(GrammarParser.MINUS, 0);
	}
	public MULT(): TerminalNode {
		return this.getToken(GrammarParser.MULT, 0);
	}
	public SLASH(): TerminalNode {
		return this.getToken(GrammarParser.SLASH, 0);
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_binaryOp;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterBinaryOp) {
	 		listener.enterBinaryOp(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitBinaryOp) {
	 		listener.exitBinaryOp(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitBinaryOp) {
			return visitor.visitBinaryOp(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Increase_variableContext extends ParserRuleContext {
	public _id!: Token;
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public PLUSPLUS(): TerminalNode {
		return this.getToken(GrammarParser.PLUSPLUS, 0);
	}
	public ID(): TerminalNode {
		return this.getToken(GrammarParser.ID, 0);
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_increase_variable;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterIncrease_variable) {
	 		listener.enterIncrease_variable(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitIncrease_variable) {
	 		listener.exitIncrease_variable(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitIncrease_variable) {
			return visitor.visitIncrease_variable(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Decrease_variableContext extends ParserRuleContext {
	public _id!: Token;
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public MINUSMINUS(): TerminalNode {
		return this.getToken(GrammarParser.MINUSMINUS, 0);
	}
	public ID(): TerminalNode {
		return this.getToken(GrammarParser.ID, 0);
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_decrease_variable;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterDecrease_variable) {
	 		listener.enterDecrease_variable(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitDecrease_variable) {
	 		listener.exitDecrease_variable(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitDecrease_variable) {
			return visitor.visitDecrease_variable(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ComparisonContext extends ParserRuleContext {
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_comparison;
	}
	public override copyFrom(ctx: ComparisonContext): void {
		super.copyFrom(ctx);
	}
}
export class EqComparisonContext extends ComparisonContext {
	public _right!: ValueContext;
	constructor(parser: GrammarParser, ctx: ComparisonContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public DOUBLE_ASSIGN(): TerminalNode {
		return this.getToken(GrammarParser.DOUBLE_ASSIGN, 0);
	}
	public value(): ValueContext {
		return this.getTypedRuleContext(ValueContext, 0) as ValueContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterEqComparison) {
	 		listener.enterEqComparison(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitEqComparison) {
	 		listener.exitEqComparison(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitEqComparison) {
			return visitor.visitEqComparison(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class NeqComparisonContext extends ComparisonContext {
	public _right!: ValueContext;
	constructor(parser: GrammarParser, ctx: ComparisonContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public NOT_EQUAL(): TerminalNode {
		return this.getToken(GrammarParser.NOT_EQUAL, 0);
	}
	public value(): ValueContext {
		return this.getTypedRuleContext(ValueContext, 0) as ValueContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterNeqComparison) {
	 		listener.enterNeqComparison(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitNeqComparison) {
	 		listener.exitNeqComparison(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitNeqComparison) {
			return visitor.visitNeqComparison(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class RtagComparisonContext extends ComparisonContext {
	public _right!: ValueContext;
	constructor(parser: GrammarParser, ctx: ComparisonContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public RTAG(): TerminalNode {
		return this.getToken(GrammarParser.RTAG, 0);
	}
	public value(): ValueContext {
		return this.getTypedRuleContext(ValueContext, 0) as ValueContext;
	}
	public ASSIGN(): TerminalNode {
		return this.getToken(GrammarParser.ASSIGN, 0);
	}
	public DOUBLE_ASSIGN(): TerminalNode {
		return this.getToken(GrammarParser.DOUBLE_ASSIGN, 0);
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterRtagComparison) {
	 		listener.enterRtagComparison(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitRtagComparison) {
	 		listener.exitRtagComparison(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitRtagComparison) {
			return visitor.visitRtagComparison(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class IdEqComparisonContext extends ComparisonContext {
	public _right!: ValueContext;
	constructor(parser: GrammarParser, ctx: ComparisonContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public DOUBLE_ASSIGN_ID(): TerminalNode {
		return this.getToken(GrammarParser.DOUBLE_ASSIGN_ID, 0);
	}
	public value(): ValueContext {
		return this.getTypedRuleContext(ValueContext, 0) as ValueContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterIdEqComparison) {
	 		listener.enterIdEqComparison(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitIdEqComparison) {
	 		listener.exitIdEqComparison(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitIdEqComparison) {
			return visitor.visitIdEqComparison(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class LtagComparisonContext extends ComparisonContext {
	public _right!: ValueContext;
	constructor(parser: GrammarParser, ctx: ComparisonContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public LTAG(): TerminalNode {
		return this.getToken(GrammarParser.LTAG, 0);
	}
	public LTAG_HTML(): TerminalNode {
		return this.getToken(GrammarParser.LTAG_HTML, 0);
	}
	public value(): ValueContext {
		return this.getTypedRuleContext(ValueContext, 0) as ValueContext;
	}
	public ASSIGN(): TerminalNode {
		return this.getToken(GrammarParser.ASSIGN, 0);
	}
	public DOUBLE_ASSIGN(): TerminalNode {
		return this.getToken(GrammarParser.DOUBLE_ASSIGN, 0);
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterLtagComparison) {
	 		listener.enterLtagComparison(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitLtagComparison) {
	 		listener.exitLtagComparison(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitLtagComparison) {
			return visitor.visitLtagComparison(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ObjectContext extends ParserRuleContext {
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_object;
	}
	public override copyFrom(ctx: ObjectContext): void {
		super.copyFrom(ctx);
	}
}
export class ObjectRuleContext extends ObjectContext {
	public _pair!: PairContext;
	public _pairs: PairContext[] = [];
	constructor(parser: GrammarParser, ctx: ObjectContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public LBRACE(): TerminalNode {
		return this.getToken(GrammarParser.LBRACE, 0);
	}
	public RBRACE(): TerminalNode {
		return this.getToken(GrammarParser.RBRACE, 0);
	}
	public pair_list(): PairContext[] {
		return this.getTypedRuleContexts(PairContext) as PairContext[];
	}
	public pair(i: number): PairContext {
		return this.getTypedRuleContext(PairContext, i) as PairContext;
	}
	public COMMA_list(): TerminalNode[] {
	    	return this.getTokens(GrammarParser.COMMA);
	}
	public COMMA(i: number): TerminalNode {
		return this.getToken(GrammarParser.COMMA, i);
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterObjectRule) {
	 		listener.enterObjectRule(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitObjectRule) {
	 		listener.exitObjectRule(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitObjectRule) {
			return visitor.visitObjectRule(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class PairContext extends ParserRuleContext {
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_pair;
	}
	public override copyFrom(ctx: PairContext): void {
		super.copyFrom(ctx);
	}
}
export class PairRuleContext extends PairContext {
	public _key!: Token;
	public _val!: ValueContext;
	constructor(parser: GrammarParser, ctx: PairContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public COLON(): TerminalNode {
		return this.getToken(GrammarParser.COLON, 0);
	}
	public ID(): TerminalNode {
		return this.getToken(GrammarParser.ID, 0);
	}
	public value(): ValueContext {
		return this.getTypedRuleContext(ValueContext, 0) as ValueContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterPairRule) {
	 		listener.enterPairRule(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitPairRule) {
	 		listener.exitPairRule(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitPairRule) {
			return visitor.visitPairRule(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ArrayContext extends ParserRuleContext {
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_array;
	}
	public override copyFrom(ctx: ArrayContext): void {
		super.copyFrom(ctx);
	}
}
export class ArrayRuleContext extends ArrayContext {
	public _value!: ValueContext;
	public _elems: ValueContext[] = [];
	constructor(parser: GrammarParser, ctx: ArrayContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public LBRACKET(): TerminalNode {
		return this.getToken(GrammarParser.LBRACKET, 0);
	}
	public RBRACKET(): TerminalNode {
		return this.getToken(GrammarParser.RBRACKET, 0);
	}
	public value_list(): ValueContext[] {
		return this.getTypedRuleContexts(ValueContext) as ValueContext[];
	}
	public value(i: number): ValueContext {
		return this.getTypedRuleContext(ValueContext, i) as ValueContext;
	}
	public COMMA_list(): TerminalNode[] {
	    	return this.getTokens(GrammarParser.COMMA);
	}
	public COMMA(i: number): TerminalNode {
		return this.getToken(GrammarParser.COMMA, i);
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterArrayRule) {
	 		listener.enterArrayRule(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitArrayRule) {
	 		listener.exitArrayRule(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitArrayRule) {
			return visitor.visitArrayRule(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ArrayAccessContext extends ParserRuleContext {
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_arrayAccess;
	}
	public override copyFrom(ctx: ArrayAccessContext): void {
		super.copyFrom(ctx);
	}
}
export class ArrayAccessRuleContext extends ArrayAccessContext {
	public _arr!: Token;
	public _idx!: ValueContext;
	constructor(parser: GrammarParser, ctx: ArrayAccessContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public LBRACKET(): TerminalNode {
		return this.getToken(GrammarParser.LBRACKET, 0);
	}
	public RBRACKET(): TerminalNode {
		return this.getToken(GrammarParser.RBRACKET, 0);
	}
	public ID(): TerminalNode {
		return this.getToken(GrammarParser.ID, 0);
	}
	public value(): ValueContext {
		return this.getTypedRuleContext(ValueContext, 0) as ValueContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterArrayAccessRule) {
	 		listener.enterArrayAccessRule(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitArrayAccessRule) {
	 		listener.exitArrayAccessRule(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitArrayAccessRule) {
			return visitor.visitArrayAccessRule(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class HtmlElementNameContext extends ParserRuleContext {
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public DIV(): TerminalNode {
		return this.getToken(GrammarParser.DIV, 0);
	}
	public P(): TerminalNode {
		return this.getToken(GrammarParser.P, 0);
	}
	public H1(): TerminalNode {
		return this.getToken(GrammarParser.H1, 0);
	}
	public H2(): TerminalNode {
		return this.getToken(GrammarParser.H2, 0);
	}
	public H3(): TerminalNode {
		return this.getToken(GrammarParser.H3, 0);
	}
	public H4(): TerminalNode {
		return this.getToken(GrammarParser.H4, 0);
	}
	public H5(): TerminalNode {
		return this.getToken(GrammarParser.H5, 0);
	}
	public H6(): TerminalNode {
		return this.getToken(GrammarParser.H6, 0);
	}
	public BUTTON(): TerminalNode {
		return this.getToken(GrammarParser.BUTTON, 0);
	}
	public SPAN(): TerminalNode {
		return this.getToken(GrammarParser.SPAN, 0);
	}
	public A(): TerminalNode {
		return this.getToken(GrammarParser.A, 0);
	}
	public IMG(): TerminalNode {
		return this.getToken(GrammarParser.IMG, 0);
	}
	public INPUT(): TerminalNode {
		return this.getToken(GrammarParser.INPUT, 0);
	}
	public FORM(): TerminalNode {
		return this.getToken(GrammarParser.FORM, 0);
	}
	public ID(): TerminalNode {
		return this.getToken(GrammarParser.ID, 0);
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_htmlElementName;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterHtmlElementName) {
	 		listener.enterHtmlElementName(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitHtmlElementName) {
	 		listener.exitHtmlElementName(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitHtmlElementName) {
			return visitor.visitHtmlElementName(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Open_tagContext extends ParserRuleContext {
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_open_tag;
	}
	public override copyFrom(ctx: Open_tagContext): void {
		super.copyFrom(ctx);
	}
}
export class OpenTagRuleContext extends Open_tagContext {
	public _name!: HtmlElementNameContext;
	constructor(parser: GrammarParser, ctx: Open_tagContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public RTAG(): TerminalNode {
		return this.getToken(GrammarParser.RTAG, 0);
	}
	public LTAG(): TerminalNode {
		return this.getToken(GrammarParser.LTAG, 0);
	}
	public LTAG_HTML(): TerminalNode {
		return this.getToken(GrammarParser.LTAG_HTML, 0);
	}
	public htmlElementName(): HtmlElementNameContext {
		return this.getTypedRuleContext(HtmlElementNameContext, 0) as HtmlElementNameContext;
	}
	public attributes_list(): AttributesContext[] {
		return this.getTypedRuleContexts(AttributesContext) as AttributesContext[];
	}
	public attributes(i: number): AttributesContext {
		return this.getTypedRuleContext(AttributesContext, i) as AttributesContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterOpenTagRule) {
	 		listener.enterOpenTagRule(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitOpenTagRule) {
	 		listener.exitOpenTagRule(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitOpenTagRule) {
			return visitor.visitOpenTagRule(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class AttributesContext extends ParserRuleContext {
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public attribute_list(): AttributeContext[] {
		return this.getTypedRuleContexts(AttributeContext) as AttributeContext[];
	}
	public attribute(i: number): AttributeContext {
		return this.getTypedRuleContext(AttributeContext, i) as AttributeContext;
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_attributes;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterAttributes) {
	 		listener.enterAttributes(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitAttributes) {
	 		listener.exitAttributes(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitAttributes) {
			return visitor.visitAttributes(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class AttributeContext extends ParserRuleContext {
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_attribute;
	}
	public override copyFrom(ctx: AttributeContext): void {
		super.copyFrom(ctx);
	}
}
export class ClickEventAttributeRuleContext extends AttributeContext {
	public _val!: AttributeValueContext;
	constructor(parser: GrammarParser, ctx: AttributeContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public CLICK_EVENT(): TerminalNode {
		return this.getToken(GrammarParser.CLICK_EVENT, 0);
	}
	public ASSIGN(): TerminalNode {
		return this.getToken(GrammarParser.ASSIGN, 0);
	}
	public attributeValue(): AttributeValueContext {
		return this.getTypedRuleContext(AttributeValueContext, 0) as AttributeValueContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterClickEventAttributeRule) {
	 		listener.enterClickEventAttributeRule(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitClickEventAttributeRule) {
	 		listener.exitClickEventAttributeRule(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitClickEventAttributeRule) {
			return visitor.visitClickEventAttributeRule(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class NgForAttributeRuleContext extends AttributeContext {
	public _varName!: Token;
	public _collection!: Token;
	constructor(parser: GrammarParser, ctx: AttributeContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public NG_FOR(): TerminalNode {
		return this.getToken(GrammarParser.NG_FOR, 0);
	}
	public ASSIGN(): TerminalNode {
		return this.getToken(GrammarParser.ASSIGN, 0);
	}
	public BACKTICK_list(): TerminalNode[] {
	    	return this.getTokens(GrammarParser.BACKTICK);
	}
	public BACKTICK(i: number): TerminalNode {
		return this.getToken(GrammarParser.BACKTICK, i);
	}
	public LET(): TerminalNode {
		return this.getToken(GrammarParser.LET, 0);
	}
	public OF(): TerminalNode {
		return this.getToken(GrammarParser.OF, 0);
	}
	public ID_list(): TerminalNode[] {
	    	return this.getTokens(GrammarParser.ID);
	}
	public ID(i: number): TerminalNode {
		return this.getToken(GrammarParser.ID, i);
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterNgForAttributeRule) {
	 		listener.enterNgForAttributeRule(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitNgForAttributeRule) {
	 		listener.exitNgForAttributeRule(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitNgForAttributeRule) {
			return visitor.visitNgForAttributeRule(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class RegularAttributeContext extends AttributeContext {
	public _name!: Token;
	public _val!: AttributeValueContext;
	constructor(parser: GrammarParser, ctx: AttributeContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public ASSIGN(): TerminalNode {
		return this.getToken(GrammarParser.ASSIGN, 0);
	}
	public ID(): TerminalNode {
		return this.getToken(GrammarParser.ID, 0);
	}
	public attributeValue(): AttributeValueContext {
		return this.getTypedRuleContext(AttributeValueContext, 0) as AttributeValueContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterRegularAttribute) {
	 		listener.enterRegularAttribute(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitRegularAttribute) {
	 		listener.exitRegularAttribute(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitRegularAttribute) {
			return visitor.visitRegularAttribute(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class NgIfAttributeRuleContext extends AttributeContext {
	public _condition!: ValueContext;
	constructor(parser: GrammarParser, ctx: AttributeContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public NG_IF(): TerminalNode {
		return this.getToken(GrammarParser.NG_IF, 0);
	}
	public ASSIGN(): TerminalNode {
		return this.getToken(GrammarParser.ASSIGN, 0);
	}
	public BACKTICK_list(): TerminalNode[] {
	    	return this.getTokens(GrammarParser.BACKTICK);
	}
	public BACKTICK(i: number): TerminalNode {
		return this.getToken(GrammarParser.BACKTICK, i);
	}
	public value(): ValueContext {
		return this.getTypedRuleContext(ValueContext, 0) as ValueContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterNgIfAttributeRule) {
	 		listener.enterNgIfAttributeRule(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitNgIfAttributeRule) {
	 		listener.exitNgIfAttributeRule(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitNgIfAttributeRule) {
			return visitor.visitNgIfAttributeRule(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class AttributeValueContext extends ParserRuleContext {
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public STRING(): TerminalNode {
		return this.getToken(GrammarParser.STRING, 0);
	}
	public interpolation(): InterpolationContext {
		return this.getTypedRuleContext(InterpolationContext, 0) as InterpolationContext;
	}
	public value(): ValueContext {
		return this.getTypedRuleContext(ValueContext, 0) as ValueContext;
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_attributeValue;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterAttributeValue) {
	 		listener.enterAttributeValue(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitAttributeValue) {
	 		listener.exitAttributeValue(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitAttributeValue) {
			return visitor.visitAttributeValue(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class InterpolationContext extends ParserRuleContext {
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_interpolation;
	}
	public override copyFrom(ctx: InterpolationContext): void {
		super.copyFrom(ctx);
	}
}
export class NestedTemplateInterpolationContext extends InterpolationContext {
	public _html!: HtmlContext;
	public _nested: HtmlContext[] = [];
	constructor(parser: GrammarParser, ctx: InterpolationContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public LBRACE_HTML_list(): TerminalNode[] {
	    	return this.getTokens(GrammarParser.LBRACE_HTML);
	}
	public LBRACE_HTML(i: number): TerminalNode {
		return this.getToken(GrammarParser.LBRACE_HTML, i);
	}
	public RBRACE_HTML(): TerminalNode {
		return this.getToken(GrammarParser.RBRACE_HTML, 0);
	}
	public LBRACE_list(): TerminalNode[] {
	    	return this.getTokens(GrammarParser.LBRACE);
	}
	public LBRACE(i: number): TerminalNode {
		return this.getToken(GrammarParser.LBRACE, i);
	}
	public html_list(): HtmlContext[] {
		return this.getTypedRuleContexts(HtmlContext) as HtmlContext[];
	}
	public html(i: number): HtmlContext {
		return this.getTypedRuleContext(HtmlContext, i) as HtmlContext;
	}
	public RBRACE_list(): TerminalNode[] {
	    	return this.getTokens(GrammarParser.RBRACE);
	}
	public RBRACE(i: number): TerminalNode {
		return this.getToken(GrammarParser.RBRACE, i);
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterNestedTemplateInterpolation) {
	 		listener.enterNestedTemplateInterpolation(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitNestedTemplateInterpolation) {
	 		listener.exitNestedTemplateInterpolation(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitNestedTemplateInterpolation) {
			return visitor.visitNestedTemplateInterpolation(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class SimpleInterpolationContext extends InterpolationContext {
	public _expr!: ValueContext;
	constructor(parser: GrammarParser, ctx: InterpolationContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public value(): ValueContext {
		return this.getTypedRuleContext(ValueContext, 0) as ValueContext;
	}
	public LBRACE_HTML(): TerminalNode {
		return this.getToken(GrammarParser.LBRACE_HTML, 0);
	}
	public RBRACE_HTML(): TerminalNode {
		return this.getToken(GrammarParser.RBRACE_HTML, 0);
	}
	public LBRACE_list(): TerminalNode[] {
	    	return this.getTokens(GrammarParser.LBRACE);
	}
	public LBRACE(i: number): TerminalNode {
		return this.getToken(GrammarParser.LBRACE, i);
	}
	public RBRACE_list(): TerminalNode[] {
	    	return this.getTokens(GrammarParser.RBRACE);
	}
	public RBRACE(i: number): TerminalNode {
		return this.getToken(GrammarParser.RBRACE, i);
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterSimpleInterpolation) {
	 		listener.enterSimpleInterpolation(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitSimpleInterpolation) {
	 		listener.exitSimpleInterpolation(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitSimpleInterpolation) {
			return visitor.visitSimpleInterpolation(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Close_tagContext extends ParserRuleContext {
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_close_tag;
	}
	public override copyFrom(ctx: Close_tagContext): void {
		super.copyFrom(ctx);
	}
}
export class CloseTagRuleContext extends Close_tagContext {
	public _name!: HtmlElementNameContext;
	constructor(parser: GrammarParser, ctx: Close_tagContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public SLASH(): TerminalNode {
		return this.getToken(GrammarParser.SLASH, 0);
	}
	public RTAG(): TerminalNode {
		return this.getToken(GrammarParser.RTAG, 0);
	}
	public LTAG(): TerminalNode {
		return this.getToken(GrammarParser.LTAG, 0);
	}
	public LTAG_HTML(): TerminalNode {
		return this.getToken(GrammarParser.LTAG_HTML, 0);
	}
	public htmlElementName(): HtmlElementNameContext {
		return this.getTypedRuleContext(HtmlElementNameContext, 0) as HtmlElementNameContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterCloseTagRule) {
	 		listener.enterCloseTagRule(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitCloseTagRule) {
	 		listener.exitCloseTagRule(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitCloseTagRule) {
			return visitor.visitCloseTagRule(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Single_tagContext extends ParserRuleContext {
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_single_tag;
	}
	public override copyFrom(ctx: Single_tagContext): void {
		super.copyFrom(ctx);
	}
}
export class SingleTagRuleContext extends Single_tagContext {
	public _name!: HtmlElementNameContext;
	constructor(parser: GrammarParser, ctx: Single_tagContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public SLASH(): TerminalNode {
		return this.getToken(GrammarParser.SLASH, 0);
	}
	public RTAG(): TerminalNode {
		return this.getToken(GrammarParser.RTAG, 0);
	}
	public LTAG(): TerminalNode {
		return this.getToken(GrammarParser.LTAG, 0);
	}
	public LTAG_HTML(): TerminalNode {
		return this.getToken(GrammarParser.LTAG_HTML, 0);
	}
	public htmlElementName(): HtmlElementNameContext {
		return this.getTypedRuleContext(HtmlElementNameContext, 0) as HtmlElementNameContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterSingleTagRule) {
	 		listener.enterSingleTagRule(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitSingleTagRule) {
	 		listener.exitSingleTagRule(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitSingleTagRule) {
			return visitor.visitSingleTagRule(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class HtmlContext extends ParserRuleContext {
	constructor(parser?: GrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
    public get ruleIndex(): number {
    	return GrammarParser.RULE_html;
	}
	public override copyFrom(ctx: HtmlContext): void {
		super.copyFrom(ctx);
	}
}
export class HtmlSingleContext extends HtmlContext {
	public _single!: Single_tagContext;
	constructor(parser: GrammarParser, ctx: HtmlContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public single_tag(): Single_tagContext {
		return this.getTypedRuleContext(Single_tagContext, 0) as Single_tagContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterHtmlSingle) {
	 		listener.enterHtmlSingle(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitHtmlSingle) {
	 		listener.exitHtmlSingle(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitHtmlSingle) {
			return visitor.visitHtmlSingle(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class HtmlElementContext extends HtmlContext {
	public _open!: Open_tagContext;
	public _html!: HtmlContext;
	public _inner: HtmlContext[] = [];
	public _close!: Close_tagContext;
	constructor(parser: GrammarParser, ctx: HtmlContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public open_tag(): Open_tagContext {
		return this.getTypedRuleContext(Open_tagContext, 0) as Open_tagContext;
	}
	public close_tag(): Close_tagContext {
		return this.getTypedRuleContext(Close_tagContext, 0) as Close_tagContext;
	}
	public html_list(): HtmlContext[] {
		return this.getTypedRuleContexts(HtmlContext) as HtmlContext[];
	}
	public html(i: number): HtmlContext {
		return this.getTypedRuleContext(HtmlContext, i) as HtmlContext;
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterHtmlElement) {
	 		listener.enterHtmlElement(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitHtmlElement) {
	 		listener.exitHtmlElement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitHtmlElement) {
			return visitor.visitHtmlElement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class HtmlBlockContext extends HtmlContext {
	public _block!: Token;
	public _statement!: StatementContext;
	public _stmts: StatementContext[] = [];
	constructor(parser: GrammarParser, ctx: HtmlContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public LBRACE_HTML(): TerminalNode {
		return this.getToken(GrammarParser.LBRACE_HTML, 0);
	}
	public RBRACE_HTML(): TerminalNode {
		return this.getToken(GrammarParser.RBRACE_HTML, 0);
	}
	public statement_list(): StatementContext[] {
		return this.getTypedRuleContexts(StatementContext) as StatementContext[];
	}
	public statement(i: number): StatementContext {
		return this.getTypedRuleContext(StatementContext, i) as StatementContext;
	}
	public RBRACE_list(): TerminalNode[] {
	    	return this.getTokens(GrammarParser.RBRACE);
	}
	public RBRACE(i: number): TerminalNode {
		return this.getToken(GrammarParser.RBRACE, i);
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterHtmlBlock) {
	 		listener.enterHtmlBlock(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitHtmlBlock) {
	 		listener.exitHtmlBlock(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitHtmlBlock) {
			return visitor.visitHtmlBlock(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class HtmlTextContext extends HtmlContext {
	public _text!: Token;
	constructor(parser: GrammarParser, ctx: HtmlContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public TEXT_HTML(): TerminalNode {
		return this.getToken(GrammarParser.TEXT_HTML, 0);
	}
	public enterRule(listener: GrammarParserListener): void {
	    if(listener.enterHtmlText) {
	 		listener.enterHtmlText(this);
		}
	}
	public exitRule(listener: GrammarParserListener): void {
	    if(listener.exitHtmlText) {
	 		listener.exitHtmlText(this);
		}
	}
	// @Override
	public accept<Result>(visitor: GrammarParserVisitor<Result>): Result {
		if (visitor.visitHtmlText) {
			return visitor.visitHtmlText(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
