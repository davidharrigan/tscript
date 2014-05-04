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
		T__15=1, T__14=2, T__13=3, T__12=4, T__11=5, T__10=6, T__9=7, T__8=8, 
		T__7=9, T__6=10, T__5=11, T__4=12, T__3=13, T__2=14, T__1=15, T__0=16, 
		NUMERIC_LITERAL=17, BOOLEAN_LITERAL=18, STRING_LITERAL=19, NULL_LITERAL=20, 
		LPAREN=21, RPAREN=22, LBRACK=23, RBRACK=24, SEMICOLON=25, COLON=26, EQUAL=27, 
		PLUS=28, MINUS=29, ASTERISK=30, DASH=31, COMMA=32, DOUBLE_EQUAL=33, LESS=34, 
		GREATER=35, NOT=36, NOT_EQUAL=37, PRINT=38, VAR=39, IDENTIFIER=40, WhiteSpace=41;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'.'", "'function'", "'throw'", "'while'", "'if'", "'continue'", "'return'", 
		"'try'", "'this'", "'{'", "'break'", "'new'", "'catch'", "'else'", "'}'", 
		"'finally'", "NUMERIC_LITERAL", "BOOLEAN_LITERAL", "STRING_LITERAL", "'null'", 
		"LPAREN", "RPAREN", "LBRACK", "RBRACK", "SEMICOLON", "COLON", "EQUAL", 
		"PLUS", "MINUS", "ASTERISK", "DASH", "COMMA", "DOUBLE_EQUAL", "LESS", 
		"GREATER", "NOT", "NOT_EQUAL", "'print'", "'var'", "IDENTIFIER", "WhiteSpace"
	};
	public static final String[] ruleNames = {
		"T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", 
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "IdentifierCharacters", 
		"SpaceTokens", "SpaceChars", "EndOfLineComment", "LineTerminator", "DecimalDigit", 
		"HexDigit", "DecimalLiteral", "ExponentPart", "ExponentIndicator", "SignedInteger", 
		"HexIntegerLiteral", "DoubleStringCharacters", "SingleStringCharacters", 
		"DoubleStringCharacter", "SingleStringCharacter", "LineContinuation", 
		"EscapeSequence", "CharacterEscapeSequence", "SingleEscapeCharacter", 
		"NonEscapeCharacter", "EscapeCharacter", "HexEscapeSequence", "TRUE", 
		"FALSE", "NUMERIC_LITERAL", "BOOLEAN_LITERAL", "STRING_LITERAL", "NULL_LITERAL", 
		"LPAREN", "RPAREN", "LBRACK", "RBRACK", "SEMICOLON", "COLON", "EQUAL", 
		"PLUS", "MINUS", "ASTERISK", "DASH", "COMMA", "DOUBLE_EQUAL", "LESS", 
		"GREATER", "NOT", "NOT_EQUAL", "PRINT", "VAR", "IDENTIFIER", "WhiteSpace"
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
		case 65: WhiteSpace_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WhiteSpace_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2+\u01ca\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\7\22\u00de\n\22"+
		"\f\22\16\22\u00e1\13\22\3\23\3\23\3\23\5\23\u00e6\n\23\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\7\25\u00ee\n\25\f\25\16\25\u00f1\13\25\3\25\3\25\5\25"+
		"\u00f5\n\25\3\26\3\26\3\26\5\26\u00fa\n\26\3\27\3\27\3\30\5\30\u00ff\n"+
		"\30\3\31\6\31\u0102\n\31\r\31\16\31\u0103\3\31\3\31\7\31\u0108\n\31\f"+
		"\31\16\31\u010b\13\31\3\31\5\31\u010e\n\31\3\31\3\31\6\31\u0112\n\31\r"+
		"\31\16\31\u0113\3\31\5\31\u0117\n\31\3\31\6\31\u011a\n\31\r\31\16\31\u011b"+
		"\3\31\5\31\u011f\n\31\5\31\u0121\n\31\3\32\3\32\3\32\3\33\3\33\3\34\6"+
		"\34\u0129\n\34\r\34\16\34\u012a\3\34\3\34\6\34\u012f\n\34\r\34\16\34\u0130"+
		"\5\34\u0133\n\34\3\35\3\35\3\35\6\35\u0138\n\35\r\35\16\35\u0139\3\36"+
		"\3\36\3\36\3\36\5\36\u0140\n\36\3\37\3\37\3\37\3\37\5\37\u0146\n\37\3"+
		" \3 \3 \5 \u014b\n \3!\3!\3!\5!\u0150\n!\3\"\3\"\3\"\3#\3#\5#\u0157\n"+
		"#\3$\3$\5$\u015b\n$\3%\3%\3&\3&\3\'\3\'\3\'\5\'\u0164\n\'\3(\3(\3(\3("+
		"\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\5+\u0177\n+\3,\3,\5,\u017b\n,"+
		"\3-\3-\7-\u017f\n-\f-\16-\u0182\13-\3-\3-\3-\7-\u0187\n-\f-\16-\u018a"+
		"\13-\3-\5-\u018d\n-\3.\3.\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62"+
		"\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3"+
		";\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3?\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3B\3"+
		"B\3C\6C\u01c5\nC\rC\16C\u01c6\3C\3C\2D\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1"+
		"\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37"+
		"\21\1!\22\1#\2\1%\2\1\'\2\1)\2\1+\2\1-\2\1/\2\1\61\2\1\63\2\1\65\2\1\67"+
		"\2\19\2\1;\2\1=\2\1?\2\1A\2\1C\2\1E\2\1G\2\1I\2\1K\2\1M\2\1O\2\1Q\2\1"+
		"S\2\1U\23\1W\24\1Y\25\1[\26\1]\27\1_\30\1a\31\1c\32\1e\33\1g\34\1i\35"+
		"\1k\36\1m\37\1o \1q!\1s\"\1u#\1w$\1y%\1{&\1}\'\1\177(\1\u0081)\1\u0083"+
		"*\1\u0085+\2\3\2\36\6\2&&C\\aac|\7\2&&\62;C\\aac|\5\2\13\13\16\16\"\""+
		"\4\2\f\f\17\17\3\2\62;\5\2\62;CHch\4\2GGgg\4\2--//\4\2ZZzz\5\2\f\f$$^"+
		"^\5\2\f\f))^^\13\2$$))^^ddhhppttvvxx\f\2\f\f$$))^^ddhhppttvvxx\3\2**\3"+
		"\2++\3\2]^\3\2^_\3\2==\3\2<<\3\2??\3\2--\3\2//\3\2,,\3\2\61\61\3\2..\3"+
		"\2>>\3\2@@\3\2##\u01d1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k"+
		"\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2"+
		"\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2"+
		"\u0083\3\2\2\2\2\u0085\3\2\2\2\3\u0087\3\2\2\2\5\u0089\3\2\2\2\7\u0092"+
		"\3\2\2\2\t\u0098\3\2\2\2\13\u009e\3\2\2\2\r\u00a1\3\2\2\2\17\u00aa\3\2"+
		"\2\2\21\u00b1\3\2\2\2\23\u00b5\3\2\2\2\25\u00ba\3\2\2\2\27\u00bc\3\2\2"+
		"\2\31\u00c2\3\2\2\2\33\u00c6\3\2\2\2\35\u00cc\3\2\2\2\37\u00d1\3\2\2\2"+
		"!\u00d3\3\2\2\2#\u00db\3\2\2\2%\u00e5\3\2\2\2\'\u00e7\3\2\2\2)\u00e9\3"+
		"\2\2\2+\u00f9\3\2\2\2-\u00fb\3\2\2\2/\u00fe\3\2\2\2\61\u0120\3\2\2\2\63"+
		"\u0122\3\2\2\2\65\u0125\3\2\2\2\67\u0132\3\2\2\29\u0134\3\2\2\2;\u013f"+
		"\3\2\2\2=\u0145\3\2\2\2?\u014a\3\2\2\2A\u014f\3\2\2\2C\u0151\3\2\2\2E"+
		"\u0156\3\2\2\2G\u015a\3\2\2\2I\u015c\3\2\2\2K\u015e\3\2\2\2M\u0163\3\2"+
		"\2\2O\u0165\3\2\2\2Q\u0169\3\2\2\2S\u016e\3\2\2\2U\u0176\3\2\2\2W\u017a"+
		"\3\2\2\2Y\u018c\3\2\2\2[\u018e\3\2\2\2]\u0193\3\2\2\2_\u0195\3\2\2\2a"+
		"\u0197\3\2\2\2c\u0199\3\2\2\2e\u019b\3\2\2\2g\u019d\3\2\2\2i\u019f\3\2"+
		"\2\2k\u01a1\3\2\2\2m\u01a3\3\2\2\2o\u01a5\3\2\2\2q\u01a7\3\2\2\2s\u01a9"+
		"\3\2\2\2u\u01ab\3\2\2\2w\u01ae\3\2\2\2y\u01b0\3\2\2\2{\u01b2\3\2\2\2}"+
		"\u01b4\3\2\2\2\177\u01b7\3\2\2\2\u0081\u01bd\3\2\2\2\u0083\u01c1\3\2\2"+
		"\2\u0085\u01c4\3\2\2\2\u0087\u0088\7\60\2\2\u0088\4\3\2\2\2\u0089\u008a"+
		"\7h\2\2\u008a\u008b\7w\2\2\u008b\u008c\7p\2\2\u008c\u008d\7e\2\2\u008d"+
		"\u008e\7v\2\2\u008e\u008f\7k\2\2\u008f\u0090\7q\2\2\u0090\u0091\7p\2\2"+
		"\u0091\6\3\2\2\2\u0092\u0093\7v\2\2\u0093\u0094\7j\2\2\u0094\u0095\7t"+
		"\2\2\u0095\u0096\7q\2\2\u0096\u0097\7y\2\2\u0097\b\3\2\2\2\u0098\u0099"+
		"\7y\2\2\u0099\u009a\7j\2\2\u009a\u009b\7k\2\2\u009b\u009c\7n\2\2\u009c"+
		"\u009d\7g\2\2\u009d\n\3\2\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7h\2\2\u00a0"+
		"\f\3\2\2\2\u00a1\u00a2\7e\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7p\2\2\u00a4"+
		"\u00a5\7v\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8\7w\2\2"+
		"\u00a8\u00a9\7g\2\2\u00a9\16\3\2\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7"+
		"g\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7w\2\2\u00ae\u00af\7t\2\2\u00af\u00b0"+
		"\7p\2\2\u00b0\20\3\2\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4"+
		"\7{\2\2\u00b4\22\3\2\2\2\u00b5\u00b6\7v\2\2\u00b6\u00b7\7j\2\2\u00b7\u00b8"+
		"\7k\2\2\u00b8\u00b9\7u\2\2\u00b9\24\3\2\2\2\u00ba\u00bb\7}\2\2\u00bb\26"+
		"\3\2\2\2\u00bc\u00bd\7d\2\2\u00bd\u00be\7t\2\2\u00be\u00bf\7g\2\2\u00bf"+
		"\u00c0\7c\2\2\u00c0\u00c1\7m\2\2\u00c1\30\3\2\2\2\u00c2\u00c3\7p\2\2\u00c3"+
		"\u00c4\7g\2\2\u00c4\u00c5\7y\2\2\u00c5\32\3\2\2\2\u00c6\u00c7\7e\2\2\u00c7"+
		"\u00c8\7c\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7e\2\2\u00ca\u00cb\7j\2\2"+
		"\u00cb\34\3\2\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7n\2\2\u00ce\u00cf\7"+
		"u\2\2\u00cf\u00d0\7g\2\2\u00d0\36\3\2\2\2\u00d1\u00d2\7\177\2\2\u00d2"+
		" \3\2\2\2\u00d3\u00d4\7h\2\2\u00d4\u00d5\7k\2\2\u00d5\u00d6\7p\2\2\u00d6"+
		"\u00d7\7c\2\2\u00d7\u00d8\7n\2\2\u00d8\u00d9\7n\2\2\u00d9\u00da\7{\2\2"+
		"\u00da\"\3\2\2\2\u00db\u00df\t\2\2\2\u00dc\u00de\t\3\2\2\u00dd\u00dc\3"+
		"\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"$\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e6\5\'\24\2\u00e3\u00e6\5+\26\2"+
		"\u00e4\u00e6\5)\25\2\u00e5\u00e2\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e4"+
		"\3\2\2\2\u00e6&\3\2\2\2\u00e7\u00e8\t\4\2\2\u00e8(\3\2\2\2\u00e9\u00ea"+
		"\7\61\2\2\u00ea\u00eb\7\61\2\2\u00eb\u00ef\3\2\2\2\u00ec\u00ee\n\5\2\2"+
		"\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0"+
		"\3\2\2\2\u00f0\u00f4\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f5\5+\26\2\u00f3"+
		"\u00f5\7\2\2\3\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5*\3\2\2\2"+
		"\u00f6\u00f7\7\17\2\2\u00f7\u00fa\7\f\2\2\u00f8\u00fa\t\5\2\2\u00f9\u00f6"+
		"\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa,\3\2\2\2\u00fb\u00fc\t\6\2\2\u00fc"+
		".\3\2\2\2\u00fd\u00ff\t\7\2\2\u00fe\u00fd\3\2\2\2\u00ff\60\3\2\2\2\u0100"+
		"\u0102\5-\27\2\u0101\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0101\3\2"+
		"\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0109\7\60\2\2\u0106"+
		"\u0108\5-\27\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2"+
		"\2\2\u0109\u010a\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010c"+
		"\u010e\5\63\32\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0121\3"+
		"\2\2\2\u010f\u0111\7\60\2\2\u0110\u0112\5-\27\2\u0111\u0110\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2"+
		"\2\2\u0115\u0117\5\63\32\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u0121\3\2\2\2\u0118\u011a\5-\27\2\u0119\u0118\3\2\2\2\u011a\u011b\3\2"+
		"\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d"+
		"\u011f\5\63\32\2\u011e\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3"+
		"\2\2\2\u0120\u0101\3\2\2\2\u0120\u010f\3\2\2\2\u0120\u0119\3\2\2\2\u0121"+
		"\62\3\2\2\2\u0122\u0123\5\65\33\2\u0123\u0124\5\67\34\2\u0124\64\3\2\2"+
		"\2\u0125\u0126\t\b\2\2\u0126\66\3\2\2\2\u0127\u0129\5-\27\2\u0128\u0127"+
		"\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u0133\3\2\2\2\u012c\u012e\t\t\2\2\u012d\u012f\5-\27\2\u012e\u012d\3\2"+
		"\2\2\u012f\u0130\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\u0133\3\2\2\2\u0132\u0128\3\2\2\2\u0132\u012c\3\2\2\2\u01338\3\2\2\2"+
		"\u0134\u0135\7\62\2\2\u0135\u0137\t\n\2\2\u0136\u0138\5/\30\2\u0137\u0136"+
		"\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		":\3\2\2\2\u013b\u0140\5? \2\u013c\u013d\5? \2\u013d\u013e\5;\36\2\u013e"+
		"\u0140\3\2\2\2\u013f\u013b\3\2\2\2\u013f\u013c\3\2\2\2\u0140<\3\2\2\2"+
		"\u0141\u0146\5A!\2\u0142\u0143\5A!\2\u0143\u0144\5=\37\2\u0144\u0146\3"+
		"\2\2\2\u0145\u0141\3\2\2\2\u0145\u0142\3\2\2\2\u0146>\3\2\2\2\u0147\u014b"+
		"\n\13\2\2\u0148\u0149\7^\2\2\u0149\u014b\5E#\2\u014a\u0147\3\2\2\2\u014a"+
		"\u0148\3\2\2\2\u014b@\3\2\2\2\u014c\u0150\n\f\2\2\u014d\u014e\7^\2\2\u014e"+
		"\u0150\5E#\2\u014f\u014c\3\2\2\2\u014f\u014d\3\2\2\2\u0150B\3\2\2\2\u0151"+
		"\u0152\7^\2\2\u0152\u0153\5+\26\2\u0153D\3\2\2\2\u0154\u0157\5G$\2\u0155"+
		"\u0157\7\62\2\2\u0156\u0154\3\2\2\2\u0156\u0155\3\2\2\2\u0157F\3\2\2\2"+
		"\u0158\u015b\5I%\2\u0159\u015b\5K&\2\u015a\u0158\3\2\2\2\u015a\u0159\3"+
		"\2\2\2\u015bH\3\2\2\2\u015c\u015d\t\r\2\2\u015dJ\3\2\2\2\u015e\u015f\n"+
		"\16\2\2\u015fL\3\2\2\2\u0160\u0164\5I%\2\u0161\u0164\5-\27\2\u0162\u0164"+
		"\7z\2\2\u0163\u0160\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0162\3\2\2\2\u0164"+
		"N\3\2\2\2\u0165\u0166\7z\2\2\u0166\u0167\5/\30\2\u0167\u0168\5/\30\2\u0168"+
		"P\3\2\2\2\u0169\u016a\7v\2\2\u016a\u016b\7t\2\2\u016b\u016c\7w\2\2\u016c"+
		"\u016d\7g\2\2\u016dR\3\2\2\2\u016e\u016f\7h\2\2\u016f\u0170\7c\2\2\u0170"+
		"\u0171\7n\2\2\u0171\u0172\7u\2\2\u0172\u0173\7g\2\2\u0173T\3\2\2\2\u0174"+
		"\u0177\5\61\31\2\u0175\u0177\59\35\2\u0176\u0174\3\2\2\2\u0176\u0175\3"+
		"\2\2\2\u0177V\3\2\2\2\u0178\u017b\5Q)\2\u0179\u017b\5S*\2\u017a\u0178"+
		"\3\2\2\2\u017a\u0179\3\2\2\2\u017bX\3\2\2\2\u017c\u0180\7$\2\2\u017d\u017f"+
		"\5;\36\2\u017e\u017d\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181\u0183\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u018d\7$"+
		"\2\2\u0184\u0188\7)\2\2\u0185\u0187\5=\37\2\u0186\u0185\3\2\2\2\u0187"+
		"\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018b\3\2"+
		"\2\2\u018a\u0188\3\2\2\2\u018b\u018d\7)\2\2\u018c\u017c\3\2\2\2\u018c"+
		"\u0184\3\2\2\2\u018dZ\3\2\2\2\u018e\u018f\7p\2\2\u018f\u0190\7w\2\2\u0190"+
		"\u0191\7n\2\2\u0191\u0192\7n\2\2\u0192\\\3\2\2\2\u0193\u0194\t\17\2\2"+
		"\u0194^\3\2\2\2\u0195\u0196\t\20\2\2\u0196`\3\2\2\2\u0197\u0198\t\21\2"+
		"\2\u0198b\3\2\2\2\u0199\u019a\t\22\2\2\u019ad\3\2\2\2\u019b\u019c\t\23"+
		"\2\2\u019cf\3\2\2\2\u019d\u019e\t\24\2\2\u019eh\3\2\2\2\u019f\u01a0\t"+
		"\25\2\2\u01a0j\3\2\2\2\u01a1\u01a2\t\26\2\2\u01a2l\3\2\2\2\u01a3\u01a4"+
		"\t\27\2\2\u01a4n\3\2\2\2\u01a5\u01a6\t\30\2\2\u01a6p\3\2\2\2\u01a7\u01a8"+
		"\t\31\2\2\u01a8r\3\2\2\2\u01a9\u01aa\t\32\2\2\u01aat\3\2\2\2\u01ab\u01ac"+
		"\t\25\2\2\u01ac\u01ad\t\25\2\2\u01adv\3\2\2\2\u01ae\u01af\t\33\2\2\u01af"+
		"x\3\2\2\2\u01b0\u01b1\t\34\2\2\u01b1z\3\2\2\2\u01b2\u01b3\t\35\2\2\u01b3"+
		"|\3\2\2\2\u01b4\u01b5\t\35\2\2\u01b5\u01b6\t\25\2\2\u01b6~\3\2\2\2\u01b7"+
		"\u01b8\7r\2\2\u01b8\u01b9\7t\2\2\u01b9\u01ba\7k\2\2\u01ba\u01bb\7p\2\2"+
		"\u01bb\u01bc\7v\2\2\u01bc\u0080\3\2\2\2\u01bd\u01be\7x\2\2\u01be\u01bf"+
		"\7c\2\2\u01bf\u01c0\7t\2\2\u01c0\u0082\3\2\2\2\u01c1\u01c2\5#\22\2\u01c2"+
		"\u0084\3\2\2\2\u01c3\u01c5\5%\23\2\u01c4\u01c3\3\2\2\2\u01c5\u01c6\3\2"+
		"\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8"+
		"\u01c9\bC\2\2\u01c9\u0086\3\2\2\2\"\2\u00df\u00e5\u00ef\u00f4\u00f9\u00fe"+
		"\u0103\u0109\u010d\u0113\u0116\u011b\u011e\u0120\u012a\u0130\u0132\u0139"+
		"\u013f\u0145\u014a\u014f\u0156\u015a\u0163\u0176\u017a\u0180\u0188\u018c"+
		"\u01c6";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}