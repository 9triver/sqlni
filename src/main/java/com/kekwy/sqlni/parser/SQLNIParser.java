package com.kekwy.sqlni.parser;// Generated from E:/projects/sqlni/src/main/antlr/SQLNI.g4 by ANTLR 4.13.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, SELECT=11, FROM=12, WHERE=13, LIMIT=14, OFFSET=15, AND=16, OR=17, 
		IN=18, ORDER=19, BY=20, DESC=21, ASC=22, AS=23, OP=24, SET=25, DISTINCT=26, 
		NUMBER=27, STRING=28, ID=29, WS=30;
	public static final int
		RULE_root = 0, RULE_select = 1, RULE_limit = 2, RULE_offset = 3, RULE_orderBy = 4, 
		RULE_orderColumn = 5, RULE_columns = 6, RULE_column = 7, RULE_param = 8, 
		RULE_table = 9, RULE_as = 10, RULE_conditions = 11, RULE_condition = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "select", "limit", "offset", "orderBy", "orderColumn", "columns", 
			"column", "param", "table", "as", "conditions", "condition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "';'", "','", "'{'", "'}'", "'.'", "'('", "')'", "'#{'", 
			"'${'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "SELECT", 
			"FROM", "WHERE", "LIMIT", "OFFSET", "AND", "OR", "IN", "ORDER", "BY", 
			"DESC", "ASC", "AS", "OP", "SET", "DISTINCT", "NUMBER", "STRING", "ID", 
			"WS"
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
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			select();
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
	public static class SelectContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SQLNIParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(SQLNIParser.FROM, 0); }
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public ColumnsContext columns() {
			return getRuleContext(ColumnsContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(SQLNIParser.DISTINCT, 0); }
		public TerminalNode WHERE() { return getToken(SQLNIParser.WHERE, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public OrderByContext orderBy() {
			return getRuleContext(OrderByContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(SQLNIParser.LIMIT, 0); }
		public LimitContext limit() {
			return getRuleContext(LimitContext.class,0);
		}
		public TerminalNode OFFSET() { return getToken(SQLNIParser.OFFSET, 0); }
		public OffsetContext offset() {
			return getRuleContext(OffsetContext.class,0);
		}
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_select);
		int _la;
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				match(SELECT);
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT) {
					{
					setState(29);
					match(DISTINCT);
					}
				}

				setState(34);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(32);
					match(T__0);
					}
					break;
				case T__8:
				case T__9:
				case NUMBER:
				case STRING:
				case ID:
					{
					setState(33);
					columns();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(36);
				match(FROM);
				setState(37);
				table();
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(38);
					match(WHERE);
					setState(39);
					conditions();
					}
				}

				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(42);
					orderBy();
					}
				}

				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT) {
					{
					setState(45);
					match(LIMIT);
					setState(46);
					limit();
					}
				}

				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OFFSET) {
					{
					setState(49);
					match(OFFSET);
					setState(50);
					offset();
					}
				}

				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(53);
					match(T__1);
					}
				}

				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class LimitContext extends ParserRuleContext {
		public LimitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit; }
	 
		public LimitContext() { }
		public void copyFrom(LimitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberLimitContext extends LimitContext {
		public TerminalNode NUMBER() { return getToken(SQLNIParser.NUMBER, 0); }
		public NumberLimitContext(LimitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterNumberLimit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitNumberLimit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitNumberLimit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParamLimitContext extends LimitContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public ParamLimitContext(LimitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterParamLimit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitParamLimit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitParamLimit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitContext limit() throws RecognitionException {
		LimitContext _localctx = new LimitContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_limit);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
				_localctx = new ParamLimitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				param();
				}
				break;
			case NUMBER:
				_localctx = new NumberLimitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				match(NUMBER);
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
	public static class OffsetContext extends ParserRuleContext {
		public OffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offset; }
	 
		public OffsetContext() { }
		public void copyFrom(OffsetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParamOffsetContext extends OffsetContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public ParamOffsetContext(OffsetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterParamOffset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitParamOffset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitParamOffset(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberOffsetContext extends OffsetContext {
		public TerminalNode NUMBER() { return getToken(SQLNIParser.NUMBER, 0); }
		public NumberOffsetContext(OffsetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterNumberOffset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitNumberOffset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitNumberOffset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OffsetContext offset() throws RecognitionException {
		OffsetContext _localctx = new OffsetContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_offset);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
				_localctx = new ParamOffsetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				param();
				}
				break;
			case NUMBER:
				_localctx = new NumberOffsetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(NUMBER);
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
	public static class OrderByContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(SQLNIParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SQLNIParser.BY, 0); }
		public List<OrderColumnContext> orderColumn() {
			return getRuleContexts(OrderColumnContext.class);
		}
		public OrderColumnContext orderColumn(int i) {
			return getRuleContext(OrderColumnContext.class,i);
		}
		public OrderByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderBy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterOrderBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitOrderBy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitOrderBy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByContext orderBy() throws RecognitionException {
		OrderByContext _localctx = new OrderByContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_orderBy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(ORDER);
			setState(68);
			match(BY);
			setState(69);
			orderColumn();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(70);
				match(T__2);
				setState(71);
				orderColumn();
				}
				}
				setState(76);
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
	public static class OrderColumnContext extends ParserRuleContext {
		public OrderColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderColumn; }
	 
		public OrderColumnContext() { }
		public void copyFrom(OrderColumnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalOrderColumnContext extends OrderColumnContext {
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SQLNIParser.DESC, 0); }
		public TerminalNode ASC() { return getToken(SQLNIParser.ASC, 0); }
		public NormalOrderColumnContext(OrderColumnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterNormalOrderColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitNormalOrderColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitNormalOrderColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParamSetOrderColumnContext extends OrderColumnContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SQLNIParser.DESC, 0); }
		public TerminalNode ASC() { return getToken(SQLNIParser.ASC, 0); }
		public ParamSetOrderColumnContext(OrderColumnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterParamSetOrderColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitParamSetOrderColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitParamSetOrderColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderColumnContext orderColumn() throws RecognitionException {
		OrderColumnContext _localctx = new OrderColumnContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_orderColumn);
		int _la;
		try {
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case NUMBER:
			case STRING:
			case ID:
				_localctx = new NormalOrderColumnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				column();
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DESC || _la==ASC) {
					{
					setState(78);
					_la = _input.LA(1);
					if ( !(_la==DESC || _la==ASC) ) {
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
				break;
			case T__3:
				_localctx = new ParamSetOrderColumnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(T__3);
				setState(82);
				param();
				setState(83);
				match(T__4);
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DESC || _la==ASC) {
					{
					setState(84);
					_la = _input.LA(1);
					if ( !(_la==DESC || _la==ASC) ) {
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
	public static class ColumnsContext extends ParserRuleContext {
		public List<ColumnContext> column() {
			return getRuleContexts(ColumnContext.class);
		}
		public ColumnContext column(int i) {
			return getRuleContext(ColumnContext.class,i);
		}
		public List<AsContext> as() {
			return getRuleContexts(AsContext.class);
		}
		public AsContext as(int i) {
			return getRuleContext(AsContext.class,i);
		}
		public ColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitColumns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnsContext columns() throws RecognitionException {
		ColumnsContext _localctx = new ColumnsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_columns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			column();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(90);
				as();
				}
			}

			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(93);
				match(T__2);
				setState(94);
				column();
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(95);
					as();
					}
				}

				}
				}
				setState(102);
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
	public static class ColumnContext extends ParserRuleContext {
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
	 
		public ColumnContext() { }
		public void copyFrom(ColumnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalColumnContext extends ColumnContext {
		public List<TerminalNode> ID() { return getTokens(SQLNIParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SQLNIParser.ID, i);
		}
		public NormalColumnContext(ColumnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterNormalColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitNormalColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitNormalColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberConstContext extends ColumnContext {
		public TerminalNode NUMBER() { return getToken(SQLNIParser.NUMBER, 0); }
		public NumberConstContext(ColumnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterNumberConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitNumberConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitNumberConst(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParamColumnContext extends ColumnContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public ParamColumnContext(ColumnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterParamColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitParamColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitParamColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncColumnContext extends ColumnContext {
		public TerminalNode ID() { return getToken(SQLNIParser.ID, 0); }
		public List<ColumnContext> column() {
			return getRuleContexts(ColumnContext.class);
		}
		public ColumnContext column(int i) {
			return getRuleContext(ColumnContext.class,i);
		}
		public FuncColumnContext(ColumnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterFuncColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitFuncColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitFuncColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringConstContext extends ColumnContext {
		public TerminalNode STRING() { return getToken(SQLNIParser.STRING, 0); }
		public StringConstContext(ColumnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterStringConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitStringConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitStringConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_column);
		int _la;
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new NormalColumnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(103);
					match(ID);
					}
					break;
				case 2:
					{
					setState(104);
					match(ID);
					setState(105);
					match(T__5);
					setState(106);
					match(ID);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new ParamColumnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				param();
				}
				break;
			case 3:
				_localctx = new StringConstContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new NumberConstContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				match(NUMBER);
				}
				break;
			case 5:
				_localctx = new FuncColumnContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
				match(ID);
				setState(113);
				match(T__6);
				setState(114);
				column();
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(115);
					match(T__2);
					setState(116);
					column();
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(122);
				match(T__7);
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
	public static class ParamContext extends ParserRuleContext {
		public Token left;
		public Token right;
		public TerminalNode ID() { return getToken(SQLNIParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_param);
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				((ParamContext)_localctx).left = match(T__8);
				setState(127);
				match(ID);
				setState(128);
				((ParamContext)_localctx).right = match(T__4);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				((ParamContext)_localctx).left = match(T__9);
				setState(130);
				match(ID);
				setState(131);
				((ParamContext)_localctx).right = match(T__4);
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
	public static class TableContext extends ParserRuleContext {
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
	 
		public TableContext() { }
		public void copyFrom(TableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstTableContext extends TableContext {
		public TerminalNode ID() { return getToken(SQLNIParser.ID, 0); }
		public AsContext as() {
			return getRuleContext(AsContext.class,0);
		}
		public ConstTableContext(TableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterConstTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitConstTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitConstTable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParamTableContext extends TableContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public AsContext as() {
			return getRuleContext(AsContext.class,0);
		}
		public ParamTableContext(TableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterParamTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitParamTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitParamTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_table);
		int _la;
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new ConstTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(ID);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(135);
					as();
					}
				}

				}
				break;
			case T__8:
			case T__9:
				_localctx = new ParamTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				param();
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(139);
					as();
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
	public static class AsContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(SQLNIParser.AS, 0); }
		public TerminalNode ID() { return getToken(SQLNIParser.ID, 0); }
		public AsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_as; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterAs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitAs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitAs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsContext as() throws RecognitionException {
		AsContext _localctx = new AsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_as);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(AS);
			setState(145);
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
	public static class ConditionsContext extends ParserRuleContext {
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
	 
		public ConditionsContext() { }
		public void copyFrom(ConditionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiCondtionsContext extends ConditionsContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode AND() { return getToken(SQLNIParser.AND, 0); }
		public TerminalNode OR() { return getToken(SQLNIParser.OR, 0); }
		public MultiCondtionsContext(ConditionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterMultiCondtions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitMultiCondtions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitMultiCondtions(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubConditionsContext extends ConditionsContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode AND() { return getToken(SQLNIParser.AND, 0); }
		public TerminalNode OR() { return getToken(SQLNIParser.OR, 0); }
		public SubConditionsContext(ConditionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterSubConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitSubConditions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitSubConditions(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleConditionContext extends ConditionsContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public SingleConditionContext(ConditionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterSingleCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitSingleCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitSingleCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_conditions);
		int _la;
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new SingleConditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				condition();
				}
				break;
			case 2:
				_localctx = new MultiCondtionsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				condition();
				setState(149);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(150);
				conditions();
				}
				break;
			case 3:
				_localctx = new SubConditionsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				condition();
				setState(153);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(154);
				match(T__6);
				setState(155);
				conditions();
				setState(156);
				match(T__7);
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
	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InSetConditionContext extends ConditionContext {
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public TerminalNode IN() { return getToken(SQLNIParser.IN, 0); }
		public TerminalNode SET() { return getToken(SQLNIParser.SET, 0); }
		public InSetConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterInSetCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitInSetCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitInSetCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CmpConditionContext extends ConditionContext {
		public List<ColumnContext> column() {
			return getRuleContexts(ColumnContext.class);
		}
		public ColumnContext column(int i) {
			return getRuleContext(ColumnContext.class,i);
		}
		public TerminalNode OP() { return getToken(SQLNIParser.OP, 0); }
		public CmpConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterCmpCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitCmpCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitCmpCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InParamSetConditionContext extends ConditionContext {
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public TerminalNode IN() { return getToken(SQLNIParser.IN, 0); }
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public InParamSetConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterInParamSetCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitInParamSetCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitInParamSetCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condition);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new CmpConditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				column();
				setState(161);
				match(OP);
				setState(162);
				column();
				}
				break;
			case 2:
				_localctx = new InParamSetConditionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				column();
				setState(165);
				match(IN);
				setState(166);
				match(T__3);
				setState(167);
				param();
				setState(168);
				match(T__4);
				}
				break;
			case 3:
				_localctx = new InSetConditionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				column();
				setState(171);
				match(IN);
				setState(172);
				match(SET);
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

	public static final String _serializedATN =
		"\u0004\u0001\u001e\u00b1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u001f\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001#\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001)\b\u0001\u0001"+
		"\u0001\u0003\u0001,\b\u0001\u0001\u0001\u0001\u0001\u0003\u00010\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u00014\b\u0001\u0001\u0001\u0003\u0001"+
		"7\b\u0001\u0001\u0001\u0003\u0001:\b\u0001\u0001\u0002\u0001\u0002\u0003"+
		"\u0002>\b\u0002\u0001\u0003\u0001\u0003\u0003\u0003B\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004I\b\u0004"+
		"\n\u0004\f\u0004L\t\u0004\u0001\u0005\u0001\u0005\u0003\u0005P\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005V\b\u0005"+
		"\u0003\u0005X\b\u0005\u0001\u0006\u0001\u0006\u0003\u0006\\\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006a\b\u0006\u0005\u0006c\b\u0006"+
		"\n\u0006\f\u0006f\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007l\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007v\b\u0007"+
		"\n\u0007\f\u0007y\t\u0007\u0001\u0007\u0001\u0007\u0003\u0007}\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0085\b\b\u0001"+
		"\t\u0001\t\u0003\t\u0089\b\t\u0001\t\u0001\t\u0003\t\u008d\b\t\u0003\t"+
		"\u008f\b\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u009f\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u00af\b\f\u0001\f\u0000\u0000\r\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0002\u0001"+
		"\u0000\u0015\u0016\u0001\u0000\u0010\u0011\u00c2\u0000\u001a\u0001\u0000"+
		"\u0000\u0000\u00029\u0001\u0000\u0000\u0000\u0004=\u0001\u0000\u0000\u0000"+
		"\u0006A\u0001\u0000\u0000\u0000\bC\u0001\u0000\u0000\u0000\nW\u0001\u0000"+
		"\u0000\u0000\fY\u0001\u0000\u0000\u0000\u000e|\u0001\u0000\u0000\u0000"+
		"\u0010\u0084\u0001\u0000\u0000\u0000\u0012\u008e\u0001\u0000\u0000\u0000"+
		"\u0014\u0090\u0001\u0000\u0000\u0000\u0016\u009e\u0001\u0000\u0000\u0000"+
		"\u0018\u00ae\u0001\u0000\u0000\u0000\u001a\u001b\u0003\u0002\u0001\u0000"+
		"\u001b\u0001\u0001\u0000\u0000\u0000\u001c\u001e\u0005\u000b\u0000\u0000"+
		"\u001d\u001f\u0005\u001a\u0000\u0000\u001e\u001d\u0001\u0000\u0000\u0000"+
		"\u001e\u001f\u0001\u0000\u0000\u0000\u001f\"\u0001\u0000\u0000\u0000 "+
		"#\u0005\u0001\u0000\u0000!#\u0003\f\u0006\u0000\" \u0001\u0000\u0000\u0000"+
		"\"!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$%\u0005\f\u0000"+
		"\u0000%(\u0003\u0012\t\u0000&\'\u0005\r\u0000\u0000\')\u0003\u0016\u000b"+
		"\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)+\u0001\u0000"+
		"\u0000\u0000*,\u0003\b\u0004\u0000+*\u0001\u0000\u0000\u0000+,\u0001\u0000"+
		"\u0000\u0000,/\u0001\u0000\u0000\u0000-.\u0005\u000e\u0000\u0000.0\u0003"+
		"\u0004\u0002\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u0000"+
		"03\u0001\u0000\u0000\u000012\u0005\u000f\u0000\u000024\u0003\u0006\u0003"+
		"\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000046\u0001\u0000"+
		"\u0000\u000057\u0005\u0002\u0000\u000065\u0001\u0000\u0000\u000067\u0001"+
		"\u0000\u0000\u00007:\u0001\u0000\u0000\u00008:\u0001\u0000\u0000\u0000"+
		"9\u001c\u0001\u0000\u0000\u000098\u0001\u0000\u0000\u0000:\u0003\u0001"+
		"\u0000\u0000\u0000;>\u0003\u0010\b\u0000<>\u0005\u001b\u0000\u0000=;\u0001"+
		"\u0000\u0000\u0000=<\u0001\u0000\u0000\u0000>\u0005\u0001\u0000\u0000"+
		"\u0000?B\u0003\u0010\b\u0000@B\u0005\u001b\u0000\u0000A?\u0001\u0000\u0000"+
		"\u0000A@\u0001\u0000\u0000\u0000B\u0007\u0001\u0000\u0000\u0000CD\u0005"+
		"\u0013\u0000\u0000DE\u0005\u0014\u0000\u0000EJ\u0003\n\u0005\u0000FG\u0005"+
		"\u0003\u0000\u0000GI\u0003\n\u0005\u0000HF\u0001\u0000\u0000\u0000IL\u0001"+
		"\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000"+
		"K\t\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000MO\u0003\u000e\u0007"+
		"\u0000NP\u0007\u0000\u0000\u0000ON\u0001\u0000\u0000\u0000OP\u0001\u0000"+
		"\u0000\u0000PX\u0001\u0000\u0000\u0000QR\u0005\u0004\u0000\u0000RS\u0003"+
		"\u0010\b\u0000SU\u0005\u0005\u0000\u0000TV\u0007\u0000\u0000\u0000UT\u0001"+
		"\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VX\u0001\u0000\u0000\u0000"+
		"WM\u0001\u0000\u0000\u0000WQ\u0001\u0000\u0000\u0000X\u000b\u0001\u0000"+
		"\u0000\u0000Y[\u0003\u000e\u0007\u0000Z\\\u0003\u0014\n\u0000[Z\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\d\u0001\u0000\u0000\u0000"+
		"]^\u0005\u0003\u0000\u0000^`\u0003\u000e\u0007\u0000_a\u0003\u0014\n\u0000"+
		"`_\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ac\u0001\u0000\u0000"+
		"\u0000b]\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000"+
		"\u0000\u0000de\u0001\u0000\u0000\u0000e\r\u0001\u0000\u0000\u0000fd\u0001"+
		"\u0000\u0000\u0000gl\u0005\u001d\u0000\u0000hi\u0005\u001d\u0000\u0000"+
		"ij\u0005\u0006\u0000\u0000jl\u0005\u001d\u0000\u0000kg\u0001\u0000\u0000"+
		"\u0000kh\u0001\u0000\u0000\u0000l}\u0001\u0000\u0000\u0000m}\u0003\u0010"+
		"\b\u0000n}\u0005\u001c\u0000\u0000o}\u0005\u001b\u0000\u0000pq\u0005\u001d"+
		"\u0000\u0000qr\u0005\u0007\u0000\u0000rw\u0003\u000e\u0007\u0000st\u0005"+
		"\u0003\u0000\u0000tv\u0003\u000e\u0007\u0000us\u0001\u0000\u0000\u0000"+
		"vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000"+
		"\u0000xz\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z{\u0005\b\u0000"+
		"\u0000{}\u0001\u0000\u0000\u0000|k\u0001\u0000\u0000\u0000|m\u0001\u0000"+
		"\u0000\u0000|n\u0001\u0000\u0000\u0000|o\u0001\u0000\u0000\u0000|p\u0001"+
		"\u0000\u0000\u0000}\u000f\u0001\u0000\u0000\u0000~\u007f\u0005\t\u0000"+
		"\u0000\u007f\u0080\u0005\u001d\u0000\u0000\u0080\u0085\u0005\u0005\u0000"+
		"\u0000\u0081\u0082\u0005\n\u0000\u0000\u0082\u0083\u0005\u001d\u0000\u0000"+
		"\u0083\u0085\u0005\u0005\u0000\u0000\u0084~\u0001\u0000\u0000\u0000\u0084"+
		"\u0081\u0001\u0000\u0000\u0000\u0085\u0011\u0001\u0000\u0000\u0000\u0086"+
		"\u0088\u0005\u001d\u0000\u0000\u0087\u0089\u0003\u0014\n\u0000\u0088\u0087"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008f"+
		"\u0001\u0000\u0000\u0000\u008a\u008c\u0003\u0010\b\u0000\u008b\u008d\u0003"+
		"\u0014\n\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000"+
		"\u0000\u0000\u008d\u008f\u0001\u0000\u0000\u0000\u008e\u0086\u0001\u0000"+
		"\u0000\u0000\u008e\u008a\u0001\u0000\u0000\u0000\u008f\u0013\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0005\u0017\u0000\u0000\u0091\u0092\u0005\u001d"+
		"\u0000\u0000\u0092\u0015\u0001\u0000\u0000\u0000\u0093\u009f\u0003\u0018"+
		"\f\u0000\u0094\u0095\u0003\u0018\f\u0000\u0095\u0096\u0007\u0001\u0000"+
		"\u0000\u0096\u0097\u0003\u0016\u000b\u0000\u0097\u009f\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0003\u0018\f\u0000\u0099\u009a\u0007\u0001\u0000\u0000"+
		"\u009a\u009b\u0005\u0007\u0000\u0000\u009b\u009c\u0003\u0016\u000b\u0000"+
		"\u009c\u009d\u0005\b\u0000\u0000\u009d\u009f\u0001\u0000\u0000\u0000\u009e"+
		"\u0093\u0001\u0000\u0000\u0000\u009e\u0094\u0001\u0000\u0000\u0000\u009e"+
		"\u0098\u0001\u0000\u0000\u0000\u009f\u0017\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a1\u0003\u000e\u0007\u0000\u00a1\u00a2\u0005\u0018\u0000\u0000\u00a2"+
		"\u00a3\u0003\u000e\u0007\u0000\u00a3\u00af\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0003\u000e\u0007\u0000\u00a5\u00a6\u0005\u0012\u0000\u0000\u00a6"+
		"\u00a7\u0005\u0004\u0000\u0000\u00a7\u00a8\u0003\u0010\b\u0000\u00a8\u00a9"+
		"\u0005\u0005\u0000\u0000\u00a9\u00af\u0001\u0000\u0000\u0000\u00aa\u00ab"+
		"\u0003\u000e\u0007\u0000\u00ab\u00ac\u0005\u0012\u0000\u0000\u00ac\u00ad"+
		"\u0005\u0019\u0000\u0000\u00ad\u00af\u0001\u0000\u0000\u0000\u00ae\u00a0"+
		"\u0001\u0000\u0000\u0000\u00ae\u00a4\u0001\u0000\u0000\u0000\u00ae\u00aa"+
		"\u0001\u0000\u0000\u0000\u00af\u0019\u0001\u0000\u0000\u0000\u001a\u001e"+
		"\"(+/369=AJOUW[`dkw|\u0084\u0088\u008c\u008e\u009e\u00ae";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}