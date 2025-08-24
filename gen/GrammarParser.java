// Generated from C:/Users/durai/Downloads/Telegram Desktop/compilerV4/compilerV4/GrammarParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORT=1, CLASS=2, CONST=3, LET=4, VAR=5, FUNCTION=6, RETURN=7, IF=8, 
		ELSE=9, FOR=10, WHILE=11, ARROW=12, FROM=13, DO=14, IN=15, EXPORT=16, 
		SELECTOR=17, COMPONENT=18, TEMPLATE=19, AS=20, ID=21, NUMBER=22, STRING=23, 
		ASSIGN=24, DOUBLE_ASSIGN=25, NOT_EQUAL=26, DOUBLE_ASSIGN_ID=27, LBRACE=28, 
		RBRACE=29, LBRACKET=30, RBRACKET=31, COLON=32, COMMA=33, SEMICOLON=34, 
		DOT=35, WHITESPACE=36, COMMENT=37, LPAREN=38, RPAREN=39, LTAG=40, RTAG=41, 
		SLASH=42, PLUSPLUS=43, MINUSMINUS=44, QMARK=45, EMARK=46, DOUBLE_QMARK=47, 
		OR=48, AND=49, BACKTICK=50, LTAG_HTML=51, LBRACE_HTML=52, RBRACE_HTML=53, 
		BACKTICK_HTML=54, TEXT_HTML=55, PLUS=56, MINUS=57, MULT=58, DIVID=59, 
		DIV=60, P=61, H1=62, H2=63, H3=64, H4=65, H5=66, H6=67, BUTTON=68, SPAN=69, 
		A=70, IMG=71, INPUT=72, FORM=73;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_return = 2, RULE_ifBody = 3, 
		RULE_ifStatement = 4, RULE_iterationStatement = 5, RULE_functionDeclaration = 6, 
		RULE_functionBody = 7, RULE_functionCall = 8, RULE_variableDeclaration = 9, 
		RULE_variableAssign = 10, RULE_importStatement = 11, RULE_defaultImport = 12, 
		RULE_namedImports = 13, RULE_importSpecifier = 14, RULE_exportStatement = 15, 
		RULE_classDeclaration = 16, RULE_classBody = 17, RULE_classBodyStatement = 18, 
		RULE_componentStatement = 19, RULE_typeDefine = 20, RULE_asType = 21, 
		RULE_value = 22, RULE_primaryValue = 23, RULE_binaryOp = 24, RULE_operatorExpression = 25, 
		RULE_increase_variable = 26, RULE_decrease_variable = 27, RULE_comparison = 28, 
		RULE_object = 29, RULE_pair = 30, RULE_array = 31, RULE_arrayAccess = 32, 
		RULE_htmlElementName = 33, RULE_open_tag = 34, RULE_close_tag = 35, RULE_single_tag = 36, 
		RULE_html = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "return", "ifBody", "ifStatement", "iterationStatement", 
			"functionDeclaration", "functionBody", "functionCall", "variableDeclaration", 
			"variableAssign", "importStatement", "defaultImport", "namedImports", 
			"importSpecifier", "exportStatement", "classDeclaration", "classBody", 
			"classBodyStatement", "componentStatement", "typeDefine", "asType", "value", 
			"primaryValue", "binaryOp", "operatorExpression", "increase_variable", 
			"decrease_variable", "comparison", "object", "pair", "array", "arrayAccess", 
			"htmlElementName", "open_tag", "close_tag", "single_tag", "html"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'class'", "'const'", "'let'", "'var'", "'function'", 
			"'return'", "'if'", "'else'", "'for'", "'while'", "'=>'", "'from'", "'do'", 
			"'in'", "'export'", "'selector'", "'@component'", "'template'", "'as'", 
			null, null, null, "'='", "'=='", "'!=='", "'==='", "'{'", "'}'", "'['", 
			"']'", "':'", "','", "';'", "'.'", null, null, "'('", "')'", null, "'>'", 
			"'/'", "'++'", "'--'", "'?'", "'!'", "'??'", "'||'", "'&&'", null, null, 
			"'{{'", "'}}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "CLASS", "CONST", "LET", "VAR", "FUNCTION", "RETURN", 
			"IF", "ELSE", "FOR", "WHILE", "ARROW", "FROM", "DO", "IN", "EXPORT", 
			"SELECTOR", "COMPONENT", "TEMPLATE", "AS", "ID", "NUMBER", "STRING", 
			"ASSIGN", "DOUBLE_ASSIGN", "NOT_EQUAL", "DOUBLE_ASSIGN_ID", "LBRACE", 
			"RBRACE", "LBRACKET", "RBRACKET", "COLON", "COMMA", "SEMICOLON", "DOT", 
			"WHITESPACE", "COMMENT", "LPAREN", "RPAREN", "LTAG", "RTAG", "SLASH", 
			"PLUSPLUS", "MINUSMINUS", "QMARK", "EMARK", "DOUBLE_QMARK", "OR", "AND", 
			"BACKTICK", "LTAG_HTML", "LBRACE_HTML", "RBRACE_HTML", "BACKTICK_HTML", 
			"TEXT_HTML", "PLUS", "MINUS", "MULT", "DIVID", "DIV", "P", "H1", "H2", 
			"H3", "H4", "H5", "H6", "BUTTON", "SPAN", "A", "IMG", "INPUT", "FORM"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "GrammarParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProgramRuleContext extends ProgramContext {
		public StatementContext statement;
		public List<StatementContext> statements = new ArrayList<StatementContext>();
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramRuleContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterProgramRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitProgramRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitProgramRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			_localctx = new ProgramRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				((ProgramRuleContext)_localctx).statement = statement();
				((ProgramRuleContext)_localctx).statements.add(((ProgramRuleContext)_localctx).statement);
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 61952263197117950L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtValueContext extends StatementContext {
		public ValueContext val;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public StmtValueContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterStmtValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitStmtValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitStmtValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtVarAssignContext extends StatementContext {
		public VariableAssignContext varassign;
		public VariableAssignContext variableAssign() {
			return getRuleContext(VariableAssignContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public StmtVarAssignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterStmtVarAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitStmtVarAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitStmtVarAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtFunctionDeclContext extends StatementContext {
		public FunctionDeclarationContext decl;
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public StmtFunctionDeclContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterStmtFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitStmtFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitStmtFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtHtmlContext extends StatementContext {
		public HtmlContext h;
		public HtmlContext html() {
			return getRuleContext(HtmlContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public StmtHtmlContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterStmtHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitStmtHtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitStmtHtml(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtIterationContext extends StatementContext {
		public IterationStatementContext loop;
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public StmtIterationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterStmtIteration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitStmtIteration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitStmtIteration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtClassContext extends StatementContext {
		public ClassDeclarationContext classDecl;
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public StmtClassContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterStmtClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitStmtClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitStmtClass(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtFunctionCallContext extends StatementContext {
		public FunctionCallContext call;
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public StmtFunctionCallContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterStmtFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitStmtFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitStmtFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtImportContext extends StatementContext {
		public ImportStatementContext imp;
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public StmtImportContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterStmtImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitStmtImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitStmtImport(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtIfContext extends StatementContext {
		public IfStatementContext ifstmt;
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public StmtIfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterStmtIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitStmtIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitStmtIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtComponentContext extends StatementContext {
		public ComponentStatementContext comp;
		public ComponentStatementContext componentStatement() {
			return getRuleContext(ComponentStatementContext.class,0);
		}
		public StmtComponentContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterStmtComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitStmtComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitStmtComponent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtVarDeclContext extends StatementContext {
		public VariableDeclarationContext vardecl;
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public StmtVarDeclContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterStmtVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitStmtVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitStmtVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtExportContext extends StatementContext {
		public ExportStatementContext exp;
		public ExportStatementContext exportStatement() {
			return getRuleContext(ExportStatementContext.class,0);
		}
		public StmtExportContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterStmtExport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitStmtExport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitStmtExport(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtReturnContext extends StatementContext {
		public ReturnContext ret;
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public StmtReturnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterStmtReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitStmtReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitStmtReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new StmtFunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				((StmtFunctionDeclContext)_localctx).decl = functionDeclaration();
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(82);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 2:
				_localctx = new StmtFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				((StmtFunctionCallContext)_localctx).call = functionCall();
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(86);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 3:
				_localctx = new StmtVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				((StmtVarDeclContext)_localctx).vardecl = variableDeclaration();
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(90);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 4:
				_localctx = new StmtVarAssignContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				((StmtVarAssignContext)_localctx).varassign = variableAssign();
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(94);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 5:
				_localctx = new StmtValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(97);
				((StmtValueContext)_localctx).val = value(0);
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(98);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 6:
				_localctx = new StmtHtmlContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(101);
				((StmtHtmlContext)_localctx).h = html();
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(102);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 7:
				_localctx = new StmtReturnContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(105);
				((StmtReturnContext)_localctx).ret = return_();
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(106);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 8:
				_localctx = new StmtIfContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(109);
				((StmtIfContext)_localctx).ifstmt = ifStatement();
				}
				break;
			case 9:
				_localctx = new StmtImportContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(110);
				((StmtImportContext)_localctx).imp = importStatement();
				}
				break;
			case 10:
				_localctx = new StmtIterationContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(111);
				((StmtIterationContext)_localctx).loop = iterationStatement();
				}
				break;
			case 11:
				_localctx = new StmtComponentContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(112);
				((StmtComponentContext)_localctx).comp = componentStatement();
				}
				break;
			case 12:
				_localctx = new StmtClassContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(113);
				((StmtClassContext)_localctx).classDecl = classDeclaration();
				}
				break;
			case 13:
				_localctx = new StmtExportContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(114);
				((StmtExportContext)_localctx).exp = exportStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnContext extends ParserRuleContext {
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
	 
		public ReturnContext() { }
		public void copyFrom(ReturnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnRuleContext extends ReturnContext {
		public ValueContext expr;
		public TerminalNode RETURN() { return getToken(GrammarParser.RETURN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ReturnRuleContext(ReturnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterReturnRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitReturnRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitReturnRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_return);
		try {
			_localctx = new ReturnRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(RETURN);
			setState(118);
			((ReturnRuleContext)_localctx).expr = value(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfBodyContext extends ParserRuleContext {
		public IfBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBody; }
	 
		public IfBodyContext() { }
		public void copyFrom(IfBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfBodyRuleContext extends IfBodyContext {
		public ValueContext left;
		public Token DOUBLE_ASSIGN_ID;
		public List<Token> condOps = new ArrayList<Token>();
		public Token NOT_EQUAL;
		public Token DOUBLE_ASSIGN;
		public Token _tset202;
		public ValueContext value;
		public List<ValueContext> right = new ArrayList<ValueContext>();
		public StatementContext statement;
		public List<StatementContext> stmts = new ArrayList<StatementContext>();
		public TerminalNode IF() { return getToken(GrammarParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(GrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(GrammarParser.RBRACE, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> DOUBLE_ASSIGN_ID() { return getTokens(GrammarParser.DOUBLE_ASSIGN_ID); }
		public TerminalNode DOUBLE_ASSIGN_ID(int i) {
			return getToken(GrammarParser.DOUBLE_ASSIGN_ID, i);
		}
		public List<TerminalNode> NOT_EQUAL() { return getTokens(GrammarParser.NOT_EQUAL); }
		public TerminalNode NOT_EQUAL(int i) {
			return getToken(GrammarParser.NOT_EQUAL, i);
		}
		public List<TerminalNode> DOUBLE_ASSIGN() { return getTokens(GrammarParser.DOUBLE_ASSIGN); }
		public TerminalNode DOUBLE_ASSIGN(int i) {
			return getToken(GrammarParser.DOUBLE_ASSIGN, i);
		}
		public IfBodyRuleContext(IfBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterIfBodyRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitIfBodyRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitIfBodyRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBodyContext ifBody() throws RecognitionException {
		IfBodyContext _localctx = new IfBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifBody);
		int _la;
		try {
			_localctx = new IfBodyRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(IF);
			setState(121);
			match(LPAREN);
			setState(122);
			((IfBodyRuleContext)_localctx).left = value(0);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 234881024L) != 0)) {
				{
				{
				setState(123);
				((IfBodyRuleContext)_localctx)._tset202 = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 234881024L) != 0)) ) {
					((IfBodyRuleContext)_localctx)._tset202 = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				((IfBodyRuleContext)_localctx).condOps.add(((IfBodyRuleContext)_localctx)._tset202);
				setState(124);
				((IfBodyRuleContext)_localctx).value = value(0);
				((IfBodyRuleContext)_localctx).right.add(((IfBodyRuleContext)_localctx).value);
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
			match(RPAREN);
			setState(131);
			match(LBRACE);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 61952263197117950L) != 0)) {
				{
				{
				setState(132);
				((IfBodyRuleContext)_localctx).statement = statement();
				((IfBodyRuleContext)_localctx).stmts.add(((IfBodyRuleContext)_localctx).statement);
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	 
		public IfStatementContext() { }
		public void copyFrom(IfStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementRuleContext extends IfStatementContext {
		public IfBodyContext ifBody;
		public List<IfBodyContext> ifBlocks = new ArrayList<IfBodyContext>();
		public List<IfBodyContext> elseIfs = new ArrayList<IfBodyContext>();
		public Token elseBlock;
		public StatementContext statement;
		public List<StatementContext> elseStmts = new ArrayList<StatementContext>();
		public List<IfBodyContext> ifBody() {
			return getRuleContexts(IfBodyContext.class);
		}
		public IfBodyContext ifBody(int i) {
			return getRuleContext(IfBodyContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(GrammarParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(GrammarParser.ELSE, i);
		}
		public TerminalNode RBRACE() { return getToken(GrammarParser.RBRACE, 0); }
		public TerminalNode LBRACE() { return getToken(GrammarParser.LBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementRuleContext(IfStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterIfStatementRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitIfStatementRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitIfStatementRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			_localctx = new IfStatementRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			((IfStatementRuleContext)_localctx).ifBody = ifBody();
			((IfStatementRuleContext)_localctx).ifBlocks.add(((IfStatementRuleContext)_localctx).ifBody);
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(141);
					match(ELSE);
					setState(142);
					((IfStatementRuleContext)_localctx).ifBody = ifBody();
					((IfStatementRuleContext)_localctx).elseIfs.add(((IfStatementRuleContext)_localctx).ifBody);
					}
					} 
				}
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(148);
				match(ELSE);
				setState(149);
				((IfStatementRuleContext)_localctx).elseBlock = match(LBRACE);
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 61952263197117950L) != 0)) {
					{
					{
					setState(150);
					((IfStatementRuleContext)_localctx).statement = statement();
					((IfStatementRuleContext)_localctx).elseStmts.add(((IfStatementRuleContext)_localctx).statement);
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(156);
				match(RBRACE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IterationStatementContext extends ParserRuleContext {
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
	 
		public IterationStatementContext() { }
		public void copyFrom(IterationStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForInLoopValContext extends IterationStatementContext {
		public ValueContext iterVal;
		public ValueContext iterable;
		public StatementContext statement;
		public List<StatementContext> body = new ArrayList<StatementContext>();
		public TerminalNode FOR() { return getToken(GrammarParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public TerminalNode IN() { return getToken(GrammarParser.IN, 0); }
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(GrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(GrammarParser.RBRACE, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForInLoopValContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterForInLoopVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitForInLoopVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitForInLoopVal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForInLoopDeclContext extends IterationStatementContext {
		public VariableDeclarationContext iterDecl;
		public ValueContext iterable;
		public StatementContext statement;
		public List<StatementContext> body = new ArrayList<StatementContext>();
		public TerminalNode FOR() { return getToken(GrammarParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public TerminalNode IN() { return getToken(GrammarParser.IN, 0); }
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(GrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(GrammarParser.RBRACE, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForInLoopDeclContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterForInLoopDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitForInLoopDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitForInLoopDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileLoopContext extends IterationStatementContext {
		public ValueContext cond;
		public Token block;
		public StatementContext statement;
		public List<StatementContext> stmts = new ArrayList<StatementContext>();
		public StatementContext single;
		public TerminalNode WHILE() { return getToken(GrammarParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(GrammarParser.RBRACE, 0); }
		public TerminalNode RBRACE_HTML() { return getToken(GrammarParser.RBRACE_HTML, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(GrammarParser.LBRACE, 0); }
		public TerminalNode LBRACE_HTML() { return getToken(GrammarParser.LBRACE_HTML, 0); }
		public WhileLoopContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopAssignContext extends IterationStatementContext {
		public VariableAssignContext initVal;
		public ValueContext cond;
		public ValueContext step;
		public StatementContext statement;
		public List<StatementContext> body = new ArrayList<StatementContext>();
		public TerminalNode FOR() { return getToken(GrammarParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(GrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GrammarParser.SEMICOLON, i);
		}
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(GrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(GrammarParser.RBRACE, 0); }
		public VariableAssignContext variableAssign() {
			return getRuleContext(VariableAssignContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForLoopAssignContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterForLoopAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitForLoopAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitForLoopAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopDeclContext extends IterationStatementContext {
		public VariableDeclarationContext initDecl;
		public ValueContext cond;
		public ValueContext step;
		public StatementContext statement;
		public List<StatementContext> body = new ArrayList<StatementContext>();
		public TerminalNode FOR() { return getToken(GrammarParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(GrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GrammarParser.SEMICOLON, i);
		}
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(GrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(GrammarParser.RBRACE, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForLoopDeclContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterForLoopDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitForLoopDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitForLoopDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileLoopContext extends IterationStatementContext {
		public StatementContext statement;
		public List<StatementContext> body = new ArrayList<StatementContext>();
		public ValueContext cond;
		public TerminalNode DO() { return getToken(GrammarParser.DO, 0); }
		public TerminalNode LBRACE() { return getToken(GrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(GrammarParser.RBRACE, 0); }
		public TerminalNode WHILE() { return getToken(GrammarParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public DoWhileLoopContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterDoWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitDoWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitDoWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_iterationStatement);
		int _la;
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new DoWhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(DO);
				setState(160);
				match(LBRACE);
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 61952263197117950L) != 0)) {
					{
					{
					setState(161);
					((DoWhileLoopContext)_localctx).statement = statement();
					((DoWhileLoopContext)_localctx).body.add(((DoWhileLoopContext)_localctx).statement);
					}
					}
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(167);
				match(RBRACE);
				setState(168);
				match(WHILE);
				setState(169);
				match(LPAREN);
				setState(170);
				((DoWhileLoopContext)_localctx).cond = value(0);
				setState(171);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(WHILE);
				setState(174);
				match(LPAREN);
				setState(175);
				((WhileLoopContext)_localctx).cond = value(0);
				setState(176);
				match(RPAREN);
				setState(186);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(177);
					((WhileLoopContext)_localctx).block = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==LBRACE || _la==LBRACE_HTML) ) {
						((WhileLoopContext)_localctx).block = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 61952263197117950L) != 0)) {
						{
						{
						setState(178);
						((WhileLoopContext)_localctx).statement = statement();
						((WhileLoopContext)_localctx).stmts.add(((WhileLoopContext)_localctx).statement);
						}
						}
						setState(183);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(184);
					_la = _input.LA(1);
					if ( !(_la==RBRACE || _la==RBRACE_HTML) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case 2:
					{
					setState(185);
					((WhileLoopContext)_localctx).single = statement();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new ForLoopAssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				match(FOR);
				setState(189);
				match(LPAREN);
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(190);
					((ForLoopAssignContext)_localctx).initVal = variableAssign();
					}
				}

				setState(193);
				match(SEMICOLON);
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 19166967225122816L) != 0)) {
					{
					setState(194);
					((ForLoopAssignContext)_localctx).cond = value(0);
					}
				}

				setState(197);
				match(SEMICOLON);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 19166967225122816L) != 0)) {
					{
					setState(198);
					((ForLoopAssignContext)_localctx).step = value(0);
					}
				}

				setState(201);
				match(RPAREN);
				setState(202);
				match(LBRACE);
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 61952263197117950L) != 0)) {
					{
					{
					setState(203);
					((ForLoopAssignContext)_localctx).statement = statement();
					((ForLoopAssignContext)_localctx).body.add(((ForLoopAssignContext)_localctx).statement);
					}
					}
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(209);
				match(RBRACE);
				}
				break;
			case 4:
				_localctx = new ForLoopDeclContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(210);
				match(FOR);
				setState(211);
				match(LPAREN);
				setState(212);
				((ForLoopDeclContext)_localctx).initDecl = variableDeclaration();
				setState(213);
				match(SEMICOLON);
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 19166967225122816L) != 0)) {
					{
					setState(214);
					((ForLoopDeclContext)_localctx).cond = value(0);
					}
				}

				setState(217);
				match(SEMICOLON);
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 19166967225122816L) != 0)) {
					{
					setState(218);
					((ForLoopDeclContext)_localctx).step = value(0);
					}
				}

				setState(221);
				match(RPAREN);
				setState(222);
				match(LBRACE);
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 61952263197117950L) != 0)) {
					{
					{
					setState(223);
					((ForLoopDeclContext)_localctx).statement = statement();
					((ForLoopDeclContext)_localctx).body.add(((ForLoopDeclContext)_localctx).statement);
					}
					}
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(229);
				match(RBRACE);
				}
				break;
			case 5:
				_localctx = new ForInLoopValContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(231);
				match(FOR);
				setState(232);
				match(LPAREN);
				setState(233);
				((ForInLoopValContext)_localctx).iterVal = value(0);
				setState(234);
				match(IN);
				setState(235);
				((ForInLoopValContext)_localctx).iterable = value(0);
				setState(236);
				match(RPAREN);
				setState(237);
				match(LBRACE);
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 61952263197117950L) != 0)) {
					{
					{
					setState(238);
					((ForInLoopValContext)_localctx).statement = statement();
					((ForInLoopValContext)_localctx).body.add(((ForInLoopValContext)_localctx).statement);
					}
					}
					setState(243);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(244);
				match(RBRACE);
				}
				break;
			case 6:
				_localctx = new ForInLoopDeclContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(246);
				match(FOR);
				setState(247);
				match(LPAREN);
				setState(248);
				((ForInLoopDeclContext)_localctx).iterDecl = variableDeclaration();
				setState(249);
				match(IN);
				setState(250);
				((ForInLoopDeclContext)_localctx).iterable = value(0);
				setState(251);
				match(RPAREN);
				setState(252);
				match(LBRACE);
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 61952263197117950L) != 0)) {
					{
					{
					setState(253);
					((ForInLoopDeclContext)_localctx).statement = statement();
					((ForInLoopDeclContext)_localctx).body.add(((ForInLoopDeclContext)_localctx).statement);
					}
					}
					setState(258);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(259);
				match(RBRACE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	 
		public FunctionDeclarationContext() { }
		public void copyFrom(FunctionDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationRuleContext extends FunctionDeclarationContext {
		public Token funcName;
		public Token ID;
		public List<Token> params = new ArrayList<Token>();
		public FunctionBodyContext body;
		public TerminalNode FUNCTION() { return getToken(GrammarParser.FUNCTION, 0); }
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public FunctionDeclarationRuleContext(FunctionDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterFunctionDeclarationRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitFunctionDeclarationRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitFunctionDeclarationRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionDeclaration);
		int _la;
		try {
			_localctx = new FunctionDeclarationRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(FUNCTION);
			setState(264);
			((FunctionDeclarationRuleContext)_localctx).funcName = match(ID);
			setState(265);
			match(LPAREN);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(266);
				((FunctionDeclarationRuleContext)_localctx).ID = match(ID);
				((FunctionDeclarationRuleContext)_localctx).params.add(((FunctionDeclarationRuleContext)_localctx).ID);
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(267);
					match(COMMA);
					setState(268);
					((FunctionDeclarationRuleContext)_localctx).ID = match(ID);
					((FunctionDeclarationRuleContext)_localctx).params.add(((FunctionDeclarationRuleContext)_localctx).ID);
					}
					}
					setState(273);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(276);
			match(RPAREN);
			setState(277);
			((FunctionDeclarationRuleContext)_localctx).body = functionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionBodyContext extends ParserRuleContext {
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
	 
		public FunctionBodyContext() { }
		public void copyFrom(FunctionBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionArrowContext extends FunctionBodyContext {
		public Token ID;
		public List<Token> params = new ArrayList<Token>();
		public Token singleParam;
		public TypeDefineContext type;
		public ValueContext expr;
		public TerminalNode ARROW() { return getToken(GrammarParser.ARROW, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public TypeDefineContext typeDefine() {
			return getRuleContext(TypeDefineContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public FunctionArrowContext(FunctionBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterFunctionArrow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitFunctionArrow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitFunctionArrow(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionBlockContext extends FunctionBodyContext {
		public TypeDefineContext type;
		public StatementContext statement;
		public List<StatementContext> stmts = new ArrayList<StatementContext>();
		public TerminalNode LBRACE() { return getToken(GrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(GrammarParser.RBRACE, 0); }
		public TypeDefineContext typeDefine() {
			return getRuleContext(TypeDefineContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionBlockContext(FunctionBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterFunctionBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitFunctionBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitFunctionBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionBody);
		int _la;
		try {
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
			case COLON:
				_localctx = new FunctionBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(279);
					((FunctionBlockContext)_localctx).type = typeDefine();
					}
				}

				setState(282);
				match(LBRACE);
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 61952263197117950L) != 0)) {
					{
					{
					setState(283);
					((FunctionBlockContext)_localctx).statement = statement();
					((FunctionBlockContext)_localctx).stmts.add(((FunctionBlockContext)_localctx).statement);
					}
					}
					setState(288);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(289);
				match(RBRACE);
				}
				break;
			case ID:
			case LPAREN:
				_localctx = new FunctionArrowContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LPAREN:
					{
					{
					setState(290);
					match(LPAREN);
					setState(299);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(291);
						((FunctionArrowContext)_localctx).ID = match(ID);
						((FunctionArrowContext)_localctx).params.add(((FunctionArrowContext)_localctx).ID);
						setState(296);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(292);
							match(COMMA);
							setState(293);
							((FunctionArrowContext)_localctx).ID = match(ID);
							((FunctionArrowContext)_localctx).params.add(((FunctionArrowContext)_localctx).ID);
							}
							}
							setState(298);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(301);
					match(RPAREN);
					}
					}
					break;
				case ID:
					{
					setState(302);
					((FunctionArrowContext)_localctx).singleParam = match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(305);
					((FunctionArrowContext)_localctx).type = typeDefine();
					}
				}

				setState(308);
				match(ARROW);
				setState(309);
				((FunctionArrowContext)_localctx).expr = value(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	 
		public FunctionCallContext() { }
		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallRuleContext extends FunctionCallContext {
		public Token funcName;
		public ValueContext value;
		public List<ValueContext> args = new ArrayList<ValueContext>();
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public FunctionCallRuleContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterFunctionCallRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitFunctionCallRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitFunctionCallRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionCall);
		int _la;
		try {
			_localctx = new FunctionCallRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			((FunctionCallRuleContext)_localctx).funcName = match(ID);
			setState(313);
			match(LPAREN);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 19166967225122816L) != 0)) {
				{
				setState(314);
				((FunctionCallRuleContext)_localctx).value = value(0);
				((FunctionCallRuleContext)_localctx).args.add(((FunctionCallRuleContext)_localctx).value);
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(315);
					match(COMMA);
					setState(316);
					((FunctionCallRuleContext)_localctx).value = value(0);
					((FunctionCallRuleContext)_localctx).args.add(((FunctionCallRuleContext)_localctx).value);
					}
					}
					setState(321);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(324);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	 
		public VariableDeclarationContext() { }
		public void copyFrom(VariableDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclarationRuleContext extends VariableDeclarationContext {
		public Token kind;
		public VariableAssignContext assign;
		public VariableAssignContext variableAssign() {
			return getRuleContext(VariableAssignContext.class,0);
		}
		public TerminalNode CONST() { return getToken(GrammarParser.CONST, 0); }
		public TerminalNode LET() { return getToken(GrammarParser.LET, 0); }
		public TerminalNode VAR() { return getToken(GrammarParser.VAR, 0); }
		public VarDeclarationRuleContext(VariableDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterVarDeclarationRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitVarDeclarationRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitVarDeclarationRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableDeclaration);
		int _la;
		try {
			_localctx = new VarDeclarationRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			((VarDeclarationRuleContext)_localctx).kind = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 56L) != 0)) ) {
				((VarDeclarationRuleContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(327);
			((VarDeclarationRuleContext)_localctx).assign = variableAssign();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableAssignContext extends ParserRuleContext {
		public VariableAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssign; }
	 
		public VariableAssignContext() { }
		public void copyFrom(VariableAssignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarAssignRuleContext extends VariableAssignContext {
		public Token varName;
		public TypeDefineContext type;
		public ValueContext expr;
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public TypeDefineContext typeDefine() {
			return getRuleContext(TypeDefineContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public VarAssignRuleContext(VariableAssignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterVarAssignRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitVarAssignRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitVarAssignRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssignContext variableAssign() throws RecognitionException {
		VariableAssignContext _localctx = new VariableAssignContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableAssign);
		int _la;
		try {
			_localctx = new VarAssignRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			((VarAssignRuleContext)_localctx).varName = match(ID);
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(330);
				((VarAssignRuleContext)_localctx).type = typeDefine();
				}
				break;
			}
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(333);
				match(ASSIGN);
				setState(334);
				((VarAssignRuleContext)_localctx).expr = value(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
	 
		public ImportStatementContext() { }
		public void copyFrom(ImportStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportRuleContext extends ImportStatementContext {
		public DefaultImportContext def;
		public NamedImportsContext named;
		public Token path;
		public TerminalNode IMPORT() { return getToken(GrammarParser.IMPORT, 0); }
		public TerminalNode FROM() { return getToken(GrammarParser.FROM, 0); }
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public DefaultImportContext defaultImport() {
			return getRuleContext(DefaultImportContext.class,0);
		}
		public NamedImportsContext namedImports() {
			return getRuleContext(NamedImportsContext.class,0);
		}
		public ImportRuleContext(ImportStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterImportRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitImportRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitImportRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_importStatement);
		try {
			_localctx = new ImportRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(IMPORT);
			setState(340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(338);
				((ImportRuleContext)_localctx).def = defaultImport();
				}
				break;
			case LBRACE:
			case LBRACE_HTML:
				{
				setState(339);
				((ImportRuleContext)_localctx).named = namedImports();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(342);
			match(FROM);
			setState(343);
			((ImportRuleContext)_localctx).path = match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultImportContext extends ParserRuleContext {
		public DefaultImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultImport; }
	 
		public DefaultImportContext() { }
		public void copyFrom(DefaultImportContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefaultImportRuleContext extends DefaultImportContext {
		public Token id;
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public DefaultImportRuleContext(DefaultImportContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterDefaultImportRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitDefaultImportRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitDefaultImportRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultImportContext defaultImport() throws RecognitionException {
		DefaultImportContext _localctx = new DefaultImportContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_defaultImport);
		try {
			_localctx = new DefaultImportRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			((DefaultImportRuleContext)_localctx).id = match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamedImportsContext extends ParserRuleContext {
		public NamedImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedImports; }
	 
		public NamedImportsContext() { }
		public void copyFrom(NamedImportsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NamedImportsRuleContext extends NamedImportsContext {
		public ImportSpecifierContext importSpecifier;
		public List<ImportSpecifierContext> imports = new ArrayList<ImportSpecifierContext>();
		public TerminalNode LBRACE() { return getToken(GrammarParser.LBRACE, 0); }
		public TerminalNode LBRACE_HTML() { return getToken(GrammarParser.LBRACE_HTML, 0); }
		public List<ImportSpecifierContext> importSpecifier() {
			return getRuleContexts(ImportSpecifierContext.class);
		}
		public ImportSpecifierContext importSpecifier(int i) {
			return getRuleContext(ImportSpecifierContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(GrammarParser.RBRACE, 0); }
		public TerminalNode RBRACE_HTML() { return getToken(GrammarParser.RBRACE_HTML, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public NamedImportsRuleContext(NamedImportsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterNamedImportsRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitNamedImportsRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitNamedImportsRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedImportsContext namedImports() throws RecognitionException {
		NamedImportsContext _localctx = new NamedImportsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_namedImports);
		int _la;
		try {
			_localctx = new NamedImportsRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			_la = _input.LA(1);
			if ( !(_la==LBRACE || _la==LBRACE_HTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(348);
			((NamedImportsRuleContext)_localctx).importSpecifier = importSpecifier();
			((NamedImportsRuleContext)_localctx).imports.add(((NamedImportsRuleContext)_localctx).importSpecifier);
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(349);
				match(COMMA);
				setState(350);
				((NamedImportsRuleContext)_localctx).importSpecifier = importSpecifier();
				((NamedImportsRuleContext)_localctx).imports.add(((NamedImportsRuleContext)_localctx).importSpecifier);
				}
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(356);
			_la = _input.LA(1);
			if ( !(_la==RBRACE || _la==RBRACE_HTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportSpecifierContext extends ParserRuleContext {
		public ImportSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSpecifier; }
	 
		public ImportSpecifierContext() { }
		public void copyFrom(ImportSpecifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportSpecifierRuleContext extends ImportSpecifierContext {
		public Token name;
		public Token alias;
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public TerminalNode AS() { return getToken(GrammarParser.AS, 0); }
		public ImportSpecifierRuleContext(ImportSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterImportSpecifierRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitImportSpecifierRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitImportSpecifierRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportSpecifierContext importSpecifier() throws RecognitionException {
		ImportSpecifierContext _localctx = new ImportSpecifierContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_importSpecifier);
		int _la;
		try {
			_localctx = new ImportSpecifierRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			((ImportSpecifierRuleContext)_localctx).name = match(ID);
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(359);
				match(AS);
				setState(360);
				((ImportSpecifierRuleContext)_localctx).alias = match(ID);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExportStatementContext extends ParserRuleContext {
		public ExportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportStatement; }
	 
		public ExportStatementContext() { }
		public void copyFrom(ExportStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExportRuleContext extends ExportStatementContext {
		public ClassDeclarationContext cls;
		public ValueContext val;
		public FunctionBodyContext func;
		public TerminalNode EXPORT() { return getToken(GrammarParser.EXPORT, 0); }
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public ExportRuleContext(ExportStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterExportRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitExportRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitExportRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportStatementContext exportStatement() throws RecognitionException {
		ExportStatementContext _localctx = new ExportStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_exportStatement);
		try {
			_localctx = new ExportRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(EXPORT);
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(364);
				((ExportRuleContext)_localctx).cls = classDeclaration();
				}
				break;
			case 2:
				{
				setState(365);
				((ExportRuleContext)_localctx).val = value(0);
				}
				break;
			case 3:
				{
				setState(366);
				((ExportRuleContext)_localctx).func = functionBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
	 
		public ClassDeclarationContext() { }
		public void copyFrom(ClassDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationRuleContext extends ClassDeclarationContext {
		public Token name;
		public ClassBodyContext body;
		public TerminalNode CLASS() { return getToken(GrammarParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassDeclarationRuleContext(ClassDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterClassDeclarationRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitClassDeclarationRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitClassDeclarationRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_classDeclaration);
		try {
			_localctx = new ClassDeclarationRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(CLASS);
			setState(370);
			((ClassDeclarationRuleContext)_localctx).name = match(ID);
			setState(371);
			((ClassDeclarationRuleContext)_localctx).body = classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
	 
		public ClassBodyContext() { }
		public void copyFrom(ClassBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyRuleContext extends ClassBodyContext {
		public ClassBodyStatementContext classBodyStatement;
		public List<ClassBodyStatementContext> stmts = new ArrayList<ClassBodyStatementContext>();
		public TerminalNode LBRACE() { return getToken(GrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(GrammarParser.RBRACE, 0); }
		public List<ClassBodyStatementContext> classBodyStatement() {
			return getRuleContexts(ClassBodyStatementContext.class);
		}
		public ClassBodyStatementContext classBodyStatement(int i) {
			return getRuleContext(ClassBodyStatementContext.class,i);
		}
		public ClassBodyRuleContext(ClassBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterClassBodyRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitClassBodyRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitClassBodyRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_classBody);
		int _la;
		try {
			_localctx = new ClassBodyRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(LBRACE);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 120L) != 0)) {
				{
				{
				setState(374);
				((ClassBodyRuleContext)_localctx).classBodyStatement = classBodyStatement();
				((ClassBodyRuleContext)_localctx).stmts.add(((ClassBodyRuleContext)_localctx).classBodyStatement);
				}
				}
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(380);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyStatementContext extends ParserRuleContext {
		public ClassBodyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyStatement; }
	 
		public ClassBodyStatementContext() { }
		public void copyFrom(ClassBodyStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassFuncDeclContext extends ClassBodyStatementContext {
		public FunctionDeclarationContext func;
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ClassFuncDeclContext(ClassBodyStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterClassFuncDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitClassFuncDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitClassFuncDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassVarDeclContext extends ClassBodyStatementContext {
		public VariableDeclarationContext var;
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ClassVarDeclContext(ClassBodyStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterClassVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitClassVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitClassVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyStatementContext classBodyStatement() throws RecognitionException {
		ClassBodyStatementContext _localctx = new ClassBodyStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_classBodyStatement);
		try {
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
			case LET:
			case VAR:
				_localctx = new ClassVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				((ClassVarDeclContext)_localctx).var = variableDeclaration();
				}
				break;
			case FUNCTION:
				_localctx = new ClassFuncDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				((ClassFuncDeclContext)_localctx).func = functionDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentStatementContext extends ParserRuleContext {
		public ComponentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentStatement; }
	 
		public ComponentStatementContext() { }
		public void copyFrom(ComponentStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentRuleContext extends ComponentStatementContext {
		public Token selector;
		public ValueContext template;
		public Token ID;
		public List<Token> keys = new ArrayList<Token>();
		public ValueContext value;
		public List<ValueContext> vals = new ArrayList<ValueContext>();
		public TerminalNode COMPONENT() { return getToken(GrammarParser.COMPONENT, 0); }
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(GrammarParser.LBRACE, 0); }
		public TerminalNode TEMPLATE() { return getToken(GrammarParser.TEMPLATE, 0); }
		public List<TerminalNode> COLON() { return getTokens(GrammarParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(GrammarParser.COLON, i);
		}
		public TerminalNode RBRACE() { return getToken(GrammarParser.RBRACE, 0); }
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode SELECTOR() { return getToken(GrammarParser.SELECTOR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public ComponentRuleContext(ComponentStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterComponentRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitComponentRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitComponentRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentStatementContext componentStatement() throws RecognitionException {
		ComponentStatementContext _localctx = new ComponentStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_componentStatement);
		int _la;
		try {
			_localctx = new ComponentRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(COMPONENT);
			setState(387);
			match(LPAREN);
			setState(388);
			match(LBRACE);
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SELECTOR) {
				{
				setState(389);
				match(SELECTOR);
				setState(390);
				match(COLON);
				setState(391);
				((ComponentRuleContext)_localctx).selector = match(STRING);
				setState(392);
				match(COMMA);
				}
			}

			setState(395);
			match(TEMPLATE);
			setState(396);
			match(COLON);
			setState(397);
			((ComponentRuleContext)_localctx).template = value(0);
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(398);
				match(COMMA);
				setState(399);
				((ComponentRuleContext)_localctx).ID = match(ID);
				((ComponentRuleContext)_localctx).keys.add(((ComponentRuleContext)_localctx).ID);
				setState(400);
				match(COLON);
				setState(401);
				((ComponentRuleContext)_localctx).value = value(0);
				((ComponentRuleContext)_localctx).vals.add(((ComponentRuleContext)_localctx).value);
				}
				}
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(407);
			match(RBRACE);
			setState(408);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeDefineContext extends ParserRuleContext {
		public TypeDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefine; }
	 
		public TypeDefineContext() { }
		public void copyFrom(TypeDefineContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeDefineRuleContext extends TypeDefineContext {
		public Token type;
		public TerminalNode COLON() { return getToken(GrammarParser.COLON, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode LBRACKET() { return getToken(GrammarParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(GrammarParser.RBRACKET, 0); }
		public TypeDefineRuleContext(TypeDefineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterTypeDefineRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitTypeDefineRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitTypeDefineRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDefineContext typeDefine() throws RecognitionException {
		TypeDefineContext _localctx = new TypeDefineContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typeDefine);
		try {
			_localctx = new TypeDefineRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(COLON);
			setState(411);
			((TypeDefineRuleContext)_localctx).type = match(ID);
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(412);
				match(LBRACKET);
				setState(413);
				match(RBRACKET);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsTypeContext extends ParserRuleContext {
		public AsTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asType; }
	 
		public AsTypeContext() { }
		public void copyFrom(AsTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AsTypeRuleContext extends AsTypeContext {
		public Token type;
		public TerminalNode AS() { return getToken(GrammarParser.AS, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode LBRACKET() { return getToken(GrammarParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(GrammarParser.RBRACKET, 0); }
		public AsTypeRuleContext(AsTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterAsTypeRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitAsTypeRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitAsTypeRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsTypeContext asType() throws RecognitionException {
		AsTypeContext _localctx = new AsTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_asType);
		try {
			_localctx = new AsTypeRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(AS);
			setState(417);
			((AsTypeRuleContext)_localctx).type = match(ID);
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(418);
				match(LBRACKET);
				setState(419);
				match(RBRACKET);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryValueExprContext extends ValueContext {
		public PrimaryValueContext pv;
		public Token qm;
		public AsTypeContext type;
		public PrimaryValueContext primaryValue() {
			return getRuleContext(PrimaryValueContext.class,0);
		}
		public AsTypeContext asType() {
			return getRuleContext(AsTypeContext.class,0);
		}
		public TerminalNode QMARK() { return getToken(GrammarParser.QMARK, 0); }
		public TerminalNode EMARK() { return getToken(GrammarParser.EMARK, 0); }
		public PrimaryValueExprContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterPrimaryValueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitPrimaryValueExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitPrimaryValueExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryValueContext extends ValueContext {
		public ValueContext left;
		public BinaryOpContext op;
		public ValueContext right;
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public BinaryOpContext binaryOp() {
			return getRuleContext(BinaryOpContext.class,0);
		}
		public BinaryValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterBinaryValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitBinaryValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitBinaryValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		return value(0);
	}

	private ValueContext value(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueContext _localctx = new ValueContext(_ctx, _parentState);
		ValueContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_value, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PrimaryValueExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(423);
			((PrimaryValueExprContext)_localctx).pv = primaryValue();
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(424);
				((PrimaryValueExprContext)_localctx).qm = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==QMARK || _la==EMARK) ) {
					((PrimaryValueExprContext)_localctx).qm = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(427);
				((PrimaryValueExprContext)_localctx).type = asType();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(436);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BinaryValueContext(new ValueContext(_parentctx, _parentState));
					((BinaryValueContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_value);
					setState(430);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(431);
					((BinaryValueContext)_localctx).op = binaryOp();
					setState(432);
					((BinaryValueContext)_localctx).right = value(3);
					}
					} 
				}
				setState(438);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryValueContext extends ParserRuleContext {
		public PrimaryValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryValue; }
	 
		public PrimaryValueContext() { }
		public void copyFrom(PrimaryValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessValueContext extends PrimaryValueContext {
		public ArrayAccessContext access;
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public ArrayAccessValueContext(PrimaryValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterArrayAccessValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitArrayAccessValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitArrayAccessValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncValueContext extends PrimaryValueContext {
		public Increase_variableContext inc;
		public Increase_variableContext increase_variable() {
			return getRuleContext(Increase_variableContext.class,0);
		}
		public IncValueContext(PrimaryValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterIncValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitIncValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitIncValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringValueContext extends PrimaryValueContext {
		public Token str;
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public StringValueContext(PrimaryValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterStringValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitStringValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitStringValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionValueContext extends PrimaryValueContext {
		public FunctionBodyContext body;
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FunctionValueContext(PrimaryValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterFunctionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitFunctionValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitFunctionValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdValueContext extends PrimaryValueContext {
		public Token id;
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public IdValueContext(PrimaryValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterIdValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitIdValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitIdValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectValueContext extends PrimaryValueContext {
		public ObjectContext obj;
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ObjectValueContext(PrimaryValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterObjectValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitObjectValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitObjectValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateValueContext extends PrimaryValueContext {
		public Token bt;
		public HtmlContext html;
		public List<HtmlContext> content = new ArrayList<HtmlContext>();
		public List<TerminalNode> BACKTICK() { return getTokens(GrammarParser.BACKTICK); }
		public TerminalNode BACKTICK(int i) {
			return getToken(GrammarParser.BACKTICK, i);
		}
		public List<TerminalNode> BACKTICK_HTML() { return getTokens(GrammarParser.BACKTICK_HTML); }
		public TerminalNode BACKTICK_HTML(int i) {
			return getToken(GrammarParser.BACKTICK_HTML, i);
		}
		public List<HtmlContext> html() {
			return getRuleContexts(HtmlContext.class);
		}
		public HtmlContext html(int i) {
			return getRuleContext(HtmlContext.class,i);
		}
		public TemplateValueContext(PrimaryValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterTemplateValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitTemplateValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitTemplateValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberValueContext extends PrimaryValueContext {
		public Token num;
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public NumberValueContext(PrimaryValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterNumberValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitNumberValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitNumberValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayValueContext extends PrimaryValueContext {
		public ArrayContext arr;
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ArrayValueContext(PrimaryValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterArrayValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitArrayValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitArrayValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecValueContext extends PrimaryValueContext {
		public Decrease_variableContext dec;
		public Decrease_variableContext decrease_variable() {
			return getRuleContext(Decrease_variableContext.class,0);
		}
		public DecValueContext(PrimaryValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterDecValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitDecValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitDecValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallValueContext extends PrimaryValueContext {
		public FunctionCallContext call;
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public CallValueContext(PrimaryValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterCallValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitCallValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitCallValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenValueContext extends PrimaryValueContext {
		public ValueContext inner;
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ParenValueContext(PrimaryValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterParenValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitParenValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitParenValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryValueContext primaryValue() throws RecognitionException {
		PrimaryValueContext _localctx = new PrimaryValueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_primaryValue);
		int _la;
		try {
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				_localctx = new NumberValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				((NumberValueContext)_localctx).num = match(NUMBER);
				}
				break;
			case 2:
				_localctx = new StringValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				((StringValueContext)_localctx).str = match(STRING);
				}
				break;
			case 3:
				_localctx = new CallValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(441);
				((CallValueContext)_localctx).call = functionCall();
				}
				break;
			case 4:
				_localctx = new IdValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(442);
				((IdValueContext)_localctx).id = match(ID);
				}
				break;
			case 5:
				_localctx = new ParenValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(443);
				match(LPAREN);
				setState(444);
				((ParenValueContext)_localctx).inner = value(0);
				setState(445);
				match(RPAREN);
				}
				break;
			case 6:
				_localctx = new ObjectValueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(447);
				((ObjectValueContext)_localctx).obj = object();
				}
				break;
			case 7:
				_localctx = new ArrayValueContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(448);
				((ArrayValueContext)_localctx).arr = array();
				}
				break;
			case 8:
				_localctx = new ArrayAccessValueContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(449);
				((ArrayAccessValueContext)_localctx).access = arrayAccess();
				}
				break;
			case 9:
				_localctx = new FunctionValueContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(450);
				((FunctionValueContext)_localctx).body = functionBody();
				}
				break;
			case 10:
				_localctx = new IncValueContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(451);
				((IncValueContext)_localctx).inc = increase_variable();
				}
				break;
			case 11:
				_localctx = new DecValueContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(452);
				((DecValueContext)_localctx).dec = decrease_variable();
				}
				break;
			case 12:
				_localctx = new TemplateValueContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(453);
				((TemplateValueContext)_localctx).bt = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BACKTICK || _la==BACKTICK_HTML) ) {
					((TemplateValueContext)_localctx).bt = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 42785295971647488L) != 0)) {
					{
					{
					setState(454);
					((TemplateValueContext)_localctx).html = html();
					((TemplateValueContext)_localctx).content.add(((TemplateValueContext)_localctx).html);
					}
					}
					setState(459);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(460);
				_la = _input.LA(1);
				if ( !(_la==BACKTICK || _la==BACKTICK_HTML) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BinaryOpContext extends ParserRuleContext {
		public TerminalNode DOUBLE_ASSIGN() { return getToken(GrammarParser.DOUBLE_ASSIGN, 0); }
		public TerminalNode DOUBLE_ASSIGN_ID() { return getToken(GrammarParser.DOUBLE_ASSIGN_ID, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(GrammarParser.NOT_EQUAL, 0); }
		public TerminalNode OR() { return getToken(GrammarParser.OR, 0); }
		public TerminalNode AND() { return getToken(GrammarParser.AND, 0); }
		public TerminalNode DOUBLE_QMARK() { return getToken(GrammarParser.DOUBLE_QMARK, 0); }
		public TerminalNode RTAG() { return getToken(GrammarParser.RTAG, 0); }
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public TerminalNode LTAG() { return getToken(GrammarParser.LTAG, 0); }
		public TerminalNode LTAG_HTML() { return getToken(GrammarParser.LTAG_HTML, 0); }
		public TerminalNode PLUS() { return getToken(GrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GrammarParser.MINUS, 0); }
		public TerminalNode MULT() { return getToken(GrammarParser.MULT, 0); }
		public TerminalNode DIVID() { return getToken(GrammarParser.DIVID, 0); }
		public BinaryOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterBinaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitBinaryOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitBinaryOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryOpContext binaryOp() throws RecognitionException {
		BinaryOpContext _localctx = new BinaryOpContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_binaryOp);
		int _la;
		try {
			setState(481);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				match(DOUBLE_ASSIGN);
				}
				break;
			case DOUBLE_ASSIGN_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				match(DOUBLE_ASSIGN_ID);
				}
				break;
			case NOT_EQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(465);
				match(NOT_EQUAL);
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 4);
				{
				setState(466);
				match(OR);
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 5);
				{
				setState(467);
				match(AND);
				}
				break;
			case DOUBLE_QMARK:
				enterOuterAlt(_localctx, 6);
				{
				setState(468);
				match(DOUBLE_QMARK);
				}
				break;
			case RTAG:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(469);
				match(RTAG);
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN || _la==DOUBLE_ASSIGN) {
					{
					setState(470);
					_la = _input.LA(1);
					if ( !(_la==ASSIGN || _la==DOUBLE_ASSIGN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				}
				break;
			case LTAG:
			case LTAG_HTML:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(473);
				_la = _input.LA(1);
				if ( !(_la==LTAG || _la==LTAG_HTML) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN || _la==DOUBLE_ASSIGN) {
					{
					setState(474);
					_la = _input.LA(1);
					if ( !(_la==ASSIGN || _la==DOUBLE_ASSIGN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 9);
				{
				setState(477);
				match(PLUS);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 10);
				{
				setState(478);
				match(MINUS);
				}
				break;
			case MULT:
				enterOuterAlt(_localctx, 11);
				{
				setState(479);
				match(MULT);
				}
				break;
			case DIVID:
				enterOuterAlt(_localctx, 12);
				{
				setState(480);
				match(DIVID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperatorExpressionContext extends ParserRuleContext {
		public ValueContext val;
		public ComparisonContext comp;
		public TerminalNode DOT() { return getToken(GrammarParser.DOT, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode DOUBLE_QMARK() { return getToken(GrammarParser.DOUBLE_QMARK, 0); }
		public TerminalNode OR() { return getToken(GrammarParser.OR, 0); }
		public TerminalNode AND() { return getToken(GrammarParser.AND, 0); }
		public OperatorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterOperatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitOperatorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitOperatorExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorExpressionContext operatorExpression() throws RecognitionException {
		OperatorExpressionContext _localctx = new OperatorExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_operatorExpression);
		try {
			setState(492);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				match(DOT);
				setState(484);
				((OperatorExpressionContext)_localctx).val = value(0);
				}
				break;
			case DOUBLE_ASSIGN:
			case NOT_EQUAL:
			case DOUBLE_ASSIGN_ID:
			case LTAG:
			case RTAG:
			case LTAG_HTML:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				((OperatorExpressionContext)_localctx).comp = comparison();
				}
				break;
			case DOUBLE_QMARK:
				enterOuterAlt(_localctx, 3);
				{
				setState(486);
				match(DOUBLE_QMARK);
				setState(487);
				((OperatorExpressionContext)_localctx).val = value(0);
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 4);
				{
				setState(488);
				match(OR);
				setState(489);
				((OperatorExpressionContext)_localctx).val = value(0);
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 5);
				{
				setState(490);
				match(AND);
				setState(491);
				((OperatorExpressionContext)_localctx).val = value(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Increase_variableContext extends ParserRuleContext {
		public Token id;
		public TerminalNode PLUSPLUS() { return getToken(GrammarParser.PLUSPLUS, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public Increase_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increase_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterIncrease_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitIncrease_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitIncrease_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Increase_variableContext increase_variable() throws RecognitionException {
		Increase_variableContext _localctx = new Increase_variableContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_increase_variable);
		try {
			setState(498);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				((Increase_variableContext)_localctx).id = match(ID);
				setState(495);
				match(PLUSPLUS);
				}
				break;
			case PLUSPLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				match(PLUSPLUS);
				setState(497);
				((Increase_variableContext)_localctx).id = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Decrease_variableContext extends ParserRuleContext {
		public Token id;
		public TerminalNode MINUSMINUS() { return getToken(GrammarParser.MINUSMINUS, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public Decrease_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decrease_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterDecrease_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitDecrease_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitDecrease_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decrease_variableContext decrease_variable() throws RecognitionException {
		Decrease_variableContext _localctx = new Decrease_variableContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_decrease_variable);
		try {
			setState(504);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(500);
				((Decrease_variableContext)_localctx).id = match(ID);
				setState(501);
				match(MINUSMINUS);
				}
				break;
			case MINUSMINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(502);
				match(MINUSMINUS);
				setState(503);
				((Decrease_variableContext)_localctx).id = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends ParserRuleContext {
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
	 
		public ComparisonContext() { }
		public void copyFrom(ComparisonContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqComparisonContext extends ComparisonContext {
		public PrimaryValueContext right;
		public TerminalNode DOUBLE_ASSIGN() { return getToken(GrammarParser.DOUBLE_ASSIGN, 0); }
		public PrimaryValueContext primaryValue() {
			return getRuleContext(PrimaryValueContext.class,0);
		}
		public EqComparisonContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterEqComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitEqComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitEqComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NeqComparisonContext extends ComparisonContext {
		public PrimaryValueContext right;
		public TerminalNode NOT_EQUAL() { return getToken(GrammarParser.NOT_EQUAL, 0); }
		public PrimaryValueContext primaryValue() {
			return getRuleContext(PrimaryValueContext.class,0);
		}
		public NeqComparisonContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterNeqComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitNeqComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitNeqComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RtagComparisonContext extends ComparisonContext {
		public PrimaryValueContext right;
		public TerminalNode RTAG() { return getToken(GrammarParser.RTAG, 0); }
		public PrimaryValueContext primaryValue() {
			return getRuleContext(PrimaryValueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public TerminalNode DOUBLE_ASSIGN() { return getToken(GrammarParser.DOUBLE_ASSIGN, 0); }
		public RtagComparisonContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterRtagComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitRtagComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitRtagComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdEqComparisonContext extends ComparisonContext {
		public PrimaryValueContext right;
		public TerminalNode DOUBLE_ASSIGN_ID() { return getToken(GrammarParser.DOUBLE_ASSIGN_ID, 0); }
		public PrimaryValueContext primaryValue() {
			return getRuleContext(PrimaryValueContext.class,0);
		}
		public IdEqComparisonContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterIdEqComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitIdEqComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitIdEqComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LtagComparisonContext extends ComparisonContext {
		public PrimaryValueContext right;
		public TerminalNode LTAG() { return getToken(GrammarParser.LTAG, 0); }
		public TerminalNode LTAG_HTML() { return getToken(GrammarParser.LTAG_HTML, 0); }
		public PrimaryValueContext primaryValue() {
			return getRuleContext(PrimaryValueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public TerminalNode DOUBLE_ASSIGN() { return getToken(GrammarParser.DOUBLE_ASSIGN, 0); }
		public LtagComparisonContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterLtagComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitLtagComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitLtagComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_comparison);
		int _la;
		try {
			setState(522);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_ASSIGN_ID:
				_localctx = new IdEqComparisonContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				match(DOUBLE_ASSIGN_ID);
				setState(507);
				((IdEqComparisonContext)_localctx).right = primaryValue();
				}
				break;
			case DOUBLE_ASSIGN:
				_localctx = new EqComparisonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
				match(DOUBLE_ASSIGN);
				setState(509);
				((EqComparisonContext)_localctx).right = primaryValue();
				}
				break;
			case NOT_EQUAL:
				_localctx = new NeqComparisonContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(510);
				match(NOT_EQUAL);
				setState(511);
				((NeqComparisonContext)_localctx).right = primaryValue();
				}
				break;
			case RTAG:
				_localctx = new RtagComparisonContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(512);
				match(RTAG);
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN || _la==DOUBLE_ASSIGN) {
					{
					setState(513);
					_la = _input.LA(1);
					if ( !(_la==ASSIGN || _la==DOUBLE_ASSIGN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(516);
				((RtagComparisonContext)_localctx).right = primaryValue();
				}
				break;
			case LTAG:
			case LTAG_HTML:
				_localctx = new LtagComparisonContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(517);
				_la = _input.LA(1);
				if ( !(_la==LTAG || _la==LTAG_HTML) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN || _la==DOUBLE_ASSIGN) {
					{
					setState(518);
					_la = _input.LA(1);
					if ( !(_la==ASSIGN || _la==DOUBLE_ASSIGN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(521);
				((LtagComparisonContext)_localctx).right = primaryValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectContext extends ParserRuleContext {
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
	 
		public ObjectContext() { }
		public void copyFrom(ObjectContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectRuleContext extends ObjectContext {
		public PairContext pair;
		public List<PairContext> pairs = new ArrayList<PairContext>();
		public TerminalNode LBRACE() { return getToken(GrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(GrammarParser.RBRACE, 0); }
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public ObjectRuleContext(ObjectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterObjectRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitObjectRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitObjectRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_object);
		try {
			int _alt;
			_localctx = new ObjectRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			match(LBRACE);
			setState(525);
			((ObjectRuleContext)_localctx).pair = pair();
			((ObjectRuleContext)_localctx).pairs.add(((ObjectRuleContext)_localctx).pair);
			setState(530);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(526);
					match(COMMA);
					setState(527);
					((ObjectRuleContext)_localctx).pair = pair();
					((ObjectRuleContext)_localctx).pairs.add(((ObjectRuleContext)_localctx).pair);
					}
					} 
				}
				setState(532);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			setState(533);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PairContext extends ParserRuleContext {
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
	 
		public PairContext() { }
		public void copyFrom(PairContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PairRuleContext extends PairContext {
		public Token key;
		public ValueContext val;
		public TerminalNode COLON() { return getToken(GrammarParser.COLON, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PairRuleContext(PairContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterPairRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitPairRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitPairRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_pair);
		try {
			_localctx = new PairRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			((PairRuleContext)_localctx).key = match(ID);
			setState(536);
			match(COLON);
			setState(537);
			((PairRuleContext)_localctx).val = value(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	 
		public ArrayContext() { }
		public void copyFrom(ArrayContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayRuleContext extends ArrayContext {
		public ValueContext value;
		public List<ValueContext> elems = new ArrayList<ValueContext>();
		public TerminalNode LBRACKET() { return getToken(GrammarParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(GrammarParser.RBRACKET, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public ArrayRuleContext(ArrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterArrayRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitArrayRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitArrayRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_array);
		try {
			int _alt;
			_localctx = new ArrayRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(LBRACKET);
			setState(540);
			((ArrayRuleContext)_localctx).value = value(0);
			((ArrayRuleContext)_localctx).elems.add(((ArrayRuleContext)_localctx).value);
			setState(545);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(541);
					match(COMMA);
					setState(542);
					((ArrayRuleContext)_localctx).value = value(0);
					((ArrayRuleContext)_localctx).elems.add(((ArrayRuleContext)_localctx).value);
					}
					} 
				}
				setState(547);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			}
			setState(548);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessContext extends ParserRuleContext {
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
	 
		public ArrayAccessContext() { }
		public void copyFrom(ArrayAccessContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessRuleContext extends ArrayAccessContext {
		public Token arr;
		public ValueContext idx;
		public TerminalNode LBRACKET() { return getToken(GrammarParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(GrammarParser.RBRACKET, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ArrayAccessRuleContext(ArrayAccessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterArrayAccessRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitArrayAccessRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitArrayAccessRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_arrayAccess);
		try {
			_localctx = new ArrayAccessRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			((ArrayAccessRuleContext)_localctx).arr = match(ID);
			setState(551);
			match(LBRACKET);
			setState(552);
			((ArrayAccessRuleContext)_localctx).idx = value(0);
			setState(553);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementNameContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(GrammarParser.DIV, 0); }
		public TerminalNode P() { return getToken(GrammarParser.P, 0); }
		public TerminalNode H1() { return getToken(GrammarParser.H1, 0); }
		public TerminalNode H2() { return getToken(GrammarParser.H2, 0); }
		public TerminalNode H3() { return getToken(GrammarParser.H3, 0); }
		public TerminalNode H4() { return getToken(GrammarParser.H4, 0); }
		public TerminalNode H5() { return getToken(GrammarParser.H5, 0); }
		public TerminalNode H6() { return getToken(GrammarParser.H6, 0); }
		public TerminalNode BUTTON() { return getToken(GrammarParser.BUTTON, 0); }
		public TerminalNode SPAN() { return getToken(GrammarParser.SPAN, 0); }
		public TerminalNode A() { return getToken(GrammarParser.A, 0); }
		public TerminalNode IMG() { return getToken(GrammarParser.IMG, 0); }
		public TerminalNode INPUT() { return getToken(GrammarParser.INPUT, 0); }
		public TerminalNode FORM() { return getToken(GrammarParser.FORM, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public HtmlElementNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElementName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterHtmlElementName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitHtmlElementName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitHtmlElementName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementNameContext htmlElementName() throws RecognitionException {
		HtmlElementNameContext _localctx = new HtmlElementNameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_htmlElementName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			_la = _input.LA(1);
			if ( !(((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & 9006649498927105L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Open_tagContext extends ParserRuleContext {
		public Open_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_tag; }
	 
		public Open_tagContext() { }
		public void copyFrom(Open_tagContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpenTagRuleContext extends Open_tagContext {
		public HtmlElementNameContext name;
		public TerminalNode RTAG() { return getToken(GrammarParser.RTAG, 0); }
		public TerminalNode LTAG() { return getToken(GrammarParser.LTAG, 0); }
		public TerminalNode LTAG_HTML() { return getToken(GrammarParser.LTAG_HTML, 0); }
		public HtmlElementNameContext htmlElementName() {
			return getRuleContext(HtmlElementNameContext.class,0);
		}
		public OpenTagRuleContext(Open_tagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterOpenTagRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitOpenTagRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitOpenTagRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Open_tagContext open_tag() throws RecognitionException {
		Open_tagContext _localctx = new Open_tagContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_open_tag);
		int _la;
		try {
			_localctx = new OpenTagRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			_la = _input.LA(1);
			if ( !(_la==LTAG || _la==LTAG_HTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(558);
			((OpenTagRuleContext)_localctx).name = htmlElementName();
			setState(559);
			match(RTAG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Close_tagContext extends ParserRuleContext {
		public Close_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close_tag; }
	 
		public Close_tagContext() { }
		public void copyFrom(Close_tagContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CloseTagRuleContext extends Close_tagContext {
		public HtmlElementNameContext name;
		public TerminalNode SLASH() { return getToken(GrammarParser.SLASH, 0); }
		public TerminalNode RTAG() { return getToken(GrammarParser.RTAG, 0); }
		public TerminalNode LTAG() { return getToken(GrammarParser.LTAG, 0); }
		public TerminalNode LTAG_HTML() { return getToken(GrammarParser.LTAG_HTML, 0); }
		public HtmlElementNameContext htmlElementName() {
			return getRuleContext(HtmlElementNameContext.class,0);
		}
		public CloseTagRuleContext(Close_tagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterCloseTagRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitCloseTagRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitCloseTagRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Close_tagContext close_tag() throws RecognitionException {
		Close_tagContext _localctx = new Close_tagContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_close_tag);
		int _la;
		try {
			_localctx = new CloseTagRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			_la = _input.LA(1);
			if ( !(_la==LTAG || _la==LTAG_HTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(562);
			match(SLASH);
			setState(563);
			((CloseTagRuleContext)_localctx).name = htmlElementName();
			setState(564);
			match(RTAG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Single_tagContext extends ParserRuleContext {
		public Single_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_tag; }
	 
		public Single_tagContext() { }
		public void copyFrom(Single_tagContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleTagRuleContext extends Single_tagContext {
		public HtmlElementNameContext name;
		public TerminalNode SLASH() { return getToken(GrammarParser.SLASH, 0); }
		public TerminalNode RTAG() { return getToken(GrammarParser.RTAG, 0); }
		public TerminalNode LTAG() { return getToken(GrammarParser.LTAG, 0); }
		public TerminalNode LTAG_HTML() { return getToken(GrammarParser.LTAG_HTML, 0); }
		public HtmlElementNameContext htmlElementName() {
			return getRuleContext(HtmlElementNameContext.class,0);
		}
		public SingleTagRuleContext(Single_tagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterSingleTagRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitSingleTagRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitSingleTagRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_tagContext single_tag() throws RecognitionException {
		Single_tagContext _localctx = new Single_tagContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_single_tag);
		int _la;
		try {
			_localctx = new SingleTagRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			_la = _input.LA(1);
			if ( !(_la==LTAG || _la==LTAG_HTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(567);
			((SingleTagRuleContext)_localctx).name = htmlElementName();
			setState(568);
			match(SLASH);
			setState(569);
			match(RTAG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContext extends ParserRuleContext {
		public HtmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html; }
	 
		public HtmlContext() { }
		public void copyFrom(HtmlContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlSingleContext extends HtmlContext {
		public Single_tagContext single;
		public Single_tagContext single_tag() {
			return getRuleContext(Single_tagContext.class,0);
		}
		public HtmlSingleContext(HtmlContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterHtmlSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitHtmlSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitHtmlSingle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContext extends HtmlContext {
		public Open_tagContext open;
		public HtmlContext html;
		public List<HtmlContext> inner = new ArrayList<HtmlContext>();
		public Close_tagContext close;
		public Open_tagContext open_tag() {
			return getRuleContext(Open_tagContext.class,0);
		}
		public Close_tagContext close_tag() {
			return getRuleContext(Close_tagContext.class,0);
		}
		public List<HtmlContext> html() {
			return getRuleContexts(HtmlContext.class);
		}
		public HtmlContext html(int i) {
			return getRuleContext(HtmlContext.class,i);
		}
		public HtmlElementContext(HtmlContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlBlockContext extends HtmlContext {
		public Token block;
		public StatementContext statement;
		public List<StatementContext> stmts = new ArrayList<StatementContext>();
		public TerminalNode LBRACE_HTML() { return getToken(GrammarParser.LBRACE_HTML, 0); }
		public TerminalNode RBRACE_HTML() { return getToken(GrammarParser.RBRACE_HTML, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(GrammarParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(GrammarParser.RBRACE, i);
		}
		public HtmlBlockContext(HtmlContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterHtmlBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitHtmlBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitHtmlBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTextContext extends HtmlContext {
		public Token text;
		public TerminalNode TEXT_HTML() { return getToken(GrammarParser.TEXT_HTML, 0); }
		public HtmlTextContext(HtmlContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterHtmlText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitHtmlText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitHtmlText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContext html() throws RecognitionException {
		HtmlContext _localctx = new HtmlContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_html);
		int _la;
		try {
			int _alt;
			setState(594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				_localctx = new HtmlElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(571);
				((HtmlElementContext)_localctx).open = open_tag();
				setState(575);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(572);
						((HtmlElementContext)_localctx).html = html();
						((HtmlElementContext)_localctx).inner.add(((HtmlElementContext)_localctx).html);
						}
						} 
					}
					setState(577);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				}
				setState(578);
				((HtmlElementContext)_localctx).close = close_tag();
				}
				break;
			case 2:
				_localctx = new HtmlSingleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(580);
				((HtmlSingleContext)_localctx).single = single_tag();
				}
				break;
			case 3:
				_localctx = new HtmlBlockContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(581);
				((HtmlBlockContext)_localctx).block = match(LBRACE_HTML);
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 61952263197117950L) != 0)) {
					{
					{
					setState(582);
					((HtmlBlockContext)_localctx).statement = statement();
					((HtmlBlockContext)_localctx).stmts.add(((HtmlBlockContext)_localctx).statement);
					}
					}
					setState(587);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(591);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RBRACE_HTML:
					{
					setState(588);
					match(RBRACE_HTML);
					}
					break;
				case RBRACE:
					{
					{
					setState(589);
					match(RBRACE);
					setState(590);
					match(RBRACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				_localctx = new HtmlTextContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(593);
				((HtmlTextContext)_localctx).text = match(TEXT_HTML);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 22:
			return value_sempred((ValueContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean value_sempred(ValueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001I\u0255\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000\u0004\u0000N\b\u0000"+
		"\u000b\u0000\f\u0000O\u0001\u0001\u0001\u0001\u0003\u0001T\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001X\b\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\\\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001`\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001d\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"h\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001l\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001t\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003~\b\u0003\n\u0003\f\u0003\u0081"+
		"\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u0086\b\u0003"+
		"\n\u0003\f\u0003\u0089\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004\u0090\b\u0004\n\u0004\f\u0004\u0093\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u0098\b\u0004\n\u0004"+
		"\f\u0004\u009b\t\u0004\u0001\u0004\u0003\u0004\u009e\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005\u00a3\b\u0005\n\u0005\f\u0005\u00a6"+
		"\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005\u00b4\b\u0005\n\u0005\f\u0005\u00b7\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u00bb\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u00c0\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00c4\b"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00c8\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005\u00cd\b\u0005\n\u0005\f\u0005\u00d0\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u00d8\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00dc\b"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00e1\b\u0005\n"+
		"\u0005\f\u0005\u00e4\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005\u00f0\b\u0005\n\u0005\f\u0005\u00f3\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00ff\b\u0005\n\u0005"+
		"\f\u0005\u0102\t\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0106\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u010e\b\u0006\n\u0006\f\u0006\u0111\t\u0006\u0003\u0006\u0113"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0003\u0007\u0119"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u011d\b\u0007\n\u0007\f\u0007"+
		"\u0120\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u0127\b\u0007\n\u0007\f\u0007\u012a\t\u0007\u0003\u0007\u012c"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0130\b\u0007\u0001\u0007"+
		"\u0003\u0007\u0133\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0137\b"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u013e\b\b\n\b\f"+
		"\b\u0141\t\b\u0003\b\u0143\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0003\n\u014c\b\n\u0001\n\u0001\n\u0003\n\u0150\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0155\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u0160\b\r\n\r\f\r\u0163\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u016a\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u0170\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0005\u0011\u0178\b\u0011\n\u0011"+
		"\f\u0011\u017b\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u0181\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u018a\b\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0005\u0013\u0193\b\u0013\n\u0013\f\u0013\u0196\t\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u019f\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u01a5\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01aa"+
		"\b\u0016\u0001\u0016\u0003\u0016\u01ad\b\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0005\u0016\u01b3\b\u0016\n\u0016\f\u0016\u01b6"+
		"\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u01c8"+
		"\b\u0017\n\u0017\f\u0017\u01cb\t\u0017\u0001\u0017\u0003\u0017\u01ce\b"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01d8\b\u0018\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u01dc\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u01e2\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u01ed\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u01f3\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u01f9\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0203\b\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0208\b\u001c\u0001\u001c\u0003"+
		"\u001c\u020b\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005"+
		"\u001d\u0211\b\u001d\n\u001d\f\u001d\u0214\t\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0005\u001f\u0220\b\u001f\n\u001f\f\u001f\u0223"+
		"\t\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		"!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0005%\u023e\b%\n%"+
		"\f%\u0241\t%\u0001%\u0001%\u0001%\u0001%\u0001%\u0005%\u0248\b%\n%\f%"+
		"\u024b\t%\u0001%\u0001%\u0001%\u0003%\u0250\b%\u0001%\u0003%\u0253\b%"+
		"\u0001%\u0002\u0212\u0221\u0001,&\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJ\u0000\t\u0001\u0000\u0019\u001b\u0002\u0000\u001c\u001c44\u0002\u0000"+
		"\u001d\u001d55\u0001\u0000\u0003\u0005\u0001\u0000-.\u0002\u00002266\u0001"+
		"\u0000\u0018\u0019\u0002\u0000((33\u0002\u0000\u0015\u0015<I\u02a0\u0000"+
		"M\u0001\u0000\u0000\u0000\u0002s\u0001\u0000\u0000\u0000\u0004u\u0001"+
		"\u0000\u0000\u0000\u0006x\u0001\u0000\u0000\u0000\b\u008c\u0001\u0000"+
		"\u0000\u0000\n\u0105\u0001\u0000\u0000\u0000\f\u0107\u0001\u0000\u0000"+
		"\u0000\u000e\u0136\u0001\u0000\u0000\u0000\u0010\u0138\u0001\u0000\u0000"+
		"\u0000\u0012\u0146\u0001\u0000\u0000\u0000\u0014\u0149\u0001\u0000\u0000"+
		"\u0000\u0016\u0151\u0001\u0000\u0000\u0000\u0018\u0159\u0001\u0000\u0000"+
		"\u0000\u001a\u015b\u0001\u0000\u0000\u0000\u001c\u0166\u0001\u0000\u0000"+
		"\u0000\u001e\u016b\u0001\u0000\u0000\u0000 \u0171\u0001\u0000\u0000\u0000"+
		"\"\u0175\u0001\u0000\u0000\u0000$\u0180\u0001\u0000\u0000\u0000&\u0182"+
		"\u0001\u0000\u0000\u0000(\u019a\u0001\u0000\u0000\u0000*\u01a0\u0001\u0000"+
		"\u0000\u0000,\u01a6\u0001\u0000\u0000\u0000.\u01cd\u0001\u0000\u0000\u0000"+
		"0\u01e1\u0001\u0000\u0000\u00002\u01ec\u0001\u0000\u0000\u00004\u01f2"+
		"\u0001\u0000\u0000\u00006\u01f8\u0001\u0000\u0000\u00008\u020a\u0001\u0000"+
		"\u0000\u0000:\u020c\u0001\u0000\u0000\u0000<\u0217\u0001\u0000\u0000\u0000"+
		">\u021b\u0001\u0000\u0000\u0000@\u0226\u0001\u0000\u0000\u0000B\u022b"+
		"\u0001\u0000\u0000\u0000D\u022d\u0001\u0000\u0000\u0000F\u0231\u0001\u0000"+
		"\u0000\u0000H\u0236\u0001\u0000\u0000\u0000J\u0252\u0001\u0000\u0000\u0000"+
		"LN\u0003\u0002\u0001\u0000ML\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000"+
		"\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000P\u0001\u0001"+
		"\u0000\u0000\u0000QS\u0003\f\u0006\u0000RT\u0005\"\u0000\u0000SR\u0001"+
		"\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000Tt\u0001\u0000\u0000\u0000"+
		"UW\u0003\u0010\b\u0000VX\u0005\"\u0000\u0000WV\u0001\u0000\u0000\u0000"+
		"WX\u0001\u0000\u0000\u0000Xt\u0001\u0000\u0000\u0000Y[\u0003\u0012\t\u0000"+
		"Z\\\u0005\"\u0000\u0000[Z\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000"+
		"\u0000\\t\u0001\u0000\u0000\u0000]_\u0003\u0014\n\u0000^`\u0005\"\u0000"+
		"\u0000_^\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`t\u0001\u0000"+
		"\u0000\u0000ac\u0003,\u0016\u0000bd\u0005\"\u0000\u0000cb\u0001\u0000"+
		"\u0000\u0000cd\u0001\u0000\u0000\u0000dt\u0001\u0000\u0000\u0000eg\u0003"+
		"J%\u0000fh\u0005\"\u0000\u0000gf\u0001\u0000\u0000\u0000gh\u0001\u0000"+
		"\u0000\u0000ht\u0001\u0000\u0000\u0000ik\u0003\u0004\u0002\u0000jl\u0005"+
		"\"\u0000\u0000kj\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lt\u0001"+
		"\u0000\u0000\u0000mt\u0003\b\u0004\u0000nt\u0003\u0016\u000b\u0000ot\u0003"+
		"\n\u0005\u0000pt\u0003&\u0013\u0000qt\u0003 \u0010\u0000rt\u0003\u001e"+
		"\u000f\u0000sQ\u0001\u0000\u0000\u0000sU\u0001\u0000\u0000\u0000sY\u0001"+
		"\u0000\u0000\u0000s]\u0001\u0000\u0000\u0000sa\u0001\u0000\u0000\u0000"+
		"se\u0001\u0000\u0000\u0000si\u0001\u0000\u0000\u0000sm\u0001\u0000\u0000"+
		"\u0000sn\u0001\u0000\u0000\u0000so\u0001\u0000\u0000\u0000sp\u0001\u0000"+
		"\u0000\u0000sq\u0001\u0000\u0000\u0000sr\u0001\u0000\u0000\u0000t\u0003"+
		"\u0001\u0000\u0000\u0000uv\u0005\u0007\u0000\u0000vw\u0003,\u0016\u0000"+
		"w\u0005\u0001\u0000\u0000\u0000xy\u0005\b\u0000\u0000yz\u0005&\u0000\u0000"+
		"z\u007f\u0003,\u0016\u0000{|\u0007\u0000\u0000\u0000|~\u0003,\u0016\u0000"+
		"}{\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0082\u0001"+
		"\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0083\u0005"+
		"\'\u0000\u0000\u0083\u0087\u0005\u001c\u0000\u0000\u0084\u0086\u0003\u0002"+
		"\u0001\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000"+
		"\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000"+
		"\u0000\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0005\u001d\u0000\u0000\u008b\u0007\u0001\u0000"+
		"\u0000\u0000\u008c\u0091\u0003\u0006\u0003\u0000\u008d\u008e\u0005\t\u0000"+
		"\u0000\u008e\u0090\u0003\u0006\u0003\u0000\u008f\u008d\u0001\u0000\u0000"+
		"\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u009d\u0001\u0000\u0000"+
		"\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u0095\u0005\t\u0000\u0000"+
		"\u0095\u0099\u0005\u001c\u0000\u0000\u0096\u0098\u0003\u0002\u0001\u0000"+
		"\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u009b\u0001\u0000\u0000\u0000"+
		"\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000"+
		"\u009a\u009c\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000"+
		"\u009c\u009e\u0005\u001d\u0000\u0000\u009d\u0094\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0001\u0000\u0000\u0000\u009e\t\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0005\u000e\u0000\u0000\u00a0\u00a4\u0005\u001c\u0000\u0000\u00a1"+
		"\u00a3\u0003\u0002\u0001\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a7\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005\u001d\u0000\u0000\u00a8"+
		"\u00a9\u0005\u000b\u0000\u0000\u00a9\u00aa\u0005&\u0000\u0000\u00aa\u00ab"+
		"\u0003,\u0016\u0000\u00ab\u00ac\u0005\'\u0000\u0000\u00ac\u0106\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ae\u0005\u000b\u0000\u0000\u00ae\u00af\u0005"+
		"&\u0000\u0000\u00af\u00b0\u0003,\u0016\u0000\u00b0\u00ba\u0005\'\u0000"+
		"\u0000\u00b1\u00b5\u0007\u0001\u0000\u0000\u00b2\u00b4\u0003\u0002\u0001"+
		"\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b8\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b8\u00bb\u0007\u0002\u0000\u0000\u00b9\u00bb\u0003\u0002\u0001"+
		"\u0000\u00ba\u00b1\u0001\u0000\u0000\u0000\u00ba\u00b9\u0001\u0000\u0000"+
		"\u0000\u00bb\u0106\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005\n\u0000\u0000"+
		"\u00bd\u00bf\u0005&\u0000\u0000\u00be\u00c0\u0003\u0014\n\u0000\u00bf"+
		"\u00be\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c3\u0005\"\u0000\u0000\u00c2\u00c4"+
		"\u0003,\u0016\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c7\u0005"+
		"\"\u0000\u0000\u00c6\u00c8\u0003,\u0016\u0000\u00c7\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000"+
		"\u0000\u0000\u00c9\u00ca\u0005\'\u0000\u0000\u00ca\u00ce\u0005\u001c\u0000"+
		"\u0000\u00cb\u00cd\u0003\u0002\u0001\u0000\u00cc\u00cb\u0001\u0000\u0000"+
		"\u0000\u00cd\u00d0\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d1\u0106\u0005\u001d\u0000"+
		"\u0000\u00d2\u00d3\u0005\n\u0000\u0000\u00d3\u00d4\u0005&\u0000\u0000"+
		"\u00d4\u00d5\u0003\u0012\t\u0000\u00d5\u00d7\u0005\"\u0000\u0000\u00d6"+
		"\u00d8\u0003,\u0016\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d7\u00d8"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00db"+
		"\u0005\"\u0000\u0000\u00da\u00dc\u0003,\u0016\u0000\u00db\u00da\u0001"+
		"\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001"+
		"\u0000\u0000\u0000\u00dd\u00de\u0005\'\u0000\u0000\u00de\u00e2\u0005\u001c"+
		"\u0000\u0000\u00df\u00e1\u0003\u0002\u0001\u0000\u00e0\u00df\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e4\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005\u001d"+
		"\u0000\u0000\u00e6\u0106\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005\n\u0000"+
		"\u0000\u00e8\u00e9\u0005&\u0000\u0000\u00e9\u00ea\u0003,\u0016\u0000\u00ea"+
		"\u00eb\u0005\u000f\u0000\u0000\u00eb\u00ec\u0003,\u0016\u0000\u00ec\u00ed"+
		"\u0005\'\u0000\u0000\u00ed\u00f1\u0005\u001c\u0000\u0000\u00ee\u00f0\u0003"+
		"\u0002\u0001\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f4\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f5\u0005\u001d\u0000\u0000\u00f5\u0106\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f7\u0005\n\u0000\u0000\u00f7\u00f8\u0005&"+
		"\u0000\u0000\u00f8\u00f9\u0003\u0012\t\u0000\u00f9\u00fa\u0005\u000f\u0000"+
		"\u0000\u00fa\u00fb\u0003,\u0016\u0000\u00fb\u00fc\u0005\'\u0000\u0000"+
		"\u00fc\u0100\u0005\u001c\u0000\u0000\u00fd\u00ff\u0003\u0002\u0001\u0000"+
		"\u00fe\u00fd\u0001\u0000\u0000\u0000\u00ff\u0102\u0001\u0000\u0000\u0000"+
		"\u0100\u00fe\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000"+
		"\u0101\u0103\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000"+
		"\u0103\u0104\u0005\u001d\u0000\u0000\u0104\u0106\u0001\u0000\u0000\u0000"+
		"\u0105\u009f\u0001\u0000\u0000\u0000\u0105\u00ad\u0001\u0000\u0000\u0000"+
		"\u0105\u00bc\u0001\u0000\u0000\u0000\u0105\u00d2\u0001\u0000\u0000\u0000"+
		"\u0105\u00e7\u0001\u0000\u0000\u0000\u0105\u00f6\u0001\u0000\u0000\u0000"+
		"\u0106\u000b\u0001\u0000\u0000\u0000\u0107\u0108\u0005\u0006\u0000\u0000"+
		"\u0108\u0109\u0005\u0015\u0000\u0000\u0109\u0112\u0005&\u0000\u0000\u010a"+
		"\u010f\u0005\u0015\u0000\u0000\u010b\u010c\u0005!\u0000\u0000\u010c\u010e"+
		"\u0005\u0015\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010e\u0111"+
		"\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u010f\u0110"+
		"\u0001\u0000\u0000\u0000\u0110\u0113\u0001\u0000\u0000\u0000\u0111\u010f"+
		"\u0001\u0000\u0000\u0000\u0112\u010a\u0001\u0000\u0000\u0000\u0112\u0113"+
		"\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0115"+
		"\u0005\'\u0000\u0000\u0115\u0116\u0003\u000e\u0007\u0000\u0116\r\u0001"+
		"\u0000\u0000\u0000\u0117\u0119\u0003(\u0014\u0000\u0118\u0117\u0001\u0000"+
		"\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000"+
		"\u0000\u0000\u011a\u011e\u0005\u001c\u0000\u0000\u011b\u011d\u0003\u0002"+
		"\u0001\u0000\u011c\u011b\u0001\u0000\u0000\u0000\u011d\u0120\u0001\u0000"+
		"\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000"+
		"\u0000\u0000\u011f\u0121\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000"+
		"\u0000\u0000\u0121\u0137\u0005\u001d\u0000\u0000\u0122\u012b\u0005&\u0000"+
		"\u0000\u0123\u0128\u0005\u0015\u0000\u0000\u0124\u0125\u0005!\u0000\u0000"+
		"\u0125\u0127\u0005\u0015\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000"+
		"\u0127\u012a\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000"+
		"\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u012c\u0001\u0000\u0000\u0000"+
		"\u012a\u0128\u0001\u0000\u0000\u0000\u012b\u0123\u0001\u0000\u0000\u0000"+
		"\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000"+
		"\u012d\u0130\u0005\'\u0000\u0000\u012e\u0130\u0005\u0015\u0000\u0000\u012f"+
		"\u0122\u0001\u0000\u0000\u0000\u012f\u012e\u0001\u0000\u0000\u0000\u0130"+
		"\u0132\u0001\u0000\u0000\u0000\u0131\u0133\u0003(\u0014\u0000\u0132\u0131"+
		"\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0134"+
		"\u0001\u0000\u0000\u0000\u0134\u0135\u0005\f\u0000\u0000\u0135\u0137\u0003"+
		",\u0016\u0000\u0136\u0118\u0001\u0000\u0000\u0000\u0136\u012f\u0001\u0000"+
		"\u0000\u0000\u0137\u000f\u0001\u0000\u0000\u0000\u0138\u0139\u0005\u0015"+
		"\u0000\u0000\u0139\u0142\u0005&\u0000\u0000\u013a\u013f\u0003,\u0016\u0000"+
		"\u013b\u013c\u0005!\u0000\u0000\u013c\u013e\u0003,\u0016\u0000\u013d\u013b"+
		"\u0001\u0000\u0000\u0000\u013e\u0141\u0001\u0000\u0000\u0000\u013f\u013d"+
		"\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0143"+
		"\u0001\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0142\u013a"+
		"\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u0144"+
		"\u0001\u0000\u0000\u0000\u0144\u0145\u0005\'\u0000\u0000\u0145\u0011\u0001"+
		"\u0000\u0000\u0000\u0146\u0147\u0007\u0003\u0000\u0000\u0147\u0148\u0003"+
		"\u0014\n\u0000\u0148\u0013\u0001\u0000\u0000\u0000\u0149\u014b\u0005\u0015"+
		"\u0000\u0000\u014a\u014c\u0003(\u0014\u0000\u014b\u014a\u0001\u0000\u0000"+
		"\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u014f\u0001\u0000\u0000"+
		"\u0000\u014d\u014e\u0005\u0018\u0000\u0000\u014e\u0150\u0003,\u0016\u0000"+
		"\u014f\u014d\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000"+
		"\u0150\u0015\u0001\u0000\u0000\u0000\u0151\u0154\u0005\u0001\u0000\u0000"+
		"\u0152\u0155\u0003\u0018\f\u0000\u0153\u0155\u0003\u001a\r\u0000\u0154"+
		"\u0152\u0001\u0000\u0000\u0000\u0154\u0153\u0001\u0000\u0000\u0000\u0155"+
		"\u0156\u0001\u0000\u0000\u0000\u0156\u0157\u0005\r\u0000\u0000\u0157\u0158"+
		"\u0005\u0017\u0000\u0000\u0158\u0017\u0001\u0000\u0000\u0000\u0159\u015a"+
		"\u0005\u0015\u0000\u0000\u015a\u0019\u0001\u0000\u0000\u0000\u015b\u015c"+
		"\u0007\u0001\u0000\u0000\u015c\u0161\u0003\u001c\u000e\u0000\u015d\u015e"+
		"\u0005!\u0000\u0000\u015e\u0160\u0003\u001c\u000e\u0000\u015f\u015d\u0001"+
		"\u0000\u0000\u0000\u0160\u0163\u0001\u0000\u0000\u0000\u0161\u015f\u0001"+
		"\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162\u0164\u0001"+
		"\u0000\u0000\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0164\u0165\u0007"+
		"\u0002\u0000\u0000\u0165\u001b\u0001\u0000\u0000\u0000\u0166\u0169\u0005"+
		"\u0015\u0000\u0000\u0167\u0168\u0005\u0014\u0000\u0000\u0168\u016a\u0005"+
		"\u0015\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u0169\u016a\u0001"+
		"\u0000\u0000\u0000\u016a\u001d\u0001\u0000\u0000\u0000\u016b\u016f\u0005"+
		"\u0010\u0000\u0000\u016c\u0170\u0003 \u0010\u0000\u016d\u0170\u0003,\u0016"+
		"\u0000\u016e\u0170\u0003\u000e\u0007\u0000\u016f\u016c\u0001\u0000\u0000"+
		"\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u016f\u016e\u0001\u0000\u0000"+
		"\u0000\u0170\u001f\u0001\u0000\u0000\u0000\u0171\u0172\u0005\u0002\u0000"+
		"\u0000\u0172\u0173\u0005\u0015\u0000\u0000\u0173\u0174\u0003\"\u0011\u0000"+
		"\u0174!\u0001\u0000\u0000\u0000\u0175\u0179\u0005\u001c\u0000\u0000\u0176"+
		"\u0178\u0003$\u0012\u0000\u0177\u0176\u0001\u0000\u0000\u0000\u0178\u017b"+
		"\u0001\u0000\u0000\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u0179\u017a"+
		"\u0001\u0000\u0000\u0000\u017a\u017c\u0001\u0000\u0000\u0000\u017b\u0179"+
		"\u0001\u0000\u0000\u0000\u017c\u017d\u0005\u001d\u0000\u0000\u017d#\u0001"+
		"\u0000\u0000\u0000\u017e\u0181\u0003\u0012\t\u0000\u017f\u0181\u0003\f"+
		"\u0006\u0000\u0180\u017e\u0001\u0000\u0000\u0000\u0180\u017f\u0001\u0000"+
		"\u0000\u0000\u0181%\u0001\u0000\u0000\u0000\u0182\u0183\u0005\u0012\u0000"+
		"\u0000\u0183\u0184\u0005&\u0000\u0000\u0184\u0189\u0005\u001c\u0000\u0000"+
		"\u0185\u0186\u0005\u0011\u0000\u0000\u0186\u0187\u0005 \u0000\u0000\u0187"+
		"\u0188\u0005\u0017\u0000\u0000\u0188\u018a\u0005!\u0000\u0000\u0189\u0185"+
		"\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u018b"+
		"\u0001\u0000\u0000\u0000\u018b\u018c\u0005\u0013\u0000\u0000\u018c\u018d"+
		"\u0005 \u0000\u0000\u018d\u0194\u0003,\u0016\u0000\u018e\u018f\u0005!"+
		"\u0000\u0000\u018f\u0190\u0005\u0015\u0000\u0000\u0190\u0191\u0005 \u0000"+
		"\u0000\u0191\u0193\u0003,\u0016\u0000\u0192\u018e\u0001\u0000\u0000\u0000"+
		"\u0193\u0196\u0001\u0000\u0000\u0000\u0194\u0192\u0001\u0000\u0000\u0000"+
		"\u0194\u0195\u0001\u0000\u0000\u0000\u0195\u0197\u0001\u0000\u0000\u0000"+
		"\u0196\u0194\u0001\u0000\u0000\u0000\u0197\u0198\u0005\u001d\u0000\u0000"+
		"\u0198\u0199\u0005\'\u0000\u0000\u0199\'\u0001\u0000\u0000\u0000\u019a"+
		"\u019b\u0005 \u0000\u0000\u019b\u019e\u0005\u0015\u0000\u0000\u019c\u019d"+
		"\u0005\u001e\u0000\u0000\u019d\u019f\u0005\u001f\u0000\u0000\u019e\u019c"+
		"\u0001\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f)\u0001"+
		"\u0000\u0000\u0000\u01a0\u01a1\u0005\u0014\u0000\u0000\u01a1\u01a4\u0005"+
		"\u0015\u0000\u0000\u01a2\u01a3\u0005\u001e\u0000\u0000\u01a3\u01a5\u0005"+
		"\u001f\u0000\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001"+
		"\u0000\u0000\u0000\u01a5+\u0001\u0000\u0000\u0000\u01a6\u01a7\u0006\u0016"+
		"\uffff\uffff\u0000\u01a7\u01a9\u0003.\u0017\u0000\u01a8\u01aa\u0007\u0004"+
		"\u0000\u0000\u01a9\u01a8\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000"+
		"\u0000\u0000\u01aa\u01ac\u0001\u0000\u0000\u0000\u01ab\u01ad\u0003*\u0015"+
		"\u0000\u01ac\u01ab\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000"+
		"\u0000\u01ad\u01b4\u0001\u0000\u0000\u0000\u01ae\u01af\n\u0002\u0000\u0000"+
		"\u01af\u01b0\u00030\u0018\u0000\u01b0\u01b1\u0003,\u0016\u0003\u01b1\u01b3"+
		"\u0001\u0000\u0000\u0000\u01b2\u01ae\u0001\u0000\u0000\u0000\u01b3\u01b6"+
		"\u0001\u0000\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b4\u01b5"+
		"\u0001\u0000\u0000\u0000\u01b5-\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001"+
		"\u0000\u0000\u0000\u01b7\u01ce\u0005\u0016\u0000\u0000\u01b8\u01ce\u0005"+
		"\u0017\u0000\u0000\u01b9\u01ce\u0003\u0010\b\u0000\u01ba\u01ce\u0005\u0015"+
		"\u0000\u0000\u01bb\u01bc\u0005&\u0000\u0000\u01bc\u01bd\u0003,\u0016\u0000"+
		"\u01bd\u01be\u0005\'\u0000\u0000\u01be\u01ce\u0001\u0000\u0000\u0000\u01bf"+
		"\u01ce\u0003:\u001d\u0000\u01c0\u01ce\u0003>\u001f\u0000\u01c1\u01ce\u0003"+
		"@ \u0000\u01c2\u01ce\u0003\u000e\u0007\u0000\u01c3\u01ce\u00034\u001a"+
		"\u0000\u01c4\u01ce\u00036\u001b\u0000\u01c5\u01c9\u0007\u0005\u0000\u0000"+
		"\u01c6\u01c8\u0003J%\u0000\u01c7\u01c6\u0001\u0000\u0000\u0000\u01c8\u01cb"+
		"\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001\u0000\u0000\u0000\u01c9\u01ca"+
		"\u0001\u0000\u0000\u0000\u01ca\u01cc\u0001\u0000\u0000\u0000\u01cb\u01c9"+
		"\u0001\u0000\u0000\u0000\u01cc\u01ce\u0007\u0005\u0000\u0000\u01cd\u01b7"+
		"\u0001\u0000\u0000\u0000\u01cd\u01b8\u0001\u0000\u0000\u0000\u01cd\u01b9"+
		"\u0001\u0000\u0000\u0000\u01cd\u01ba\u0001\u0000\u0000\u0000\u01cd\u01bb"+
		"\u0001\u0000\u0000\u0000\u01cd\u01bf\u0001\u0000\u0000\u0000\u01cd\u01c0"+
		"\u0001\u0000\u0000\u0000\u01cd\u01c1\u0001\u0000\u0000\u0000\u01cd\u01c2"+
		"\u0001\u0000\u0000\u0000\u01cd\u01c3\u0001\u0000\u0000\u0000\u01cd\u01c4"+
		"\u0001\u0000\u0000\u0000\u01cd\u01c5\u0001\u0000\u0000\u0000\u01ce/\u0001"+
		"\u0000\u0000\u0000\u01cf\u01e2\u0005\u0019\u0000\u0000\u01d0\u01e2\u0005"+
		"\u001b\u0000\u0000\u01d1\u01e2\u0005\u001a\u0000\u0000\u01d2\u01e2\u0005"+
		"0\u0000\u0000\u01d3\u01e2\u00051\u0000\u0000\u01d4\u01e2\u0005/\u0000"+
		"\u0000\u01d5\u01d7\u0005)\u0000\u0000\u01d6\u01d8\u0007\u0006\u0000\u0000"+
		"\u01d7\u01d6\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000"+
		"\u01d8\u01e2\u0001\u0000\u0000\u0000\u01d9\u01db\u0007\u0007\u0000\u0000"+
		"\u01da\u01dc\u0007\u0006\u0000\u0000\u01db\u01da\u0001\u0000\u0000\u0000"+
		"\u01db\u01dc\u0001\u0000\u0000\u0000\u01dc\u01e2\u0001\u0000\u0000\u0000"+
		"\u01dd\u01e2\u00058\u0000\u0000\u01de\u01e2\u00059\u0000\u0000\u01df\u01e2"+
		"\u0005:\u0000\u0000\u01e0\u01e2\u0005;\u0000\u0000\u01e1\u01cf\u0001\u0000"+
		"\u0000\u0000\u01e1\u01d0\u0001\u0000\u0000\u0000\u01e1\u01d1\u0001\u0000"+
		"\u0000\u0000\u01e1\u01d2\u0001\u0000\u0000\u0000\u01e1\u01d3\u0001\u0000"+
		"\u0000\u0000\u01e1\u01d4\u0001\u0000\u0000\u0000\u01e1\u01d5\u0001\u0000"+
		"\u0000\u0000\u01e1\u01d9\u0001\u0000\u0000\u0000\u01e1\u01dd\u0001\u0000"+
		"\u0000\u0000\u01e1\u01de\u0001\u0000\u0000\u0000\u01e1\u01df\u0001\u0000"+
		"\u0000\u0000\u01e1\u01e0\u0001\u0000\u0000\u0000\u01e21\u0001\u0000\u0000"+
		"\u0000\u01e3\u01e4\u0005#\u0000\u0000\u01e4\u01ed\u0003,\u0016\u0000\u01e5"+
		"\u01ed\u00038\u001c\u0000\u01e6\u01e7\u0005/\u0000\u0000\u01e7\u01ed\u0003"+
		",\u0016\u0000\u01e8\u01e9\u00050\u0000\u0000\u01e9\u01ed\u0003,\u0016"+
		"\u0000\u01ea\u01eb\u00051\u0000\u0000\u01eb\u01ed\u0003,\u0016\u0000\u01ec"+
		"\u01e3\u0001\u0000\u0000\u0000\u01ec\u01e5\u0001\u0000\u0000\u0000\u01ec"+
		"\u01e6\u0001\u0000\u0000\u0000\u01ec\u01e8\u0001\u0000\u0000\u0000\u01ec"+
		"\u01ea\u0001\u0000\u0000\u0000\u01ed3\u0001\u0000\u0000\u0000\u01ee\u01ef"+
		"\u0005\u0015\u0000\u0000\u01ef\u01f3\u0005+\u0000\u0000\u01f0\u01f1\u0005"+
		"+\u0000\u0000\u01f1\u01f3\u0005\u0015\u0000\u0000\u01f2\u01ee\u0001\u0000"+
		"\u0000\u0000\u01f2\u01f0\u0001\u0000\u0000\u0000\u01f35\u0001\u0000\u0000"+
		"\u0000\u01f4\u01f5\u0005\u0015\u0000\u0000\u01f5\u01f9\u0005,\u0000\u0000"+
		"\u01f6\u01f7\u0005,\u0000\u0000\u01f7\u01f9\u0005\u0015\u0000\u0000\u01f8"+
		"\u01f4\u0001\u0000\u0000\u0000\u01f8\u01f6\u0001\u0000\u0000\u0000\u01f9"+
		"7\u0001\u0000\u0000\u0000\u01fa\u01fb\u0005\u001b\u0000\u0000\u01fb\u020b"+
		"\u0003.\u0017\u0000\u01fc\u01fd\u0005\u0019\u0000\u0000\u01fd\u020b\u0003"+
		".\u0017\u0000\u01fe\u01ff\u0005\u001a\u0000\u0000\u01ff\u020b\u0003.\u0017"+
		"\u0000\u0200\u0202\u0005)\u0000\u0000\u0201\u0203\u0007\u0006\u0000\u0000"+
		"\u0202\u0201\u0001\u0000\u0000\u0000\u0202\u0203\u0001\u0000\u0000\u0000"+
		"\u0203\u0204\u0001\u0000\u0000\u0000\u0204\u020b\u0003.\u0017\u0000\u0205"+
		"\u0207\u0007\u0007\u0000\u0000\u0206\u0208\u0007\u0006\u0000\u0000\u0207"+
		"\u0206\u0001\u0000\u0000\u0000\u0207\u0208\u0001\u0000\u0000\u0000\u0208"+
		"\u0209\u0001\u0000\u0000\u0000\u0209\u020b\u0003.\u0017\u0000\u020a\u01fa"+
		"\u0001\u0000\u0000\u0000\u020a\u01fc\u0001\u0000\u0000\u0000\u020a\u01fe"+
		"\u0001\u0000\u0000\u0000\u020a\u0200\u0001\u0000\u0000\u0000\u020a\u0205"+
		"\u0001\u0000\u0000\u0000\u020b9\u0001\u0000\u0000\u0000\u020c\u020d\u0005"+
		"\u001c\u0000\u0000\u020d\u0212\u0003<\u001e\u0000\u020e\u020f\u0005!\u0000"+
		"\u0000\u020f\u0211\u0003<\u001e\u0000\u0210\u020e\u0001\u0000\u0000\u0000"+
		"\u0211\u0214\u0001\u0000\u0000\u0000\u0212\u0213\u0001\u0000\u0000\u0000"+
		"\u0212\u0210\u0001\u0000\u0000\u0000\u0213\u0215\u0001\u0000\u0000\u0000"+
		"\u0214\u0212\u0001\u0000\u0000\u0000\u0215\u0216\u0005\u001d\u0000\u0000"+
		"\u0216;\u0001\u0000\u0000\u0000\u0217\u0218\u0005\u0015\u0000\u0000\u0218"+
		"\u0219\u0005 \u0000\u0000\u0219\u021a\u0003,\u0016\u0000\u021a=\u0001"+
		"\u0000\u0000\u0000\u021b\u021c\u0005\u001e\u0000\u0000\u021c\u0221\u0003"+
		",\u0016\u0000\u021d\u021e\u0005!\u0000\u0000\u021e\u0220\u0003,\u0016"+
		"\u0000\u021f\u021d\u0001\u0000\u0000\u0000\u0220\u0223\u0001\u0000\u0000"+
		"\u0000\u0221\u0222\u0001\u0000\u0000\u0000\u0221\u021f\u0001\u0000\u0000"+
		"\u0000\u0222\u0224\u0001\u0000\u0000\u0000\u0223\u0221\u0001\u0000\u0000"+
		"\u0000\u0224\u0225\u0005\u001f\u0000\u0000\u0225?\u0001\u0000\u0000\u0000"+
		"\u0226\u0227\u0005\u0015\u0000\u0000\u0227\u0228\u0005\u001e\u0000\u0000"+
		"\u0228\u0229\u0003,\u0016\u0000\u0229\u022a\u0005\u001f\u0000\u0000\u022a"+
		"A\u0001\u0000\u0000\u0000\u022b\u022c\u0007\b\u0000\u0000\u022cC\u0001"+
		"\u0000\u0000\u0000\u022d\u022e\u0007\u0007\u0000\u0000\u022e\u022f\u0003"+
		"B!\u0000\u022f\u0230\u0005)\u0000\u0000\u0230E\u0001\u0000\u0000\u0000"+
		"\u0231\u0232\u0007\u0007\u0000\u0000\u0232\u0233\u0005*\u0000\u0000\u0233"+
		"\u0234\u0003B!\u0000\u0234\u0235\u0005)\u0000\u0000\u0235G\u0001\u0000"+
		"\u0000\u0000\u0236\u0237\u0007\u0007\u0000\u0000\u0237\u0238\u0003B!\u0000"+
		"\u0238\u0239\u0005*\u0000\u0000\u0239\u023a\u0005)\u0000\u0000\u023aI"+
		"\u0001\u0000\u0000\u0000\u023b\u023f\u0003D\"\u0000\u023c\u023e\u0003"+
		"J%\u0000\u023d\u023c\u0001\u0000\u0000\u0000\u023e\u0241\u0001\u0000\u0000"+
		"\u0000\u023f\u023d\u0001\u0000\u0000\u0000\u023f\u0240\u0001\u0000\u0000"+
		"\u0000\u0240\u0242\u0001\u0000\u0000\u0000\u0241\u023f\u0001\u0000\u0000"+
		"\u0000\u0242\u0243\u0003F#\u0000\u0243\u0253\u0001\u0000\u0000\u0000\u0244"+
		"\u0253\u0003H$\u0000\u0245\u0249\u00054\u0000\u0000\u0246\u0248\u0003"+
		"\u0002\u0001\u0000\u0247\u0246\u0001\u0000\u0000\u0000\u0248\u024b\u0001"+
		"\u0000\u0000\u0000\u0249\u0247\u0001\u0000\u0000\u0000\u0249\u024a\u0001"+
		"\u0000\u0000\u0000\u024a\u024f\u0001\u0000\u0000\u0000\u024b\u0249\u0001"+
		"\u0000\u0000\u0000\u024c\u0250\u00055\u0000\u0000\u024d\u024e\u0005\u001d"+
		"\u0000\u0000\u024e\u0250\u0005\u001d\u0000\u0000\u024f\u024c\u0001\u0000"+
		"\u0000\u0000\u024f\u024d\u0001\u0000\u0000\u0000\u0250\u0253\u0001\u0000"+
		"\u0000\u0000\u0251\u0253\u00057\u0000\u0000\u0252\u023b\u0001\u0000\u0000"+
		"\u0000\u0252\u0244\u0001\u0000\u0000\u0000\u0252\u0245\u0001\u0000\u0000"+
		"\u0000\u0252\u0251\u0001\u0000\u0000\u0000\u0253K\u0001\u0000\u0000\u0000"+
		"FOSW[_cgks\u007f\u0087\u0091\u0099\u009d\u00a4\u00b5\u00ba\u00bf\u00c3"+
		"\u00c7\u00ce\u00d7\u00db\u00e2\u00f1\u0100\u0105\u010f\u0112\u0118\u011e"+
		"\u0128\u012b\u012f\u0132\u0136\u013f\u0142\u014b\u014f\u0154\u0161\u0169"+
		"\u016f\u0179\u0180\u0189\u0194\u019e\u01a4\u01a9\u01ac\u01b4\u01c9\u01cd"+
		"\u01d7\u01db\u01e1\u01ec\u01f2\u01f8\u0202\u0207\u020a\u0212\u0221\u023f"+
		"\u0249\u024f\u0252";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}