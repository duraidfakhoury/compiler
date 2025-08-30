// Generated from D:/Projects/compiler/GrammarParser.g4 by ANTLR 4.13.2
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
		NG_FOR=1, NG_IF=2, IMPORT=3, CLASS=4, CONST=5, LET=6, VAR=7, FUNCTION=8, 
		RETURN=9, IF=10, ELSE=11, FOR=12, WHILE=13, ARROW=14, FROM=15, DO=16, 
		IN=17, EXPORT=18, SELECTOR=19, COMPONENT=20, TEMPLATE=21, AS=22, TYPE=23, 
		OF=24, ID=25, NUMBER=26, STRING=27, ASSIGN=28, PLUS=29, MINUS=30, MULT=31, 
		DOUBLE_ASSIGN=32, NOT_EQUAL=33, DOUBLE_ASSIGN_ID=34, LBRACE=35, RBRACE=36, 
		LBRACKET=37, RBRACKET=38, COLON=39, COMMA=40, SEMICOLON=41, DOT=42, WHITESPACE=43, 
		COMMENT=44, LPAREN=45, RPAREN=46, LTAG=47, RTAG=48, SLASH=49, PLUSPLUS=50, 
		MINUSMINUS=51, QMARK=52, EMARK=53, DOUBLE_QMARK=54, OR=55, AND=56, BACKTICK=57, 
		LTAG_HTML=58, LBRACE_HTML=59, RBRACE_HTML=60, BACKTICK_HTML=61, TEXT_HTML=62, 
		WS=63, DIV=64, P=65, H1=66, H2=67, H3=68, H4=69, H5=70, H6=71, BUTTON=72, 
		SPAN=73, A=74, IMG=75, INPUT=76, FORM=77;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_return = 2, RULE_ifBody = 3, 
		RULE_ifStatement = 4, RULE_iterationStatement = 5, RULE_functionDeclaration = 6, 
		RULE_functionBody = 7, RULE_functionCall = 8, RULE_variableDeclaration = 9, 
		RULE_variableAssign = 10, RULE_importStatement = 11, RULE_defaultImport = 12, 
		RULE_namedImports = 13, RULE_importSpecifier = 14, RULE_exportStatement = 15, 
		RULE_classDeclaration = 16, RULE_classBody = 17, RULE_classBodyStatement = 18, 
		RULE_componentStatement = 19, RULE_typeDefine = 20, RULE_typeDeclaration = 21, 
		RULE_typeDeclarationValue = 22, RULE_typeObject = 23, RULE_typeMember = 24, 
		RULE_asType = 25, RULE_value = 26, RULE_primaryValue = 27, RULE_binaryOp = 28, 
		RULE_increase_variable = 29, RULE_decrease_variable = 30, RULE_comparison = 31, 
		RULE_object = 32, RULE_pair = 33, RULE_array = 34, RULE_arrayAccess = 35, 
		RULE_htmlElementName = 36, RULE_open_tag = 37, RULE_attributes = 38, RULE_attribute = 39, 
		RULE_attributeValue = 40, RULE_interpolation = 41, RULE_close_tag = 42, 
		RULE_single_tag = 43, RULE_html = 44;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "return", "ifBody", "ifStatement", "iterationStatement", 
			"functionDeclaration", "functionBody", "functionCall", "variableDeclaration", 
			"variableAssign", "importStatement", "defaultImport", "namedImports", 
			"importSpecifier", "exportStatement", "classDeclaration", "classBody", 
			"classBodyStatement", "componentStatement", "typeDefine", "typeDeclaration", 
			"typeDeclarationValue", "typeObject", "typeMember", "asType", "value", 
			"primaryValue", "binaryOp", "increase_variable", "decrease_variable", 
			"comparison", "object", "pair", "array", "arrayAccess", "htmlElementName", 
			"open_tag", "attributes", "attribute", "attributeValue", "interpolation", 
			"close_tag", "single_tag", "html"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*ngFor'", "'*ngIf'", "'import'", "'class'", "'const'", "'let'", 
			"'var'", "'function'", "'return'", "'if'", "'else'", "'for'", "'while'", 
			"'=>'", "'from'", "'do'", "'in'", "'export'", "'selector'", "'@component'", 
			"'template'", "'as'", "'type'", "'of'", null, null, null, "'='", "'+'", 
			"'-'", "'*'", "'=='", "'!=='", "'==='", "'{'", "'}'", "'['", "']'", "':'", 
			"','", "';'", "'.'", null, null, "'('", "')'", null, "'>'", "'/'", "'++'", 
			"'--'", "'?'", "'!'", "'??'", "'||'", "'&&'", null, null, "'{{'", "'}}'", 
			null, null, null, "'div'", "'p'", "'h1'", "'h2'", "'h3'", "'h4'", "'h5'", 
			"'h6'", "'button'", "'span'", "'a'", "'img'", "'input'", "'form'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NG_FOR", "NG_IF", "IMPORT", "CLASS", "CONST", "LET", "VAR", "FUNCTION", 
			"RETURN", "IF", "ELSE", "FOR", "WHILE", "ARROW", "FROM", "DO", "IN", 
			"EXPORT", "SELECTOR", "COMPONENT", "TEMPLATE", "AS", "TYPE", "OF", "ID", 
			"NUMBER", "STRING", "ASSIGN", "PLUS", "MINUS", "MULT", "DOUBLE_ASSIGN", 
			"NOT_EQUAL", "DOUBLE_ASSIGN_ID", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", 
			"COLON", "COMMA", "SEMICOLON", "DOT", "WHITESPACE", "COMMENT", "LPAREN", 
			"RPAREN", "LTAG", "RTAG", "SLASH", "PLUSPLUS", "MINUSMINUS", "QMARK", 
			"EMARK", "DOUBLE_QMARK", "OR", "AND", "BACKTICK", "LTAG_HTML", "LBRACE_HTML", 
			"RBRACE_HTML", "BACKTICK_HTML", "TEXT_HTML", "WS", "DIV", "P", "H1", 
			"H2", "H3", "H4", "H5", "H6", "BUTTON", "SPAN", "A", "IMG", "INPUT", 
			"FORM"
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
			setState(91); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(90);
				((ProgramRuleContext)_localctx).statement = statement();
				((ProgramRuleContext)_localctx).statements.add(((ProgramRuleContext)_localctx).statement);
				}
				}
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 7938896886806951928L) != 0) );
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
	public static class StmtTypeDeclContext extends StatementContext {
		public TypeDeclarationContext typeDecl;
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public StmtTypeDeclContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterStmtTypeDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitStmtTypeDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitStmtTypeDecl(this);
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
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new StmtFunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				((StmtFunctionDeclContext)_localctx).decl = functionDeclaration();
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(96);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 2:
				_localctx = new StmtFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				((StmtFunctionCallContext)_localctx).call = functionCall();
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(100);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 3:
				_localctx = new StmtVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				((StmtVarDeclContext)_localctx).vardecl = variableDeclaration();
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(104);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 4:
				_localctx = new StmtVarAssignContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				((StmtVarAssignContext)_localctx).varassign = variableAssign();
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(108);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 5:
				_localctx = new StmtValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(111);
				((StmtValueContext)_localctx).val = value(0);
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(112);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 6:
				_localctx = new StmtHtmlContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(115);
				((StmtHtmlContext)_localctx).h = html();
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(116);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 7:
				_localctx = new StmtReturnContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(119);
				((StmtReturnContext)_localctx).ret = return_();
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(120);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 8:
				_localctx = new StmtIfContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(123);
				((StmtIfContext)_localctx).ifstmt = ifStatement();
				}
				break;
			case 9:
				_localctx = new StmtImportContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(124);
				((StmtImportContext)_localctx).imp = importStatement();
				}
				break;
			case 10:
				_localctx = new StmtIterationContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(125);
				((StmtIterationContext)_localctx).loop = iterationStatement();
				}
				break;
			case 11:
				_localctx = new StmtComponentContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(126);
				((StmtComponentContext)_localctx).comp = componentStatement();
				}
				break;
			case 12:
				_localctx = new StmtClassContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(127);
				((StmtClassContext)_localctx).classDecl = classDeclaration();
				}
				break;
			case 13:
				_localctx = new StmtExportContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(128);
				((StmtExportContext)_localctx).exp = exportStatement();
				}
				break;
			case 14:
				_localctx = new StmtTypeDeclContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(129);
				((StmtTypeDeclContext)_localctx).typeDecl = typeDeclaration();
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(130);
					match(SEMICOLON);
					}
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
			setState(135);
			match(RETURN);
			setState(136);
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
		public Token _tset214;
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
			setState(138);
			match(IF);
			setState(139);
			match(LPAREN);
			setState(140);
			((IfBodyRuleContext)_localctx).left = value(0);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30064771072L) != 0)) {
				{
				{
				setState(141);
				((IfBodyRuleContext)_localctx)._tset214 = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30064771072L) != 0)) ) {
					((IfBodyRuleContext)_localctx)._tset214 = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				((IfBodyRuleContext)_localctx).condOps.add(((IfBodyRuleContext)_localctx)._tset214);
				setState(142);
				((IfBodyRuleContext)_localctx).value = value(0);
				((IfBodyRuleContext)_localctx).right.add(((IfBodyRuleContext)_localctx).value);
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
			match(RPAREN);
			setState(149);
			match(LBRACE);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7938896886806951928L) != 0)) {
				{
				{
				setState(150);
				((IfBodyRuleContext)_localctx).statement = statement();
				((IfBodyRuleContext)_localctx).stmts.add(((IfBodyRuleContext)_localctx).statement);
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
			setState(158);
			((IfStatementRuleContext)_localctx).ifBody = ifBody();
			((IfStatementRuleContext)_localctx).ifBlocks.add(((IfStatementRuleContext)_localctx).ifBody);
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(159);
					match(ELSE);
					setState(160);
					((IfStatementRuleContext)_localctx).ifBody = ifBody();
					((IfStatementRuleContext)_localctx).elseIfs.add(((IfStatementRuleContext)_localctx).ifBody);
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(166);
				match(ELSE);
				setState(167);
				((IfStatementRuleContext)_localctx).elseBlock = match(LBRACE);
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7938896886806951928L) != 0)) {
					{
					{
					setState(168);
					((IfStatementRuleContext)_localctx).statement = statement();
					((IfStatementRuleContext)_localctx).elseStmts.add(((IfStatementRuleContext)_localctx).statement);
					}
					}
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(174);
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
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new DoWhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(DO);
				setState(178);
				match(LBRACE);
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7938896886806951928L) != 0)) {
					{
					{
					setState(179);
					((DoWhileLoopContext)_localctx).statement = statement();
					((DoWhileLoopContext)_localctx).body.add(((DoWhileLoopContext)_localctx).statement);
					}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(185);
				match(RBRACE);
				setState(186);
				match(WHILE);
				setState(187);
				match(LPAREN);
				setState(188);
				((DoWhileLoopContext)_localctx).cond = value(0);
				setState(189);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(WHILE);
				setState(192);
				match(LPAREN);
				setState(193);
				((WhileLoopContext)_localctx).cond = value(0);
				setState(194);
				match(RPAREN);
				setState(204);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(195);
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
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7938896886806951928L) != 0)) {
						{
						{
						setState(196);
						((WhileLoopContext)_localctx).statement = statement();
						((WhileLoopContext)_localctx).stmts.add(((WhileLoopContext)_localctx).statement);
						}
						}
						setState(201);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(202);
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
					setState(203);
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
				setState(206);
				match(FOR);
				setState(207);
				match(LPAREN);
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(208);
					((ForLoopAssignContext)_localctx).initVal = variableAssign();
					}
				}

				setState(211);
				match(SEMICOLON);
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2462379002426294272L) != 0)) {
					{
					setState(212);
					((ForLoopAssignContext)_localctx).cond = value(0);
					}
				}

				setState(215);
				match(SEMICOLON);
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2462379002426294272L) != 0)) {
					{
					setState(216);
					((ForLoopAssignContext)_localctx).step = value(0);
					}
				}

				setState(219);
				match(RPAREN);
				setState(220);
				match(LBRACE);
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7938896886806951928L) != 0)) {
					{
					{
					setState(221);
					((ForLoopAssignContext)_localctx).statement = statement();
					((ForLoopAssignContext)_localctx).body.add(((ForLoopAssignContext)_localctx).statement);
					}
					}
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(227);
				match(RBRACE);
				}
				break;
			case 4:
				_localctx = new ForLoopDeclContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(228);
				match(FOR);
				setState(229);
				match(LPAREN);
				setState(230);
				((ForLoopDeclContext)_localctx).initDecl = variableDeclaration();
				setState(231);
				match(SEMICOLON);
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2462379002426294272L) != 0)) {
					{
					setState(232);
					((ForLoopDeclContext)_localctx).cond = value(0);
					}
				}

				setState(235);
				match(SEMICOLON);
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2462379002426294272L) != 0)) {
					{
					setState(236);
					((ForLoopDeclContext)_localctx).step = value(0);
					}
				}

				setState(239);
				match(RPAREN);
				setState(240);
				match(LBRACE);
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7938896886806951928L) != 0)) {
					{
					{
					setState(241);
					((ForLoopDeclContext)_localctx).statement = statement();
					((ForLoopDeclContext)_localctx).body.add(((ForLoopDeclContext)_localctx).statement);
					}
					}
					setState(246);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(247);
				match(RBRACE);
				}
				break;
			case 5:
				_localctx = new ForInLoopValContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(249);
				match(FOR);
				setState(250);
				match(LPAREN);
				setState(251);
				((ForInLoopValContext)_localctx).iterVal = value(0);
				setState(252);
				match(IN);
				setState(253);
				((ForInLoopValContext)_localctx).iterable = value(0);
				setState(254);
				match(RPAREN);
				setState(255);
				match(LBRACE);
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7938896886806951928L) != 0)) {
					{
					{
					setState(256);
					((ForInLoopValContext)_localctx).statement = statement();
					((ForInLoopValContext)_localctx).body.add(((ForInLoopValContext)_localctx).statement);
					}
					}
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(262);
				match(RBRACE);
				}
				break;
			case 6:
				_localctx = new ForInLoopDeclContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(264);
				match(FOR);
				setState(265);
				match(LPAREN);
				setState(266);
				((ForInLoopDeclContext)_localctx).iterDecl = variableDeclaration();
				setState(267);
				match(IN);
				setState(268);
				((ForInLoopDeclContext)_localctx).iterable = value(0);
				setState(269);
				match(RPAREN);
				setState(270);
				match(LBRACE);
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7938896886806951928L) != 0)) {
					{
					{
					setState(271);
					((ForInLoopDeclContext)_localctx).statement = statement();
					((ForInLoopDeclContext)_localctx).body.add(((ForInLoopDeclContext)_localctx).statement);
					}
					}
					setState(276);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(277);
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
			setState(281);
			match(FUNCTION);
			setState(282);
			((FunctionDeclarationRuleContext)_localctx).funcName = match(ID);
			setState(283);
			match(LPAREN);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(284);
				((FunctionDeclarationRuleContext)_localctx).ID = match(ID);
				((FunctionDeclarationRuleContext)_localctx).params.add(((FunctionDeclarationRuleContext)_localctx).ID);
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(285);
					match(COMMA);
					setState(286);
					((FunctionDeclarationRuleContext)_localctx).ID = match(ID);
					((FunctionDeclarationRuleContext)_localctx).params.add(((FunctionDeclarationRuleContext)_localctx).ID);
					}
					}
					setState(291);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(294);
			match(RPAREN);
			setState(295);
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
			setState(328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
			case COLON:
				_localctx = new FunctionBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(297);
					((FunctionBlockContext)_localctx).type = typeDefine();
					}
				}

				setState(300);
				match(LBRACE);
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7938896886806951928L) != 0)) {
					{
					{
					setState(301);
					((FunctionBlockContext)_localctx).statement = statement();
					((FunctionBlockContext)_localctx).stmts.add(((FunctionBlockContext)_localctx).statement);
					}
					}
					setState(306);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(307);
				match(RBRACE);
				}
				break;
			case ID:
			case LPAREN:
				_localctx = new FunctionArrowContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LPAREN:
					{
					{
					setState(308);
					match(LPAREN);
					setState(317);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(309);
						((FunctionArrowContext)_localctx).ID = match(ID);
						((FunctionArrowContext)_localctx).params.add(((FunctionArrowContext)_localctx).ID);
						setState(314);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(310);
							match(COMMA);
							setState(311);
							((FunctionArrowContext)_localctx).ID = match(ID);
							((FunctionArrowContext)_localctx).params.add(((FunctionArrowContext)_localctx).ID);
							}
							}
							setState(316);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(319);
					match(RPAREN);
					}
					}
					break;
				case ID:
					{
					setState(320);
					((FunctionArrowContext)_localctx).singleParam = match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(323);
					((FunctionArrowContext)_localctx).type = typeDefine();
					}
				}

				setState(326);
				match(ARROW);
				setState(327);
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
			setState(330);
			((FunctionCallRuleContext)_localctx).funcName = match(ID);
			setState(331);
			match(LPAREN);
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2462379002426294272L) != 0)) {
				{
				setState(332);
				((FunctionCallRuleContext)_localctx).value = value(0);
				((FunctionCallRuleContext)_localctx).args.add(((FunctionCallRuleContext)_localctx).value);
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(333);
					match(COMMA);
					setState(334);
					((FunctionCallRuleContext)_localctx).value = value(0);
					((FunctionCallRuleContext)_localctx).args.add(((FunctionCallRuleContext)_localctx).value);
					}
					}
					setState(339);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(342);
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
			setState(344);
			((VarDeclarationRuleContext)_localctx).kind = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 224L) != 0)) ) {
				((VarDeclarationRuleContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(345);
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
			setState(347);
			((VarAssignRuleContext)_localctx).varName = match(ID);
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(348);
				((VarAssignRuleContext)_localctx).type = typeDefine();
				}
				break;
			}
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(351);
				match(ASSIGN);
				setState(352);
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
			setState(355);
			match(IMPORT);
			setState(358);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(356);
				((ImportRuleContext)_localctx).def = defaultImport();
				}
				break;
			case LBRACE:
			case LBRACE_HTML:
				{
				setState(357);
				((ImportRuleContext)_localctx).named = namedImports();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(360);
			match(FROM);
			setState(361);
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
			setState(363);
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
			setState(365);
			_la = _input.LA(1);
			if ( !(_la==LBRACE || _la==LBRACE_HTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(366);
			((NamedImportsRuleContext)_localctx).importSpecifier = importSpecifier();
			((NamedImportsRuleContext)_localctx).imports.add(((NamedImportsRuleContext)_localctx).importSpecifier);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(367);
				match(COMMA);
				setState(368);
				((NamedImportsRuleContext)_localctx).importSpecifier = importSpecifier();
				((NamedImportsRuleContext)_localctx).imports.add(((NamedImportsRuleContext)_localctx).importSpecifier);
				}
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(374);
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
			setState(376);
			((ImportSpecifierRuleContext)_localctx).name = match(ID);
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(377);
				match(AS);
				setState(378);
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
			setState(381);
			match(EXPORT);
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(382);
				((ExportRuleContext)_localctx).cls = classDeclaration();
				}
				break;
			case 2:
				{
				setState(383);
				((ExportRuleContext)_localctx).val = value(0);
				}
				break;
			case 3:
				{
				setState(384);
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
			setState(387);
			match(CLASS);
			setState(388);
			((ClassDeclarationRuleContext)_localctx).name = match(ID);
			setState(389);
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
			setState(391);
			match(LBRACE);
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 480L) != 0)) {
				{
				{
				setState(392);
				((ClassBodyRuleContext)_localctx).classBodyStatement = classBodyStatement();
				((ClassBodyRuleContext)_localctx).stmts.add(((ClassBodyRuleContext)_localctx).classBodyStatement);
				}
				}
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(398);
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
			setState(402);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
			case LET:
			case VAR:
				_localctx = new ClassVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				((ClassVarDeclContext)_localctx).var = variableDeclaration();
				}
				break;
			case FUNCTION:
				_localctx = new ClassFuncDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
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
			setState(404);
			match(COMPONENT);
			setState(405);
			match(LPAREN);
			setState(406);
			match(LBRACE);
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SELECTOR) {
				{
				setState(407);
				match(SELECTOR);
				setState(408);
				match(COLON);
				setState(409);
				((ComponentRuleContext)_localctx).selector = match(STRING);
				setState(410);
				match(COMMA);
				}
			}

			setState(413);
			match(TEMPLATE);
			setState(414);
			match(COLON);
			setState(415);
			((ComponentRuleContext)_localctx).template = value(0);
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(416);
				match(COMMA);
				setState(417);
				((ComponentRuleContext)_localctx).ID = match(ID);
				((ComponentRuleContext)_localctx).keys.add(((ComponentRuleContext)_localctx).ID);
				setState(418);
				match(COLON);
				setState(419);
				((ComponentRuleContext)_localctx).value = value(0);
				((ComponentRuleContext)_localctx).vals.add(((ComponentRuleContext)_localctx).value);
				}
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(425);
			match(RBRACE);
			setState(426);
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
			setState(428);
			match(COLON);
			setState(429);
			((TypeDefineRuleContext)_localctx).type = match(ID);
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(430);
				match(LBRACKET);
				setState(431);
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
	public static class TypeDeclarationContext extends ParserRuleContext {
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
	 
		public TypeDeclarationContext() { }
		public void copyFrom(TypeDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeDeclarationRuleContext extends TypeDeclarationContext {
		public Token name;
		public TypeDeclarationValueContext typeValue;
		public TerminalNode TYPE() { return getToken(GrammarParser.TYPE, 0); }
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TypeDeclarationValueContext typeDeclarationValue() {
			return getRuleContext(TypeDeclarationValueContext.class,0);
		}
		public TypeDeclarationRuleContext(TypeDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterTypeDeclarationRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitTypeDeclarationRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitTypeDeclarationRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typeDeclaration);
		try {
			_localctx = new TypeDeclarationRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(TYPE);
			setState(435);
			((TypeDeclarationRuleContext)_localctx).name = match(ID);
			setState(436);
			match(ASSIGN);
			setState(437);
			((TypeDeclarationRuleContext)_localctx).typeValue = typeDeclarationValue();
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
	public static class TypeDeclarationValueContext extends ParserRuleContext {
		public TypeDeclarationValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclarationValue; }
	 
		public TypeDeclarationValueContext() { }
		public void copyFrom(TypeDeclarationValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeObjectAssignContext extends TypeDeclarationValueContext {
		public TypeObjectContext obj;
		public TypeObjectContext typeObject() {
			return getRuleContext(TypeObjectContext.class,0);
		}
		public TypeObjectAssignContext(TypeDeclarationValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterTypeObjectAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitTypeObjectAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitTypeObjectAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeSimpleContext extends TypeDeclarationValueContext {
		public Token type;
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode LBRACKET() { return getToken(GrammarParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(GrammarParser.RBRACKET, 0); }
		public TypeSimpleContext(TypeDeclarationValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterTypeSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitTypeSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitTypeSimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationValueContext typeDeclarationValue() throws RecognitionException {
		TypeDeclarationValueContext _localctx = new TypeDeclarationValueContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeDeclarationValue);
		try {
			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new TypeSimpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				((TypeSimpleContext)_localctx).type = match(ID);
				setState(442);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(440);
					match(LBRACKET);
					setState(441);
					match(RBRACKET);
					}
					break;
				}
				}
				break;
			case LBRACE:
				_localctx = new TypeObjectAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				((TypeObjectAssignContext)_localctx).obj = typeObject();
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
	public static class TypeObjectContext extends ParserRuleContext {
		public TypeObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeObject; }
	 
		public TypeObjectContext() { }
		public void copyFrom(TypeObjectContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeObjectRuleContext extends TypeObjectContext {
		public TypeMemberContext typeMember;
		public List<TypeMemberContext> typeMembers = new ArrayList<TypeMemberContext>();
		public TerminalNode LBRACE() { return getToken(GrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(GrammarParser.RBRACE, 0); }
		public List<TypeMemberContext> typeMember() {
			return getRuleContexts(TypeMemberContext.class);
		}
		public TypeMemberContext typeMember(int i) {
			return getRuleContext(TypeMemberContext.class,i);
		}
		public TypeObjectRuleContext(TypeObjectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterTypeObjectRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitTypeObjectRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitTypeObjectRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeObjectContext typeObject() throws RecognitionException {
		TypeObjectContext _localctx = new TypeObjectContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typeObject);
		int _la;
		try {
			_localctx = new TypeObjectRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(LBRACE);
			setState(448);
			((TypeObjectRuleContext)_localctx).typeMember = typeMember();
			((TypeObjectRuleContext)_localctx).typeMembers.add(((TypeObjectRuleContext)_localctx).typeMember);
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(449);
				((TypeObjectRuleContext)_localctx).typeMember = typeMember();
				((TypeObjectRuleContext)_localctx).typeMembers.add(((TypeObjectRuleContext)_localctx).typeMember);
				}
				}
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(455);
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
	public static class TypeMemberContext extends ParserRuleContext {
		public TypeMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeMember; }
	 
		public TypeMemberContext() { }
		public void copyFrom(TypeMemberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeMemberRuleContext extends TypeMemberContext {
		public Token name;
		public TypeDeclarationValueContext type;
		public TerminalNode COLON() { return getToken(GrammarParser.COLON, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TypeDeclarationValueContext typeDeclarationValue() {
			return getRuleContext(TypeDeclarationValueContext.class,0);
		}
		public TypeMemberRuleContext(TypeMemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterTypeMemberRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitTypeMemberRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitTypeMemberRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeMemberContext typeMember() throws RecognitionException {
		TypeMemberContext _localctx = new TypeMemberContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_typeMember);
		try {
			_localctx = new TypeMemberRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			((TypeMemberRuleContext)_localctx).name = match(ID);
			setState(458);
			match(COLON);
			setState(459);
			((TypeMemberRuleContext)_localctx).type = typeDeclarationValue();
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
		enterRule(_localctx, 50, RULE_asType);
		try {
			_localctx = new AsTypeRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(AS);
			setState(462);
			((AsTypeRuleContext)_localctx).type = match(ID);
			setState(465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(463);
				match(LBRACKET);
				setState(464);
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
	public static class MethodCallValueContext extends ValueContext {
		public ValueContext left;
		public ValueContext value;
		public List<ValueContext> args = new ArrayList<ValueContext>();
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
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
		public MethodCallValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterMethodCallValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitMethodCallValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitMethodCallValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyAccessValueContext extends ValueContext {
		public ValueContext left;
		public ValueContext right;
		public TerminalNode DOT() { return getToken(GrammarParser.DOT, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public PropertyAccessValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterPropertyAccessValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitPropertyAccessValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitPropertyAccessValue(this);
			else return visitor.visitChildren(this);
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
	public static class ArrowFunctionValueContext extends ValueContext {
		public Token ID;
		public List<Token> params = new ArrayList<Token>();
		public ValueContext body;
		public TerminalNode ARROW() { return getToken(GrammarParser.ARROW, 0); }
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public ArrowFunctionValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterArrowFunctionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitArrowFunctionValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitArrowFunctionValue(this);
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
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_value, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				_localctx = new PrimaryValueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(468);
				((PrimaryValueExprContext)_localctx).pv = primaryValue();
				setState(470);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(469);
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
				setState(473);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(472);
					((PrimaryValueExprContext)_localctx).type = asType();
					}
					break;
				}
				}
				break;
			case 2:
				{
				_localctx = new ArrowFunctionValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(475);
				((ArrowFunctionValueContext)_localctx).ID = match(ID);
				((ArrowFunctionValueContext)_localctx).params.add(((ArrowFunctionValueContext)_localctx).ID);
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(476);
					match(COMMA);
					setState(477);
					((ArrowFunctionValueContext)_localctx).ID = match(ID);
					((ArrowFunctionValueContext)_localctx).params.add(((ArrowFunctionValueContext)_localctx).ID);
					}
					}
					setState(482);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(483);
				match(ARROW);
				setState(484);
				((ArrowFunctionValueContext)_localctx).body = value(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(508);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(506);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryValueContext(new ValueContext(_parentctx, _parentState));
						((BinaryValueContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(487);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(488);
						((BinaryValueContext)_localctx).op = binaryOp();
						setState(489);
						((BinaryValueContext)_localctx).right = value(6);
						}
						break;
					case 2:
						{
						_localctx = new PropertyAccessValueContext(new ValueContext(_parentctx, _parentState));
						((PropertyAccessValueContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(491);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(492);
						match(DOT);
						setState(493);
						((PropertyAccessValueContext)_localctx).right = value(4);
						}
						break;
					case 3:
						{
						_localctx = new MethodCallValueContext(new ValueContext(_parentctx, _parentState));
						((MethodCallValueContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(494);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(495);
						match(LPAREN);
						setState(496);
						((MethodCallValueContext)_localctx).value = value(0);
						((MethodCallValueContext)_localctx).args.add(((MethodCallValueContext)_localctx).value);
						setState(501);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(497);
							match(COMMA);
							setState(498);
							((MethodCallValueContext)_localctx).value = value(0);
							((MethodCallValueContext)_localctx).args.add(((MethodCallValueContext)_localctx).value);
							}
							}
							setState(503);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(504);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(510);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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
	public static class NegationValueContext extends PrimaryValueContext {
		public ValueContext right;
		public TerminalNode EMARK() { return getToken(GrammarParser.EMARK, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public NegationValueContext(PrimaryValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterNegationValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitNegationValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitNegationValue(this);
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

	public final PrimaryValueContext primaryValue() throws RecognitionException {
		PrimaryValueContext _localctx = new PrimaryValueContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_primaryValue);
		int _la;
		try {
			setState(535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				_localctx = new NumberValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				((NumberValueContext)_localctx).num = match(NUMBER);
				}
				break;
			case 2:
				_localctx = new StringValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(512);
				((StringValueContext)_localctx).str = match(STRING);
				}
				break;
			case 3:
				_localctx = new CallValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(513);
				((CallValueContext)_localctx).call = functionCall();
				}
				break;
			case 4:
				_localctx = new IdValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(514);
				((IdValueContext)_localctx).id = match(ID);
				}
				break;
			case 5:
				_localctx = new ParenValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(515);
				match(LPAREN);
				setState(516);
				((ParenValueContext)_localctx).inner = value(0);
				setState(517);
				match(RPAREN);
				}
				break;
			case 6:
				_localctx = new ObjectValueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(519);
				((ObjectValueContext)_localctx).obj = object();
				}
				break;
			case 7:
				_localctx = new ArrayValueContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(520);
				((ArrayValueContext)_localctx).arr = array();
				}
				break;
			case 8:
				_localctx = new ArrayAccessValueContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(521);
				((ArrayAccessValueContext)_localctx).access = arrayAccess();
				}
				break;
			case 9:
				_localctx = new FunctionValueContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(522);
				((FunctionValueContext)_localctx).body = functionBody();
				}
				break;
			case 10:
				_localctx = new IncValueContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(523);
				((IncValueContext)_localctx).inc = increase_variable();
				}
				break;
			case 11:
				_localctx = new DecValueContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(524);
				((DecValueContext)_localctx).dec = decrease_variable();
				}
				break;
			case 12:
				_localctx = new NegationValueContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(525);
				match(EMARK);
				setState(526);
				((NegationValueContext)_localctx).right = value(0);
				}
				break;
			case 13:
				_localctx = new TemplateValueContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(527);
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
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5476517884370878464L) != 0)) {
					{
					{
					setState(528);
					((TemplateValueContext)_localctx).html = html();
					((TemplateValueContext)_localctx).content.add(((TemplateValueContext)_localctx).html);
					}
					}
					setState(533);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(534);
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
		public TerminalNode SLASH() { return getToken(GrammarParser.SLASH, 0); }
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
		enterRule(_localctx, 56, RULE_binaryOp);
		int _la;
		try {
			setState(555);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(537);
				match(DOUBLE_ASSIGN);
				}
				break;
			case DOUBLE_ASSIGN_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(538);
				match(DOUBLE_ASSIGN_ID);
				}
				break;
			case NOT_EQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(539);
				match(NOT_EQUAL);
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 4);
				{
				setState(540);
				match(OR);
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 5);
				{
				setState(541);
				match(AND);
				}
				break;
			case DOUBLE_QMARK:
				enterOuterAlt(_localctx, 6);
				{
				setState(542);
				match(DOUBLE_QMARK);
				}
				break;
			case RTAG:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(543);
				match(RTAG);
				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN || _la==DOUBLE_ASSIGN) {
					{
					setState(544);
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
				setState(547);
				_la = _input.LA(1);
				if ( !(_la==LTAG || _la==LTAG_HTML) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN || _la==DOUBLE_ASSIGN) {
					{
					setState(548);
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
				setState(551);
				match(PLUS);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 10);
				{
				setState(552);
				match(MINUS);
				}
				break;
			case MULT:
				enterOuterAlt(_localctx, 11);
				{
				setState(553);
				match(MULT);
				}
				break;
			case SLASH:
				enterOuterAlt(_localctx, 12);
				{
				setState(554);
				match(SLASH);
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
		enterRule(_localctx, 58, RULE_increase_variable);
		try {
			setState(561);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(557);
				((Increase_variableContext)_localctx).id = match(ID);
				setState(558);
				match(PLUSPLUS);
				}
				break;
			case PLUSPLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(559);
				match(PLUSPLUS);
				setState(560);
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
		enterRule(_localctx, 60, RULE_decrease_variable);
		try {
			setState(567);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(563);
				((Decrease_variableContext)_localctx).id = match(ID);
				setState(564);
				match(MINUSMINUS);
				}
				break;
			case MINUSMINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(565);
				match(MINUSMINUS);
				setState(566);
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
		public ValueContext right;
		public TerminalNode DOUBLE_ASSIGN() { return getToken(GrammarParser.DOUBLE_ASSIGN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
		public ValueContext right;
		public TerminalNode NOT_EQUAL() { return getToken(GrammarParser.NOT_EQUAL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
		public ValueContext right;
		public TerminalNode RTAG() { return getToken(GrammarParser.RTAG, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
		public ValueContext right;
		public TerminalNode DOUBLE_ASSIGN_ID() { return getToken(GrammarParser.DOUBLE_ASSIGN_ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
		public ValueContext right;
		public TerminalNode LTAG() { return getToken(GrammarParser.LTAG, 0); }
		public TerminalNode LTAG_HTML() { return getToken(GrammarParser.LTAG_HTML, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
		enterRule(_localctx, 62, RULE_comparison);
		int _la;
		try {
			setState(585);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_ASSIGN_ID:
				_localctx = new IdEqComparisonContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(569);
				match(DOUBLE_ASSIGN_ID);
				setState(570);
				((IdEqComparisonContext)_localctx).right = value(0);
				}
				break;
			case DOUBLE_ASSIGN:
				_localctx = new EqComparisonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				match(DOUBLE_ASSIGN);
				setState(572);
				((EqComparisonContext)_localctx).right = value(0);
				}
				break;
			case NOT_EQUAL:
				_localctx = new NeqComparisonContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(573);
				match(NOT_EQUAL);
				setState(574);
				((NeqComparisonContext)_localctx).right = value(0);
				}
				break;
			case RTAG:
				_localctx = new RtagComparisonContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(575);
				match(RTAG);
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN || _la==DOUBLE_ASSIGN) {
					{
					setState(576);
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

				setState(579);
				((RtagComparisonContext)_localctx).right = value(0);
				}
				break;
			case LTAG:
			case LTAG_HTML:
				_localctx = new LtagComparisonContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(580);
				_la = _input.LA(1);
				if ( !(_la==LTAG || _la==LTAG_HTML) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN || _la==DOUBLE_ASSIGN) {
					{
					setState(581);
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

				setState(584);
				((LtagComparisonContext)_localctx).right = value(0);
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
		enterRule(_localctx, 64, RULE_object);
		try {
			int _alt;
			_localctx = new ObjectRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(LBRACE);
			setState(588);
			((ObjectRuleContext)_localctx).pair = pair();
			((ObjectRuleContext)_localctx).pairs.add(((ObjectRuleContext)_localctx).pair);
			setState(593);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(589);
					match(COMMA);
					setState(590);
					((ObjectRuleContext)_localctx).pair = pair();
					((ObjectRuleContext)_localctx).pairs.add(((ObjectRuleContext)_localctx).pair);
					}
					} 
				}
				setState(595);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			setState(596);
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
		enterRule(_localctx, 66, RULE_pair);
		try {
			_localctx = new PairRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			((PairRuleContext)_localctx).key = match(ID);
			setState(599);
			match(COLON);
			setState(600);
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
		enterRule(_localctx, 68, RULE_array);
		int _la;
		try {
			_localctx = new ArrayRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			match(LBRACKET);
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2462379002426294272L) != 0)) {
				{
				setState(603);
				((ArrayRuleContext)_localctx).value = value(0);
				((ArrayRuleContext)_localctx).elems.add(((ArrayRuleContext)_localctx).value);
				setState(608);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(604);
					match(COMMA);
					setState(605);
					((ArrayRuleContext)_localctx).value = value(0);
					((ArrayRuleContext)_localctx).elems.add(((ArrayRuleContext)_localctx).value);
					}
					}
					setState(610);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(613);
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
		enterRule(_localctx, 70, RULE_arrayAccess);
		try {
			_localctx = new ArrayAccessRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			((ArrayAccessRuleContext)_localctx).arr = match(ID);
			setState(616);
			match(LBRACKET);
			setState(617);
			((ArrayAccessRuleContext)_localctx).idx = value(0);
			setState(618);
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
		enterRule(_localctx, 72, RULE_htmlElementName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			_la = _input.LA(1);
			if ( !(((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 9006649498927105L) != 0)) ) {
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
		public List<AttributesContext> attributes() {
			return getRuleContexts(AttributesContext.class);
		}
		public AttributesContext attributes(int i) {
			return getRuleContext(AttributesContext.class,i);
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
		enterRule(_localctx, 74, RULE_open_tag);
		int _la;
		try {
			_localctx = new OpenTagRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			_la = _input.LA(1);
			if ( !(_la==LTAG || _la==LTAG_HTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(623);
			((OpenTagRuleContext)_localctx).name = htmlElementName();
			setState(627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33554438L) != 0)) {
				{
				{
				setState(624);
				attributes();
				}
				}
				setState(629);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(630);
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
	public static class AttributesContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_attributes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(633); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(632);
					attribute();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(635); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class AttributeContext extends ParserRuleContext {
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
	 
		public AttributeContext() { }
		public void copyFrom(AttributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NgForAttributeRuleContext extends AttributeContext {
		public Token varName;
		public Token collection;
		public TerminalNode NG_FOR() { return getToken(GrammarParser.NG_FOR, 0); }
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public List<TerminalNode> BACKTICK() { return getTokens(GrammarParser.BACKTICK); }
		public TerminalNode BACKTICK(int i) {
			return getToken(GrammarParser.BACKTICK, i);
		}
		public TerminalNode LET() { return getToken(GrammarParser.LET, 0); }
		public TerminalNode OF() { return getToken(GrammarParser.OF, 0); }
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public NgForAttributeRuleContext(AttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterNgForAttributeRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitNgForAttributeRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitNgForAttributeRule(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RegularAttributeContext extends AttributeContext {
		public Token name;
		public AttributeValueContext val;
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public AttributeValueContext attributeValue() {
			return getRuleContext(AttributeValueContext.class,0);
		}
		public RegularAttributeContext(AttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterRegularAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitRegularAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitRegularAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NgIfAttributeRuleContext extends AttributeContext {
		public ValueContext condition;
		public TerminalNode NG_IF() { return getToken(GrammarParser.NG_IF, 0); }
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public List<TerminalNode> BACKTICK() { return getTokens(GrammarParser.BACKTICK); }
		public TerminalNode BACKTICK(int i) {
			return getToken(GrammarParser.BACKTICK, i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public NgIfAttributeRuleContext(AttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterNgIfAttributeRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitNgIfAttributeRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitNgIfAttributeRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_attribute);
		try {
			setState(654);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NG_FOR:
				_localctx = new NgForAttributeRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(637);
				match(NG_FOR);
				setState(638);
				match(ASSIGN);
				setState(639);
				match(BACKTICK);
				setState(640);
				match(LET);
				setState(641);
				((NgForAttributeRuleContext)_localctx).varName = match(ID);
				setState(642);
				match(OF);
				setState(643);
				((NgForAttributeRuleContext)_localctx).collection = match(ID);
				setState(644);
				match(BACKTICK);
				}
				break;
			case NG_IF:
				_localctx = new NgIfAttributeRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(645);
				match(NG_IF);
				setState(646);
				match(ASSIGN);
				setState(647);
				match(BACKTICK);
				setState(648);
				((NgIfAttributeRuleContext)_localctx).condition = value(0);
				setState(649);
				match(BACKTICK);
				}
				break;
			case ID:
				_localctx = new RegularAttributeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(651);
				((RegularAttributeContext)_localctx).name = match(ID);
				setState(652);
				match(ASSIGN);
				setState(653);
				((RegularAttributeContext)_localctx).val = attributeValue();
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
	public static class AttributeValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public InterpolationContext interpolation() {
			return getRuleContext(InterpolationContext.class,0);
		}
		public AttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeValueContext attributeValue() throws RecognitionException {
		AttributeValueContext _localctx = new AttributeValueContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_attributeValue);
		try {
			setState(658);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(656);
				match(STRING);
				}
				break;
			case LBRACE:
			case LBRACE_HTML:
				enterOuterAlt(_localctx, 2);
				{
				setState(657);
				interpolation();
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
	public static class InterpolationContext extends ParserRuleContext {
		public InterpolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolation; }
	 
		public InterpolationContext() { }
		public void copyFrom(InterpolationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NestedTemplateInterpolationContext extends InterpolationContext {
		public HtmlContext html;
		public List<HtmlContext> nested = new ArrayList<HtmlContext>();
		public List<TerminalNode> LBRACE_HTML() { return getTokens(GrammarParser.LBRACE_HTML); }
		public TerminalNode LBRACE_HTML(int i) {
			return getToken(GrammarParser.LBRACE_HTML, i);
		}
		public TerminalNode RBRACE_HTML() { return getToken(GrammarParser.RBRACE_HTML, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(GrammarParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(GrammarParser.LBRACE, i);
		}
		public List<HtmlContext> html() {
			return getRuleContexts(HtmlContext.class);
		}
		public HtmlContext html(int i) {
			return getRuleContext(HtmlContext.class,i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(GrammarParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(GrammarParser.RBRACE, i);
		}
		public NestedTemplateInterpolationContext(InterpolationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterNestedTemplateInterpolation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitNestedTemplateInterpolation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitNestedTemplateInterpolation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleInterpolationContext extends InterpolationContext {
		public ValueContext expr;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode LBRACE_HTML() { return getToken(GrammarParser.LBRACE_HTML, 0); }
		public TerminalNode RBRACE_HTML() { return getToken(GrammarParser.RBRACE_HTML, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(GrammarParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(GrammarParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(GrammarParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(GrammarParser.RBRACE, i);
		}
		public SimpleInterpolationContext(InterpolationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterSimpleInterpolation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitSimpleInterpolation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitSimpleInterpolation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolationContext interpolation() throws RecognitionException {
		InterpolationContext _localctx = new InterpolationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_interpolation);
		int _la;
		try {
			setState(688);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				_localctx = new SimpleInterpolationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(663);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACE_HTML:
					{
					setState(660);
					match(LBRACE_HTML);
					}
					break;
				case LBRACE:
					{
					{
					setState(661);
					match(LBRACE);
					setState(662);
					match(LBRACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(665);
				((SimpleInterpolationContext)_localctx).expr = value(0);
				setState(669);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RBRACE_HTML:
					{
					setState(666);
					match(RBRACE_HTML);
					}
					break;
				case RBRACE:
					{
					{
					setState(667);
					match(RBRACE);
					setState(668);
					match(RBRACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				_localctx = new NestedTemplateInterpolationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(674);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACE_HTML:
					{
					setState(671);
					match(LBRACE_HTML);
					}
					break;
				case LBRACE:
					{
					{
					setState(672);
					match(LBRACE);
					setState(673);
					match(LBRACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(676);
				match(LBRACE_HTML);
				setState(680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5476517884370878464L) != 0)) {
					{
					{
					setState(677);
					((NestedTemplateInterpolationContext)_localctx).html = html();
					((NestedTemplateInterpolationContext)_localctx).nested.add(((NestedTemplateInterpolationContext)_localctx).html);
					}
					}
					setState(682);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(686);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RBRACE_HTML:
					{
					setState(683);
					match(RBRACE_HTML);
					}
					break;
				case RBRACE:
					{
					{
					setState(684);
					match(RBRACE);
					setState(685);
					match(RBRACE);
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
		enterRule(_localctx, 84, RULE_close_tag);
		int _la;
		try {
			_localctx = new CloseTagRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			_la = _input.LA(1);
			if ( !(_la==LTAG || _la==LTAG_HTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(691);
			match(SLASH);
			setState(692);
			((CloseTagRuleContext)_localctx).name = htmlElementName();
			setState(693);
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
		enterRule(_localctx, 86, RULE_single_tag);
		int _la;
		try {
			_localctx = new SingleTagRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			_la = _input.LA(1);
			if ( !(_la==LTAG || _la==LTAG_HTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(696);
			((SingleTagRuleContext)_localctx).name = htmlElementName();
			setState(697);
			match(SLASH);
			setState(698);
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
		enterRule(_localctx, 88, RULE_html);
		int _la;
		try {
			int _alt;
			setState(723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				_localctx = new HtmlElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(700);
				((HtmlElementContext)_localctx).open = open_tag();
				setState(704);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(701);
						((HtmlElementContext)_localctx).html = html();
						((HtmlElementContext)_localctx).inner.add(((HtmlElementContext)_localctx).html);
						}
						} 
					}
					setState(706);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				}
				setState(707);
				((HtmlElementContext)_localctx).close = close_tag();
				}
				break;
			case 2:
				_localctx = new HtmlSingleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(709);
				((HtmlSingleContext)_localctx).single = single_tag();
				}
				break;
			case 3:
				_localctx = new HtmlBlockContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(710);
				((HtmlBlockContext)_localctx).block = match(LBRACE_HTML);
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7938896886806951928L) != 0)) {
					{
					{
					setState(711);
					((HtmlBlockContext)_localctx).statement = statement();
					((HtmlBlockContext)_localctx).stmts.add(((HtmlBlockContext)_localctx).statement);
					}
					}
					setState(716);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(720);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RBRACE_HTML:
					{
					setState(717);
					match(RBRACE_HTML);
					}
					break;
				case RBRACE:
					{
					{
					setState(718);
					match(RBRACE);
					setState(719);
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
				setState(722);
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
		case 26:
			return value_sempred((ValueContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean value_sempred(ValueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001M\u02d6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0001"+
		"\u0000\u0004\u0000\\\b\u0000\u000b\u0000\f\u0000]\u0001\u0001\u0001\u0001"+
		"\u0003\u0001b\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001f\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001j\b\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001n\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001r\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001v\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"z\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0084\b\u0001\u0003\u0001"+
		"\u0086\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u0090\b\u0003\n\u0003"+
		"\f\u0003\u0093\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"\u0098\b\u0003\n\u0003\f\u0003\u009b\t\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00a2\b\u0004\n\u0004\f\u0004"+
		"\u00a5\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00aa\b"+
		"\u0004\n\u0004\f\u0004\u00ad\t\u0004\u0001\u0004\u0003\u0004\u00b0\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00b5\b\u0005\n\u0005"+
		"\f\u0005\u00b8\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005\u00c6\b\u0005\n\u0005\f\u0005\u00c9"+
		"\t\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00cd\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u00d2\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u00d6\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00da\b"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00df\b\u0005\n"+
		"\u0005\f\u0005\u00e2\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00ea\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00ee\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005\u00f3\b\u0005\n\u0005\f\u0005\u00f6\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005\u0102\b\u0005\n\u0005\f\u0005\u0105"+
		"\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0111"+
		"\b\u0005\n\u0005\f\u0005\u0114\t\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u0118\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u0120\b\u0006\n\u0006\f\u0006\u0123\t\u0006\u0003"+
		"\u0006\u0125\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0003"+
		"\u0007\u012b\b\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u012f\b\u0007"+
		"\n\u0007\f\u0007\u0132\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007\u0139\b\u0007\n\u0007\f\u0007\u013c\t\u0007"+
		"\u0003\u0007\u013e\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0142\b"+
		"\u0007\u0001\u0007\u0003\u0007\u0145\b\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u0149\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0150"+
		"\b\b\n\b\f\b\u0153\t\b\u0003\b\u0155\b\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0003\n\u015e\b\n\u0001\n\u0001\n\u0003\n\u0162"+
		"\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0167\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0005\r\u0172\b\r\n\r\f\r\u0175\t\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u017c\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u0182\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0005\u0011\u018a\b\u0011"+
		"\n\u0011\f\u0011\u018d\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u0193\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u019c\b\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0005\u0013\u01a5\b\u0013\n\u0013\f\u0013\u01a8\t\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u01b1\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01bb\b\u0016"+
		"\u0001\u0016\u0003\u0016\u01be\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0005\u0017\u01c3\b\u0017\n\u0017\f\u0017\u01c6\t\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u01d2\b\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u01d7\b\u001a\u0001\u001a\u0003\u001a\u01da"+
		"\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u01df\b\u001a"+
		"\n\u001a\f\u001a\u01e2\t\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01e6"+
		"\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0005\u001a\u01f4\b\u001a\n\u001a\f\u001a\u01f7\t\u001a\u0001\u001a"+
		"\u0001\u001a\u0005\u001a\u01fb\b\u001a\n\u001a\f\u001a\u01fe\t\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005"+
		"\u001b\u0212\b\u001b\n\u001b\f\u001b\u0215\t\u001b\u0001\u001b\u0003\u001b"+
		"\u0218\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0222\b\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u0226\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u022c\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u0232\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0003\u001e\u0238\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f"+
		"\u0242\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0247\b"+
		"\u001f\u0001\u001f\u0003\u001f\u024a\b\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0005 \u0250\b \n \f \u0253\t \u0001 \u0001 \u0001!\u0001!\u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u025f\b\"\n\"\f\"\u0262\t\""+
		"\u0003\"\u0264\b\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#"+
		"\u0001$\u0001$\u0001%\u0001%\u0001%\u0005%\u0272\b%\n%\f%\u0275\t%\u0001"+
		"%\u0001%\u0001&\u0004&\u027a\b&\u000b&\f&\u027b\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u028f\b\'\u0001(\u0001"+
		"(\u0003(\u0293\b(\u0001)\u0001)\u0001)\u0003)\u0298\b)\u0001)\u0001)\u0001"+
		")\u0001)\u0003)\u029e\b)\u0001)\u0001)\u0001)\u0003)\u02a3\b)\u0001)\u0001"+
		")\u0005)\u02a7\b)\n)\f)\u02aa\t)\u0001)\u0001)\u0001)\u0003)\u02af\b)"+
		"\u0003)\u02b1\b)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001,\u0001,\u0005,\u02bf\b,\n,\f,\u02c2\t,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0005,\u02c9\b,\n,\f,\u02cc\t,\u0001,\u0001,\u0001"+
		",\u0003,\u02d1\b,\u0001,\u0003,\u02d4\b,\u0001,\u0001\u0251\u00014-\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVX\u0000\t\u0001\u0000 \"\u0002\u0000"+
		"##;;\u0002\u0000$$<<\u0001\u0000\u0005\u0007\u0001\u000045\u0002\u0000"+
		"99==\u0002\u0000\u001c\u001c  \u0002\u0000//::\u0002\u0000\u0019\u0019"+
		"@M\u032d\u0000[\u0001\u0000\u0000\u0000\u0002\u0085\u0001\u0000\u0000"+
		"\u0000\u0004\u0087\u0001\u0000\u0000\u0000\u0006\u008a\u0001\u0000\u0000"+
		"\u0000\b\u009e\u0001\u0000\u0000\u0000\n\u0117\u0001\u0000\u0000\u0000"+
		"\f\u0119\u0001\u0000\u0000\u0000\u000e\u0148\u0001\u0000\u0000\u0000\u0010"+
		"\u014a\u0001\u0000\u0000\u0000\u0012\u0158\u0001\u0000\u0000\u0000\u0014"+
		"\u015b\u0001\u0000\u0000\u0000\u0016\u0163\u0001\u0000\u0000\u0000\u0018"+
		"\u016b\u0001\u0000\u0000\u0000\u001a\u016d\u0001\u0000\u0000\u0000\u001c"+
		"\u0178\u0001\u0000\u0000\u0000\u001e\u017d\u0001\u0000\u0000\u0000 \u0183"+
		"\u0001\u0000\u0000\u0000\"\u0187\u0001\u0000\u0000\u0000$\u0192\u0001"+
		"\u0000\u0000\u0000&\u0194\u0001\u0000\u0000\u0000(\u01ac\u0001\u0000\u0000"+
		"\u0000*\u01b2\u0001\u0000\u0000\u0000,\u01bd\u0001\u0000\u0000\u0000."+
		"\u01bf\u0001\u0000\u0000\u00000\u01c9\u0001\u0000\u0000\u00002\u01cd\u0001"+
		"\u0000\u0000\u00004\u01e5\u0001\u0000\u0000\u00006\u0217\u0001\u0000\u0000"+
		"\u00008\u022b\u0001\u0000\u0000\u0000:\u0231\u0001\u0000\u0000\u0000<"+
		"\u0237\u0001\u0000\u0000\u0000>\u0249\u0001\u0000\u0000\u0000@\u024b\u0001"+
		"\u0000\u0000\u0000B\u0256\u0001\u0000\u0000\u0000D\u025a\u0001\u0000\u0000"+
		"\u0000F\u0267\u0001\u0000\u0000\u0000H\u026c\u0001\u0000\u0000\u0000J"+
		"\u026e\u0001\u0000\u0000\u0000L\u0279\u0001\u0000\u0000\u0000N\u028e\u0001"+
		"\u0000\u0000\u0000P\u0292\u0001\u0000\u0000\u0000R\u02b0\u0001\u0000\u0000"+
		"\u0000T\u02b2\u0001\u0000\u0000\u0000V\u02b7\u0001\u0000\u0000\u0000X"+
		"\u02d3\u0001\u0000\u0000\u0000Z\\\u0003\u0002\u0001\u0000[Z\u0001\u0000"+
		"\u0000\u0000\\]\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001"+
		"\u0000\u0000\u0000^\u0001\u0001\u0000\u0000\u0000_a\u0003\f\u0006\u0000"+
		"`b\u0005)\u0000\u0000a`\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000"+
		"b\u0086\u0001\u0000\u0000\u0000ce\u0003\u0010\b\u0000df\u0005)\u0000\u0000"+
		"ed\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000f\u0086\u0001\u0000"+
		"\u0000\u0000gi\u0003\u0012\t\u0000hj\u0005)\u0000\u0000ih\u0001\u0000"+
		"\u0000\u0000ij\u0001\u0000\u0000\u0000j\u0086\u0001\u0000\u0000\u0000"+
		"km\u0003\u0014\n\u0000ln\u0005)\u0000\u0000ml\u0001\u0000\u0000\u0000"+
		"mn\u0001\u0000\u0000\u0000n\u0086\u0001\u0000\u0000\u0000oq\u00034\u001a"+
		"\u0000pr\u0005)\u0000\u0000qp\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000"+
		"\u0000r\u0086\u0001\u0000\u0000\u0000su\u0003X,\u0000tv\u0005)\u0000\u0000"+
		"ut\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000v\u0086\u0001\u0000"+
		"\u0000\u0000wy\u0003\u0004\u0002\u0000xz\u0005)\u0000\u0000yx\u0001\u0000"+
		"\u0000\u0000yz\u0001\u0000\u0000\u0000z\u0086\u0001\u0000\u0000\u0000"+
		"{\u0086\u0003\b\u0004\u0000|\u0086\u0003\u0016\u000b\u0000}\u0086\u0003"+
		"\n\u0005\u0000~\u0086\u0003&\u0013\u0000\u007f\u0086\u0003 \u0010\u0000"+
		"\u0080\u0086\u0003\u001e\u000f\u0000\u0081\u0083\u0003*\u0015\u0000\u0082"+
		"\u0084\u0005)\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0001\u0000\u0000\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085_\u0001"+
		"\u0000\u0000\u0000\u0085c\u0001\u0000\u0000\u0000\u0085g\u0001\u0000\u0000"+
		"\u0000\u0085k\u0001\u0000\u0000\u0000\u0085o\u0001\u0000\u0000\u0000\u0085"+
		"s\u0001\u0000\u0000\u0000\u0085w\u0001\u0000\u0000\u0000\u0085{\u0001"+
		"\u0000\u0000\u0000\u0085|\u0001\u0000\u0000\u0000\u0085}\u0001\u0000\u0000"+
		"\u0000\u0085~\u0001\u0000\u0000\u0000\u0085\u007f\u0001\u0000\u0000\u0000"+
		"\u0085\u0080\u0001\u0000\u0000\u0000\u0085\u0081\u0001\u0000\u0000\u0000"+
		"\u0086\u0003\u0001\u0000\u0000\u0000\u0087\u0088\u0005\t\u0000\u0000\u0088"+
		"\u0089\u00034\u001a\u0000\u0089\u0005\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0005\n\u0000\u0000\u008b\u008c\u0005-\u0000\u0000\u008c\u0091\u0003"+
		"4\u001a\u0000\u008d\u008e\u0007\u0000\u0000\u0000\u008e\u0090\u00034\u001a"+
		"\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000"+
		"\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000"+
		"\u0000\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0005.\u0000\u0000\u0095\u0099\u0005#\u0000\u0000\u0096"+
		"\u0098\u0003\u0002\u0001\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098"+
		"\u009b\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0001\u0000\u0000\u0000\u009a\u009c\u0001\u0000\u0000\u0000\u009b"+
		"\u0099\u0001\u0000\u0000\u0000\u009c\u009d\u0005$\u0000\u0000\u009d\u0007"+
		"\u0001\u0000\u0000\u0000\u009e\u00a3\u0003\u0006\u0003\u0000\u009f\u00a0"+
		"\u0005\u000b\u0000\u0000\u00a0\u00a2\u0003\u0006\u0003\u0000\u00a1\u009f"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00af"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0005\u000b\u0000\u0000\u00a7\u00ab\u0005#\u0000\u0000\u00a8\u00aa\u0003"+
		"\u0002\u0001\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001"+
		"\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ae\u00b0\u0005$\u0000\u0000\u00af\u00a6\u0001\u0000"+
		"\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\t\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u0005\u0010\u0000\u0000\u00b2\u00b6\u0005#\u0000\u0000"+
		"\u00b3\u00b5\u0003\u0002\u0001\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b9\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005$\u0000\u0000\u00ba"+
		"\u00bb\u0005\r\u0000\u0000\u00bb\u00bc\u0005-\u0000\u0000\u00bc\u00bd"+
		"\u00034\u001a\u0000\u00bd\u00be\u0005.\u0000\u0000\u00be\u0118\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0005\r\u0000\u0000\u00c0\u00c1\u0005-\u0000"+
		"\u0000\u00c1\u00c2\u00034\u001a\u0000\u00c2\u00cc\u0005.\u0000\u0000\u00c3"+
		"\u00c7\u0007\u0001\u0000\u0000\u00c4\u00c6\u0003\u0002\u0001\u0000\u00c5"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8"+
		"\u00ca\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cd\u0007\u0002\u0000\u0000\u00cb\u00cd\u0003\u0002\u0001\u0000\u00cc"+
		"\u00c3\u0001\u0000\u0000\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cd"+
		"\u0118\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\f\u0000\u0000\u00cf\u00d1"+
		"\u0005-\u0000\u0000\u00d0\u00d2\u0003\u0014\n\u0000\u00d1\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d5\u0005)\u0000\u0000\u00d4\u00d6\u00034\u001a"+
		"\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d9\u0005)\u0000\u0000"+
		"\u00d8\u00da\u00034\u001a\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00d9"+
		"\u00da\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db"+
		"\u00dc\u0005.\u0000\u0000\u00dc\u00e0\u0005#\u0000\u0000\u00dd\u00df\u0003"+
		"\u0002\u0001\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00df\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e3\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e3\u0118\u0005$\u0000\u0000\u00e4\u00e5\u0005\f"+
		"\u0000\u0000\u00e5\u00e6\u0005-\u0000\u0000\u00e6\u00e7\u0003\u0012\t"+
		"\u0000\u00e7\u00e9\u0005)\u0000\u0000\u00e8\u00ea\u00034\u001a\u0000\u00e9"+
		"\u00e8\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea"+
		"\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ed\u0005)\u0000\u0000\u00ec\u00ee"+
		"\u00034\u001a\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005"+
		".\u0000\u0000\u00f0\u00f4\u0005#\u0000\u0000\u00f1\u00f3\u0003\u0002\u0001"+
		"\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f7\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f8\u0005$\u0000\u0000\u00f8\u0118\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fa\u0005\f\u0000\u0000\u00fa\u00fb\u0005-\u0000\u0000\u00fb"+
		"\u00fc\u00034\u001a\u0000\u00fc\u00fd\u0005\u0011\u0000\u0000\u00fd\u00fe"+
		"\u00034\u001a\u0000\u00fe\u00ff\u0005.\u0000\u0000\u00ff\u0103\u0005#"+
		"\u0000\u0000\u0100\u0102\u0003\u0002\u0001\u0000\u0101\u0100\u0001\u0000"+
		"\u0000\u0000\u0102\u0105\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000"+
		"\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0106\u0001\u0000"+
		"\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0106\u0107\u0005$\u0000"+
		"\u0000\u0107\u0118\u0001\u0000\u0000\u0000\u0108\u0109\u0005\f\u0000\u0000"+
		"\u0109\u010a\u0005-\u0000\u0000\u010a\u010b\u0003\u0012\t\u0000\u010b"+
		"\u010c\u0005\u0011\u0000\u0000\u010c\u010d\u00034\u001a\u0000\u010d\u010e"+
		"\u0005.\u0000\u0000\u010e\u0112\u0005#\u0000\u0000\u010f\u0111\u0003\u0002"+
		"\u0001\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0111\u0114\u0001\u0000"+
		"\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000"+
		"\u0000\u0000\u0113\u0115\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000"+
		"\u0000\u0000\u0115\u0116\u0005$\u0000\u0000\u0116\u0118\u0001\u0000\u0000"+
		"\u0000\u0117\u00b1\u0001\u0000\u0000\u0000\u0117\u00bf\u0001\u0000\u0000"+
		"\u0000\u0117\u00ce\u0001\u0000\u0000\u0000\u0117\u00e4\u0001\u0000\u0000"+
		"\u0000\u0117\u00f9\u0001\u0000\u0000\u0000\u0117\u0108\u0001\u0000\u0000"+
		"\u0000\u0118\u000b\u0001\u0000\u0000\u0000\u0119\u011a\u0005\b\u0000\u0000"+
		"\u011a\u011b\u0005\u0019\u0000\u0000\u011b\u0124\u0005-\u0000\u0000\u011c"+
		"\u0121\u0005\u0019\u0000\u0000\u011d\u011e\u0005(\u0000\u0000\u011e\u0120"+
		"\u0005\u0019\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u0120\u0123"+
		"\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121\u0122"+
		"\u0001\u0000\u0000\u0000\u0122\u0125\u0001\u0000\u0000\u0000\u0123\u0121"+
		"\u0001\u0000\u0000\u0000\u0124\u011c\u0001\u0000\u0000\u0000\u0124\u0125"+
		"\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0127"+
		"\u0005.\u0000\u0000\u0127\u0128\u0003\u000e\u0007\u0000\u0128\r\u0001"+
		"\u0000\u0000\u0000\u0129\u012b\u0003(\u0014\u0000\u012a\u0129\u0001\u0000"+
		"\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000"+
		"\u0000\u0000\u012c\u0130\u0005#\u0000\u0000\u012d\u012f\u0003\u0002\u0001"+
		"\u0000\u012e\u012d\u0001\u0000\u0000\u0000\u012f\u0132\u0001\u0000\u0000"+
		"\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000"+
		"\u0000\u0131\u0133\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000"+
		"\u0000\u0133\u0149\u0005$\u0000\u0000\u0134\u013d\u0005-\u0000\u0000\u0135"+
		"\u013a\u0005\u0019\u0000\u0000\u0136\u0137\u0005(\u0000\u0000\u0137\u0139"+
		"\u0005\u0019\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0139\u013c"+
		"\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013a\u013b"+
		"\u0001\u0000\u0000\u0000\u013b\u013e\u0001\u0000\u0000\u0000\u013c\u013a"+
		"\u0001\u0000\u0000\u0000\u013d\u0135\u0001\u0000\u0000\u0000\u013d\u013e"+
		"\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0142"+
		"\u0005.\u0000\u0000\u0140\u0142\u0005\u0019\u0000\u0000\u0141\u0134\u0001"+
		"\u0000\u0000\u0000\u0141\u0140\u0001\u0000\u0000\u0000\u0142\u0144\u0001"+
		"\u0000\u0000\u0000\u0143\u0145\u0003(\u0014\u0000\u0144\u0143\u0001\u0000"+
		"\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000"+
		"\u0000\u0000\u0146\u0147\u0005\u000e\u0000\u0000\u0147\u0149\u00034\u001a"+
		"\u0000\u0148\u012a\u0001\u0000\u0000\u0000\u0148\u0141\u0001\u0000\u0000"+
		"\u0000\u0149\u000f\u0001\u0000\u0000\u0000\u014a\u014b\u0005\u0019\u0000"+
		"\u0000\u014b\u0154\u0005-\u0000\u0000\u014c\u0151\u00034\u001a\u0000\u014d"+
		"\u014e\u0005(\u0000\u0000\u014e\u0150\u00034\u001a\u0000\u014f\u014d\u0001"+
		"\u0000\u0000\u0000\u0150\u0153\u0001\u0000\u0000\u0000\u0151\u014f\u0001"+
		"\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000\u0152\u0155\u0001"+
		"\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0154\u014c\u0001"+
		"\u0000\u0000\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u0155\u0156\u0001"+
		"\u0000\u0000\u0000\u0156\u0157\u0005.\u0000\u0000\u0157\u0011\u0001\u0000"+
		"\u0000\u0000\u0158\u0159\u0007\u0003\u0000\u0000\u0159\u015a\u0003\u0014"+
		"\n\u0000\u015a\u0013\u0001\u0000\u0000\u0000\u015b\u015d\u0005\u0019\u0000"+
		"\u0000\u015c\u015e\u0003(\u0014\u0000\u015d\u015c\u0001\u0000\u0000\u0000"+
		"\u015d\u015e\u0001\u0000\u0000\u0000\u015e\u0161\u0001\u0000\u0000\u0000"+
		"\u015f\u0160\u0005\u001c\u0000\u0000\u0160\u0162\u00034\u001a\u0000\u0161"+
		"\u015f\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162"+
		"\u0015\u0001\u0000\u0000\u0000\u0163\u0166\u0005\u0003\u0000\u0000\u0164"+
		"\u0167\u0003\u0018\f\u0000\u0165\u0167\u0003\u001a\r\u0000\u0166\u0164"+
		"\u0001\u0000\u0000\u0000\u0166\u0165\u0001\u0000\u0000\u0000\u0167\u0168"+
		"\u0001\u0000\u0000\u0000\u0168\u0169\u0005\u000f\u0000\u0000\u0169\u016a"+
		"\u0005\u001b\u0000\u0000\u016a\u0017\u0001\u0000\u0000\u0000\u016b\u016c"+
		"\u0005\u0019\u0000\u0000\u016c\u0019\u0001\u0000\u0000\u0000\u016d\u016e"+
		"\u0007\u0001\u0000\u0000\u016e\u0173\u0003\u001c\u000e\u0000\u016f\u0170"+
		"\u0005(\u0000\u0000\u0170\u0172\u0003\u001c\u000e\u0000\u0171\u016f\u0001"+
		"\u0000\u0000\u0000\u0172\u0175\u0001\u0000\u0000\u0000\u0173\u0171\u0001"+
		"\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174\u0176\u0001"+
		"\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0176\u0177\u0007"+
		"\u0002\u0000\u0000\u0177\u001b\u0001\u0000\u0000\u0000\u0178\u017b\u0005"+
		"\u0019\u0000\u0000\u0179\u017a\u0005\u0016\u0000\u0000\u017a\u017c\u0005"+
		"\u0019\u0000\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017b\u017c\u0001"+
		"\u0000\u0000\u0000\u017c\u001d\u0001\u0000\u0000\u0000\u017d\u0181\u0005"+
		"\u0012\u0000\u0000\u017e\u0182\u0003 \u0010\u0000\u017f\u0182\u00034\u001a"+
		"\u0000\u0180\u0182\u0003\u000e\u0007\u0000\u0181\u017e\u0001\u0000\u0000"+
		"\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0181\u0180\u0001\u0000\u0000"+
		"\u0000\u0182\u001f\u0001\u0000\u0000\u0000\u0183\u0184\u0005\u0004\u0000"+
		"\u0000\u0184\u0185\u0005\u0019\u0000\u0000\u0185\u0186\u0003\"\u0011\u0000"+
		"\u0186!\u0001\u0000\u0000\u0000\u0187\u018b\u0005#\u0000\u0000\u0188\u018a"+
		"\u0003$\u0012\u0000\u0189\u0188\u0001\u0000\u0000\u0000\u018a\u018d\u0001"+
		"\u0000\u0000\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018b\u018c\u0001"+
		"\u0000\u0000\u0000\u018c\u018e\u0001\u0000\u0000\u0000\u018d\u018b\u0001"+
		"\u0000\u0000\u0000\u018e\u018f\u0005$\u0000\u0000\u018f#\u0001\u0000\u0000"+
		"\u0000\u0190\u0193\u0003\u0012\t\u0000\u0191\u0193\u0003\f\u0006\u0000"+
		"\u0192\u0190\u0001\u0000\u0000\u0000\u0192\u0191\u0001\u0000\u0000\u0000"+
		"\u0193%\u0001\u0000\u0000\u0000\u0194\u0195\u0005\u0014\u0000\u0000\u0195"+
		"\u0196\u0005-\u0000\u0000\u0196\u019b\u0005#\u0000\u0000\u0197\u0198\u0005"+
		"\u0013\u0000\u0000\u0198\u0199\u0005\'\u0000\u0000\u0199\u019a\u0005\u001b"+
		"\u0000\u0000\u019a\u019c\u0005(\u0000\u0000\u019b\u0197\u0001\u0000\u0000"+
		"\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c\u019d\u0001\u0000\u0000"+
		"\u0000\u019d\u019e\u0005\u0015\u0000\u0000\u019e\u019f\u0005\'\u0000\u0000"+
		"\u019f\u01a6\u00034\u001a\u0000\u01a0\u01a1\u0005(\u0000\u0000\u01a1\u01a2"+
		"\u0005\u0019\u0000\u0000\u01a2\u01a3\u0005\'\u0000\u0000\u01a3\u01a5\u0003"+
		"4\u001a\u0000\u01a4\u01a0\u0001\u0000\u0000\u0000\u01a5\u01a8\u0001\u0000"+
		"\u0000\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000"+
		"\u0000\u0000\u01a7\u01a9\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001\u0000"+
		"\u0000\u0000\u01a9\u01aa\u0005$\u0000\u0000\u01aa\u01ab\u0005.\u0000\u0000"+
		"\u01ab\'\u0001\u0000\u0000\u0000\u01ac\u01ad\u0005\'\u0000\u0000\u01ad"+
		"\u01b0\u0005\u0019\u0000\u0000\u01ae\u01af\u0005%\u0000\u0000\u01af\u01b1"+
		"\u0005&\u0000\u0000\u01b0\u01ae\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001"+
		"\u0000\u0000\u0000\u01b1)\u0001\u0000\u0000\u0000\u01b2\u01b3\u0005\u0017"+
		"\u0000\u0000\u01b3\u01b4\u0005\u0019\u0000\u0000\u01b4\u01b5\u0005\u001c"+
		"\u0000\u0000\u01b5\u01b6\u0003,\u0016\u0000\u01b6+\u0001\u0000\u0000\u0000"+
		"\u01b7\u01ba\u0005\u0019\u0000\u0000\u01b8\u01b9\u0005%\u0000\u0000\u01b9"+
		"\u01bb\u0005&\u0000\u0000\u01ba\u01b8\u0001\u0000\u0000\u0000\u01ba\u01bb"+
		"\u0001\u0000\u0000\u0000\u01bb\u01be\u0001\u0000\u0000\u0000\u01bc\u01be"+
		"\u0003.\u0017\u0000\u01bd\u01b7\u0001\u0000\u0000\u0000\u01bd\u01bc\u0001"+
		"\u0000\u0000\u0000\u01be-\u0001\u0000\u0000\u0000\u01bf\u01c0\u0005#\u0000"+
		"\u0000\u01c0\u01c4\u00030\u0018\u0000\u01c1\u01c3\u00030\u0018\u0000\u01c2"+
		"\u01c1\u0001\u0000\u0000\u0000\u01c3\u01c6\u0001\u0000\u0000\u0000\u01c4"+
		"\u01c2\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001\u0000\u0000\u0000\u01c5"+
		"\u01c7\u0001\u0000\u0000\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c7"+
		"\u01c8\u0005$\u0000\u0000\u01c8/\u0001\u0000\u0000\u0000\u01c9\u01ca\u0005"+
		"\u0019\u0000\u0000\u01ca\u01cb\u0005\'\u0000\u0000\u01cb\u01cc\u0003,"+
		"\u0016\u0000\u01cc1\u0001\u0000\u0000\u0000\u01cd\u01ce\u0005\u0016\u0000"+
		"\u0000\u01ce\u01d1\u0005\u0019\u0000\u0000\u01cf\u01d0\u0005%\u0000\u0000"+
		"\u01d0\u01d2\u0005&\u0000\u0000\u01d1\u01cf\u0001\u0000\u0000\u0000\u01d1"+
		"\u01d2\u0001\u0000\u0000\u0000\u01d23\u0001\u0000\u0000\u0000\u01d3\u01d4"+
		"\u0006\u001a\uffff\uffff\u0000\u01d4\u01d6\u00036\u001b\u0000\u01d5\u01d7"+
		"\u0007\u0004\u0000\u0000\u01d6\u01d5\u0001\u0000\u0000\u0000\u01d6\u01d7"+
		"\u0001\u0000\u0000\u0000\u01d7\u01d9\u0001\u0000\u0000\u0000\u01d8\u01da"+
		"\u00032\u0019\u0000\u01d9\u01d8\u0001\u0000\u0000\u0000\u01d9\u01da\u0001"+
		"\u0000\u0000\u0000\u01da\u01e6\u0001\u0000\u0000\u0000\u01db\u01e0\u0005"+
		"\u0019\u0000\u0000\u01dc\u01dd\u0005(\u0000\u0000\u01dd\u01df\u0005\u0019"+
		"\u0000\u0000\u01de\u01dc\u0001\u0000\u0000\u0000\u01df\u01e2\u0001\u0000"+
		"\u0000\u0000\u01e0\u01de\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001\u0000"+
		"\u0000\u0000\u01e1\u01e3\u0001\u0000\u0000\u0000\u01e2\u01e0\u0001\u0000"+
		"\u0000\u0000\u01e3\u01e4\u0005\u000e\u0000\u0000\u01e4\u01e6\u00034\u001a"+
		"\u0001\u01e5\u01d3\u0001\u0000\u0000\u0000\u01e5\u01db\u0001\u0000\u0000"+
		"\u0000\u01e6\u01fc\u0001\u0000\u0000\u0000\u01e7\u01e8\n\u0005\u0000\u0000"+
		"\u01e8\u01e9\u00038\u001c\u0000\u01e9\u01ea\u00034\u001a\u0006\u01ea\u01fb"+
		"\u0001\u0000\u0000\u0000\u01eb\u01ec\n\u0003\u0000\u0000\u01ec\u01ed\u0005"+
		"*\u0000\u0000\u01ed\u01fb\u00034\u001a\u0004\u01ee\u01ef\n\u0002\u0000"+
		"\u0000\u01ef\u01f0\u0005-\u0000\u0000\u01f0\u01f5\u00034\u001a\u0000\u01f1"+
		"\u01f2\u0005(\u0000\u0000\u01f2\u01f4\u00034\u001a\u0000\u01f3\u01f1\u0001"+
		"\u0000\u0000\u0000\u01f4\u01f7\u0001\u0000\u0000\u0000\u01f5\u01f3\u0001"+
		"\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000\u0000\u0000\u01f6\u01f8\u0001"+
		"\u0000\u0000\u0000\u01f7\u01f5\u0001\u0000\u0000\u0000\u01f8\u01f9\u0005"+
		".\u0000\u0000\u01f9\u01fb\u0001\u0000\u0000\u0000\u01fa\u01e7\u0001\u0000"+
		"\u0000\u0000\u01fa\u01eb\u0001\u0000\u0000\u0000\u01fa\u01ee\u0001\u0000"+
		"\u0000\u0000\u01fb\u01fe\u0001\u0000\u0000\u0000\u01fc\u01fa\u0001\u0000"+
		"\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd5\u0001\u0000\u0000"+
		"\u0000\u01fe\u01fc\u0001\u0000\u0000\u0000\u01ff\u0218\u0005\u001a\u0000"+
		"\u0000\u0200\u0218\u0005\u001b\u0000\u0000\u0201\u0218\u0003\u0010\b\u0000"+
		"\u0202\u0218\u0005\u0019\u0000\u0000\u0203\u0204\u0005-\u0000\u0000\u0204"+
		"\u0205\u00034\u001a\u0000\u0205\u0206\u0005.\u0000\u0000\u0206\u0218\u0001"+
		"\u0000\u0000\u0000\u0207\u0218\u0003@ \u0000\u0208\u0218\u0003D\"\u0000"+
		"\u0209\u0218\u0003F#\u0000\u020a\u0218\u0003\u000e\u0007\u0000\u020b\u0218"+
		"\u0003:\u001d\u0000\u020c\u0218\u0003<\u001e\u0000\u020d\u020e\u00055"+
		"\u0000\u0000\u020e\u0218\u00034\u001a\u0000\u020f\u0213\u0007\u0005\u0000"+
		"\u0000\u0210\u0212\u0003X,\u0000\u0211\u0210\u0001\u0000\u0000\u0000\u0212"+
		"\u0215\u0001\u0000\u0000\u0000\u0213\u0211\u0001\u0000\u0000\u0000\u0213"+
		"\u0214\u0001\u0000\u0000\u0000\u0214\u0216\u0001\u0000\u0000\u0000\u0215"+
		"\u0213\u0001\u0000\u0000\u0000\u0216\u0218\u0007\u0005\u0000\u0000\u0217"+
		"\u01ff\u0001\u0000\u0000\u0000\u0217\u0200\u0001\u0000\u0000\u0000\u0217"+
		"\u0201\u0001\u0000\u0000\u0000\u0217\u0202\u0001\u0000\u0000\u0000\u0217"+
		"\u0203\u0001\u0000\u0000\u0000\u0217\u0207\u0001\u0000\u0000\u0000\u0217"+
		"\u0208\u0001\u0000\u0000\u0000\u0217\u0209\u0001\u0000\u0000\u0000\u0217"+
		"\u020a\u0001\u0000\u0000\u0000\u0217\u020b\u0001\u0000\u0000\u0000\u0217"+
		"\u020c\u0001\u0000\u0000\u0000\u0217\u020d\u0001\u0000\u0000\u0000\u0217"+
		"\u020f\u0001\u0000\u0000\u0000\u02187\u0001\u0000\u0000\u0000\u0219\u022c"+
		"\u0005 \u0000\u0000\u021a\u022c\u0005\"\u0000\u0000\u021b\u022c\u0005"+
		"!\u0000\u0000\u021c\u022c\u00057\u0000\u0000\u021d\u022c\u00058\u0000"+
		"\u0000\u021e\u022c\u00056\u0000\u0000\u021f\u0221\u00050\u0000\u0000\u0220"+
		"\u0222\u0007\u0006\u0000\u0000\u0221\u0220\u0001\u0000\u0000\u0000\u0221"+
		"\u0222\u0001\u0000\u0000\u0000\u0222\u022c\u0001\u0000\u0000\u0000\u0223"+
		"\u0225\u0007\u0007\u0000\u0000\u0224\u0226\u0007\u0006\u0000\u0000\u0225"+
		"\u0224\u0001\u0000\u0000\u0000\u0225\u0226\u0001\u0000\u0000\u0000\u0226"+
		"\u022c\u0001\u0000\u0000\u0000\u0227\u022c\u0005\u001d\u0000\u0000\u0228"+
		"\u022c\u0005\u001e\u0000\u0000\u0229\u022c\u0005\u001f\u0000\u0000\u022a"+
		"\u022c\u00051\u0000\u0000\u022b\u0219\u0001\u0000\u0000\u0000\u022b\u021a"+
		"\u0001\u0000\u0000\u0000\u022b\u021b\u0001\u0000\u0000\u0000\u022b\u021c"+
		"\u0001\u0000\u0000\u0000\u022b\u021d\u0001\u0000\u0000\u0000\u022b\u021e"+
		"\u0001\u0000\u0000\u0000\u022b\u021f\u0001\u0000\u0000\u0000\u022b\u0223"+
		"\u0001\u0000\u0000\u0000\u022b\u0227\u0001\u0000\u0000\u0000\u022b\u0228"+
		"\u0001\u0000\u0000\u0000\u022b\u0229\u0001\u0000\u0000\u0000\u022b\u022a"+
		"\u0001\u0000\u0000\u0000\u022c9\u0001\u0000\u0000\u0000\u022d\u022e\u0005"+
		"\u0019\u0000\u0000\u022e\u0232\u00052\u0000\u0000\u022f\u0230\u00052\u0000"+
		"\u0000\u0230\u0232\u0005\u0019\u0000\u0000\u0231\u022d\u0001\u0000\u0000"+
		"\u0000\u0231\u022f\u0001\u0000\u0000\u0000\u0232;\u0001\u0000\u0000\u0000"+
		"\u0233\u0234\u0005\u0019\u0000\u0000\u0234\u0238\u00053\u0000\u0000\u0235"+
		"\u0236\u00053\u0000\u0000\u0236\u0238\u0005\u0019\u0000\u0000\u0237\u0233"+
		"\u0001\u0000\u0000\u0000\u0237\u0235\u0001\u0000\u0000\u0000\u0238=\u0001"+
		"\u0000\u0000\u0000\u0239\u023a\u0005\"\u0000\u0000\u023a\u024a\u00034"+
		"\u001a\u0000\u023b\u023c\u0005 \u0000\u0000\u023c\u024a\u00034\u001a\u0000"+
		"\u023d\u023e\u0005!\u0000\u0000\u023e\u024a\u00034\u001a\u0000\u023f\u0241"+
		"\u00050\u0000\u0000\u0240\u0242\u0007\u0006\u0000\u0000\u0241\u0240\u0001"+
		"\u0000\u0000\u0000\u0241\u0242\u0001\u0000\u0000\u0000\u0242\u0243\u0001"+
		"\u0000\u0000\u0000\u0243\u024a\u00034\u001a\u0000\u0244\u0246\u0007\u0007"+
		"\u0000\u0000\u0245\u0247\u0007\u0006\u0000\u0000\u0246\u0245\u0001\u0000"+
		"\u0000\u0000\u0246\u0247\u0001\u0000\u0000\u0000\u0247\u0248\u0001\u0000"+
		"\u0000\u0000\u0248\u024a\u00034\u001a\u0000\u0249\u0239\u0001\u0000\u0000"+
		"\u0000\u0249\u023b\u0001\u0000\u0000\u0000\u0249\u023d\u0001\u0000\u0000"+
		"\u0000\u0249\u023f\u0001\u0000\u0000\u0000\u0249\u0244\u0001\u0000\u0000"+
		"\u0000\u024a?\u0001\u0000\u0000\u0000\u024b\u024c\u0005#\u0000\u0000\u024c"+
		"\u0251\u0003B!\u0000\u024d\u024e\u0005(\u0000\u0000\u024e\u0250\u0003"+
		"B!\u0000\u024f\u024d\u0001\u0000\u0000\u0000\u0250\u0253\u0001\u0000\u0000"+
		"\u0000\u0251\u0252\u0001\u0000\u0000\u0000\u0251\u024f\u0001\u0000\u0000"+
		"\u0000\u0252\u0254\u0001\u0000\u0000\u0000\u0253\u0251\u0001\u0000\u0000"+
		"\u0000\u0254\u0255\u0005$\u0000\u0000\u0255A\u0001\u0000\u0000\u0000\u0256"+
		"\u0257\u0005\u0019\u0000\u0000\u0257\u0258\u0005\'\u0000\u0000\u0258\u0259"+
		"\u00034\u001a\u0000\u0259C\u0001\u0000\u0000\u0000\u025a\u0263\u0005%"+
		"\u0000\u0000\u025b\u0260\u00034\u001a\u0000\u025c\u025d\u0005(\u0000\u0000"+
		"\u025d\u025f\u00034\u001a\u0000\u025e\u025c\u0001\u0000\u0000\u0000\u025f"+
		"\u0262\u0001\u0000\u0000\u0000\u0260\u025e\u0001\u0000\u0000\u0000\u0260"+
		"\u0261\u0001\u0000\u0000\u0000\u0261\u0264\u0001\u0000\u0000\u0000\u0262"+
		"\u0260\u0001\u0000\u0000\u0000\u0263\u025b\u0001\u0000\u0000\u0000\u0263"+
		"\u0264\u0001\u0000\u0000\u0000\u0264\u0265\u0001\u0000\u0000\u0000\u0265"+
		"\u0266\u0005&\u0000\u0000\u0266E\u0001\u0000\u0000\u0000\u0267\u0268\u0005"+
		"\u0019\u0000\u0000\u0268\u0269\u0005%\u0000\u0000\u0269\u026a\u00034\u001a"+
		"\u0000\u026a\u026b\u0005&\u0000\u0000\u026bG\u0001\u0000\u0000\u0000\u026c"+
		"\u026d\u0007\b\u0000\u0000\u026dI\u0001\u0000\u0000\u0000\u026e\u026f"+
		"\u0007\u0007\u0000\u0000\u026f\u0273\u0003H$\u0000\u0270\u0272\u0003L"+
		"&\u0000\u0271\u0270\u0001\u0000\u0000\u0000\u0272\u0275\u0001\u0000\u0000"+
		"\u0000\u0273\u0271\u0001\u0000\u0000\u0000\u0273\u0274\u0001\u0000\u0000"+
		"\u0000\u0274\u0276\u0001\u0000\u0000\u0000\u0275\u0273\u0001\u0000\u0000"+
		"\u0000\u0276\u0277\u00050\u0000\u0000\u0277K\u0001\u0000\u0000\u0000\u0278"+
		"\u027a\u0003N\'\u0000\u0279\u0278\u0001\u0000\u0000\u0000\u027a\u027b"+
		"\u0001\u0000\u0000\u0000\u027b\u0279\u0001\u0000\u0000\u0000\u027b\u027c"+
		"\u0001\u0000\u0000\u0000\u027cM\u0001\u0000\u0000\u0000\u027d\u027e\u0005"+
		"\u0001\u0000\u0000\u027e\u027f\u0005\u001c\u0000\u0000\u027f\u0280\u0005"+
		"9\u0000\u0000\u0280\u0281\u0005\u0006\u0000\u0000\u0281\u0282\u0005\u0019"+
		"\u0000\u0000\u0282\u0283\u0005\u0018\u0000\u0000\u0283\u0284\u0005\u0019"+
		"\u0000\u0000\u0284\u028f\u00059\u0000\u0000\u0285\u0286\u0005\u0002\u0000"+
		"\u0000\u0286\u0287\u0005\u001c\u0000\u0000\u0287\u0288\u00059\u0000\u0000"+
		"\u0288\u0289\u00034\u001a\u0000\u0289\u028a\u00059\u0000\u0000\u028a\u028f"+
		"\u0001\u0000\u0000\u0000\u028b\u028c\u0005\u0019\u0000\u0000\u028c\u028d"+
		"\u0005\u001c\u0000\u0000\u028d\u028f\u0003P(\u0000\u028e\u027d\u0001\u0000"+
		"\u0000\u0000\u028e\u0285\u0001\u0000\u0000\u0000\u028e\u028b\u0001\u0000"+
		"\u0000\u0000\u028fO\u0001\u0000\u0000\u0000\u0290\u0293\u0005\u001b\u0000"+
		"\u0000\u0291\u0293\u0003R)\u0000\u0292\u0290\u0001\u0000\u0000\u0000\u0292"+
		"\u0291\u0001\u0000\u0000\u0000\u0293Q\u0001\u0000\u0000\u0000\u0294\u0298"+
		"\u0005;\u0000\u0000\u0295\u0296\u0005#\u0000\u0000\u0296\u0298\u0005#"+
		"\u0000\u0000\u0297\u0294\u0001\u0000\u0000\u0000\u0297\u0295\u0001\u0000"+
		"\u0000\u0000\u0298\u0299\u0001\u0000\u0000\u0000\u0299\u029d\u00034\u001a"+
		"\u0000\u029a\u029e\u0005<\u0000\u0000\u029b\u029c\u0005$\u0000\u0000\u029c"+
		"\u029e\u0005$\u0000\u0000\u029d\u029a\u0001\u0000\u0000\u0000\u029d\u029b"+
		"\u0001\u0000\u0000\u0000\u029e\u02b1\u0001\u0000\u0000\u0000\u029f\u02a3"+
		"\u0005;\u0000\u0000\u02a0\u02a1\u0005#\u0000\u0000\u02a1\u02a3\u0005#"+
		"\u0000\u0000\u02a2\u029f\u0001\u0000\u0000\u0000\u02a2\u02a0\u0001\u0000"+
		"\u0000\u0000\u02a3\u02a4\u0001\u0000\u0000\u0000\u02a4\u02a8\u0005;\u0000"+
		"\u0000\u02a5\u02a7\u0003X,\u0000\u02a6\u02a5\u0001\u0000\u0000\u0000\u02a7"+
		"\u02aa\u0001\u0000\u0000\u0000\u02a8\u02a6\u0001\u0000\u0000\u0000\u02a8"+
		"\u02a9\u0001\u0000\u0000\u0000\u02a9\u02ae\u0001\u0000\u0000\u0000\u02aa"+
		"\u02a8\u0001\u0000\u0000\u0000\u02ab\u02af\u0005<\u0000\u0000\u02ac\u02ad"+
		"\u0005$\u0000\u0000\u02ad\u02af\u0005$\u0000\u0000\u02ae\u02ab\u0001\u0000"+
		"\u0000\u0000\u02ae\u02ac\u0001\u0000\u0000\u0000\u02af\u02b1\u0001\u0000"+
		"\u0000\u0000\u02b0\u0297\u0001\u0000\u0000\u0000\u02b0\u02a2\u0001\u0000"+
		"\u0000\u0000\u02b1S\u0001\u0000\u0000\u0000\u02b2\u02b3\u0007\u0007\u0000"+
		"\u0000\u02b3\u02b4\u00051\u0000\u0000\u02b4\u02b5\u0003H$\u0000\u02b5"+
		"\u02b6\u00050\u0000\u0000\u02b6U\u0001\u0000\u0000\u0000\u02b7\u02b8\u0007"+
		"\u0007\u0000\u0000\u02b8\u02b9\u0003H$\u0000\u02b9\u02ba\u00051\u0000"+
		"\u0000\u02ba\u02bb\u00050\u0000\u0000\u02bbW\u0001\u0000\u0000\u0000\u02bc"+
		"\u02c0\u0003J%\u0000\u02bd\u02bf\u0003X,\u0000\u02be\u02bd\u0001\u0000"+
		"\u0000\u0000\u02bf\u02c2\u0001\u0000\u0000\u0000\u02c0\u02be\u0001\u0000"+
		"\u0000\u0000\u02c0\u02c1\u0001\u0000\u0000\u0000\u02c1\u02c3\u0001\u0000"+
		"\u0000\u0000\u02c2\u02c0\u0001\u0000\u0000\u0000\u02c3\u02c4\u0003T*\u0000"+
		"\u02c4\u02d4\u0001\u0000\u0000\u0000\u02c5\u02d4\u0003V+\u0000\u02c6\u02ca"+
		"\u0005;\u0000\u0000\u02c7\u02c9\u0003\u0002\u0001\u0000\u02c8\u02c7\u0001"+
		"\u0000\u0000\u0000\u02c9\u02cc\u0001\u0000\u0000\u0000\u02ca\u02c8\u0001"+
		"\u0000\u0000\u0000\u02ca\u02cb\u0001\u0000\u0000\u0000\u02cb\u02d0\u0001"+
		"\u0000\u0000\u0000\u02cc\u02ca\u0001\u0000\u0000\u0000\u02cd\u02d1\u0005"+
		"<\u0000\u0000\u02ce\u02cf\u0005$\u0000\u0000\u02cf\u02d1\u0005$\u0000"+
		"\u0000\u02d0\u02cd\u0001\u0000\u0000\u0000\u02d0\u02ce\u0001\u0000\u0000"+
		"\u0000\u02d1\u02d4\u0001\u0000\u0000\u0000\u02d2\u02d4\u0005>\u0000\u0000"+
		"\u02d3\u02bc\u0001\u0000\u0000\u0000\u02d3\u02c5\u0001\u0000\u0000\u0000"+
		"\u02d3\u02c6\u0001\u0000\u0000\u0000\u02d3\u02d2\u0001\u0000\u0000\u0000"+
		"\u02d4Y\u0001\u0000\u0000\u0000X]aeimquy\u0083\u0085\u0091\u0099\u00a3"+
		"\u00ab\u00af\u00b6\u00c7\u00cc\u00d1\u00d5\u00d9\u00e0\u00e9\u00ed\u00f4"+
		"\u0103\u0112\u0117\u0121\u0124\u012a\u0130\u013a\u013d\u0141\u0144\u0148"+
		"\u0151\u0154\u015d\u0161\u0166\u0173\u017b\u0181\u018b\u0192\u019b\u01a6"+
		"\u01b0\u01ba\u01bd\u01c4\u01d1\u01d6\u01d9\u01e0\u01e5\u01f5\u01fa\u01fc"+
		"\u0213\u0217\u0221\u0225\u022b\u0231\u0237\u0241\u0246\u0249\u0251\u0260"+
		"\u0263\u0273\u027b\u028e\u0292\u0297\u029d\u02a2\u02a8\u02ae\u02b0\u02c0"+
		"\u02ca\u02d0\u02d3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}