package com.kekwy.sqlni.parser.gen;// Generated from E:/projects/sqlni/src/main/antlr/SQLNI.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SQLNIParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, LIMIT=4, OFFSET=5, CH=6, WS=7;
	public static final int
		RULE_root = 0, RULE_end = 1, RULE_content = 2, RULE_any = 3, RULE_nestedExpr = 4, 
		RULE_limit = 5, RULE_offset = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "end", "content", "any", "nestedExpr", "limit", "offset"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "LIMIT", "OFFSET", "CH", "WS"
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
	public String getGrammarFileName() { return "SQLNI.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLNIParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RootContext extends ParserRuleContext {
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public LimitContext limit() {
			return getRuleContext(LimitContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public OffsetContext offset() {
			return getRuleContext(OffsetContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitRoot(this);
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
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==CH) {
				{
				{
				setState(14);
				content();
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(20);
				limit();
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OFFSET) {
					{
					setState(21);
					offset();
					}
				}

				}
			}

			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(26);
				end();
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
	public static class EndContext extends ParserRuleContext {
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(T__0);
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
	public static class ContentContext extends ParserRuleContext {
		public AnyContext any() {
			return getRuleContext(AnyContext.class,0);
		}
		public NestedExprContext nestedExpr() {
			return getRuleContext(NestedExprContext.class,0);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_content);
		try {
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CH:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				any();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				nestedExpr();
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
		public List<TerminalNode> CH() { return getTokens(SQLNIParser.CH); }
		public TerminalNode CH(int i) {
			return getToken(SQLNIParser.CH, i);
		}
		public AnyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterAny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitAny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitAny(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyContext any() throws RecognitionException {
		AnyContext _localctx = new AnyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_any);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(36); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(35);
					match(CH);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(38); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NestedExprContext extends ParserRuleContext {
		public RootContext root() {
			return getRuleContext(RootContext.class,0);
		}
		public NestedExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterNestedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitNestedExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitNestedExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedExprContext nestedExpr() throws RecognitionException {
		NestedExprContext _localctx = new NestedExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_nestedExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(T__1);
			setState(41);
			root();
			setState(42);
			match(T__2);
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
	public static class LimitContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(SQLNIParser.LIMIT, 0); }
		public AnyContext any() {
			return getRuleContext(AnyContext.class,0);
		}
		public LimitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterLimit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitLimit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitLimit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitContext limit() throws RecognitionException {
		LimitContext _localctx = new LimitContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_limit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(LIMIT);
			setState(45);
			any();
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
	public static class OffsetContext extends ParserRuleContext {
		public TerminalNode OFFSET() { return getToken(SQLNIParser.OFFSET, 0); }
		public AnyContext any() {
			return getRuleContext(AnyContext.class,0);
		}
		public OffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterOffset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitOffset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitOffset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OffsetContext offset() throws RecognitionException {
		OffsetContext _localctx = new OffsetContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_offset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(OFFSET);
			setState(48);
			any();
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
		"\u0004\u0001\u00073\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0005\u0000\u0010"+
		"\b\u0000\n\u0000\f\u0000\u0013\t\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"\u0017\b\u0000\u0003\u0000\u0019\b\u0000\u0001\u0000\u0003\u0000\u001c"+
		"\b\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0003\u0002\""+
		"\b\u0002\u0001\u0003\u0004\u0003%\b\u0003\u000b\u0003\f\u0003&\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0000\u0000\u0007\u0000"+
		"\u0002\u0004\u0006\b\n\f\u0000\u00001\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0002\u001d\u0001\u0000\u0000\u0000\u0004!\u0001\u0000\u0000\u0000\u0006"+
		"$\u0001\u0000\u0000\u0000\b(\u0001\u0000\u0000\u0000\n,\u0001\u0000\u0000"+
		"\u0000\f/\u0001\u0000\u0000\u0000\u000e\u0010\u0003\u0004\u0002\u0000"+
		"\u000f\u000e\u0001\u0000\u0000\u0000\u0010\u0013\u0001\u0000\u0000\u0000"+
		"\u0011\u000f\u0001\u0000\u0000\u0000\u0011\u0012\u0001\u0000\u0000\u0000"+
		"\u0012\u0018\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000\u0000\u0000"+
		"\u0014\u0016\u0003\n\u0005\u0000\u0015\u0017\u0003\f\u0006\u0000\u0016"+
		"\u0015\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017"+
		"\u0019\u0001\u0000\u0000\u0000\u0018\u0014\u0001\u0000\u0000\u0000\u0018"+
		"\u0019\u0001\u0000\u0000\u0000\u0019\u001b\u0001\u0000\u0000\u0000\u001a"+
		"\u001c\u0003\u0002\u0001\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001b"+
		"\u001c\u0001\u0000\u0000\u0000\u001c\u0001\u0001\u0000\u0000\u0000\u001d"+
		"\u001e\u0005\u0001\u0000\u0000\u001e\u0003\u0001\u0000\u0000\u0000\u001f"+
		"\"\u0003\u0006\u0003\u0000 \"\u0003\b\u0004\u0000!\u001f\u0001\u0000\u0000"+
		"\u0000! \u0001\u0000\u0000\u0000\"\u0005\u0001\u0000\u0000\u0000#%\u0005"+
		"\u0006\u0000\u0000$#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000"+
		"&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'\u0007\u0001\u0000"+
		"\u0000\u0000()\u0005\u0002\u0000\u0000)*\u0003\u0000\u0000\u0000*+\u0005"+
		"\u0003\u0000\u0000+\t\u0001\u0000\u0000\u0000,-\u0005\u0004\u0000\u0000"+
		"-.\u0003\u0006\u0003\u0000.\u000b\u0001\u0000\u0000\u0000/0\u0005\u0005"+
		"\u0000\u000001\u0003\u0006\u0003\u00001\r\u0001\u0000\u0000\u0000\u0006"+
		"\u0011\u0016\u0018\u001b!&";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}