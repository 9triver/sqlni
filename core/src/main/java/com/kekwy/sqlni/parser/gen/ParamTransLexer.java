package com.kekwy.sqlni.parser.gen;// Generated from E:/projects/sqlni/core/src/main/antlr/ParamTrans.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ParamTransLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PARAM_LEFT1=1, PARAM_LEFT2=2, PARAM_RIGHT=3, PARAM1=4, PARAM2=5, ID=6, 
		CH=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PARAM_LEFT1", "PARAM_LEFT2", "PARAM_RIGHT", "PARAM1", "PARAM2", "ID", 
			"CH"
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


	public ParamTransLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ParamTrans.g4"; }

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
		"\u0004\u0000\u0007<\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0005\u00056\b\u0005\n\u0005\f\u00059\t\u0005\u0001\u0006"+
		"\u0001\u0006\u0000\u0000\u0007\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u0001\u0000\u0002\u0002\u0000AZaz\u0005"+
		"\u0000..09AZ__az<\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0001\u000f\u0001\u0000\u0000"+
		"\u0000\u0003\u0012\u0001\u0000\u0000\u0000\u0005\u0015\u0001\u0000\u0000"+
		"\u0000\u0007\u0017\u0001\u0000\u0000\u0000\t%\u0001\u0000\u0000\u0000"+
		"\u000b3\u0001\u0000\u0000\u0000\r:\u0001\u0000\u0000\u0000\u000f\u0010"+
		"\u0005#\u0000\u0000\u0010\u0011\u0005{\u0000\u0000\u0011\u0002\u0001\u0000"+
		"\u0000\u0000\u0012\u0013\u0005$\u0000\u0000\u0013\u0014\u0005{\u0000\u0000"+
		"\u0014\u0004\u0001\u0000\u0000\u0000\u0015\u0016\u0005}\u0000\u0000\u0016"+
		"\u0006\u0001\u0000\u0000\u0000\u0017\u0018\u0005S\u0000\u0000\u0018\u0019"+
		"\u0005Q\u0000\u0000\u0019\u001a\u0005L\u0000\u0000\u001a\u001b\u0005N"+
		"\u0000\u0000\u001b\u001c\u0005I\u0000\u0000\u001c\u001d\u0005_\u0000\u0000"+
		"\u001d\u001e\u0005P\u0000\u0000\u001e\u001f\u0005A\u0000\u0000\u001f "+
		"\u0005R\u0000\u0000 !\u0005A\u0000\u0000!\"\u0005M\u0000\u0000\"#\u0005"+
		"1\u0000\u0000#$\u0005#\u0000\u0000$\b\u0001\u0000\u0000\u0000%&\u0005"+
		"S\u0000\u0000&\'\u0005Q\u0000\u0000\'(\u0005L\u0000\u0000()\u0005N\u0000"+
		"\u0000)*\u0005I\u0000\u0000*+\u0005_\u0000\u0000+,\u0005P\u0000\u0000"+
		",-\u0005A\u0000\u0000-.\u0005R\u0000\u0000./\u0005A\u0000\u0000/0\u0005"+
		"M\u0000\u000001\u00052\u0000\u000012\u0005#\u0000\u00002\n\u0001\u0000"+
		"\u0000\u000037\u0007\u0000\u0000\u000046\u0007\u0001\u0000\u000054\u0001"+
		"\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u0000"+
		"78\u0001\u0000\u0000\u00008\f\u0001\u0000\u0000\u000097\u0001\u0000\u0000"+
		"\u0000:;\t\u0000\u0000\u0000;\u000e\u0001\u0000\u0000\u0000\u0002\u0000"+
		"7\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}