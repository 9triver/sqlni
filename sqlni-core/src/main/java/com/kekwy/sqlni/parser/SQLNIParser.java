package com.kekwy.sqlni.parser;// Generated from E:/projects/sqlni/sqlni-core/src/main/resources/SQLNI.g4 by ANTLR 4.13.1
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
		IN=18, SET=19, DISTINCT=20, NUMBER=21, INT=22, STRING=23, ID=24, WS=25;
	public static final int
		RULE_root = 0, RULE_select = 1, RULE_limit = 2, RULE_columns = 3, RULE_column = 4, 
		RULE_param = 5, RULE_table = 6, RULE_conditions = 7, RULE_condition = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "select", "limit", "columns", "column", "param", "table", "conditions", 
			"condition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "';'", "','", "'('", "')'", "'#{'", "'}'", "'='", "'<'", 
			"'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "SELECT", 
			"FROM", "WHERE", "LIMIT", "OFFSET", "AND", "OR", "IN", "SET", "DISTINCT", 
			"NUMBER", "INT", "STRING", "ID", "WS"
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
			setState(18);
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
		public LimitContext limit() {
			return getRuleContext(LimitContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(SELECT);
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(21);
				match(DISTINCT);
				}
			}

			setState(26);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(24);
				match(T__0);
				}
				break;
			case 2:
				{
				setState(25);
				columns();
				}
				break;
			}
			setState(28);
			match(FROM);
			setState(29);
			table();
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(30);
				match(WHERE);
				setState(31);
				conditions();
				}
			}

			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(34);
				limit();
				}
			}

			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(37);
				match(T__1);
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
	public static class LimitContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(SQLNIParser.LIMIT, 0); }
		public List<TerminalNode> INT() { return getTokens(SQLNIParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SQLNIParser.INT, i);
		}
		public TerminalNode OFFSET() { return getToken(SQLNIParser.OFFSET, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(LIMIT);
			setState(41);
			match(INT);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(42);
				match(OFFSET);
				setState(43);
				match(INT);
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
		public ColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columns; }
	 
		public ColumnsContext() { }
		public void copyFrom(ColumnsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CertainColumnsContext extends ColumnsContext {
		public List<ColumnContext> column() {
			return getRuleContexts(ColumnContext.class);
		}
		public ColumnContext column(int i) {
			return getRuleContext(ColumnContext.class,i);
		}
		public CertainColumnsContext(ColumnsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterCertainColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitCertainColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitCertainColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AllColumnsContext extends ColumnsContext {
		public AllColumnsContext(ColumnsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterAllColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitAllColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitAllColumns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnsContext columns() throws RecognitionException {
		ColumnsContext _localctx = new ColumnsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_columns);
		int _la;
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new AllColumnsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				match(T__0);
				}
				break;
			case T__5:
			case NUMBER:
			case STRING:
			case ID:
				_localctx = new CertainColumnsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(47);
				column();
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(48);
					match(T__2);
					setState(49);
					column();
					}
					}
					setState(54);
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
	public static class ConstColumnContext extends ColumnContext {
		public TerminalNode ID() { return getToken(SQLNIParser.ID, 0); }
		public ConstColumnContext(ColumnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).enterConstColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLNIListener ) ((SQLNIListener)listener).exitConstColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLNIVisitor) return ((SQLNIVisitor<? extends T>)visitor).visitConstColumn(this);
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
		enterRule(_localctx, 8, RULE_column);
		int _la;
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new ConstColumnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ParamColumnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				param();
				}
				break;
			case 3:
				_localctx = new StringConstContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new NumberConstContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				match(NUMBER);
				}
				break;
			case 5:
				_localctx = new FuncColumnContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(61);
				match(ID);
				setState(62);
				match(T__3);
				setState(63);
				column();
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(64);
					match(T__2);
					setState(65);
					column();
					}
					}
					setState(70);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(71);
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
		enterRule(_localctx, 10, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__5);
			setState(76);
			match(ID);
			setState(77);
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
		enterRule(_localctx, 12, RULE_table);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new ConstTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(ID);
				}
				break;
			case T__5:
				_localctx = new ParamTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
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
		enterRule(_localctx, 14, RULE_conditions);
		int _la;
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new SingleConditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				condition();
				}
				break;
			case 2:
				_localctx = new MultiCondtionsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				condition();
				setState(85);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(86);
				conditions();
				}
				break;
			case 3:
				_localctx = new SubConditionsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				condition();
				setState(89);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(90);
				match(T__3);
				setState(91);
				conditions();
				setState(92);
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
		enterRule(_localctx, 16, RULE_condition);
		int _la;
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new CmpConditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				column();
				setState(97);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1792L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(98);
				column();
				}
				break;
			case 2:
				_localctx = new InParamConditionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				column();
				setState(101);
				match(IN);
				setState(102);
				param();
				}
				break;
			case 3:
				_localctx = new InSetConditionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				column();
				setState(105);
				match(IN);
				setState(106);
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
		"\u0004\u0001\u0019o\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u0017\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001b\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001!\b\u0001\u0001"+
		"\u0001\u0003\u0001$\b\u0001\u0001\u0001\u0003\u0001\'\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002-\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u00033\b\u0003\n\u0003\f\u0003"+
		"6\t\u0003\u0003\u00038\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004C\b\u0004\n\u0004\f\u0004F\t\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004J\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0003\u0006R\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007_\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\bm\b\b\u0001\b\u0000\u0000\t\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0000\u0002\u0001\u0000\u0010\u0011\u0001\u0000\b\nw\u0000\u0012"+
		"\u0001\u0000\u0000\u0000\u0002\u0014\u0001\u0000\u0000\u0000\u0004(\u0001"+
		"\u0000\u0000\u0000\u00067\u0001\u0000\u0000\u0000\bI\u0001\u0000\u0000"+
		"\u0000\nK\u0001\u0000\u0000\u0000\fQ\u0001\u0000\u0000\u0000\u000e^\u0001"+
		"\u0000\u0000\u0000\u0010l\u0001\u0000\u0000\u0000\u0012\u0013\u0003\u0002"+
		"\u0001\u0000\u0013\u0001\u0001\u0000\u0000\u0000\u0014\u0016\u0005\u000b"+
		"\u0000\u0000\u0015\u0017\u0005\u0014\u0000\u0000\u0016\u0015\u0001\u0000"+
		"\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u001a\u0001\u0000"+
		"\u0000\u0000\u0018\u001b\u0005\u0001\u0000\u0000\u0019\u001b\u0003\u0006"+
		"\u0003\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001a\u0019\u0001\u0000"+
		"\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001d\u0005\f\u0000"+
		"\u0000\u001d \u0003\f\u0006\u0000\u001e\u001f\u0005\r\u0000\u0000\u001f"+
		"!\u0003\u000e\u0007\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001\u0000"+
		"\u0000\u0000!#\u0001\u0000\u0000\u0000\"$\u0003\u0004\u0002\u0000#\"\u0001"+
		"\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$&\u0001\u0000\u0000\u0000"+
		"%\'\u0005\u0002\u0000\u0000&%\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000"+
		"\u0000\'\u0003\u0001\u0000\u0000\u0000()\u0005\u000e\u0000\u0000),\u0005"+
		"\u0016\u0000\u0000*+\u0005\u000f\u0000\u0000+-\u0005\u0016\u0000\u0000"+
		",*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-\u0005\u0001\u0000"+
		"\u0000\u0000.8\u0005\u0001\u0000\u0000/4\u0003\b\u0004\u000001\u0005\u0003"+
		"\u0000\u000013\u0003\b\u0004\u000020\u0001\u0000\u0000\u000036\u0001\u0000"+
		"\u0000\u000042\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000058\u0001"+
		"\u0000\u0000\u000064\u0001\u0000\u0000\u00007.\u0001\u0000\u0000\u0000"+
		"7/\u0001\u0000\u0000\u00008\u0007\u0001\u0000\u0000\u00009J\u0005\u0018"+
		"\u0000\u0000:J\u0003\n\u0005\u0000;J\u0005\u0017\u0000\u0000<J\u0005\u0015"+
		"\u0000\u0000=>\u0005\u0018\u0000\u0000>?\u0005\u0004\u0000\u0000?D\u0003"+
		"\b\u0004\u0000@A\u0005\u0003\u0000\u0000AC\u0003\b\u0004\u0000B@\u0001"+
		"\u0000\u0000\u0000CF\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000"+
		"DE\u0001\u0000\u0000\u0000EG\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000"+
		"\u0000GH\u0005\u0005\u0000\u0000HJ\u0001\u0000\u0000\u0000I9\u0001\u0000"+
		"\u0000\u0000I:\u0001\u0000\u0000\u0000I;\u0001\u0000\u0000\u0000I<\u0001"+
		"\u0000\u0000\u0000I=\u0001\u0000\u0000\u0000J\t\u0001\u0000\u0000\u0000"+
		"KL\u0005\u0006\u0000\u0000LM\u0005\u0018\u0000\u0000MN\u0005\u0007\u0000"+
		"\u0000N\u000b\u0001\u0000\u0000\u0000OR\u0005\u0018\u0000\u0000PR\u0003"+
		"\n\u0005\u0000QO\u0001\u0000\u0000\u0000QP\u0001\u0000\u0000\u0000R\r"+
		"\u0001\u0000\u0000\u0000S_\u0003\u0010\b\u0000TU\u0003\u0010\b\u0000U"+
		"V\u0007\u0000\u0000\u0000VW\u0003\u000e\u0007\u0000W_\u0001\u0000\u0000"+
		"\u0000XY\u0003\u0010\b\u0000YZ\u0007\u0000\u0000\u0000Z[\u0005\u0004\u0000"+
		"\u0000[\\\u0003\u000e\u0007\u0000\\]\u0005\u0005\u0000\u0000]_\u0001\u0000"+
		"\u0000\u0000^S\u0001\u0000\u0000\u0000^T\u0001\u0000\u0000\u0000^X\u0001"+
		"\u0000\u0000\u0000_\u000f\u0001\u0000\u0000\u0000`a\u0003\b\u0004\u0000"+
		"ab\u0007\u0001\u0000\u0000bc\u0003\b\u0004\u0000cm\u0001\u0000\u0000\u0000"+
		"de\u0003\b\u0004\u0000ef\u0005\u0012\u0000\u0000fg\u0003\n\u0005\u0000"+
		"gm\u0001\u0000\u0000\u0000hi\u0003\b\u0004\u0000ij\u0005\u0012\u0000\u0000"+
		"jk\u0005\u0013\u0000\u0000km\u0001\u0000\u0000\u0000l`\u0001\u0000\u0000"+
		"\u0000ld\u0001\u0000\u0000\u0000lh\u0001\u0000\u0000\u0000m\u0011\u0001"+
		"\u0000\u0000\u0000\r\u0016\u001a #&,47DIQ^l";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}