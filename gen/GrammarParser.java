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
		BACKTICK_HTML=54, TEXT_HTML=55;
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
		RULE_attribute = 33, RULE_open_tag = 34, RULE_close_tag = 35, RULE_single_tag = 36, 
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
			"attribute", "open_tag", "close_tag", "single_tag", "html"
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
			"TEXT_HTML"
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				statement();
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
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableAssignContext variableAssign() {
			return getRuleContext(VariableAssignContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public HtmlContext html() {
			return getRuleContext(HtmlContext.class,0);
		}
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public ComponentStatementContext componentStatement() {
			return getRuleContext(ComponentStatementContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ExportStatementContext exportStatement() {
			return getRuleContext(ExportStatementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(81);
				functionDeclaration();
				}
				break;
			case 2:
				{
				setState(82);
				functionCall();
				}
				break;
			case 3:
				{
				setState(83);
				variableDeclaration();
				}
				break;
			case 4:
				{
				setState(84);
				variableAssign();
				}
				break;
			case 5:
				{
				setState(85);
				value(0);
				}
				break;
			case 6:
				{
				setState(86);
				html();
				}
				break;
			case 7:
				{
				setState(87);
				return_();
				}
				break;
			case 8:
				{
				setState(88);
				ifStatement();
				}
				break;
			case 9:
				{
				setState(89);
				importStatement();
				}
				break;
			case 10:
				{
				setState(90);
				iterationStatement();
				}
				break;
			case 11:
				{
				setState(91);
				componentStatement();
				}
				break;
			case 12:
				{
				setState(92);
				classDeclaration();
				}
				break;
			case 13:
				{
				setState(93);
				exportStatement();
				}
				break;
			}
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(96);
				match(SEMICOLON);
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
	public static class ReturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(GrammarParser.RETURN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(RETURN);
			setState(100);
			value(0);
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
		public IfBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterIfBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitIfBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitIfBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBodyContext ifBody() throws RecognitionException {
		IfBodyContext _localctx = new IfBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(IF);
			setState(103);
			match(LPAREN);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 19166967225122816L) != 0)) {
				{
				setState(104);
				value(0);
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 234881024L) != 0)) {
					{
					{
					setState(105);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 234881024L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(106);
					value(0);
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(114);
			match(RPAREN);
			setState(115);
			match(LBRACE);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 61952263197117950L) != 0)) {
				{
				{
				setState(116);
				statement();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
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
		public TerminalNode LBRACE() { return getToken(GrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(GrammarParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			ifBody();
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(125);
					match(ELSE);
					setState(126);
					ifBody();
					}
					} 
				}
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(132);
				match(ELSE);
				setState(133);
				match(LBRACE);
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 61952263197117950L) != 0)) {
					{
					{
					setState(134);
					statement();
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(140);
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
		public TerminalNode DO() { return getToken(GrammarParser.DO, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode WHILE() { return getToken(GrammarParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(GrammarParser.LBRACE, 0); }
		public TerminalNode LBRACE_HTML() { return getToken(GrammarParser.LBRACE_HTML, 0); }
		public TerminalNode RBRACE() { return getToken(GrammarParser.RBRACE, 0); }
		public TerminalNode RBRACE_HTML() { return getToken(GrammarParser.RBRACE_HTML, 0); }
		public TerminalNode FOR() { return getToken(GrammarParser.FOR, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(GrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GrammarParser.SEMICOLON, i);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode IN() { return getToken(GrammarParser.IN, 0); }
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitIterationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitIterationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_iterationStatement);
		int _la;
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(DO);
				setState(144);
				statement();
				setState(145);
				match(WHILE);
				setState(146);
				match(LPAREN);
				setState(147);
				value(0);
				setState(148);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(WHILE);
				setState(151);
				match(LPAREN);
				setState(152);
				value(0);
				setState(153);
				match(RPAREN);
				setState(163);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					{
					setState(154);
					_la = _input.LA(1);
					if ( !(_la==LBRACE || _la==LBRACE_HTML) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 61952263197117950L) != 0)) {
						{
						{
						setState(155);
						statement();
						}
						}
						setState(160);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(161);
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
					break;
				case 2:
					{
					setState(162);
					statement();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				match(FOR);
				setState(166);
				match(LPAREN);
				setState(169);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
				case NUMBER:
				case STRING:
				case LBRACE:
				case LBRACKET:
				case COLON:
				case LPAREN:
				case PLUSPLUS:
				case MINUSMINUS:
				case BACKTICK:
				case BACKTICK_HTML:
					{
					setState(167);
					value(0);
					}
					break;
				case CONST:
				case LET:
				case VAR:
					{
					setState(168);
					variableDeclaration();
					}
					break;
				case SEMICOLON:
					break;
				default:
					break;
				}
				setState(171);
				match(SEMICOLON);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 19166967225122816L) != 0)) {
					{
					setState(172);
					value(0);
					}
				}

				setState(175);
				match(SEMICOLON);
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 19166967225122816L) != 0)) {
					{
					setState(176);
					value(0);
					}
				}

				setState(179);
				match(RPAREN);
				setState(180);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				match(FOR);
				setState(182);
				match(LPAREN);
				setState(185);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
				case NUMBER:
				case STRING:
				case LBRACE:
				case LBRACKET:
				case COLON:
				case LPAREN:
				case PLUSPLUS:
				case MINUSMINUS:
				case BACKTICK:
				case BACKTICK_HTML:
					{
					setState(183);
					value(0);
					}
					break;
				case CONST:
				case LET:
				case VAR:
					{
					setState(184);
					variableDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(187);
				match(IN);
				setState(188);
				value(0);
				setState(189);
				match(RPAREN);
				setState(190);
				statement();
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
		public TerminalNode FUNCTION() { return getToken(GrammarParser.FUNCTION, 0); }
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(FUNCTION);
			setState(195);
			match(ID);
			setState(196);
			match(LPAREN);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(197);
				match(ID);
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(198);
					match(COMMA);
					setState(199);
					match(ID);
					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(207);
			match(RPAREN);
			setState(208);
			functionBody();
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
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionBody);
		int _la;
		try {
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
			case COLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(210);
					typeDefine();
					}
				}

				setState(213);
				match(LBRACE);
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 61952263197117950L) != 0)) {
					{
					{
					setState(214);
					statement();
					}
					}
					setState(219);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(220);
				match(RBRACE);
				}
				break;
			case ID:
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LPAREN:
					{
					{
					setState(221);
					match(LPAREN);
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(222);
						match(ID);
						setState(227);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(223);
							match(COMMA);
							setState(224);
							match(ID);
							}
							}
							setState(229);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(232);
					match(RPAREN);
					}
					}
					break;
				case ID:
					{
					setState(233);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(236);
					typeDefine();
					}
				}

				setState(239);
				match(ARROW);
				setState(240);
				value(0);
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
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
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
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(ID);
			setState(244);
			match(LPAREN);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 19166967225122816L) != 0)) {
				{
				setState(245);
				value(0);
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(246);
					match(COMMA);
					setState(247);
					value(0);
					}
					}
					setState(252);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(255);
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
		public VariableAssignContext variableAssign() {
			return getRuleContext(VariableAssignContext.class,0);
		}
		public TerminalNode CONST() { return getToken(GrammarParser.CONST, 0); }
		public TerminalNode LET() { return getToken(GrammarParser.LET, 0); }
		public TerminalNode VAR() { return getToken(GrammarParser.VAR, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 56L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(258);
			variableAssign();
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
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TypeDefineContext typeDefine() {
			return getRuleContext(TypeDefineContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public VariableAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterVariableAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitVariableAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitVariableAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssignContext variableAssign() throws RecognitionException {
		VariableAssignContext _localctx = new VariableAssignContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableAssign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(ID);
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(261);
				typeDefine();
				}
				break;
			}
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(264);
				match(ASSIGN);
				setState(265);
				value(0);
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
		public TerminalNode IMPORT() { return getToken(GrammarParser.IMPORT, 0); }
		public TerminalNode FROM() { return getToken(GrammarParser.FROM, 0); }
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public DefaultImportContext defaultImport() {
			return getRuleContext(DefaultImportContext.class,0);
		}
		public NamedImportsContext namedImports() {
			return getRuleContext(NamedImportsContext.class,0);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(IMPORT);
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(269);
				defaultImport();
				}
				break;
			case LBRACE:
			case LBRACE_HTML:
				{
				setState(270);
				namedImports();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(273);
			match(FROM);
			setState(274);
			match(STRING);
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
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public DefaultImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterDefaultImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitDefaultImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitDefaultImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultImportContext defaultImport() throws RecognitionException {
		DefaultImportContext _localctx = new DefaultImportContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_defaultImport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(ID);
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
		public List<ImportSpecifierContext> importSpecifier() {
			return getRuleContexts(ImportSpecifierContext.class);
		}
		public ImportSpecifierContext importSpecifier(int i) {
			return getRuleContext(ImportSpecifierContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(GrammarParser.LBRACE, 0); }
		public TerminalNode LBRACE_HTML() { return getToken(GrammarParser.LBRACE_HTML, 0); }
		public TerminalNode RBRACE() { return getToken(GrammarParser.RBRACE, 0); }
		public TerminalNode RBRACE_HTML() { return getToken(GrammarParser.RBRACE_HTML, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public NamedImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedImports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterNamedImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitNamedImports(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitNamedImports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedImportsContext namedImports() throws RecognitionException {
		NamedImportsContext _localctx = new NamedImportsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_namedImports);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_la = _input.LA(1);
			if ( !(_la==LBRACE || _la==LBRACE_HTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(279);
			importSpecifier();
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(280);
				match(COMMA);
				setState(281);
				importSpecifier();
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(287);
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
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public TerminalNode AS() { return getToken(GrammarParser.AS, 0); }
		public ImportSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterImportSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitImportSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitImportSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportSpecifierContext importSpecifier() throws RecognitionException {
		ImportSpecifierContext _localctx = new ImportSpecifierContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_importSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(ID);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(290);
				match(AS);
				setState(291);
				match(ID);
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
		public ExportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterExportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitExportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitExportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportStatementContext exportStatement() throws RecognitionException {
		ExportStatementContext _localctx = new ExportStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_exportStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(EXPORT);
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(295);
				classDeclaration();
				}
				break;
			case 2:
				{
				setState(296);
				value(0);
				}
				break;
			case 3:
				{
				setState(297);
				functionBody();
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
		public TerminalNode CLASS() { return getToken(GrammarParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_classDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(CLASS);
			setState(301);
			match(ID);
			setState(302);
			classBody();
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
		public TerminalNode LBRACE() { return getToken(GrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(GrammarParser.RBRACE, 0); }
		public List<ClassBodyStatementContext> classBodyStatement() {
			return getRuleContexts(ClassBodyStatementContext.class);
		}
		public ClassBodyStatementContext classBodyStatement(int i) {
			return getRuleContext(ClassBodyStatementContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(304);
			match(LBRACE);
			}
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 120L) != 0)) {
				{
				{
				setState(305);
				classBodyStatement();
				}
				}
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(311);
			match(RBRACE);
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
	public static class ClassBodyStatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ClassBodyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterClassBodyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitClassBodyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitClassBodyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyStatementContext classBodyStatement() throws RecognitionException {
		ClassBodyStatementContext _localctx = new ClassBodyStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_classBodyStatement);
		try {
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
			case LET:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				variableDeclaration();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				functionDeclaration();
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
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public ComponentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterComponentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitComponentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitComponentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentStatementContext componentStatement() throws RecognitionException {
		ComponentStatementContext _localctx = new ComponentStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_componentStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(COMPONENT);
			setState(318);
			match(LPAREN);
			setState(319);
			match(LBRACE);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SELECTOR) {
				{
				setState(320);
				match(SELECTOR);
				setState(321);
				match(COLON);
				setState(322);
				match(STRING);
				setState(323);
				match(COMMA);
				}
			}

			setState(326);
			match(TEMPLATE);
			setState(327);
			match(COLON);
			{
			setState(328);
			value(0);
			}
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(329);
				match(COMMA);
				setState(330);
				match(ID);
				setState(331);
				match(COLON);
				setState(332);
				value(0);
				}
				}
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(338);
			match(RBRACE);
			setState(339);
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
		public TerminalNode COLON() { return getToken(GrammarParser.COLON, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode LBRACKET() { return getToken(GrammarParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(GrammarParser.RBRACKET, 0); }
		public TypeDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterTypeDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitTypeDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitTypeDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDefineContext typeDefine() throws RecognitionException {
		TypeDefineContext _localctx = new TypeDefineContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typeDefine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(COLON);
			setState(342);
			match(ID);
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(343);
				match(LBRACKET);
				setState(344);
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
		public TerminalNode AS() { return getToken(GrammarParser.AS, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode LBRACKET() { return getToken(GrammarParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(GrammarParser.RBRACKET, 0); }
		public AsTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterAsType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitAsType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitAsType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsTypeContext asType() throws RecognitionException {
		AsTypeContext _localctx = new AsTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_asType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(AS);
			setState(348);
			match(ID);
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(349);
				match(LBRACKET);
				setState(350);
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
		public PrimaryValueContext primaryValue() {
			return getRuleContext(PrimaryValueContext.class,0);
		}
		public AsTypeContext asType() {
			return getRuleContext(AsTypeContext.class,0);
		}
		public TerminalNode QMARK() { return getToken(GrammarParser.QMARK, 0); }
		public TerminalNode EMARK() { return getToken(GrammarParser.EMARK, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public BinaryOpContext binaryOp() {
			return getRuleContext(BinaryOpContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitValue(this);
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
			setState(354);
			primaryValue();
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(355);
				_la = _input.LA(1);
				if ( !(_la==QMARK || _la==EMARK) ) {
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
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(358);
				asType();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(367);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ValueContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_value);
					setState(361);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(362);
					binaryOp();
					setState(363);
					value(3);
					}
					} 
				}
				setState(369);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public Increase_variableContext increase_variable() {
			return getRuleContext(Increase_variableContext.class,0);
		}
		public Decrease_variableContext decrease_variable() {
			return getRuleContext(Decrease_variableContext.class,0);
		}
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
		public PrimaryValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterPrimaryValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitPrimaryValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitPrimaryValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryValueContext primaryValue() throws RecognitionException {
		PrimaryValueContext _localctx = new PrimaryValueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_primaryValue);
		int _la;
		try {
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(372);
				functionCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(373);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(374);
				match(LPAREN);
				setState(375);
				value(0);
				setState(376);
				match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(378);
				object();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(379);
				array();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(380);
				arrayAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(381);
				functionBody();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(382);
				increase_variable();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(383);
				decrease_variable();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(384);
				_la = _input.LA(1);
				if ( !(_la==BACKTICK || _la==BACKTICK_HTML) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 42785295971647488L) != 0)) {
					{
					{
					setState(385);
					html();
					}
					}
					setState(390);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(391);
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
			setState(408);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				match(DOUBLE_ASSIGN);
				}
				break;
			case DOUBLE_ASSIGN_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				match(DOUBLE_ASSIGN_ID);
				}
				break;
			case NOT_EQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(396);
				match(NOT_EQUAL);
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 4);
				{
				setState(397);
				match(OR);
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 5);
				{
				setState(398);
				match(AND);
				}
				break;
			case DOUBLE_QMARK:
				enterOuterAlt(_localctx, 6);
				{
				setState(399);
				match(DOUBLE_QMARK);
				}
				break;
			case RTAG:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(400);
				match(RTAG);
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN || _la==DOUBLE_ASSIGN) {
					{
					setState(401);
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
				setState(404);
				_la = _input.LA(1);
				if ( !(_la==LTAG || _la==LTAG_HTML) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN || _la==DOUBLE_ASSIGN) {
					{
					setState(405);
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
			setState(419);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(410);
				match(DOT);
				setState(411);
				value(0);
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
				setState(412);
				comparison();
				}
				break;
			case DOUBLE_QMARK:
				enterOuterAlt(_localctx, 3);
				{
				setState(413);
				match(DOUBLE_QMARK);
				setState(414);
				value(0);
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 4);
				{
				setState(415);
				match(OR);
				setState(416);
				value(0);
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 5);
				{
				setState(417);
				match(AND);
				setState(418);
				value(0);
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
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode PLUSPLUS() { return getToken(GrammarParser.PLUSPLUS, 0); }
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
			setState(425);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(421);
				match(ID);
				setState(422);
				match(PLUSPLUS);
				}
				}
				break;
			case PLUSPLUS:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(423);
				match(PLUSPLUS);
				setState(424);
				match(ID);
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
	public static class Decrease_variableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode MINUSMINUS() { return getToken(GrammarParser.MINUSMINUS, 0); }
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
			setState(431);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(427);
				match(ID);
				setState(428);
				match(MINUSMINUS);
				}
				}
				break;
			case MINUSMINUS:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(429);
				match(MINUSMINUS);
				setState(430);
				match(ID);
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
	public static class ComparisonContext extends ParserRuleContext {
		public PrimaryValueContext primaryValue() {
			return getRuleContext(PrimaryValueContext.class,0);
		}
		public TerminalNode DOUBLE_ASSIGN_ID() { return getToken(GrammarParser.DOUBLE_ASSIGN_ID, 0); }
		public TerminalNode DOUBLE_ASSIGN() { return getToken(GrammarParser.DOUBLE_ASSIGN, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(GrammarParser.NOT_EQUAL, 0); }
		public TerminalNode RTAG() { return getToken(GrammarParser.RTAG, 0); }
		public TerminalNode LTAG() { return getToken(GrammarParser.LTAG, 0); }
		public TerminalNode LTAG_HTML() { return getToken(GrammarParser.LTAG_HTML, 0); }
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_ASSIGN_ID:
				{
				setState(433);
				match(DOUBLE_ASSIGN_ID);
				}
				break;
			case DOUBLE_ASSIGN:
				{
				setState(434);
				match(DOUBLE_ASSIGN);
				}
				break;
			case NOT_EQUAL:
				{
				setState(435);
				match(NOT_EQUAL);
				}
				break;
			case RTAG:
				{
				{
				setState(436);
				match(RTAG);
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN || _la==DOUBLE_ASSIGN) {
					{
					setState(437);
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
				{
				{
				setState(440);
				_la = _input.LA(1);
				if ( !(_la==LTAG || _la==LTAG_HTML) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN || _la==DOUBLE_ASSIGN) {
					{
					setState(441);
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
			default:
				throw new NoViableAltException(this);
			}
			setState(446);
			primaryValue();
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
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(448);
			match(LBRACE);
			}
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(449);
				pair();
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(450);
					match(COMMA);
					setState(451);
					pair();
					}
					}
					setState(456);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			{
			setState(459);
			match(RBRACE);
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
	public static class PairContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode COLON() { return getToken(GrammarParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(ID);
			setState(462);
			match(COLON);
			setState(463);
			value(0);
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
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(LBRACKET);
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 19166967225122816L) != 0)) {
				{
				setState(466);
				value(0);
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(467);
					match(COMMA);
					setState(468);
					value(0);
					}
					}
					setState(473);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(476);
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
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode LBRACKET() { return getToken(GrammarParser.LBRACKET, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(GrammarParser.RBRACKET, 0); }
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(ID);
			setState(479);
			match(LBRACKET);
			setState(480);
			value(0);
			setState(481);
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
	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(ID);
			setState(484);
			match(ASSIGN);
			setState(485);
			match(STRING);
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
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode RTAG() { return getToken(GrammarParser.RTAG, 0); }
		public TerminalNode LTAG() { return getToken(GrammarParser.LTAG, 0); }
		public TerminalNode LTAG_HTML() { return getToken(GrammarParser.LTAG_HTML, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public Open_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterOpen_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitOpen_tag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitOpen_tag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Open_tagContext open_tag() throws RecognitionException {
		Open_tagContext _localctx = new Open_tagContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_open_tag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			_la = _input.LA(1);
			if ( !(_la==LTAG || _la==LTAG_HTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(488);
			match(ID);
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(489);
				attribute();
				}
				}
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(495);
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
		public TerminalNode SLASH() { return getToken(GrammarParser.SLASH, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode RTAG() { return getToken(GrammarParser.RTAG, 0); }
		public TerminalNode LTAG() { return getToken(GrammarParser.LTAG, 0); }
		public TerminalNode LTAG_HTML() { return getToken(GrammarParser.LTAG_HTML, 0); }
		public Close_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterClose_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitClose_tag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitClose_tag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Close_tagContext close_tag() throws RecognitionException {
		Close_tagContext _localctx = new Close_tagContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_close_tag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			_la = _input.LA(1);
			if ( !(_la==LTAG || _la==LTAG_HTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(498);
			match(SLASH);
			setState(499);
			match(ID);
			setState(500);
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
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode SLASH() { return getToken(GrammarParser.SLASH, 0); }
		public TerminalNode RTAG() { return getToken(GrammarParser.RTAG, 0); }
		public TerminalNode LTAG() { return getToken(GrammarParser.LTAG, 0); }
		public TerminalNode LTAG_HTML() { return getToken(GrammarParser.LTAG_HTML, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public Single_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterSingle_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitSingle_tag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitSingle_tag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_tagContext single_tag() throws RecognitionException {
		Single_tagContext _localctx = new Single_tagContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_single_tag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			_la = _input.LA(1);
			if ( !(_la==LTAG || _la==LTAG_HTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(503);
			match(ID);
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(504);
				attribute();
				}
				}
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(510);
			match(SLASH);
			setState(511);
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
		public Single_tagContext single_tag() {
			return getRuleContext(Single_tagContext.class,0);
		}
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
		public TerminalNode TEXT_HTML() { return getToken(GrammarParser.TEXT_HTML, 0); }
		public HtmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitHtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitHtml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContext html() throws RecognitionException {
		HtmlContext _localctx = new HtmlContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_html);
		int _la;
		try {
			int _alt;
			setState(536);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				open_tag();
				setState(517);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(514);
						html();
						}
						} 
					}
					setState(519);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
				setState(520);
				close_tag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(522);
				single_tag();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(523);
				match(LBRACE_HTML);
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 61952263197117950L) != 0)) {
					{
					{
					setState(524);
					statement();
					}
					}
					setState(529);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(533);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RBRACE_HTML:
					{
					setState(530);
					match(RBRACE_HTML);
					}
					break;
				case RBRACE:
					{
					{
					setState(531);
					match(RBRACE);
					setState(532);
					match(RBRACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(535);
				match(TEXT_HTML);
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
		"\u0004\u00017\u021b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u000b\u0000\f\u0000O\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001_\b\u0001\u0001\u0001"+
		"\u0003\u0001b\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003l\b\u0003"+
		"\n\u0003\f\u0003o\t\u0003\u0003\u0003q\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003v\b\u0003\n\u0003\f\u0003y\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u0080\b\u0004"+
		"\n\u0004\f\u0004\u0083\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004\u0088\b\u0004\n\u0004\f\u0004\u008b\t\u0004\u0001\u0004\u0003\u0004"+
		"\u008e\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005\u009d\b\u0005\n\u0005\f\u0005\u00a0"+
		"\t\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00a4\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00aa\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u00ae\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u00b2\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u00ba\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u00c1\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00c9\b\u0006"+
		"\n\u0006\f\u0006\u00cc\t\u0006\u0003\u0006\u00ce\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0003\u0007\u00d4\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u00d8\b\u0007\n\u0007\f\u0007\u00db\t\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00e2\b\u0007"+
		"\n\u0007\f\u0007\u00e5\t\u0007\u0003\u0007\u00e7\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u00eb\b\u0007\u0001\u0007\u0003\u0007\u00ee\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u00f2\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u00f9\b\b\n\b\f\b\u00fc\t\b\u0003\b\u00fe\b"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0003\n\u0107"+
		"\b\n\u0001\n\u0001\n\u0003\n\u010b\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u0110\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u011b\b\r\n\r\f\r\u011e"+
		"\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0125"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u012b"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u0133\b\u0011\n\u0011\f\u0011\u0136\t\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u013c\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u0145\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u014e\b\u0013\n\u0013"+
		"\f\u0013\u0151\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u015a\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0160\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u0165\b\u0016\u0001\u0016\u0003\u0016"+
		"\u0168\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016"+
		"\u016e\b\u0016\n\u0016\f\u0016\u0171\t\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0005\u0017\u0183\b\u0017\n\u0017\f\u0017\u0186\t\u0017"+
		"\u0001\u0017\u0003\u0017\u0189\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u0193\b\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0197\b\u0018\u0003"+
		"\u0018\u0199\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u01a4"+
		"\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01aa"+
		"\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01b0"+
		"\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u01b7\b\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01bb\b\u001c"+
		"\u0003\u001c\u01bd\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0005\u001d\u01c5\b\u001d\n\u001d\f\u001d\u01c8"+
		"\t\u001d\u0003\u001d\u01ca\b\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0005\u001f\u01d6\b\u001f\n\u001f\f\u001f\u01d9\t\u001f\u0003"+
		"\u001f\u01db\b\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0005\"\u01eb"+
		"\b\"\n\"\f\"\u01ee\t\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001$\u0001$\u0001$\u0005$\u01fa\b$\n$\f$\u01fd\t$\u0001$\u0001$\u0001"+
		"$\u0001%\u0001%\u0005%\u0204\b%\n%\f%\u0207\t%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0005%\u020e\b%\n%\f%\u0211\t%\u0001%\u0001%\u0001%\u0003%\u0216"+
		"\b%\u0001%\u0003%\u0219\b%\u0001%\u0000\u0001,&\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJ\u0000\b\u0001\u0000\u0019\u001b\u0002\u0000\u001c\u001c"+
		"44\u0002\u0000\u001d\u001d55\u0001\u0000\u0003\u0005\u0001\u0000-.\u0002"+
		"\u00002266\u0001\u0000\u0018\u0019\u0002\u0000((33\u025a\u0000M\u0001"+
		"\u0000\u0000\u0000\u0002^\u0001\u0000\u0000\u0000\u0004c\u0001\u0000\u0000"+
		"\u0000\u0006f\u0001\u0000\u0000\u0000\b|\u0001\u0000\u0000\u0000\n\u00c0"+
		"\u0001\u0000\u0000\u0000\f\u00c2\u0001\u0000\u0000\u0000\u000e\u00f1\u0001"+
		"\u0000\u0000\u0000\u0010\u00f3\u0001\u0000\u0000\u0000\u0012\u0101\u0001"+
		"\u0000\u0000\u0000\u0014\u0104\u0001\u0000\u0000\u0000\u0016\u010c\u0001"+
		"\u0000\u0000\u0000\u0018\u0114\u0001\u0000\u0000\u0000\u001a\u0116\u0001"+
		"\u0000\u0000\u0000\u001c\u0121\u0001\u0000\u0000\u0000\u001e\u0126\u0001"+
		"\u0000\u0000\u0000 \u012c\u0001\u0000\u0000\u0000\"\u0130\u0001\u0000"+
		"\u0000\u0000$\u013b\u0001\u0000\u0000\u0000&\u013d\u0001\u0000\u0000\u0000"+
		"(\u0155\u0001\u0000\u0000\u0000*\u015b\u0001\u0000\u0000\u0000,\u0161"+
		"\u0001\u0000\u0000\u0000.\u0188\u0001\u0000\u0000\u00000\u0198\u0001\u0000"+
		"\u0000\u00002\u01a3\u0001\u0000\u0000\u00004\u01a9\u0001\u0000\u0000\u0000"+
		"6\u01af\u0001\u0000\u0000\u00008\u01bc\u0001\u0000\u0000\u0000:\u01c0"+
		"\u0001\u0000\u0000\u0000<\u01cd\u0001\u0000\u0000\u0000>\u01d1\u0001\u0000"+
		"\u0000\u0000@\u01de\u0001\u0000\u0000\u0000B\u01e3\u0001\u0000\u0000\u0000"+
		"D\u01e7\u0001\u0000\u0000\u0000F\u01f1\u0001\u0000\u0000\u0000H\u01f6"+
		"\u0001\u0000\u0000\u0000J\u0218\u0001\u0000\u0000\u0000LN\u0003\u0002"+
		"\u0001\u0000ML\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OM\u0001"+
		"\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000P\u0001\u0001\u0000\u0000"+
		"\u0000Q_\u0003\f\u0006\u0000R_\u0003\u0010\b\u0000S_\u0003\u0012\t\u0000"+
		"T_\u0003\u0014\n\u0000U_\u0003,\u0016\u0000V_\u0003J%\u0000W_\u0003\u0004"+
		"\u0002\u0000X_\u0003\b\u0004\u0000Y_\u0003\u0016\u000b\u0000Z_\u0003\n"+
		"\u0005\u0000[_\u0003&\u0013\u0000\\_\u0003 \u0010\u0000]_\u0003\u001e"+
		"\u000f\u0000^Q\u0001\u0000\u0000\u0000^R\u0001\u0000\u0000\u0000^S\u0001"+
		"\u0000\u0000\u0000^T\u0001\u0000\u0000\u0000^U\u0001\u0000\u0000\u0000"+
		"^V\u0001\u0000\u0000\u0000^W\u0001\u0000\u0000\u0000^X\u0001\u0000\u0000"+
		"\u0000^Y\u0001\u0000\u0000\u0000^Z\u0001\u0000\u0000\u0000^[\u0001\u0000"+
		"\u0000\u0000^\\\u0001\u0000\u0000\u0000^]\u0001\u0000\u0000\u0000_a\u0001"+
		"\u0000\u0000\u0000`b\u0005\"\u0000\u0000a`\u0001\u0000\u0000\u0000ab\u0001"+
		"\u0000\u0000\u0000b\u0003\u0001\u0000\u0000\u0000cd\u0005\u0007\u0000"+
		"\u0000de\u0003,\u0016\u0000e\u0005\u0001\u0000\u0000\u0000fg\u0005\b\u0000"+
		"\u0000gp\u0005&\u0000\u0000hm\u0003,\u0016\u0000ij\u0007\u0000\u0000\u0000"+
		"jl\u0003,\u0016\u0000ki\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000"+
		"mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000"+
		"\u0000om\u0001\u0000\u0000\u0000ph\u0001\u0000\u0000\u0000pq\u0001\u0000"+
		"\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0005\'\u0000\u0000sw\u0005\u001c"+
		"\u0000\u0000tv\u0003\u0002\u0001\u0000ut\u0001\u0000\u0000\u0000vy\u0001"+
		"\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000"+
		"xz\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z{\u0005\u001d\u0000"+
		"\u0000{\u0007\u0001\u0000\u0000\u0000|\u0081\u0003\u0006\u0003\u0000}"+
		"~\u0005\t\u0000\u0000~\u0080\u0003\u0006\u0003\u0000\u007f}\u0001\u0000"+
		"\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u008d\u0001\u0000"+
		"\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0085\u0005\t\u0000"+
		"\u0000\u0085\u0089\u0005\u001c\u0000\u0000\u0086\u0088\u0003\u0002\u0001"+
		"\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000"+
		"\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000"+
		"\u0000\u008a\u008c\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000"+
		"\u0000\u008c\u008e\u0005\u001d\u0000\u0000\u008d\u0084\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\t\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0005\u000e\u0000\u0000\u0090\u0091\u0003\u0002\u0001\u0000"+
		"\u0091\u0092\u0005\u000b\u0000\u0000\u0092\u0093\u0005&\u0000\u0000\u0093"+
		"\u0094\u0003,\u0016\u0000\u0094\u0095\u0005\'\u0000\u0000\u0095\u00c1"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u000b\u0000\u0000\u0097\u0098"+
		"\u0005&\u0000\u0000\u0098\u0099\u0003,\u0016\u0000\u0099\u00a3\u0005\'"+
		"\u0000\u0000\u009a\u009e\u0007\u0001\u0000\u0000\u009b\u009d\u0003\u0002"+
		"\u0001\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u00a0\u0001\u0000"+
		"\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000"+
		"\u0000\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a4\u0007\u0002\u0000\u0000\u00a2\u00a4\u0003\u0002"+
		"\u0001\u0000\u00a3\u009a\u0001\u0000\u0000\u0000\u00a3\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a4\u00c1\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\n\u0000"+
		"\u0000\u00a6\u00a9\u0005&\u0000\u0000\u00a7\u00aa\u0003,\u0016\u0000\u00a8"+
		"\u00aa\u0003\u0012\t\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ad\u0005\"\u0000\u0000\u00ac\u00ae\u0003"+
		",\u0016\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000"+
		"\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b1\u0005\"\u0000"+
		"\u0000\u00b0\u00b2\u0003,\u0016\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b4\u0005\'\u0000\u0000\u00b4\u00c1\u0003\u0002\u0001\u0000\u00b5"+
		"\u00b6\u0005\n\u0000\u0000\u00b6\u00b9\u0005&\u0000\u0000\u00b7\u00ba"+
		"\u0003,\u0016\u0000\u00b8\u00ba\u0003\u0012\t\u0000\u00b9\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bc\u0005\u000f\u0000\u0000\u00bc\u00bd\u0003"+
		",\u0016\u0000\u00bd\u00be\u0005\'\u0000\u0000\u00be\u00bf\u0003\u0002"+
		"\u0001\u0000\u00bf\u00c1\u0001\u0000\u0000\u0000\u00c0\u008f\u0001\u0000"+
		"\u0000\u0000\u00c0\u0096\u0001\u0000\u0000\u0000\u00c0\u00a5\u0001\u0000"+
		"\u0000\u0000\u00c0\u00b5\u0001\u0000\u0000\u0000\u00c1\u000b\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c3\u0005\u0006\u0000\u0000\u00c3\u00c4\u0005\u0015"+
		"\u0000\u0000\u00c4\u00cd\u0005&\u0000\u0000\u00c5\u00ca\u0005\u0015\u0000"+
		"\u0000\u00c6\u00c7\u0005!\u0000\u0000\u00c7\u00c9\u0005\u0015\u0000\u0000"+
		"\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000\u0000\u0000"+
		"\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cb\u00ce\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000"+
		"\u00cd\u00c5\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005\'\u0000\u0000\u00d0"+
		"\u00d1\u0003\u000e\u0007\u0000\u00d1\r\u0001\u0000\u0000\u0000\u00d2\u00d4"+
		"\u0003(\u0014\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d9\u0005"+
		"\u001c\u0000\u0000\u00d6\u00d8\u0003\u0002\u0001\u0000\u00d7\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00dc\u0001"+
		"\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc\u00f2\u0005"+
		"\u001d\u0000\u0000\u00dd\u00e6\u0005&\u0000\u0000\u00de\u00e3\u0005\u0015"+
		"\u0000\u0000\u00df\u00e0\u0005!\u0000\u0000\u00e0\u00e2\u0005\u0015\u0000"+
		"\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e2\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e6\u00de\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00eb\u0005\'\u0000\u0000"+
		"\u00e9\u00eb\u0005\u0015\u0000\u0000\u00ea\u00dd\u0001\u0000\u0000\u0000"+
		"\u00ea\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ed\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ee\u0003(\u0014\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f0\u0005\f\u0000\u0000\u00f0\u00f2\u0003,\u0016\u0000\u00f1\u00d3"+
		"\u0001\u0000\u0000\u0000\u00f1\u00ea\u0001\u0000\u0000\u0000\u00f2\u000f"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005\u0015\u0000\u0000\u00f4\u00fd"+
		"\u0005&\u0000\u0000\u00f5\u00fa\u0003,\u0016\u0000\u00f6\u00f7\u0005!"+
		"\u0000\u0000\u00f7\u00f9\u0003,\u0016\u0000\u00f8\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fc\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fe\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fd\u00f5\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\u0005\'\u0000\u0000\u0100\u0011\u0001\u0000\u0000\u0000"+
		"\u0101\u0102\u0007\u0003\u0000\u0000\u0102\u0103\u0003\u0014\n\u0000\u0103"+
		"\u0013\u0001\u0000\u0000\u0000\u0104\u0106\u0005\u0015\u0000\u0000\u0105"+
		"\u0107\u0003(\u0014\u0000\u0106\u0105\u0001\u0000\u0000\u0000\u0106\u0107"+
		"\u0001\u0000\u0000\u0000\u0107\u010a\u0001\u0000\u0000\u0000\u0108\u0109"+
		"\u0005\u0018\u0000\u0000\u0109\u010b\u0003,\u0016\u0000\u010a\u0108\u0001"+
		"\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u0015\u0001"+
		"\u0000\u0000\u0000\u010c\u010f\u0005\u0001\u0000\u0000\u010d\u0110\u0003"+
		"\u0018\f\u0000\u010e\u0110\u0003\u001a\r\u0000\u010f\u010d\u0001\u0000"+
		"\u0000\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000"+
		"\u0000\u0000\u0111\u0112\u0005\r\u0000\u0000\u0112\u0113\u0005\u0017\u0000"+
		"\u0000\u0113\u0017\u0001\u0000\u0000\u0000\u0114\u0115\u0005\u0015\u0000"+
		"\u0000\u0115\u0019\u0001\u0000\u0000\u0000\u0116\u0117\u0007\u0001\u0000"+
		"\u0000\u0117\u011c\u0003\u001c\u000e\u0000\u0118\u0119\u0005!\u0000\u0000"+
		"\u0119\u011b\u0003\u001c\u000e\u0000\u011a\u0118\u0001\u0000\u0000\u0000"+
		"\u011b\u011e\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000"+
		"\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011f\u0001\u0000\u0000\u0000"+
		"\u011e\u011c\u0001\u0000\u0000\u0000\u011f\u0120\u0007\u0002\u0000\u0000"+
		"\u0120\u001b\u0001\u0000\u0000\u0000\u0121\u0124\u0005\u0015\u0000\u0000"+
		"\u0122\u0123\u0005\u0014\u0000\u0000\u0123\u0125\u0005\u0015\u0000\u0000"+
		"\u0124\u0122\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000"+
		"\u0125\u001d\u0001\u0000\u0000\u0000\u0126\u012a\u0005\u0010\u0000\u0000"+
		"\u0127\u012b\u0003 \u0010\u0000\u0128\u012b\u0003,\u0016\u0000\u0129\u012b"+
		"\u0003\u000e\u0007\u0000\u012a\u0127\u0001\u0000\u0000\u0000\u012a\u0128"+
		"\u0001\u0000\u0000\u0000\u012a\u0129\u0001\u0000\u0000\u0000\u012b\u001f"+
		"\u0001\u0000\u0000\u0000\u012c\u012d\u0005\u0002\u0000\u0000\u012d\u012e"+
		"\u0005\u0015\u0000\u0000\u012e\u012f\u0003\"\u0011\u0000\u012f!\u0001"+
		"\u0000\u0000\u0000\u0130\u0134\u0005\u001c\u0000\u0000\u0131\u0133\u0003"+
		"$\u0012\u0000\u0132\u0131\u0001\u0000\u0000\u0000\u0133\u0136\u0001\u0000"+
		"\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000"+
		"\u0000\u0000\u0135\u0137\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000"+
		"\u0000\u0000\u0137\u0138\u0005\u001d\u0000\u0000\u0138#\u0001\u0000\u0000"+
		"\u0000\u0139\u013c\u0003\u0012\t\u0000\u013a\u013c\u0003\f\u0006\u0000"+
		"\u013b\u0139\u0001\u0000\u0000\u0000\u013b\u013a\u0001\u0000\u0000\u0000"+
		"\u013c%\u0001\u0000\u0000\u0000\u013d\u013e\u0005\u0012\u0000\u0000\u013e"+
		"\u013f\u0005&\u0000\u0000\u013f\u0144\u0005\u001c\u0000\u0000\u0140\u0141"+
		"\u0005\u0011\u0000\u0000\u0141\u0142\u0005 \u0000\u0000\u0142\u0143\u0005"+
		"\u0017\u0000\u0000\u0143\u0145\u0005!\u0000\u0000\u0144\u0140\u0001\u0000"+
		"\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000"+
		"\u0000\u0000\u0146\u0147\u0005\u0013\u0000\u0000\u0147\u0148\u0005 \u0000"+
		"\u0000\u0148\u014f\u0003,\u0016\u0000\u0149\u014a\u0005!\u0000\u0000\u014a"+
		"\u014b\u0005\u0015\u0000\u0000\u014b\u014c\u0005 \u0000\u0000\u014c\u014e"+
		"\u0003,\u0016\u0000\u014d\u0149\u0001\u0000\u0000\u0000\u014e\u0151\u0001"+
		"\u0000\u0000\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u014f\u0150\u0001"+
		"\u0000\u0000\u0000\u0150\u0152\u0001\u0000\u0000\u0000\u0151\u014f\u0001"+
		"\u0000\u0000\u0000\u0152\u0153\u0005\u001d\u0000\u0000\u0153\u0154\u0005"+
		"\'\u0000\u0000\u0154\'\u0001\u0000\u0000\u0000\u0155\u0156\u0005 \u0000"+
		"\u0000\u0156\u0159\u0005\u0015\u0000\u0000\u0157\u0158\u0005\u001e\u0000"+
		"\u0000\u0158\u015a\u0005\u001f\u0000\u0000\u0159\u0157\u0001\u0000\u0000"+
		"\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a)\u0001\u0000\u0000\u0000"+
		"\u015b\u015c\u0005\u0014\u0000\u0000\u015c\u015f\u0005\u0015\u0000\u0000"+
		"\u015d\u015e\u0005\u001e\u0000\u0000\u015e\u0160\u0005\u001f\u0000\u0000"+
		"\u015f\u015d\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000"+
		"\u0160+\u0001\u0000\u0000\u0000\u0161\u0162\u0006\u0016\uffff\uffff\u0000"+
		"\u0162\u0164\u0003.\u0017\u0000\u0163\u0165\u0007\u0004\u0000\u0000\u0164"+
		"\u0163\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165"+
		"\u0167\u0001\u0000\u0000\u0000\u0166\u0168\u0003*\u0015\u0000\u0167\u0166"+
		"\u0001\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u016f"+
		"\u0001\u0000\u0000\u0000\u0169\u016a\n\u0002\u0000\u0000\u016a\u016b\u0003"+
		"0\u0018\u0000\u016b\u016c\u0003,\u0016\u0003\u016c\u016e\u0001\u0000\u0000"+
		"\u0000\u016d\u0169\u0001\u0000\u0000\u0000\u016e\u0171\u0001\u0000\u0000"+
		"\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000"+
		"\u0000\u0170-\u0001\u0000\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000"+
		"\u0172\u0189\u0005\u0016\u0000\u0000\u0173\u0189\u0005\u0017\u0000\u0000"+
		"\u0174\u0189\u0003\u0010\b\u0000\u0175\u0189\u0005\u0015\u0000\u0000\u0176"+
		"\u0177\u0005&\u0000\u0000\u0177\u0178\u0003,\u0016\u0000\u0178\u0179\u0005"+
		"\'\u0000\u0000\u0179\u0189\u0001\u0000\u0000\u0000\u017a\u0189\u0003:"+
		"\u001d\u0000\u017b\u0189\u0003>\u001f\u0000\u017c\u0189\u0003@ \u0000"+
		"\u017d\u0189\u0003\u000e\u0007\u0000\u017e\u0189\u00034\u001a\u0000\u017f"+
		"\u0189\u00036\u001b\u0000\u0180\u0184\u0007\u0005\u0000\u0000\u0181\u0183"+
		"\u0003J%\u0000\u0182\u0181\u0001\u0000\u0000\u0000\u0183\u0186\u0001\u0000"+
		"\u0000\u0000\u0184\u0182\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000"+
		"\u0000\u0000\u0185\u0187\u0001\u0000\u0000\u0000\u0186\u0184\u0001\u0000"+
		"\u0000\u0000\u0187\u0189\u0007\u0005\u0000\u0000\u0188\u0172\u0001\u0000"+
		"\u0000\u0000\u0188\u0173\u0001\u0000\u0000\u0000\u0188\u0174\u0001\u0000"+
		"\u0000\u0000\u0188\u0175\u0001\u0000\u0000\u0000\u0188\u0176\u0001\u0000"+
		"\u0000\u0000\u0188\u017a\u0001\u0000\u0000\u0000\u0188\u017b\u0001\u0000"+
		"\u0000\u0000\u0188\u017c\u0001\u0000\u0000\u0000\u0188\u017d\u0001\u0000"+
		"\u0000\u0000\u0188\u017e\u0001\u0000\u0000\u0000\u0188\u017f\u0001\u0000"+
		"\u0000\u0000\u0188\u0180\u0001\u0000\u0000\u0000\u0189/\u0001\u0000\u0000"+
		"\u0000\u018a\u0199\u0005\u0019\u0000\u0000\u018b\u0199\u0005\u001b\u0000"+
		"\u0000\u018c\u0199\u0005\u001a\u0000\u0000\u018d\u0199\u00050\u0000\u0000"+
		"\u018e\u0199\u00051\u0000\u0000\u018f\u0199\u0005/\u0000\u0000\u0190\u0192"+
		"\u0005)\u0000\u0000\u0191\u0193\u0007\u0006\u0000\u0000\u0192\u0191\u0001"+
		"\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u0193\u0199\u0001"+
		"\u0000\u0000\u0000\u0194\u0196\u0007\u0007\u0000\u0000\u0195\u0197\u0007"+
		"\u0006\u0000\u0000\u0196\u0195\u0001\u0000\u0000\u0000\u0196\u0197\u0001"+
		"\u0000\u0000\u0000\u0197\u0199\u0001\u0000\u0000\u0000\u0198\u018a\u0001"+
		"\u0000\u0000\u0000\u0198\u018b\u0001\u0000\u0000\u0000\u0198\u018c\u0001"+
		"\u0000\u0000\u0000\u0198\u018d\u0001\u0000\u0000\u0000\u0198\u018e\u0001"+
		"\u0000\u0000\u0000\u0198\u018f\u0001\u0000\u0000\u0000\u0198\u0190\u0001"+
		"\u0000\u0000\u0000\u0198\u0194\u0001\u0000\u0000\u0000\u01991\u0001\u0000"+
		"\u0000\u0000\u019a\u019b\u0005#\u0000\u0000\u019b\u01a4\u0003,\u0016\u0000"+
		"\u019c\u01a4\u00038\u001c\u0000\u019d\u019e\u0005/\u0000\u0000\u019e\u01a4"+
		"\u0003,\u0016\u0000\u019f\u01a0\u00050\u0000\u0000\u01a0\u01a4\u0003,"+
		"\u0016\u0000\u01a1\u01a2\u00051\u0000\u0000\u01a2\u01a4\u0003,\u0016\u0000"+
		"\u01a3\u019a\u0001\u0000\u0000\u0000\u01a3\u019c\u0001\u0000\u0000\u0000"+
		"\u01a3\u019d\u0001\u0000\u0000\u0000\u01a3\u019f\u0001\u0000\u0000\u0000"+
		"\u01a3\u01a1\u0001\u0000\u0000\u0000\u01a43\u0001\u0000\u0000\u0000\u01a5"+
		"\u01a6\u0005\u0015\u0000\u0000\u01a6\u01aa\u0005+\u0000\u0000\u01a7\u01a8"+
		"\u0005+\u0000\u0000\u01a8\u01aa\u0005\u0015\u0000\u0000\u01a9\u01a5\u0001"+
		"\u0000\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000\u01aa5\u0001\u0000"+
		"\u0000\u0000\u01ab\u01ac\u0005\u0015\u0000\u0000\u01ac\u01b0\u0005,\u0000"+
		"\u0000\u01ad\u01ae\u0005,\u0000\u0000\u01ae\u01b0\u0005\u0015\u0000\u0000"+
		"\u01af\u01ab\u0001\u0000\u0000\u0000\u01af\u01ad\u0001\u0000\u0000\u0000"+
		"\u01b07\u0001\u0000\u0000\u0000\u01b1\u01bd\u0005\u001b\u0000\u0000\u01b2"+
		"\u01bd\u0005\u0019\u0000\u0000\u01b3\u01bd\u0005\u001a\u0000\u0000\u01b4"+
		"\u01b6\u0005)\u0000\u0000\u01b5\u01b7\u0007\u0006\u0000\u0000\u01b6\u01b5"+
		"\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7\u01bd"+
		"\u0001\u0000\u0000\u0000\u01b8\u01ba\u0007\u0007\u0000\u0000\u01b9\u01bb"+
		"\u0007\u0006\u0000\u0000\u01ba\u01b9\u0001\u0000\u0000\u0000\u01ba\u01bb"+
		"\u0001\u0000\u0000\u0000\u01bb\u01bd\u0001\u0000\u0000\u0000\u01bc\u01b1"+
		"\u0001\u0000\u0000\u0000\u01bc\u01b2\u0001\u0000\u0000\u0000\u01bc\u01b3"+
		"\u0001\u0000\u0000\u0000\u01bc\u01b4\u0001\u0000\u0000\u0000\u01bc\u01b8"+
		"\u0001\u0000\u0000\u0000\u01bd\u01be\u0001\u0000\u0000\u0000\u01be\u01bf"+
		"\u0003.\u0017\u0000\u01bf9\u0001\u0000\u0000\u0000\u01c0\u01c9\u0005\u001c"+
		"\u0000\u0000\u01c1\u01c6\u0003<\u001e\u0000\u01c2\u01c3\u0005!\u0000\u0000"+
		"\u01c3\u01c5\u0003<\u001e\u0000\u01c4\u01c2\u0001\u0000\u0000\u0000\u01c5"+
		"\u01c8\u0001\u0000\u0000\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c6"+
		"\u01c7\u0001\u0000\u0000\u0000\u01c7\u01ca\u0001\u0000\u0000\u0000\u01c8"+
		"\u01c6\u0001\u0000\u0000\u0000\u01c9\u01c1\u0001\u0000\u0000\u0000\u01c9"+
		"\u01ca\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cb"+
		"\u01cc\u0005\u001d\u0000\u0000\u01cc;\u0001\u0000\u0000\u0000\u01cd\u01ce"+
		"\u0005\u0015\u0000\u0000\u01ce\u01cf\u0005 \u0000\u0000\u01cf\u01d0\u0003"+
		",\u0016\u0000\u01d0=\u0001\u0000\u0000\u0000\u01d1\u01da\u0005\u001e\u0000"+
		"\u0000\u01d2\u01d7\u0003,\u0016\u0000\u01d3\u01d4\u0005!\u0000\u0000\u01d4"+
		"\u01d6\u0003,\u0016\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d6\u01d9"+
		"\u0001\u0000\u0000\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d7\u01d8"+
		"\u0001\u0000\u0000\u0000\u01d8\u01db\u0001\u0000\u0000\u0000\u01d9\u01d7"+
		"\u0001\u0000\u0000\u0000\u01da\u01d2\u0001\u0000\u0000\u0000\u01da\u01db"+
		"\u0001\u0000\u0000\u0000\u01db\u01dc\u0001\u0000\u0000\u0000\u01dc\u01dd"+
		"\u0005\u001f\u0000\u0000\u01dd?\u0001\u0000\u0000\u0000\u01de\u01df\u0005"+
		"\u0015\u0000\u0000\u01df\u01e0\u0005\u001e\u0000\u0000\u01e0\u01e1\u0003"+
		",\u0016\u0000\u01e1\u01e2\u0005\u001f\u0000\u0000\u01e2A\u0001\u0000\u0000"+
		"\u0000\u01e3\u01e4\u0005\u0015\u0000\u0000\u01e4\u01e5\u0005\u0018\u0000"+
		"\u0000\u01e5\u01e6\u0005\u0017\u0000\u0000\u01e6C\u0001\u0000\u0000\u0000"+
		"\u01e7\u01e8\u0007\u0007\u0000\u0000\u01e8\u01ec\u0005\u0015\u0000\u0000"+
		"\u01e9\u01eb\u0003B!\u0000\u01ea\u01e9\u0001\u0000\u0000\u0000\u01eb\u01ee"+
		"\u0001\u0000\u0000\u0000\u01ec\u01ea\u0001\u0000\u0000\u0000\u01ec\u01ed"+
		"\u0001\u0000\u0000\u0000\u01ed\u01ef\u0001\u0000\u0000\u0000\u01ee\u01ec"+
		"\u0001\u0000\u0000\u0000\u01ef\u01f0\u0005)\u0000\u0000\u01f0E\u0001\u0000"+
		"\u0000\u0000\u01f1\u01f2\u0007\u0007\u0000\u0000\u01f2\u01f3\u0005*\u0000"+
		"\u0000\u01f3\u01f4\u0005\u0015\u0000\u0000\u01f4\u01f5\u0005)\u0000\u0000"+
		"\u01f5G\u0001\u0000\u0000\u0000\u01f6\u01f7\u0007\u0007\u0000\u0000\u01f7"+
		"\u01fb\u0005\u0015\u0000\u0000\u01f8\u01fa\u0003B!\u0000\u01f9\u01f8\u0001"+
		"\u0000\u0000\u0000\u01fa\u01fd\u0001\u0000\u0000\u0000\u01fb\u01f9\u0001"+
		"\u0000\u0000\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000\u01fc\u01fe\u0001"+
		"\u0000\u0000\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fe\u01ff\u0005"+
		"*\u0000\u0000\u01ff\u0200\u0005)\u0000\u0000\u0200I\u0001\u0000\u0000"+
		"\u0000\u0201\u0205\u0003D\"\u0000\u0202\u0204\u0003J%\u0000\u0203\u0202"+
		"\u0001\u0000\u0000\u0000\u0204\u0207\u0001\u0000\u0000\u0000\u0205\u0203"+
		"\u0001\u0000\u0000\u0000\u0205\u0206\u0001\u0000\u0000\u0000\u0206\u0208"+
		"\u0001\u0000\u0000\u0000\u0207\u0205\u0001\u0000\u0000\u0000\u0208\u0209"+
		"\u0003F#\u0000\u0209\u0219\u0001\u0000\u0000\u0000\u020a\u0219\u0003H"+
		"$\u0000\u020b\u020f\u00054\u0000\u0000\u020c\u020e\u0003\u0002\u0001\u0000"+
		"\u020d\u020c\u0001\u0000\u0000\u0000\u020e\u0211\u0001\u0000\u0000\u0000"+
		"\u020f\u020d\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000\u0000\u0000"+
		"\u0210\u0215\u0001\u0000\u0000\u0000\u0211\u020f\u0001\u0000\u0000\u0000"+
		"\u0212\u0216\u00055\u0000\u0000\u0213\u0214\u0005\u001d\u0000\u0000\u0214"+
		"\u0216\u0005\u001d\u0000\u0000\u0215\u0212\u0001\u0000\u0000\u0000\u0215"+
		"\u0213\u0001\u0000\u0000\u0000\u0216\u0219\u0001\u0000\u0000\u0000\u0217"+
		"\u0219\u00057\u0000\u0000\u0218\u0201\u0001\u0000\u0000\u0000\u0218\u020a"+
		"\u0001\u0000\u0000\u0000\u0218\u020b\u0001\u0000\u0000\u0000\u0218\u0217"+
		"\u0001\u0000\u0000\u0000\u0219K\u0001\u0000\u0000\u0000?O^ampw\u0081\u0089"+
		"\u008d\u009e\u00a3\u00a9\u00ad\u00b1\u00b9\u00c0\u00ca\u00cd\u00d3\u00d9"+
		"\u00e3\u00e6\u00ea\u00ed\u00f1\u00fa\u00fd\u0106\u010a\u010f\u011c\u0124"+
		"\u012a\u0134\u013b\u0144\u014f\u0159\u015f\u0164\u0167\u016f\u0184\u0188"+
		"\u0192\u0196\u0198\u01a3\u01a9\u01af\u01b6\u01ba\u01bc\u01c6\u01c9\u01d7"+
		"\u01da\u01ec\u01fb\u0205\u020f\u0215\u0218";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}