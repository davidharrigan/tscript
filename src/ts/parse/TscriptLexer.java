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
		T__17=1, T__16=2, T__15=3, T__14=4, T__13=5, T__12=6, T__11=7, T__10=8, 
		T__9=9, T__8=10, T__7=11, T__6=12, T__5=13, T__4=14, T__3=15, T__2=16, 
		T__1=17, T__0=18, NUMERIC_LITERAL=19, BOOLEAN_LITERAL=20, STRING_LITERAL=21, 
		NULL_LITERAL=22, LPAREN=23, RPAREN=24, LBRACK=25, RBRACK=26, SEMICOLON=27, 
		COLON=28, EQUAL=29, PLUS=30, MINUS=31, ASTERISK=32, DASH=33, COMMA=34, 
		DOUBLE_EQUAL=35, LESS=36, GREATER=37, NOT=38, NOT_EQUAL=39, PRINT=40, 
		VAR=41, IDENTIFIER=42, WhiteSpace=43;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'.'", "'function'", "'throw'", "'while'", "'if'", "'continue'", "'return'", 
		"'try'", "'&&'", "'this'", "'||'", "'{'", "'break'", "'new'", "'catch'", 
		"'else'", "'}'", "'finally'", "NUMERIC_LITERAL", "BOOLEAN_LITERAL", "STRING_LITERAL", 
		"'null'", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "SEMICOLON", "COLON", 
		"EQUAL", "PLUS", "MINUS", "ASTERISK", "DASH", "COMMA", "DOUBLE_EQUAL", 
		"LESS", "GREATER", "NOT", "NOT_EQUAL", "'print'", "'var'", "IDENTIFIER", 
		"WhiteSpace"
	};
	public static final String[] ruleNames = {
		"T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", 
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "IdentifierCharacters", "SpaceTokens", "SpaceChars", "EndOfLineComment", 
		"LineTerminator", "DecimalDigit", "HexDigit", "DecimalLiteral", "ExponentPart", 
		"ExponentIndicator", "SignedInteger", "HexIntegerLiteral", "DoubleStringCharacters", 
		"SingleStringCharacters", "DoubleStringCharacter", "SingleStringCharacter", 
		"LineContinuation", "EscapeSequence", "CharacterEscapeSequence", "SingleEscapeCharacter", 
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
		case 67: WhiteSpace_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WhiteSpace_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2-\u01d4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\7\24\u00e8\n\24\f\24\16\24\u00eb\13"+
		"\24\3\25\3\25\3\25\5\25\u00f0\n\25\3\26\3\26\3\27\3\27\3\27\3\27\7\27"+
		"\u00f8\n\27\f\27\16\27\u00fb\13\27\3\27\3\27\5\27\u00ff\n\27\3\30\3\30"+
		"\3\30\5\30\u0104\n\30\3\31\3\31\3\32\5\32\u0109\n\32\3\33\6\33\u010c\n"+
		"\33\r\33\16\33\u010d\3\33\3\33\7\33\u0112\n\33\f\33\16\33\u0115\13\33"+
		"\3\33\5\33\u0118\n\33\3\33\3\33\6\33\u011c\n\33\r\33\16\33\u011d\3\33"+
		"\5\33\u0121\n\33\3\33\6\33\u0124\n\33\r\33\16\33\u0125\3\33\5\33\u0129"+
		"\n\33\5\33\u012b\n\33\3\34\3\34\3\34\3\35\3\35\3\36\6\36\u0133\n\36\r"+
		"\36\16\36\u0134\3\36\3\36\6\36\u0139\n\36\r\36\16\36\u013a\5\36\u013d"+
		"\n\36\3\37\3\37\3\37\6\37\u0142\n\37\r\37\16\37\u0143\3 \3 \3 \3 \5 \u014a"+
		"\n \3!\3!\3!\3!\5!\u0150\n!\3\"\3\"\3\"\5\"\u0155\n\"\3#\3#\3#\5#\u015a"+
		"\n#\3$\3$\3$\3%\3%\5%\u0161\n%\3&\3&\5&\u0165\n&\3\'\3\'\3(\3(\3)\3)\3"+
		")\5)\u016e\n)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\5-\u0181"+
		"\n-\3.\3.\5.\u0185\n.\3/\3/\7/\u0189\n/\f/\16/\u018c\13/\3/\3/\3/\7/\u0191"+
		"\n/\f/\16/\u0194\13/\3/\5/\u0197\n/\3\60\3\60\3\60\3\60\3\60\3\61\3\61"+
		"\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39"+
		"\39\3:\3:\3;\3;\3<\3<\3=\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3A\3B\3B\3B\3B"+
		"\3B\3B\3C\3C\3C\3C\3D\3D\3E\6E\u01cf\nE\rE\16E\u01d0\3E\3E\2F\3\3\1\5"+
		"\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16"+
		"\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\2\1)\2\1+\2\1-\2\1/\2\1"+
		"\61\2\1\63\2\1\65\2\1\67\2\19\2\1;\2\1=\2\1?\2\1A\2\1C\2\1E\2\1G\2\1I"+
		"\2\1K\2\1M\2\1O\2\1Q\2\1S\2\1U\2\1W\2\1Y\25\1[\26\1]\27\1_\30\1a\31\1"+
		"c\32\1e\33\1g\34\1i\35\1k\36\1m\37\1o \1q!\1s\"\1u#\1w$\1y%\1{&\1}\'\1"+
		"\177(\1\u0081)\1\u0083*\1\u0085+\1\u0087,\1\u0089-\2\3\2\36\6\2&&C\\a"+
		"ac|\7\2&&\62;C\\aac|\5\2\13\13\16\16\"\"\4\2\f\f\17\17\3\2\62;\5\2\62"+
		";CHch\4\2GGgg\4\2--//\4\2ZZzz\5\2\f\f$$^^\5\2\f\f))^^\13\2$$))^^ddhhp"+
		"pttvvxx\f\2\f\f$$))^^ddhhppttvvxx\3\2**\3\2++\3\2]^\3\2^_\3\2==\3\2<<"+
		"\3\2??\3\2--\3\2//\3\2,,\3\2\61\61\3\2..\3\2>>\3\2@@\3\2##\u01db\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3"+
		"\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2"+
		"\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2"+
		"}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2"+
		"\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\3\u008b\3\2\2\2\5\u008d\3\2\2\2\7\u0096"+
		"\3\2\2\2\t\u009c\3\2\2\2\13\u00a2\3\2\2\2\r\u00a5\3\2\2\2\17\u00ae\3\2"+
		"\2\2\21\u00b5\3\2\2\2\23\u00b9\3\2\2\2\25\u00bc\3\2\2\2\27\u00c1\3\2\2"+
		"\2\31\u00c4\3\2\2\2\33\u00c6\3\2\2\2\35\u00cc\3\2\2\2\37\u00d0\3\2\2\2"+
		"!\u00d6\3\2\2\2#\u00db\3\2\2\2%\u00dd\3\2\2\2\'\u00e5\3\2\2\2)\u00ef\3"+
		"\2\2\2+\u00f1\3\2\2\2-\u00f3\3\2\2\2/\u0103\3\2\2\2\61\u0105\3\2\2\2\63"+
		"\u0108\3\2\2\2\65\u012a\3\2\2\2\67\u012c\3\2\2\29\u012f\3\2\2\2;\u013c"+
		"\3\2\2\2=\u013e\3\2\2\2?\u0149\3\2\2\2A\u014f\3\2\2\2C\u0154\3\2\2\2E"+
		"\u0159\3\2\2\2G\u015b\3\2\2\2I\u0160\3\2\2\2K\u0164\3\2\2\2M\u0166\3\2"+
		"\2\2O\u0168\3\2\2\2Q\u016d\3\2\2\2S\u016f\3\2\2\2U\u0173\3\2\2\2W\u0178"+
		"\3\2\2\2Y\u0180\3\2\2\2[\u0184\3\2\2\2]\u0196\3\2\2\2_\u0198\3\2\2\2a"+
		"\u019d\3\2\2\2c\u019f\3\2\2\2e\u01a1\3\2\2\2g\u01a3\3\2\2\2i\u01a5\3\2"+
		"\2\2k\u01a7\3\2\2\2m\u01a9\3\2\2\2o\u01ab\3\2\2\2q\u01ad\3\2\2\2s\u01af"+
		"\3\2\2\2u\u01b1\3\2\2\2w\u01b3\3\2\2\2y\u01b5\3\2\2\2{\u01b8\3\2\2\2}"+
		"\u01ba\3\2\2\2\177\u01bc\3\2\2\2\u0081\u01be\3\2\2\2\u0083\u01c1\3\2\2"+
		"\2\u0085\u01c7\3\2\2\2\u0087\u01cb\3\2\2\2\u0089\u01ce\3\2\2\2\u008b\u008c"+
		"\7\60\2\2\u008c\4\3\2\2\2\u008d\u008e\7h\2\2\u008e\u008f\7w\2\2\u008f"+
		"\u0090\7p\2\2\u0090\u0091\7e\2\2\u0091\u0092\7v\2\2\u0092\u0093\7k\2\2"+
		"\u0093\u0094\7q\2\2\u0094\u0095\7p\2\2\u0095\6\3\2\2\2\u0096\u0097\7v"+
		"\2\2\u0097\u0098\7j\2\2\u0098\u0099\7t\2\2\u0099\u009a\7q\2\2\u009a\u009b"+
		"\7y\2\2\u009b\b\3\2\2\2\u009c\u009d\7y\2\2\u009d\u009e\7j\2\2\u009e\u009f"+
		"\7k\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1\7g\2\2\u00a1\n\3\2\2\2\u00a2\u00a3"+
		"\7k\2\2\u00a3\u00a4\7h\2\2\u00a4\f\3\2\2\2\u00a5\u00a6\7e\2\2\u00a6\u00a7"+
		"\7q\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7k\2\2\u00aa"+
		"\u00ab\7p\2\2\u00ab\u00ac\7w\2\2\u00ac\u00ad\7g\2\2\u00ad\16\3\2\2\2\u00ae"+
		"\u00af\7t\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7w\2\2"+
		"\u00b2\u00b3\7t\2\2\u00b3\u00b4\7p\2\2\u00b4\20\3\2\2\2\u00b5\u00b6\7"+
		"v\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7{\2\2\u00b8\22\3\2\2\2\u00b9\u00ba"+
		"\7(\2\2\u00ba\u00bb\7(\2\2\u00bb\24\3\2\2\2\u00bc\u00bd\7v\2\2\u00bd\u00be"+
		"\7j\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7u\2\2\u00c0\26\3\2\2\2\u00c1\u00c2"+
		"\7~\2\2\u00c2\u00c3\7~\2\2\u00c3\30\3\2\2\2\u00c4\u00c5\7}\2\2\u00c5\32"+
		"\3\2\2\2\u00c6\u00c7\7d\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7g\2\2\u00c9"+
		"\u00ca\7c\2\2\u00ca\u00cb\7m\2\2\u00cb\34\3\2\2\2\u00cc\u00cd\7p\2\2\u00cd"+
		"\u00ce\7g\2\2\u00ce\u00cf\7y\2\2\u00cf\36\3\2\2\2\u00d0\u00d1\7e\2\2\u00d1"+
		"\u00d2\7c\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7e\2\2\u00d4\u00d5\7j\2\2"+
		"\u00d5 \3\2\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7n\2\2\u00d8\u00d9\7u\2"+
		"\2\u00d9\u00da\7g\2\2\u00da\"\3\2\2\2\u00db\u00dc\7\177\2\2\u00dc$\3\2"+
		"\2\2\u00dd\u00de\7h\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7p\2\2\u00e0\u00e1"+
		"\7c\2\2\u00e1\u00e2\7n\2\2\u00e2\u00e3\7n\2\2\u00e3\u00e4\7{\2\2\u00e4"+
		"&\3\2\2\2\u00e5\u00e9\t\2\2\2\u00e6\u00e8\t\3\2\2\u00e7\u00e6\3\2\2\2"+
		"\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea(\3"+
		"\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00f0\5+\26\2\u00ed\u00f0\5/\30\2\u00ee"+
		"\u00f0\5-\27\2\u00ef\u00ec\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2"+
		"\2\2\u00f0*\3\2\2\2\u00f1\u00f2\t\4\2\2\u00f2,\3\2\2\2\u00f3\u00f4\7\61"+
		"\2\2\u00f4\u00f5\7\61\2\2\u00f5\u00f9\3\2\2\2\u00f6\u00f8\n\5\2\2\u00f7"+
		"\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2"+
		"\2\2\u00fa\u00fe\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00ff\5/\30\2\u00fd"+
		"\u00ff\7\2\2\3\u00fe\u00fc\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff.\3\2\2\2"+
		"\u0100\u0101\7\17\2\2\u0101\u0104\7\f\2\2\u0102\u0104\t\5\2\2\u0103\u0100"+
		"\3\2\2\2\u0103\u0102\3\2\2\2\u0104\60\3\2\2\2\u0105\u0106\t\6\2\2\u0106"+
		"\62\3\2\2\2\u0107\u0109\t\7\2\2\u0108\u0107\3\2\2\2\u0109\64\3\2\2\2\u010a"+
		"\u010c\5\61\31\2\u010b\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010b\3"+
		"\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0113\7\60\2\2\u0110"+
		"\u0112\5\61\31\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3"+
		"\2\2\2\u0113\u0114\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0116"+
		"\u0118\5\67\34\2\u0117\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u012b\3"+
		"\2\2\2\u0119\u011b\7\60\2\2\u011a\u011c\5\61\31\2\u011b\u011a\3\2\2\2"+
		"\u011c\u011d\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120"+
		"\3\2\2\2\u011f\u0121\5\67\34\2\u0120\u011f\3\2\2\2\u0120\u0121\3\2\2\2"+
		"\u0121\u012b\3\2\2\2\u0122\u0124\5\61\31\2\u0123\u0122\3\2\2\2\u0124\u0125"+
		"\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127"+
		"\u0129\5\67\34\2\u0128\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\3"+
		"\2\2\2\u012a\u010b\3\2\2\2\u012a\u0119\3\2\2\2\u012a\u0123\3\2\2\2\u012b"+
		"\66\3\2\2\2\u012c\u012d\59\35\2\u012d\u012e\5;\36\2\u012e8\3\2\2\2\u012f"+
		"\u0130\t\b\2\2\u0130:\3\2\2\2\u0131\u0133\5\61\31\2\u0132\u0131\3\2\2"+
		"\2\u0133\u0134\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u013d"+
		"\3\2\2\2\u0136\u0138\t\t\2\2\u0137\u0139\5\61\31\2\u0138\u0137\3\2\2\2"+
		"\u0139\u013a\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d"+
		"\3\2\2\2\u013c\u0132\3\2\2\2\u013c\u0136\3\2\2\2\u013d<\3\2\2\2\u013e"+
		"\u013f\7\62\2\2\u013f\u0141\t\n\2\2\u0140\u0142\5\63\32\2\u0141\u0140"+
		"\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		">\3\2\2\2\u0145\u014a\5C\"\2\u0146\u0147\5C\"\2\u0147\u0148\5? \2\u0148"+
		"\u014a\3\2\2\2\u0149\u0145\3\2\2\2\u0149\u0146\3\2\2\2\u014a@\3\2\2\2"+
		"\u014b\u0150\5E#\2\u014c\u014d\5E#\2\u014d\u014e\5A!\2\u014e\u0150\3\2"+
		"\2\2\u014f\u014b\3\2\2\2\u014f\u014c\3\2\2\2\u0150B\3\2\2\2\u0151\u0155"+
		"\n\13\2\2\u0152\u0153\7^\2\2\u0153\u0155\5I%\2\u0154\u0151\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0155D\3\2\2\2\u0156\u015a\n\f\2\2\u0157\u0158\7^\2\2\u0158"+
		"\u015a\5I%\2\u0159\u0156\3\2\2\2\u0159\u0157\3\2\2\2\u015aF\3\2\2\2\u015b"+
		"\u015c\7^\2\2\u015c\u015d\5/\30\2\u015dH\3\2\2\2\u015e\u0161\5K&\2\u015f"+
		"\u0161\7\62\2\2\u0160\u015e\3\2\2\2\u0160\u015f\3\2\2\2\u0161J\3\2\2\2"+
		"\u0162\u0165\5M\'\2\u0163\u0165\5O(\2\u0164\u0162\3\2\2\2\u0164\u0163"+
		"\3\2\2\2\u0165L\3\2\2\2\u0166\u0167\t\r\2\2\u0167N\3\2\2\2\u0168\u0169"+
		"\n\16\2\2\u0169P\3\2\2\2\u016a\u016e\5M\'\2\u016b\u016e\5\61\31\2\u016c"+
		"\u016e\7z\2\2\u016d\u016a\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016c\3\2"+
		"\2\2\u016eR\3\2\2\2\u016f\u0170\7z\2\2\u0170\u0171\5\63\32\2\u0171\u0172"+
		"\5\63\32\2\u0172T\3\2\2\2\u0173\u0174\7v\2\2\u0174\u0175\7t\2\2\u0175"+
		"\u0176\7w\2\2\u0176\u0177\7g\2\2\u0177V\3\2\2\2\u0178\u0179\7h\2\2\u0179"+
		"\u017a\7c\2\2\u017a\u017b\7n\2\2\u017b\u017c\7u\2\2\u017c\u017d\7g\2\2"+
		"\u017dX\3\2\2\2\u017e\u0181\5\65\33\2\u017f\u0181\5=\37\2\u0180\u017e"+
		"\3\2\2\2\u0180\u017f\3\2\2\2\u0181Z\3\2\2\2\u0182\u0185\5U+\2\u0183\u0185"+
		"\5W,\2\u0184\u0182\3\2\2\2\u0184\u0183\3\2\2\2\u0185\\\3\2\2\2\u0186\u018a"+
		"\7$\2\2\u0187\u0189\5? \2\u0188\u0187\3\2\2\2\u0189\u018c\3\2\2\2\u018a"+
		"\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018d\3\2\2\2\u018c\u018a\3\2"+
		"\2\2\u018d\u0197\7$\2\2\u018e\u0192\7)\2\2\u018f\u0191\5A!\2\u0190\u018f"+
		"\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193"+
		"\u0195\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u0197\7)\2\2\u0196\u0186\3\2"+
		"\2\2\u0196\u018e\3\2\2\2\u0197^\3\2\2\2\u0198\u0199\7p\2\2\u0199\u019a"+
		"\7w\2\2\u019a\u019b\7n\2\2\u019b\u019c\7n\2\2\u019c`\3\2\2\2\u019d\u019e"+
		"\t\17\2\2\u019eb\3\2\2\2\u019f\u01a0\t\20\2\2\u01a0d\3\2\2\2\u01a1\u01a2"+
		"\t\21\2\2\u01a2f\3\2\2\2\u01a3\u01a4\t\22\2\2\u01a4h\3\2\2\2\u01a5\u01a6"+
		"\t\23\2\2\u01a6j\3\2\2\2\u01a7\u01a8\t\24\2\2\u01a8l\3\2\2\2\u01a9\u01aa"+
		"\t\25\2\2\u01aan\3\2\2\2\u01ab\u01ac\t\26\2\2\u01acp\3\2\2\2\u01ad\u01ae"+
		"\t\27\2\2\u01aer\3\2\2\2\u01af\u01b0\t\30\2\2\u01b0t\3\2\2\2\u01b1\u01b2"+
		"\t\31\2\2\u01b2v\3\2\2\2\u01b3\u01b4\t\32\2\2\u01b4x\3\2\2\2\u01b5\u01b6"+
		"\t\25\2\2\u01b6\u01b7\t\25\2\2\u01b7z\3\2\2\2\u01b8\u01b9\t\33\2\2\u01b9"+
		"|\3\2\2\2\u01ba\u01bb\t\34\2\2\u01bb~\3\2\2\2\u01bc\u01bd\t\35\2\2\u01bd"+
		"\u0080\3\2\2\2\u01be\u01bf\t\35\2\2\u01bf\u01c0\t\25\2\2\u01c0\u0082\3"+
		"\2\2\2\u01c1\u01c2\7r\2\2\u01c2\u01c3\7t\2\2\u01c3\u01c4\7k\2\2\u01c4"+
		"\u01c5\7p\2\2\u01c5\u01c6\7v\2\2\u01c6\u0084\3\2\2\2\u01c7\u01c8\7x\2"+
		"\2\u01c8\u01c9\7c\2\2\u01c9\u01ca\7t\2\2\u01ca\u0086\3\2\2\2\u01cb\u01cc"+
		"\5\'\24\2\u01cc\u0088\3\2\2\2\u01cd\u01cf\5)\25\2\u01ce\u01cd\3\2\2\2"+
		"\u01cf\u01d0\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2"+
		"\3\2\2\2\u01d2\u01d3\bE\2\2\u01d3\u008a\3\2\2\2\"\2\u00e9\u00ef\u00f9"+
		"\u00fe\u0103\u0108\u010d\u0113\u0117\u011d\u0120\u0125\u0128\u012a\u0134"+
		"\u013a\u013c\u0143\u0149\u014f\u0154\u0159\u0160\u0164\u016d\u0180\u0184"+
		"\u018a\u0192\u0196\u01d0";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}