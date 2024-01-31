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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, SELECT=8, FROM=9, 
		WHERE=10, LIMIT=11, OFFSET=12, AND=13, OR=14, IN=15, ORDER=16, BY=17, 
		DESC=18, ASC=19, OP=20, SET=21, DISTINCT=22, NUMBER=23, STRING=24, ID=25, 
		WS=26;
	public static final int
		RULE_root = 0, RULE_select = 1, RULE_limit = 2, RULE_offset = 3, RULE_orderBy = 4, 
		RULE_orderColumn = 5, RULE_columns = 6, RULE_column = 7, RULE_param = 8, 
		RULE_table = 9, RULE_conditions = 10, RULE_condition = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "select", "limit", "offset", "orderBy", "orderColumn", "columns", 
			"column", "param", "table", "conditions", "condition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "';'", "','", "'('", "')'", "'#{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "SELECT", "FROM", "WHERE", 
			"LIMIT", "OFFSET", "AND", "OR", "IN", "ORDER", "BY", "DESC", "ASC", "OP", 
			"SET", "DISTINCT", "NUMBER", "STRING", "ID", "WS"
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
			setState(24);
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
		public TerminalNode LIMIT() { return getToken(SQLNIParser.LIMIT, 0); }
		public LimitContext limit() {
			return getRuleContext(LimitContext.class,0);
		}
		public TerminalNode OFFSET() { return getToken(SQLNIParser.OFFSET, 0); }
		public OffsetContext offset() {
			return getRuleContext(OffsetContext.class,0);
		}
		public OrderByContext orderBy() {
			return getRuleContext(OrderByContext.class,0);
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
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				match(SELECT);
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT) {
					{
					setState(27);
					match(DISTINCT);
					}
				}

				setState(32);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(30);
					match(T__0);
					}
					break;
				case T__5:
				case NUMBER:
				case STRING:
				case ID:
					{
					setState(31);
					columns();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(34);
				match(FROM);
				setState(35);
				table();
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(36);
					match(WHERE);
					setState(37);
					conditions();
					}
				}

				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT) {
					{
					setState(40);
					match(LIMIT);
					setState(41);
					limit();
					}
				}

				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OFFSET) {
					{
					setState(44);
					match(OFFSET);
					setState(45);
					offset();
					}
				}

				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(48);
					orderBy();
					}
				}

				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(51);
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
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				_localctx = new ParamLimitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				param();
				}
				break;
			case NUMBER:
				_localctx = new NumberLimitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
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
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				_localctx = new ParamOffsetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				param();
				}
				break;
			case NUMBER:
				_localctx = new NumberOffsetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
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
		public OrderByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderBy; }
	 
		public OrderByContext() { }
		public void copyFrom(OrderByContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrderByColumnsContext extends OrderByContext {
		public TerminalNode ORDER() { return getToken(SQLNIParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SQLNIParser.BY, 0); }
		public List<OrderColumnContext> orderColumn() {
			return getRuleContexts(OrderColumnContext.class);
		}
		public OrderColumnContext orderColumn(int i) {
			return getRuleContext(OrderColumnContext.class,i);
		}
		public OrderByColumnsContext(OrderByContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterOrderByColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitOrderByColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitOrderByColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrderByParamContext extends OrderByContext {
		public TerminalNode ORDER() { return getToken(SQLNIParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SQLNIParser.BY, 0); }
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public OrderByParamContext(OrderByContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterOrderByParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitOrderByParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitOrderByParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByContext orderBy() throws RecognitionException {
		OrderByContext _localctx = new OrderByContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_orderBy);
		int _la;
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new OrderByColumnsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(ORDER);
				setState(66);
				match(BY);
				setState(67);
				orderColumn();
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(68);
					match(T__2);
					setState(69);
					orderColumn();
					}
					}
					setState(74);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new OrderByParamContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(ORDER);
				setState(76);
				match(BY);
				setState(77);
				param();
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
	public static class OrderColumnContext extends ParserRuleContext {
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SQLNIParser.DESC, 0); }
		public TerminalNode ASC() { return getToken(SQLNIParser.ASC, 0); }
		public OrderColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterOrderColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitOrderColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitOrderColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderColumnContext orderColumn() throws RecognitionException {
		OrderColumnContext _localctx = new OrderColumnContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_orderColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			column();
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DESC || _la==ASC) {
				{
				setState(81);
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
			setState(84);
			column();
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(85);
				match(T__2);
				setState(86);
				column();
				}
				}
				setState(91);
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
		public TerminalNode ID() { return getToken(SQLNIParser.ID, 0); }
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
		public ColumnsContext columns() {
			return getRuleContext(ColumnsContext.class,0);
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
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new NormalColumnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ParamColumnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				param();
				}
				break;
			case 3:
				_localctx = new StringConstContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new NumberConstContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				match(NUMBER);
				}
				break;
			case 5:
				_localctx = new FuncColumnContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(96);
				match(ID);
				setState(97);
				match(T__3);
				setState(98);
				columns();
				setState(99);
				match(T__4);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__5);
			setState(104);
			match(ID);
			setState(105);
			match(T__6);
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
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new ConstTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(ID);
				}
				break;
			case T__5:
				_localctx = new ParamTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				param();
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
		enterRule(_localctx, 20, RULE_conditions);
		int _la;
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new SingleConditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				condition();
				}
				break;
			case 2:
				_localctx = new MultiCondtionsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				condition();
				setState(113);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(114);
				conditions();
				}
				break;
			case 3:
				_localctx = new SubConditionsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				condition();
				setState(117);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(118);
				match(T__3);
				setState(119);
				conditions();
				setState(120);
				match(T__4);
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
	public static class InParamConditionContext extends ConditionContext {
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public TerminalNode IN() { return getToken(SQLNIParser.IN, 0); }
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public InParamConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterInParamCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitInParamCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitInParamCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condition);
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new CmpConditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				column();
				setState(125);
				match(OP);
				setState(126);
				column();
				}
				break;
			case 2:
				_localctx = new InParamConditionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				column();
				setState(129);
				match(IN);
				setState(130);
				param();
				}
				break;
			case 3:
				_localctx = new InSetConditionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				column();
				setState(133);
				match(IN);
				setState(134);
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
		"\u0004\u0001\u001a\u008b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001\u001d\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001!\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\'\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001+\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001/\b\u0001\u0001"+
		"\u0001\u0003\u00012\b\u0001\u0001\u0001\u0003\u00015\b\u0001\u0001\u0001"+
		"\u0003\u00018\b\u0001\u0001\u0002\u0001\u0002\u0003\u0002<\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0003\u0003@\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004G\b\u0004\n\u0004\f\u0004J\t"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004O\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0003\u0005S\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006X\b\u0006\n\u0006\f\u0006[\t\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007f\b\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0003\tn\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n{\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u0089\b\u000b\u0001\u000b\u0000\u0000\f\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0002\u0001\u0000\u0012\u0013"+
		"\u0001\u0000\r\u000e\u0095\u0000\u0018\u0001\u0000\u0000\u0000\u00027"+
		"\u0001\u0000\u0000\u0000\u0004;\u0001\u0000\u0000\u0000\u0006?\u0001\u0000"+
		"\u0000\u0000\bN\u0001\u0000\u0000\u0000\nP\u0001\u0000\u0000\u0000\fT"+
		"\u0001\u0000\u0000\u0000\u000ee\u0001\u0000\u0000\u0000\u0010g\u0001\u0000"+
		"\u0000\u0000\u0012m\u0001\u0000\u0000\u0000\u0014z\u0001\u0000\u0000\u0000"+
		"\u0016\u0088\u0001\u0000\u0000\u0000\u0018\u0019\u0003\u0002\u0001\u0000"+
		"\u0019\u0001\u0001\u0000\u0000\u0000\u001a\u001c\u0005\b\u0000\u0000\u001b"+
		"\u001d\u0005\u0016\u0000\u0000\u001c\u001b\u0001\u0000\u0000\u0000\u001c"+
		"\u001d\u0001\u0000\u0000\u0000\u001d \u0001\u0000\u0000\u0000\u001e!\u0005"+
		"\u0001\u0000\u0000\u001f!\u0003\f\u0006\u0000 \u001e\u0001\u0000\u0000"+
		"\u0000 \u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"#\u0005"+
		"\t\u0000\u0000#&\u0003\u0012\t\u0000$%\u0005\n\u0000\u0000%\'\u0003\u0014"+
		"\n\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'*\u0001"+
		"\u0000\u0000\u0000()\u0005\u000b\u0000\u0000)+\u0003\u0004\u0002\u0000"+
		"*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+.\u0001\u0000\u0000"+
		"\u0000,-\u0005\f\u0000\u0000-/\u0003\u0006\u0003\u0000.,\u0001\u0000\u0000"+
		"\u0000./\u0001\u0000\u0000\u0000/1\u0001\u0000\u0000\u000002\u0003\b\u0004"+
		"\u000010\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000024\u0001\u0000"+
		"\u0000\u000035\u0005\u0002\u0000\u000043\u0001\u0000\u0000\u000045\u0001"+
		"\u0000\u0000\u000058\u0001\u0000\u0000\u000068\u0001\u0000\u0000\u0000"+
		"7\u001a\u0001\u0000\u0000\u000076\u0001\u0000\u0000\u00008\u0003\u0001"+
		"\u0000\u0000\u00009<\u0003\u0010\b\u0000:<\u0005\u0017\u0000\u0000;9\u0001"+
		"\u0000\u0000\u0000;:\u0001\u0000\u0000\u0000<\u0005\u0001\u0000\u0000"+
		"\u0000=@\u0003\u0010\b\u0000>@\u0005\u0017\u0000\u0000?=\u0001\u0000\u0000"+
		"\u0000?>\u0001\u0000\u0000\u0000@\u0007\u0001\u0000\u0000\u0000AB\u0005"+
		"\u0010\u0000\u0000BC\u0005\u0011\u0000\u0000CH\u0003\n\u0005\u0000DE\u0005"+
		"\u0003\u0000\u0000EG\u0003\n\u0005\u0000FD\u0001\u0000\u0000\u0000GJ\u0001"+
		"\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000"+
		"IO\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000KL\u0005\u0010\u0000"+
		"\u0000LM\u0005\u0011\u0000\u0000MO\u0003\u0010\b\u0000NA\u0001\u0000\u0000"+
		"\u0000NK\u0001\u0000\u0000\u0000O\t\u0001\u0000\u0000\u0000PR\u0003\u000e"+
		"\u0007\u0000QS\u0007\u0000\u0000\u0000RQ\u0001\u0000\u0000\u0000RS\u0001"+
		"\u0000\u0000\u0000S\u000b\u0001\u0000\u0000\u0000TY\u0003\u000e\u0007"+
		"\u0000UV\u0005\u0003\u0000\u0000VX\u0003\u000e\u0007\u0000WU\u0001\u0000"+
		"\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001"+
		"\u0000\u0000\u0000Z\r\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000"+
		"\\f\u0005\u0019\u0000\u0000]f\u0003\u0010\b\u0000^f\u0005\u0018\u0000"+
		"\u0000_f\u0005\u0017\u0000\u0000`a\u0005\u0019\u0000\u0000ab\u0005\u0004"+
		"\u0000\u0000bc\u0003\f\u0006\u0000cd\u0005\u0005\u0000\u0000df\u0001\u0000"+
		"\u0000\u0000e\\\u0001\u0000\u0000\u0000e]\u0001\u0000\u0000\u0000e^\u0001"+
		"\u0000\u0000\u0000e_\u0001\u0000\u0000\u0000e`\u0001\u0000\u0000\u0000"+
		"f\u000f\u0001\u0000\u0000\u0000gh\u0005\u0006\u0000\u0000hi\u0005\u0019"+
		"\u0000\u0000ij\u0005\u0007\u0000\u0000j\u0011\u0001\u0000\u0000\u0000"+
		"kn\u0005\u0019\u0000\u0000ln\u0003\u0010\b\u0000mk\u0001\u0000\u0000\u0000"+
		"ml\u0001\u0000\u0000\u0000n\u0013\u0001\u0000\u0000\u0000o{\u0003\u0016"+
		"\u000b\u0000pq\u0003\u0016\u000b\u0000qr\u0007\u0001\u0000\u0000rs\u0003"+
		"\u0014\n\u0000s{\u0001\u0000\u0000\u0000tu\u0003\u0016\u000b\u0000uv\u0007"+
		"\u0001\u0000\u0000vw\u0005\u0004\u0000\u0000wx\u0003\u0014\n\u0000xy\u0005"+
		"\u0005\u0000\u0000y{\u0001\u0000\u0000\u0000zo\u0001\u0000\u0000\u0000"+
		"zp\u0001\u0000\u0000\u0000zt\u0001\u0000\u0000\u0000{\u0015\u0001\u0000"+
		"\u0000\u0000|}\u0003\u000e\u0007\u0000}~\u0005\u0014\u0000\u0000~\u007f"+
		"\u0003\u000e\u0007\u0000\u007f\u0089\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0003\u000e\u0007\u0000\u0081\u0082\u0005\u000f\u0000\u0000\u0082\u0083"+
		"\u0003\u0010\b\u0000\u0083\u0089\u0001\u0000\u0000\u0000\u0084\u0085\u0003"+
		"\u000e\u0007\u0000\u0085\u0086\u0005\u000f\u0000\u0000\u0086\u0087\u0005"+
		"\u0015\u0000\u0000\u0087\u0089\u0001\u0000\u0000\u0000\u0088|\u0001\u0000"+
		"\u0000\u0000\u0088\u0080\u0001\u0000\u0000\u0000\u0088\u0084\u0001\u0000"+
		"\u0000\u0000\u0089\u0017\u0001\u0000\u0000\u0000\u0012\u001c &*.147;?"+
		"HNRYemz\u0088";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}