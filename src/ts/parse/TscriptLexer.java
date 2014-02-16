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
		NUMERIC_LITERAL=1, BOOLEAN_LITERAL=2, STRING_LITERAL=3, NULL_LITERAL=4, 
		LPAREN=5, RPAREN=6, SEMICOLON=7, EQUAL=8, PLUS=9, MINUS=10, ASTERISK=11, 
		DASH=12, DOUBLE_EQUAL=13, LESS=14, GREATER=15, NOT=16, NOT_EQUAL=17, PRINT=18, 
		VAR=19, IDENTIFIER=20, WhiteSpace=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"NUMERIC_LITERAL", "BOOLEAN_LITERAL", "STRING_LITERAL", "'null'", "LPAREN", 
		"RPAREN", "SEMICOLON", "EQUAL", "PLUS", "MINUS", "ASTERISK", "DASH", "DOUBLE_EQUAL", 
		"LESS", "GREATER", "NOT", "NOT_EQUAL", "'print'", "'var'", "IDENTIFIER", 
		"WhiteSpace"
	};
	public static final String[] ruleNames = {
		"IdentifierCharacters", "SpaceTokens", "SpaceChars", "EndOfLineComment", 
		"LineTerminator", "DecimalDigit", "HexDigit", "DecimalLiteral", "ExponentPart", 
		"ExponentIndicator", "SignedInteger", "HexIntegerLiteral", "DoubleStringCharacters", 
		"SingleStringCharacters", "DoubleStringCharacter", "SingleStringCharacter", 
		"LineContinuation", "EscapeSequence", "CharacterEscapeSequence", "SingleEscapeCharacter", 
		"NonEscapeCharacter", "EscapeCharacter", "TRUE", "FALSE", "NUMERIC_LITERAL", 
		"BOOLEAN_LITERAL", "STRING_LITERAL", "NULL_LITERAL", "LPAREN", "RPAREN", 
		"SEMICOLON", "EQUAL", "PLUS", "MINUS", "ASTERISK", "DASH", "DOUBLE_EQUAL", 
		"LESS", "GREATER", "NOT", "NOT_EQUAL", "PRINT", "VAR", "IDENTIFIER", "WhiteSpace"
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
		case 44: WhiteSpace_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WhiteSpace_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\27\u015c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\3\2\3\2\7\2`\n\2\f\2\16\2c\13\2\3\3\3\3\3\3\5\3h\n"+
		"\3\3\4\3\4\3\5\3\5\3\5\3\5\7\5p\n\5\f\5\16\5s\13\5\3\5\3\5\5\5w\n\5\3"+
		"\6\3\6\3\6\5\6|\n\6\3\7\3\7\3\b\5\b\u0081\n\b\3\t\6\t\u0084\n\t\r\t\16"+
		"\t\u0085\3\t\3\t\7\t\u008a\n\t\f\t\16\t\u008d\13\t\3\t\5\t\u0090\n\t\3"+
		"\t\3\t\6\t\u0094\n\t\r\t\16\t\u0095\3\t\5\t\u0099\n\t\3\t\6\t\u009c\n"+
		"\t\r\t\16\t\u009d\3\t\5\t\u00a1\n\t\5\t\u00a3\n\t\3\n\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\f\5\f\u00ad\n\f\3\r\3\r\3\r\6\r\u00b2\n\r\r\r\16\r\u00b3\3"+
		"\16\3\16\3\16\3\16\5\16\u00ba\n\16\3\17\3\17\3\17\3\17\5\17\u00c0\n\17"+
		"\3\20\3\20\3\20\5\20\u00c5\n\20\3\21\3\21\3\21\5\21\u00ca\n\21\3\22\3"+
		"\22\3\22\3\23\3\23\5\23\u00d1\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u00fa\n\24\3\25\3\25\3\26\3\26\3\27\3\27\5\27"+
		"\u0102\n\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\5\32\u0111\n\32\3\33\3\33\5\33\u0115\n\33\3\34\3\34\7\34\u0119\n"+
		"\34\f\34\16\34\u011c\13\34\3\34\3\34\3\34\7\34\u0121\n\34\f\34\16\34\u0124"+
		"\13\34\3\34\5\34\u0127\n\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3"+
		")\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3.\6.\u0157\n.\r.\16.\u0158"+
		"\3.\3.\2/\3\2\1\5\2\1\7\2\1\t\2\1\13\2\1\r\2\1\17\2\1\21\2\1\23\2\1\25"+
		"\2\1\27\2\1\31\2\1\33\2\1\35\2\1\37\2\1!\2\1#\2\1%\2\1\'\2\1)\2\1+\2\1"+
		"-\2\1/\2\1\61\2\1\63\3\1\65\4\1\67\5\19\6\1;\7\1=\b\1?\t\1A\n\1C\13\1"+
		"E\f\1G\r\1I\16\1K\17\1M\20\1O\21\1Q\22\1S\23\1U\24\1W\25\1Y\26\1[\27\2"+
		"\3\2\33\6\2&&C\\aac|\7\2&&\62;C\\aac|\5\2\13\13\16\16\"\"\4\2\f\f\17\17"+
		"\3\2\62;\5\2\62;CHch\4\2GGgg\4\2--//\4\2ZZzz\5\2\f\f$$^^\5\2\f\f))^^\13"+
		"\2$$))^^ddhhppttvvxx\f\2\f\f$$))^^ddhhppttvvxx\4\2wwzz\3\2**\3\2++\3\2"+
		"==\3\2??\3\2--\3\2//\3\2,,\3\2\61\61\3\2>>\3\2@@\3\2##\u0161\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5g\3\2\2\2\7i\3\2\2\2\tk\3\2\2\2\13{\3"+
		"\2\2\2\r}\3\2\2\2\17\u0080\3\2\2\2\21\u00a2\3\2\2\2\23\u00a4\3\2\2\2\25"+
		"\u00a7\3\2\2\2\27\u00ac\3\2\2\2\31\u00ae\3\2\2\2\33\u00b9\3\2\2\2\35\u00bf"+
		"\3\2\2\2\37\u00c4\3\2\2\2!\u00c9\3\2\2\2#\u00cb\3\2\2\2%\u00d0\3\2\2\2"+
		"\'\u00f9\3\2\2\2)\u00fb\3\2\2\2+\u00fd\3\2\2\2-\u0101\3\2\2\2/\u0103\3"+
		"\2\2\2\61\u0108\3\2\2\2\63\u0110\3\2\2\2\65\u0114\3\2\2\2\67\u0126\3\2"+
		"\2\29\u0128\3\2\2\2;\u012d\3\2\2\2=\u012f\3\2\2\2?\u0131\3\2\2\2A\u0133"+
		"\3\2\2\2C\u0135\3\2\2\2E\u0137\3\2\2\2G\u0139\3\2\2\2I\u013b\3\2\2\2K"+
		"\u013d\3\2\2\2M\u0140\3\2\2\2O\u0142\3\2\2\2Q\u0144\3\2\2\2S\u0146\3\2"+
		"\2\2U\u0149\3\2\2\2W\u014f\3\2\2\2Y\u0153\3\2\2\2[\u0156\3\2\2\2]a\t\2"+
		"\2\2^`\t\3\2\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\4\3\2\2\2ca\3"+
		"\2\2\2dh\5\7\4\2eh\5\13\6\2fh\5\t\5\2gd\3\2\2\2ge\3\2\2\2gf\3\2\2\2h\6"+
		"\3\2\2\2ij\t\4\2\2j\b\3\2\2\2kl\7\61\2\2lm\7\61\2\2mq\3\2\2\2np\n\5\2"+
		"\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rv\3\2\2\2sq\3\2\2\2tw\5\13"+
		"\6\2uw\7\2\2\3vt\3\2\2\2vu\3\2\2\2w\n\3\2\2\2xy\7\17\2\2y|\7\f\2\2z|\t"+
		"\5\2\2{x\3\2\2\2{z\3\2\2\2|\f\3\2\2\2}~\t\6\2\2~\16\3\2\2\2\177\u0081"+
		"\t\7\2\2\u0080\177\3\2\2\2\u0081\20\3\2\2\2\u0082\u0084\5\r\7\2\u0083"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0087\u008b\7\60\2\2\u0088\u008a\5\r\7\2\u0089"+
		"\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0090\5\23\n\2\u008f"+
		"\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u00a3\3\2\2\2\u0091\u0093\7\60"+
		"\2\2\u0092\u0094\5\r\7\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0099\5\23"+
		"\n\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u00a3\3\2\2\2\u009a"+
		"\u009c\5\r\7\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2"+
		"\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u00a1\5\23\n\2\u00a0"+
		"\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u0083\3\2"+
		"\2\2\u00a2\u0091\3\2\2\2\u00a2\u009b\3\2\2\2\u00a3\22\3\2\2\2\u00a4\u00a5"+
		"\5\25\13\2\u00a5\u00a6\5\27\f\2\u00a6\24\3\2\2\2\u00a7\u00a8\t\b\2\2\u00a8"+
		"\26\3\2\2\2\u00a9\u00ad\5\r\7\2\u00aa\u00ab\t\t\2\2\u00ab\u00ad\5\r\7"+
		"\2\u00ac\u00a9\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\30\3\2\2\2\u00ae\u00af"+
		"\7\62\2\2\u00af\u00b1\t\n\2\2\u00b0\u00b2\5\17\b\2\u00b1\u00b0\3\2\2\2"+
		"\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\32"+
		"\3\2\2\2\u00b5\u00ba\5\37\20\2\u00b6\u00b7\5\37\20\2\u00b7\u00b8\5\33"+
		"\16\2\u00b8\u00ba\3\2\2\2\u00b9\u00b5\3\2\2\2\u00b9\u00b6\3\2\2\2\u00ba"+
		"\34\3\2\2\2\u00bb\u00c0\5!\21\2\u00bc\u00bd\5!\21\2\u00bd\u00be\5\35\17"+
		"\2\u00be\u00c0\3\2\2\2\u00bf\u00bb\3\2\2\2\u00bf\u00bc\3\2\2\2\u00c0\36"+
		"\3\2\2\2\u00c1\u00c5\n\13\2\2\u00c2\u00c3\7^\2\2\u00c3\u00c5\5%\23\2\u00c4"+
		"\u00c1\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5 \3\2\2\2\u00c6\u00ca\n\f\2\2"+
		"\u00c7\u00c8\7^\2\2\u00c8\u00ca\5%\23\2\u00c9\u00c6\3\2\2\2\u00c9\u00c7"+
		"\3\2\2\2\u00ca\"\3\2\2\2\u00cb\u00cc\7^\2\2\u00cc\u00cd\5\13\6\2\u00cd"+
		"$\3\2\2\2\u00ce\u00d1\5\'\24\2\u00cf\u00d1\7\62\2\2\u00d0\u00ce\3\2\2"+
		"\2\u00d0\u00cf\3\2\2\2\u00d1&\3\2\2\2\u00d2\u00d3\7U\2\2\u00d3\u00d4\7"+
		"k\2\2\u00d4\u00d5\7p\2\2\u00d5\u00d6\7i\2\2\u00d6\u00d7\7n\2\2\u00d7\u00d8"+
		"\7g\2\2\u00d8\u00d9\7G\2\2\u00d9\u00da\7u\2\2\u00da\u00db\7e\2\2\u00db"+
		"\u00dc\7c\2\2\u00dc\u00dd\7r\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7E\2\2"+
		"\u00df\u00e0\7j\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7t\2\2\u00e2\u00e3"+
		"\7c\2\2\u00e3\u00e4\7e\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e6\7g\2\2\u00e6"+
		"\u00fa\7t\2\2\u00e7\u00e8\7P\2\2\u00e8\u00e9\7q\2\2\u00e9\u00ea\7p\2\2"+
		"\u00ea\u00eb\7G\2\2\u00eb\u00ec\7u\2\2\u00ec\u00ed\7e\2\2\u00ed\u00ee"+
		"\7c\2\2\u00ee\u00ef\7r\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7E\2\2\u00f1"+
		"\u00f2\7j\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4\7t\2\2\u00f4\u00f5\7c\2\2"+
		"\u00f5\u00f6\7e\2\2\u00f6\u00f7\7v\2\2\u00f7\u00f8\7g\2\2\u00f8\u00fa"+
		"\7t\2\2\u00f9\u00d2\3\2\2\2\u00f9\u00e7\3\2\2\2\u00fa(\3\2\2\2\u00fb\u00fc"+
		"\t\r\2\2\u00fc*\3\2\2\2\u00fd\u00fe\n\16\2\2\u00fe,\3\2\2\2\u00ff\u0102"+
		"\5)\25\2\u0100\u0102\t\17\2\2\u0101\u00ff\3\2\2\2\u0101\u0100\3\2\2\2"+
		"\u0102.\3\2\2\2\u0103\u0104\7v\2\2\u0104\u0105\7t\2\2\u0105\u0106\7w\2"+
		"\2\u0106\u0107\7g\2\2\u0107\60\3\2\2\2\u0108\u0109\7h\2\2\u0109\u010a"+
		"\7c\2\2\u010a\u010b\7n\2\2\u010b\u010c\7u\2\2\u010c\u010d\7g\2\2\u010d"+
		"\62\3\2\2\2\u010e\u0111\5\21\t\2\u010f\u0111\5\31\r\2\u0110\u010e\3\2"+
		"\2\2\u0110\u010f\3\2\2\2\u0111\64\3\2\2\2\u0112\u0115\5/\30\2\u0113\u0115"+
		"\5\61\31\2\u0114\u0112\3\2\2\2\u0114\u0113\3\2\2\2\u0115\66\3\2\2\2\u0116"+
		"\u011a\7$\2\2\u0117\u0119\5\33\16\2\u0118\u0117\3\2\2\2\u0119\u011c\3"+
		"\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c"+
		"\u011a\3\2\2\2\u011d\u0127\7$\2\2\u011e\u0122\7)\2\2\u011f\u0121\5\35"+
		"\17\2\u0120\u011f\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0127\7)"+
		"\2\2\u0126\u0116\3\2\2\2\u0126\u011e\3\2\2\2\u01278\3\2\2\2\u0128\u0129"+
		"\7p\2\2\u0129\u012a\7w\2\2\u012a\u012b\7n\2\2\u012b\u012c\7n\2\2\u012c"+
		":\3\2\2\2\u012d\u012e\t\20\2\2\u012e<\3\2\2\2\u012f\u0130\t\21\2\2\u0130"+
		">\3\2\2\2\u0131\u0132\t\22\2\2\u0132@\3\2\2\2\u0133\u0134\t\23\2\2\u0134"+
		"B\3\2\2\2\u0135\u0136\t\24\2\2\u0136D\3\2\2\2\u0137\u0138\t\25\2\2\u0138"+
		"F\3\2\2\2\u0139\u013a\t\26\2\2\u013aH\3\2\2\2\u013b\u013c\t\27\2\2\u013c"+
		"J\3\2\2\2\u013d\u013e\t\23\2\2\u013e\u013f\t\23\2\2\u013fL\3\2\2\2\u0140"+
		"\u0141\t\30\2\2\u0141N\3\2\2\2\u0142\u0143\t\31\2\2\u0143P\3\2\2\2\u0144"+
		"\u0145\t\32\2\2\u0145R\3\2\2\2\u0146\u0147\t\32\2\2\u0147\u0148\t\23\2"+
		"\2\u0148T\3\2\2\2\u0149\u014a\7r\2\2\u014a\u014b\7t\2\2\u014b\u014c\7"+
		"k\2\2\u014c\u014d\7p\2\2\u014d\u014e\7v\2\2\u014eV\3\2\2\2\u014f\u0150"+
		"\7x\2\2\u0150\u0151\7c\2\2\u0151\u0152\7t\2\2\u0152X\3\2\2\2\u0153\u0154"+
		"\5\3\2\2\u0154Z\3\2\2\2\u0155\u0157\5\5\3\2\u0156\u0155\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2"+
		"\2\2\u015a\u015b\b.\2\2\u015b\\\3\2\2\2 \2agqv{\u0080\u0085\u008b\u008f"+
		"\u0095\u0098\u009d\u00a0\u00a2\u00ac\u00b3\u00b9\u00bf\u00c4\u00c9\u00d0"+
		"\u00f9\u0101\u0110\u0114\u011a\u0122\u0126\u0158";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}