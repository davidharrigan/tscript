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
		DASH=12, COMMA=13, DOUBLE_EQUAL=14, LESS=15, GREATER=16, NOT=17, NOT_EQUAL=18, 
		PRINT=19, VAR=20, IDENTIFIER=21, WhiteSpace=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"NUMERIC_LITERAL", "BOOLEAN_LITERAL", "STRING_LITERAL", "'null'", "LPAREN", 
		"RPAREN", "SEMICOLON", "EQUAL", "PLUS", "MINUS", "ASTERISK", "DASH", "COMMA", 
		"DOUBLE_EQUAL", "LESS", "GREATER", "NOT", "NOT_EQUAL", "'print'", "'var'", 
		"IDENTIFIER", "WhiteSpace"
	};
	public static final String[] ruleNames = {
		"IdentifierCharacters", "SpaceTokens", "SpaceChars", "EndOfLineComment", 
		"LineTerminator", "DecimalDigit", "HexDigit", "DecimalLiteral", "ExponentPart", 
		"ExponentIndicator", "SignedInteger", "HexIntegerLiteral", "DoubleStringCharacters", 
		"SingleStringCharacters", "DoubleStringCharacter", "SingleStringCharacter", 
		"LineContinuation", "EscapeSequence", "CharacterEscapeSequence", "SingleEscapeCharacter", 
		"NonEscapeCharacter", "EscapeCharacter", "HexEscapeSequence", "TRUE", 
		"FALSE", "NUMERIC_LITERAL", "BOOLEAN_LITERAL", "STRING_LITERAL", "NULL_LITERAL", 
		"LPAREN", "RPAREN", "SEMICOLON", "EQUAL", "PLUS", "MINUS", "ASTERISK", 
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
		case 46: WhiteSpace_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WhiteSpace_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\30\u014a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\7\2d\n\2\f\2\16\2g\13\2\3"+
		"\3\3\3\3\3\5\3l\n\3\3\4\3\4\3\5\3\5\3\5\3\5\7\5t\n\5\f\5\16\5w\13\5\3"+
		"\5\3\5\5\5{\n\5\3\6\3\6\3\6\5\6\u0080\n\6\3\7\3\7\3\b\5\b\u0085\n\b\3"+
		"\t\6\t\u0088\n\t\r\t\16\t\u0089\3\t\3\t\7\t\u008e\n\t\f\t\16\t\u0091\13"+
		"\t\3\t\5\t\u0094\n\t\3\t\3\t\6\t\u0098\n\t\r\t\16\t\u0099\3\t\5\t\u009d"+
		"\n\t\3\t\6\t\u00a0\n\t\r\t\16\t\u00a1\3\t\5\t\u00a5\n\t\5\t\u00a7\n\t"+
		"\3\n\3\n\3\n\3\13\3\13\3\f\6\f\u00af\n\f\r\f\16\f\u00b0\3\f\3\f\6\f\u00b5"+
		"\n\f\r\f\16\f\u00b6\5\f\u00b9\n\f\3\r\3\r\3\r\6\r\u00be\n\r\r\r\16\r\u00bf"+
		"\3\16\3\16\3\16\3\16\5\16\u00c6\n\16\3\17\3\17\3\17\3\17\5\17\u00cc\n"+
		"\17\3\20\3\20\3\20\5\20\u00d1\n\20\3\21\3\21\3\21\5\21\u00d6\n\21\3\22"+
		"\3\22\3\22\3\23\3\23\5\23\u00dd\n\23\3\24\3\24\5\24\u00e1\n\24\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\27\5\27\u00ea\n\27\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\5\33\u00fd"+
		"\n\33\3\34\3\34\5\34\u0101\n\34\3\35\3\35\7\35\u0105\n\35\f\35\16\35\u0108"+
		"\13\35\3\35\3\35\3\35\7\35\u010d\n\35\f\35\16\35\u0110\13\35\3\35\5\35"+
		"\u0113\n\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#"+
		"\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3,\3-\3"+
		"-\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3\60\6\60\u0145\n\60\r\60\16\60\u0146"+
		"\3\60\3\60\2\61\3\2\1\5\2\1\7\2\1\t\2\1\13\2\1\r\2\1\17\2\1\21\2\1\23"+
		"\2\1\25\2\1\27\2\1\31\2\1\33\2\1\35\2\1\37\2\1!\2\1#\2\1%\2\1\'\2\1)\2"+
		"\1+\2\1-\2\1/\2\1\61\2\1\63\2\1\65\3\1\67\4\19\5\1;\6\1=\7\1?\b\1A\t\1"+
		"C\n\1E\13\1G\f\1I\r\1K\16\1M\17\1O\20\1Q\21\1S\22\1U\23\1W\24\1Y\25\1"+
		"[\26\1]\27\1_\30\2\3\2\33\6\2&&C\\aac|\7\2&&\62;C\\aac|\5\2\13\13\16\16"+
		"\"\"\4\2\f\f\17\17\3\2\62;\5\2\62;CHch\4\2GGgg\4\2--//\4\2ZZzz\5\2\f\f"+
		"$$^^\5\2\f\f))^^\13\2$$))^^ddhhppttvvxx\f\2\f\f$$))^^ddhhppttvvxx\3\2"+
		"**\3\2++\3\2==\3\2??\3\2--\3\2//\3\2,,\3\2\61\61\3\2..\3\2>>\3\2@@\3\2"+
		"##\u0151\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3a\3\2\2\2\5k\3\2\2\2\7"+
		"m\3\2\2\2\to\3\2\2\2\13\177\3\2\2\2\r\u0081\3\2\2\2\17\u0084\3\2\2\2\21"+
		"\u00a6\3\2\2\2\23\u00a8\3\2\2\2\25\u00ab\3\2\2\2\27\u00b8\3\2\2\2\31\u00ba"+
		"\3\2\2\2\33\u00c5\3\2\2\2\35\u00cb\3\2\2\2\37\u00d0\3\2\2\2!\u00d5\3\2"+
		"\2\2#\u00d7\3\2\2\2%\u00dc\3\2\2\2\'\u00e0\3\2\2\2)\u00e2\3\2\2\2+\u00e4"+
		"\3\2\2\2-\u00e9\3\2\2\2/\u00eb\3\2\2\2\61\u00ef\3\2\2\2\63\u00f4\3\2\2"+
		"\2\65\u00fc\3\2\2\2\67\u0100\3\2\2\29\u0112\3\2\2\2;\u0114\3\2\2\2=\u0119"+
		"\3\2\2\2?\u011b\3\2\2\2A\u011d\3\2\2\2C\u011f\3\2\2\2E\u0121\3\2\2\2G"+
		"\u0123\3\2\2\2I\u0125\3\2\2\2K\u0127\3\2\2\2M\u0129\3\2\2\2O\u012b\3\2"+
		"\2\2Q\u012e\3\2\2\2S\u0130\3\2\2\2U\u0132\3\2\2\2W\u0134\3\2\2\2Y\u0137"+
		"\3\2\2\2[\u013d\3\2\2\2]\u0141\3\2\2\2_\u0144\3\2\2\2ae\t\2\2\2bd\t\3"+
		"\2\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\4\3\2\2\2ge\3\2\2\2hl\5"+
		"\7\4\2il\5\13\6\2jl\5\t\5\2kh\3\2\2\2ki\3\2\2\2kj\3\2\2\2l\6\3\2\2\2m"+
		"n\t\4\2\2n\b\3\2\2\2op\7\61\2\2pq\7\61\2\2qu\3\2\2\2rt\n\5\2\2sr\3\2\2"+
		"\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vz\3\2\2\2wu\3\2\2\2x{\5\13\6\2y{\7\2"+
		"\2\3zx\3\2\2\2zy\3\2\2\2{\n\3\2\2\2|}\7\17\2\2}\u0080\7\f\2\2~\u0080\t"+
		"\5\2\2\177|\3\2\2\2\177~\3\2\2\2\u0080\f\3\2\2\2\u0081\u0082\t\6\2\2\u0082"+
		"\16\3\2\2\2\u0083\u0085\t\7\2\2\u0084\u0083\3\2\2\2\u0085\20\3\2\2\2\u0086"+
		"\u0088\5\r\7\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2"+
		"\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008f\7\60\2\2\u008c"+
		"\u008e\5\r\7\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2"+
		"\2\2\u008f\u0090\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0092"+
		"\u0094\5\23\n\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u00a7\3"+
		"\2\2\2\u0095\u0097\7\60\2\2\u0096\u0098\5\r\7\2\u0097\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2"+
		"\2\2\u009b\u009d\5\23\n\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u00a7\3\2\2\2\u009e\u00a0\5\r\7\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3"+
		"\u00a5\5\23\n\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3"+
		"\2\2\2\u00a6\u0087\3\2\2\2\u00a6\u0095\3\2\2\2\u00a6\u009f\3\2\2\2\u00a7"+
		"\22\3\2\2\2\u00a8\u00a9\5\25\13\2\u00a9\u00aa\5\27\f\2\u00aa\24\3\2\2"+
		"\2\u00ab\u00ac\t\b\2\2\u00ac\26\3\2\2\2\u00ad\u00af\5\r\7\2\u00ae\u00ad"+
		"\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b9\3\2\2\2\u00b2\u00b4\t\t\2\2\u00b3\u00b5\5\r\7\2\u00b4\u00b3\3\2"+
		"\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b9\3\2\2\2\u00b8\u00ae\3\2\2\2\u00b8\u00b2\3\2\2\2\u00b9\30\3\2\2"+
		"\2\u00ba\u00bb\7\62\2\2\u00bb\u00bd\t\n\2\2\u00bc\u00be\5\17\b\2\u00bd"+
		"\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\32\3\2\2\2\u00c1\u00c6\5\37\20\2\u00c2\u00c3\5\37\20\2\u00c3"+
		"\u00c4\5\33\16\2\u00c4\u00c6\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c5\u00c2\3"+
		"\2\2\2\u00c6\34\3\2\2\2\u00c7\u00cc\5!\21\2\u00c8\u00c9\5!\21\2\u00c9"+
		"\u00ca\5\35\17\2\u00ca\u00cc\3\2\2\2\u00cb\u00c7\3\2\2\2\u00cb\u00c8\3"+
		"\2\2\2\u00cc\36\3\2\2\2\u00cd\u00d1\n\13\2\2\u00ce\u00cf\7^\2\2\u00cf"+
		"\u00d1\5%\23\2\u00d0\u00cd\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1 \3\2\2\2"+
		"\u00d2\u00d6\n\f\2\2\u00d3\u00d4\7^\2\2\u00d4\u00d6\5%\23\2\u00d5\u00d2"+
		"\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\"\3\2\2\2\u00d7\u00d8\7^\2\2\u00d8"+
		"\u00d9\5\13\6\2\u00d9$\3\2\2\2\u00da\u00dd\5\'\24\2\u00db\u00dd\7\62\2"+
		"\2\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd&\3\2\2\2\u00de\u00e1"+
		"\5)\25\2\u00df\u00e1\5+\26\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1"+
		"(\3\2\2\2\u00e2\u00e3\t\r\2\2\u00e3*\3\2\2\2\u00e4\u00e5\n\16\2\2\u00e5"+
		",\3\2\2\2\u00e6\u00ea\5)\25\2\u00e7\u00ea\5\r\7\2\u00e8\u00ea\7z\2\2\u00e9"+
		"\u00e6\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea.\3\2\2\2"+
		"\u00eb\u00ec\7z\2\2\u00ec\u00ed\5\17\b\2\u00ed\u00ee\5\17\b\2\u00ee\60"+
		"\3\2\2\2\u00ef\u00f0\7v\2\2\u00f0\u00f1\7t\2\2\u00f1\u00f2\7w\2\2\u00f2"+
		"\u00f3\7g\2\2\u00f3\62\3\2\2\2\u00f4\u00f5\7h\2\2\u00f5\u00f6\7c\2\2\u00f6"+
		"\u00f7\7n\2\2\u00f7\u00f8\7u\2\2\u00f8\u00f9\7g\2\2\u00f9\64\3\2\2\2\u00fa"+
		"\u00fd\5\21\t\2\u00fb\u00fd\5\31\r\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3"+
		"\2\2\2\u00fd\66\3\2\2\2\u00fe\u0101\5\61\31\2\u00ff\u0101\5\63\32\2\u0100"+
		"\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u01018\3\2\2\2\u0102\u0106\7$\2\2\u0103"+
		"\u0105\5\33\16\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3"+
		"\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u0106\3\2\2\2\u0109"+
		"\u0113\7$\2\2\u010a\u010e\7)\2\2\u010b\u010d\5\35\17\2\u010c\u010b\3\2"+
		"\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0113\7)\2\2\u0112\u0102\3\2"+
		"\2\2\u0112\u010a\3\2\2\2\u0113:\3\2\2\2\u0114\u0115\7p\2\2\u0115\u0116"+
		"\7w\2\2\u0116\u0117\7n\2\2\u0117\u0118\7n\2\2\u0118<\3\2\2\2\u0119\u011a"+
		"\t\17\2\2\u011a>\3\2\2\2\u011b\u011c\t\20\2\2\u011c@\3\2\2\2\u011d\u011e"+
		"\t\21\2\2\u011eB\3\2\2\2\u011f\u0120\t\22\2\2\u0120D\3\2\2\2\u0121\u0122"+
		"\t\23\2\2\u0122F\3\2\2\2\u0123\u0124\t\24\2\2\u0124H\3\2\2\2\u0125\u0126"+
		"\t\25\2\2\u0126J\3\2\2\2\u0127\u0128\t\26\2\2\u0128L\3\2\2\2\u0129\u012a"+
		"\t\27\2\2\u012aN\3\2\2\2\u012b\u012c\t\22\2\2\u012c\u012d\t\22\2\2\u012d"+
		"P\3\2\2\2\u012e\u012f\t\30\2\2\u012fR\3\2\2\2\u0130\u0131\t\31\2\2\u0131"+
		"T\3\2\2\2\u0132\u0133\t\32\2\2\u0133V\3\2\2\2\u0134\u0135\t\32\2\2\u0135"+
		"\u0136\t\22\2\2\u0136X\3\2\2\2\u0137\u0138\7r\2\2\u0138\u0139\7t\2\2\u0139"+
		"\u013a\7k\2\2\u013a\u013b\7p\2\2\u013b\u013c\7v\2\2\u013cZ\3\2\2\2\u013d"+
		"\u013e\7x\2\2\u013e\u013f\7c\2\2\u013f\u0140\7t\2\2\u0140\\\3\2\2\2\u0141"+
		"\u0142\5\3\2\2\u0142^\3\2\2\2\u0143\u0145\5\5\3\2\u0144\u0143\3\2\2\2"+
		"\u0145\u0146\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148"+
		"\3\2\2\2\u0148\u0149\b\60\2\2\u0149`\3\2\2\2\"\2ekuz\177\u0084\u0089\u008f"+
		"\u0093\u0099\u009c\u00a1\u00a4\u00a6\u00b0\u00b6\u00b8\u00bf\u00c5\u00cb"+
		"\u00d0\u00d5\u00dc\u00e0\u00e9\u00fc\u0100\u0106\u010e\u0112\u0146";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}