// Generated from Tscript.g by ANTLR 4.1

  package ts.parse;
  import ts.Location;
  import ts.tree.*;
  import static ts.parse.TreeBuilder.*;
  import java.util.List;
  import java.util.ArrayList;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TscriptLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__11=1, T__10=2, T__9=3, T__8=4, T__7=5, T__6=6, T__5=7, T__4=8, T__3=9, 
		T__2=10, T__1=11, T__0=12, NUMERIC_LITERAL=13, BOOLEAN_LITERAL=14, STRING_LITERAL=15, 
		NULL_LITERAL=16, LPAREN=17, RPAREN=18, SEMICOLON=19, COLON=20, EQUAL=21, 
		PLUS=22, MINUS=23, ASTERISK=24, DASH=25, COMMA=26, DOUBLE_EQUAL=27, LESS=28, 
		GREATER=29, NOT=30, NOT_EQUAL=31, PRINT=32, VAR=33, IDENTIFIER=34, WhiteSpace=35;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'{'", "'function'", "'break'", "'while'", "'throw'", "'if'", "'else'", 
		"'catch'", "'continue'", "'}'", "'finally'", "'try'", "NUMERIC_LITERAL", 
		"BOOLEAN_LITERAL", "STRING_LITERAL", "'null'", "LPAREN", "RPAREN", "SEMICOLON", 
		"COLON", "EQUAL", "PLUS", "MINUS", "ASTERISK", "DASH", "COMMA", "DOUBLE_EQUAL", 
		"LESS", "GREATER", "NOT", "NOT_EQUAL", "'print'", "'var'", "IDENTIFIER", 
		"WhiteSpace"
	};
	public static final String[] ruleNames = {
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "IdentifierCharacters", "SpaceTokens", "SpaceChars", 
		"EndOfLineComment", "LineTerminator", "DecimalDigit", "HexDigit", "DecimalLiteral", 
		"ExponentPart", "ExponentIndicator", "SignedInteger", "HexIntegerLiteral", 
		"DoubleStringCharacters", "SingleStringCharacters", "DoubleStringCharacter", 
		"SingleStringCharacter", "LineContinuation", "EscapeSequence", "CharacterEscapeSequence", 
		"SingleEscapeCharacter", "NonEscapeCharacter", "EscapeCharacter", "HexEscapeSequence", 
		"TRUE", "FALSE", "NUMERIC_LITERAL", "BOOLEAN_LITERAL", "STRING_LITERAL", 
		"NULL_LITERAL", "LPAREN", "RPAREN", "SEMICOLON", "COLON", "EQUAL", "PLUS", 
		"MINUS", "ASTERISK", "DASH", "COMMA", "DOUBLE_EQUAL", "LESS", "GREATER", 
		"NOT", "NOT_EQUAL", "PRINT", "VAR", "IDENTIFIER", "WhiteSpace"
	};


	  // grab location info (filename/line/column) from token
	  // in order to stick into AST nodes for later error reporting
	  public Location loc(final Token token)
	  {
	    return new Location(getSourceName(), token.getLine(),
	      token.getCharPositionInLine());
	  }

	  // a program is a list of statements
	  // i.e. root of AST is stored here
	  // set by the action for the start symbol
	  private List<Statement> semanticValue;
	  public List<Statement> getSemanticValue()
	  {
	    return semanticValue;
	  }


	public TscriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Tscript.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 59: WhiteSpace_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WhiteSpace_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2%\u01a8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\7\16"+
		"\u00c0\n\16\f\16\16\16\u00c3\13\16\3\17\3\17\3\17\5\17\u00c8\n\17\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\7\21\u00d0\n\21\f\21\16\21\u00d3\13\21\3\21"+
		"\3\21\5\21\u00d7\n\21\3\22\3\22\3\22\5\22\u00dc\n\22\3\23\3\23\3\24\5"+
		"\24\u00e1\n\24\3\25\6\25\u00e4\n\25\r\25\16\25\u00e5\3\25\3\25\7\25\u00ea"+
		"\n\25\f\25\16\25\u00ed\13\25\3\25\5\25\u00f0\n\25\3\25\3\25\6\25\u00f4"+
		"\n\25\r\25\16\25\u00f5\3\25\5\25\u00f9\n\25\3\25\6\25\u00fc\n\25\r\25"+
		"\16\25\u00fd\3\25\5\25\u0101\n\25\5\25\u0103\n\25\3\26\3\26\3\26\3\27"+
		"\3\27\3\30\6\30\u010b\n\30\r\30\16\30\u010c\3\30\3\30\6\30\u0111\n\30"+
		"\r\30\16\30\u0112\5\30\u0115\n\30\3\31\3\31\3\31\6\31\u011a\n\31\r\31"+
		"\16\31\u011b\3\32\3\32\3\32\3\32\5\32\u0122\n\32\3\33\3\33\3\33\3\33\5"+
		"\33\u0128\n\33\3\34\3\34\3\34\5\34\u012d\n\34\3\35\3\35\3\35\5\35\u0132"+
		"\n\35\3\36\3\36\3\36\3\37\3\37\5\37\u0139\n\37\3 \3 \5 \u013d\n \3!\3"+
		"!\3\"\3\"\3#\3#\3#\5#\u0146\n#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&"+
		"\3&\3&\3\'\3\'\5\'\u0159\n\'\3(\3(\5(\u015d\n(\3)\3)\7)\u0161\n)\f)\16"+
		")\u0164\13)\3)\3)\3)\7)\u0169\n)\f)\16)\u016c\13)\3)\5)\u016f\n)\3*\3"+
		"*\3*\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62"+
		"\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3"+
		"9\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3<\3<\3=\6=\u01a3\n=\r=\16=\u01a4\3=\3"+
		"=\2>\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1"+
		"\27\r\1\31\16\1\33\2\1\35\2\1\37\2\1!\2\1#\2\1%\2\1\'\2\1)\2\1+\2\1-\2"+
		"\1/\2\1\61\2\1\63\2\1\65\2\1\67\2\19\2\1;\2\1=\2\1?\2\1A\2\1C\2\1E\2\1"+
		"G\2\1I\2\1K\2\1M\17\1O\20\1Q\21\1S\22\1U\23\1W\24\1Y\25\1[\26\1]\27\1"+
		"_\30\1a\31\1c\32\1e\33\1g\34\1i\35\1k\36\1m\37\1o \1q!\1s\"\1u#\1w$\1"+
		"y%\2\3\2\34\6\2&&C\\aac|\7\2&&\62;C\\aac|\5\2\13\13\16\16\"\"\4\2\f\f"+
		"\17\17\3\2\62;\5\2\62;CHch\4\2GGgg\4\2--//\4\2ZZzz\5\2\f\f$$^^\5\2\f\f"+
		"))^^\13\2$$))^^ddhhppttvvxx\f\2\f\f$$))^^ddhhppttvvxx\3\2**\3\2++\3\2"+
		"==\3\2<<\3\2??\3\2--\3\2//\3\2,,\3\2\61\61\3\2..\3\2>>\3\2@@\3\2##\u01af"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3"+
		"\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2"+
		"\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\3{\3\2\2\2\5"+
		"}\3\2\2\2\7\u0086\3\2\2\2\t\u008c\3\2\2\2\13\u0092\3\2\2\2\r\u0098\3\2"+
		"\2\2\17\u009b\3\2\2\2\21\u00a0\3\2\2\2\23\u00a6\3\2\2\2\25\u00af\3\2\2"+
		"\2\27\u00b1\3\2\2\2\31\u00b9\3\2\2\2\33\u00bd\3\2\2\2\35\u00c7\3\2\2\2"+
		"\37\u00c9\3\2\2\2!\u00cb\3\2\2\2#\u00db\3\2\2\2%\u00dd\3\2\2\2\'\u00e0"+
		"\3\2\2\2)\u0102\3\2\2\2+\u0104\3\2\2\2-\u0107\3\2\2\2/\u0114\3\2\2\2\61"+
		"\u0116\3\2\2\2\63\u0121\3\2\2\2\65\u0127\3\2\2\2\67\u012c\3\2\2\29\u0131"+
		"\3\2\2\2;\u0133\3\2\2\2=\u0138\3\2\2\2?\u013c\3\2\2\2A\u013e\3\2\2\2C"+
		"\u0140\3\2\2\2E\u0145\3\2\2\2G\u0147\3\2\2\2I\u014b\3\2\2\2K\u0150\3\2"+
		"\2\2M\u0158\3\2\2\2O\u015c\3\2\2\2Q\u016e\3\2\2\2S\u0170\3\2\2\2U\u0175"+
		"\3\2\2\2W\u0177\3\2\2\2Y\u0179\3\2\2\2[\u017b\3\2\2\2]\u017d\3\2\2\2_"+
		"\u017f\3\2\2\2a\u0181\3\2\2\2c\u0183\3\2\2\2e\u0185\3\2\2\2g\u0187\3\2"+
		"\2\2i\u0189\3\2\2\2k\u018c\3\2\2\2m\u018e\3\2\2\2o\u0190\3\2\2\2q\u0192"+
		"\3\2\2\2s\u0195\3\2\2\2u\u019b\3\2\2\2w\u019f\3\2\2\2y\u01a2\3\2\2\2{"+
		"|\7}\2\2|\4\3\2\2\2}~\7h\2\2~\177\7w\2\2\177\u0080\7p\2\2\u0080\u0081"+
		"\7e\2\2\u0081\u0082\7v\2\2\u0082\u0083\7k\2\2\u0083\u0084\7q\2\2\u0084"+
		"\u0085\7p\2\2\u0085\6\3\2\2\2\u0086\u0087\7d\2\2\u0087\u0088\7t\2\2\u0088"+
		"\u0089\7g\2\2\u0089\u008a\7c\2\2\u008a\u008b\7m\2\2\u008b\b\3\2\2\2\u008c"+
		"\u008d\7y\2\2\u008d\u008e\7j\2\2\u008e\u008f\7k\2\2\u008f\u0090\7n\2\2"+
		"\u0090\u0091\7g\2\2\u0091\n\3\2\2\2\u0092\u0093\7v\2\2\u0093\u0094\7j"+
		"\2\2\u0094\u0095\7t\2\2\u0095\u0096\7q\2\2\u0096\u0097\7y\2\2\u0097\f"+
		"\3\2\2\2\u0098\u0099\7k\2\2\u0099\u009a\7h\2\2\u009a\16\3\2\2\2\u009b"+
		"\u009c\7g\2\2\u009c\u009d\7n\2\2\u009d\u009e\7u\2\2\u009e\u009f\7g\2\2"+
		"\u009f\20\3\2\2\2\u00a0\u00a1\7e\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7"+
		"v\2\2\u00a3\u00a4\7e\2\2\u00a4\u00a5\7j\2\2\u00a5\22\3\2\2\2\u00a6\u00a7"+
		"\7e\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7p\2\2\u00a9\u00aa\7v\2\2\u00aa"+
		"\u00ab\7k\2\2\u00ab\u00ac\7p\2\2\u00ac\u00ad\7w\2\2\u00ad\u00ae\7g\2\2"+
		"\u00ae\24\3\2\2\2\u00af\u00b0\7\177\2\2\u00b0\26\3\2\2\2\u00b1\u00b2\7"+
		"h\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7p\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6"+
		"\7n\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8\7{\2\2\u00b8\30\3\2\2\2\u00b9\u00ba"+
		"\7v\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7{\2\2\u00bc\32\3\2\2\2\u00bd\u00c1"+
		"\t\2\2\2\u00be\u00c0\t\3\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\34\3\2\2\2\u00c3\u00c1\3\2\2"+
		"\2\u00c4\u00c8\5\37\20\2\u00c5\u00c8\5#\22\2\u00c6\u00c8\5!\21\2\u00c7"+
		"\u00c4\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\36\3\2\2"+
		"\2\u00c9\u00ca\t\4\2\2\u00ca \3\2\2\2\u00cb\u00cc\7\61\2\2\u00cc\u00cd"+
		"\7\61\2\2\u00cd\u00d1\3\2\2\2\u00ce\u00d0\n\5\2\2\u00cf\u00ce\3\2\2\2"+
		"\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d6"+
		"\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d7\5#\22\2\u00d5\u00d7\7\2\2\3\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\"\3\2\2\2\u00d8\u00d9\7\17\2"+
		"\2\u00d9\u00dc\7\f\2\2\u00da\u00dc\t\5\2\2\u00db\u00d8\3\2\2\2\u00db\u00da"+
		"\3\2\2\2\u00dc$\3\2\2\2\u00dd\u00de\t\6\2\2\u00de&\3\2\2\2\u00df\u00e1"+
		"\t\7\2\2\u00e0\u00df\3\2\2\2\u00e1(\3\2\2\2\u00e2\u00e4\5%\23\2\u00e3"+
		"\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00eb\7\60\2\2\u00e8\u00ea\5%\23\2\u00e9"+
		"\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f0\5+\26\2\u00ef"+
		"\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u0103\3\2\2\2\u00f1\u00f3\7\60"+
		"\2\2\u00f2\u00f4\5%\23\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f9\5+"+
		"\26\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u0103\3\2\2\2\u00fa"+
		"\u00fc\5%\23\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fb\3\2"+
		"\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u0101\5+\26\2\u0100"+
		"\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u00e3\3\2"+
		"\2\2\u0102\u00f1\3\2\2\2\u0102\u00fb\3\2\2\2\u0103*\3\2\2\2\u0104\u0105"+
		"\5-\27\2\u0105\u0106\5/\30\2\u0106,\3\2\2\2\u0107\u0108\t\b\2\2\u0108"+
		".\3\2\2\2\u0109\u010b\5%\23\2\u010a\u0109\3\2\2\2\u010b\u010c\3\2\2\2"+
		"\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u0115\3\2\2\2\u010e\u0110"+
		"\t\t\2\2\u010f\u0111\5%\23\2\u0110\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114\u010a\3\2"+
		"\2\2\u0114\u010e\3\2\2\2\u0115\60\3\2\2\2\u0116\u0117\7\62\2\2\u0117\u0119"+
		"\t\n\2\2\u0118\u011a\5\'\24\2\u0119\u0118\3\2\2\2\u011a\u011b\3\2\2\2"+
		"\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\62\3\2\2\2\u011d\u0122"+
		"\5\67\34\2\u011e\u011f\5\67\34\2\u011f\u0120\5\63\32\2\u0120\u0122\3\2"+
		"\2\2\u0121\u011d\3\2\2\2\u0121\u011e\3\2\2\2\u0122\64\3\2\2\2\u0123\u0128"+
		"\59\35\2\u0124\u0125\59\35\2\u0125\u0126\5\65\33\2\u0126\u0128\3\2\2\2"+
		"\u0127\u0123\3\2\2\2\u0127\u0124\3\2\2\2\u0128\66\3\2\2\2\u0129\u012d"+
		"\n\13\2\2\u012a\u012b\7^\2\2\u012b\u012d\5=\37\2\u012c\u0129\3\2\2\2\u012c"+
		"\u012a\3\2\2\2\u012d8\3\2\2\2\u012e\u0132\n\f\2\2\u012f\u0130\7^\2\2\u0130"+
		"\u0132\5=\37\2\u0131\u012e\3\2\2\2\u0131\u012f\3\2\2\2\u0132:\3\2\2\2"+
		"\u0133\u0134\7^\2\2\u0134\u0135\5#\22\2\u0135<\3\2\2\2\u0136\u0139\5?"+
		" \2\u0137\u0139\7\62\2\2\u0138\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139"+
		">\3\2\2\2\u013a\u013d\5A!\2\u013b\u013d\5C\"\2\u013c\u013a\3\2\2\2\u013c"+
		"\u013b\3\2\2\2\u013d@\3\2\2\2\u013e\u013f\t\r\2\2\u013fB\3\2\2\2\u0140"+
		"\u0141\n\16\2\2\u0141D\3\2\2\2\u0142\u0146\5A!\2\u0143\u0146\5%\23\2\u0144"+
		"\u0146\7z\2\2\u0145\u0142\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0144\3\2"+
		"\2\2\u0146F\3\2\2\2\u0147\u0148\7z\2\2\u0148\u0149\5\'\24\2\u0149\u014a"+
		"\5\'\24\2\u014aH\3\2\2\2\u014b\u014c\7v\2\2\u014c\u014d\7t\2\2\u014d\u014e"+
		"\7w\2\2\u014e\u014f\7g\2\2\u014fJ\3\2\2\2\u0150\u0151\7h\2\2\u0151\u0152"+
		"\7c\2\2\u0152\u0153\7n\2\2\u0153\u0154\7u\2\2\u0154\u0155\7g\2\2\u0155"+
		"L\3\2\2\2\u0156\u0159\5)\25\2\u0157\u0159\5\61\31\2\u0158\u0156\3\2\2"+
		"\2\u0158\u0157\3\2\2\2\u0159N\3\2\2\2\u015a\u015d\5I%\2\u015b\u015d\5"+
		"K&\2\u015c\u015a\3\2\2\2\u015c\u015b\3\2\2\2\u015dP\3\2\2\2\u015e\u0162"+
		"\7$\2\2\u015f\u0161\5\63\32\2\u0160\u015f\3\2\2\2\u0161\u0164\3\2\2\2"+
		"\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0165\3\2\2\2\u0164\u0162"+
		"\3\2\2\2\u0165\u016f\7$\2\2\u0166\u016a\7)\2\2\u0167\u0169\5\65\33\2\u0168"+
		"\u0167\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2"+
		"\2\2\u016b\u016d\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u016f\7)\2\2\u016e"+
		"\u015e\3\2\2\2\u016e\u0166\3\2\2\2\u016fR\3\2\2\2\u0170\u0171\7p\2\2\u0171"+
		"\u0172\7w\2\2\u0172\u0173\7n\2\2\u0173\u0174\7n\2\2\u0174T\3\2\2\2\u0175"+
		"\u0176\t\17\2\2\u0176V\3\2\2\2\u0177\u0178\t\20\2\2\u0178X\3\2\2\2\u0179"+
		"\u017a\t\21\2\2\u017aZ\3\2\2\2\u017b\u017c\t\22\2\2\u017c\\\3\2\2\2\u017d"+
		"\u017e\t\23\2\2\u017e^\3\2\2\2\u017f\u0180\t\24\2\2\u0180`\3\2\2\2\u0181"+
		"\u0182\t\25\2\2\u0182b\3\2\2\2\u0183\u0184\t\26\2\2\u0184d\3\2\2\2\u0185"+
		"\u0186\t\27\2\2\u0186f\3\2\2\2\u0187\u0188\t\30\2\2\u0188h\3\2\2\2\u0189"+
		"\u018a\t\23\2\2\u018a\u018b\t\23\2\2\u018bj\3\2\2\2\u018c\u018d\t\31\2"+
		"\2\u018dl\3\2\2\2\u018e\u018f\t\32\2\2\u018fn\3\2\2\2\u0190\u0191\t\33"+
		"\2\2\u0191p\3\2\2\2\u0192\u0193\t\33\2\2\u0193\u0194\t\23\2\2\u0194r\3"+
		"\2\2\2\u0195\u0196\7r\2\2\u0196\u0197\7t\2\2\u0197\u0198\7k\2\2\u0198"+
		"\u0199\7p\2\2\u0199\u019a\7v\2\2\u019at\3\2\2\2\u019b\u019c\7x\2\2\u019c"+
		"\u019d\7c\2\2\u019d\u019e\7t\2\2\u019ev\3\2\2\2\u019f\u01a0\5\33\16\2"+
		"\u01a0x\3\2\2\2\u01a1\u01a3\5\35\17\2\u01a2\u01a1\3\2\2\2\u01a3\u01a4"+
		"\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6"+
		"\u01a7\b=\2\2\u01a7z\3\2\2\2\"\2\u00c1\u00c7\u00d1\u00d6\u00db\u00e0\u00e5"+
		"\u00eb\u00ef\u00f5\u00f8\u00fd\u0100\u0102\u010c\u0112\u0114\u011b\u0121"+
		"\u0127\u012c\u0131\u0138\u013c\u0145\u0158\u015c\u0162\u016a\u016e\u01a4";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}