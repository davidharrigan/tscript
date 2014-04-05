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
		T__14=1, T__13=2, T__12=3, T__11=4, T__10=5, T__9=6, T__8=7, T__7=8, T__6=9, 
		T__5=10, T__4=11, T__3=12, T__2=13, T__1=14, T__0=15, NUMERIC_LITERAL=16, 
		BOOLEAN_LITERAL=17, STRING_LITERAL=18, NULL_LITERAL=19, LPAREN=20, RPAREN=21, 
		SEMICOLON=22, COLON=23, EQUAL=24, PLUS=25, MINUS=26, ASTERISK=27, DASH=28, 
		COMMA=29, DOUBLE_EQUAL=30, LESS=31, GREATER=32, NOT=33, NOT_EQUAL=34, 
		PRINT=35, VAR=36, IDENTIFIER=37, WhiteSpace=38;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'.'", "'function'", "'throw'", "'while'", "'if'", "'continue'", "'return'", 
		"'try'", "'{'", "'break'", "'new'", "'catch'", "'else'", "'}'", "'finally'", 
		"NUMERIC_LITERAL", "BOOLEAN_LITERAL", "STRING_LITERAL", "'null'", "LPAREN", 
		"RPAREN", "SEMICOLON", "COLON", "EQUAL", "PLUS", "MINUS", "ASTERISK", 
		"DASH", "COMMA", "DOUBLE_EQUAL", "LESS", "GREATER", "NOT", "NOT_EQUAL", 
		"'print'", "'var'", "IDENTIFIER", "WhiteSpace"
	};
	public static final String[] ruleNames = {
		"T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", 
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "IdentifierCharacters", 
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
		case 62: WhiteSpace_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WhiteSpace_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2(\u01bb\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\7\21\u00d3\n\21\f\21\16\21\u00d6\13\21\3\22\3\22\3\22"+
		"\5\22\u00db\n\22\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u00e3\n\24\f\24\16"+
		"\24\u00e6\13\24\3\24\3\24\5\24\u00ea\n\24\3\25\3\25\3\25\5\25\u00ef\n"+
		"\25\3\26\3\26\3\27\5\27\u00f4\n\27\3\30\6\30\u00f7\n\30\r\30\16\30\u00f8"+
		"\3\30\3\30\7\30\u00fd\n\30\f\30\16\30\u0100\13\30\3\30\5\30\u0103\n\30"+
		"\3\30\3\30\6\30\u0107\n\30\r\30\16\30\u0108\3\30\5\30\u010c\n\30\3\30"+
		"\6\30\u010f\n\30\r\30\16\30\u0110\3\30\5\30\u0114\n\30\5\30\u0116\n\30"+
		"\3\31\3\31\3\31\3\32\3\32\3\33\6\33\u011e\n\33\r\33\16\33\u011f\3\33\3"+
		"\33\6\33\u0124\n\33\r\33\16\33\u0125\5\33\u0128\n\33\3\34\3\34\3\34\6"+
		"\34\u012d\n\34\r\34\16\34\u012e\3\35\3\35\3\35\3\35\5\35\u0135\n\35\3"+
		"\36\3\36\3\36\3\36\5\36\u013b\n\36\3\37\3\37\3\37\5\37\u0140\n\37\3 \3"+
		" \3 \5 \u0145\n \3!\3!\3!\3\"\3\"\5\"\u014c\n\"\3#\3#\5#\u0150\n#\3$\3"+
		"$\3%\3%\3&\3&\3&\5&\u0159\n&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3"+
		")\3)\3)\3*\3*\5*\u016c\n*\3+\3+\5+\u0170\n+\3,\3,\7,\u0174\n,\f,\16,\u0177"+
		"\13,\3,\3,\3,\7,\u017c\n,\f,\16,\u017f\13,\3,\5,\u0182\n,\3-\3-\3-\3-"+
		"\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\66\3\66\3\67\3\67\38\38\38\39\39\3:\3:\3;\3;\3<\3<\3<\3=\3=\3"+
		"=\3=\3=\3=\3>\3>\3>\3>\3?\3?\3@\6@\u01b6\n@\r@\16@\u01b7\3@\3@\2A\3\3"+
		"\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1"+
		"\31\16\1\33\17\1\35\20\1\37\21\1!\2\1#\2\1%\2\1\'\2\1)\2\1+\2\1-\2\1/"+
		"\2\1\61\2\1\63\2\1\65\2\1\67\2\19\2\1;\2\1=\2\1?\2\1A\2\1C\2\1E\2\1G\2"+
		"\1I\2\1K\2\1M\2\1O\2\1Q\2\1S\22\1U\23\1W\24\1Y\25\1[\26\1]\27\1_\30\1"+
		"a\31\1c\32\1e\33\1g\34\1i\35\1k\36\1m\37\1o \1q!\1s\"\1u#\1w$\1y%\1{&"+
		"\1}\'\1\177(\2\3\2\34\6\2&&C\\aac|\7\2&&\62;C\\aac|\5\2\13\13\16\16\""+
		"\"\4\2\f\f\17\17\3\2\62;\5\2\62;CHch\4\2GGgg\4\2--//\4\2ZZzz\5\2\f\f$"+
		"$^^\5\2\f\f))^^\13\2$$))^^ddhhppttvvxx\f\2\f\f$$))^^ddhhppttvvxx\3\2*"+
		"*\3\2++\3\2==\3\2<<\3\2??\3\2--\3\2//\3\2,,\3\2\61\61\3\2..\3\2>>\3\2"+
		"@@\3\2##\u01c2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2"+
		"m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3"+
		"\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\3\u0081\3\2\2\2\5\u0083\3\2"+
		"\2\2\7\u008c\3\2\2\2\t\u0092\3\2\2\2\13\u0098\3\2\2\2\r\u009b\3\2\2\2"+
		"\17\u00a4\3\2\2\2\21\u00ab\3\2\2\2\23\u00af\3\2\2\2\25\u00b1\3\2\2\2\27"+
		"\u00b7\3\2\2\2\31\u00bb\3\2\2\2\33\u00c1\3\2\2\2\35\u00c6\3\2\2\2\37\u00c8"+
		"\3\2\2\2!\u00d0\3\2\2\2#\u00da\3\2\2\2%\u00dc\3\2\2\2\'\u00de\3\2\2\2"+
		")\u00ee\3\2\2\2+\u00f0\3\2\2\2-\u00f3\3\2\2\2/\u0115\3\2\2\2\61\u0117"+
		"\3\2\2\2\63\u011a\3\2\2\2\65\u0127\3\2\2\2\67\u0129\3\2\2\29\u0134\3\2"+
		"\2\2;\u013a\3\2\2\2=\u013f\3\2\2\2?\u0144\3\2\2\2A\u0146\3\2\2\2C\u014b"+
		"\3\2\2\2E\u014f\3\2\2\2G\u0151\3\2\2\2I\u0153\3\2\2\2K\u0158\3\2\2\2M"+
		"\u015a\3\2\2\2O\u015e\3\2\2\2Q\u0163\3\2\2\2S\u016b\3\2\2\2U\u016f\3\2"+
		"\2\2W\u0181\3\2\2\2Y\u0183\3\2\2\2[\u0188\3\2\2\2]\u018a\3\2\2\2_\u018c"+
		"\3\2\2\2a\u018e\3\2\2\2c\u0190\3\2\2\2e\u0192\3\2\2\2g\u0194\3\2\2\2i"+
		"\u0196\3\2\2\2k\u0198\3\2\2\2m\u019a\3\2\2\2o\u019c\3\2\2\2q\u019f\3\2"+
		"\2\2s\u01a1\3\2\2\2u\u01a3\3\2\2\2w\u01a5\3\2\2\2y\u01a8\3\2\2\2{\u01ae"+
		"\3\2\2\2}\u01b2\3\2\2\2\177\u01b5\3\2\2\2\u0081\u0082\7\60\2\2\u0082\4"+
		"\3\2\2\2\u0083\u0084\7h\2\2\u0084\u0085\7w\2\2\u0085\u0086\7p\2\2\u0086"+
		"\u0087\7e\2\2\u0087\u0088\7v\2\2\u0088\u0089\7k\2\2\u0089\u008a\7q\2\2"+
		"\u008a\u008b\7p\2\2\u008b\6\3\2\2\2\u008c\u008d\7v\2\2\u008d\u008e\7j"+
		"\2\2\u008e\u008f\7t\2\2\u008f\u0090\7q\2\2\u0090\u0091\7y\2\2\u0091\b"+
		"\3\2\2\2\u0092\u0093\7y\2\2\u0093\u0094\7j\2\2\u0094\u0095\7k\2\2\u0095"+
		"\u0096\7n\2\2\u0096\u0097\7g\2\2\u0097\n\3\2\2\2\u0098\u0099\7k\2\2\u0099"+
		"\u009a\7h\2\2\u009a\f\3\2\2\2\u009b\u009c\7e\2\2\u009c\u009d\7q\2\2\u009d"+
		"\u009e\7p\2\2\u009e\u009f\7v\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7p\2\2"+
		"\u00a1\u00a2\7w\2\2\u00a2\u00a3\7g\2\2\u00a3\16\3\2\2\2\u00a4\u00a5\7"+
		"t\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8\7w\2\2\u00a8\u00a9"+
		"\7t\2\2\u00a9\u00aa\7p\2\2\u00aa\20\3\2\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad"+
		"\7t\2\2\u00ad\u00ae\7{\2\2\u00ae\22\3\2\2\2\u00af\u00b0\7}\2\2\u00b0\24"+
		"\3\2\2\2\u00b1\u00b2\7d\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7g\2\2\u00b4"+
		"\u00b5\7c\2\2\u00b5\u00b6\7m\2\2\u00b6\26\3\2\2\2\u00b7\u00b8\7p\2\2\u00b8"+
		"\u00b9\7g\2\2\u00b9\u00ba\7y\2\2\u00ba\30\3\2\2\2\u00bb\u00bc\7e\2\2\u00bc"+
		"\u00bd\7c\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7e\2\2\u00bf\u00c0\7j\2\2"+
		"\u00c0\32\3\2\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4\7"+
		"u\2\2\u00c4\u00c5\7g\2\2\u00c5\34\3\2\2\2\u00c6\u00c7\7\177\2\2\u00c7"+
		"\36\3\2\2\2\u00c8\u00c9\7h\2\2\u00c9\u00ca\7k\2\2\u00ca\u00cb\7p\2\2\u00cb"+
		"\u00cc\7c\2\2\u00cc\u00cd\7n\2\2\u00cd\u00ce\7n\2\2\u00ce\u00cf\7{\2\2"+
		"\u00cf \3\2\2\2\u00d0\u00d4\t\2\2\2\u00d1\u00d3\t\3\2\2\u00d2\u00d1\3"+
		"\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\"\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00db\5%\23\2\u00d8\u00db\5)\25\2"+
		"\u00d9\u00db\5\'\24\2\u00da\u00d7\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00d9"+
		"\3\2\2\2\u00db$\3\2\2\2\u00dc\u00dd\t\4\2\2\u00dd&\3\2\2\2\u00de\u00df"+
		"\7\61\2\2\u00df\u00e0\7\61\2\2\u00e0\u00e4\3\2\2\2\u00e1\u00e3\n\5\2\2"+
		"\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5"+
		"\3\2\2\2\u00e5\u00e9\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00ea\5)\25\2\u00e8"+
		"\u00ea\7\2\2\3\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea(\3\2\2\2"+
		"\u00eb\u00ec\7\17\2\2\u00ec\u00ef\7\f\2\2\u00ed\u00ef\t\5\2\2\u00ee\u00eb"+
		"\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef*\3\2\2\2\u00f0\u00f1\t\6\2\2\u00f1"+
		",\3\2\2\2\u00f2\u00f4\t\7\2\2\u00f3\u00f2\3\2\2\2\u00f4.\3\2\2\2\u00f5"+
		"\u00f7\5+\26\2\u00f6\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f6\3\2"+
		"\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fe\7\60\2\2\u00fb"+
		"\u00fd\5+\26\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2"+
		"\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0101"+
		"\u0103\5\61\31\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0116\3"+
		"\2\2\2\u0104\u0106\7\60\2\2\u0105\u0107\5+\26\2\u0106\u0105\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2"+
		"\2\2\u010a\u010c\5\61\31\2\u010b\u010a\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u0116\3\2\2\2\u010d\u010f\5+\26\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0113\3\2\2\2\u0112"+
		"\u0114\5\61\31\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3"+
		"\2\2\2\u0115\u00f6\3\2\2\2\u0115\u0104\3\2\2\2\u0115\u010e\3\2\2\2\u0116"+
		"\60\3\2\2\2\u0117\u0118\5\63\32\2\u0118\u0119\5\65\33\2\u0119\62\3\2\2"+
		"\2\u011a\u011b\t\b\2\2\u011b\64\3\2\2\2\u011c\u011e\5+\26\2\u011d\u011c"+
		"\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u0128\3\2\2\2\u0121\u0123\t\t\2\2\u0122\u0124\5+\26\2\u0123\u0122\3\2"+
		"\2\2\u0124\u0125\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\u0128\3\2\2\2\u0127\u011d\3\2\2\2\u0127\u0121\3\2\2\2\u0128\66\3\2\2"+
		"\2\u0129\u012a\7\62\2\2\u012a\u012c\t\n\2\2\u012b\u012d\5-\27\2\u012c"+
		"\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2"+
		"\2\2\u012f8\3\2\2\2\u0130\u0135\5=\37\2\u0131\u0132\5=\37\2\u0132\u0133"+
		"\59\35\2\u0133\u0135\3\2\2\2\u0134\u0130\3\2\2\2\u0134\u0131\3\2\2\2\u0135"+
		":\3\2\2\2\u0136\u013b\5? \2\u0137\u0138\5? \2\u0138\u0139\5;\36\2\u0139"+
		"\u013b\3\2\2\2\u013a\u0136\3\2\2\2\u013a\u0137\3\2\2\2\u013b<\3\2\2\2"+
		"\u013c\u0140\n\13\2\2\u013d\u013e\7^\2\2\u013e\u0140\5C\"\2\u013f\u013c"+
		"\3\2\2\2\u013f\u013d\3\2\2\2\u0140>\3\2\2\2\u0141\u0145\n\f\2\2\u0142"+
		"\u0143\7^\2\2\u0143\u0145\5C\"\2\u0144\u0141\3\2\2\2\u0144\u0142\3\2\2"+
		"\2\u0145@\3\2\2\2\u0146\u0147\7^\2\2\u0147\u0148\5)\25\2\u0148B\3\2\2"+
		"\2\u0149\u014c\5E#\2\u014a\u014c\7\62\2\2\u014b\u0149\3\2\2\2\u014b\u014a"+
		"\3\2\2\2\u014cD\3\2\2\2\u014d\u0150\5G$\2\u014e\u0150\5I%\2\u014f\u014d"+
		"\3\2\2\2\u014f\u014e\3\2\2\2\u0150F\3\2\2\2\u0151\u0152\t\r\2\2\u0152"+
		"H\3\2\2\2\u0153\u0154\n\16\2\2\u0154J\3\2\2\2\u0155\u0159\5G$\2\u0156"+
		"\u0159\5+\26\2\u0157\u0159\7z\2\2\u0158\u0155\3\2\2\2\u0158\u0156\3\2"+
		"\2\2\u0158\u0157\3\2\2\2\u0159L\3\2\2\2\u015a\u015b\7z\2\2\u015b\u015c"+
		"\5-\27\2\u015c\u015d\5-\27\2\u015dN\3\2\2\2\u015e\u015f\7v\2\2\u015f\u0160"+
		"\7t\2\2\u0160\u0161\7w\2\2\u0161\u0162\7g\2\2\u0162P\3\2\2\2\u0163\u0164"+
		"\7h\2\2\u0164\u0165\7c\2\2\u0165\u0166\7n\2\2\u0166\u0167\7u\2\2\u0167"+
		"\u0168\7g\2\2\u0168R\3\2\2\2\u0169\u016c\5/\30\2\u016a\u016c\5\67\34\2"+
		"\u016b\u0169\3\2\2\2\u016b\u016a\3\2\2\2\u016cT\3\2\2\2\u016d\u0170\5"+
		"O(\2\u016e\u0170\5Q)\2\u016f\u016d\3\2\2\2\u016f\u016e\3\2\2\2\u0170V"+
		"\3\2\2\2\u0171\u0175\7$\2\2\u0172\u0174\59\35\2\u0173\u0172\3\2\2\2\u0174"+
		"\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0178\3\2"+
		"\2\2\u0177\u0175\3\2\2\2\u0178\u0182\7$\2\2\u0179\u017d\7)\2\2\u017a\u017c"+
		"\5;\36\2\u017b\u017a\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d"+
		"\u017e\3\2\2\2\u017e\u0180\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0182\7)"+
		"\2\2\u0181\u0171\3\2\2\2\u0181\u0179\3\2\2\2\u0182X\3\2\2\2\u0183\u0184"+
		"\7p\2\2\u0184\u0185\7w\2\2\u0185\u0186\7n\2\2\u0186\u0187\7n\2\2\u0187"+
		"Z\3\2\2\2\u0188\u0189\t\17\2\2\u0189\\\3\2\2\2\u018a\u018b\t\20\2\2\u018b"+
		"^\3\2\2\2\u018c\u018d\t\21\2\2\u018d`\3\2\2\2\u018e\u018f\t\22\2\2\u018f"+
		"b\3\2\2\2\u0190\u0191\t\23\2\2\u0191d\3\2\2\2\u0192\u0193\t\24\2\2\u0193"+
		"f\3\2\2\2\u0194\u0195\t\25\2\2\u0195h\3\2\2\2\u0196\u0197\t\26\2\2\u0197"+
		"j\3\2\2\2\u0198\u0199\t\27\2\2\u0199l\3\2\2\2\u019a\u019b\t\30\2\2\u019b"+
		"n\3\2\2\2\u019c\u019d\t\23\2\2\u019d\u019e\t\23\2\2\u019ep\3\2\2\2\u019f"+
		"\u01a0\t\31\2\2\u01a0r\3\2\2\2\u01a1\u01a2\t\32\2\2\u01a2t\3\2\2\2\u01a3"+
		"\u01a4\t\33\2\2\u01a4v\3\2\2\2\u01a5\u01a6\t\33\2\2\u01a6\u01a7\t\23\2"+
		"\2\u01a7x\3\2\2\2\u01a8\u01a9\7r\2\2\u01a9\u01aa\7t\2\2\u01aa\u01ab\7"+
		"k\2\2\u01ab\u01ac\7p\2\2\u01ac\u01ad\7v\2\2\u01adz\3\2\2\2\u01ae\u01af"+
		"\7x\2\2\u01af\u01b0\7c\2\2\u01b0\u01b1\7t\2\2\u01b1|\3\2\2\2\u01b2\u01b3"+
		"\5!\21\2\u01b3~\3\2\2\2\u01b4\u01b6\5#\22\2\u01b5\u01b4\3\2\2\2\u01b6"+
		"\u01b7\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\3\2"+
		"\2\2\u01b9\u01ba\b@\2\2\u01ba\u0080\3\2\2\2\"\2\u00d4\u00da\u00e4\u00e9"+
		"\u00ee\u00f3\u00f8\u00fe\u0102\u0108\u010b\u0110\u0113\u0115\u011f\u0125"+
		"\u0127\u012e\u0134\u013a\u013f\u0144\u014b\u014f\u0158\u016b\u016f\u0175"+
		"\u017d\u0181\u01b7";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}