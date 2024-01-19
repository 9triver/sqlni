package com.kekwy.sqlni.parser;// Generated from E:/projects/sqlni/sqlni-core/src/main/resources/SQLNI.g4 by ANTLR 4.13.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, SELECT=6, FROM=7, WHERE=8, AND=9, 
		OR=10, STRING=11, ID=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "SELECT", "FROM", "WHERE", "AND", 
			"OR", "STRING", "ID", "WS", "ESC"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'*'", "','", "'#{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "SELECT", "FROM", "WHERE", "AND", 
			"OR", "STRING", "ID", "WS"
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
		"\u0004\u0000\r_\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0005\nE\b\n\n\n\f\nH\t\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000bN\b\u000b\n\u000b\f\u000b"+
		"Q\t\u000b\u0001\f\u0004\fT\b\f\u000b\f\f\fU\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r^\b\r\u0001F\u0000\u000e\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u0000\u0001\u0000\u0011\u0002\u0000"+
		"SSss\u0002\u0000EEee\u0002\u0000LLll\u0002\u0000CCcc\u0002\u0000TTtt\u0002"+
		"\u0000FFff\u0002\u0000RRrr\u0002\u0000OOoo\u0002\u0000MMmm\u0002\u0000"+
		"WWww\u0002\u0000HHhh\u0002\u0000AAaa\u0002\u0000NNnn\u0002\u0000DDdd\u0002"+
		"\u0000AZaz\u0004\u000009AZ__az\u0003\u0000\t\n\r\r  b\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0001\u001d\u0001\u0000\u0000\u0000\u0003\u001f\u0001\u0000\u0000"+
		"\u0000\u0005!\u0001\u0000\u0000\u0000\u0007#\u0001\u0000\u0000\u0000\t"+
		"&\u0001\u0000\u0000\u0000\u000b(\u0001\u0000\u0000\u0000\r/\u0001\u0000"+
		"\u0000\u0000\u000f4\u0001\u0000\u0000\u0000\u0011:\u0001\u0000\u0000\u0000"+
		"\u0013>\u0001\u0000\u0000\u0000\u0015A\u0001\u0000\u0000\u0000\u0017K"+
		"\u0001\u0000\u0000\u0000\u0019S\u0001\u0000\u0000\u0000\u001b]\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0005;\u0000\u0000\u001e\u0002\u0001\u0000\u0000"+
		"\u0000\u001f \u0005*\u0000\u0000 \u0004\u0001\u0000\u0000\u0000!\"\u0005"+
		",\u0000\u0000\"\u0006\u0001\u0000\u0000\u0000#$\u0005#\u0000\u0000$%\u0005"+
		"{\u0000\u0000%\b\u0001\u0000\u0000\u0000&\'\u0005}\u0000\u0000\'\n\u0001"+
		"\u0000\u0000\u0000()\u0007\u0000\u0000\u0000)*\u0007\u0001\u0000\u0000"+
		"*+\u0007\u0002\u0000\u0000+,\u0007\u0001\u0000\u0000,-\u0007\u0003\u0000"+
		"\u0000-.\u0007\u0004\u0000\u0000.\f\u0001\u0000\u0000\u0000/0\u0007\u0005"+
		"\u0000\u000001\u0007\u0006\u0000\u000012\u0007\u0007\u0000\u000023\u0007"+
		"\b\u0000\u00003\u000e\u0001\u0000\u0000\u000045\u0007\t\u0000\u000056"+
		"\u0007\n\u0000\u000067\u0007\u0001\u0000\u000078\u0007\u0006\u0000\u0000"+
		"89\u0007\u0001\u0000\u00009\u0010\u0001\u0000\u0000\u0000:;\u0007\u000b"+
		"\u0000\u0000;<\u0007\f\u0000\u0000<=\u0007\r\u0000\u0000=\u0012\u0001"+
		"\u0000\u0000\u0000>?\u0007\u0007\u0000\u0000?@\u0007\u0006\u0000\u0000"+
		"@\u0014\u0001\u0000\u0000\u0000AF\u0005\'\u0000\u0000BE\u0003\u001b\r"+
		"\u0000CE\t\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DC\u0001\u0000\u0000"+
		"\u0000EH\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000FD\u0001\u0000"+
		"\u0000\u0000GI\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000IJ\u0005"+
		"\'\u0000\u0000J\u0016\u0001\u0000\u0000\u0000KO\u0007\u000e\u0000\u0000"+
		"LN\u0007\u000f\u0000\u0000ML\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000"+
		"\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000P\u0018\u0001"+
		"\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000RT\u0007\u0010\u0000\u0000"+
		"SR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000US\u0001\u0000\u0000"+
		"\u0000UV\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WX\u0006\f\u0000"+
		"\u0000X\u001a\u0001\u0000\u0000\u0000YZ\u0005\\\u0000\u0000Z^\u0005\""+
		"\u0000\u0000[\\\u0005\\\u0000\u0000\\^\u0005\\\u0000\u0000]Y\u0001\u0000"+
		"\u0000\u0000][\u0001\u0000\u0000\u0000^\u001c\u0001\u0000\u0000\u0000"+
		"\u0006\u0000DFOU]\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}