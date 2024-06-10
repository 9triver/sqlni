package com.kekwy.sqlni.parser.gen;// Generated from E:/projects/sqlni/core/src/main/antlr/ParamTrans.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ParamTransParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PARAM_LEFT1=1, PARAM_LEFT2=2, PARAM_RIGHT=3, PARAM1=4, PARAM2=5, ID=6, 
		CH=7;
	public static final int
		RULE_root = 0, RULE_param = 1, RULE_any = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "param", "any"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#{'", "'${'", "'}'", "'SQLNI_PARAM1#'", "'SQLNI_PARAM2#'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PARAM_LEFT1", "PARAM_LEFT2", "PARAM_RIGHT", "PARAM1", "PARAM2", 
			"ID", "CH"
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
	public String getGrammarFileName() { return "ParamTrans.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParamTransParser(TokenStream input) {
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
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParamTransListener ) ((ParamTransListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParamTransListener ) ((ParamTransListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParamTransVisitor) return ((ParamTransVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			any();
			setState(11);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 246L) != 0)) {
				{
				setState(9);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PARAM_LEFT1:
				case PARAM_LEFT2:
				case PARAM1:
				case PARAM2:
					{
					setState(7);
					param();
					}
					break;
				case ID:
				case CH:
					{
					setState(8);
					any();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(13);
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
	public static class ToParam1Context extends ParamContext {
		public TerminalNode PARAM1() { return getToken(ParamTransParser.PARAM1, 0); }
		public TerminalNode ID() { return getToken(ParamTransParser.ID, 0); }
		public ToParam1Context(ParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParamTransListener ) ((ParamTransListener)listener).enterToParam1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParamTransListener ) ((ParamTransListener)listener).exitToParam1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParamTransVisitor) return ((ParamTransVisitor<? extends T>)visitor).visitToParam1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FromParam1Context extends ParamContext {
		public TerminalNode PARAM_LEFT1() { return getToken(ParamTransParser.PARAM_LEFT1, 0); }
		public TerminalNode ID() { return getToken(ParamTransParser.ID, 0); }
		public TerminalNode PARAM_RIGHT() { return getToken(ParamTransParser.PARAM_RIGHT, 0); }
		public FromParam1Context(ParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParamTransListener ) ((ParamTransListener)listener).enterFromParam1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParamTransListener ) ((ParamTransListener)listener).exitFromParam1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParamTransVisitor) return ((ParamTransVisitor<? extends T>)visitor).visitFromParam1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FromParam2Context extends ParamContext {
		public TerminalNode PARAM_LEFT2() { return getToken(ParamTransParser.PARAM_LEFT2, 0); }
		public TerminalNode ID() { return getToken(ParamTransParser.ID, 0); }
		public TerminalNode PARAM_RIGHT() { return getToken(ParamTransParser.PARAM_RIGHT, 0); }
		public FromParam2Context(ParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParamTransListener ) ((ParamTransListener)listener).enterFromParam2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParamTransListener ) ((ParamTransListener)listener).exitFromParam2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParamTransVisitor) return ((ParamTransVisitor<? extends T>)visitor).visitFromParam2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ToParam2Context extends ParamContext {
		public TerminalNode PARAM2() { return getToken(ParamTransParser.PARAM2, 0); }
		public TerminalNode ID() { return getToken(ParamTransParser.ID, 0); }
		public ToParam2Context(ParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParamTransListener ) ((ParamTransListener)listener).enterToParam2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParamTransListener ) ((ParamTransListener)listener).exitToParam2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParamTransVisitor) return ((ParamTransVisitor<? extends T>)visitor).visitToParam2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_param);
		try {
			setState(24);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARAM1:
				_localctx = new ToParam1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				match(PARAM1);
				setState(15);
				match(ID);
				}
				break;
			case PARAM2:
				_localctx = new ToParam2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(16);
				match(PARAM2);
				setState(17);
				match(ID);
				}
				break;
			case PARAM_LEFT1:
				_localctx = new FromParam1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(18);
				match(PARAM_LEFT1);
				setState(19);
				match(ID);
				setState(20);
				match(PARAM_RIGHT);
				}
				break;
			case PARAM_LEFT2:
				_localctx = new FromParam2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(21);
				match(PARAM_LEFT2);
				setState(22);
				match(ID);
				setState(23);
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
		public List<TerminalNode> CH() { return getTokens(ParamTransParser.CH); }
		public TerminalNode CH(int i) {
			return getToken(ParamTransParser.CH, i);
		}
		public List<TerminalNode> ID() { return getTokens(ParamTransParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParamTransParser.ID, i);
		}
		public AnyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParamTransListener ) ((ParamTransListener)listener).enterAny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParamTransListener ) ((ParamTransListener)listener).exitAny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParamTransVisitor) return ((ParamTransVisitor<? extends T>)visitor).visitAny(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyContext any() throws RecognitionException {
		AnyContext _localctx = new AnyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_any);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(27); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(26);
					_la = _input.LA(1);
					if ( !(_la==ID || _la==CH) ) {
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
				setState(29); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
		"\u0004\u0001\u0007 \u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\n\b"+
		"\u0000\n\u0000\f\u0000\r\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001\u0019\b\u0001\u0001\u0002\u0004\u0002\u001c\b\u0002"+
		"\u000b\u0002\f\u0002\u001d\u0001\u0002\u0000\u0000\u0003\u0000\u0002\u0004"+
		"\u0000\u0001\u0001\u0000\u0006\u0007\"\u0000\u0006\u0001\u0000\u0000\u0000"+
		"\u0002\u0018\u0001\u0000\u0000\u0000\u0004\u001b\u0001\u0000\u0000\u0000"+
		"\u0006\u000b\u0003\u0004\u0002\u0000\u0007\n\u0003\u0002\u0001\u0000\b"+
		"\n\u0003\u0004\u0002\u0000\t\u0007\u0001\u0000\u0000\u0000\t\b\u0001\u0000"+
		"\u0000\u0000\n\r\u0001\u0000\u0000\u0000\u000b\t\u0001\u0000\u0000\u0000"+
		"\u000b\f\u0001\u0000\u0000\u0000\f\u0001\u0001\u0000\u0000\u0000\r\u000b"+
		"\u0001\u0000\u0000\u0000\u000e\u000f\u0005\u0004\u0000\u0000\u000f\u0019"+
		"\u0005\u0006\u0000\u0000\u0010\u0011\u0005\u0005\u0000\u0000\u0011\u0019"+
		"\u0005\u0006\u0000\u0000\u0012\u0013\u0005\u0001\u0000\u0000\u0013\u0014"+
		"\u0005\u0006\u0000\u0000\u0014\u0019\u0005\u0003\u0000\u0000\u0015\u0016"+
		"\u0005\u0002\u0000\u0000\u0016\u0017\u0005\u0006\u0000\u0000\u0017\u0019"+
		"\u0005\u0003\u0000\u0000\u0018\u000e\u0001\u0000\u0000\u0000\u0018\u0010"+
		"\u0001\u0000\u0000\u0000\u0018\u0012\u0001\u0000\u0000\u0000\u0018\u0015"+
		"\u0001\u0000\u0000\u0000\u0019\u0003\u0001\u0000\u0000\u0000\u001a\u001c"+
		"\u0007\u0000\u0000\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001c\u001d"+
		"\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e"+
		"\u0001\u0000\u0000\u0000\u001e\u0005\u0001\u0000\u0000\u0000\u0004\t\u000b"+
		"\u0018\u001d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}