package com.kekwy.sqlni.parser.gen;// Generated from E:/projects/sqlni/core/src/main/antlr/DynamicSQL.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class DynamicSQLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LEFT=1, RIGHT=2, PARAM_LEFT1=3, PARAM_LEFT2=4, PARAM_RIGHT=5, SEPARATOR=6, 
		IF=7, ENDIF=8, FOREACH=9, STRING=10, ID=11, SPACE=12, CH=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LEFT", "RIGHT", "PARAM_LEFT1", "PARAM_LEFT2", "PARAM_RIGHT", "SEPARATOR", 
			"IF", "ENDIF", "FOREACH", "STRING", "ESC", "ID", "SPACE", "CH"
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


	public DynamicSQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DynamicSQL.g4"; }

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
		"\u0004\u0000\rZ\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0005\tC\b\t\n\t\f\tF\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\nN\b\n\u0001\u000b\u0001\u000b\u0005\u000bR\b\u000b\n"+
		"\u000b\f\u000bU\t\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001D\u0000\u000e"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u0000\u0017\u000b\u0019\f\u001b\r"+
		"\u0001\u0000\f\u0002\u0000IIii\u0002\u0000FFff\u0002\u0000EEee\u0002\u0000"+
		"NNnn\u0002\u0000DDdd\u0002\u0000OOoo\u0002\u0000RRrr\u0002\u0000AAaa\u0002"+
		"\u0000CCcc\u0002\u0000HHhh\u0002\u0000AZaz\u0004\u000009AZ__az\\\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0001\u001d\u0001\u0000\u0000\u0000\u0003\u001f"+
		"\u0001\u0000\u0000\u0000\u0005!\u0001\u0000\u0000\u0000\u0007$\u0001\u0000"+
		"\u0000\u0000\t\'\u0001\u0000\u0000\u0000\u000b)\u0001\u0000\u0000\u0000"+
		"\r+\u0001\u0000\u0000\u0000\u000f/\u0001\u0000\u0000\u0000\u00116\u0001"+
		"\u0000\u0000\u0000\u0013?\u0001\u0000\u0000\u0000\u0015M\u0001\u0000\u0000"+
		"\u0000\u0017O\u0001\u0000\u0000\u0000\u0019V\u0001\u0000\u0000\u0000\u001b"+
		"X\u0001\u0000\u0000\u0000\u001d\u001e\u0005(\u0000\u0000\u001e\u0002\u0001"+
		"\u0000\u0000\u0000\u001f \u0005)\u0000\u0000 \u0004\u0001\u0000\u0000"+
		"\u0000!\"\u0005#\u0000\u0000\"#\u0005{\u0000\u0000#\u0006\u0001\u0000"+
		"\u0000\u0000$%\u0005$\u0000\u0000%&\u0005{\u0000\u0000&\b\u0001\u0000"+
		"\u0000\u0000\'(\u0005}\u0000\u0000(\n\u0001\u0000\u0000\u0000)*\u0005"+
		",\u0000\u0000*\f\u0001\u0000\u0000\u0000+,\u0005#\u0000\u0000,-\u0007"+
		"\u0000\u0000\u0000-.\u0007\u0001\u0000\u0000.\u000e\u0001\u0000\u0000"+
		"\u0000/0\u0005#\u0000\u000001\u0007\u0002\u0000\u000012\u0007\u0003\u0000"+
		"\u000023\u0007\u0004\u0000\u000034\u0007\u0000\u0000\u000045\u0007\u0001"+
		"\u0000\u00005\u0010\u0001\u0000\u0000\u000067\u0005#\u0000\u000078\u0007"+
		"\u0001\u0000\u000089\u0007\u0005\u0000\u00009:\u0007\u0006\u0000\u0000"+
		":;\u0007\u0002\u0000\u0000;<\u0007\u0007\u0000\u0000<=\u0007\b\u0000\u0000"+
		"=>\u0007\t\u0000\u0000>\u0012\u0001\u0000\u0000\u0000?D\u0005\'\u0000"+
		"\u0000@C\u0003\u0015\n\u0000AC\t\u0000\u0000\u0000B@\u0001\u0000\u0000"+
		"\u0000BA\u0001\u0000\u0000\u0000CF\u0001\u0000\u0000\u0000DE\u0001\u0000"+
		"\u0000\u0000DB\u0001\u0000\u0000\u0000EG\u0001\u0000\u0000\u0000FD\u0001"+
		"\u0000\u0000\u0000GH\u0005\'\u0000\u0000H\u0014\u0001\u0000\u0000\u0000"+
		"IJ\u0005\\\u0000\u0000JN\u0005\"\u0000\u0000KL\u0005\\\u0000\u0000LN\u0005"+
		"\\\u0000\u0000MI\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000N\u0016"+
		"\u0001\u0000\u0000\u0000OS\u0007\n\u0000\u0000PR\u0007\u000b\u0000\u0000"+
		"QP\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000"+
		"\u0000ST\u0001\u0000\u0000\u0000T\u0018\u0001\u0000\u0000\u0000US\u0001"+
		"\u0000\u0000\u0000VW\u0005 \u0000\u0000W\u001a\u0001\u0000\u0000\u0000"+
		"XY\t\u0000\u0000\u0000Y\u001c\u0001\u0000\u0000\u0000\u0005\u0000BDMS"+
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