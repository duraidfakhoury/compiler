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
	public static readonly IMPORT = 3;
	public static readonly CLASS = 4;
	public static readonly CONST = 5;
	public static readonly LET = 6;
	public static readonly VAR = 7;
	public static readonly FUNCTION = 8;
	public static readonly RETURN = 9;
	public static readonly IF = 10;
	public static readonly ELSE = 11;
	public static readonly FOR = 12;
	public static readonly WHILE = 13;
	public static readonly ARROW = 14;
	public static readonly FROM = 15;
	public static readonly DO = 16;
	public static readonly IN = 17;
	public static readonly EXPORT = 18;
	public static readonly SELECTOR = 19;
	public static readonly COMPONENT = 20;
	public static readonly TEMPLATE = 21;
	public static readonly AS = 22;
	public static readonly TYPE = 23;
	public static readonly OF = 24;
	public static readonly ID = 25;
	public static readonly NUMBER = 26;
	public static readonly STRING = 27;
	public static readonly ASSIGN = 28;
	public static readonly PLUS = 29;
	public static readonly MINUS = 30;
	public static readonly MULT = 31;
	public static readonly DOUBLE_ASSIGN = 32;
	public static readonly NOT_EQUAL = 33;
	public static readonly DOUBLE_ASSIGN_ID = 34;
	public static readonly LBRACE = 35;
	public static readonly RBRACE = 36;
	public static readonly LBRACKET = 37;
	public static readonly RBRACKET = 38;
	public static readonly COLON = 39;
	public static readonly COMMA = 40;
	public static readonly SEMICOLON = 41;
	public static readonly DOT = 42;
	public static readonly WHITESPACE = 43;
	public static readonly COMMENT = 44;
	public static readonly LPAREN = 45;
	public static readonly RPAREN = 46;
	public static readonly LTAG = 47;
	public static readonly RTAG = 48;
	public static readonly SLASH = 49;
	public static readonly PLUSPLUS = 50;
	public static readonly MINUSMINUS = 51;
	public static readonly QMARK = 52;
	public static readonly EMARK = 53;
	public static readonly DOUBLE_QMARK = 54;
	public static readonly OR = 55;
	public static readonly AND = 56;
	public static readonly BACKTICK = 57;
	public static readonly LTAG_HTML = 58;
	public static readonly LBRACE_HTML = 59;
	public static readonly RBRACE_HTML = 60;
	public static readonly BACKTICK_HTML = 61;
	public static readonly TEXT_HTML = 62;
	public static readonly WS = 63;
	public static readonly DIV = 64;
	public static readonly P = 65;
	public static readonly H1 = 66;
	public static readonly H2 = 67;
	public static readonly H3 = 68;
	public static readonly H4 = 69;
	public static readonly H5 = 70;
	public static readonly H6 = 71;
	public static readonly BUTTON = 72;
	public static readonly SPAN = 73;
	public static readonly A = 74;
	public static readonly IMG = 75;
	public static readonly INPUT = 76;
	public static readonly FORM = 77;
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
                                                            "'*ngIf'", "'import'", 
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
                                                            "'of'", null, 
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
                                                             "NG_IF", "IMPORT", 
                                                             "CLASS", "CONST", 
                                                             "LET", "VAR", 
                                                             "FUNCTION", 
                                                             "RETURN", "IF", 
                                                             "ELSE", "FOR", 
                                                             "WHILE", "ARROW", 
                                                             "FROM", "DO", 
                                                             "IN", "EXPORT", 
                                                             "SELECTOR", 
                                                             "COMPONENT", 
                                                             "TEMPLATE", 
                                                             "AS", "TYPE", 
                                                             "OF", "ID", 
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
			} while ((((_la) & ~0x1F) === 0 && ((1 << _la) & 244660216) !== 0) || ((((_la - 35)) & ~0x1F) === 0 && ((1 << (_la - 35)) & 231052309) !== 0));
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
		let _la: number;
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
				_la = this._input.LA(1);
				if (_la===41) {
					{
					this.state = 96;
					this.match(GrammarParser.SEMICOLON);
					}
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
				_la = this._input.LA(1);
				if (_la===41) {
					{
					this.state = 100;
					this.match(GrammarParser.SEMICOLON);
					}
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
				_la = this._input.LA(1);
				if (_la===41) {
					{
					this.state = 104;
					this.match(GrammarParser.SEMICOLON);
					}
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
				_la = this._input.LA(1);
				if (_la===41) {
					{
					this.state = 108;
					this.match(GrammarParser.SEMICOLON);
					}
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
				_la = this._input.LA(1);
				if (_la===41) {
					{
					this.state = 112;
					this.match(GrammarParser.SEMICOLON);
					}
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
				_la = this._input.LA(1);
				if (_la===41) {
					{
					this.state = 116;
					this.match(GrammarParser.SEMICOLON);
					}
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
				_la = this._input.LA(1);
				if (_la===41) {
					{
					this.state = 120;
					this.match(GrammarParser.SEMICOLON);
					}
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
				_la = this._input.LA(1);
				if (_la===41) {
					{
					this.state = 130;
					this.match(GrammarParser.SEMICOLON);
					}
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
			while (((((_la - 32)) & ~0x1F) === 0 && ((1 << (_la - 32)) & 7) !== 0)) {
				{
				{
				this.state = 141;
				(localctx as IfBodyRuleContext).__tset214 = this._input.LT(1);
				_la = this._input.LA(1);
				if(!(((((_la - 32)) & ~0x1F) === 0 && ((1 << (_la - 32)) & 7) !== 0))) {
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
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & 244660216) !== 0) || ((((_la - 35)) & ~0x1F) === 0 && ((1 << (_la - 35)) & 231052309) !== 0)) {
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
			_la = this._input.LA(1);
			if (_la===11) {
				{
				this.state = 166;
				this.match(GrammarParser.ELSE);
				this.state = 167;
				(localctx as IfStatementRuleContext)._elseBlock = this.match(GrammarParser.LBRACE);
				this.state = 171;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while ((((_la) & ~0x1F) === 0 && ((1 << _la) & 244660216) !== 0) || ((((_la - 35)) & ~0x1F) === 0 && ((1 << (_la - 35)) & 231052309) !== 0)) {
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
				while ((((_la) & ~0x1F) === 0 && ((1 << _la) & 244660216) !== 0) || ((((_la - 35)) & ~0x1F) === 0 && ((1 << (_la - 35)) & 231052309) !== 0)) {
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
					if(!(_la===35 || _la===59)) {
					    (localctx as WhileLoopContext)._block = this._errHandler.recoverInline(this);
					}
					else {
						this._errHandler.reportMatch(this);
					    this.consume();
					}
					this.state = 199;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while ((((_la) & ~0x1F) === 0 && ((1 << _la) & 244660216) !== 0) || ((((_la - 35)) & ~0x1F) === 0 && ((1 << (_la - 35)) & 231052309) !== 0)) {
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
					if(!(_la===36 || _la===60)) {
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
				if (_la===25) {
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
				if ((((_la) & ~0x1F) === 0 && ((1 << _la) & 234881024) !== 0) || ((((_la - 35)) & ~0x1F) === 0 && ((1 << (_la - 35)) & 71664661) !== 0)) {
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
				if ((((_la) & ~0x1F) === 0 && ((1 << _la) & 234881024) !== 0) || ((((_la - 35)) & ~0x1F) === 0 && ((1 << (_la - 35)) & 71664661) !== 0)) {
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
				while ((((_la) & ~0x1F) === 0 && ((1 << _la) & 244660216) !== 0) || ((((_la - 35)) & ~0x1F) === 0 && ((1 << (_la - 35)) & 231052309) !== 0)) {
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
				if ((((_la) & ~0x1F) === 0 && ((1 << _la) & 234881024) !== 0) || ((((_la - 35)) & ~0x1F) === 0 && ((1 << (_la - 35)) & 71664661) !== 0)) {
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
				if ((((_la) & ~0x1F) === 0 && ((1 << _la) & 234881024) !== 0) || ((((_la - 35)) & ~0x1F) === 0 && ((1 << (_la - 35)) & 71664661) !== 0)) {
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
				while ((((_la) & ~0x1F) === 0 && ((1 << _la) & 244660216) !== 0) || ((((_la - 35)) & ~0x1F) === 0 && ((1 << (_la - 35)) & 231052309) !== 0)) {
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
				while ((((_la) & ~0x1F) === 0 && ((1 << _la) & 244660216) !== 0) || ((((_la - 35)) & ~0x1F) === 0 && ((1 << (_la - 35)) & 231052309) !== 0)) {
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
				while ((((_la) & ~0x1F) === 0 && ((1 << _la) & 244660216) !== 0) || ((((_la - 35)) & ~0x1F) === 0 && ((1 << (_la - 35)) & 231052309) !== 0)) {
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
			if (_la===25) {
				{
				this.state = 284;
				(localctx as FunctionDeclarationRuleContext)._ID = this.match(GrammarParser.ID);
				(localctx as FunctionDeclarationRuleContext)._params.push((localctx as FunctionDeclarationRuleContext)._ID);
				this.state = 289;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la===40) {
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
			this.state = 328;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case 35:
			case 39:
				localctx = new FunctionBlockContext(this, localctx);
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 298;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la===39) {
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
				while ((((_la) & ~0x1F) === 0 && ((1 << _la) & 244660216) !== 0) || ((((_la - 35)) & ~0x1F) === 0 && ((1 << (_la - 35)) & 231052309) !== 0)) {
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
			case 25:
			case 45:
				localctx = new FunctionArrowContext(this, localctx);
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 321;
				this._errHandler.sync(this);
				switch (this._input.LA(1)) {
				case 45:
					{
					{
					this.state = 308;
					this.match(GrammarParser.LPAREN);
					this.state = 317;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la===25) {
						{
						this.state = 309;
						(localctx as FunctionArrowContext)._ID = this.match(GrammarParser.ID);
						(localctx as FunctionArrowContext)._params.push((localctx as FunctionArrowContext)._ID);
						this.state = 314;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						while (_la===40) {
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
				case 25:
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
				if (_la===39) {
					{
					this.state = 323;
					(localctx as FunctionArrowContext)._type_ = this.typeDefine();
					}
				}

				this.state = 326;
				this.match(GrammarParser.ARROW);
				this.state = 327;
				(localctx as FunctionArrowContext)._expr = this.value(0);
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
			this.state = 330;
			(localctx as FunctionCallRuleContext)._funcName = this.match(GrammarParser.ID);
			this.state = 331;
			this.match(GrammarParser.LPAREN);
			this.state = 340;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if ((((_la) & ~0x1F) === 0 && ((1 << _la) & 234881024) !== 0) || ((((_la - 35)) & ~0x1F) === 0 && ((1 << (_la - 35)) & 71664661) !== 0)) {
				{
				this.state = 332;
				(localctx as FunctionCallRuleContext)._value = this.value(0);
				(localctx as FunctionCallRuleContext)._args.push((localctx as FunctionCallRuleContext)._value);
				this.state = 337;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la===40) {
					{
					{
					this.state = 333;
					this.match(GrammarParser.COMMA);
					this.state = 334;
					(localctx as FunctionCallRuleContext)._value = this.value(0);
					(localctx as FunctionCallRuleContext)._args.push((localctx as FunctionCallRuleContext)._value);
					}
					}
					this.state = 339;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				}
			}

			this.state = 342;
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
			this.state = 344;
			(localctx as VarDeclarationRuleContext)._kind = this._input.LT(1);
			_la = this._input.LA(1);
			if(!((((_la) & ~0x1F) === 0 && ((1 << _la) & 224) !== 0))) {
			    (localctx as VarDeclarationRuleContext)._kind = this._errHandler.recoverInline(this);
			}
			else {
				this._errHandler.reportMatch(this);
			    this.consume();
			}
			this.state = 345;
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
		let _la: number;
		try {
			localctx = new VarAssignRuleContext(this, localctx);
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 347;
			(localctx as VarAssignRuleContext)._varName = this.match(GrammarParser.ID);
			this.state = 349;
			this._errHandler.sync(this);
			switch ( this._interp.adaptivePredict(this._input, 39, this._ctx) ) {
			case 1:
				{
				this.state = 348;
				(localctx as VarAssignRuleContext)._type_ = this.typeDefine();
				}
				break;
			}
			this.state = 353;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la===28) {
				{
				this.state = 351;
				this.match(GrammarParser.ASSIGN);
				this.state = 352;
				(localctx as VarAssignRuleContext)._expr = this.value(0);
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
	public importStatement(): ImportStatementContext {
		let localctx: ImportStatementContext = new ImportStatementContext(this, this._ctx, this.state);
		this.enterRule(localctx, 22, GrammarParser.RULE_importStatement);
		try {
			localctx = new ImportRuleContext(this, localctx);
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 355;
			this.match(GrammarParser.IMPORT);
			this.state = 358;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case 25:
				{
				this.state = 356;
				(localctx as ImportRuleContext)._def = this.defaultImport();
				}
				break;
			case 35:
			case 59:
				{
				this.state = 357;
				(localctx as ImportRuleContext)._named = this.namedImports();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			this.state = 360;
			this.match(GrammarParser.FROM);
			this.state = 361;
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
			this.state = 363;
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
			this.state = 365;
			_la = this._input.LA(1);
			if(!(_la===35 || _la===59)) {
			this._errHandler.recoverInline(this);
			}
			else {
				this._errHandler.reportMatch(this);
			    this.consume();
			}
			this.state = 366;
			(localctx as NamedImportsRuleContext)._importSpecifier = this.importSpecifier();
			(localctx as NamedImportsRuleContext)._imports.push((localctx as NamedImportsRuleContext)._importSpecifier);
			this.state = 371;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la===40) {
				{
				{
				this.state = 367;
				this.match(GrammarParser.COMMA);
				this.state = 368;
				(localctx as NamedImportsRuleContext)._importSpecifier = this.importSpecifier();
				(localctx as NamedImportsRuleContext)._imports.push((localctx as NamedImportsRuleContext)._importSpecifier);
				}
				}
				this.state = 373;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 374;
			_la = this._input.LA(1);
			if(!(_la===36 || _la===60)) {
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
			this.state = 376;
			(localctx as ImportSpecifierRuleContext)._name = this.match(GrammarParser.ID);
			this.state = 379;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la===22) {
				{
				this.state = 377;
				this.match(GrammarParser.AS);
				this.state = 378;
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
			this.state = 381;
			this.match(GrammarParser.EXPORT);
			this.state = 385;
			this._errHandler.sync(this);
			switch ( this._interp.adaptivePredict(this._input, 44, this._ctx) ) {
			case 1:
				{
				this.state = 382;
				(localctx as ExportRuleContext)._cls = this.classDeclaration();
				}
				break;
			case 2:
				{
				this.state = 383;
				(localctx as ExportRuleContext)._val = this.value(0);
				}
				break;
			case 3:
				{
				this.state = 384;
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
			this.state = 387;
			this.match(GrammarParser.CLASS);
			this.state = 388;
			(localctx as ClassDeclarationRuleContext)._name = this.match(GrammarParser.ID);
			this.state = 389;
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
			this.state = 391;
			this.match(GrammarParser.LBRACE);
			this.state = 395;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & 480) !== 0)) {
				{
				{
				this.state = 392;
				(localctx as ClassBodyRuleContext)._classBodyStatement = this.classBodyStatement();
				(localctx as ClassBodyRuleContext)._stmts.push((localctx as ClassBodyRuleContext)._classBodyStatement);
				}
				}
				this.state = 397;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 398;
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
			this.state = 402;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case 5:
			case 6:
			case 7:
				localctx = new ClassVarDeclContext(this, localctx);
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 400;
				(localctx as ClassVarDeclContext)._var_ = this.variableDeclaration();
				}
				break;
			case 8:
				localctx = new ClassFuncDeclContext(this, localctx);
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 401;
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
			this.state = 404;
			this.match(GrammarParser.COMPONENT);
			this.state = 405;
			this.match(GrammarParser.LPAREN);
			this.state = 406;
			this.match(GrammarParser.LBRACE);
			this.state = 411;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la===19) {
				{
				this.state = 407;
				this.match(GrammarParser.SELECTOR);
				this.state = 408;
				this.match(GrammarParser.COLON);
				this.state = 409;
				(localctx as ComponentRuleContext)._selector = this.match(GrammarParser.STRING);
				this.state = 410;
				this.match(GrammarParser.COMMA);
				}
			}

			this.state = 413;
			this.match(GrammarParser.TEMPLATE);
			this.state = 414;
			this.match(GrammarParser.COLON);
			this.state = 415;
			(localctx as ComponentRuleContext)._template = this.value(0);
			this.state = 422;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la===40) {
				{
				{
				this.state = 416;
				this.match(GrammarParser.COMMA);
				this.state = 417;
				(localctx as ComponentRuleContext)._ID = this.match(GrammarParser.ID);
				(localctx as ComponentRuleContext)._keys.push((localctx as ComponentRuleContext)._ID);
				this.state = 418;
				this.match(GrammarParser.COLON);
				this.state = 419;
				(localctx as ComponentRuleContext)._value = this.value(0);
				(localctx as ComponentRuleContext)._vals.push((localctx as ComponentRuleContext)._value);
				}
				}
				this.state = 424;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 425;
			this.match(GrammarParser.RBRACE);
			this.state = 426;
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
			this.state = 428;
			this.match(GrammarParser.COLON);
			this.state = 429;
			(localctx as TypeDefineRuleContext)._type_ = this.match(GrammarParser.ID);
			this.state = 432;
			this._errHandler.sync(this);
			switch ( this._interp.adaptivePredict(this._input, 49, this._ctx) ) {
			case 1:
				{
				this.state = 430;
				this.match(GrammarParser.LBRACKET);
				this.state = 431;
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
			this.state = 434;
			this.match(GrammarParser.TYPE);
			this.state = 435;
			(localctx as TypeDeclarationRuleContext)._name = this.match(GrammarParser.ID);
			this.state = 436;
			this.match(GrammarParser.ASSIGN);
			this.state = 437;
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
			this.state = 445;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case 25:
				localctx = new TypeSimpleContext(this, localctx);
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 439;
				(localctx as TypeSimpleContext)._type_ = this.match(GrammarParser.ID);
				this.state = 442;
				this._errHandler.sync(this);
				switch ( this._interp.adaptivePredict(this._input, 50, this._ctx) ) {
				case 1:
					{
					this.state = 440;
					this.match(GrammarParser.LBRACKET);
					this.state = 441;
					this.match(GrammarParser.RBRACKET);
					}
					break;
				}
				}
				break;
			case 35:
				localctx = new TypeObjectAssignContext(this, localctx);
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 444;
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
			this.state = 447;
			this.match(GrammarParser.LBRACE);
			this.state = 448;
			(localctx as TypeObjectRuleContext)._typeMember = this.typeMember();
			(localctx as TypeObjectRuleContext)._typeMembers.push((localctx as TypeObjectRuleContext)._typeMember);
			this.state = 452;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la===25) {
				{
				{
				this.state = 449;
				(localctx as TypeObjectRuleContext)._typeMember = this.typeMember();
				(localctx as TypeObjectRuleContext)._typeMembers.push((localctx as TypeObjectRuleContext)._typeMember);
				}
				}
				this.state = 454;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 455;
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
			this.state = 457;
			(localctx as TypeMemberRuleContext)._name = this.match(GrammarParser.ID);
			this.state = 458;
			this.match(GrammarParser.COLON);
			this.state = 459;
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
			this.state = 461;
			this.match(GrammarParser.AS);
			this.state = 462;
			(localctx as AsTypeRuleContext)._type_ = this.match(GrammarParser.ID);
			this.state = 465;
			this._errHandler.sync(this);
			switch ( this._interp.adaptivePredict(this._input, 53, this._ctx) ) {
			case 1:
				{
				this.state = 463;
				this.match(GrammarParser.LBRACKET);
				this.state = 464;
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
			this.state = 485;
			this._errHandler.sync(this);
			switch ( this._interp.adaptivePredict(this._input, 57, this._ctx) ) {
			case 1:
				{
				localctx = new PrimaryValueExprContext(this, localctx);
				this._ctx = localctx;
				_prevctx = localctx;

				this.state = 468;
				(localctx as PrimaryValueExprContext)._pv = this.primaryValue();
				this.state = 470;
				this._errHandler.sync(this);
				switch ( this._interp.adaptivePredict(this._input, 54, this._ctx) ) {
				case 1:
					{
					this.state = 469;
					(localctx as PrimaryValueExprContext)._qm = this._input.LT(1);
					_la = this._input.LA(1);
					if(!(_la===52 || _la===53)) {
					    (localctx as PrimaryValueExprContext)._qm = this._errHandler.recoverInline(this);
					}
					else {
						this._errHandler.reportMatch(this);
					    this.consume();
					}
					}
					break;
				}
				this.state = 473;
				this._errHandler.sync(this);
				switch ( this._interp.adaptivePredict(this._input, 55, this._ctx) ) {
				case 1:
					{
					this.state = 472;
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
				this.state = 475;
				(localctx as ArrowFunctionValueContext)._ID = this.match(GrammarParser.ID);
				(localctx as ArrowFunctionValueContext)._params.push((localctx as ArrowFunctionValueContext)._ID);
				this.state = 480;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la===40) {
					{
					{
					this.state = 476;
					this.match(GrammarParser.COMMA);
					this.state = 477;
					(localctx as ArrowFunctionValueContext)._ID = this.match(GrammarParser.ID);
					(localctx as ArrowFunctionValueContext)._params.push((localctx as ArrowFunctionValueContext)._ID);
					}
					}
					this.state = 482;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 483;
				this.match(GrammarParser.ARROW);
				this.state = 484;
				(localctx as ArrowFunctionValueContext)._body = this.value(1);
				}
				break;
			}
			this._ctx.stop = this._input.LT(-1);
			this.state = 508;
			this._errHandler.sync(this);
			_alt = this._interp.adaptivePredict(this._input, 60, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = localctx;
					{
					this.state = 506;
					this._errHandler.sync(this);
					switch ( this._interp.adaptivePredict(this._input, 59, this._ctx) ) {
					case 1:
						{
						localctx = new BinaryValueContext(this, new ValueContext(this, _parentctx, _parentState));
						(localctx as BinaryValueContext)._left = _prevctx;
						this.pushNewRecursionContext(localctx, _startState, GrammarParser.RULE_value);
						this.state = 487;
						if (!(this.precpred(this._ctx, 5))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 5)");
						}
						this.state = 488;
						(localctx as BinaryValueContext)._op = this.binaryOp();
						this.state = 489;
						(localctx as BinaryValueContext)._right = this.value(6);
						}
						break;
					case 2:
						{
						localctx = new PropertyAccessValueContext(this, new ValueContext(this, _parentctx, _parentState));
						(localctx as PropertyAccessValueContext)._left = _prevctx;
						this.pushNewRecursionContext(localctx, _startState, GrammarParser.RULE_value);
						this.state = 491;
						if (!(this.precpred(this._ctx, 3))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 3)");
						}
						this.state = 492;
						this.match(GrammarParser.DOT);
						this.state = 493;
						(localctx as PropertyAccessValueContext)._right = this.value(4);
						}
						break;
					case 3:
						{
						localctx = new MethodCallValueContext(this, new ValueContext(this, _parentctx, _parentState));
						(localctx as MethodCallValueContext)._left = _prevctx;
						this.pushNewRecursionContext(localctx, _startState, GrammarParser.RULE_value);
						this.state = 494;
						if (!(this.precpred(this._ctx, 2))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 2)");
						}
						this.state = 495;
						this.match(GrammarParser.LPAREN);
						this.state = 496;
						(localctx as MethodCallValueContext)._value = this.value(0);
						(localctx as MethodCallValueContext)._args.push((localctx as MethodCallValueContext)._value);
						this.state = 501;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						while (_la===40) {
							{
							{
							this.state = 497;
							this.match(GrammarParser.COMMA);
							this.state = 498;
							(localctx as MethodCallValueContext)._value = this.value(0);
							(localctx as MethodCallValueContext)._args.push((localctx as MethodCallValueContext)._value);
							}
							}
							this.state = 503;
							this._errHandler.sync(this);
							_la = this._input.LA(1);
						}
						this.state = 504;
						this.match(GrammarParser.RPAREN);
						}
						break;
					}
					}
				}
				this.state = 510;
				this._errHandler.sync(this);
				_alt = this._interp.adaptivePredict(this._input, 60, this._ctx);
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
			this.state = 535;
			this._errHandler.sync(this);
			switch ( this._interp.adaptivePredict(this._input, 62, this._ctx) ) {
			case 1:
				localctx = new NumberValueContext(this, localctx);
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 511;
				(localctx as NumberValueContext)._num = this.match(GrammarParser.NUMBER);
				}
				break;
			case 2:
				localctx = new StringValueContext(this, localctx);
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 512;
				(localctx as StringValueContext)._str = this.match(GrammarParser.STRING);
				}
				break;
			case 3:
				localctx = new CallValueContext(this, localctx);
				this.enterOuterAlt(localctx, 3);
				{
				this.state = 513;
				(localctx as CallValueContext)._call = this.functionCall();
				}
				break;
			case 4:
				localctx = new IdValueContext(this, localctx);
				this.enterOuterAlt(localctx, 4);
				{
				this.state = 514;
				(localctx as IdValueContext)._id = this.match(GrammarParser.ID);
				}
				break;
			case 5:
				localctx = new ParenValueContext(this, localctx);
				this.enterOuterAlt(localctx, 5);
				{
				this.state = 515;
				this.match(GrammarParser.LPAREN);
				this.state = 516;
				(localctx as ParenValueContext)._inner = this.value(0);
				this.state = 517;
				this.match(GrammarParser.RPAREN);
				}
				break;
			case 6:
				localctx = new ObjectValueContext(this, localctx);
				this.enterOuterAlt(localctx, 6);
				{
				this.state = 519;
				(localctx as ObjectValueContext)._obj = this.object();
				}
				break;
			case 7:
				localctx = new ArrayValueContext(this, localctx);
				this.enterOuterAlt(localctx, 7);
				{
				this.state = 520;
				(localctx as ArrayValueContext)._arr = this.array();
				}
				break;
			case 8:
				localctx = new ArrayAccessValueContext(this, localctx);
				this.enterOuterAlt(localctx, 8);
				{
				this.state = 521;
				(localctx as ArrayAccessValueContext)._access = this.arrayAccess();
				}
				break;
			case 9:
				localctx = new FunctionValueContext(this, localctx);
				this.enterOuterAlt(localctx, 9);
				{
				this.state = 522;
				(localctx as FunctionValueContext)._body = this.functionBody();
				}
				break;
			case 10:
				localctx = new IncValueContext(this, localctx);
				this.enterOuterAlt(localctx, 10);
				{
				this.state = 523;
				(localctx as IncValueContext)._inc = this.increase_variable();
				}
				break;
			case 11:
				localctx = new DecValueContext(this, localctx);
				this.enterOuterAlt(localctx, 11);
				{
				this.state = 524;
				(localctx as DecValueContext)._dec = this.decrease_variable();
				}
				break;
			case 12:
				localctx = new NegationValueContext(this, localctx);
				this.enterOuterAlt(localctx, 12);
				{
				this.state = 525;
				this.match(GrammarParser.EMARK);
				this.state = 526;
				(localctx as NegationValueContext)._right = this.value(0);
				}
				break;
			case 13:
				localctx = new TemplateValueContext(this, localctx);
				this.enterOuterAlt(localctx, 13);
				{
				this.state = 527;
				(localctx as TemplateValueContext)._bt = this._input.LT(1);
				_la = this._input.LA(1);
				if(!(_la===57 || _la===61)) {
				    (localctx as TemplateValueContext)._bt = this._errHandler.recoverInline(this);
				}
				else {
					this._errHandler.reportMatch(this);
				    this.consume();
				}
				this.state = 531;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (((((_la - 47)) & ~0x1F) === 0 && ((1 << (_la - 47)) & 38913) !== 0)) {
					{
					{
					this.state = 528;
					(localctx as TemplateValueContext)._html = this.html();
					(localctx as TemplateValueContext)._content.push((localctx as TemplateValueContext)._html);
					}
					}
					this.state = 533;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 534;
				_la = this._input.LA(1);
				if(!(_la===57 || _la===61)) {
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
			this.state = 555;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case 32:
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 537;
				this.match(GrammarParser.DOUBLE_ASSIGN);
				}
				break;
			case 34:
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 538;
				this.match(GrammarParser.DOUBLE_ASSIGN_ID);
				}
				break;
			case 33:
				this.enterOuterAlt(localctx, 3);
				{
				this.state = 539;
				this.match(GrammarParser.NOT_EQUAL);
				}
				break;
			case 55:
				this.enterOuterAlt(localctx, 4);
				{
				this.state = 540;
				this.match(GrammarParser.OR);
				}
				break;
			case 56:
				this.enterOuterAlt(localctx, 5);
				{
				this.state = 541;
				this.match(GrammarParser.AND);
				}
				break;
			case 54:
				this.enterOuterAlt(localctx, 6);
				{
				this.state = 542;
				this.match(GrammarParser.DOUBLE_QMARK);
				}
				break;
			case 48:
				this.enterOuterAlt(localctx, 7);
				{
				{
				this.state = 543;
				this.match(GrammarParser.RTAG);
				this.state = 545;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la===28 || _la===32) {
					{
					this.state = 544;
					_la = this._input.LA(1);
					if(!(_la===28 || _la===32)) {
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
			case 47:
			case 58:
				this.enterOuterAlt(localctx, 8);
				{
				{
				this.state = 547;
				_la = this._input.LA(1);
				if(!(_la===47 || _la===58)) {
				this._errHandler.recoverInline(this);
				}
				else {
					this._errHandler.reportMatch(this);
				    this.consume();
				}
				this.state = 549;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la===28 || _la===32) {
					{
					this.state = 548;
					_la = this._input.LA(1);
					if(!(_la===28 || _la===32)) {
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
			case 29:
				this.enterOuterAlt(localctx, 9);
				{
				this.state = 551;
				this.match(GrammarParser.PLUS);
				}
				break;
			case 30:
				this.enterOuterAlt(localctx, 10);
				{
				this.state = 552;
				this.match(GrammarParser.MINUS);
				}
				break;
			case 31:
				this.enterOuterAlt(localctx, 11);
				{
				this.state = 553;
				this.match(GrammarParser.MULT);
				}
				break;
			case 49:
				this.enterOuterAlt(localctx, 12);
				{
				this.state = 554;
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
			this.state = 561;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case 25:
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 557;
				localctx._id = this.match(GrammarParser.ID);
				this.state = 558;
				this.match(GrammarParser.PLUSPLUS);
				}
				break;
			case 50:
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 559;
				this.match(GrammarParser.PLUSPLUS);
				this.state = 560;
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
			this.state = 567;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case 25:
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 563;
				localctx._id = this.match(GrammarParser.ID);
				this.state = 564;
				this.match(GrammarParser.MINUSMINUS);
				}
				break;
			case 51:
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 565;
				this.match(GrammarParser.MINUSMINUS);
				this.state = 566;
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
			this.state = 585;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case 34:
				localctx = new IdEqComparisonContext(this, localctx);
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 569;
				this.match(GrammarParser.DOUBLE_ASSIGN_ID);
				this.state = 570;
				(localctx as IdEqComparisonContext)._right = this.value(0);
				}
				break;
			case 32:
				localctx = new EqComparisonContext(this, localctx);
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 571;
				this.match(GrammarParser.DOUBLE_ASSIGN);
				this.state = 572;
				(localctx as EqComparisonContext)._right = this.value(0);
				}
				break;
			case 33:
				localctx = new NeqComparisonContext(this, localctx);
				this.enterOuterAlt(localctx, 3);
				{
				this.state = 573;
				this.match(GrammarParser.NOT_EQUAL);
				this.state = 574;
				(localctx as NeqComparisonContext)._right = this.value(0);
				}
				break;
			case 48:
				localctx = new RtagComparisonContext(this, localctx);
				this.enterOuterAlt(localctx, 4);
				{
				this.state = 575;
				this.match(GrammarParser.RTAG);
				this.state = 577;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la===28 || _la===32) {
					{
					this.state = 576;
					_la = this._input.LA(1);
					if(!(_la===28 || _la===32)) {
					this._errHandler.recoverInline(this);
					}
					else {
						this._errHandler.reportMatch(this);
					    this.consume();
					}
					}
				}

				this.state = 579;
				(localctx as RtagComparisonContext)._right = this.value(0);
				}
				break;
			case 47:
			case 58:
				localctx = new LtagComparisonContext(this, localctx);
				this.enterOuterAlt(localctx, 5);
				{
				this.state = 580;
				_la = this._input.LA(1);
				if(!(_la===47 || _la===58)) {
				this._errHandler.recoverInline(this);
				}
				else {
					this._errHandler.reportMatch(this);
				    this.consume();
				}
				this.state = 582;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la===28 || _la===32) {
					{
					this.state = 581;
					_la = this._input.LA(1);
					if(!(_la===28 || _la===32)) {
					this._errHandler.recoverInline(this);
					}
					else {
						this._errHandler.reportMatch(this);
					    this.consume();
					}
					}
				}

				this.state = 584;
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
			this.state = 587;
			this.match(GrammarParser.LBRACE);
			this.state = 588;
			(localctx as ObjectRuleContext)._pair = this.pair();
			(localctx as ObjectRuleContext)._pairs.push((localctx as ObjectRuleContext)._pair);
			this.state = 593;
			this._errHandler.sync(this);
			_alt = this._interp.adaptivePredict(this._input, 71, this._ctx);
			while (_alt !== 1 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1 + 1) {
					{
					{
					this.state = 589;
					this.match(GrammarParser.COMMA);
					this.state = 590;
					(localctx as ObjectRuleContext)._pair = this.pair();
					(localctx as ObjectRuleContext)._pairs.push((localctx as ObjectRuleContext)._pair);
					}
					}
				}
				this.state = 595;
				this._errHandler.sync(this);
				_alt = this._interp.adaptivePredict(this._input, 71, this._ctx);
			}
			this.state = 596;
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
			this.state = 598;
			(localctx as PairRuleContext)._key = this.match(GrammarParser.ID);
			this.state = 599;
			this.match(GrammarParser.COLON);
			this.state = 600;
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
			this.state = 602;
			this.match(GrammarParser.LBRACKET);
			this.state = 611;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if ((((_la) & ~0x1F) === 0 && ((1 << _la) & 234881024) !== 0) || ((((_la - 35)) & ~0x1F) === 0 && ((1 << (_la - 35)) & 71664661) !== 0)) {
				{
				this.state = 603;
				(localctx as ArrayRuleContext)._value = this.value(0);
				(localctx as ArrayRuleContext)._elems.push((localctx as ArrayRuleContext)._value);
				this.state = 608;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la===40) {
					{
					{
					this.state = 604;
					this.match(GrammarParser.COMMA);
					this.state = 605;
					(localctx as ArrayRuleContext)._value = this.value(0);
					(localctx as ArrayRuleContext)._elems.push((localctx as ArrayRuleContext)._value);
					}
					}
					this.state = 610;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				}
			}

			this.state = 613;
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
			this.state = 615;
			(localctx as ArrayAccessRuleContext)._arr = this.match(GrammarParser.ID);
			this.state = 616;
			this.match(GrammarParser.LBRACKET);
			this.state = 617;
			(localctx as ArrayAccessRuleContext)._idx = this.value(0);
			this.state = 618;
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
			this.state = 620;
			_la = this._input.LA(1);
			if(!(_la===25 || ((((_la - 64)) & ~0x1F) === 0 && ((1 << (_la - 64)) & 16383) !== 0))) {
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
			this.state = 622;
			_la = this._input.LA(1);
			if(!(_la===47 || _la===58)) {
			this._errHandler.recoverInline(this);
			}
			else {
				this._errHandler.reportMatch(this);
			    this.consume();
			}
			this.state = 623;
			(localctx as OpenTagRuleContext)._name = this.htmlElementName();
			this.state = 627;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & 33554438) !== 0)) {
				{
				{
				this.state = 624;
				this.attributes();
				}
				}
				this.state = 629;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 630;
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
			this.state = 633;
			this._errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					this.state = 632;
					this.attribute();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				this.state = 635;
				this._errHandler.sync(this);
				_alt = this._interp.adaptivePredict(this._input, 75, this._ctx);
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
			this.state = 654;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case 1:
				localctx = new NgForAttributeRuleContext(this, localctx);
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 637;
				this.match(GrammarParser.NG_FOR);
				this.state = 638;
				this.match(GrammarParser.ASSIGN);
				this.state = 639;
				this.match(GrammarParser.BACKTICK);
				this.state = 640;
				this.match(GrammarParser.LET);
				this.state = 641;
				(localctx as NgForAttributeRuleContext)._varName = this.match(GrammarParser.ID);
				this.state = 642;
				this.match(GrammarParser.OF);
				this.state = 643;
				(localctx as NgForAttributeRuleContext)._collection = this.match(GrammarParser.ID);
				this.state = 644;
				this.match(GrammarParser.BACKTICK);
				}
				break;
			case 2:
				localctx = new NgIfAttributeRuleContext(this, localctx);
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 645;
				this.match(GrammarParser.NG_IF);
				this.state = 646;
				this.match(GrammarParser.ASSIGN);
				this.state = 647;
				this.match(GrammarParser.BACKTICK);
				this.state = 648;
				(localctx as NgIfAttributeRuleContext)._condition = this.value(0);
				this.state = 649;
				this.match(GrammarParser.BACKTICK);
				}
				break;
			case 25:
				localctx = new RegularAttributeContext(this, localctx);
				this.enterOuterAlt(localctx, 3);
				{
				this.state = 651;
				(localctx as RegularAttributeContext)._name = this.match(GrammarParser.ID);
				this.state = 652;
				this.match(GrammarParser.ASSIGN);
				this.state = 653;
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
			this.state = 658;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case 27:
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 656;
				this.match(GrammarParser.STRING);
				}
				break;
			case 35:
			case 59:
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 657;
				this.interpolation();
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
	public interpolation(): InterpolationContext {
		let localctx: InterpolationContext = new InterpolationContext(this, this._ctx, this.state);
		this.enterRule(localctx, 82, GrammarParser.RULE_interpolation);
		let _la: number;
		try {
			this.state = 688;
			this._errHandler.sync(this);
			switch ( this._interp.adaptivePredict(this._input, 83, this._ctx) ) {
			case 1:
				localctx = new SimpleInterpolationContext(this, localctx);
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 663;
				this._errHandler.sync(this);
				switch (this._input.LA(1)) {
				case 59:
					{
					this.state = 660;
					this.match(GrammarParser.LBRACE_HTML);
					}
					break;
				case 35:
					{
					{
					this.state = 661;
					this.match(GrammarParser.LBRACE);
					this.state = 662;
					this.match(GrammarParser.LBRACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				this.state = 665;
				(localctx as SimpleInterpolationContext)._expr = this.value(0);
				this.state = 669;
				this._errHandler.sync(this);
				switch (this._input.LA(1)) {
				case 60:
					{
					this.state = 666;
					this.match(GrammarParser.RBRACE_HTML);
					}
					break;
				case 36:
					{
					{
					this.state = 667;
					this.match(GrammarParser.RBRACE);
					this.state = 668;
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
				this.state = 674;
				this._errHandler.sync(this);
				switch (this._input.LA(1)) {
				case 59:
					{
					this.state = 671;
					this.match(GrammarParser.LBRACE_HTML);
					}
					break;
				case 35:
					{
					{
					this.state = 672;
					this.match(GrammarParser.LBRACE);
					this.state = 673;
					this.match(GrammarParser.LBRACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				this.state = 676;
				this.match(GrammarParser.LBRACE_HTML);
				this.state = 680;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (((((_la - 47)) & ~0x1F) === 0 && ((1 << (_la - 47)) & 38913) !== 0)) {
					{
					{
					this.state = 677;
					(localctx as NestedTemplateInterpolationContext)._html = this.html();
					(localctx as NestedTemplateInterpolationContext)._nested.push((localctx as NestedTemplateInterpolationContext)._html);
					}
					}
					this.state = 682;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 686;
				this._errHandler.sync(this);
				switch (this._input.LA(1)) {
				case 60:
					{
					this.state = 683;
					this.match(GrammarParser.RBRACE_HTML);
					}
					break;
				case 36:
					{
					{
					this.state = 684;
					this.match(GrammarParser.RBRACE);
					this.state = 685;
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
			this.state = 690;
			_la = this._input.LA(1);
			if(!(_la===47 || _la===58)) {
			this._errHandler.recoverInline(this);
			}
			else {
				this._errHandler.reportMatch(this);
			    this.consume();
			}
			this.state = 691;
			this.match(GrammarParser.SLASH);
			this.state = 692;
			(localctx as CloseTagRuleContext)._name = this.htmlElementName();
			this.state = 693;
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
			this.state = 695;
			_la = this._input.LA(1);
			if(!(_la===47 || _la===58)) {
			this._errHandler.recoverInline(this);
			}
			else {
				this._errHandler.reportMatch(this);
			    this.consume();
			}
			this.state = 696;
			(localctx as SingleTagRuleContext)._name = this.htmlElementName();
			this.state = 697;
			this.match(GrammarParser.SLASH);
			this.state = 698;
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
			this.state = 723;
			this._errHandler.sync(this);
			switch ( this._interp.adaptivePredict(this._input, 87, this._ctx) ) {
			case 1:
				localctx = new HtmlElementContext(this, localctx);
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 700;
				(localctx as HtmlElementContext)._open = this.open_tag();
				this.state = 704;
				this._errHandler.sync(this);
				_alt = this._interp.adaptivePredict(this._input, 84, this._ctx);
				while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
					if (_alt === 1) {
						{
						{
						this.state = 701;
						(localctx as HtmlElementContext)._html = this.html();
						(localctx as HtmlElementContext)._inner.push((localctx as HtmlElementContext)._html);
						}
						}
					}
					this.state = 706;
					this._errHandler.sync(this);
					_alt = this._interp.adaptivePredict(this._input, 84, this._ctx);
				}
				this.state = 707;
				(localctx as HtmlElementContext)._close = this.close_tag();
				}
				break;
			case 2:
				localctx = new HtmlSingleContext(this, localctx);
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 709;
				(localctx as HtmlSingleContext)._single = this.single_tag();
				}
				break;
			case 3:
				localctx = new HtmlBlockContext(this, localctx);
				this.enterOuterAlt(localctx, 3);
				{
				this.state = 710;
				(localctx as HtmlBlockContext)._block = this.match(GrammarParser.LBRACE_HTML);
				this.state = 714;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while ((((_la) & ~0x1F) === 0 && ((1 << _la) & 244660216) !== 0) || ((((_la - 35)) & ~0x1F) === 0 && ((1 << (_la - 35)) & 231052309) !== 0)) {
					{
					{
					this.state = 711;
					(localctx as HtmlBlockContext)._statement = this.statement();
					(localctx as HtmlBlockContext)._stmts.push((localctx as HtmlBlockContext)._statement);
					}
					}
					this.state = 716;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 720;
				this._errHandler.sync(this);
				switch (this._input.LA(1)) {
				case 60:
					{
					this.state = 717;
					this.match(GrammarParser.RBRACE_HTML);
					}
					break;
				case 36:
					{
					{
					this.state = 718;
					this.match(GrammarParser.RBRACE);
					this.state = 719;
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
				this.state = 722;
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
			return this.precpred(this._ctx, 5);
		case 1:
			return this.precpred(this._ctx, 3);
		case 2:
			return this.precpred(this._ctx, 2);
		}
		return true;
	}

	public static readonly _serializedATN: number[] = [4,1,77,726,2,0,7,0,2,
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
	8,7,1,7,1,7,3,7,329,8,7,1,8,1,8,1,8,1,8,1,8,5,8,336,8,8,10,8,12,8,339,9,
	8,3,8,341,8,8,1,8,1,8,1,9,1,9,1,9,1,10,1,10,3,10,350,8,10,1,10,1,10,3,10,
	354,8,10,1,11,1,11,1,11,3,11,359,8,11,1,11,1,11,1,11,1,12,1,12,1,13,1,13,
	1,13,1,13,5,13,370,8,13,10,13,12,13,373,9,13,1,13,1,13,1,14,1,14,1,14,3,
	14,380,8,14,1,15,1,15,1,15,1,15,3,15,386,8,15,1,16,1,16,1,16,1,16,1,17,
	1,17,5,17,394,8,17,10,17,12,17,397,9,17,1,17,1,17,1,18,1,18,3,18,403,8,
	18,1,19,1,19,1,19,1,19,1,19,1,19,1,19,3,19,412,8,19,1,19,1,19,1,19,1,19,
	1,19,1,19,1,19,5,19,421,8,19,10,19,12,19,424,9,19,1,19,1,19,1,19,1,20,1,
	20,1,20,1,20,3,20,433,8,20,1,21,1,21,1,21,1,21,1,21,1,22,1,22,1,22,3,22,
	443,8,22,1,22,3,22,446,8,22,1,23,1,23,1,23,5,23,451,8,23,10,23,12,23,454,
	9,23,1,23,1,23,1,24,1,24,1,24,1,24,1,25,1,25,1,25,1,25,3,25,466,8,25,1,
	26,1,26,1,26,3,26,471,8,26,1,26,3,26,474,8,26,1,26,1,26,1,26,5,26,479,8,
	26,10,26,12,26,482,9,26,1,26,1,26,3,26,486,8,26,1,26,1,26,1,26,1,26,1,26,
	1,26,1,26,1,26,1,26,1,26,1,26,1,26,5,26,500,8,26,10,26,12,26,503,9,26,1,
	26,1,26,5,26,507,8,26,10,26,12,26,510,9,26,1,27,1,27,1,27,1,27,1,27,1,27,
	1,27,1,27,1,27,1,27,1,27,1,27,1,27,1,27,1,27,1,27,1,27,1,27,5,27,530,8,
	27,10,27,12,27,533,9,27,1,27,3,27,536,8,27,1,28,1,28,1,28,1,28,1,28,1,28,
	1,28,1,28,3,28,546,8,28,1,28,1,28,3,28,550,8,28,1,28,1,28,1,28,1,28,3,28,
	556,8,28,1,29,1,29,1,29,1,29,3,29,562,8,29,1,30,1,30,1,30,1,30,3,30,568,
	8,30,1,31,1,31,1,31,1,31,1,31,1,31,1,31,1,31,3,31,578,8,31,1,31,1,31,1,
	31,3,31,583,8,31,1,31,3,31,586,8,31,1,32,1,32,1,32,1,32,5,32,592,8,32,10,
	32,12,32,595,9,32,1,32,1,32,1,33,1,33,1,33,1,33,1,34,1,34,1,34,1,34,5,34,
	607,8,34,10,34,12,34,610,9,34,3,34,612,8,34,1,34,1,34,1,35,1,35,1,35,1,
	35,1,35,1,36,1,36,1,37,1,37,1,37,5,37,626,8,37,10,37,12,37,629,9,37,1,37,
	1,37,1,38,4,38,634,8,38,11,38,12,38,635,1,39,1,39,1,39,1,39,1,39,1,39,1,
	39,1,39,1,39,1,39,1,39,1,39,1,39,1,39,1,39,1,39,1,39,3,39,655,8,39,1,40,
	1,40,3,40,659,8,40,1,41,1,41,1,41,3,41,664,8,41,1,41,1,41,1,41,1,41,3,41,
	670,8,41,1,41,1,41,1,41,3,41,675,8,41,1,41,1,41,5,41,679,8,41,10,41,12,
	41,682,9,41,1,41,1,41,1,41,3,41,687,8,41,3,41,689,8,41,1,42,1,42,1,42,1,
	42,1,42,1,43,1,43,1,43,1,43,1,43,1,44,1,44,5,44,703,8,44,10,44,12,44,706,
	9,44,1,44,1,44,1,44,1,44,1,44,5,44,713,8,44,10,44,12,44,716,9,44,1,44,1,
	44,1,44,3,44,721,8,44,1,44,3,44,724,8,44,1,44,1,593,1,52,45,0,2,4,6,8,10,
	12,14,16,18,20,22,24,26,28,30,32,34,36,38,40,42,44,46,48,50,52,54,56,58,
	60,62,64,66,68,70,72,74,76,78,80,82,84,86,88,0,9,1,0,32,34,2,0,35,35,59,
	59,2,0,36,36,60,60,1,0,5,7,1,0,52,53,2,0,57,57,61,61,2,0,28,28,32,32,2,
	0,47,47,58,58,2,0,25,25,64,77,813,0,91,1,0,0,0,2,133,1,0,0,0,4,135,1,0,
	0,0,6,138,1,0,0,0,8,158,1,0,0,0,10,279,1,0,0,0,12,281,1,0,0,0,14,328,1,
	0,0,0,16,330,1,0,0,0,18,344,1,0,0,0,20,347,1,0,0,0,22,355,1,0,0,0,24,363,
	1,0,0,0,26,365,1,0,0,0,28,376,1,0,0,0,30,381,1,0,0,0,32,387,1,0,0,0,34,
	391,1,0,0,0,36,402,1,0,0,0,38,404,1,0,0,0,40,428,1,0,0,0,42,434,1,0,0,0,
	44,445,1,0,0,0,46,447,1,0,0,0,48,457,1,0,0,0,50,461,1,0,0,0,52,485,1,0,
	0,0,54,535,1,0,0,0,56,555,1,0,0,0,58,561,1,0,0,0,60,567,1,0,0,0,62,585,
	1,0,0,0,64,587,1,0,0,0,66,598,1,0,0,0,68,602,1,0,0,0,70,615,1,0,0,0,72,
	620,1,0,0,0,74,622,1,0,0,0,76,633,1,0,0,0,78,654,1,0,0,0,80,658,1,0,0,0,
	82,688,1,0,0,0,84,690,1,0,0,0,86,695,1,0,0,0,88,723,1,0,0,0,90,92,3,2,1,
	0,91,90,1,0,0,0,92,93,1,0,0,0,93,91,1,0,0,0,93,94,1,0,0,0,94,1,1,0,0,0,
	95,97,3,12,6,0,96,98,5,41,0,0,97,96,1,0,0,0,97,98,1,0,0,0,98,134,1,0,0,
	0,99,101,3,16,8,0,100,102,5,41,0,0,101,100,1,0,0,0,101,102,1,0,0,0,102,
	134,1,0,0,0,103,105,3,18,9,0,104,106,5,41,0,0,105,104,1,0,0,0,105,106,1,
	0,0,0,106,134,1,0,0,0,107,109,3,20,10,0,108,110,5,41,0,0,109,108,1,0,0,
	0,109,110,1,0,0,0,110,134,1,0,0,0,111,113,3,52,26,0,112,114,5,41,0,0,113,
	112,1,0,0,0,113,114,1,0,0,0,114,134,1,0,0,0,115,117,3,88,44,0,116,118,5,
	41,0,0,117,116,1,0,0,0,117,118,1,0,0,0,118,134,1,0,0,0,119,121,3,4,2,0,
	120,122,5,41,0,0,121,120,1,0,0,0,121,122,1,0,0,0,122,134,1,0,0,0,123,134,
	3,8,4,0,124,134,3,22,11,0,125,134,3,10,5,0,126,134,3,38,19,0,127,134,3,
	32,16,0,128,134,3,30,15,0,129,131,3,42,21,0,130,132,5,41,0,0,131,130,1,
	0,0,0,131,132,1,0,0,0,132,134,1,0,0,0,133,95,1,0,0,0,133,99,1,0,0,0,133,
	103,1,0,0,0,133,107,1,0,0,0,133,111,1,0,0,0,133,115,1,0,0,0,133,119,1,0,
	0,0,133,123,1,0,0,0,133,124,1,0,0,0,133,125,1,0,0,0,133,126,1,0,0,0,133,
	127,1,0,0,0,133,128,1,0,0,0,133,129,1,0,0,0,134,3,1,0,0,0,135,136,5,9,0,
	0,136,137,3,52,26,0,137,5,1,0,0,0,138,139,5,10,0,0,139,140,5,45,0,0,140,
	145,3,52,26,0,141,142,7,0,0,0,142,144,3,52,26,0,143,141,1,0,0,0,144,147,
	1,0,0,0,145,143,1,0,0,0,145,146,1,0,0,0,146,148,1,0,0,0,147,145,1,0,0,0,
	148,149,5,46,0,0,149,153,5,35,0,0,150,152,3,2,1,0,151,150,1,0,0,0,152,155,
	1,0,0,0,153,151,1,0,0,0,153,154,1,0,0,0,154,156,1,0,0,0,155,153,1,0,0,0,
	156,157,5,36,0,0,157,7,1,0,0,0,158,163,3,6,3,0,159,160,5,11,0,0,160,162,
	3,6,3,0,161,159,1,0,0,0,162,165,1,0,0,0,163,161,1,0,0,0,163,164,1,0,0,0,
	164,175,1,0,0,0,165,163,1,0,0,0,166,167,5,11,0,0,167,171,5,35,0,0,168,170,
	3,2,1,0,169,168,1,0,0,0,170,173,1,0,0,0,171,169,1,0,0,0,171,172,1,0,0,0,
	172,174,1,0,0,0,173,171,1,0,0,0,174,176,5,36,0,0,175,166,1,0,0,0,175,176,
	1,0,0,0,176,9,1,0,0,0,177,178,5,16,0,0,178,182,5,35,0,0,179,181,3,2,1,0,
	180,179,1,0,0,0,181,184,1,0,0,0,182,180,1,0,0,0,182,183,1,0,0,0,183,185,
	1,0,0,0,184,182,1,0,0,0,185,186,5,36,0,0,186,187,5,13,0,0,187,188,5,45,
	0,0,188,189,3,52,26,0,189,190,5,46,0,0,190,280,1,0,0,0,191,192,5,13,0,0,
	192,193,5,45,0,0,193,194,3,52,26,0,194,204,5,46,0,0,195,199,7,1,0,0,196,
	198,3,2,1,0,197,196,1,0,0,0,198,201,1,0,0,0,199,197,1,0,0,0,199,200,1,0,
	0,0,200,202,1,0,0,0,201,199,1,0,0,0,202,205,7,2,0,0,203,205,3,2,1,0,204,
	195,1,0,0,0,204,203,1,0,0,0,205,280,1,0,0,0,206,207,5,12,0,0,207,209,5,
	45,0,0,208,210,3,20,10,0,209,208,1,0,0,0,209,210,1,0,0,0,210,211,1,0,0,
	0,211,213,5,41,0,0,212,214,3,52,26,0,213,212,1,0,0,0,213,214,1,0,0,0,214,
	215,1,0,0,0,215,217,5,41,0,0,216,218,3,52,26,0,217,216,1,0,0,0,217,218,
	1,0,0,0,218,219,1,0,0,0,219,220,5,46,0,0,220,224,5,35,0,0,221,223,3,2,1,
	0,222,221,1,0,0,0,223,226,1,0,0,0,224,222,1,0,0,0,224,225,1,0,0,0,225,227,
	1,0,0,0,226,224,1,0,0,0,227,280,5,36,0,0,228,229,5,12,0,0,229,230,5,45,
	0,0,230,231,3,18,9,0,231,233,5,41,0,0,232,234,3,52,26,0,233,232,1,0,0,0,
	233,234,1,0,0,0,234,235,1,0,0,0,235,237,5,41,0,0,236,238,3,52,26,0,237,
	236,1,0,0,0,237,238,1,0,0,0,238,239,1,0,0,0,239,240,5,46,0,0,240,244,5,
	35,0,0,241,243,3,2,1,0,242,241,1,0,0,0,243,246,1,0,0,0,244,242,1,0,0,0,
	244,245,1,0,0,0,245,247,1,0,0,0,246,244,1,0,0,0,247,248,5,36,0,0,248,280,
	1,0,0,0,249,250,5,12,0,0,250,251,5,45,0,0,251,252,3,52,26,0,252,253,5,17,
	0,0,253,254,3,52,26,0,254,255,5,46,0,0,255,259,5,35,0,0,256,258,3,2,1,0,
	257,256,1,0,0,0,258,261,1,0,0,0,259,257,1,0,0,0,259,260,1,0,0,0,260,262,
	1,0,0,0,261,259,1,0,0,0,262,263,5,36,0,0,263,280,1,0,0,0,264,265,5,12,0,
	0,265,266,5,45,0,0,266,267,3,18,9,0,267,268,5,17,0,0,268,269,3,52,26,0,
	269,270,5,46,0,0,270,274,5,35,0,0,271,273,3,2,1,0,272,271,1,0,0,0,273,276,
	1,0,0,0,274,272,1,0,0,0,274,275,1,0,0,0,275,277,1,0,0,0,276,274,1,0,0,0,
	277,278,5,36,0,0,278,280,1,0,0,0,279,177,1,0,0,0,279,191,1,0,0,0,279,206,
	1,0,0,0,279,228,1,0,0,0,279,249,1,0,0,0,279,264,1,0,0,0,280,11,1,0,0,0,
	281,282,5,8,0,0,282,283,5,25,0,0,283,292,5,45,0,0,284,289,5,25,0,0,285,
	286,5,40,0,0,286,288,5,25,0,0,287,285,1,0,0,0,288,291,1,0,0,0,289,287,1,
	0,0,0,289,290,1,0,0,0,290,293,1,0,0,0,291,289,1,0,0,0,292,284,1,0,0,0,292,
	293,1,0,0,0,293,294,1,0,0,0,294,295,5,46,0,0,295,296,3,14,7,0,296,13,1,
	0,0,0,297,299,3,40,20,0,298,297,1,0,0,0,298,299,1,0,0,0,299,300,1,0,0,0,
	300,304,5,35,0,0,301,303,3,2,1,0,302,301,1,0,0,0,303,306,1,0,0,0,304,302,
	1,0,0,0,304,305,1,0,0,0,305,307,1,0,0,0,306,304,1,0,0,0,307,329,5,36,0,
	0,308,317,5,45,0,0,309,314,5,25,0,0,310,311,5,40,0,0,311,313,5,25,0,0,312,
	310,1,0,0,0,313,316,1,0,0,0,314,312,1,0,0,0,314,315,1,0,0,0,315,318,1,0,
	0,0,316,314,1,0,0,0,317,309,1,0,0,0,317,318,1,0,0,0,318,319,1,0,0,0,319,
	322,5,46,0,0,320,322,5,25,0,0,321,308,1,0,0,0,321,320,1,0,0,0,322,324,1,
	0,0,0,323,325,3,40,20,0,324,323,1,0,0,0,324,325,1,0,0,0,325,326,1,0,0,0,
	326,327,5,14,0,0,327,329,3,52,26,0,328,298,1,0,0,0,328,321,1,0,0,0,329,
	15,1,0,0,0,330,331,5,25,0,0,331,340,5,45,0,0,332,337,3,52,26,0,333,334,
	5,40,0,0,334,336,3,52,26,0,335,333,1,0,0,0,336,339,1,0,0,0,337,335,1,0,
	0,0,337,338,1,0,0,0,338,341,1,0,0,0,339,337,1,0,0,0,340,332,1,0,0,0,340,
	341,1,0,0,0,341,342,1,0,0,0,342,343,5,46,0,0,343,17,1,0,0,0,344,345,7,3,
	0,0,345,346,3,20,10,0,346,19,1,0,0,0,347,349,5,25,0,0,348,350,3,40,20,0,
	349,348,1,0,0,0,349,350,1,0,0,0,350,353,1,0,0,0,351,352,5,28,0,0,352,354,
	3,52,26,0,353,351,1,0,0,0,353,354,1,0,0,0,354,21,1,0,0,0,355,358,5,3,0,
	0,356,359,3,24,12,0,357,359,3,26,13,0,358,356,1,0,0,0,358,357,1,0,0,0,359,
	360,1,0,0,0,360,361,5,15,0,0,361,362,5,27,0,0,362,23,1,0,0,0,363,364,5,
	25,0,0,364,25,1,0,0,0,365,366,7,1,0,0,366,371,3,28,14,0,367,368,5,40,0,
	0,368,370,3,28,14,0,369,367,1,0,0,0,370,373,1,0,0,0,371,369,1,0,0,0,371,
	372,1,0,0,0,372,374,1,0,0,0,373,371,1,0,0,0,374,375,7,2,0,0,375,27,1,0,
	0,0,376,379,5,25,0,0,377,378,5,22,0,0,378,380,5,25,0,0,379,377,1,0,0,0,
	379,380,1,0,0,0,380,29,1,0,0,0,381,385,5,18,0,0,382,386,3,32,16,0,383,386,
	3,52,26,0,384,386,3,14,7,0,385,382,1,0,0,0,385,383,1,0,0,0,385,384,1,0,
	0,0,386,31,1,0,0,0,387,388,5,4,0,0,388,389,5,25,0,0,389,390,3,34,17,0,390,
	33,1,0,0,0,391,395,5,35,0,0,392,394,3,36,18,0,393,392,1,0,0,0,394,397,1,
	0,0,0,395,393,1,0,0,0,395,396,1,0,0,0,396,398,1,0,0,0,397,395,1,0,0,0,398,
	399,5,36,0,0,399,35,1,0,0,0,400,403,3,18,9,0,401,403,3,12,6,0,402,400,1,
	0,0,0,402,401,1,0,0,0,403,37,1,0,0,0,404,405,5,20,0,0,405,406,5,45,0,0,
	406,411,5,35,0,0,407,408,5,19,0,0,408,409,5,39,0,0,409,410,5,27,0,0,410,
	412,5,40,0,0,411,407,1,0,0,0,411,412,1,0,0,0,412,413,1,0,0,0,413,414,5,
	21,0,0,414,415,5,39,0,0,415,422,3,52,26,0,416,417,5,40,0,0,417,418,5,25,
	0,0,418,419,5,39,0,0,419,421,3,52,26,0,420,416,1,0,0,0,421,424,1,0,0,0,
	422,420,1,0,0,0,422,423,1,0,0,0,423,425,1,0,0,0,424,422,1,0,0,0,425,426,
	5,36,0,0,426,427,5,46,0,0,427,39,1,0,0,0,428,429,5,39,0,0,429,432,5,25,
	0,0,430,431,5,37,0,0,431,433,5,38,0,0,432,430,1,0,0,0,432,433,1,0,0,0,433,
	41,1,0,0,0,434,435,5,23,0,0,435,436,5,25,0,0,436,437,5,28,0,0,437,438,3,
	44,22,0,438,43,1,0,0,0,439,442,5,25,0,0,440,441,5,37,0,0,441,443,5,38,0,
	0,442,440,1,0,0,0,442,443,1,0,0,0,443,446,1,0,0,0,444,446,3,46,23,0,445,
	439,1,0,0,0,445,444,1,0,0,0,446,45,1,0,0,0,447,448,5,35,0,0,448,452,3,48,
	24,0,449,451,3,48,24,0,450,449,1,0,0,0,451,454,1,0,0,0,452,450,1,0,0,0,
	452,453,1,0,0,0,453,455,1,0,0,0,454,452,1,0,0,0,455,456,5,36,0,0,456,47,
	1,0,0,0,457,458,5,25,0,0,458,459,5,39,0,0,459,460,3,44,22,0,460,49,1,0,
	0,0,461,462,5,22,0,0,462,465,5,25,0,0,463,464,5,37,0,0,464,466,5,38,0,0,
	465,463,1,0,0,0,465,466,1,0,0,0,466,51,1,0,0,0,467,468,6,26,-1,0,468,470,
	3,54,27,0,469,471,7,4,0,0,470,469,1,0,0,0,470,471,1,0,0,0,471,473,1,0,0,
	0,472,474,3,50,25,0,473,472,1,0,0,0,473,474,1,0,0,0,474,486,1,0,0,0,475,
	480,5,25,0,0,476,477,5,40,0,0,477,479,5,25,0,0,478,476,1,0,0,0,479,482,
	1,0,0,0,480,478,1,0,0,0,480,481,1,0,0,0,481,483,1,0,0,0,482,480,1,0,0,0,
	483,484,5,14,0,0,484,486,3,52,26,1,485,467,1,0,0,0,485,475,1,0,0,0,486,
	508,1,0,0,0,487,488,10,5,0,0,488,489,3,56,28,0,489,490,3,52,26,6,490,507,
	1,0,0,0,491,492,10,3,0,0,492,493,5,42,0,0,493,507,3,52,26,4,494,495,10,
	2,0,0,495,496,5,45,0,0,496,501,3,52,26,0,497,498,5,40,0,0,498,500,3,52,
	26,0,499,497,1,0,0,0,500,503,1,0,0,0,501,499,1,0,0,0,501,502,1,0,0,0,502,
	504,1,0,0,0,503,501,1,0,0,0,504,505,5,46,0,0,505,507,1,0,0,0,506,487,1,
	0,0,0,506,491,1,0,0,0,506,494,1,0,0,0,507,510,1,0,0,0,508,506,1,0,0,0,508,
	509,1,0,0,0,509,53,1,0,0,0,510,508,1,0,0,0,511,536,5,26,0,0,512,536,5,27,
	0,0,513,536,3,16,8,0,514,536,5,25,0,0,515,516,5,45,0,0,516,517,3,52,26,
	0,517,518,5,46,0,0,518,536,1,0,0,0,519,536,3,64,32,0,520,536,3,68,34,0,
	521,536,3,70,35,0,522,536,3,14,7,0,523,536,3,58,29,0,524,536,3,60,30,0,
	525,526,5,53,0,0,526,536,3,52,26,0,527,531,7,5,0,0,528,530,3,88,44,0,529,
	528,1,0,0,0,530,533,1,0,0,0,531,529,1,0,0,0,531,532,1,0,0,0,532,534,1,0,
	0,0,533,531,1,0,0,0,534,536,7,5,0,0,535,511,1,0,0,0,535,512,1,0,0,0,535,
	513,1,0,0,0,535,514,1,0,0,0,535,515,1,0,0,0,535,519,1,0,0,0,535,520,1,0,
	0,0,535,521,1,0,0,0,535,522,1,0,0,0,535,523,1,0,0,0,535,524,1,0,0,0,535,
	525,1,0,0,0,535,527,1,0,0,0,536,55,1,0,0,0,537,556,5,32,0,0,538,556,5,34,
	0,0,539,556,5,33,0,0,540,556,5,55,0,0,541,556,5,56,0,0,542,556,5,54,0,0,
	543,545,5,48,0,0,544,546,7,6,0,0,545,544,1,0,0,0,545,546,1,0,0,0,546,556,
	1,0,0,0,547,549,7,7,0,0,548,550,7,6,0,0,549,548,1,0,0,0,549,550,1,0,0,0,
	550,556,1,0,0,0,551,556,5,29,0,0,552,556,5,30,0,0,553,556,5,31,0,0,554,
	556,5,49,0,0,555,537,1,0,0,0,555,538,1,0,0,0,555,539,1,0,0,0,555,540,1,
	0,0,0,555,541,1,0,0,0,555,542,1,0,0,0,555,543,1,0,0,0,555,547,1,0,0,0,555,
	551,1,0,0,0,555,552,1,0,0,0,555,553,1,0,0,0,555,554,1,0,0,0,556,57,1,0,
	0,0,557,558,5,25,0,0,558,562,5,50,0,0,559,560,5,50,0,0,560,562,5,25,0,0,
	561,557,1,0,0,0,561,559,1,0,0,0,562,59,1,0,0,0,563,564,5,25,0,0,564,568,
	5,51,0,0,565,566,5,51,0,0,566,568,5,25,0,0,567,563,1,0,0,0,567,565,1,0,
	0,0,568,61,1,0,0,0,569,570,5,34,0,0,570,586,3,52,26,0,571,572,5,32,0,0,
	572,586,3,52,26,0,573,574,5,33,0,0,574,586,3,52,26,0,575,577,5,48,0,0,576,
	578,7,6,0,0,577,576,1,0,0,0,577,578,1,0,0,0,578,579,1,0,0,0,579,586,3,52,
	26,0,580,582,7,7,0,0,581,583,7,6,0,0,582,581,1,0,0,0,582,583,1,0,0,0,583,
	584,1,0,0,0,584,586,3,52,26,0,585,569,1,0,0,0,585,571,1,0,0,0,585,573,1,
	0,0,0,585,575,1,0,0,0,585,580,1,0,0,0,586,63,1,0,0,0,587,588,5,35,0,0,588,
	593,3,66,33,0,589,590,5,40,0,0,590,592,3,66,33,0,591,589,1,0,0,0,592,595,
	1,0,0,0,593,594,1,0,0,0,593,591,1,0,0,0,594,596,1,0,0,0,595,593,1,0,0,0,
	596,597,5,36,0,0,597,65,1,0,0,0,598,599,5,25,0,0,599,600,5,39,0,0,600,601,
	3,52,26,0,601,67,1,0,0,0,602,611,5,37,0,0,603,608,3,52,26,0,604,605,5,40,
	0,0,605,607,3,52,26,0,606,604,1,0,0,0,607,610,1,0,0,0,608,606,1,0,0,0,608,
	609,1,0,0,0,609,612,1,0,0,0,610,608,1,0,0,0,611,603,1,0,0,0,611,612,1,0,
	0,0,612,613,1,0,0,0,613,614,5,38,0,0,614,69,1,0,0,0,615,616,5,25,0,0,616,
	617,5,37,0,0,617,618,3,52,26,0,618,619,5,38,0,0,619,71,1,0,0,0,620,621,
	7,8,0,0,621,73,1,0,0,0,622,623,7,7,0,0,623,627,3,72,36,0,624,626,3,76,38,
	0,625,624,1,0,0,0,626,629,1,0,0,0,627,625,1,0,0,0,627,628,1,0,0,0,628,630,
	1,0,0,0,629,627,1,0,0,0,630,631,5,48,0,0,631,75,1,0,0,0,632,634,3,78,39,
	0,633,632,1,0,0,0,634,635,1,0,0,0,635,633,1,0,0,0,635,636,1,0,0,0,636,77,
	1,0,0,0,637,638,5,1,0,0,638,639,5,28,0,0,639,640,5,57,0,0,640,641,5,6,0,
	0,641,642,5,25,0,0,642,643,5,24,0,0,643,644,5,25,0,0,644,655,5,57,0,0,645,
	646,5,2,0,0,646,647,5,28,0,0,647,648,5,57,0,0,648,649,3,52,26,0,649,650,
	5,57,0,0,650,655,1,0,0,0,651,652,5,25,0,0,652,653,5,28,0,0,653,655,3,80,
	40,0,654,637,1,0,0,0,654,645,1,0,0,0,654,651,1,0,0,0,655,79,1,0,0,0,656,
	659,5,27,0,0,657,659,3,82,41,0,658,656,1,0,0,0,658,657,1,0,0,0,659,81,1,
	0,0,0,660,664,5,59,0,0,661,662,5,35,0,0,662,664,5,35,0,0,663,660,1,0,0,
	0,663,661,1,0,0,0,664,665,1,0,0,0,665,669,3,52,26,0,666,670,5,60,0,0,667,
	668,5,36,0,0,668,670,5,36,0,0,669,666,1,0,0,0,669,667,1,0,0,0,670,689,1,
	0,0,0,671,675,5,59,0,0,672,673,5,35,0,0,673,675,5,35,0,0,674,671,1,0,0,
	0,674,672,1,0,0,0,675,676,1,0,0,0,676,680,5,59,0,0,677,679,3,88,44,0,678,
	677,1,0,0,0,679,682,1,0,0,0,680,678,1,0,0,0,680,681,1,0,0,0,681,686,1,0,
	0,0,682,680,1,0,0,0,683,687,5,60,0,0,684,685,5,36,0,0,685,687,5,36,0,0,
	686,683,1,0,0,0,686,684,1,0,0,0,687,689,1,0,0,0,688,663,1,0,0,0,688,674,
	1,0,0,0,689,83,1,0,0,0,690,691,7,7,0,0,691,692,5,49,0,0,692,693,3,72,36,
	0,693,694,5,48,0,0,694,85,1,0,0,0,695,696,7,7,0,0,696,697,3,72,36,0,697,
	698,5,49,0,0,698,699,5,48,0,0,699,87,1,0,0,0,700,704,3,74,37,0,701,703,
	3,88,44,0,702,701,1,0,0,0,703,706,1,0,0,0,704,702,1,0,0,0,704,705,1,0,0,
	0,705,707,1,0,0,0,706,704,1,0,0,0,707,708,3,84,42,0,708,724,1,0,0,0,709,
	724,3,86,43,0,710,714,5,59,0,0,711,713,3,2,1,0,712,711,1,0,0,0,713,716,
	1,0,0,0,714,712,1,0,0,0,714,715,1,0,0,0,715,720,1,0,0,0,716,714,1,0,0,0,
	717,721,5,60,0,0,718,719,5,36,0,0,719,721,5,36,0,0,720,717,1,0,0,0,720,
	718,1,0,0,0,721,724,1,0,0,0,722,724,5,62,0,0,723,700,1,0,0,0,723,709,1,
	0,0,0,723,710,1,0,0,0,723,722,1,0,0,0,724,89,1,0,0,0,88,93,97,101,105,109,
	113,117,121,131,133,145,153,163,171,175,182,199,204,209,213,217,224,233,
	237,244,259,274,279,289,292,298,304,314,317,321,324,328,337,340,349,353,
	358,371,379,385,395,402,411,422,432,442,445,452,465,470,473,480,485,501,
	506,508,531,535,545,549,555,561,567,577,582,585,593,608,611,627,635,654,
	658,663,669,674,680,686,688,704,714,720,723];

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
	constructor(parser: GrammarParser, ctx: FunctionBodyContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public ARROW(): TerminalNode {
		return this.getToken(GrammarParser.ARROW, 0);
	}
	public value(): ValueContext {
		return this.getTypedRuleContext(ValueContext, 0) as ValueContext;
	}
	public ID_list(): TerminalNode[] {
	    	return this.getTokens(GrammarParser.ID);
	}
	public ID(i: number): TerminalNode {
		return this.getToken(GrammarParser.ID, i);
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
	public _body!: ValueContext;
	constructor(parser: GrammarParser, ctx: ValueContext) {
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
	public COMMA_list(): TerminalNode[] {
	    	return this.getTokens(GrammarParser.COMMA);
	}
	public COMMA(i: number): TerminalNode {
		return this.getToken(GrammarParser.COMMA, i);
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
