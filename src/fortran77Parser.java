// Generated from fortran77.g by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class fortran77Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, LT=24, LE=25, 
		GT=26, GE=27, EQ=28, NE=29, ABS=30, SQRT=31, SIN=32, COS=33, TAN=34, ATAN=35, 
		EXP=36, LOG=37, LOG10=38, MIN=39, MAX=40, STAR=41, COMMA=42, ASSIGN=43, 
		LPAREN=44, RPAREN=45, EOS=46, NAME=47, WS=48, WHITE=49, ALPHA=50, NUM=51, 
		ALNUM=52, HEX=53, SIGN=54, COMMENT=55, NOTNL=56, INTVAL=57, FDESC=58, 
		EXPON=59;
	public static final int
		RULE_program = 0, RULE_executableUnit = 1, RULE_mainProgram = 2, RULE_programStatement = 3, 
		RULE_subprogramBody = 4, RULE_wholeStatement = 5, RULE_statement = 6, 
		RULE_executableStatement = 7, RULE_doWyrazenie = 8, RULE_doSlowo = 9, 
		RULE_endDoSlowo = 10, RULE_ifstatment = 11, RULE_elseSlowo = 12, RULE_endIfSlowo = 13, 
		RULE_ifSlowo = 14, RULE_thenSlowo = 15, RULE_assignmentStatement = 16, 
		RULE_wyrazenie = 17, RULE_wyrazenieMatematyczne = 18, RULE_operacja = 19, 
		RULE_addExpr = 20, RULE_multExpr = 21, RULE_expExpr = 22, RULE_funkcjaMatematyczna = 23, 
		RULE_nazwaFunkcjiMatematycznej = 24, RULE_typeStatement = 25, RULE_typeStatementNameList = 26, 
		RULE_typeStatementName = 27, RULE_arrayDeclarator = 28, RULE_arrayDeclaratorExtents = 29, 
		RULE_arrayDeclaratorExtent = 30, RULE_typename = 31, RULE_seos = 32, RULE_endStatement = 33;
	public static final String[] ruleNames = {
		"program", "executableUnit", "mainProgram", "programStatement", "subprogramBody", 
		"wholeStatement", "statement", "executableStatement", "doWyrazenie", "doSlowo", 
		"endDoSlowo", "ifstatment", "elseSlowo", "endIfSlowo", "ifSlowo", "thenSlowo", 
		"assignmentStatement", "wyrazenie", "wyrazenieMatematyczne", "operacja", 
		"addExpr", "multExpr", "expExpr", "funkcjaMatematyczna", "nazwaFunkcjiMatematycznej", 
		"typeStatement", "typeStatementNameList", "typeStatementName", "arrayDeclarator", 
		"arrayDeclaratorExtents", "arrayDeclaratorExtent", "typename", "seos", 
		"endStatement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'program'", "'DO'", "'do'", "'end do'", "'END DO'", "'else'", "'ELSE'", 
		"'end if'", "'END IF'", "'if'", "'IF'", "'then'", "'THEN'", "'+'", "'-'", 
		"'/'", "'real'", "'double'", "'complex'", "'precision'", "'integer'", 
		"'logical'", "'end'", null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "'*'", "','", "'='", 
		"'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"LT", "LE", "GT", "GE", "EQ", "NE", "ABS", "SQRT", "SIN", "COS", "TAN", 
		"ATAN", "EXP", "LOG", "LOG10", "MIN", "MAX", "STAR", "COMMA", "ASSIGN", 
		"LPAREN", "RPAREN", "EOS", "NAME", "WS", "WHITE", "ALPHA", "NUM", "ALNUM", 
		"HEX", "SIGN", "COMMENT", "NOTNL", "INTVAL", "FDESC", "EXPON"
	};
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
	public String getGrammarFileName() { return "fortran77.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public fortran77Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<ExecutableUnitContext> executableUnit() {
			return getRuleContexts(ExecutableUnitContext.class);
		}
		public ExecutableUnitContext executableUnit(int i) {
			return getRuleContext(ExecutableUnitContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fortran77Visitor ) return ((fortran77Visitor<? extends T>)visitor).visitProgram(this);
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
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68);
				executableUnit();
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
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

	public static class ExecutableUnitContext extends ParserRuleContext {
		public MainProgramContext mainProgram() {
			return getRuleContext(MainProgramContext.class,0);
		}
		public ExecutableUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_executableUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).enterExecutableUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).exitExecutableUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fortran77Visitor ) return ((fortran77Visitor<? extends T>)visitor).visitExecutableUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecutableUnitContext executableUnit() throws RecognitionException {
		ExecutableUnitContext _localctx = new ExecutableUnitContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_executableUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			mainProgram();
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

	public static class MainProgramContext extends ParserRuleContext {
		public ProgramStatementContext programStatement() {
			return getRuleContext(ProgramStatementContext.class,0);
		}
		public SubprogramBodyContext subprogramBody() {
			return getRuleContext(SubprogramBodyContext.class,0);
		}
		public MainProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainProgram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).enterMainProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).exitMainProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fortran77Visitor ) return ((fortran77Visitor<? extends T>)visitor).visitMainProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainProgramContext mainProgram() throws RecognitionException {
		MainProgramContext _localctx = new MainProgramContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainProgram);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			programStatement();
			setState(76);
			subprogramBody();
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

	public static class ProgramStatementContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(fortran77Parser.NAME, 0); }
		public SeosContext seos() {
			return getRuleContext(SeosContext.class,0);
		}
		public ProgramStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).enterProgramStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).exitProgramStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fortran77Visitor ) return ((fortran77Visitor<? extends T>)visitor).visitProgramStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramStatementContext programStatement() throws RecognitionException {
		ProgramStatementContext _localctx = new ProgramStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_programStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__0);
			setState(79);
			match(NAME);
			setState(80);
			seos();
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

	public static class SubprogramBodyContext extends ParserRuleContext {
		public EndStatementContext endStatement() {
			return getRuleContext(EndStatementContext.class,0);
		}
		public List<WholeStatementContext> wholeStatement() {
			return getRuleContexts(WholeStatementContext.class);
		}
		public WholeStatementContext wholeStatement(int i) {
			return getRuleContext(WholeStatementContext.class,i);
		}
		public SubprogramBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogramBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).enterSubprogramBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).exitSubprogramBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fortran77Visitor ) return ((fortran77Visitor<? extends T>)visitor).visitSubprogramBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubprogramBodyContext subprogramBody() throws RecognitionException {
		SubprogramBodyContext _localctx = new SubprogramBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_subprogramBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__16) | (1L << T__17) | (1L << T__20) | (1L << T__21) | (1L << NAME))) != 0)) {
				{
				{
				setState(82);
				wholeStatement();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			endStatement();
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

	public static class WholeStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SeosContext seos() {
			return getRuleContext(SeosContext.class,0);
		}
		public WholeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wholeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).enterWholeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).exitWholeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fortran77Visitor ) return ((fortran77Visitor<? extends T>)visitor).visitWholeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WholeStatementContext wholeStatement() throws RecognitionException {
		WholeStatementContext _localctx = new WholeStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_wholeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			statement();
			setState(91);
			seos();
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

	public static class StatementContext extends ParserRuleContext {
		public TypeStatementContext typeStatement() {
			return getRuleContext(TypeStatementContext.class,0);
		}
		public ExecutableStatementContext executableStatement() {
			return getRuleContext(ExecutableStatementContext.class,0);
		}
		public IfstatmentContext ifstatment() {
			return getRuleContext(IfstatmentContext.class,0);
		}
		public ElseSlowoContext elseSlowo() {
			return getRuleContext(ElseSlowoContext.class,0);
		}
		public EndIfSlowoContext endIfSlowo() {
			return getRuleContext(EndIfSlowoContext.class,0);
		}
		public DoWyrazenieContext doWyrazenie() {
			return getRuleContext(DoWyrazenieContext.class,0);
		}
		public EndDoSlowoContext endDoSlowo() {
			return getRuleContext(EndDoSlowoContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fortran77Visitor ) return ((fortran77Visitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				typeStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				executableStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				ifstatment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				elseSlowo();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(97);
				endIfSlowo();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(98);
				doWyrazenie();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(99);
				endDoSlowo();
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

	public static class ExecutableStatementContext extends ParserRuleContext {
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public ExecutableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_executableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).enterExecutableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).exitExecutableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fortran77Visitor ) return ((fortran77Visitor<? extends T>)visitor).visitExecutableStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecutableStatementContext executableStatement() throws RecognitionException {
		ExecutableStatementContext _localctx = new ExecutableStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_executableStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			assignmentStatement();
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

	public static class DoWyrazenieContext extends ParserRuleContext {
		public DoSlowoContext doSlowo() {
			return getRuleContext(DoSlowoContext.class,0);
		}
		public TypeStatementNameContext typeStatementName() {
			return getRuleContext(TypeStatementNameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(fortran77Parser.ASSIGN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(fortran77Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fortran77Parser.COMMA, i);
		}
		public List<TerminalNode> NUM() { return getTokens(fortran77Parser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(fortran77Parser.NUM, i);
		}
		public List<TerminalNode> NAME() { return getTokens(fortran77Parser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(fortran77Parser.NAME, i);
		}
		public DoWyrazenieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWyrazenie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).enterDoWyrazenie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).exitDoWyrazenie(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fortran77Visitor ) return ((fortran77Visitor<? extends T>)visitor).visitDoWyrazenie(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWyrazenieContext doWyrazenie() throws RecognitionException {
		DoWyrazenieContext _localctx = new DoWyrazenieContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_doWyrazenie);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			doSlowo();
			setState(105);
			typeStatementName();
			setState(106);
			match(ASSIGN);
			setState(107);
			_la = _input.LA(1);
			if ( !(_la==NAME || _la==NUM) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(108);
			match(COMMA);
			setState(109);
			_la = _input.LA(1);
			if ( !(_la==NAME || _la==NUM) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(110);
			match(COMMA);
			setState(111);
			match(NUM);
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

	public static class DoSlowoContext extends ParserRuleContext {
		public DoSlowoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doSlowo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).enterDoSlowo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).exitDoSlowo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fortran77Visitor ) return ((fortran77Visitor<? extends T>)visitor).visitDoSlowo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoSlowoContext doSlowo() throws RecognitionException {
		DoSlowoContext _localctx = new DoSlowoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_doSlowo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class EndDoSlowoContext extends ParserRuleContext {
		public EndDoSlowoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endDoSlowo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).enterEndDoSlowo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).exitEndDoSlowo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fortran77Visitor ) return ((fortran77Visitor<? extends T>)visitor).visitEndDoSlowo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndDoSlowoContext endDoSlowo() throws RecognitionException {
		EndDoSlowoContext _localctx = new EndDoSlowoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_endDoSlowo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__4) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class IfstatmentContext extends ParserRuleContext {
		public IfSlowoContext ifSlowo() {
			return getRuleContext(IfSlowoContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(fortran77Parser.LPAREN, 0); }
		public OperacjaContext operacja() {
			return getRuleContext(OperacjaContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(fortran77Parser.RPAREN, 0); }
		public ThenSlowoContext thenSlowo() {
			return getRuleContext(ThenSlowoContext.class,0);
		}
		public IfstatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).enterIfstatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).exitIfstatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fortran77Visitor ) return ((fortran77Visitor<? extends T>)visitor).visitIfstatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstatmentContext ifstatment() throws RecognitionException {
		IfstatmentContext _localctx = new IfstatmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifstatment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			ifSlowo();
			setState(118);
			match(LPAREN);
			setState(119);
			operacja();
			setState(120);
			match(RPAREN);
			setState(121);
			thenSlowo();
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

	public static class ElseSlowoContext extends ParserRuleContext {
		public ElseSlowoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseSlowo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).enterElseSlowo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).exitElseSlowo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fortran77Visitor ) return ((fortran77Visitor<? extends T>)visitor).visitElseSlowo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseSlowoContext elseSlowo() throws RecognitionException {
		ElseSlowoContext _localctx = new ElseSlowoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_elseSlowo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__6) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class EndIfSlowoContext extends ParserRuleContext {
		public EndIfSlowoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endIfSlowo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).enterEndIfSlowo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).exitEndIfSlowo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fortran77Visitor ) return ((fortran77Visitor<? extends T>)visitor).visitEndIfSlowo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndIfSlowoContext endIfSlowo() throws RecognitionException {
		EndIfSlowoContext _localctx = new EndIfSlowoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_endIfSlowo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__8) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class IfSlowoContext extends ParserRuleContext {
		public IfSlowoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifSlowo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).enterIfSlowo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).exitIfSlowo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fortran77Visitor ) return ((fortran77Visitor<? extends T>)visitor).visitIfSlowo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfSlowoContext ifSlowo() throws RecognitionException {
		IfSlowoContext _localctx = new IfSlowoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifSlowo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==T__10) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ThenSlowoContext extends ParserRuleContext {
		public ThenSlowoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thenSlowo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).enterThenSlowo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).exitThenSlowo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fortran77Visitor ) return ((fortran77Visitor<? extends T>)visitor).visitThenSlowo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThenSlowoContext thenSlowo() throws RecognitionException {
		ThenSlowoContext _localctx = new ThenSlowoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_thenSlowo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==T__12) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public TypeStatementNameContext typeStatementName() {
			return getRuleContext(TypeStatementNameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(fortran77Parser.ASSIGN, 0); }
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fortran77Visitor ) return ((fortran77Visitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			typeStatementName();
			setState(132);
			match(ASSIGN);
			setState(133);
			wyrazenie();
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

	public static class WyrazenieContext extends ParserRuleContext {
		public WyrazenieMatematyczneContext wyrazenieMatematyczne() {
			return getRuleContext(WyrazenieMatematyczneContext.class,0);
		}
		public WyrazenieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wyrazenie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).enterWyrazenie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).exitWyrazenie(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fortran77Visitor ) return ((fortran77Visitor<? extends T>)visitor).visitWyrazenie(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WyrazenieContext wyrazenie() throws RecognitionException {
		WyrazenieContext _localctx = new WyrazenieContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_wyrazenie);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			wyrazenieMatematyczne();
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

	public static class WyrazenieMatematyczneContext extends ParserRuleContext {
		public FunkcjaMatematycznaContext funkcjaMatematyczna() {
			return getRuleContext(FunkcjaMatematycznaContext.class,0);
		}
		public OperacjaContext operacja() {
			return getRuleContext(OperacjaContext.class,0);
		}
		public WyrazenieMatematyczneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wyrazenieMatematyczne; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).enterWyrazenieMatematyczne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).exitWyrazenieMatematyczne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fortran77Visitor ) return ((fortran77Visitor<? extends T>)visitor).visitWyrazenieMatematyczne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WyrazenieMatematyczneContext wyrazenieMatematyczne() throws RecognitionException {
		WyrazenieMatematyczneContext _localctx = new WyrazenieMatematyczneContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_wyrazenieMatematyczne);
		try {
			setState(139);
			switch (_input.LA(1)) {
			case ABS:
			case SQRT:
			case SIN:
			case COS:
			case TAN:
			case ATAN:
			case EXP:
			case LOG:
			case LOG10:
			case MIN:
			case MAX:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				funkcjaMatematyczna();
				}
				break;
			case NAME:
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				operacja();
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

	public static class OperacjaContext extends ParserRuleContext {
		public Token op;
		public List<AddExprContext> addExpr() {
			return getRuleContexts(AddExprContext.class);
		}
		public AddExprContext addExpr(int i) {
			return getRuleContext(AddExprContext.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(fortran77Parser.LT); }
		public TerminalNode LT(int i) {
			return getToken(fortran77Parser.LT, i);
		}
		public List<TerminalNode> LE() { return getTokens(fortran77Parser.LE); }
		public TerminalNode LE(int i) {
			return getToken(fortran77Parser.LE, i);
		}
		public List<TerminalNode> GT() { return getTokens(fortran77Parser.GT); }
		public TerminalNode GT(int i) {
			return getToken(fortran77Parser.GT, i);
		}
		public List<TerminalNode> GE() { return getTokens(fortran77Parser.GE); }
		public TerminalNode GE(int i) {
			return getToken(fortran77Parser.GE, i);
		}
		public List<TerminalNode> EQ() { return getTokens(fortran77Parser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(fortran77Parser.EQ, i);
		}
		public List<TerminalNode> NE() { return getTokens(fortran77Parser.NE); }
		public TerminalNode NE(int i) {
			return getToken(fortran77Parser.NE, i);
		}
		public OperacjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).enterOperacja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).exitOperacja(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fortran77Visitor ) return ((fortran77Visitor<? extends T>)visitor).visitOperacja(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacjaContext operacja() throws RecognitionException {
		OperacjaContext _localctx = new OperacjaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_operacja);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			addExpr();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LE) | (1L << GT) | (1L << GE) | (1L << EQ) | (1L << NE))) != 0)) {
				{
				{
				setState(142);
				((OperacjaContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LE) | (1L << GT) | (1L << GE) | (1L << EQ) | (1L << NE))) != 0)) ) {
					((OperacjaContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(143);
				addExpr();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class AddExprContext extends ParserRuleContext {
		public Token op;
		public List<MultExprContext> multExpr() {
			return getRuleContexts(MultExprContext.class);
		}
		public MultExprContext multExpr(int i) {
			return getRuleContext(MultExprContext.class,i);
		}
		public AddExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).enterAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).exitAddExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fortran77Visitor ) return ((fortran77Visitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddExprContext addExpr() throws RecognitionException {
		AddExprContext _localctx = new AddExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_addExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			multExpr();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13 || _la==T__14) {
				{
				{
				setState(150);
				((AddExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__13 || _la==T__14) ) {
					((AddExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(151);
				multExpr();
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class MultExprContext extends ParserRuleContext {
		public Token op;
		public List<ExpExprContext> expExpr() {
			return getRuleContexts(ExpExprContext.class);
		}
		public ExpExprContext expExpr(int i) {
			return getRuleContext(ExpExprContext.class,i);
		}
		public MultExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).enterMultExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).exitMultExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fortran77Visitor ) return ((fortran77Visitor<? extends T>)visitor).visitMultExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultExprContext multExpr() throws RecognitionException {
		MultExprContext _localctx = new MultExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_multExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			expExpr();
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15 || _la==STAR) {
				{
				{
				setState(158);
				((MultExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__15 || _la==STAR) ) {
					((MultExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(159);
				expExpr();
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExpExprContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(fortran77Parser.NUM, 0); }
		public TerminalNode NAME() { return getToken(fortran77Parser.NAME, 0); }
		public ExpExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).enterExpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).exitExpExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fortran77Visitor ) return ((fortran77Visitor<? extends T>)visitor).visitExpExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpExprContext expExpr() throws RecognitionException {
		ExpExprContext _localctx = new ExpExprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_la = _input.LA(1);
			if ( !(_la==NAME || _la==NUM) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class FunkcjaMatematycznaContext extends ParserRuleContext {
		public NazwaFunkcjiMatematycznejContext nazwaFunkcjiMatematycznej() {
			return getRuleContext(NazwaFunkcjiMatematycznejContext.class,0);
		}
		public FunkcjaMatematycznaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funkcjaMatematyczna; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).enterFunkcjaMatematyczna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).exitFunkcjaMatematyczna(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fortran77Visitor ) return ((fortran77Visitor<? extends T>)visitor).visitFunkcjaMatematyczna(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunkcjaMatematycznaContext funkcjaMatematyczna() throws RecognitionException {
		FunkcjaMatematycznaContext _localctx = new FunkcjaMatematycznaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_funkcjaMatematyczna);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			nazwaFunkcjiMatematycznej();
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

	public static class NazwaFunkcjiMatematycznejContext extends ParserRuleContext {
		public TerminalNode ABS() { return getToken(fortran77Parser.ABS, 0); }
		public TerminalNode SQRT() { return getToken(fortran77Parser.SQRT, 0); }
		public TerminalNode SIN() { return getToken(fortran77Parser.SIN, 0); }
		public TerminalNode COS() { return getToken(fortran77Parser.COS, 0); }
		public TerminalNode TAN() { return getToken(fortran77Parser.TAN, 0); }
		public TerminalNode ATAN() { return getToken(fortran77Parser.ATAN, 0); }
		public TerminalNode EXP() { return getToken(fortran77Parser.EXP, 0); }
		public TerminalNode LOG() { return getToken(fortran77Parser.LOG, 0); }
		public TerminalNode LOG10() { return getToken(fortran77Parser.LOG10, 0); }
		public TerminalNode MIN() { return getToken(fortran77Parser.MIN, 0); }
		public TerminalNode MAX() { return getToken(fortran77Parser.MAX, 0); }
		public NazwaFunkcjiMatematycznejContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nazwaFunkcjiMatematycznej; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).enterNazwaFunkcjiMatematycznej(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).exitNazwaFunkcjiMatematycznej(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fortran77Visitor ) return ((fortran77Visitor<? extends T>)visitor).visitNazwaFunkcjiMatematycznej(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NazwaFunkcjiMatematycznejContext nazwaFunkcjiMatematycznej() throws RecognitionException {
		NazwaFunkcjiMatematycznejContext _localctx = new NazwaFunkcjiMatematycznejContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_nazwaFunkcjiMatematycznej);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABS) | (1L << SQRT) | (1L << SIN) | (1L << COS) | (1L << TAN) | (1L << ATAN) | (1L << EXP) | (1L << LOG) | (1L << LOG10) | (1L << MIN) | (1L << MAX))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class TypeStatementContext extends ParserRuleContext {
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public TypeStatementNameListContext typeStatementNameList() {
			return getRuleContext(TypeStatementNameListContext.class,0);
		}
		public TypeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).enterTypeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).exitTypeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fortran77Visitor ) return ((fortran77Visitor<? extends T>)visitor).visitTypeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeStatementContext typeStatement() throws RecognitionException {
		TypeStatementContext _localctx = new TypeStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_typeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			typename();
			setState(172);
			typeStatementNameList();
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

	public static class TypeStatementNameListContext extends ParserRuleContext {
		public List<TypeStatementNameContext> typeStatementName() {
			return getRuleContexts(TypeStatementNameContext.class);
		}
		public TypeStatementNameContext typeStatementName(int i) {
			return getRuleContext(TypeStatementNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(fortran77Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fortran77Parser.COMMA, i);
		}
		public TypeStatementNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeStatementNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).enterTypeStatementNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).exitTypeStatementNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fortran77Visitor ) return ((fortran77Visitor<? extends T>)visitor).visitTypeStatementNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeStatementNameListContext typeStatementNameList() throws RecognitionException {
		TypeStatementNameListContext _localctx = new TypeStatementNameListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_typeStatementNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			typeStatementName();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(175);
				match(COMMA);
				setState(176);
				typeStatementName();
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TypeStatementNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(fortran77Parser.NAME, 0); }
		public ArrayDeclaratorContext arrayDeclarator() {
			return getRuleContext(ArrayDeclaratorContext.class,0);
		}
		public TypeStatementNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeStatementName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).enterTypeStatementName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).exitTypeStatementName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fortran77Visitor ) return ((fortran77Visitor<? extends T>)visitor).visitTypeStatementName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeStatementNameContext typeStatementName() throws RecognitionException {
		TypeStatementNameContext _localctx = new TypeStatementNameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_typeStatementName);
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				arrayDeclarator();
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

	public static class ArrayDeclaratorContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(fortran77Parser.LPAREN, 0); }
		public ArrayDeclaratorExtentsContext arrayDeclaratorExtents() {
			return getRuleContext(ArrayDeclaratorExtentsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(fortran77Parser.RPAREN, 0); }
		public TerminalNode NAME() { return getToken(fortran77Parser.NAME, 0); }
		public ArrayDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).enterArrayDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).exitArrayDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fortran77Visitor ) return ((fortran77Visitor<? extends T>)visitor).visitArrayDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclaratorContext arrayDeclarator() throws RecognitionException {
		ArrayDeclaratorContext _localctx = new ArrayDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_arrayDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==NAME) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(187);
			match(LPAREN);
			setState(188);
			arrayDeclaratorExtents();
			setState(189);
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

	public static class ArrayDeclaratorExtentsContext extends ParserRuleContext {
		public List<ArrayDeclaratorExtentContext> arrayDeclaratorExtent() {
			return getRuleContexts(ArrayDeclaratorExtentContext.class);
		}
		public ArrayDeclaratorExtentContext arrayDeclaratorExtent(int i) {
			return getRuleContext(ArrayDeclaratorExtentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(fortran77Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fortran77Parser.COMMA, i);
		}
		public ArrayDeclaratorExtentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaratorExtents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).enterArrayDeclaratorExtents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).exitArrayDeclaratorExtents(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fortran77Visitor ) return ((fortran77Visitor<? extends T>)visitor).visitArrayDeclaratorExtents(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclaratorExtentsContext arrayDeclaratorExtents() throws RecognitionException {
		ArrayDeclaratorExtentsContext _localctx = new ArrayDeclaratorExtentsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_arrayDeclaratorExtents);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			arrayDeclaratorExtent();
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(192);
				match(COMMA);
				setState(193);
				arrayDeclaratorExtent();
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ArrayDeclaratorExtentContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(fortran77Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fortran77Parser.COMMA, i);
		}
		public List<TerminalNode> NUM() { return getTokens(fortran77Parser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(fortran77Parser.NUM, i);
		}
		public ArrayDeclaratorExtentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaratorExtent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).enterArrayDeclaratorExtent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).exitArrayDeclaratorExtent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fortran77Visitor ) return ((fortran77Visitor<? extends T>)visitor).visitArrayDeclaratorExtent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclaratorExtentContext arrayDeclaratorExtent() throws RecognitionException {
		ArrayDeclaratorExtentContext _localctx = new ArrayDeclaratorExtentContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_arrayDeclaratorExtent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(200); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(199);
						match(NUM);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(202); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(206); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUM );
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(208);
					match(COMMA);
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NUM) {
						{
						{
						setState(209);
						match(NUM);
						}
						}
						setState(214);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					} 
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class TypenameContext extends ParserRuleContext {
		public TypenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).enterTypename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).exitTypename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fortran77Visitor ) return ((fortran77Visitor<? extends T>)visitor).visitTypename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypenameContext typename() throws RecognitionException {
		TypenameContext _localctx = new TypenameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_typename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(220);
				match(T__16);
				}
				break;
			case 2:
				{
				setState(221);
				match(T__17);
				setState(222);
				match(T__18);
				}
				break;
			case 3:
				{
				setState(223);
				match(T__17);
				setState(224);
				match(T__19);
				}
				break;
			case 4:
				{
				setState(225);
				match(T__20);
				}
				break;
			case 5:
				{
				setState(226);
				match(T__21);
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

	public static class SeosContext extends ParserRuleContext {
		public TerminalNode EOS() { return getToken(fortran77Parser.EOS, 0); }
		public SeosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).enterSeos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).exitSeos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fortran77Visitor ) return ((fortran77Visitor<? extends T>)visitor).visitSeos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeosContext seos() throws RecognitionException {
		SeosContext _localctx = new SeosContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_seos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(EOS);
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

	public static class EndStatementContext extends ParserRuleContext {
		public SeosContext seos() {
			return getRuleContext(SeosContext.class,0);
		}
		public EndStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).enterEndStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fortran77Listener ) ((fortran77Listener)listener).exitEndStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fortran77Visitor ) return ((fortran77Visitor<? extends T>)visitor).visitEndStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndStatementContext endStatement() throws RecognitionException {
		EndStatementContext _localctx = new EndStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_endStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(T__22);
			setState(232);
			seos();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3=\u00ed\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\6\2H\n\2\r\2\16\2I\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\6\7\6V\n\6\f\6\16\6Y\13\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\bg\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\5\24\u008e\n\24\3\25"+
		"\3\25\3\25\7\25\u0093\n\25\f\25\16\25\u0096\13\25\3\26\3\26\3\26\7\26"+
		"\u009b\n\26\f\26\16\26\u009e\13\26\3\27\3\27\3\27\7\27\u00a3\n\27\f\27"+
		"\16\27\u00a6\13\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\7\34\u00b4\n\34\f\34\16\34\u00b7\13\34\3\35\3\35\5\35\u00bb\n"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\7\37\u00c5\n\37\f\37\16\37"+
		"\u00c8\13\37\3 \6 \u00cb\n \r \16 \u00cc\6 \u00cf\n \r \16 \u00d0\3 \3"+
		" \7 \u00d5\n \f \16 \u00d8\13 \7 \u00da\n \f \16 \u00dd\13 \3!\3!\3!\3"+
		"!\3!\3!\3!\5!\u00e6\n!\3\"\3\"\3#\3#\3#\3#\2\2$\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\16\4\2\61\61\65\65\3\2\4"+
		"\5\3\2\6\7\3\2\b\t\3\2\n\13\3\2\f\r\3\2\16\17\3\2\32\37\3\2\20\21\4\2"+
		"\22\22++\3\2 *\4\2\23\23\61\61\u00e1\2G\3\2\2\2\4K\3\2\2\2\6M\3\2\2\2"+
		"\bP\3\2\2\2\nW\3\2\2\2\f\\\3\2\2\2\16f\3\2\2\2\20h\3\2\2\2\22j\3\2\2\2"+
		"\24s\3\2\2\2\26u\3\2\2\2\30w\3\2\2\2\32}\3\2\2\2\34\177\3\2\2\2\36\u0081"+
		"\3\2\2\2 \u0083\3\2\2\2\"\u0085\3\2\2\2$\u0089\3\2\2\2&\u008d\3\2\2\2"+
		"(\u008f\3\2\2\2*\u0097\3\2\2\2,\u009f\3\2\2\2.\u00a7\3\2\2\2\60\u00a9"+
		"\3\2\2\2\62\u00ab\3\2\2\2\64\u00ad\3\2\2\2\66\u00b0\3\2\2\28\u00ba\3\2"+
		"\2\2:\u00bc\3\2\2\2<\u00c1\3\2\2\2>\u00ce\3\2\2\2@\u00e5\3\2\2\2B\u00e7"+
		"\3\2\2\2D\u00e9\3\2\2\2FH\5\4\3\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2"+
		"\2\2J\3\3\2\2\2KL\5\6\4\2L\5\3\2\2\2MN\5\b\5\2NO\5\n\6\2O\7\3\2\2\2PQ"+
		"\7\3\2\2QR\7\61\2\2RS\5B\"\2S\t\3\2\2\2TV\5\f\7\2UT\3\2\2\2VY\3\2\2\2"+
		"WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\5D#\2[\13\3\2\2\2\\]\5\16\b"+
		"\2]^\5B\"\2^\r\3\2\2\2_g\5\64\33\2`g\5\20\t\2ag\5\30\r\2bg\5\32\16\2c"+
		"g\5\34\17\2dg\5\22\n\2eg\5\26\f\2f_\3\2\2\2f`\3\2\2\2fa\3\2\2\2fb\3\2"+
		"\2\2fc\3\2\2\2fd\3\2\2\2fe\3\2\2\2g\17\3\2\2\2hi\5\"\22\2i\21\3\2\2\2"+
		"jk\5\24\13\2kl\58\35\2lm\7-\2\2mn\t\2\2\2no\7,\2\2op\t\2\2\2pq\7,\2\2"+
		"qr\7\65\2\2r\23\3\2\2\2st\t\3\2\2t\25\3\2\2\2uv\t\4\2\2v\27\3\2\2\2wx"+
		"\5\36\20\2xy\7.\2\2yz\5(\25\2z{\7/\2\2{|\5 \21\2|\31\3\2\2\2}~\t\5\2\2"+
		"~\33\3\2\2\2\177\u0080\t\6\2\2\u0080\35\3\2\2\2\u0081\u0082\t\7\2\2\u0082"+
		"\37\3\2\2\2\u0083\u0084\t\b\2\2\u0084!\3\2\2\2\u0085\u0086\58\35\2\u0086"+
		"\u0087\7-\2\2\u0087\u0088\5$\23\2\u0088#\3\2\2\2\u0089\u008a\5&\24\2\u008a"+
		"%\3\2\2\2\u008b\u008e\5\60\31\2\u008c\u008e\5(\25\2\u008d\u008b\3\2\2"+
		"\2\u008d\u008c\3\2\2\2\u008e\'\3\2\2\2\u008f\u0094\5*\26\2\u0090\u0091"+
		"\t\t\2\2\u0091\u0093\5*\26\2\u0092\u0090\3\2\2\2\u0093\u0096\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095)\3\2\2\2\u0096\u0094\3\2\2\2"+
		"\u0097\u009c\5,\27\2\u0098\u0099\t\n\2\2\u0099\u009b\5,\27\2\u009a\u0098"+
		"\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"+\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a4\5.\30\2\u00a0\u00a1\t\13\2\2"+
		"\u00a1\u00a3\5.\30\2\u00a2\u00a0\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2"+
		"\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5-\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7"+
		"\u00a8\t\2\2\2\u00a8/\3\2\2\2\u00a9\u00aa\5\62\32\2\u00aa\61\3\2\2\2\u00ab"+
		"\u00ac\t\f\2\2\u00ac\63\3\2\2\2\u00ad\u00ae\5@!\2\u00ae\u00af\5\66\34"+
		"\2\u00af\65\3\2\2\2\u00b0\u00b5\58\35\2\u00b1\u00b2\7,\2\2\u00b2\u00b4"+
		"\58\35\2\u00b3\u00b1\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\67\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\7\61\2"+
		"\2\u00b9\u00bb\5:\36\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb9"+
		"\3\2\2\2\u00bc\u00bd\t\r\2\2\u00bd\u00be\7.\2\2\u00be\u00bf\5<\37\2\u00bf"+
		"\u00c0\7/\2\2\u00c0;\3\2\2\2\u00c1\u00c6\5> \2\u00c2\u00c3\7,\2\2\u00c3"+
		"\u00c5\5> \2\u00c4\u00c2\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2"+
		"\2\u00c6\u00c7\3\2\2\2\u00c7=\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00cb"+
		"\7\65\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2"+
		"\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00ca\3\2\2\2\u00cf\u00d0"+
		"\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00db\3\2\2\2\u00d2"+
		"\u00d6\7,\2\2\u00d3\u00d5\7\65\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2"+
		"\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d9\u00d2\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2"+
		"\2\2\u00db\u00dc\3\2\2\2\u00dc?\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e6"+
		"\7\23\2\2\u00df\u00e0\7\24\2\2\u00e0\u00e6\7\25\2\2\u00e1\u00e2\7\24\2"+
		"\2\u00e2\u00e6\7\26\2\2\u00e3\u00e6\7\27\2\2\u00e4\u00e6\7\30\2\2\u00e5"+
		"\u00de\3\2\2\2\u00e5\u00df\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e5\u00e4\3\2\2\2\u00e6A\3\2\2\2\u00e7\u00e8\7\60\2\2\u00e8C\3"+
		"\2\2\2\u00e9\u00ea\7\31\2\2\u00ea\u00eb\5B\"\2\u00ebE\3\2\2\2\21IWf\u008d"+
		"\u0094\u009c\u00a4\u00b5\u00ba\u00c6\u00cc\u00d0\u00d6\u00db\u00e5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}