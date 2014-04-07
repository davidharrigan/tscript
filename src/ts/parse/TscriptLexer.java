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
		LPAREN=21, RPAREN=22, SEMICOLON=23, COLON=24, EQUAL=25, PLUS=26, MINUS=27, 
		ASTERISK=28, DASH=29, COMMA=30, DOUBLE_EQUAL=31, LESS=32, GREATER=33, 
		NOT=34, NOT_EQUAL=35, PRINT=36, VAR=37, IDENTIFIER=38, WhiteSpace=39;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'.'", "'function'", "'throw'", "'while'", "'if'", "'continue'", "'return'", 
		"'try'", "'this'", "'{'", "'break'", "'new'", "'catch'", "'else'", "'}'", 
		"'finally'", "NUMERIC_LITERAL", "BOOLEAN_LITERAL", "STRING_LITERAL", "'null'", 
		"LPAREN", "RPAREN", "SEMICOLON", "COLON", "EQUAL", "PLUS", "MINUS", "ASTERISK", 
		"DASH", "COMMA", "DOUBLE_EQUAL", "LESS", "GREATER", "NOT", "NOT_EQUAL", 
		"'print'", "'var'", "IDENTIFIER", "WhiteSpace"
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
		case 63: WhiteSpace_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WhiteSpace_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2)\u01c2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\7\22\u00da\n\22\f\22\16\22"+
		"\u00dd\13\22\3\23\3\23\3\23\5\23\u00e2\n\23\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\7\25\u00ea\n\25\f\25\16\25\u00ed\13\25\3\25\3\25\5\25\u00f1\n\25\3"+
		"\26\3\26\3\26\5\26\u00f6\n\26\3\27\3\27\3\30\5\30\u00fb\n\30\3\31\6\31"+
		"\u00fe\n\31\r\31\16\31\u00ff\3\31\3\31\7\31\u0104\n\31\f\31\16\31\u0107"+
		"\13\31\3\31\5\31\u010a\n\31\3\31\3\31\6\31\u010e\n\31\r\31\16\31\u010f"+
		"\3\31\5\31\u0113\n\31\3\31\6\31\u0116\n\31\r\31\16\31\u0117\3\31\5\31"+
		"\u011b\n\31\5\31\u011d\n\31\3\32\3\32\3\32\3\33\3\33\3\34\6\34\u0125\n"+
		"\34\r\34\16\34\u0126\3\34\3\34\6\34\u012b\n\34\r\34\16\34\u012c\5\34\u012f"+
		"\n\34\3\35\3\35\3\35\6\35\u0134\n\35\r\35\16\35\u0135\3\36\3\36\3\36\3"+
		"\36\5\36\u013c\n\36\3\37\3\37\3\37\3\37\5\37\u0142\n\37\3 \3 \3 \5 \u0147"+
		"\n \3!\3!\3!\5!\u014c\n!\3\"\3\"\3\"\3#\3#\5#\u0153\n#\3$\3$\5$\u0157"+
		"\n$\3%\3%\3&\3&\3\'\3\'\3\'\5\'\u0160\n\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\3"+
		"*\3*\3*\3*\3*\3*\3+\3+\5+\u0173\n+\3,\3,\5,\u0177\n,\3-\3-\7-\u017b\n"+
		"-\f-\16-\u017e\13-\3-\3-\3-\7-\u0183\n-\f-\16-\u0186\13-\3-\5-\u0189\n"+
		"-\3.\3.\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3"+
		"\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\39\3:\3:\3;\3;\3<\3<\3="+
		"\3=\3=\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3@\3@\3A\6A\u01bd\nA\rA\16A\u01be"+
		"\3A\3A\2B\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25"+
		"\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\2\1%\2\1\'\2\1)\2\1"+
		"+\2\1-\2\1/\2\1\61\2\1\63\2\1\65\2\1\67\2\19\2\1;\2\1=\2\1?\2\1A\2\1C"+
		"\2\1E\2\1G\2\1I\2\1K\2\1M\2\1O\2\1Q\2\1S\2\1U\23\1W\24\1Y\25\1[\26\1]"+
		"\27\1_\30\1a\31\1c\32\1e\33\1g\34\1i\35\1k\36\1m\37\1o \1q!\1s\"\1u#\1"+
		"w$\1y%\1{&\1}\'\1\177(\1\u0081)\2\3\2\34\6\2&&C\\aac|\7\2&&\62;C\\aac"+
		"|\5\2\13\13\16\16\"\"\4\2\f\f\17\17\3\2\62;\5\2\62;CHch\4\2GGgg\4\2--"+
		"//\4\2ZZzz\5\2\f\f$$^^\5\2\f\f))^^\13\2$$))^^ddhhppttvvxx\f\2\f\f$$))"+
		"^^ddhhppttvvxx\3\2**\3\2++\3\2==\3\2<<\3\2??\3\2--\3\2//\3\2,,\3\2\61"+
		"\61\3\2..\3\2>>\3\2@@\3\2##\u01c9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i"+
		"\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2"+
		"\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081"+
		"\3\2\2\2\3\u0083\3\2\2\2\5\u0085\3\2\2\2\7\u008e\3\2\2\2\t\u0094\3\2\2"+
		"\2\13\u009a\3\2\2\2\r\u009d\3\2\2\2\17\u00a6\3\2\2\2\21\u00ad\3\2\2\2"+
		"\23\u00b1\3\2\2\2\25\u00b6\3\2\2\2\27\u00b8\3\2\2\2\31\u00be\3\2\2\2\33"+
		"\u00c2\3\2\2\2\35\u00c8\3\2\2\2\37\u00cd\3\2\2\2!\u00cf\3\2\2\2#\u00d7"+
		"\3\2\2\2%\u00e1\3\2\2\2\'\u00e3\3\2\2\2)\u00e5\3\2\2\2+\u00f5\3\2\2\2"+
		"-\u00f7\3\2\2\2/\u00fa\3\2\2\2\61\u011c\3\2\2\2\63\u011e\3\2\2\2\65\u0121"+
		"\3\2\2\2\67\u012e\3\2\2\29\u0130\3\2\2\2;\u013b\3\2\2\2=\u0141\3\2\2\2"+
		"?\u0146\3\2\2\2A\u014b\3\2\2\2C\u014d\3\2\2\2E\u0152\3\2\2\2G\u0156\3"+
		"\2\2\2I\u0158\3\2\2\2K\u015a\3\2\2\2M\u015f\3\2\2\2O\u0161\3\2\2\2Q\u0165"+
		"\3\2\2\2S\u016a\3\2\2\2U\u0172\3\2\2\2W\u0176\3\2\2\2Y\u0188\3\2\2\2["+
		"\u018a\3\2\2\2]\u018f\3\2\2\2_\u0191\3\2\2\2a\u0193\3\2\2\2c\u0195\3\2"+
		"\2\2e\u0197\3\2\2\2g\u0199\3\2\2\2i\u019b\3\2\2\2k\u019d\3\2\2\2m\u019f"+
		"\3\2\2\2o\u01a1\3\2\2\2q\u01a3\3\2\2\2s\u01a6\3\2\2\2u\u01a8\3\2\2\2w"+
		"\u01aa\3\2\2\2y\u01ac\3\2\2\2{\u01af\3\2\2\2}\u01b5\3\2\2\2\177\u01b9"+
		"\3\2\2\2\u0081\u01bc\3\2\2\2\u0083\u0084\7\60\2\2\u0084\4\3\2\2\2\u0085"+
		"\u0086\7h\2\2\u0086\u0087\7w\2\2\u0087\u0088\7p\2\2\u0088\u0089\7e\2\2"+
		"\u0089\u008a\7v\2\2\u008a\u008b\7k\2\2\u008b\u008c\7q\2\2\u008c\u008d"+
		"\7p\2\2\u008d\6\3\2\2\2\u008e\u008f\7v\2\2\u008f\u0090\7j\2\2\u0090\u0091"+
		"\7t\2\2\u0091\u0092\7q\2\2\u0092\u0093\7y\2\2\u0093\b\3\2\2\2\u0094\u0095"+
		"\7y\2\2\u0095\u0096\7j\2\2\u0096\u0097\7k\2\2\u0097\u0098\7n\2\2\u0098"+
		"\u0099\7g\2\2\u0099\n\3\2\2\2\u009a\u009b\7k\2\2\u009b\u009c\7h\2\2\u009c"+
		"\f\3\2\2\2\u009d\u009e\7e\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7p\2\2\u00a0"+
		"\u00a1\7v\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7w\2\2"+
		"\u00a4\u00a5\7g\2\2\u00a5\16\3\2\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7"+
		"g\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7w\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac"+
		"\7p\2\2\u00ac\20\3\2\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7t\2\2\u00af\u00b0"+
		"\7{\2\2\u00b0\22\3\2\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7j\2\2\u00b3\u00b4"+
		"\7k\2\2\u00b4\u00b5\7u\2\2\u00b5\24\3\2\2\2\u00b6\u00b7\7}\2\2\u00b7\26"+
		"\3\2\2\2\u00b8\u00b9\7d\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb\7g\2\2\u00bb"+
		"\u00bc\7c\2\2\u00bc\u00bd\7m\2\2\u00bd\30\3\2\2\2\u00be\u00bf\7p\2\2\u00bf"+
		"\u00c0\7g\2\2\u00c0\u00c1\7y\2\2\u00c1\32\3\2\2\2\u00c2\u00c3\7e\2\2\u00c3"+
		"\u00c4\7c\2\2\u00c4\u00c5\7v\2\2\u00c5\u00c6\7e\2\2\u00c6\u00c7\7j\2\2"+
		"\u00c7\34\3\2\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb\7"+
		"u\2\2\u00cb\u00cc\7g\2\2\u00cc\36\3\2\2\2\u00cd\u00ce\7\177\2\2\u00ce"+
		" \3\2\2\2\u00cf\u00d0\7h\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7p\2\2\u00d2"+
		"\u00d3\7c\2\2\u00d3\u00d4\7n\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6\7{\2\2"+
		"\u00d6\"\3\2\2\2\u00d7\u00db\t\2\2\2\u00d8\u00da\t\3\2\2\u00d9\u00d8\3"+
		"\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"$\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e2\5\'\24\2\u00df\u00e2\5+\26\2"+
		"\u00e0\u00e2\5)\25\2\u00e1\u00de\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e0"+
		"\3\2\2\2\u00e2&\3\2\2\2\u00e3\u00e4\t\4\2\2\u00e4(\3\2\2\2\u00e5\u00e6"+
		"\7\61\2\2\u00e6\u00e7\7\61\2\2\u00e7\u00eb\3\2\2\2\u00e8\u00ea\n\5\2\2"+
		"\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec"+
		"\3\2\2\2\u00ec\u00f0\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f1\5+\26\2\u00ef"+
		"\u00f1\7\2\2\3\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1*\3\2\2\2"+
		"\u00f2\u00f3\7\17\2\2\u00f3\u00f6\7\f\2\2\u00f4\u00f6\t\5\2\2\u00f5\u00f2"+
		"\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6,\3\2\2\2\u00f7\u00f8\t\6\2\2\u00f8"+
		".\3\2\2\2\u00f9\u00fb\t\7\2\2\u00fa\u00f9\3\2\2\2\u00fb\60\3\2\2\2\u00fc"+
		"\u00fe\5-\27\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u00fd\3\2"+
		"\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0105\7\60\2\2\u0102"+
		"\u0104\5-\27\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2"+
		"\2\2\u0105\u0106\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0108"+
		"\u010a\5\63\32\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u011d\3"+
		"\2\2\2\u010b\u010d\7\60\2\2\u010c\u010e\5-\27\2\u010d\u010c\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2"+
		"\2\2\u0111\u0113\5\63\32\2\u0112\u0111\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\u011d\3\2\2\2\u0114\u0116\5-\27\2\u0115\u0114\3\2\2\2\u0116\u0117\3\2"+
		"\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119"+
		"\u011b\5\63\32\2\u011a\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3"+
		"\2\2\2\u011c\u00fd\3\2\2\2\u011c\u010b\3\2\2\2\u011c\u0115\3\2\2\2\u011d"+
		"\62\3\2\2\2\u011e\u011f\5\65\33\2\u011f\u0120\5\67\34\2\u0120\64\3\2\2"+
		"\2\u0121\u0122\t\b\2\2\u0122\66\3\2\2\2\u0123\u0125\5-\27\2\u0124\u0123"+
		"\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"\u012f\3\2\2\2\u0128\u012a\t\t\2\2\u0129\u012b\5-\27\2\u012a\u0129\3\2"+
		"\2\2\u012b\u012c\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u012f\3\2\2\2\u012e\u0124\3\2\2\2\u012e\u0128\3\2\2\2\u012f8\3\2\2\2"+
		"\u0130\u0131\7\62\2\2\u0131\u0133\t\n\2\2\u0132\u0134\5/\30\2\u0133\u0132"+
		"\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		":\3\2\2\2\u0137\u013c\5? \2\u0138\u0139\5? \2\u0139\u013a\5;\36\2\u013a"+
		"\u013c\3\2\2\2\u013b\u0137\3\2\2\2\u013b\u0138\3\2\2\2\u013c<\3\2\2\2"+
		"\u013d\u0142\5A!\2\u013e\u013f\5A!\2\u013f\u0140\5=\37\2\u0140\u0142\3"+
		"\2\2\2\u0141\u013d\3\2\2\2\u0141\u013e\3\2\2\2\u0142>\3\2\2\2\u0143\u0147"+
		"\n\13\2\2\u0144\u0145\7^\2\2\u0145\u0147\5E#\2\u0146\u0143\3\2\2\2\u0146"+
		"\u0144\3\2\2\2\u0147@\3\2\2\2\u0148\u014c\n\f\2\2\u0149\u014a\7^\2\2\u014a"+
		"\u014c\5E#\2\u014b\u0148\3\2\2\2\u014b\u0149\3\2\2\2\u014cB\3\2\2\2\u014d"+
		"\u014e\7^\2\2\u014e\u014f\5+\26\2\u014fD\3\2\2\2\u0150\u0153\5G$\2\u0151"+
		"\u0153\7\62\2\2\u0152\u0150\3\2\2\2\u0152\u0151\3\2\2\2\u0153F\3\2\2\2"+
		"\u0154\u0157\5I%\2\u0155\u0157\5K&\2\u0156\u0154\3\2\2\2\u0156\u0155\3"+
		"\2\2\2\u0157H\3\2\2\2\u0158\u0159\t\r\2\2\u0159J\3\2\2\2\u015a\u015b\n"+
		"\16\2\2\u015bL\3\2\2\2\u015c\u0160\5I%\2\u015d\u0160\5-\27\2\u015e\u0160"+
		"\7z\2\2\u015f\u015c\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u015e\3\2\2\2\u0160"+
		"N\3\2\2\2\u0161\u0162\7z\2\2\u0162\u0163\5/\30\2\u0163\u0164\5/\30\2\u0164"+
		"P\3\2\2\2\u0165\u0166\7v\2\2\u0166\u0167\7t\2\2\u0167\u0168\7w\2\2\u0168"+
		"\u0169\7g\2\2\u0169R\3\2\2\2\u016a\u016b\7h\2\2\u016b\u016c\7c\2\2\u016c"+
		"\u016d\7n\2\2\u016d\u016e\7u\2\2\u016e\u016f\7g\2\2\u016fT\3\2\2\2\u0170"+
		"\u0173\5\61\31\2\u0171\u0173\59\35\2\u0172\u0170\3\2\2\2\u0172\u0171\3"+
		"\2\2\2\u0173V\3\2\2\2\u0174\u0177\5Q)\2\u0175\u0177\5S*\2\u0176\u0174"+
		"\3\2\2\2\u0176\u0175\3\2\2\2\u0177X\3\2\2\2\u0178\u017c\7$\2\2\u0179\u017b"+
		"\5;\36\2\u017a\u0179\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c"+
		"\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0189\7$"+
		"\2\2\u0180\u0184\7)\2\2\u0181\u0183\5=\37\2\u0182\u0181\3\2\2\2\u0183"+
		"\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0187\3\2"+
		"\2\2\u0186\u0184\3\2\2\2\u0187\u0189\7)\2\2\u0188\u0178\3\2\2\2\u0188"+
		"\u0180\3\2\2\2\u0189Z\3\2\2\2\u018a\u018b\7p\2\2\u018b\u018c\7w\2\2\u018c"+
		"\u018d\7n\2\2\u018d\u018e\7n\2\2\u018e\\\3\2\2\2\u018f\u0190\t\17\2\2"+
		"\u0190^\3\2\2\2\u0191\u0192\t\20\2\2\u0192`\3\2\2\2\u0193\u0194\t\21\2"+
		"\2\u0194b\3\2\2\2\u0195\u0196\t\22\2\2\u0196d\3\2\2\2\u0197\u0198\t\23"+
		"\2\2\u0198f\3\2\2\2\u0199\u019a\t\24\2\2\u019ah\3\2\2\2\u019b\u019c\t"+
		"\25\2\2\u019cj\3\2\2\2\u019d\u019e\t\26\2\2\u019el\3\2\2\2\u019f\u01a0"+
		"\t\27\2\2\u01a0n\3\2\2\2\u01a1\u01a2\t\30\2\2\u01a2p\3\2\2\2\u01a3\u01a4"+
		"\t\23\2\2\u01a4\u01a5\t\23\2\2\u01a5r\3\2\2\2\u01a6\u01a7\t\31\2\2\u01a7"+
		"t\3\2\2\2\u01a8\u01a9\t\32\2\2\u01a9v\3\2\2\2\u01aa\u01ab\t\33\2\2\u01ab"+
		"x\3\2\2\2\u01ac\u01ad\t\33\2\2\u01ad\u01ae\t\23\2\2\u01aez\3\2\2\2\u01af"+
		"\u01b0\7r\2\2\u01b0\u01b1\7t\2\2\u01b1\u01b2\7k\2\2\u01b2\u01b3\7p\2\2"+
		"\u01b3\u01b4\7v\2\2\u01b4|\3\2\2\2\u01b5\u01b6\7x\2\2\u01b6\u01b7\7c\2"+
		"\2\u01b7\u01b8\7t\2\2\u01b8~\3\2\2\2\u01b9\u01ba\5#\22\2\u01ba\u0080\3"+
		"\2\2\2\u01bb\u01bd\5%\23\2\u01bc\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be"+
		"\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\bA"+
		"\2\2\u01c1\u0082\3\2\2\2\"\2\u00db\u00e1\u00eb\u00f0\u00f5\u00fa\u00ff"+
		"\u0105\u0109\u010f\u0112\u0117\u011a\u011c\u0126\u012c\u012e\u0135\u013b"+
		"\u0141\u0146\u014b\u0152\u0156\u015f\u0172\u0176\u017c\u0184\u0188\u01be";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}