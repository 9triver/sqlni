package com.kekwy.sqlni.parser;// Generated from E:/projects/sqlni/src/main/antlr/SQLNI_old.g4 by ANTLR 4.13.1
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
		T__9=10, T__10=11, T__11=12, SELECT=13, FROM=14, WHERE=15, LIMIT=16, OFFSET=17, 
		AND=18, OR=19, IN=20, ORDER=21, BY=22, DESC=23, ASC=24, BETWEEN=25, IS=26, 
		NULL=27, NOT=28, LIKE=29, OP=30, SET=31, DISTINCT=32, NUMBER=33, STRING=34, 
		ID=35, WS=36;
	public static final int
		RULE_root = 0, RULE_select = 1, RULE_limit = 2, RULE_offset = 3, RULE_orderBy = 4, 
		RULE_orderColumn = 5, RULE_columns = 6, RULE_selectColumn = 7, RULE_column = 8, 
		RULE_param = 9, RULE_table = 10, RULE_as = 11, RULE_conditions = 12, RULE_condition = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "select", "limit", "offset", "orderBy", "orderColumn", "columns", 
			"selectColumn", "column", "param", "table", "as", "conditions", "condition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "';'", "','", "'['", "']'", "'.'", "'('", "')'", "'#{'", 
			"'}'", "'${'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "SELECT", "FROM", "WHERE", "LIMIT", "OFFSET", "AND", "OR", "IN", 
			"ORDER", "BY", "DESC", "ASC", "BETWEEN", "IS", "NULL", "NOT", "LIKE", 
			"OP", "SET", "DISTINCT", "NUMBER", "STRING", "ID", "WS"
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
	public String getGrammarFileName() { return "SQLNI_old.g4"; }

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
			setState(28);
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
		public LimitContext limit() {
			return getRuleContext(LimitContext.class,0);
		}
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
				setState(30);
				match(SELECT);
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT) {
					{
					setState(31);
					match(DISTINCT);
					}
				}

				setState(36);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(34);
					match(T__0);
					}
					break;
				case T__6:
				case T__8:
				case T__10:
				case NUMBER:
				case STRING:
				case ID:
					{
					setState(35);
					columns();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(38);
				match(FROM);
				setState(39);
				table();
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(40);
					match(WHERE);
					setState(41);
					conditions(0);
					}
				}

				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(44);
					orderBy();
					}
				}

				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT) {
					{
					setState(47);
					limit();
					setState(49);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OFFSET) {
						{
						setState(48);
						offset();
						}
					}

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
			case T__7:
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
		public TerminalNode LIMIT() { return getToken(SQLNIParser.LIMIT, 0); }
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(SQLNIParser.NUMBER, 0); }
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
		enterRule(_localctx, 4, RULE_limit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(LIMIT);
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__10:
				{
				setState(60);
				param();
				}
				break;
			case NUMBER:
				{
				setState(61);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class OffsetContext extends ParserRuleContext {
		public TerminalNode OFFSET() { return getToken(SQLNIParser.OFFSET, 0); }
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(SQLNIParser.NUMBER, 0); }
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
		enterRule(_localctx, 6, RULE_offset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(OFFSET);
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__10:
				{
				setState(65);
				param();
				}
				break;
			case NUMBER:
				{
				setState(66);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
			setState(69);
			match(ORDER);
			setState(70);
			match(BY);
			setState(71);
			orderColumn();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(72);
				match(T__2);
				setState(73);
				orderColumn();
				}
				}
				setState(78);
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
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__8:
			case T__10:
			case NUMBER:
			case STRING:
			case ID:
				_localctx = new NormalOrderColumnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				column();
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DESC || _la==ASC) {
					{
					setState(80);
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
				setState(83);
				match(T__3);
				setState(84);
				param();
				setState(85);
				match(T__4);
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DESC || _la==ASC) {
					{
					setState(86);
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
		public List<SelectColumnContext> selectColumn() {
			return getRuleContexts(SelectColumnContext.class);
		}
		public SelectColumnContext selectColumn(int i) {
			return getRuleContext(SelectColumnContext.class,i);
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
			setState(91);
			selectColumn();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(92);
				match(T__2);
				setState(93);
				selectColumn();
				}
				}
				setState(98);
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
	public static class SelectColumnContext extends ParserRuleContext {
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public AsContext as() {
			return getRuleContext(AsContext.class,0);
		}
		public SelectColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterSelectColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitSelectColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitSelectColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectColumnContext selectColumn() throws RecognitionException {
		SelectColumnContext _localctx = new SelectColumnContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_selectColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			column();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(100);
				as();
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
	@SuppressWarnings("CheckReturnValue")
	public static class SubQueryContext extends ColumnContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public SubQueryContext(ColumnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterSubQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitSubQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitSubQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_column);
		int _la;
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new NormalColumnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
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
			case 6:
				_localctx = new SubQueryContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(124);
				match(T__6);
				setState(125);
				select();
				setState(126);
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
		public Token left;
		public Token right;
		public TerminalNode ID() { return getToken(SQLNIParser.ID, 0); }
		public Param1Context(ParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterParam1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitParam1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitParam1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Param2Context extends ParamContext {
		public Token left;
		public Token right;
		public TerminalNode ID() { return getToken(SQLNIParser.ID, 0); }
		public Param2Context(ParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterParam2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitParam2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitParam2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_param);
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				_localctx = new Param1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				((Param1Context)_localctx).left = match(T__8);
				setState(131);
				match(ID);
				setState(132);
				((Param1Context)_localctx).right = match(T__9);
				}
				break;
			case T__10:
				_localctx = new Param2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				((Param2Context)_localctx).left = match(T__10);
				setState(134);
				match(ID);
				setState(135);
				((Param2Context)_localctx).right = match(T__9);
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
	public static class SubQueryTableContext extends TableContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public AsContext as() {
			return getRuleContext(AsContext.class,0);
		}
		public SubQueryTableContext(TableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterSubQueryTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitSubQueryTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitSubQueryTable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalTableContext extends TableContext {
		public TerminalNode ID() { return getToken(SQLNIParser.ID, 0); }
		public AsContext as() {
			return getRuleContext(AsContext.class,0);
		}
		public NormalTableContext(TableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterNormalTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitNormalTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitNormalTable(this);
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
		enterRule(_localctx, 20, RULE_table);
		int _la;
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new NormalTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(ID);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(139);
					as();
					}
				}

				}
				break;
			case T__8:
			case T__10:
				_localctx = new ParamTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				param();
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(143);
					as();
					}
				}

				}
				break;
			case T__6:
				_localctx = new SubQueryTableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				match(T__6);
				setState(147);
				select();
				setState(148);
				match(T__7);
				setState(149);
				as();
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
		enterRule(_localctx, 22, RULE_as);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
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
		public Token opt;
		public List<ConditionsContext> conditions() {
			return getRuleContexts(ConditionsContext.class);
		}
		public ConditionsContext conditions(int i) {
			return getRuleContext(ConditionsContext.class,i);
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
	public static class NotConditionsContext extends ConditionsContext {
		public TerminalNode NOT() { return getToken(SQLNIParser.NOT, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public NotConditionsContext(ConditionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterNotConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitNotConditions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitNotConditions(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubConditionsContext extends ConditionsContext {
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
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
		return conditions(0);
	}

	private ConditionsContext conditions(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionsContext _localctx = new ConditionsContext(_ctx, _parentState);
		ConditionsContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_conditions, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				_localctx = new SingleConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(156);
				condition();
				}
				break;
			case 2:
				{
				_localctx = new NotConditionsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				match(NOT);
				setState(158);
				conditions(3);
				}
				break;
			case 3:
				{
				_localctx = new SubConditionsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				match(T__6);
				setState(160);
				conditions(0);
				setState(161);
				match(T__7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt != ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiCondtionsContext(new ConditionsContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_conditions);
					setState(165);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(166);
					((MultiCondtionsContext)_localctx).opt = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
						((MultiCondtionsContext)_localctx).opt = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(167);
					conditions(2);
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
	public static class BetweenAndConditionContext extends ConditionContext {
		public List<ColumnContext> column() {
			return getRuleContexts(ColumnContext.class);
		}
		public ColumnContext column(int i) {
			return getRuleContext(ColumnContext.class,i);
		}
		public TerminalNode BETWEEN() { return getToken(SQLNIParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SQLNIParser.AND, 0); }
		public BetweenAndConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterBetweenAndCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitBetweenAndCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitBetweenAndCondition(this);
			else return visitor.visitChildren(this);
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
	public static class IsNullConditionContext extends ConditionContext {
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public TerminalNode IS() { return getToken(SQLNIParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SQLNIParser.NULL, 0); }
		public IsNullConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterIsNullCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitIsNullCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitIsNullCondition(this);
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
	@SuppressWarnings("CheckReturnValue")
	public static class LikeConditionContext extends ConditionContext {
		public List<ColumnContext> column() {
			return getRuleContexts(ColumnContext.class);
		}
		public ColumnContext column(int i) {
			return getRuleContext(ColumnContext.class,i);
		}
		public TerminalNode LIKE() { return getToken(SQLNIParser.LIKE, 0); }
		public LikeConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterLikeCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitLikeCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitLikeCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_condition);
		try {
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new CmpConditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				column();
				setState(174);
				match(OP);
				setState(175);
				column();
				}
				break;
			case 2:
				_localctx = new InParamSetConditionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				column();
				setState(178);
				match(IN);
				setState(179);
				match(T__3);
				setState(180);
				param();
				setState(181);
				match(T__4);
				}
				break;
			case 3:
				_localctx = new BetweenAndConditionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				column();
				setState(184);
				match(BETWEEN);
				setState(185);
				column();
				setState(186);
				match(AND);
				setState(187);
				column();
				}
				break;
			case 4:
				_localctx = new IsNullConditionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(189);
				column();
				setState(190);
				match(IS);
				setState(191);
				match(NULL);
				}
				break;
			case 5:
				_localctx = new LikeConditionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(193);
				column();
				setState(194);
				match(LIKE);
				setState(195);
				match(T__11);
				setState(196);
				column();
				setState(197);
				match(T__11);
				}
				break;
			case 6:
				_localctx = new InSetConditionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(199);
				column();
				setState(200);
				match(IN);
				setState(201);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return conditions_sempred((ConditionsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean conditions_sempred(ConditionsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001$\u00ce\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0003\u0001!\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001%\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001+\b\u0001\u0001"+
		"\u0001\u0003\u0001.\b\u0001\u0001\u0001\u0001\u0001\u0003\u00012\b\u0001"+
		"\u0003\u00014\b\u0001\u0001\u0001\u0003\u00017\b\u0001\u0001\u0001\u0003"+
		"\u0001:\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002?\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003D\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004K\b\u0004"+
		"\n\u0004\f\u0004N\t\u0004\u0001\u0005\u0001\u0005\u0003\u0005R\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005X\b\u0005"+
		"\u0003\u0005Z\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"_\b\u0006\n\u0006\f\u0006b\t\u0006\u0001\u0007\u0001\u0007\u0003\u0007"+
		"f\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bl\b\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bv\b\b\n\b\f\b"+
		"y\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0081\b"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0089\b\t\u0001"+
		"\n\u0001\n\u0003\n\u008d\b\n\u0001\n\u0001\n\u0003\n\u0091\b\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0098\b\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00a4\b\f\u0001\f\u0001\f\u0001\f\u0005\f\u00a9\b\f\n\f\f\f\u00ac\t"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u00cc\b\r\u0001\r\u0000\u0001\u0018"+
		"\u000e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u0000\u0002\u0001\u0000\u0017\u0018\u0001\u0000\u0012\u0013\u00e3"+
		"\u0000\u001c\u0001\u0000\u0000\u0000\u00029\u0001\u0000\u0000\u0000\u0004"+
		";\u0001\u0000\u0000\u0000\u0006@\u0001\u0000\u0000\u0000\bE\u0001\u0000"+
		"\u0000\u0000\nY\u0001\u0000\u0000\u0000\f[\u0001\u0000\u0000\u0000\u000e"+
		"c\u0001\u0000\u0000\u0000\u0010\u0080\u0001\u0000\u0000\u0000\u0012\u0088"+
		"\u0001\u0000\u0000\u0000\u0014\u0097\u0001\u0000\u0000\u0000\u0016\u0099"+
		"\u0001\u0000\u0000\u0000\u0018\u00a3\u0001\u0000\u0000\u0000\u001a\u00cb"+
		"\u0001\u0000\u0000\u0000\u001c\u001d\u0003\u0002\u0001\u0000\u001d\u0001"+
		"\u0001\u0000\u0000\u0000\u001e \u0005\r\u0000\u0000\u001f!\u0005 \u0000"+
		"\u0000 \u001f\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!$\u0001"+
		"\u0000\u0000\u0000\"%\u0005\u0001\u0000\u0000#%\u0003\f\u0006\u0000$\""+
		"\u0001\u0000\u0000\u0000$#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000"+
		"\u0000&\'\u0005\u000e\u0000\u0000\'*\u0003\u0014\n\u0000()\u0005\u000f"+
		"\u0000\u0000)+\u0003\u0018\f\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000"+
		"\u0000\u0000+-\u0001\u0000\u0000\u0000,.\u0003\b\u0004\u0000-,\u0001\u0000"+
		"\u0000\u0000-.\u0001\u0000\u0000\u0000.3\u0001\u0000\u0000\u0000/1\u0003"+
		"\u0004\u0002\u000002\u0003\u0006\u0003\u000010\u0001\u0000\u0000\u0000"+
		"12\u0001\u0000\u0000\u000024\u0001\u0000\u0000\u00003/\u0001\u0000\u0000"+
		"\u000034\u0001\u0000\u0000\u000046\u0001\u0000\u0000\u000057\u0005\u0002"+
		"\u0000\u000065\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u00007:\u0001"+
		"\u0000\u0000\u00008:\u0001\u0000\u0000\u00009\u001e\u0001\u0000\u0000"+
		"\u000098\u0001\u0000\u0000\u0000:\u0003\u0001\u0000\u0000\u0000;>\u0005"+
		"\u0010\u0000\u0000<?\u0003\u0012\t\u0000=?\u0005!\u0000\u0000><\u0001"+
		"\u0000\u0000\u0000>=\u0001\u0000\u0000\u0000?\u0005\u0001\u0000\u0000"+
		"\u0000@C\u0005\u0011\u0000\u0000AD\u0003\u0012\t\u0000BD\u0005!\u0000"+
		"\u0000CA\u0001\u0000\u0000\u0000CB\u0001\u0000\u0000\u0000D\u0007\u0001"+
		"\u0000\u0000\u0000EF\u0005\u0015\u0000\u0000FG\u0005\u0016\u0000\u0000"+
		"GL\u0003\n\u0005\u0000HI\u0005\u0003\u0000\u0000IK\u0003\n\u0005\u0000"+
		"JH\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000"+
		"\u0000LM\u0001\u0000\u0000\u0000M\t\u0001\u0000\u0000\u0000NL\u0001\u0000"+
		"\u0000\u0000OQ\u0003\u0010\b\u0000PR\u0007\u0000\u0000\u0000QP\u0001\u0000"+
		"\u0000\u0000QR\u0001\u0000\u0000\u0000RZ\u0001\u0000\u0000\u0000ST\u0005"+
		"\u0004\u0000\u0000TU\u0003\u0012\t\u0000UW\u0005\u0005\u0000\u0000VX\u0007"+
		"\u0000\u0000\u0000WV\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000"+
		"XZ\u0001\u0000\u0000\u0000YO\u0001\u0000\u0000\u0000YS\u0001\u0000\u0000"+
		"\u0000Z\u000b\u0001\u0000\u0000\u0000[`\u0003\u000e\u0007\u0000\\]\u0005"+
		"\u0003\u0000\u0000]_\u0003\u000e\u0007\u0000^\\\u0001\u0000\u0000\u0000"+
		"_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000"+
		"\u0000a\r\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000ce\u0003\u0010"+
		"\b\u0000df\u0003\u0016\u000b\u0000ed\u0001\u0000\u0000\u0000ef\u0001\u0000"+
		"\u0000\u0000f\u000f\u0001\u0000\u0000\u0000gl\u0005#\u0000\u0000hi\u0005"+
		"#\u0000\u0000ij\u0005\u0006\u0000\u0000jl\u0005#\u0000\u0000kg\u0001\u0000"+
		"\u0000\u0000kh\u0001\u0000\u0000\u0000l\u0081\u0001\u0000\u0000\u0000"+
		"m\u0081\u0003\u0012\t\u0000n\u0081\u0005\"\u0000\u0000o\u0081\u0005!\u0000"+
		"\u0000pq\u0005#\u0000\u0000qr\u0005\u0007\u0000\u0000rw\u0003\u0010\b"+
		"\u0000st\u0005\u0003\u0000\u0000tv\u0003\u0010\b\u0000us\u0001\u0000\u0000"+
		"\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000"+
		"\u0000\u0000xz\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z{\u0005"+
		"\b\u0000\u0000{\u0081\u0001\u0000\u0000\u0000|}\u0005\u0007\u0000\u0000"+
		"}~\u0003\u0002\u0001\u0000~\u007f\u0005\b\u0000\u0000\u007f\u0081\u0001"+
		"\u0000\u0000\u0000\u0080k\u0001\u0000\u0000\u0000\u0080m\u0001\u0000\u0000"+
		"\u0000\u0080n\u0001\u0000\u0000\u0000\u0080o\u0001\u0000\u0000\u0000\u0080"+
		"p\u0001\u0000\u0000\u0000\u0080|\u0001\u0000\u0000\u0000\u0081\u0011\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0005\t\u0000\u0000\u0083\u0084\u0005#"+
		"\u0000\u0000\u0084\u0089\u0005\n\u0000\u0000\u0085\u0086\u0005\u000b\u0000"+
		"\u0000\u0086\u0087\u0005#\u0000\u0000\u0087\u0089\u0005\n\u0000\u0000"+
		"\u0088\u0082\u0001\u0000\u0000\u0000\u0088\u0085\u0001\u0000\u0000\u0000"+
		"\u0089\u0013\u0001\u0000\u0000\u0000\u008a\u008c\u0005#\u0000\u0000\u008b"+
		"\u008d\u0003\u0016\u000b\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u0001\u0000\u0000\u0000\u008d\u0098\u0001\u0000\u0000\u0000\u008e"+
		"\u0090\u0003\u0012\t\u0000\u008f\u0091\u0003\u0016\u000b\u0000\u0090\u008f"+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0098"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u0007\u0000\u0000\u0093\u0094"+
		"\u0003\u0002\u0001\u0000\u0094\u0095\u0005\b\u0000\u0000\u0095\u0096\u0003"+
		"\u0016\u000b\u0000\u0096\u0098\u0001\u0000\u0000\u0000\u0097\u008a\u0001"+
		"\u0000\u0000\u0000\u0097\u008e\u0001\u0000\u0000\u0000\u0097\u0092\u0001"+
		"\u0000\u0000\u0000\u0098\u0015\u0001\u0000\u0000\u0000\u0099\u009a\u0005"+
		"#\u0000\u0000\u009a\u0017\u0001\u0000\u0000\u0000\u009b\u009c\u0006\f"+
		"\uffff\uffff\u0000\u009c\u00a4\u0003\u001a\r\u0000\u009d\u009e\u0005\u001c"+
		"\u0000\u0000\u009e\u00a4\u0003\u0018\f\u0003\u009f\u00a0\u0005\u0007\u0000"+
		"\u0000\u00a0\u00a1\u0003\u0018\f\u0000\u00a1\u00a2\u0005\b\u0000\u0000"+
		"\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3\u009b\u0001\u0000\u0000\u0000"+
		"\u00a3\u009d\u0001\u0000\u0000\u0000\u00a3\u009f\u0001\u0000\u0000\u0000"+
		"\u00a4\u00aa\u0001\u0000\u0000\u0000\u00a5\u00a6\n\u0001\u0000\u0000\u00a6"+
		"\u00a7\u0007\u0001\u0000\u0000\u00a7\u00a9\u0003\u0018\f\u0002\u00a8\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa\u00a8"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u0019"+
		"\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0003\u0010\b\u0000\u00ae\u00af\u0005\u001e\u0000\u0000\u00af\u00b0\u0003"+
		"\u0010\b\u0000\u00b0\u00cc\u0001\u0000\u0000\u0000\u00b1\u00b2\u0003\u0010"+
		"\b\u0000\u00b2\u00b3\u0005\u0014\u0000\u0000\u00b3\u00b4\u0005\u0004\u0000"+
		"\u0000\u00b4\u00b5\u0003\u0012\t\u0000\u00b5\u00b6\u0005\u0005\u0000\u0000"+
		"\u00b6\u00cc\u0001\u0000\u0000\u0000\u00b7\u00b8\u0003\u0010\b\u0000\u00b8"+
		"\u00b9\u0005\u0019\u0000\u0000\u00b9\u00ba\u0003\u0010\b\u0000\u00ba\u00bb"+
		"\u0005\u0012\u0000\u0000\u00bb\u00bc\u0003\u0010\b\u0000\u00bc\u00cc\u0001"+
		"\u0000\u0000\u0000\u00bd\u00be\u0003\u0010\b\u0000\u00be\u00bf\u0005\u001a"+
		"\u0000\u0000\u00bf\u00c0\u0005\u001b\u0000\u0000\u00c0\u00cc\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0003\u0010\b\u0000\u00c2\u00c3\u0005\u001d\u0000"+
		"\u0000\u00c3\u00c4\u0005\f\u0000\u0000\u00c4\u00c5\u0003\u0010\b\u0000"+
		"\u00c5\u00c6\u0005\f\u0000\u0000\u00c6\u00cc\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c8\u0003\u0010\b\u0000\u00c8\u00c9\u0005\u0014\u0000\u0000\u00c9\u00ca"+
		"\u0005\u001f\u0000\u0000\u00ca\u00cc\u0001\u0000\u0000\u0000\u00cb\u00ad"+
		"\u0001\u0000\u0000\u0000\u00cb\u00b1\u0001\u0000\u0000\u0000\u00cb\u00b7"+
		"\u0001\u0000\u0000\u0000\u00cb\u00bd\u0001\u0000\u0000\u0000\u00cb\u00c1"+
		"\u0001\u0000\u0000\u0000\u00cb\u00c7\u0001\u0000\u0000\u0000\u00cc\u001b"+
		"\u0001\u0000\u0000\u0000\u001a $*-1369>CLQWY`ekw\u0080\u0088\u008c\u0090"+
		"\u0097\u00a3\u00aa\u00cb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}