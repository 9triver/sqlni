package com.kekwy.sqlni.parser;// Generated from E:/projects/sqlni/src/main/antlr/SQLNIParam.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SQLNIParamParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PARAM1=1, PARAM2=2, CH=3;
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
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PARAM1", "PARAM2", "CH"
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
	public String getGrammarFileName() { return "SQLNIParam.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLNIParamParser(TokenStream input) {
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
			if ( listener instanceof SQLNIParamListener ) ((SQLNIParamListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIParamListener ) ((SQLNIParamListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIParamVisitor) return ((SQLNIParamVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			setState(15);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case CH:
				enterOuterAlt(_localctx, 2);
				{
				setState(7);
				any();
				setState(12);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) {
					{
					setState(10);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PARAM1:
					case PARAM2:
						{
						setState(8);
						param();
						}
						break;
					case CH:
						{
						setState(9);
						any();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(14);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
		public TerminalNode PARAM1() { return getToken(SQLNIParamParser.PARAM1, 0); }
		public Param1Context(ParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIParamListener ) ((SQLNIParamListener)listener).enterParam1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIParamListener ) ((SQLNIParamListener)listener).exitParam1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIParamVisitor) return ((SQLNIParamVisitor<? extends T>)visitor).visitParam1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Param2Context extends ParamContext {
		public TerminalNode PARAM2() { return getToken(SQLNIParamParser.PARAM2, 0); }
		public Param2Context(ParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIParamListener ) ((SQLNIParamListener)listener).enterParam2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIParamListener ) ((SQLNIParamListener)listener).exitParam2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIParamVisitor) return ((SQLNIParamVisitor<? extends T>)visitor).visitParam2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_param);
		try {
			setState(19);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARAM1:
				_localctx = new Param1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				match(PARAM1);
				}
				break;
			case PARAM2:
				_localctx = new Param2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(18);
				match(PARAM2);
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
		public List<TerminalNode> CH() { return getTokens(SQLNIParamParser.CH); }
		public TerminalNode CH(int i) {
			return getToken(SQLNIParamParser.CH, i);
		}
		public AnyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIParamListener ) ((SQLNIParamListener)listener).enterAny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIParamListener ) ((SQLNIParamListener)listener).exitAny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIParamVisitor) return ((SQLNIParamVisitor<? extends T>)visitor).visitAny(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyContext any() throws RecognitionException {
		AnyContext _localctx = new AnyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_any);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(22); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(21);
					match(CH);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(24); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		"\u0004\u0001\u0003\u001b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000\u000b\b\u0000\n\u0000\f\u0000\u000e\t\u0000\u0003\u0000\u0010"+
		"\b\u0000\u0001\u0001\u0001\u0001\u0003\u0001\u0014\b\u0001\u0001\u0002"+
		"\u0004\u0002\u0017\b\u0002\u000b\u0002\f\u0002\u0018\u0001\u0002\u0000"+
		"\u0000\u0003\u0000\u0002\u0004\u0000\u0000\u001c\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0002\u0013\u0001\u0000\u0000\u0000\u0004\u0016\u0001\u0000"+
		"\u0000\u0000\u0006\u0010\u0001\u0000\u0000\u0000\u0007\f\u0003\u0004\u0002"+
		"\u0000\b\u000b\u0003\u0002\u0001\u0000\t\u000b\u0003\u0004\u0002\u0000"+
		"\n\b\u0001\u0000\u0000\u0000\n\t\u0001\u0000\u0000\u0000\u000b\u000e\u0001"+
		"\u0000\u0000\u0000\f\n\u0001\u0000\u0000\u0000\f\r\u0001\u0000\u0000\u0000"+
		"\r\u0010\u0001\u0000\u0000\u0000\u000e\f\u0001\u0000\u0000\u0000\u000f"+
		"\u0006\u0001\u0000\u0000\u0000\u000f\u0007\u0001\u0000\u0000\u0000\u0010"+
		"\u0001\u0001\u0000\u0000\u0000\u0011\u0014\u0005\u0001\u0000\u0000\u0012"+
		"\u0014\u0005\u0002\u0000\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0013"+
		"\u0012\u0001\u0000\u0000\u0000\u0014\u0003\u0001\u0000\u0000\u0000\u0015"+
		"\u0017\u0005\u0003\u0000\u0000\u0016\u0015\u0001\u0000\u0000\u0000\u0017"+
		"\u0018\u0001\u0000\u0000\u0000\u0018\u0016\u0001\u0000\u0000\u0000\u0018"+
		"\u0019\u0001\u0000\u0000\u0000\u0019\u0005\u0001\u0000\u0000\u0000\u0005"+
		"\n\f\u000f\u0013\u0018";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}