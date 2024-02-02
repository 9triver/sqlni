package com.kekwy.sqlni.parser;// Generated from E:/projects/sqlni/src/main/antlr/SQLNI.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SQLNILexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, SELECT=12, FROM=13, WHERE=14, LIMIT=15, OFFSET=16, 
		AND=17, OR=18, IN=19, ORDER=20, BY=21, DESC=22, ASC=23, AS=24, BETWEEN=25, 
		IS=26, NULL=27, NOT=28, OP=29, SET=30, DISTINCT=31, NUMBER=32, STRING=33, 
		ID=34, WS=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "SELECT", "FROM", "WHERE", "LIMIT", "OFFSET", "AND", 
			"OR", "IN", "ORDER", "BY", "DESC", "ASC", "AS", "BETWEEN", "IS", "NULL", 
			"NOT", "OP", "SET", "DISTINCT", "NUMBER", "INT", "EXP", "STRING", "ID", 
			"WS", "ESC"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "';'", "','", "'['", "']'", "'.'", "'('", "')'", "'#{'", 
			"'}'", "'${'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"SELECT", "FROM", "WHERE", "LIMIT", "OFFSET", "AND", "OR", "IN", "ORDER", 
			"BY", "DESC", "ASC", "AS", "BETWEEN", "IS", "NULL", "NOT", "OP", "SET", 
			"DISTINCT", "NUMBER", "STRING", "ID", "WS"
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


	public SQLNILexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SQLNI.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000#\u0112\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u00c1\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0003\u001f\u00d1\b\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u00d7\b\u001f\u0001\u001f"+
		"\u0003\u001f\u00da\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0003\u001f\u00e0\b\u001f\u0001\u001f\u0003\u001f\u00e3\b\u001f\u0001"+
		" \u0001 \u0001 \u0005 \u00e8\b \n \f \u00eb\t \u0003 \u00ed\b \u0001!"+
		"\u0001!\u0003!\u00f1\b!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0005\""+
		"\u00f8\b\"\n\"\f\"\u00fb\t\"\u0001\"\u0001\"\u0001#\u0001#\u0005#\u0101"+
		"\b#\n#\f#\u0104\t#\u0001$\u0004$\u0107\b$\u000b$\f$\u0108\u0001$\u0001"+
		"$\u0001%\u0001%\u0001%\u0001%\u0003%\u0111\b%\u0001\u00f9\u0000&\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/"+
		"\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A\u0000C\u0000"+
		"E!G\"I#K\u0000\u0001\u0000\u0018\u0002\u0000SSss\u0002\u0000EEee\u0002"+
		"\u0000LLll\u0002\u0000CCcc\u0002\u0000TTtt\u0002\u0000FFff\u0002\u0000"+
		"RRrr\u0002\u0000OOoo\u0002\u0000MMmm\u0002\u0000WWww\u0002\u0000HHhh\u0002"+
		"\u0000IIii\u0002\u0000AAaa\u0002\u0000NNnn\u0002\u0000DDdd\u0002\u0000"+
		"BBbb\u0002\u0000YYyy\u0002\u0000UUuu\u0001\u000019\u0001\u000009\u0002"+
		"\u0000++--\u0002\u0000AZaz\u0004\u000009AZ__az\u0003\u0000\t\n\r\r  \u0121"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000"+
		"\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000="+
		"\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000E\u0001\u0000"+
		"\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000"+
		"\u0001M\u0001\u0000\u0000\u0000\u0003O\u0001\u0000\u0000\u0000\u0005Q"+
		"\u0001\u0000\u0000\u0000\u0007S\u0001\u0000\u0000\u0000\tU\u0001\u0000"+
		"\u0000\u0000\u000bW\u0001\u0000\u0000\u0000\rY\u0001\u0000\u0000\u0000"+
		"\u000f[\u0001\u0000\u0000\u0000\u0011]\u0001\u0000\u0000\u0000\u0013`"+
		"\u0001\u0000\u0000\u0000\u0015b\u0001\u0000\u0000\u0000\u0017e\u0001\u0000"+
		"\u0000\u0000\u0019l\u0001\u0000\u0000\u0000\u001bq\u0001\u0000\u0000\u0000"+
		"\u001dw\u0001\u0000\u0000\u0000\u001f}\u0001\u0000\u0000\u0000!\u0084"+
		"\u0001\u0000\u0000\u0000#\u0088\u0001\u0000\u0000\u0000%\u008b\u0001\u0000"+
		"\u0000\u0000\'\u008e\u0001\u0000\u0000\u0000)\u0094\u0001\u0000\u0000"+
		"\u0000+\u0097\u0001\u0000\u0000\u0000-\u009c\u0001\u0000\u0000\u0000/"+
		"\u00a0\u0001\u0000\u0000\u00001\u00a3\u0001\u0000\u0000\u00003\u00ab\u0001"+
		"\u0000\u0000\u00005\u00ae\u0001\u0000\u0000\u00007\u00b3\u0001\u0000\u0000"+
		"\u00009\u00c0\u0001\u0000\u0000\u0000;\u00c2\u0001\u0000\u0000\u0000="+
		"\u00c6\u0001\u0000\u0000\u0000?\u00e2\u0001\u0000\u0000\u0000A\u00ec\u0001"+
		"\u0000\u0000\u0000C\u00ee\u0001\u0000\u0000\u0000E\u00f4\u0001\u0000\u0000"+
		"\u0000G\u00fe\u0001\u0000\u0000\u0000I\u0106\u0001\u0000\u0000\u0000K"+
		"\u0110\u0001\u0000\u0000\u0000MN\u0005*\u0000\u0000N\u0002\u0001\u0000"+
		"\u0000\u0000OP\u0005;\u0000\u0000P\u0004\u0001\u0000\u0000\u0000QR\u0005"+
		",\u0000\u0000R\u0006\u0001\u0000\u0000\u0000ST\u0005[\u0000\u0000T\b\u0001"+
		"\u0000\u0000\u0000UV\u0005]\u0000\u0000V\n\u0001\u0000\u0000\u0000WX\u0005"+
		".\u0000\u0000X\f\u0001\u0000\u0000\u0000YZ\u0005(\u0000\u0000Z\u000e\u0001"+
		"\u0000\u0000\u0000[\\\u0005)\u0000\u0000\\\u0010\u0001\u0000\u0000\u0000"+
		"]^\u0005#\u0000\u0000^_\u0005{\u0000\u0000_\u0012\u0001\u0000\u0000\u0000"+
		"`a\u0005}\u0000\u0000a\u0014\u0001\u0000\u0000\u0000bc\u0005$\u0000\u0000"+
		"cd\u0005{\u0000\u0000d\u0016\u0001\u0000\u0000\u0000ef\u0007\u0000\u0000"+
		"\u0000fg\u0007\u0001\u0000\u0000gh\u0007\u0002\u0000\u0000hi\u0007\u0001"+
		"\u0000\u0000ij\u0007\u0003\u0000\u0000jk\u0007\u0004\u0000\u0000k\u0018"+
		"\u0001\u0000\u0000\u0000lm\u0007\u0005\u0000\u0000mn\u0007\u0006\u0000"+
		"\u0000no\u0007\u0007\u0000\u0000op\u0007\b\u0000\u0000p\u001a\u0001\u0000"+
		"\u0000\u0000qr\u0007\t\u0000\u0000rs\u0007\n\u0000\u0000st\u0007\u0001"+
		"\u0000\u0000tu\u0007\u0006\u0000\u0000uv\u0007\u0001\u0000\u0000v\u001c"+
		"\u0001\u0000\u0000\u0000wx\u0007\u0002\u0000\u0000xy\u0007\u000b\u0000"+
		"\u0000yz\u0007\b\u0000\u0000z{\u0007\u000b\u0000\u0000{|\u0007\u0004\u0000"+
		"\u0000|\u001e\u0001\u0000\u0000\u0000}~\u0007\u0007\u0000\u0000~\u007f"+
		"\u0007\u0005\u0000\u0000\u007f\u0080\u0007\u0005\u0000\u0000\u0080\u0081"+
		"\u0007\u0000\u0000\u0000\u0081\u0082\u0007\u0001\u0000\u0000\u0082\u0083"+
		"\u0007\u0004\u0000\u0000\u0083 \u0001\u0000\u0000\u0000\u0084\u0085\u0007"+
		"\f\u0000\u0000\u0085\u0086\u0007\r\u0000\u0000\u0086\u0087\u0007\u000e"+
		"\u0000\u0000\u0087\"\u0001\u0000\u0000\u0000\u0088\u0089\u0007\u0007\u0000"+
		"\u0000\u0089\u008a\u0007\u0006\u0000\u0000\u008a$\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0007\u000b\u0000\u0000\u008c\u008d\u0007\r\u0000\u0000\u008d"+
		"&\u0001\u0000\u0000\u0000\u008e\u008f\u0007\u0007\u0000\u0000\u008f\u0090"+
		"\u0007\u0006\u0000\u0000\u0090\u0091\u0007\u000e\u0000\u0000\u0091\u0092"+
		"\u0007\u0001\u0000\u0000\u0092\u0093\u0007\u0006\u0000\u0000\u0093(\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0007\u000f\u0000\u0000\u0095\u0096\u0007"+
		"\u0010\u0000\u0000\u0096*\u0001\u0000\u0000\u0000\u0097\u0098\u0007\u000e"+
		"\u0000\u0000\u0098\u0099\u0007\u0001\u0000\u0000\u0099\u009a\u0007\u0000"+
		"\u0000\u0000\u009a\u009b\u0007\u0003\u0000\u0000\u009b,\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0007\f\u0000\u0000\u009d\u009e\u0007\u0000\u0000\u0000"+
		"\u009e\u009f\u0007\u0003\u0000\u0000\u009f.\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a1\u0007\f\u0000\u0000\u00a1\u00a2\u0007\u0000\u0000\u0000\u00a20"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0007\u000f\u0000\u0000\u00a4\u00a5"+
		"\u0007\u0001\u0000\u0000\u00a5\u00a6\u0007\u0004\u0000\u0000\u00a6\u00a7"+
		"\u0007\t\u0000\u0000\u00a7\u00a8\u0007\u0001\u0000\u0000\u00a8\u00a9\u0007"+
		"\u0001\u0000\u0000\u00a9\u00aa\u0007\r\u0000\u0000\u00aa2\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u0007\u000b\u0000\u0000\u00ac\u00ad\u0007\u0000"+
		"\u0000\u0000\u00ad4\u0001\u0000\u0000\u0000\u00ae\u00af\u0007\r\u0000"+
		"\u0000\u00af\u00b0\u0007\u0011\u0000\u0000\u00b0\u00b1\u0007\u0002\u0000"+
		"\u0000\u00b1\u00b2\u0007\u0002\u0000\u0000\u00b26\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b4\u0007\r\u0000\u0000\u00b4\u00b5\u0007\u0007\u0000\u0000\u00b5"+
		"\u00b6\u0007\u0004\u0000\u0000\u00b68\u0001\u0000\u0000\u0000\u00b7\u00c1"+
		"\u0005=\u0000\u0000\u00b8\u00b9\u0005!\u0000\u0000\u00b9\u00c1\u0005="+
		"\u0000\u0000\u00ba\u00c1\u0005<\u0000\u0000\u00bb\u00bc\u0005<\u0000\u0000"+
		"\u00bc\u00c1\u0005=\u0000\u0000\u00bd\u00c1\u0005>\u0000\u0000\u00be\u00bf"+
		"\u0005>\u0000\u0000\u00bf\u00c1\u0005=\u0000\u0000\u00c0\u00b7\u0001\u0000"+
		"\u0000\u0000\u00c0\u00b8\u0001\u0000\u0000\u0000\u00c0\u00ba\u0001\u0000"+
		"\u0000\u0000\u00c0\u00bb\u0001\u0000\u0000\u0000\u00c0\u00bd\u0001\u0000"+
		"\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1:\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c3\u0007\u0000\u0000\u0000\u00c3\u00c4\u0007\u0001\u0000"+
		"\u0000\u00c4\u00c5\u0007\u0004\u0000\u0000\u00c5<\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c7\u0007\u000e\u0000\u0000\u00c7\u00c8\u0007\u000b\u0000\u0000"+
		"\u00c8\u00c9\u0007\u0000\u0000\u0000\u00c9\u00ca\u0007\u0004\u0000\u0000"+
		"\u00ca\u00cb\u0007\u000b\u0000\u0000\u00cb\u00cc\u0007\r\u0000\u0000\u00cc"+
		"\u00cd\u0007\u0003\u0000\u0000\u00cd\u00ce\u0007\u0004\u0000\u0000\u00ce"+
		">\u0001\u0000\u0000\u0000\u00cf\u00d1\u0005-\u0000\u0000\u00d0\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d3\u0003A \u0000\u00d3\u00d4\u0005.\u0000"+
		"\u0000\u00d4\u00d6\u0003A \u0000\u00d5\u00d7\u0003C!\u0000\u00d6\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00e3"+
		"\u0001\u0000\u0000\u0000\u00d8\u00da\u0005-\u0000\u0000\u00d9\u00d8\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00db\u0001"+
		"\u0000\u0000\u0000\u00db\u00dc\u0003A \u0000\u00dc\u00dd\u0003C!\u0000"+
		"\u00dd\u00e3\u0001\u0000\u0000\u0000\u00de\u00e0\u0005-\u0000\u0000\u00df"+
		"\u00de\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e3\u0003A \u0000\u00e2\u00d0\u0001"+
		"\u0000\u0000\u0000\u00e2\u00d9\u0001\u0000\u0000\u0000\u00e2\u00df\u0001"+
		"\u0000\u0000\u0000\u00e3@\u0001\u0000\u0000\u0000\u00e4\u00ed\u00050\u0000"+
		"\u0000\u00e5\u00e9\u0007\u0012\u0000\u0000\u00e6\u00e8\u0007\u0013\u0000"+
		"\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8\u00eb\u0001\u0000\u0000"+
		"\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000"+
		"\u0000\u00ec\u00e4\u0001\u0000\u0000\u0000\u00ec\u00e5\u0001\u0000\u0000"+
		"\u0000\u00edB\u0001\u0000\u0000\u0000\u00ee\u00f0\u0007\u0001\u0000\u0000"+
		"\u00ef\u00f1\u0007\u0014\u0000\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f3\u0003A \u0000\u00f3D\u0001\u0000\u0000\u0000\u00f4\u00f9"+
		"\u0005\'\u0000\u0000\u00f5\u00f8\u0003K%\u0000\u00f6\u00f8\t\u0000\u0000"+
		"\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000"+
		"\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00fa\u00fc\u0001\u0000\u0000"+
		"\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005\'\u0000\u0000"+
		"\u00fdF\u0001\u0000\u0000\u0000\u00fe\u0102\u0007\u0015\u0000\u0000\u00ff"+
		"\u0101\u0007\u0016\u0000\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0101"+
		"\u0104\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102"+
		"\u0103\u0001\u0000\u0000\u0000\u0103H\u0001\u0000\u0000\u0000\u0104\u0102"+
		"\u0001\u0000\u0000\u0000\u0105\u0107\u0007\u0017\u0000\u0000\u0106\u0105"+
		"\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u0106"+
		"\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010a"+
		"\u0001\u0000\u0000\u0000\u010a\u010b\u0006$\u0000\u0000\u010bJ\u0001\u0000"+
		"\u0000\u0000\u010c\u010d\u0005\\\u0000\u0000\u010d\u0111\u0005\"\u0000"+
		"\u0000\u010e\u010f\u0005\\\u0000\u0000\u010f\u0111\u0005\\\u0000\u0000"+
		"\u0110\u010c\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000"+
		"\u0111L\u0001\u0000\u0000\u0000\u000f\u0000\u00c0\u00d0\u00d6\u00d9\u00df"+
		"\u00e2\u00e9\u00ec\u00f0\u00f7\u00f9\u0102\u0108\u0110\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}