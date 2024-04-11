package com.kekwy.sqlni.parser.gen;// Generated from E:/projects/sqlni/src/main/antlr/MyBatisTag.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MyBatisTagParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LEFT=1, RIGHT=2, PARAM_LEFT1=3, PARAM_LEFT2=4, PARAM_RIGHT=5, SEPARATOR=6, 
		IF=7, ENDIF=8, FOREACH=9, STRING=10, ID=11, SPACE=12, CH=13;
	public static final int
		RULE_root = 0, RULE_func = 1, RULE_param = 2, RULE_any = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "func", "param", "any"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'#{'", "'${'", "'}'", "','", null, null, null, null, 
			null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LEFT", "RIGHT", "PARAM_LEFT1", "PARAM_LEFT2", "PARAM_RIGHT", "SEPARATOR", 
			"IF", "ENDIF", "FOREACH", "STRING", "ID", "SPACE", "CH"
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
	public String getGrammarFileName() { return "MyBatisTag.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyBatisTagParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RootContext extends ParserRuleContext {
		public List<AnyContext> any() {
			return getRuleContexts(AnyContext.class);
		}
		public AnyContext any(int i) {
			return getRuleContext(AnyContext.class,i);
		}
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyBatisTagListener ) ((MyBatisTagListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyBatisTagListener ) ((MyBatisTagListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyBatisTagVisitor) return ((MyBatisTagVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			any();
			setState(13);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt != ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(11);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IF:
					case FOREACH:
						{
						setState(9);
						func();
						}
						break;
					case LEFT:
					case RIGHT:
					case PARAM_LEFT1:
					case PARAM_LEFT2:
					case PARAM_RIGHT:
					case SEPARATOR:
					case STRING:
					case ID:
					case SPACE:
					case CH:
						{
						setState(10);
						any();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(15);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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
	public static class FuncContext extends ParserRuleContext {
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
	 
		public FuncContext() { }
		public void copyFrom(FuncContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForeachContext extends FuncContext {
		public TerminalNode FOREACH() { return getToken(MyBatisTagParser.FOREACH, 0); }
		public TerminalNode LEFT() { return getToken(MyBatisTagParser.LEFT, 0); }
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode RIGHT() { return getToken(MyBatisTagParser.RIGHT, 0); }
		public List<TerminalNode> SPACE() { return getTokens(MyBatisTagParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(MyBatisTagParser.SPACE, i);
		}
		public ForeachContext(FuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyBatisTagListener ) ((MyBatisTagListener)listener).enterForeach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyBatisTagListener ) ((MyBatisTagListener)listener).exitForeach(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyBatisTagVisitor) return ((MyBatisTagVisitor<? extends T>)visitor).visitForeach(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends FuncContext {
		public TerminalNode IF() { return getToken(MyBatisTagParser.IF, 0); }
		public TerminalNode LEFT() { return getToken(MyBatisTagParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(MyBatisTagParser.RIGHT, 0); }
		public TerminalNode ENDIF() { return getToken(MyBatisTagParser.ENDIF, 0); }
		public List<AnyContext> any() {
			return getRuleContexts(AnyContext.class);
		}
		public AnyContext any(int i) {
			return getRuleContext(AnyContext.class,i);
		}
		public List<RootContext> root() {
			return getRuleContexts(RootContext.class);
		}
		public RootContext root(int i) {
			return getRuleContext(RootContext.class,i);
		}
		public IfContext(FuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyBatisTagListener ) ((MyBatisTagListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyBatisTagListener ) ((MyBatisTagListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyBatisTagVisitor) return ((MyBatisTagVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_func);
		int _la;
		try {
			int _alt;
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				match(IF);
				setState(17);
				match(LEFT);
				setState(19); 
				_errHandler.sync(this);
				_alt = 1+1;
				do {
					switch (_alt) {
					case 1+1:
						{
						{
						setState(18);
						any();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(21); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=1 && _alt != ATN.INVALID_ALT_NUMBER );
				setState(23);
				match(RIGHT);
				setState(27);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=1 && _alt != ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(24);
						root();
						}
						} 
					}
					setState(29);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(30);
				match(ENDIF);
				}
				break;
			case FOREACH:
				_localctx = new ForeachContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				match(FOREACH);
				setState(33);
				match(LEFT);
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(34);
					match(SPACE);
					}
					}
					setState(39);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(40);
				param();
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(41);
					match(SPACE);
					}
					}
					setState(46);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(47);
				match(RIGHT);
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
	public static class ParamContext extends ParserRuleContext {
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	 
		public ParamContext() { }
		public void copyFrom(ParamContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Param1Context extends ParamContext {
		public TerminalNode PARAM_LEFT1() { return getToken(MyBatisTagParser.PARAM_LEFT1, 0); }
		public TerminalNode ID() { return getToken(MyBatisTagParser.ID, 0); }
		public TerminalNode PARAM_RIGHT() { return getToken(MyBatisTagParser.PARAM_RIGHT, 0); }
		public Param1Context(ParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyBatisTagListener ) ((MyBatisTagListener)listener).enterParam1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyBatisTagListener ) ((MyBatisTagListener)listener).exitParam1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyBatisTagVisitor) return ((MyBatisTagVisitor<? extends T>)visitor).visitParam1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Param2Context extends ParamContext {
		public TerminalNode PARAM_LEFT2() { return getToken(MyBatisTagParser.PARAM_LEFT2, 0); }
		public TerminalNode ID() { return getToken(MyBatisTagParser.ID, 0); }
		public TerminalNode PARAM_RIGHT() { return getToken(MyBatisTagParser.PARAM_RIGHT, 0); }
		public Param2Context(ParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyBatisTagListener ) ((MyBatisTagListener)listener).enterParam2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyBatisTagListener ) ((MyBatisTagListener)listener).exitParam2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyBatisTagVisitor) return ((MyBatisTagVisitor<? extends T>)visitor).visitParam2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_param);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARAM_LEFT1:
				_localctx = new Param1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				match(PARAM_LEFT1);
				setState(52);
				match(ID);
				setState(53);
				match(PARAM_RIGHT);
				}
				break;
			case PARAM_LEFT2:
				_localctx = new Param2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(PARAM_LEFT2);
				setState(55);
				match(ID);
				setState(56);
				match(PARAM_RIGHT);
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
	public static class AnyContext extends ParserRuleContext {
		public List<TerminalNode> CH() { return getTokens(MyBatisTagParser.CH); }
		public TerminalNode CH(int i) {
			return getToken(MyBatisTagParser.CH, i);
		}
		public List<TerminalNode> LEFT() { return getTokens(MyBatisTagParser.LEFT); }
		public TerminalNode LEFT(int i) {
			return getToken(MyBatisTagParser.LEFT, i);
		}
		public List<TerminalNode> RIGHT() { return getTokens(MyBatisTagParser.RIGHT); }
		public TerminalNode RIGHT(int i) {
			return getToken(MyBatisTagParser.RIGHT, i);
		}
		public List<TerminalNode> SEPARATOR() { return getTokens(MyBatisTagParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(MyBatisTagParser.SEPARATOR, i);
		}
		public List<TerminalNode> ID() { return getTokens(MyBatisTagParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MyBatisTagParser.ID, i);
		}
		public List<TerminalNode> PARAM_LEFT1() { return getTokens(MyBatisTagParser.PARAM_LEFT1); }
		public TerminalNode PARAM_LEFT1(int i) {
			return getToken(MyBatisTagParser.PARAM_LEFT1, i);
		}
		public List<TerminalNode> PARAM_LEFT2() { return getTokens(MyBatisTagParser.PARAM_LEFT2); }
		public TerminalNode PARAM_LEFT2(int i) {
			return getToken(MyBatisTagParser.PARAM_LEFT2, i);
		}
		public List<TerminalNode> PARAM_RIGHT() { return getTokens(MyBatisTagParser.PARAM_RIGHT); }
		public TerminalNode PARAM_RIGHT(int i) {
			return getToken(MyBatisTagParser.PARAM_RIGHT, i);
		}
		public List<TerminalNode> STRING() { return getTokens(MyBatisTagParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MyBatisTagParser.STRING, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(MyBatisTagParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(MyBatisTagParser.SPACE, i);
		}
		public AnyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyBatisTagListener ) ((MyBatisTagListener)listener).enterAny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyBatisTagListener ) ((MyBatisTagListener)listener).exitAny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyBatisTagVisitor) return ((MyBatisTagVisitor<? extends T>)visitor).visitAny(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyContext any() throws RecognitionException {
		AnyContext _localctx = new AnyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_any);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(60); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(59);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15486L) != 0)) ) {
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
				default:
					throw new NoViableAltException(this);
				}
				setState(62); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt != ATN.INVALID_ALT_NUMBER );
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
		"\u0004\u0001\rA\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000\f\b\u0000\n\u0000\f\u0000\u000f\t\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0004\u0001\u0014\b\u0001\u000b\u0001\f\u0001"+
		"\u0015\u0001\u0001\u0001\u0001\u0005\u0001\u001a\b\u0001\n\u0001\f\u0001"+
		"\u001d\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001$\b\u0001\n\u0001\f\u0001\'\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001+\b\u0001\n\u0001\f\u0001.\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u00012\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002:\b\u0002\u0001\u0003\u0004\u0003"+
		"=\b\u0003\u000b\u0003\f\u0003>\u0001\u0003\u0002\u0015\u001b\u0000\u0004"+
		"\u0000\u0002\u0004\u0006\u0000\u0001\u0002\u0000\u0001\u0006\n\rE\u0000"+
		"\b\u0001\u0000\u0000\u0000\u00021\u0001\u0000\u0000\u0000\u00049\u0001"+
		"\u0000\u0000\u0000\u0006<\u0001\u0000\u0000\u0000\b\r\u0003\u0006\u0003"+
		"\u0000\t\f\u0003\u0002\u0001\u0000\n\f\u0003\u0006\u0003\u0000\u000b\t"+
		"\u0001\u0000\u0000\u0000\u000b\n\u0001\u0000\u0000\u0000\f\u000f\u0001"+
		"\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000\u0000\r\u000e\u0001\u0000"+
		"\u0000\u0000\u000e\u0001\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000"+
		"\u0000\u0010\u0011\u0005\u0007\u0000\u0000\u0011\u0013\u0005\u0001\u0000"+
		"\u0000\u0012\u0014\u0003\u0006\u0003\u0000\u0013\u0012\u0001\u0000\u0000"+
		"\u0000\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000"+
		"\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000"+
		"\u0000\u0017\u001b\u0005\u0002\u0000\u0000\u0018\u001a\u0003\u0000\u0000"+
		"\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u001a\u001d\u0001\u0000\u0000"+
		"\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000"+
		"\u0000\u001c\u001e\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000"+
		"\u0000\u001e\u001f\u0005\b\u0000\u0000\u001f2\u0001\u0000\u0000\u0000"+
		" !\u0005\t\u0000\u0000!%\u0005\u0001\u0000\u0000\"$\u0005\f\u0000\u0000"+
		"#\"\u0001\u0000\u0000\u0000$\'\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000"+
		"\u0000%&\u0001\u0000\u0000\u0000&(\u0001\u0000\u0000\u0000\'%\u0001\u0000"+
		"\u0000\u0000(,\u0003\u0004\u0002\u0000)+\u0005\f\u0000\u0000*)\u0001\u0000"+
		"\u0000\u0000+.\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001"+
		"\u0000\u0000\u0000-/\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000"+
		"/0\u0005\u0002\u0000\u000002\u0001\u0000\u0000\u00001\u0010\u0001\u0000"+
		"\u0000\u00001 \u0001\u0000\u0000\u00002\u0003\u0001\u0000\u0000\u0000"+
		"34\u0005\u0003\u0000\u000045\u0005\u000b\u0000\u00005:\u0005\u0005\u0000"+
		"\u000067\u0005\u0004\u0000\u000078\u0005\u000b\u0000\u00008:\u0005\u0005"+
		"\u0000\u000093\u0001\u0000\u0000\u000096\u0001\u0000\u0000\u0000:\u0005"+
		"\u0001\u0000\u0000\u0000;=\u0007\u0000\u0000\u0000<;\u0001\u0000\u0000"+
		"\u0000=>\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000"+
		"\u0000\u0000?\u0007\u0001\u0000\u0000\u0000\t\u000b\r\u0015\u001b%,19"+
		">";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}