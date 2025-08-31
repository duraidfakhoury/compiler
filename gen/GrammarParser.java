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
		NG_FOR=1, NG_IF=2, CLICK_EVENT=3, IMPORT=4, CLASS=5, CONST=6, LET=7, VAR=8, 
		FUNCTION=9, RETURN=10, IF=11, ELSE=12, FOR=13, WHILE=14, ARROW=15, FROM=16, 
		DO=17, IN=18, EXPORT=19, SELECTOR=20, COMPONENT=21, TEMPLATE=22, AS=23, 
		TYPE=24, OF=25, TRUE=26, FALSE=27, ID=28, NUMBER=29, STRING=30, ASSIGN=31, 
		PLUS=32, MINUS=33, MULT=34, DOUBLE_ASSIGN=35, NOT_EQUAL=36, DOUBLE_ASSIGN_ID=37, 
		LBRACE=38, RBRACE=39, LBRACKET=40, RBRACKET=41, COLON=42, COMMA=43, SEMICOLON=44, 
		DOT=45, WHITESPACE=46, COMMENT=47, LPAREN=48, RPAREN=49, LTAG=50, RTAG=51, 
		SLASH=52, PLUSPLUS=53, MINUSMINUS=54, QMARK=55, EMARK=56, DOUBLE_QMARK=57, 
		OR=58, AND=59, BACKTICK=60, LTAG_HTML=61, LBRACE_HTML=62, RBRACE_HTML=63, 
		BACKTICK_HTML=64, TEXT_HTML=65, WS=66, DIV=67, P=68, H1=69, H2=70, H3=71, 
		H4=72, H5=73, H6=74, BUTTON=75, SPAN=76, A=77, IMG=78, INPUT=79, FORM=80;
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
			null, "'*ngFor'", "'*ngIf'", "'[click]'", "'import'", "'class'", "'const'", 
			"'let'", "'var'", "'function'", "'return'", "'if'", "'else'", "'for'", 
			"'while'", "'=>'", "'from'", "'do'", "'in'", "'export'", "'selector'", 
			"'@component'", "'template'", "'as'", "'type'", "'of'", "'true'", "'false'", 
			null, null, null, "'='", "'+'", "'-'", "'*'", "'=='", "'!=='", "'==='", 
			"'{'", "'}'", "'['", "']'", "':'", "','", "';'", "'.'", null, null, "'('", 
			"')'", null, "'>'", "'/'", "'++'", "'--'", "'?'", "'!'", "'??'", "'||'", 
			"'&&'", null, null, "'{{'", "'}}'", null, null, null, "'div'", "'p'", 
			"'h1'", "'h2'", "'h3'", "'h4'", "'h5'", "'h6'", "'button'", "'span'", 
			"'a'", "'img'", "'input'", "'form'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NG_FOR", "NG_IF", "CLICK_EVENT", "IMPORT", "CLASS", "CONST", "LET", 
			"VAR", "FUNCTION", "RETURN", "IF", "ELSE", "FOR", "WHILE", "ARROW", "FROM", 
			"DO", "IN", "EXPORT", "SELECTOR", "COMPONENT", "TEMPLATE", "AS", "TYPE", 
			"OF", "TRUE", "FALSE", "ID", "NUMBER", "STRING", "ASSIGN", "PLUS", "MINUS", 
			"MULT", "DOUBLE_ASSIGN", "NOT_EQUAL", "DOUBLE_ASSIGN_ID", "LBRACE", "RBRACE", 
			"LBRACKET", "RBRACKET", "COLON", "COMMA", "SEMICOLON", "DOT", "WHITESPACE", 
			"COMMENT", "LPAREN", "RPAREN", "LTAG", "RTAG", "SLASH", "PLUSPLUS", "MINUSMINUS", 
			"QMARK", "EMARK", "DOUBLE_QMARK", "OR", "AND", "BACKTICK", "LTAG_HTML", 
			"LBRACE_HTML", "RBRACE_HTML", "BACKTICK_HTML", "TEXT_HTML", "WS", "DIV", 
			"P", "H1", "H2", "H3", "H4", "H5", "H6", "BUTTON", "SPAN", "A", "IMG", 
			"INPUT", "FORM"
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
			} while ( ((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & 3969448443412391679L) != 0) );
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
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(96);
					match(SEMICOLON);
					}
					break;
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
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(100);
					match(SEMICOLON);
					}
					break;
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
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(104);
					match(SEMICOLON);
					}
					break;
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
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(108);
					match(SEMICOLON);
					}
					break;
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
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(112);
					match(SEMICOLON);
					}
					break;
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
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(116);
					match(SEMICOLON);
					}
					break;
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
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(120);
					match(SEMICOLON);
					}
					break;
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
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(130);
					match(SEMICOLON);
					}
					break;
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 240518168576L) != 0)) {
				{
				{
				setState(141);
				((IfBodyRuleContext)_localctx)._tset214 = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 240518168576L) != 0)) ) {
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
			while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & 3969448443412391679L) != 0)) {
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
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(166);
				match(ELSE);
				setState(167);
				((IfStatementRuleContext)_localctx).elseBlock = match(LBRACE);
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & 3969448443412391679L) != 0)) {
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
				while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & 3969448443412391679L) != 0)) {
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
					while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & 3969448443412391679L) != 0)) {
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
				if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & 293538451487L) != 0)) {
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
				if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & 293538451487L) != 0)) {
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
				while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & 3969448443412391679L) != 0)) {
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
				if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & 293538451487L) != 0)) {
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
				if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & 293538451487L) != 0)) {
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
				while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & 3969448443412391679L) != 0)) {
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
				while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & 3969448443412391679L) != 0)) {
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
				while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & 3969448443412391679L) != 0)) {
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
		public StatementContext statement;
		public List<StatementContext> stmts = new ArrayList<StatementContext>();
		public TerminalNode ARROW() { return getToken(GrammarParser.ARROW, 0); }
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public TypeDefineContext typeDefine() {
			return getRuleContext(TypeDefineContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
			int _alt;
			setState(336);
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
				while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & 3969448443412391679L) != 0)) {
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
				setState(334);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(327);
					((FunctionArrowContext)_localctx).expr = value(0);
					}
					break;
				case 2:
					{
					setState(331);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(328);
							((FunctionArrowContext)_localctx).statement = statement();
							((FunctionArrowContext)_localctx).stmts.add(((FunctionArrowContext)_localctx).statement);
							}
							} 
						}
						setState(333);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
			setState(338);
			((FunctionCallRuleContext)_localctx).funcName = match(ID);
			setState(339);
			match(LPAREN);
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & 293538451487L) != 0)) {
				{
				setState(340);
				((FunctionCallRuleContext)_localctx).value = value(0);
				((FunctionCallRuleContext)_localctx).args.add(((FunctionCallRuleContext)_localctx).value);
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(341);
					match(COMMA);
					setState(342);
					((FunctionCallRuleContext)_localctx).value = value(0);
					((FunctionCallRuleContext)_localctx).args.add(((FunctionCallRuleContext)_localctx).value);
					}
					}
					setState(347);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(350);
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
			setState(352);
			((VarDeclarationRuleContext)_localctx).kind = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 448L) != 0)) ) {
				((VarDeclarationRuleContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(353);
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
		try {
			_localctx = new VarAssignRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			((VarAssignRuleContext)_localctx).varName = match(ID);
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(356);
				((VarAssignRuleContext)_localctx).type = typeDefine();
				}
				break;
			}
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(359);
				match(ASSIGN);
				setState(360);
				((VarAssignRuleContext)_localctx).expr = value(0);
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
			setState(363);
			match(IMPORT);
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(364);
				((ImportRuleContext)_localctx).def = defaultImport();
				}
				break;
			case LBRACE:
			case LBRACE_HTML:
				{
				setState(365);
				((ImportRuleContext)_localctx).named = namedImports();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(368);
			match(FROM);
			setState(369);
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
			setState(371);
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
			setState(373);
			_la = _input.LA(1);
			if ( !(_la==LBRACE || _la==LBRACE_HTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(374);
			((NamedImportsRuleContext)_localctx).importSpecifier = importSpecifier();
			((NamedImportsRuleContext)_localctx).imports.add(((NamedImportsRuleContext)_localctx).importSpecifier);
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(375);
				match(COMMA);
				setState(376);
				((NamedImportsRuleContext)_localctx).importSpecifier = importSpecifier();
				((NamedImportsRuleContext)_localctx).imports.add(((NamedImportsRuleContext)_localctx).importSpecifier);
				}
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(382);
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
			setState(384);
			((ImportSpecifierRuleContext)_localctx).name = match(ID);
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(385);
				match(AS);
				setState(386);
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
			setState(389);
			match(EXPORT);
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(390);
				((ExportRuleContext)_localctx).cls = classDeclaration();
				}
				break;
			case 2:
				{
				setState(391);
				((ExportRuleContext)_localctx).val = value(0);
				}
				break;
			case 3:
				{
				setState(392);
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
			setState(395);
			match(CLASS);
			setState(396);
			((ClassDeclarationRuleContext)_localctx).name = match(ID);
			setState(397);
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
			setState(399);
			match(LBRACE);
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 960L) != 0)) {
				{
				{
				setState(400);
				((ClassBodyRuleContext)_localctx).classBodyStatement = classBodyStatement();
				((ClassBodyRuleContext)_localctx).stmts.add(((ClassBodyRuleContext)_localctx).classBodyStatement);
				}
				}
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(406);
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
			setState(410);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
			case LET:
			case VAR:
				_localctx = new ClassVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				((ClassVarDeclContext)_localctx).var = variableDeclaration();
				}
				break;
			case FUNCTION:
				_localctx = new ClassFuncDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
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
			setState(412);
			match(COMPONENT);
			setState(413);
			match(LPAREN);
			setState(414);
			match(LBRACE);
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SELECTOR) {
				{
				setState(415);
				match(SELECTOR);
				setState(416);
				match(COLON);
				setState(417);
				((ComponentRuleContext)_localctx).selector = match(STRING);
				setState(418);
				match(COMMA);
				}
			}

			setState(421);
			match(TEMPLATE);
			setState(422);
			match(COLON);
			setState(423);
			((ComponentRuleContext)_localctx).template = value(0);
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(424);
				match(COMMA);
				setState(425);
				((ComponentRuleContext)_localctx).ID = match(ID);
				((ComponentRuleContext)_localctx).keys.add(((ComponentRuleContext)_localctx).ID);
				setState(426);
				match(COLON);
				setState(427);
				((ComponentRuleContext)_localctx).value = value(0);
				((ComponentRuleContext)_localctx).vals.add(((ComponentRuleContext)_localctx).value);
				}
				}
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(433);
			match(RBRACE);
			setState(434);
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
			setState(436);
			match(COLON);
			setState(437);
			((TypeDefineRuleContext)_localctx).type = match(ID);
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(438);
				match(LBRACKET);
				setState(439);
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
			setState(442);
			match(TYPE);
			setState(443);
			((TypeDeclarationRuleContext)_localctx).name = match(ID);
			setState(444);
			match(ASSIGN);
			setState(445);
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
			setState(453);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new TypeSimpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				((TypeSimpleContext)_localctx).type = match(ID);
				setState(450);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(448);
					match(LBRACKET);
					setState(449);
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
				setState(452);
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
			setState(455);
			match(LBRACE);
			setState(456);
			((TypeObjectRuleContext)_localctx).typeMember = typeMember();
			((TypeObjectRuleContext)_localctx).typeMembers.add(((TypeObjectRuleContext)_localctx).typeMember);
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(457);
				((TypeObjectRuleContext)_localctx).typeMember = typeMember();
				((TypeObjectRuleContext)_localctx).typeMembers.add(((TypeObjectRuleContext)_localctx).typeMember);
				}
				}
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(463);
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
			setState(465);
			((TypeMemberRuleContext)_localctx).name = match(ID);
			setState(466);
			match(COLON);
			setState(467);
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
			setState(469);
			match(AS);
			setState(470);
			((AsTypeRuleContext)_localctx).type = match(ID);
			setState(473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(471);
				match(LBRACKET);
				setState(472);
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
		public StatementContext statement;
		public List<StatementContext> stmts = new ArrayList<StatementContext>();
		public Token param;
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public TerminalNode ARROW() { return getToken(GrammarParser.ARROW, 0); }
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public TerminalNode LBRACE() { return getToken(GrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(GrammarParser.RBRACE, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				_localctx = new PrimaryValueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(476);
				((PrimaryValueExprContext)_localctx).pv = primaryValue();
				setState(478);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(477);
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
				setState(481);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(480);
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
				setState(483);
				match(LPAREN);
				setState(484);
				((ArrowFunctionValueContext)_localctx).ID = match(ID);
				((ArrowFunctionValueContext)_localctx).params.add(((ArrowFunctionValueContext)_localctx).ID);
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(485);
					match(COMMA);
					setState(486);
					((ArrowFunctionValueContext)_localctx).ID = match(ID);
					((ArrowFunctionValueContext)_localctx).params.add(((ArrowFunctionValueContext)_localctx).ID);
					}
					}
					setState(491);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(492);
				match(RPAREN);
				setState(493);
				match(ARROW);
				setState(503);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(494);
					match(LBRACE);
					setState(498);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & 3969448443412391679L) != 0)) {
						{
						{
						setState(495);
						((ArrowFunctionValueContext)_localctx).statement = statement();
						((ArrowFunctionValueContext)_localctx).stmts.add(((ArrowFunctionValueContext)_localctx).statement);
						}
						}
						setState(500);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(501);
					match(RBRACE);
					}
					break;
				case 2:
					{
					setState(502);
					value(0);
					}
					break;
				}
				}
				break;
			case 3:
				{
				_localctx = new ArrowFunctionValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(505);
				((ArrowFunctionValueContext)_localctx).param = match(ID);
				setState(506);
				match(ARROW);
				setState(516);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(507);
					match(LBRACE);
					setState(511);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & 3969448443412391679L) != 0)) {
						{
						{
						setState(508);
						((ArrowFunctionValueContext)_localctx).statement = statement();
						((ArrowFunctionValueContext)_localctx).stmts.add(((ArrowFunctionValueContext)_localctx).statement);
						}
						}
						setState(513);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(514);
					match(RBRACE);
					}
					break;
				case 2:
					{
					setState(515);
					value(0);
					}
					break;
				}
				}
				break;
			case 4:
				{
				_localctx = new ArrowFunctionValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(518);
				match(LPAREN);
				setState(519);
				match(RPAREN);
				setState(520);
				match(ARROW);
				setState(530);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(521);
					match(LBRACE);
					setState(525);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & 3969448443412391679L) != 0)) {
						{
						{
						setState(522);
						((ArrowFunctionValueContext)_localctx).statement = statement();
						((ArrowFunctionValueContext)_localctx).stmts.add(((ArrowFunctionValueContext)_localctx).statement);
						}
						}
						setState(527);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(528);
					match(RBRACE);
					}
					break;
				case 2:
					{
					setState(529);
					value(0);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(555);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(553);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryValueContext(new ValueContext(_parentctx, _parentState));
						((BinaryValueContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(534);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(535);
						((BinaryValueContext)_localctx).op = binaryOp();
						setState(536);
						((BinaryValueContext)_localctx).right = value(8);
						}
						break;
					case 2:
						{
						_localctx = new PropertyAccessValueContext(new ValueContext(_parentctx, _parentState));
						((PropertyAccessValueContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(538);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(539);
						match(DOT);
						setState(540);
						((PropertyAccessValueContext)_localctx).right = value(6);
						}
						break;
					case 3:
						{
						_localctx = new MethodCallValueContext(new ValueContext(_parentctx, _parentState));
						((MethodCallValueContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(541);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(542);
						match(LPAREN);
						setState(543);
						((MethodCallValueContext)_localctx).value = value(0);
						((MethodCallValueContext)_localctx).args.add(((MethodCallValueContext)_localctx).value);
						setState(548);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(544);
							match(COMMA);
							setState(545);
							((MethodCallValueContext)_localctx).value = value(0);
							((MethodCallValueContext)_localctx).args.add(((MethodCallValueContext)_localctx).value);
							}
							}
							setState(550);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(551);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(557);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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
	public static class TrueValueContext extends PrimaryValueContext {
		public TerminalNode TRUE() { return getToken(GrammarParser.TRUE, 0); }
		public TrueValueContext(PrimaryValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterTrueValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitTrueValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitTrueValue(this);
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
	public static class FalseValueContext extends PrimaryValueContext {
		public TerminalNode FALSE() { return getToken(GrammarParser.FALSE, 0); }
		public FalseValueContext(PrimaryValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterFalseValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitFalseValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitFalseValue(this);
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
			setState(584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				_localctx = new NumberValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(558);
				((NumberValueContext)_localctx).num = match(NUMBER);
				}
				break;
			case 2:
				_localctx = new StringValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(559);
				((StringValueContext)_localctx).str = match(STRING);
				}
				break;
			case 3:
				_localctx = new CallValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(560);
				((CallValueContext)_localctx).call = functionCall();
				}
				break;
			case 4:
				_localctx = new TrueValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(561);
				match(TRUE);
				}
				break;
			case 5:
				_localctx = new FalseValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(562);
				match(FALSE);
				}
				break;
			case 6:
				_localctx = new IdValueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(563);
				((IdValueContext)_localctx).id = match(ID);
				}
				break;
			case 7:
				_localctx = new ParenValueContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(564);
				match(LPAREN);
				setState(565);
				((ParenValueContext)_localctx).inner = value(0);
				setState(566);
				match(RPAREN);
				}
				break;
			case 8:
				_localctx = new ObjectValueContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(568);
				((ObjectValueContext)_localctx).obj = object();
				}
				break;
			case 9:
				_localctx = new ArrayValueContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(569);
				((ArrayValueContext)_localctx).arr = array();
				}
				break;
			case 10:
				_localctx = new ArrayAccessValueContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(570);
				((ArrayAccessValueContext)_localctx).access = arrayAccess();
				}
				break;
			case 11:
				_localctx = new FunctionValueContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(571);
				((FunctionValueContext)_localctx).body = functionBody();
				}
				break;
			case 12:
				_localctx = new IncValueContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(572);
				((IncValueContext)_localctx).inc = increase_variable();
				}
				break;
			case 13:
				_localctx = new DecValueContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(573);
				((DecValueContext)_localctx).dec = decrease_variable();
				}
				break;
			case 14:
				_localctx = new NegationValueContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(574);
				match(EMARK);
				setState(575);
				((NegationValueContext)_localctx).right = value(0);
				}
				break;
			case 15:
				_localctx = new TemplateValueContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(576);
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
				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & 38913L) != 0)) {
					{
					{
					setState(577);
					((TemplateValueContext)_localctx).html = html();
					((TemplateValueContext)_localctx).content.add(((TemplateValueContext)_localctx).html);
					}
					}
					setState(582);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(583);
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
			setState(604);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
				match(DOUBLE_ASSIGN);
				}
				break;
			case DOUBLE_ASSIGN_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(587);
				match(DOUBLE_ASSIGN_ID);
				}
				break;
			case NOT_EQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(588);
				match(NOT_EQUAL);
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 4);
				{
				setState(589);
				match(OR);
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 5);
				{
				setState(590);
				match(AND);
				}
				break;
			case DOUBLE_QMARK:
				enterOuterAlt(_localctx, 6);
				{
				setState(591);
				match(DOUBLE_QMARK);
				}
				break;
			case RTAG:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(592);
				match(RTAG);
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN || _la==DOUBLE_ASSIGN) {
					{
					setState(593);
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
				setState(596);
				_la = _input.LA(1);
				if ( !(_la==LTAG || _la==LTAG_HTML) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(598);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN || _la==DOUBLE_ASSIGN) {
					{
					setState(597);
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
				setState(600);
				match(PLUS);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 10);
				{
				setState(601);
				match(MINUS);
				}
				break;
			case MULT:
				enterOuterAlt(_localctx, 11);
				{
				setState(602);
				match(MULT);
				}
				break;
			case SLASH:
				enterOuterAlt(_localctx, 12);
				{
				setState(603);
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
			setState(610);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(606);
				((Increase_variableContext)_localctx).id = match(ID);
				setState(607);
				match(PLUSPLUS);
				}
				break;
			case PLUSPLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(608);
				match(PLUSPLUS);
				setState(609);
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
			setState(616);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(612);
				((Decrease_variableContext)_localctx).id = match(ID);
				setState(613);
				match(MINUSMINUS);
				}
				break;
			case MINUSMINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(614);
				match(MINUSMINUS);
				setState(615);
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
			setState(634);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_ASSIGN_ID:
				_localctx = new IdEqComparisonContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(618);
				match(DOUBLE_ASSIGN_ID);
				setState(619);
				((IdEqComparisonContext)_localctx).right = value(0);
				}
				break;
			case DOUBLE_ASSIGN:
				_localctx = new EqComparisonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(620);
				match(DOUBLE_ASSIGN);
				setState(621);
				((EqComparisonContext)_localctx).right = value(0);
				}
				break;
			case NOT_EQUAL:
				_localctx = new NeqComparisonContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(622);
				match(NOT_EQUAL);
				setState(623);
				((NeqComparisonContext)_localctx).right = value(0);
				}
				break;
			case RTAG:
				_localctx = new RtagComparisonContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(624);
				match(RTAG);
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN || _la==DOUBLE_ASSIGN) {
					{
					setState(625);
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

				setState(628);
				((RtagComparisonContext)_localctx).right = value(0);
				}
				break;
			case LTAG:
			case LTAG_HTML:
				_localctx = new LtagComparisonContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(629);
				_la = _input.LA(1);
				if ( !(_la==LTAG || _la==LTAG_HTML) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN || _la==DOUBLE_ASSIGN) {
					{
					setState(630);
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

				setState(633);
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
			setState(636);
			match(LBRACE);
			setState(637);
			((ObjectRuleContext)_localctx).pair = pair();
			((ObjectRuleContext)_localctx).pairs.add(((ObjectRuleContext)_localctx).pair);
			setState(642);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(638);
					match(COMMA);
					setState(639);
					((ObjectRuleContext)_localctx).pair = pair();
					((ObjectRuleContext)_localctx).pairs.add(((ObjectRuleContext)_localctx).pair);
					}
					} 
				}
				setState(644);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			setState(645);
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
			setState(647);
			((PairRuleContext)_localctx).key = match(ID);
			setState(648);
			match(COLON);
			setState(649);
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
			setState(651);
			match(LBRACKET);
			setState(660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & 293538451487L) != 0)) {
				{
				setState(652);
				((ArrayRuleContext)_localctx).value = value(0);
				((ArrayRuleContext)_localctx).elems.add(((ArrayRuleContext)_localctx).value);
				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(653);
					match(COMMA);
					setState(654);
					((ArrayRuleContext)_localctx).value = value(0);
					((ArrayRuleContext)_localctx).elems.add(((ArrayRuleContext)_localctx).value);
					}
					}
					setState(659);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(662);
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
			setState(664);
			((ArrayAccessRuleContext)_localctx).arr = match(ID);
			setState(665);
			match(LBRACKET);
			setState(666);
			((ArrayAccessRuleContext)_localctx).idx = value(0);
			setState(667);
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
			setState(669);
			_la = _input.LA(1);
			if ( !(((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & 9006649498927105L) != 0)) ) {
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
			setState(671);
			_la = _input.LA(1);
			if ( !(_la==LTAG || _la==LTAG_HTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(672);
			((OpenTagRuleContext)_localctx).name = htmlElementName();
			setState(676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 268435470L) != 0)) {
				{
				{
				setState(673);
				attributes();
				}
				}
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(679);
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
			setState(682); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(681);
					attribute();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(684); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
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
	public static class ClickEventAttributeRuleContext extends AttributeContext {
		public AttributeValueContext val;
		public TerminalNode CLICK_EVENT() { return getToken(GrammarParser.CLICK_EVENT, 0); }
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public AttributeValueContext attributeValue() {
			return getRuleContext(AttributeValueContext.class,0);
		}
		public ClickEventAttributeRuleContext(AttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterClickEventAttributeRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitClickEventAttributeRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitClickEventAttributeRule(this);
			else return visitor.visitChildren(this);
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
			setState(706);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NG_FOR:
				_localctx = new NgForAttributeRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(686);
				match(NG_FOR);
				setState(687);
				match(ASSIGN);
				setState(688);
				match(BACKTICK);
				setState(689);
				match(LET);
				setState(690);
				((NgForAttributeRuleContext)_localctx).varName = match(ID);
				setState(691);
				match(OF);
				setState(692);
				((NgForAttributeRuleContext)_localctx).collection = match(ID);
				setState(693);
				match(BACKTICK);
				}
				break;
			case NG_IF:
				_localctx = new NgIfAttributeRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(694);
				match(NG_IF);
				setState(695);
				match(ASSIGN);
				setState(696);
				match(BACKTICK);
				setState(697);
				((NgIfAttributeRuleContext)_localctx).condition = value(0);
				setState(698);
				match(BACKTICK);
				}
				break;
			case CLICK_EVENT:
				_localctx = new ClickEventAttributeRuleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(700);
				match(CLICK_EVENT);
				setState(701);
				match(ASSIGN);
				setState(702);
				((ClickEventAttributeRuleContext)_localctx).val = attributeValue();
				}
				break;
			case ID:
				_localctx = new RegularAttributeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(703);
				((RegularAttributeContext)_localctx).name = match(ID);
				setState(704);
				match(ASSIGN);
				setState(705);
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
			setState(711);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(708);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(709);
				interpolation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(710);
				value(0);
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
			setState(741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				_localctx = new SimpleInterpolationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(716);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACE_HTML:
					{
					setState(713);
					match(LBRACE_HTML);
					}
					break;
				case LBRACE:
					{
					{
					setState(714);
					match(LBRACE);
					setState(715);
					match(LBRACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(718);
				((SimpleInterpolationContext)_localctx).expr = value(0);
				setState(722);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RBRACE_HTML:
					{
					setState(719);
					match(RBRACE_HTML);
					}
					break;
				case RBRACE:
					{
					{
					setState(720);
					match(RBRACE);
					setState(721);
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
				setState(727);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACE_HTML:
					{
					setState(724);
					match(LBRACE_HTML);
					}
					break;
				case LBRACE:
					{
					{
					setState(725);
					match(LBRACE);
					setState(726);
					match(LBRACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(729);
				match(LBRACE_HTML);
				setState(733);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & 38913L) != 0)) {
					{
					{
					setState(730);
					((NestedTemplateInterpolationContext)_localctx).html = html();
					((NestedTemplateInterpolationContext)_localctx).nested.add(((NestedTemplateInterpolationContext)_localctx).html);
					}
					}
					setState(735);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(739);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RBRACE_HTML:
					{
					setState(736);
					match(RBRACE_HTML);
					}
					break;
				case RBRACE:
					{
					{
					setState(737);
					match(RBRACE);
					setState(738);
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
			setState(743);
			_la = _input.LA(1);
			if ( !(_la==LTAG || _la==LTAG_HTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(744);
			match(SLASH);
			setState(745);
			((CloseTagRuleContext)_localctx).name = htmlElementName();
			setState(746);
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
			setState(748);
			_la = _input.LA(1);
			if ( !(_la==LTAG || _la==LTAG_HTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(749);
			((SingleTagRuleContext)_localctx).name = htmlElementName();
			setState(750);
			match(SLASH);
			setState(751);
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
			setState(776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				_localctx = new HtmlElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(753);
				((HtmlElementContext)_localctx).open = open_tag();
				setState(757);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(754);
						((HtmlElementContext)_localctx).html = html();
						((HtmlElementContext)_localctx).inner.add(((HtmlElementContext)_localctx).html);
						}
						} 
					}
					setState(759);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				}
				setState(760);
				((HtmlElementContext)_localctx).close = close_tag();
				}
				break;
			case 2:
				_localctx = new HtmlSingleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(762);
				((HtmlSingleContext)_localctx).single = single_tag();
				}
				break;
			case 3:
				_localctx = new HtmlBlockContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(763);
				((HtmlBlockContext)_localctx).block = match(LBRACE_HTML);
				setState(767);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & 3969448443412391679L) != 0)) {
					{
					{
					setState(764);
					((HtmlBlockContext)_localctx).statement = statement();
					((HtmlBlockContext)_localctx).stmts.add(((HtmlBlockContext)_localctx).statement);
					}
					}
					setState(769);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(773);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RBRACE_HTML:
					{
					setState(770);
					match(RBRACE_HTML);
					}
					break;
				case RBRACE:
					{
					{
					setState(771);
					match(RBRACE);
					setState(772);
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
				setState(775);
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
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001P\u030b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0007\u0001\u0007\u0003\u0007\u0145\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u014a\b\u0007\n\u0007\f\u0007\u014d\t\u0007\u0003\u0007"+
		"\u014f\b\u0007\u0003\u0007\u0151\b\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\b\u0158\b\b\n\b\f\b\u015b\t\b\u0003\b\u015d\b\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0003\n\u0166\b\n\u0001"+
		"\n\u0001\n\u0003\n\u016a\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u016f\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u017a\b\r\n\r\f\r\u017d\t\r"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0184"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u018a"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u0192\b\u0011\n\u0011\f\u0011\u0195\t\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u019b\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u01a4\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u01ad\b\u0013\n\u0013"+
		"\f\u0013\u01b0\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01b9\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u01c3\b\u0016\u0001\u0016\u0003\u0016\u01c6\b"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u01cb\b\u0017\n"+
		"\u0017\f\u0017\u01ce\t\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u01da\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u01df\b\u001a\u0001\u001a\u0003\u001a\u01e2\b\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u01e8\b\u001a\n\u001a"+
		"\f\u001a\u01eb\t\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0005\u001a\u01f1\b\u001a\n\u001a\f\u001a\u01f4\t\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u01f8\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0005\u001a\u01fe\b\u001a\n\u001a\f\u001a\u0201\t\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u0205\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0005\u001a\u020c\b\u001a\n\u001a\f\u001a\u020f"+
		"\t\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0213\b\u001a\u0003\u001a"+
		"\u0215\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0005\u001a\u0223\b\u001a\n\u001a\f\u001a\u0226\t\u001a\u0001"+
		"\u001a\u0001\u001a\u0005\u001a\u022a\b\u001a\n\u001a\f\u001a\u022d\t\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0005\u001b\u0243\b\u001b\n\u001b\f\u001b\u0246"+
		"\t\u001b\u0001\u001b\u0003\u001b\u0249\b\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u0253\b\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0257\b"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u025d"+
		"\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0263"+
		"\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0269"+
		"\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0273\b\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u0278\b\u001f\u0001\u001f\u0003\u001f\u027b"+
		"\b\u001f\u0001 \u0001 \u0001 \u0001 \u0005 \u0281\b \n \f \u0284\t \u0001"+
		" \u0001 \u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0005"+
		"\"\u0290\b\"\n\"\f\"\u0293\t\"\u0003\"\u0295\b\"\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001%\u0005"+
		"%\u02a3\b%\n%\f%\u02a6\t%\u0001%\u0001%\u0001&\u0004&\u02ab\b&\u000b&"+
		"\f&\u02ac\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0003\'\u02c3\b\'\u0001(\u0001(\u0001(\u0003"+
		"(\u02c8\b(\u0001)\u0001)\u0001)\u0003)\u02cd\b)\u0001)\u0001)\u0001)\u0001"+
		")\u0003)\u02d3\b)\u0001)\u0001)\u0001)\u0003)\u02d8\b)\u0001)\u0001)\u0005"+
		")\u02dc\b)\n)\f)\u02df\t)\u0001)\u0001)\u0001)\u0003)\u02e4\b)\u0003)"+
		"\u02e6\b)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001,\u0001,\u0005,\u02f4\b,\n,\f,\u02f7\t,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0005,\u02fe\b,\n,\f,\u0301\t,\u0001,\u0001,\u0001,\u0003"+
		",\u0306\b,\u0001,\u0003,\u0309\b,\u0001,\u0001\u0282\u00014-\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVX\u0000\t\u0001\u0000#%\u0002\u0000&&>>\u0002"+
		"\u0000\'\'??\u0001\u0000\u0006\b\u0001\u000078\u0002\u0000<<@@\u0002\u0000"+
		"\u001f\u001f##\u0002\u000022==\u0002\u0000\u001c\u001cCP\u0370\u0000["+
		"\u0001\u0000\u0000\u0000\u0002\u0085\u0001\u0000\u0000\u0000\u0004\u0087"+
		"\u0001\u0000\u0000\u0000\u0006\u008a\u0001\u0000\u0000\u0000\b\u009e\u0001"+
		"\u0000\u0000\u0000\n\u0117\u0001\u0000\u0000\u0000\f\u0119\u0001\u0000"+
		"\u0000\u0000\u000e\u0150\u0001\u0000\u0000\u0000\u0010\u0152\u0001\u0000"+
		"\u0000\u0000\u0012\u0160\u0001\u0000\u0000\u0000\u0014\u0163\u0001\u0000"+
		"\u0000\u0000\u0016\u016b\u0001\u0000\u0000\u0000\u0018\u0173\u0001\u0000"+
		"\u0000\u0000\u001a\u0175\u0001\u0000\u0000\u0000\u001c\u0180\u0001\u0000"+
		"\u0000\u0000\u001e\u0185\u0001\u0000\u0000\u0000 \u018b\u0001\u0000\u0000"+
		"\u0000\"\u018f\u0001\u0000\u0000\u0000$\u019a\u0001\u0000\u0000\u0000"+
		"&\u019c\u0001\u0000\u0000\u0000(\u01b4\u0001\u0000\u0000\u0000*\u01ba"+
		"\u0001\u0000\u0000\u0000,\u01c5\u0001\u0000\u0000\u0000.\u01c7\u0001\u0000"+
		"\u0000\u00000\u01d1\u0001\u0000\u0000\u00002\u01d5\u0001\u0000\u0000\u0000"+
		"4\u0214\u0001\u0000\u0000\u00006\u0248\u0001\u0000\u0000\u00008\u025c"+
		"\u0001\u0000\u0000\u0000:\u0262\u0001\u0000\u0000\u0000<\u0268\u0001\u0000"+
		"\u0000\u0000>\u027a\u0001\u0000\u0000\u0000@\u027c\u0001\u0000\u0000\u0000"+
		"B\u0287\u0001\u0000\u0000\u0000D\u028b\u0001\u0000\u0000\u0000F\u0298"+
		"\u0001\u0000\u0000\u0000H\u029d\u0001\u0000\u0000\u0000J\u029f\u0001\u0000"+
		"\u0000\u0000L\u02aa\u0001\u0000\u0000\u0000N\u02c2\u0001\u0000\u0000\u0000"+
		"P\u02c7\u0001\u0000\u0000\u0000R\u02e5\u0001\u0000\u0000\u0000T\u02e7"+
		"\u0001\u0000\u0000\u0000V\u02ec\u0001\u0000\u0000\u0000X\u0308\u0001\u0000"+
		"\u0000\u0000Z\\\u0003\u0002\u0001\u0000[Z\u0001\u0000\u0000\u0000\\]\u0001"+
		"\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000"+
		"^\u0001\u0001\u0000\u0000\u0000_a\u0003\f\u0006\u0000`b\u0005,\u0000\u0000"+
		"a`\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b\u0086\u0001\u0000"+
		"\u0000\u0000ce\u0003\u0010\b\u0000df\u0005,\u0000\u0000ed\u0001\u0000"+
		"\u0000\u0000ef\u0001\u0000\u0000\u0000f\u0086\u0001\u0000\u0000\u0000"+
		"gi\u0003\u0012\t\u0000hj\u0005,\u0000\u0000ih\u0001\u0000\u0000\u0000"+
		"ij\u0001\u0000\u0000\u0000j\u0086\u0001\u0000\u0000\u0000km\u0003\u0014"+
		"\n\u0000ln\u0005,\u0000\u0000ml\u0001\u0000\u0000\u0000mn\u0001\u0000"+
		"\u0000\u0000n\u0086\u0001\u0000\u0000\u0000oq\u00034\u001a\u0000pr\u0005"+
		",\u0000\u0000qp\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000r\u0086"+
		"\u0001\u0000\u0000\u0000su\u0003X,\u0000tv\u0005,\u0000\u0000ut\u0001"+
		"\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000v\u0086\u0001\u0000\u0000"+
		"\u0000wy\u0003\u0004\u0002\u0000xz\u0005,\u0000\u0000yx\u0001\u0000\u0000"+
		"\u0000yz\u0001\u0000\u0000\u0000z\u0086\u0001\u0000\u0000\u0000{\u0086"+
		"\u0003\b\u0004\u0000|\u0086\u0003\u0016\u000b\u0000}\u0086\u0003\n\u0005"+
		"\u0000~\u0086\u0003&\u0013\u0000\u007f\u0086\u0003 \u0010\u0000\u0080"+
		"\u0086\u0003\u001e\u000f\u0000\u0081\u0083\u0003*\u0015\u0000\u0082\u0084"+
		"\u0005,\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0083\u0084\u0001"+
		"\u0000\u0000\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085_\u0001\u0000"+
		"\u0000\u0000\u0085c\u0001\u0000\u0000\u0000\u0085g\u0001\u0000\u0000\u0000"+
		"\u0085k\u0001\u0000\u0000\u0000\u0085o\u0001\u0000\u0000\u0000\u0085s"+
		"\u0001\u0000\u0000\u0000\u0085w\u0001\u0000\u0000\u0000\u0085{\u0001\u0000"+
		"\u0000\u0000\u0085|\u0001\u0000\u0000\u0000\u0085}\u0001\u0000\u0000\u0000"+
		"\u0085~\u0001\u0000\u0000\u0000\u0085\u007f\u0001\u0000\u0000\u0000\u0085"+
		"\u0080\u0001\u0000\u0000\u0000\u0085\u0081\u0001\u0000\u0000\u0000\u0086"+
		"\u0003\u0001\u0000\u0000\u0000\u0087\u0088\u0005\n\u0000\u0000\u0088\u0089"+
		"\u00034\u001a\u0000\u0089\u0005\u0001\u0000\u0000\u0000\u008a\u008b\u0005"+
		"\u000b\u0000\u0000\u008b\u008c\u00050\u0000\u0000\u008c\u0091\u00034\u001a"+
		"\u0000\u008d\u008e\u0007\u0000\u0000\u0000\u008e\u0090\u00034\u001a\u0000"+
		"\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000"+
		"\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000"+
		"\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u00051\u0000\u0000\u0095\u0099\u0005&\u0000\u0000\u0096\u0098"+
		"\u0003\u0002\u0001\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u009b"+
		"\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a"+
		"\u0001\u0000\u0000\u0000\u009a\u009c\u0001\u0000\u0000\u0000\u009b\u0099"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0005\'\u0000\u0000\u009d\u0007\u0001"+
		"\u0000\u0000\u0000\u009e\u00a3\u0003\u0006\u0003\u0000\u009f\u00a0\u0005"+
		"\f\u0000\u0000\u00a0\u00a2\u0003\u0006\u0003\u0000\u00a1\u009f\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00af\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\f\u0000"+
		"\u0000\u00a7\u00ab\u0005&\u0000\u0000\u00a8\u00aa\u0003\u0002\u0001\u0000"+
		"\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000"+
		"\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ae\u00b0\u0005\'\u0000\u0000\u00af\u00a6\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b0\t\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0005\u0011\u0000\u0000\u00b2\u00b6\u0005&\u0000\u0000\u00b3\u00b5\u0003"+
		"\u0002\u0001\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b8\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b9\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ba\u0005\'\u0000\u0000\u00ba\u00bb\u0005\u000e"+
		"\u0000\u0000\u00bb\u00bc\u00050\u0000\u0000\u00bc\u00bd\u00034\u001a\u0000"+
		"\u00bd\u00be\u00051\u0000\u0000\u00be\u0118\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c0\u0005\u000e\u0000\u0000\u00c0\u00c1\u00050\u0000\u0000\u00c1\u00c2"+
		"\u00034\u001a\u0000\u00c2\u00cc\u00051\u0000\u0000\u00c3\u00c7\u0007\u0001"+
		"\u0000\u0000\u00c4\u00c6\u0003\u0002\u0001\u0000\u00c5\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00ca\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00cd\u0007\u0002"+
		"\u0000\u0000\u00cb\u00cd\u0003\u0002\u0001\u0000\u00cc\u00c3\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cd\u0118\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cf\u0005\r\u0000\u0000\u00cf\u00d1\u00050\u0000"+
		"\u0000\u00d0\u00d2\u0003\u0014\n\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d5\u0005,\u0000\u0000\u00d4\u00d6\u00034\u001a\u0000\u00d5\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d9\u0005,\u0000\u0000\u00d8\u00da\u0003"+
		"4\u001a\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000"+
		"\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dc\u00051\u0000"+
		"\u0000\u00dc\u00e0\u0005&\u0000\u0000\u00dd\u00df\u0003\u0002\u0001\u0000"+
		"\u00de\u00dd\u0001\u0000\u0000\u0000\u00df\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e3\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e3\u0118\u0005\'\u0000\u0000\u00e4\u00e5\u0005\r\u0000\u0000\u00e5"+
		"\u00e6\u00050\u0000\u0000\u00e6\u00e7\u0003\u0012\t\u0000\u00e7\u00e9"+
		"\u0005,\u0000\u0000\u00e8\u00ea\u00034\u001a\u0000\u00e9\u00e8\u0001\u0000"+
		"\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ed\u0005,\u0000\u0000\u00ec\u00ee\u00034\u001a\u0000"+
		"\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f0\u00051\u0000\u0000\u00f0"+
		"\u00f4\u0005&\u0000\u0000\u00f1\u00f3\u0003\u0002\u0001\u0000\u00f2\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f6\u0001\u0000\u0000\u0000\u00f4\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f7\u00f8"+
		"\u0005\'\u0000\u0000\u00f8\u0118\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005"+
		"\r\u0000\u0000\u00fa\u00fb\u00050\u0000\u0000\u00fb\u00fc\u00034\u001a"+
		"\u0000\u00fc\u00fd\u0005\u0012\u0000\u0000\u00fd\u00fe\u00034\u001a\u0000"+
		"\u00fe\u00ff\u00051\u0000\u0000\u00ff\u0103\u0005&\u0000\u0000\u0100\u0102"+
		"\u0003\u0002\u0001\u0000\u0101\u0100\u0001\u0000\u0000\u0000\u0102\u0105"+
		"\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0104"+
		"\u0001\u0000\u0000\u0000\u0104\u0106\u0001\u0000\u0000\u0000\u0105\u0103"+
		"\u0001\u0000\u0000\u0000\u0106\u0107\u0005\'\u0000\u0000\u0107\u0118\u0001"+
		"\u0000\u0000\u0000\u0108\u0109\u0005\r\u0000\u0000\u0109\u010a\u00050"+
		"\u0000\u0000\u010a\u010b\u0003\u0012\t\u0000\u010b\u010c\u0005\u0012\u0000"+
		"\u0000\u010c\u010d\u00034\u001a\u0000\u010d\u010e\u00051\u0000\u0000\u010e"+
		"\u0112\u0005&\u0000\u0000\u010f\u0111\u0003\u0002\u0001\u0000\u0110\u010f"+
		"\u0001\u0000\u0000\u0000\u0111\u0114\u0001\u0000\u0000\u0000\u0112\u0110"+
		"\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0115"+
		"\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0115\u0116"+
		"\u0005\'\u0000\u0000\u0116\u0118\u0001\u0000\u0000\u0000\u0117\u00b1\u0001"+
		"\u0000\u0000\u0000\u0117\u00bf\u0001\u0000\u0000\u0000\u0117\u00ce\u0001"+
		"\u0000\u0000\u0000\u0117\u00e4\u0001\u0000\u0000\u0000\u0117\u00f9\u0001"+
		"\u0000\u0000\u0000\u0117\u0108\u0001\u0000\u0000\u0000\u0118\u000b\u0001"+
		"\u0000\u0000\u0000\u0119\u011a\u0005\t\u0000\u0000\u011a\u011b\u0005\u001c"+
		"\u0000\u0000\u011b\u0124\u00050\u0000\u0000\u011c\u0121\u0005\u001c\u0000"+
		"\u0000\u011d\u011e\u0005+\u0000\u0000\u011e\u0120\u0005\u001c\u0000\u0000"+
		"\u011f\u011d\u0001\u0000\u0000\u0000\u0120\u0123\u0001\u0000\u0000\u0000"+
		"\u0121\u011f\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000"+
		"\u0122\u0125\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000"+
		"\u0124\u011c\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000"+
		"\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0127\u00051\u0000\u0000\u0127"+
		"\u0128\u0003\u000e\u0007\u0000\u0128\r\u0001\u0000\u0000\u0000\u0129\u012b"+
		"\u0003(\u0014\u0000\u012a\u0129\u0001\u0000\u0000\u0000\u012a\u012b\u0001"+
		"\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u0130\u0005"+
		"&\u0000\u0000\u012d\u012f\u0003\u0002\u0001\u0000\u012e\u012d\u0001\u0000"+
		"\u0000\u0000\u012f\u0132\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000"+
		"\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0133\u0001\u0000"+
		"\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0133\u0151\u0005\'\u0000"+
		"\u0000\u0134\u013d\u00050\u0000\u0000\u0135\u013a\u0005\u001c\u0000\u0000"+
		"\u0136\u0137\u0005+\u0000\u0000\u0137\u0139\u0005\u001c\u0000\u0000\u0138"+
		"\u0136\u0001\u0000\u0000\u0000\u0139\u013c\u0001\u0000\u0000\u0000\u013a"+
		"\u0138\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b"+
		"\u013e\u0001\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013d"+
		"\u0135\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e"+
		"\u013f\u0001\u0000\u0000\u0000\u013f\u0142\u00051\u0000\u0000\u0140\u0142"+
		"\u0005\u001c\u0000\u0000\u0141\u0134\u0001\u0000\u0000\u0000\u0141\u0140"+
		"\u0001\u0000\u0000\u0000\u0142\u0144\u0001\u0000\u0000\u0000\u0143\u0145"+
		"\u0003(\u0014\u0000\u0144\u0143\u0001\u0000\u0000\u0000\u0144\u0145\u0001"+
		"\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u014e\u0005"+
		"\u000f\u0000\u0000\u0147\u014f\u00034\u001a\u0000\u0148\u014a\u0003\u0002"+
		"\u0001\u0000\u0149\u0148\u0001\u0000\u0000\u0000\u014a\u014d\u0001\u0000"+
		"\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000"+
		"\u0000\u0000\u014c\u014f\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000"+
		"\u0000\u0000\u014e\u0147\u0001\u0000\u0000\u0000\u014e\u014b\u0001\u0000"+
		"\u0000\u0000\u014f\u0151\u0001\u0000\u0000\u0000\u0150\u012a\u0001\u0000"+
		"\u0000\u0000\u0150\u0141\u0001\u0000\u0000\u0000\u0151\u000f\u0001\u0000"+
		"\u0000\u0000\u0152\u0153\u0005\u001c\u0000\u0000\u0153\u015c\u00050\u0000"+
		"\u0000\u0154\u0159\u00034\u001a\u0000\u0155\u0156\u0005+\u0000\u0000\u0156"+
		"\u0158\u00034\u001a\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0158\u015b"+
		"\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u0159\u015a"+
		"\u0001\u0000\u0000\u0000\u015a\u015d\u0001\u0000\u0000\u0000\u015b\u0159"+
		"\u0001\u0000\u0000\u0000\u015c\u0154\u0001\u0000\u0000\u0000\u015c\u015d"+
		"\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e\u015f"+
		"\u00051\u0000\u0000\u015f\u0011\u0001\u0000\u0000\u0000\u0160\u0161\u0007"+
		"\u0003\u0000\u0000\u0161\u0162\u0003\u0014\n\u0000\u0162\u0013\u0001\u0000"+
		"\u0000\u0000\u0163\u0165\u0005\u001c\u0000\u0000\u0164\u0166\u0003(\u0014"+
		"\u0000\u0165\u0164\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000"+
		"\u0000\u0166\u0169\u0001\u0000\u0000\u0000\u0167\u0168\u0005\u001f\u0000"+
		"\u0000\u0168\u016a\u00034\u001a\u0000\u0169\u0167\u0001\u0000\u0000\u0000"+
		"\u0169\u016a\u0001\u0000\u0000\u0000\u016a\u0015\u0001\u0000\u0000\u0000"+
		"\u016b\u016e\u0005\u0004\u0000\u0000\u016c\u016f\u0003\u0018\f\u0000\u016d"+
		"\u016f\u0003\u001a\r\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016e\u016d"+
		"\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170\u0171"+
		"\u0005\u0010\u0000\u0000\u0171\u0172\u0005\u001e\u0000\u0000\u0172\u0017"+
		"\u0001\u0000\u0000\u0000\u0173\u0174\u0005\u001c\u0000\u0000\u0174\u0019"+
		"\u0001\u0000\u0000\u0000\u0175\u0176\u0007\u0001\u0000\u0000\u0176\u017b"+
		"\u0003\u001c\u000e\u0000\u0177\u0178\u0005+\u0000\u0000\u0178\u017a\u0003"+
		"\u001c\u000e\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u017a\u017d\u0001"+
		"\u0000\u0000\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017b\u017c\u0001"+
		"\u0000\u0000\u0000\u017c\u017e\u0001\u0000\u0000\u0000\u017d\u017b\u0001"+
		"\u0000\u0000\u0000\u017e\u017f\u0007\u0002\u0000\u0000\u017f\u001b\u0001"+
		"\u0000\u0000\u0000\u0180\u0183\u0005\u001c\u0000\u0000\u0181\u0182\u0005"+
		"\u0017\u0000\u0000\u0182\u0184\u0005\u001c\u0000\u0000\u0183\u0181\u0001"+
		"\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184\u001d\u0001"+
		"\u0000\u0000\u0000\u0185\u0189\u0005\u0013\u0000\u0000\u0186\u018a\u0003"+
		" \u0010\u0000\u0187\u018a\u00034\u001a\u0000\u0188\u018a\u0003\u000e\u0007"+
		"\u0000\u0189\u0186\u0001\u0000\u0000\u0000\u0189\u0187\u0001\u0000\u0000"+
		"\u0000\u0189\u0188\u0001\u0000\u0000\u0000\u018a\u001f\u0001\u0000\u0000"+
		"\u0000\u018b\u018c\u0005\u0005\u0000\u0000\u018c\u018d\u0005\u001c\u0000"+
		"\u0000\u018d\u018e\u0003\"\u0011\u0000\u018e!\u0001\u0000\u0000\u0000"+
		"\u018f\u0193\u0005&\u0000\u0000\u0190\u0192\u0003$\u0012\u0000\u0191\u0190"+
		"\u0001\u0000\u0000\u0000\u0192\u0195\u0001\u0000\u0000\u0000\u0193\u0191"+
		"\u0001\u0000\u0000\u0000\u0193\u0194\u0001\u0000\u0000\u0000\u0194\u0196"+
		"\u0001\u0000\u0000\u0000\u0195\u0193\u0001\u0000\u0000\u0000\u0196\u0197"+
		"\u0005\'\u0000\u0000\u0197#\u0001\u0000\u0000\u0000\u0198\u019b\u0003"+
		"\u0012\t\u0000\u0199\u019b\u0003\f\u0006\u0000\u019a\u0198\u0001\u0000"+
		"\u0000\u0000\u019a\u0199\u0001\u0000\u0000\u0000\u019b%\u0001\u0000\u0000"+
		"\u0000\u019c\u019d\u0005\u0015\u0000\u0000\u019d\u019e\u00050\u0000\u0000"+
		"\u019e\u01a3\u0005&\u0000\u0000\u019f\u01a0\u0005\u0014\u0000\u0000\u01a0"+
		"\u01a1\u0005*\u0000\u0000\u01a1\u01a2\u0005\u001e\u0000\u0000\u01a2\u01a4"+
		"\u0005+\u0000\u0000\u01a3\u019f\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001"+
		"\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a6\u0005"+
		"\u0016\u0000\u0000\u01a6\u01a7\u0005*\u0000\u0000\u01a7\u01ae\u00034\u001a"+
		"\u0000\u01a8\u01a9\u0005+\u0000\u0000\u01a9\u01aa\u0005\u001c\u0000\u0000"+
		"\u01aa\u01ab\u0005*\u0000\u0000\u01ab\u01ad\u00034\u001a\u0000\u01ac\u01a8"+
		"\u0001\u0000\u0000\u0000\u01ad\u01b0\u0001\u0000\u0000\u0000\u01ae\u01ac"+
		"\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000\u01af\u01b1"+
		"\u0001\u0000\u0000\u0000\u01b0\u01ae\u0001\u0000\u0000\u0000\u01b1\u01b2"+
		"\u0005\'\u0000\u0000\u01b2\u01b3\u00051\u0000\u0000\u01b3\'\u0001\u0000"+
		"\u0000\u0000\u01b4\u01b5\u0005*\u0000\u0000\u01b5\u01b8\u0005\u001c\u0000"+
		"\u0000\u01b6\u01b7\u0005(\u0000\u0000\u01b7\u01b9\u0005)\u0000\u0000\u01b8"+
		"\u01b6\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9"+
		")\u0001\u0000\u0000\u0000\u01ba\u01bb\u0005\u0018\u0000\u0000\u01bb\u01bc"+
		"\u0005\u001c\u0000\u0000\u01bc\u01bd\u0005\u001f\u0000\u0000\u01bd\u01be"+
		"\u0003,\u0016\u0000\u01be+\u0001\u0000\u0000\u0000\u01bf\u01c2\u0005\u001c"+
		"\u0000\u0000\u01c0\u01c1\u0005(\u0000\u0000\u01c1\u01c3\u0005)\u0000\u0000"+
		"\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000\u0000\u0000"+
		"\u01c3\u01c6\u0001\u0000\u0000\u0000\u01c4\u01c6\u0003.\u0017\u0000\u01c5"+
		"\u01bf\u0001\u0000\u0000\u0000\u01c5\u01c4\u0001\u0000\u0000\u0000\u01c6"+
		"-\u0001\u0000\u0000\u0000\u01c7\u01c8\u0005&\u0000\u0000\u01c8\u01cc\u0003"+
		"0\u0018\u0000\u01c9\u01cb\u00030\u0018\u0000\u01ca\u01c9\u0001\u0000\u0000"+
		"\u0000\u01cb\u01ce\u0001\u0000\u0000\u0000\u01cc\u01ca\u0001\u0000\u0000"+
		"\u0000\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cd\u01cf\u0001\u0000\u0000"+
		"\u0000\u01ce\u01cc\u0001\u0000\u0000\u0000\u01cf\u01d0\u0005\'\u0000\u0000"+
		"\u01d0/\u0001\u0000\u0000\u0000\u01d1\u01d2\u0005\u001c\u0000\u0000\u01d2"+
		"\u01d3\u0005*\u0000\u0000\u01d3\u01d4\u0003,\u0016\u0000\u01d41\u0001"+
		"\u0000\u0000\u0000\u01d5\u01d6\u0005\u0017\u0000\u0000\u01d6\u01d9\u0005"+
		"\u001c\u0000\u0000\u01d7\u01d8\u0005(\u0000\u0000\u01d8\u01da\u0005)\u0000"+
		"\u0000\u01d9\u01d7\u0001\u0000\u0000\u0000\u01d9\u01da\u0001\u0000\u0000"+
		"\u0000\u01da3\u0001\u0000\u0000\u0000\u01db\u01dc\u0006\u001a\uffff\uffff"+
		"\u0000\u01dc\u01de\u00036\u001b\u0000\u01dd\u01df\u0007\u0004\u0000\u0000"+
		"\u01de\u01dd\u0001\u0000\u0000\u0000\u01de\u01df\u0001\u0000\u0000\u0000"+
		"\u01df\u01e1\u0001\u0000\u0000\u0000\u01e0\u01e2\u00032\u0019\u0000\u01e1"+
		"\u01e0\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2"+
		"\u0215\u0001\u0000\u0000\u0000\u01e3\u01e4\u00050\u0000\u0000\u01e4\u01e9"+
		"\u0005\u001c\u0000\u0000\u01e5\u01e6\u0005+\u0000\u0000\u01e6\u01e8\u0005"+
		"\u001c\u0000\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000\u01e8\u01eb\u0001"+
		"\u0000\u0000\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000\u01e9\u01ea\u0001"+
		"\u0000\u0000\u0000\u01ea\u01ec\u0001\u0000\u0000\u0000\u01eb\u01e9\u0001"+
		"\u0000\u0000\u0000\u01ec\u01ed\u00051\u0000\u0000\u01ed\u01f7\u0005\u000f"+
		"\u0000\u0000\u01ee\u01f2\u0005&\u0000\u0000\u01ef\u01f1\u0003\u0002\u0001"+
		"\u0000\u01f0\u01ef\u0001\u0000\u0000\u0000\u01f1\u01f4\u0001\u0000\u0000"+
		"\u0000\u01f2\u01f0\u0001\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000\u0000"+
		"\u0000\u01f3\u01f5\u0001\u0000\u0000\u0000\u01f4\u01f2\u0001\u0000\u0000"+
		"\u0000\u01f5\u01f8\u0005\'\u0000\u0000\u01f6\u01f8\u00034\u001a\u0000"+
		"\u01f7\u01ee\u0001\u0000\u0000\u0000\u01f7\u01f6\u0001\u0000\u0000\u0000"+
		"\u01f8\u0215\u0001\u0000\u0000\u0000\u01f9\u01fa\u0005\u001c\u0000\u0000"+
		"\u01fa\u0204\u0005\u000f\u0000\u0000\u01fb\u01ff\u0005&\u0000\u0000\u01fc"+
		"\u01fe\u0003\u0002\u0001\u0000\u01fd\u01fc\u0001\u0000\u0000\u0000\u01fe"+
		"\u0201\u0001\u0000\u0000\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000\u01ff"+
		"\u0200\u0001\u0000\u0000\u0000\u0200\u0202\u0001\u0000\u0000\u0000\u0201"+
		"\u01ff\u0001\u0000\u0000\u0000\u0202\u0205\u0005\'\u0000\u0000\u0203\u0205"+
		"\u00034\u001a\u0000\u0204\u01fb\u0001\u0000\u0000\u0000\u0204\u0203\u0001"+
		"\u0000\u0000\u0000\u0205\u0215\u0001\u0000\u0000\u0000\u0206\u0207\u0005"+
		"0\u0000\u0000\u0207\u0208\u00051\u0000\u0000\u0208\u0212\u0005\u000f\u0000"+
		"\u0000\u0209\u020d\u0005&\u0000\u0000\u020a\u020c\u0003\u0002\u0001\u0000"+
		"\u020b\u020a\u0001\u0000\u0000\u0000\u020c\u020f\u0001\u0000\u0000\u0000"+
		"\u020d\u020b\u0001\u0000\u0000\u0000\u020d\u020e\u0001\u0000\u0000\u0000"+
		"\u020e\u0210\u0001\u0000\u0000\u0000\u020f\u020d\u0001\u0000\u0000\u0000"+
		"\u0210\u0213\u0005\'\u0000\u0000\u0211\u0213\u00034\u001a\u0000\u0212"+
		"\u0209\u0001\u0000\u0000\u0000\u0212\u0211\u0001\u0000\u0000\u0000\u0213"+
		"\u0215\u0001\u0000\u0000\u0000\u0214\u01db\u0001\u0000\u0000\u0000\u0214"+
		"\u01e3\u0001\u0000\u0000\u0000\u0214\u01f9\u0001\u0000\u0000\u0000\u0214"+
		"\u0206\u0001\u0000\u0000\u0000\u0215\u022b\u0001\u0000\u0000\u0000\u0216"+
		"\u0217\n\u0007\u0000\u0000\u0217\u0218\u00038\u001c\u0000\u0218\u0219"+
		"\u00034\u001a\b\u0219\u022a\u0001\u0000\u0000\u0000\u021a\u021b\n\u0005"+
		"\u0000\u0000\u021b\u021c\u0005-\u0000\u0000\u021c\u022a\u00034\u001a\u0006"+
		"\u021d\u021e\n\u0004\u0000\u0000\u021e\u021f\u00050\u0000\u0000\u021f"+
		"\u0224\u00034\u001a\u0000\u0220\u0221\u0005+\u0000\u0000\u0221\u0223\u0003"+
		"4\u001a\u0000\u0222\u0220\u0001\u0000\u0000\u0000\u0223\u0226\u0001\u0000"+
		"\u0000\u0000\u0224\u0222\u0001\u0000\u0000\u0000\u0224\u0225\u0001\u0000"+
		"\u0000\u0000\u0225\u0227\u0001\u0000\u0000\u0000\u0226\u0224\u0001\u0000"+
		"\u0000\u0000\u0227\u0228\u00051\u0000\u0000\u0228\u022a\u0001\u0000\u0000"+
		"\u0000\u0229\u0216\u0001\u0000\u0000\u0000\u0229\u021a\u0001\u0000\u0000"+
		"\u0000\u0229\u021d\u0001\u0000\u0000\u0000\u022a\u022d\u0001\u0000\u0000"+
		"\u0000\u022b\u0229\u0001\u0000\u0000\u0000\u022b\u022c\u0001\u0000\u0000"+
		"\u0000\u022c5\u0001\u0000\u0000\u0000\u022d\u022b\u0001\u0000\u0000\u0000"+
		"\u022e\u0249\u0005\u001d\u0000\u0000\u022f\u0249\u0005\u001e\u0000\u0000"+
		"\u0230\u0249\u0003\u0010\b\u0000\u0231\u0249\u0005\u001a\u0000\u0000\u0232"+
		"\u0249\u0005\u001b\u0000\u0000\u0233\u0249\u0005\u001c\u0000\u0000\u0234"+
		"\u0235\u00050\u0000\u0000\u0235\u0236\u00034\u001a\u0000\u0236\u0237\u0005"+
		"1\u0000\u0000\u0237\u0249\u0001\u0000\u0000\u0000\u0238\u0249\u0003@ "+
		"\u0000\u0239\u0249\u0003D\"\u0000\u023a\u0249\u0003F#\u0000\u023b\u0249"+
		"\u0003\u000e\u0007\u0000\u023c\u0249\u0003:\u001d\u0000\u023d\u0249\u0003"+
		"<\u001e\u0000\u023e\u023f\u00058\u0000\u0000\u023f\u0249\u00034\u001a"+
		"\u0000\u0240\u0244\u0007\u0005\u0000\u0000\u0241\u0243\u0003X,\u0000\u0242"+
		"\u0241\u0001\u0000\u0000\u0000\u0243\u0246\u0001\u0000\u0000\u0000\u0244"+
		"\u0242\u0001\u0000\u0000\u0000\u0244\u0245\u0001\u0000\u0000\u0000\u0245"+
		"\u0247\u0001\u0000\u0000\u0000\u0246\u0244\u0001\u0000\u0000\u0000\u0247"+
		"\u0249\u0007\u0005\u0000\u0000\u0248\u022e\u0001\u0000\u0000\u0000\u0248"+
		"\u022f\u0001\u0000\u0000\u0000\u0248\u0230\u0001\u0000\u0000\u0000\u0248"+
		"\u0231\u0001\u0000\u0000\u0000\u0248\u0232\u0001\u0000\u0000\u0000\u0248"+
		"\u0233\u0001\u0000\u0000\u0000\u0248\u0234\u0001\u0000\u0000\u0000\u0248"+
		"\u0238\u0001\u0000\u0000\u0000\u0248\u0239\u0001\u0000\u0000\u0000\u0248"+
		"\u023a\u0001\u0000\u0000\u0000\u0248\u023b\u0001\u0000\u0000\u0000\u0248"+
		"\u023c\u0001\u0000\u0000\u0000\u0248\u023d\u0001\u0000\u0000\u0000\u0248"+
		"\u023e\u0001\u0000\u0000\u0000\u0248\u0240\u0001\u0000\u0000\u0000\u0249"+
		"7\u0001\u0000\u0000\u0000\u024a\u025d\u0005#\u0000\u0000\u024b\u025d\u0005"+
		"%\u0000\u0000\u024c\u025d\u0005$\u0000\u0000\u024d\u025d\u0005:\u0000"+
		"\u0000\u024e\u025d\u0005;\u0000\u0000\u024f\u025d\u00059\u0000\u0000\u0250"+
		"\u0252\u00053\u0000\u0000\u0251\u0253\u0007\u0006\u0000\u0000\u0252\u0251"+
		"\u0001\u0000\u0000\u0000\u0252\u0253\u0001\u0000\u0000\u0000\u0253\u025d"+
		"\u0001\u0000\u0000\u0000\u0254\u0256\u0007\u0007\u0000\u0000\u0255\u0257"+
		"\u0007\u0006\u0000\u0000\u0256\u0255\u0001\u0000\u0000\u0000\u0256\u0257"+
		"\u0001\u0000\u0000\u0000\u0257\u025d\u0001\u0000\u0000\u0000\u0258\u025d"+
		"\u0005 \u0000\u0000\u0259\u025d\u0005!\u0000\u0000\u025a\u025d\u0005\""+
		"\u0000\u0000\u025b\u025d\u00054\u0000\u0000\u025c\u024a\u0001\u0000\u0000"+
		"\u0000\u025c\u024b\u0001\u0000\u0000\u0000\u025c\u024c\u0001\u0000\u0000"+
		"\u0000\u025c\u024d\u0001\u0000\u0000\u0000\u025c\u024e\u0001\u0000\u0000"+
		"\u0000\u025c\u024f\u0001\u0000\u0000\u0000\u025c\u0250\u0001\u0000\u0000"+
		"\u0000\u025c\u0254\u0001\u0000\u0000\u0000\u025c\u0258\u0001\u0000\u0000"+
		"\u0000\u025c\u0259\u0001\u0000\u0000\u0000\u025c\u025a\u0001\u0000\u0000"+
		"\u0000\u025c\u025b\u0001\u0000\u0000\u0000\u025d9\u0001\u0000\u0000\u0000"+
		"\u025e\u025f\u0005\u001c\u0000\u0000\u025f\u0263\u00055\u0000\u0000\u0260"+
		"\u0261\u00055\u0000\u0000\u0261\u0263\u0005\u001c\u0000\u0000\u0262\u025e"+
		"\u0001\u0000\u0000\u0000\u0262\u0260\u0001\u0000\u0000\u0000\u0263;\u0001"+
		"\u0000\u0000\u0000\u0264\u0265\u0005\u001c\u0000\u0000\u0265\u0269\u0005"+
		"6\u0000\u0000\u0266\u0267\u00056\u0000\u0000\u0267\u0269\u0005\u001c\u0000"+
		"\u0000\u0268\u0264\u0001\u0000\u0000\u0000\u0268\u0266\u0001\u0000\u0000"+
		"\u0000\u0269=\u0001\u0000\u0000\u0000\u026a\u026b\u0005%\u0000\u0000\u026b"+
		"\u027b\u00034\u001a\u0000\u026c\u026d\u0005#\u0000\u0000\u026d\u027b\u0003"+
		"4\u001a\u0000\u026e\u026f\u0005$\u0000\u0000\u026f\u027b\u00034\u001a"+
		"\u0000\u0270\u0272\u00053\u0000\u0000\u0271\u0273\u0007\u0006\u0000\u0000"+
		"\u0272\u0271\u0001\u0000\u0000\u0000\u0272\u0273\u0001\u0000\u0000\u0000"+
		"\u0273\u0274\u0001\u0000\u0000\u0000\u0274\u027b\u00034\u001a\u0000\u0275"+
		"\u0277\u0007\u0007\u0000\u0000\u0276\u0278\u0007\u0006\u0000\u0000\u0277"+
		"\u0276\u0001\u0000\u0000\u0000\u0277\u0278\u0001\u0000\u0000\u0000\u0278"+
		"\u0279\u0001\u0000\u0000\u0000\u0279\u027b\u00034\u001a\u0000\u027a\u026a"+
		"\u0001\u0000\u0000\u0000\u027a\u026c\u0001\u0000\u0000\u0000\u027a\u026e"+
		"\u0001\u0000\u0000\u0000\u027a\u0270\u0001\u0000\u0000\u0000\u027a\u0275"+
		"\u0001\u0000\u0000\u0000\u027b?\u0001\u0000\u0000\u0000\u027c\u027d\u0005"+
		"&\u0000\u0000\u027d\u0282\u0003B!\u0000\u027e\u027f\u0005+\u0000\u0000"+
		"\u027f\u0281\u0003B!\u0000\u0280\u027e\u0001\u0000\u0000\u0000\u0281\u0284"+
		"\u0001\u0000\u0000\u0000\u0282\u0283\u0001\u0000\u0000\u0000\u0282\u0280"+
		"\u0001\u0000\u0000\u0000\u0283\u0285\u0001\u0000\u0000\u0000\u0284\u0282"+
		"\u0001\u0000\u0000\u0000\u0285\u0286\u0005\'\u0000\u0000\u0286A\u0001"+
		"\u0000\u0000\u0000\u0287\u0288\u0005\u001c\u0000\u0000\u0288\u0289\u0005"+
		"*\u0000\u0000\u0289\u028a\u00034\u001a\u0000\u028aC\u0001\u0000\u0000"+
		"\u0000\u028b\u0294\u0005(\u0000\u0000\u028c\u0291\u00034\u001a\u0000\u028d"+
		"\u028e\u0005+\u0000\u0000\u028e\u0290\u00034\u001a\u0000\u028f\u028d\u0001"+
		"\u0000\u0000\u0000\u0290\u0293\u0001\u0000\u0000\u0000\u0291\u028f\u0001"+
		"\u0000\u0000\u0000\u0291\u0292\u0001\u0000\u0000\u0000\u0292\u0295\u0001"+
		"\u0000\u0000\u0000\u0293\u0291\u0001\u0000\u0000\u0000\u0294\u028c\u0001"+
		"\u0000\u0000\u0000\u0294\u0295\u0001\u0000\u0000\u0000\u0295\u0296\u0001"+
		"\u0000\u0000\u0000\u0296\u0297\u0005)\u0000\u0000\u0297E\u0001\u0000\u0000"+
		"\u0000\u0298\u0299\u0005\u001c\u0000\u0000\u0299\u029a\u0005(\u0000\u0000"+
		"\u029a\u029b\u00034\u001a\u0000\u029b\u029c\u0005)\u0000\u0000\u029cG"+
		"\u0001\u0000\u0000\u0000\u029d\u029e\u0007\b\u0000\u0000\u029eI\u0001"+
		"\u0000\u0000\u0000\u029f\u02a0\u0007\u0007\u0000\u0000\u02a0\u02a4\u0003"+
		"H$\u0000\u02a1\u02a3\u0003L&\u0000\u02a2\u02a1\u0001\u0000\u0000\u0000"+
		"\u02a3\u02a6\u0001\u0000\u0000\u0000\u02a4\u02a2\u0001\u0000\u0000\u0000"+
		"\u02a4\u02a5\u0001\u0000\u0000\u0000\u02a5\u02a7\u0001\u0000\u0000\u0000"+
		"\u02a6\u02a4\u0001\u0000\u0000\u0000\u02a7\u02a8\u00053\u0000\u0000\u02a8"+
		"K\u0001\u0000\u0000\u0000\u02a9\u02ab\u0003N\'\u0000\u02aa\u02a9\u0001"+
		"\u0000\u0000\u0000\u02ab\u02ac\u0001\u0000\u0000\u0000\u02ac\u02aa\u0001"+
		"\u0000\u0000\u0000\u02ac\u02ad\u0001\u0000\u0000\u0000\u02adM\u0001\u0000"+
		"\u0000\u0000\u02ae\u02af\u0005\u0001\u0000\u0000\u02af\u02b0\u0005\u001f"+
		"\u0000\u0000\u02b0\u02b1\u0005<\u0000\u0000\u02b1\u02b2\u0005\u0007\u0000"+
		"\u0000\u02b2\u02b3\u0005\u001c\u0000\u0000\u02b3\u02b4\u0005\u0019\u0000"+
		"\u0000\u02b4\u02b5\u0005\u001c\u0000\u0000\u02b5\u02c3\u0005<\u0000\u0000"+
		"\u02b6\u02b7\u0005\u0002\u0000\u0000\u02b7\u02b8\u0005\u001f\u0000\u0000"+
		"\u02b8\u02b9\u0005<\u0000\u0000\u02b9\u02ba\u00034\u001a\u0000\u02ba\u02bb"+
		"\u0005<\u0000\u0000\u02bb\u02c3\u0001\u0000\u0000\u0000\u02bc\u02bd\u0005"+
		"\u0003\u0000\u0000\u02bd\u02be\u0005\u001f\u0000\u0000\u02be\u02c3\u0003"+
		"P(\u0000\u02bf\u02c0\u0005\u001c\u0000\u0000\u02c0\u02c1\u0005\u001f\u0000"+
		"\u0000\u02c1\u02c3\u0003P(\u0000\u02c2\u02ae\u0001\u0000\u0000\u0000\u02c2"+
		"\u02b6\u0001\u0000\u0000\u0000\u02c2\u02bc\u0001\u0000\u0000\u0000\u02c2"+
		"\u02bf\u0001\u0000\u0000\u0000\u02c3O\u0001\u0000\u0000\u0000\u02c4\u02c8"+
		"\u0005\u001e\u0000\u0000\u02c5\u02c8\u0003R)\u0000\u02c6\u02c8\u00034"+
		"\u001a\u0000\u02c7\u02c4\u0001\u0000\u0000\u0000\u02c7\u02c5\u0001\u0000"+
		"\u0000\u0000\u02c7\u02c6\u0001\u0000\u0000\u0000\u02c8Q\u0001\u0000\u0000"+
		"\u0000\u02c9\u02cd\u0005>\u0000\u0000\u02ca\u02cb\u0005&\u0000\u0000\u02cb"+
		"\u02cd\u0005&\u0000\u0000\u02cc\u02c9\u0001\u0000\u0000\u0000\u02cc\u02ca"+
		"\u0001\u0000\u0000\u0000\u02cd\u02ce\u0001\u0000\u0000\u0000\u02ce\u02d2"+
		"\u00034\u001a\u0000\u02cf\u02d3\u0005?\u0000\u0000\u02d0\u02d1\u0005\'"+
		"\u0000\u0000\u02d1\u02d3\u0005\'\u0000\u0000\u02d2\u02cf\u0001\u0000\u0000"+
		"\u0000\u02d2\u02d0\u0001\u0000\u0000\u0000\u02d3\u02e6\u0001\u0000\u0000"+
		"\u0000\u02d4\u02d8\u0005>\u0000\u0000\u02d5\u02d6\u0005&\u0000\u0000\u02d6"+
		"\u02d8\u0005&\u0000\u0000\u02d7\u02d4\u0001\u0000\u0000\u0000\u02d7\u02d5"+
		"\u0001\u0000\u0000\u0000\u02d8\u02d9\u0001\u0000\u0000\u0000\u02d9\u02dd"+
		"\u0005>\u0000\u0000\u02da\u02dc\u0003X,\u0000\u02db\u02da\u0001\u0000"+
		"\u0000\u0000\u02dc\u02df\u0001\u0000\u0000\u0000\u02dd\u02db\u0001\u0000"+
		"\u0000\u0000\u02dd\u02de\u0001\u0000\u0000\u0000\u02de\u02e3\u0001\u0000"+
		"\u0000\u0000\u02df\u02dd\u0001\u0000\u0000\u0000\u02e0\u02e4\u0005?\u0000"+
		"\u0000\u02e1\u02e2\u0005\'\u0000\u0000\u02e2\u02e4\u0005\'\u0000\u0000"+
		"\u02e3\u02e0\u0001\u0000\u0000\u0000\u02e3\u02e1\u0001\u0000\u0000\u0000"+
		"\u02e4\u02e6\u0001\u0000\u0000\u0000\u02e5\u02cc\u0001\u0000\u0000\u0000"+
		"\u02e5\u02d7\u0001\u0000\u0000\u0000\u02e6S\u0001\u0000\u0000\u0000\u02e7"+
		"\u02e8\u0007\u0007\u0000\u0000\u02e8\u02e9\u00054\u0000\u0000\u02e9\u02ea"+
		"\u0003H$\u0000\u02ea\u02eb\u00053\u0000\u0000\u02ebU\u0001\u0000\u0000"+
		"\u0000\u02ec\u02ed\u0007\u0007\u0000\u0000\u02ed\u02ee\u0003H$\u0000\u02ee"+
		"\u02ef\u00054\u0000\u0000\u02ef\u02f0\u00053\u0000\u0000\u02f0W\u0001"+
		"\u0000\u0000\u0000\u02f1\u02f5\u0003J%\u0000\u02f2\u02f4\u0003X,\u0000"+
		"\u02f3\u02f2\u0001\u0000\u0000\u0000\u02f4\u02f7\u0001\u0000\u0000\u0000"+
		"\u02f5\u02f3\u0001\u0000\u0000\u0000\u02f5\u02f6\u0001\u0000\u0000\u0000"+
		"\u02f6\u02f8\u0001\u0000\u0000\u0000\u02f7\u02f5\u0001\u0000\u0000\u0000"+
		"\u02f8\u02f9\u0003T*\u0000\u02f9\u0309\u0001\u0000\u0000\u0000\u02fa\u0309"+
		"\u0003V+\u0000\u02fb\u02ff\u0005>\u0000\u0000\u02fc\u02fe\u0003\u0002"+
		"\u0001\u0000\u02fd\u02fc\u0001\u0000\u0000\u0000\u02fe\u0301\u0001\u0000"+
		"\u0000\u0000\u02ff\u02fd\u0001\u0000\u0000\u0000\u02ff\u0300\u0001\u0000"+
		"\u0000\u0000\u0300\u0305\u0001\u0000\u0000\u0000\u0301\u02ff\u0001\u0000"+
		"\u0000\u0000\u0302\u0306\u0005?\u0000\u0000\u0303\u0304\u0005\'\u0000"+
		"\u0000\u0304\u0306\u0005\'\u0000\u0000\u0305\u0302\u0001\u0000\u0000\u0000"+
		"\u0305\u0303\u0001\u0000\u0000\u0000\u0306\u0309\u0001\u0000\u0000\u0000"+
		"\u0307\u0309\u0005A\u0000\u0000\u0308\u02f1\u0001\u0000\u0000\u0000\u0308"+
		"\u02fa\u0001\u0000\u0000\u0000\u0308\u02fb\u0001\u0000\u0000\u0000\u0308"+
		"\u0307\u0001\u0000\u0000\u0000\u0309Y\u0001\u0000\u0000\u0000`]aeimqu"+
		"y\u0083\u0085\u0091\u0099\u00a3\u00ab\u00af\u00b6\u00c7\u00cc\u00d1\u00d5"+
		"\u00d9\u00e0\u00e9\u00ed\u00f4\u0103\u0112\u0117\u0121\u0124\u012a\u0130"+
		"\u013a\u013d\u0141\u0144\u014b\u014e\u0150\u0159\u015c\u0165\u0169\u016e"+
		"\u017b\u0183\u0189\u0193\u019a\u01a3\u01ae\u01b8\u01c2\u01c5\u01cc\u01d9"+
		"\u01de\u01e1\u01e9\u01f2\u01f7\u01ff\u0204\u020d\u0212\u0214\u0224\u0229"+
		"\u022b\u0244\u0248\u0252\u0256\u025c\u0262\u0268\u0272\u0277\u027a\u0282"+
		"\u0291\u0294\u02a4\u02ac\u02c2\u02c7\u02cc\u02d2\u02d7\u02dd\u02e3\u02e5"+
		"\u02f5\u02ff\u0305\u0308";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}