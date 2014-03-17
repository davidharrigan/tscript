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
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, NUMERIC_LITERAL=8, 
		BOOLEAN_LITERAL=9, STRING_LITERAL=10, NULL_LITERAL=11, LPAREN=12, RPAREN=13, 
		SEMICOLON=14, COLON=15, EQUAL=16, PLUS=17, MINUS=18, ASTERISK=19, DASH=20, 
		COMMA=21, DOUBLE_EQUAL=22, LESS=23, GREATER=24, NOT=25, NOT_EQUAL=26, 
		PRINT=27, VAR=28, IDENTIFIER=29, WhiteSpace=30;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'{'", "'break'", "'while'", "'if'", "'else'", "'continue'", "'}'", "NUMERIC_LITERAL", 
		"BOOLEAN_LITERAL", "STRING_LITERAL", "'null'", "LPAREN", "RPAREN", "SEMICOLON", 
		"COLON", "EQUAL", "PLUS", "MINUS", "ASTERISK", "DASH", "COMMA", "DOUBLE_EQUAL", 
		"LESS", "GREATER", "NOT", "NOT_EQUAL", "'print'", "'var'", "IDENTIFIER", 
		"WhiteSpace"
	};
	public static final String[] ruleNames = {
		"T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "IdentifierCharacters", 
		"SpaceTokens", "SpaceChars", "EndOfLineComment", "LineTerminator", "DecimalDigit", 
		"HexDigit", "DecimalLiteral", "ExponentPart", "ExponentIndicator", "SignedInteger", 
		"HexIntegerLiteral", "DoubleStringCharacters", "SingleStringCharacters", 
		"DoubleStringCharacter", "SingleStringCharacter", "LineContinuation", 
		"EscapeSequence", "CharacterEscapeSequence", "SingleEscapeCharacter", 
		"NonEscapeCharacter", "EscapeCharacter", "HexEscapeSequence", "TRUE", 
		"FALSE", "NUMERIC_LITERAL", "BOOLEAN_LITERAL", "STRING_LITERAL", "NULL_LITERAL", 
		"LPAREN", "RPAREN", "SEMICOLON", "COLON", "EQUAL", "PLUS", "MINUS", "ASTERISK", 
		"DASH", "COMMA", "DOUBLE_EQUAL", "LESS", "GREATER", "NOT", "NOT_EQUAL", 
		"PRINT", "VAR", "IDENTIFIER", "WhiteSpace"
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
		case 54: WhiteSpace_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WhiteSpace_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2 \u017d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\7\t\u0095\n\t\f\t\16\t\u0098"+
		"\13\t\3\n\3\n\3\n\5\n\u009d\n\n\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u00a5\n"+
		"\f\f\f\16\f\u00a8\13\f\3\f\3\f\5\f\u00ac\n\f\3\r\3\r\3\r\5\r\u00b1\n\r"+
		"\3\16\3\16\3\17\5\17\u00b6\n\17\3\20\6\20\u00b9\n\20\r\20\16\20\u00ba"+
		"\3\20\3\20\7\20\u00bf\n\20\f\20\16\20\u00c2\13\20\3\20\5\20\u00c5\n\20"+
		"\3\20\3\20\6\20\u00c9\n\20\r\20\16\20\u00ca\3\20\5\20\u00ce\n\20\3\20"+
		"\6\20\u00d1\n\20\r\20\16\20\u00d2\3\20\5\20\u00d6\n\20\5\20\u00d8\n\20"+
		"\3\21\3\21\3\21\3\22\3\22\3\23\6\23\u00e0\n\23\r\23\16\23\u00e1\3\23\3"+
		"\23\6\23\u00e6\n\23\r\23\16\23\u00e7\5\23\u00ea\n\23\3\24\3\24\3\24\6"+
		"\24\u00ef\n\24\r\24\16\24\u00f0\3\25\3\25\3\25\3\25\5\25\u00f7\n\25\3"+
		"\26\3\26\3\26\3\26\5\26\u00fd\n\26\3\27\3\27\3\27\5\27\u0102\n\27\3\30"+
		"\3\30\3\30\5\30\u0107\n\30\3\31\3\31\3\31\3\32\3\32\5\32\u010e\n\32\3"+
		"\33\3\33\5\33\u0112\n\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\5\36\u011b"+
		"\n\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\5\""+
		"\u012e\n\"\3#\3#\5#\u0132\n#\3$\3$\7$\u0136\n$\f$\16$\u0139\13$\3$\3$"+
		"\3$\7$\u013e\n$\f$\16$\u0141\13$\3$\5$\u0144\n$\3%\3%\3%\3%\3%\3&\3&\3"+
		"\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60"+
		"\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\66\3\66\3\66\3\66\3\67\3\67\38\68\u0178\n8\r8\168\u0179\38\38"+
		"\29\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\2\1\23\2\1\25\2\1\27"+
		"\2\1\31\2\1\33\2\1\35\2\1\37\2\1!\2\1#\2\1%\2\1\'\2\1)\2\1+\2\1-\2\1/"+
		"\2\1\61\2\1\63\2\1\65\2\1\67\2\19\2\1;\2\1=\2\1?\2\1A\2\1C\n\1E\13\1G"+
		"\f\1I\r\1K\16\1M\17\1O\20\1Q\21\1S\22\1U\23\1W\24\1Y\25\1[\26\1]\27\1"+
		"_\30\1a\31\1c\32\1e\33\1g\34\1i\35\1k\36\1m\37\1o \2\3\2\34\6\2&&C\\a"+
		"ac|\7\2&&\62;C\\aac|\5\2\13\13\16\16\"\"\4\2\f\f\17\17\3\2\62;\5\2\62"+
		";CHch\4\2GGgg\4\2--//\4\2ZZzz\5\2\f\f$$^^\5\2\f\f))^^\13\2$$))^^ddhhp"+
		"pttvvxx\f\2\f\f$$))^^ddhhppttvvxx\3\2**\3\2++\3\2==\3\2<<\3\2??\3\2--"+
		"\3\2//\3\2,,\3\2\61\61\3\2..\3\2>>\3\2@@\3\2##\u0184\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2"+
		"i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\3q\3\2\2\2\5s\3\2\2\2\7y\3"+
		"\2\2\2\t\177\3\2\2\2\13\u0082\3\2\2\2\r\u0087\3\2\2\2\17\u0090\3\2\2\2"+
		"\21\u0092\3\2\2\2\23\u009c\3\2\2\2\25\u009e\3\2\2\2\27\u00a0\3\2\2\2\31"+
		"\u00b0\3\2\2\2\33\u00b2\3\2\2\2\35\u00b5\3\2\2\2\37\u00d7\3\2\2\2!\u00d9"+
		"\3\2\2\2#\u00dc\3\2\2\2%\u00e9\3\2\2\2\'\u00eb\3\2\2\2)\u00f6\3\2\2\2"+
		"+\u00fc\3\2\2\2-\u0101\3\2\2\2/\u0106\3\2\2\2\61\u0108\3\2\2\2\63\u010d"+
		"\3\2\2\2\65\u0111\3\2\2\2\67\u0113\3\2\2\29\u0115\3\2\2\2;\u011a\3\2\2"+
		"\2=\u011c\3\2\2\2?\u0120\3\2\2\2A\u0125\3\2\2\2C\u012d\3\2\2\2E\u0131"+
		"\3\2\2\2G\u0143\3\2\2\2I\u0145\3\2\2\2K\u014a\3\2\2\2M\u014c\3\2\2\2O"+
		"\u014e\3\2\2\2Q\u0150\3\2\2\2S\u0152\3\2\2\2U\u0154\3\2\2\2W\u0156\3\2"+
		"\2\2Y\u0158\3\2\2\2[\u015a\3\2\2\2]\u015c\3\2\2\2_\u015e\3\2\2\2a\u0161"+
		"\3\2\2\2c\u0163\3\2\2\2e\u0165\3\2\2\2g\u0167\3\2\2\2i\u016a\3\2\2\2k"+
		"\u0170\3\2\2\2m\u0174\3\2\2\2o\u0177\3\2\2\2qr\7}\2\2r\4\3\2\2\2st\7d"+
		"\2\2tu\7t\2\2uv\7g\2\2vw\7c\2\2wx\7m\2\2x\6\3\2\2\2yz\7y\2\2z{\7j\2\2"+
		"{|\7k\2\2|}\7n\2\2}~\7g\2\2~\b\3\2\2\2\177\u0080\7k\2\2\u0080\u0081\7"+
		"h\2\2\u0081\n\3\2\2\2\u0082\u0083\7g\2\2\u0083\u0084\7n\2\2\u0084\u0085"+
		"\7u\2\2\u0085\u0086\7g\2\2\u0086\f\3\2\2\2\u0087\u0088\7e\2\2\u0088\u0089"+
		"\7q\2\2\u0089\u008a\7p\2\2\u008a\u008b\7v\2\2\u008b\u008c\7k\2\2\u008c"+
		"\u008d\7p\2\2\u008d\u008e\7w\2\2\u008e\u008f\7g\2\2\u008f\16\3\2\2\2\u0090"+
		"\u0091\7\177\2\2\u0091\20\3\2\2\2\u0092\u0096\t\2\2\2\u0093\u0095\t\3"+
		"\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\22\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009d\5\25\13"+
		"\2\u009a\u009d\5\31\r\2\u009b\u009d\5\27\f\2\u009c\u0099\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d\24\3\2\2\2\u009e\u009f\t\4\2"+
		"\2\u009f\26\3\2\2\2\u00a0\u00a1\7\61\2\2\u00a1\u00a2\7\61\2\2\u00a2\u00a6"+
		"\3\2\2\2\u00a3\u00a5\n\5\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00ab\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a9\u00ac\5\31\r\2\u00aa\u00ac\7\2\2\3\u00ab\u00a9\3\2\2\2\u00ab"+
		"\u00aa\3\2\2\2\u00ac\30\3\2\2\2\u00ad\u00ae\7\17\2\2\u00ae\u00b1\7\f\2"+
		"\2\u00af\u00b1\t\5\2\2\u00b0\u00ad\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\32"+
		"\3\2\2\2\u00b2\u00b3\t\6\2\2\u00b3\34\3\2\2\2\u00b4\u00b6\t\7\2\2\u00b5"+
		"\u00b4\3\2\2\2\u00b6\36\3\2\2\2\u00b7\u00b9\5\33\16\2\u00b8\u00b7\3\2"+
		"\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00c0\7\60\2\2\u00bd\u00bf\5\33\16\2\u00be\u00bd"+
		"\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c5\5!\21\2\u00c4\u00c3\3\2"+
		"\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00d8\3\2\2\2\u00c6\u00c8\7\60\2\2\u00c7"+
		"\u00c9\5\33\16\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3"+
		"\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ce\5!\21\2\u00cd"+
		"\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d8\3\2\2\2\u00cf\u00d1\5\33"+
		"\16\2\u00d0\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d6\5!\21\2\u00d5\u00d4\3\2"+
		"\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00b8\3\2\2\2\u00d7"+
		"\u00c6\3\2\2\2\u00d7\u00d0\3\2\2\2\u00d8 \3\2\2\2\u00d9\u00da\5#\22\2"+
		"\u00da\u00db\5%\23\2\u00db\"\3\2\2\2\u00dc\u00dd\t\b\2\2\u00dd$\3\2\2"+
		"\2\u00de\u00e0\5\33\16\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00ea\3\2\2\2\u00e3\u00e5\t\t"+
		"\2\2\u00e4\u00e6\5\33\16\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00df\3\2"+
		"\2\2\u00e9\u00e3\3\2\2\2\u00ea&\3\2\2\2\u00eb\u00ec\7\62\2\2\u00ec\u00ee"+
		"\t\n\2\2\u00ed\u00ef\5\35\17\2\u00ee\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2"+
		"\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1(\3\2\2\2\u00f2\u00f7\5"+
		"-\27\2\u00f3\u00f4\5-\27\2\u00f4\u00f5\5)\25\2\u00f5\u00f7\3\2\2\2\u00f6"+
		"\u00f2\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f7*\3\2\2\2\u00f8\u00fd\5/\30\2"+
		"\u00f9\u00fa\5/\30\2\u00fa\u00fb\5+\26\2\u00fb\u00fd\3\2\2\2\u00fc\u00f8"+
		"\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fd,\3\2\2\2\u00fe\u0102\n\13\2\2\u00ff"+
		"\u0100\7^\2\2\u0100\u0102\5\63\32\2\u0101\u00fe\3\2\2\2\u0101\u00ff\3"+
		"\2\2\2\u0102.\3\2\2\2\u0103\u0107\n\f\2\2\u0104\u0105\7^\2\2\u0105\u0107"+
		"\5\63\32\2\u0106\u0103\3\2\2\2\u0106\u0104\3\2\2\2\u0107\60\3\2\2\2\u0108"+
		"\u0109\7^\2\2\u0109\u010a\5\31\r\2\u010a\62\3\2\2\2\u010b\u010e\5\65\33"+
		"\2\u010c\u010e\7\62\2\2\u010d\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e"+
		"\64\3\2\2\2\u010f\u0112\5\67\34\2\u0110\u0112\59\35\2\u0111\u010f\3\2"+
		"\2\2\u0111\u0110\3\2\2\2\u0112\66\3\2\2\2\u0113\u0114\t\r\2\2\u01148\3"+
		"\2\2\2\u0115\u0116\n\16\2\2\u0116:\3\2\2\2\u0117\u011b\5\67\34\2\u0118"+
		"\u011b\5\33\16\2\u0119\u011b\7z\2\2\u011a\u0117\3\2\2\2\u011a\u0118\3"+
		"\2\2\2\u011a\u0119\3\2\2\2\u011b<\3\2\2\2\u011c\u011d\7z\2\2\u011d\u011e"+
		"\5\35\17\2\u011e\u011f\5\35\17\2\u011f>\3\2\2\2\u0120\u0121\7v\2\2\u0121"+
		"\u0122\7t\2\2\u0122\u0123\7w\2\2\u0123\u0124\7g\2\2\u0124@\3\2\2\2\u0125"+
		"\u0126\7h\2\2\u0126\u0127\7c\2\2\u0127\u0128\7n\2\2\u0128\u0129\7u\2\2"+
		"\u0129\u012a\7g\2\2\u012aB\3\2\2\2\u012b\u012e\5\37\20\2\u012c\u012e\5"+
		"\'\24\2\u012d\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012eD\3\2\2\2\u012f\u0132"+
		"\5? \2\u0130\u0132\5A!\2\u0131\u012f\3\2\2\2\u0131\u0130\3\2\2\2\u0132"+
		"F\3\2\2\2\u0133\u0137\7$\2\2\u0134\u0136\5)\25\2\u0135\u0134\3\2\2\2\u0136"+
		"\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2"+
		"\2\2\u0139\u0137\3\2\2\2\u013a\u0144\7$\2\2\u013b\u013f\7)\2\2\u013c\u013e"+
		"\5+\26\2\u013d\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f"+
		"\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0144\7)"+
		"\2\2\u0143\u0133\3\2\2\2\u0143\u013b\3\2\2\2\u0144H\3\2\2\2\u0145\u0146"+
		"\7p\2\2\u0146\u0147\7w\2\2\u0147\u0148\7n\2\2\u0148\u0149\7n\2\2\u0149"+
		"J\3\2\2\2\u014a\u014b\t\17\2\2\u014bL\3\2\2\2\u014c\u014d\t\20\2\2\u014d"+
		"N\3\2\2\2\u014e\u014f\t\21\2\2\u014fP\3\2\2\2\u0150\u0151\t\22\2\2\u0151"+
		"R\3\2\2\2\u0152\u0153\t\23\2\2\u0153T\3\2\2\2\u0154\u0155\t\24\2\2\u0155"+
		"V\3\2\2\2\u0156\u0157\t\25\2\2\u0157X\3\2\2\2\u0158\u0159\t\26\2\2\u0159"+
		"Z\3\2\2\2\u015a\u015b\t\27\2\2\u015b\\\3\2\2\2\u015c\u015d\t\30\2\2\u015d"+
		"^\3\2\2\2\u015e\u015f\t\23\2\2\u015f\u0160\t\23\2\2\u0160`\3\2\2\2\u0161"+
		"\u0162\t\31\2\2\u0162b\3\2\2\2\u0163\u0164\t\32\2\2\u0164d\3\2\2\2\u0165"+
		"\u0166\t\33\2\2\u0166f\3\2\2\2\u0167\u0168\t\33\2\2\u0168\u0169\t\23\2"+
		"\2\u0169h\3\2\2\2\u016a\u016b\7r\2\2\u016b\u016c\7t\2\2\u016c\u016d\7"+
		"k\2\2\u016d\u016e\7p\2\2\u016e\u016f\7v\2\2\u016fj\3\2\2\2\u0170\u0171"+
		"\7x\2\2\u0171\u0172\7c\2\2\u0172\u0173\7t\2\2\u0173l\3\2\2\2\u0174\u0175"+
		"\5\21\t\2\u0175n\3\2\2\2\u0176\u0178\5\23\n\2\u0177\u0176\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\3\2"+
		"\2\2\u017b\u017c\b8\2\2\u017cp\3\2\2\2\"\2\u0096\u009c\u00a6\u00ab\u00b0"+
		"\u00b5\u00ba\u00c0\u00c4\u00ca\u00cd\u00d2\u00d5\u00d7\u00e1\u00e7\u00e9"+
		"\u00f0\u00f6\u00fc\u0101\u0106\u010d\u0111\u011a\u012d\u0131\u0137\u013f"+
		"\u0143\u0179";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}