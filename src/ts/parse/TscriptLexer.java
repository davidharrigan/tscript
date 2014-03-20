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
		T__12=1, T__11=2, T__10=3, T__9=4, T__8=5, T__7=6, T__6=7, T__5=8, T__4=9, 
		T__3=10, T__2=11, T__1=12, T__0=13, NUMERIC_LITERAL=14, BOOLEAN_LITERAL=15, 
		STRING_LITERAL=16, NULL_LITERAL=17, LPAREN=18, RPAREN=19, SEMICOLON=20, 
		COLON=21, EQUAL=22, PLUS=23, MINUS=24, ASTERISK=25, DASH=26, COMMA=27, 
		DOUBLE_EQUAL=28, LESS=29, GREATER=30, NOT=31, NOT_EQUAL=32, PRINT=33, 
		VAR=34, IDENTIFIER=35, WhiteSpace=36;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'function'", "'throw'", "'while'", "'if'", "'continue'", "'return'", 
		"'try'", "'{'", "'break'", "'catch'", "'else'", "'}'", "'finally'", "NUMERIC_LITERAL", 
		"BOOLEAN_LITERAL", "STRING_LITERAL", "'null'", "LPAREN", "RPAREN", "SEMICOLON", 
		"COLON", "EQUAL", "PLUS", "MINUS", "ASTERISK", "DASH", "COMMA", "DOUBLE_EQUAL", 
		"LESS", "GREATER", "NOT", "NOT_EQUAL", "'print'", "'var'", "IDENTIFIER", 
		"WhiteSpace"
	};
	public static final String[] ruleNames = {
		"T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", 
		"T__3", "T__2", "T__1", "T__0", "IdentifierCharacters", "SpaceTokens", 
		"SpaceChars", "EndOfLineComment", "LineTerminator", "DecimalDigit", "HexDigit", 
		"DecimalLiteral", "ExponentPart", "ExponentIndicator", "SignedInteger", 
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
		case 60: WhiteSpace_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WhiteSpace_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2&\u01b1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\7\17\u00c9\n\17\f\17\16\17"+
		"\u00cc\13\17\3\20\3\20\3\20\5\20\u00d1\n\20\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\7\22\u00d9\n\22\f\22\16\22\u00dc\13\22\3\22\3\22\5\22\u00e0\n\22\3"+
		"\23\3\23\3\23\5\23\u00e5\n\23\3\24\3\24\3\25\5\25\u00ea\n\25\3\26\6\26"+
		"\u00ed\n\26\r\26\16\26\u00ee\3\26\3\26\7\26\u00f3\n\26\f\26\16\26\u00f6"+
		"\13\26\3\26\5\26\u00f9\n\26\3\26\3\26\6\26\u00fd\n\26\r\26\16\26\u00fe"+
		"\3\26\5\26\u0102\n\26\3\26\6\26\u0105\n\26\r\26\16\26\u0106\3\26\5\26"+
		"\u010a\n\26\5\26\u010c\n\26\3\27\3\27\3\27\3\30\3\30\3\31\6\31\u0114\n"+
		"\31\r\31\16\31\u0115\3\31\3\31\6\31\u011a\n\31\r\31\16\31\u011b\5\31\u011e"+
		"\n\31\3\32\3\32\3\32\6\32\u0123\n\32\r\32\16\32\u0124\3\33\3\33\3\33\3"+
		"\33\5\33\u012b\n\33\3\34\3\34\3\34\3\34\5\34\u0131\n\34\3\35\3\35\3\35"+
		"\5\35\u0136\n\35\3\36\3\36\3\36\5\36\u013b\n\36\3\37\3\37\3\37\3 \3 \5"+
		" \u0142\n \3!\3!\5!\u0146\n!\3\"\3\"\3#\3#\3$\3$\3$\5$\u014f\n$\3%\3%"+
		"\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\5(\u0162\n(\3)\3)"+
		"\5)\u0166\n)\3*\3*\7*\u016a\n*\f*\16*\u016d\13*\3*\3*\3*\7*\u0172\n*\f"+
		"*\16*\u0175\13*\3*\5*\u0178\n*\3+\3+\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/"+
		"\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66"+
		"\3\66\3\67\3\67\38\38\39\39\3:\3:\3:\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3="+
		"\3=\3>\6>\u01ac\n>\r>\16>\u01ad\3>\3>\2?\3\3\1\5\4\1\7\5\1\t\6\1\13\7"+
		"\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\2\1\37"+
		"\2\1!\2\1#\2\1%\2\1\'\2\1)\2\1+\2\1-\2\1/\2\1\61\2\1\63\2\1\65\2\1\67"+
		"\2\19\2\1;\2\1=\2\1?\2\1A\2\1C\2\1E\2\1G\2\1I\2\1K\2\1M\2\1O\20\1Q\21"+
		"\1S\22\1U\23\1W\24\1Y\25\1[\26\1]\27\1_\30\1a\31\1c\32\1e\33\1g\34\1i"+
		"\35\1k\36\1m\37\1o \1q!\1s\"\1u#\1w$\1y%\1{&\2\3\2\34\6\2&&C\\aac|\7\2"+
		"&&\62;C\\aac|\5\2\13\13\16\16\"\"\4\2\f\f\17\17\3\2\62;\5\2\62;CHch\4"+
		"\2GGgg\4\2--//\4\2ZZzz\5\2\f\f$$^^\5\2\f\f))^^\13\2$$))^^ddhhppttvvxx"+
		"\f\2\f\f$$))^^ddhhppttvvxx\3\2**\3\2++\3\2==\3\2<<\3\2??\3\2--\3\2//\3"+
		"\2,,\3\2\61\61\3\2..\3\2>>\3\2@@\3\2##\u01b8\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2"+
		"\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\3}\3\2\2\2\5\u0086\3\2\2"+
		"\2\7\u008c\3\2\2\2\t\u0092\3\2\2\2\13\u0095\3\2\2\2\r\u009e\3\2\2\2\17"+
		"\u00a5\3\2\2\2\21\u00a9\3\2\2\2\23\u00ab\3\2\2\2\25\u00b1\3\2\2\2\27\u00b7"+
		"\3\2\2\2\31\u00bc\3\2\2\2\33\u00be\3\2\2\2\35\u00c6\3\2\2\2\37\u00d0\3"+
		"\2\2\2!\u00d2\3\2\2\2#\u00d4\3\2\2\2%\u00e4\3\2\2\2\'\u00e6\3\2\2\2)\u00e9"+
		"\3\2\2\2+\u010b\3\2\2\2-\u010d\3\2\2\2/\u0110\3\2\2\2\61\u011d\3\2\2\2"+
		"\63\u011f\3\2\2\2\65\u012a\3\2\2\2\67\u0130\3\2\2\29\u0135\3\2\2\2;\u013a"+
		"\3\2\2\2=\u013c\3\2\2\2?\u0141\3\2\2\2A\u0145\3\2\2\2C\u0147\3\2\2\2E"+
		"\u0149\3\2\2\2G\u014e\3\2\2\2I\u0150\3\2\2\2K\u0154\3\2\2\2M\u0159\3\2"+
		"\2\2O\u0161\3\2\2\2Q\u0165\3\2\2\2S\u0177\3\2\2\2U\u0179\3\2\2\2W\u017e"+
		"\3\2\2\2Y\u0180\3\2\2\2[\u0182\3\2\2\2]\u0184\3\2\2\2_\u0186\3\2\2\2a"+
		"\u0188\3\2\2\2c\u018a\3\2\2\2e\u018c\3\2\2\2g\u018e\3\2\2\2i\u0190\3\2"+
		"\2\2k\u0192\3\2\2\2m\u0195\3\2\2\2o\u0197\3\2\2\2q\u0199\3\2\2\2s\u019b"+
		"\3\2\2\2u\u019e\3\2\2\2w\u01a4\3\2\2\2y\u01a8\3\2\2\2{\u01ab\3\2\2\2}"+
		"~\7h\2\2~\177\7w\2\2\177\u0080\7p\2\2\u0080\u0081\7e\2\2\u0081\u0082\7"+
		"v\2\2\u0082\u0083\7k\2\2\u0083\u0084\7q\2\2\u0084\u0085\7p\2\2\u0085\4"+
		"\3\2\2\2\u0086\u0087\7v\2\2\u0087\u0088\7j\2\2\u0088\u0089\7t\2\2\u0089"+
		"\u008a\7q\2\2\u008a\u008b\7y\2\2\u008b\6\3\2\2\2\u008c\u008d\7y\2\2\u008d"+
		"\u008e\7j\2\2\u008e\u008f\7k\2\2\u008f\u0090\7n\2\2\u0090\u0091\7g\2\2"+
		"\u0091\b\3\2\2\2\u0092\u0093\7k\2\2\u0093\u0094\7h\2\2\u0094\n\3\2\2\2"+
		"\u0095\u0096\7e\2\2\u0096\u0097\7q\2\2\u0097\u0098\7p\2\2\u0098\u0099"+
		"\7v\2\2\u0099\u009a\7k\2\2\u009a\u009b\7p\2\2\u009b\u009c\7w\2\2\u009c"+
		"\u009d\7g\2\2\u009d\f\3\2\2\2\u009e\u009f\7t\2\2\u009f\u00a0\7g\2\2\u00a0"+
		"\u00a1\7v\2\2\u00a1\u00a2\7w\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7p\2\2"+
		"\u00a4\16\3\2\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7"+
		"{\2\2\u00a8\20\3\2\2\2\u00a9\u00aa\7}\2\2\u00aa\22\3\2\2\2\u00ab\u00ac"+
		"\7d\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7c\2\2\u00af"+
		"\u00b0\7m\2\2\u00b0\24\3\2\2\2\u00b1\u00b2\7e\2\2\u00b2\u00b3\7c\2\2\u00b3"+
		"\u00b4\7v\2\2\u00b4\u00b5\7e\2\2\u00b5\u00b6\7j\2\2\u00b6\26\3\2\2\2\u00b7"+
		"\u00b8\7g\2\2\u00b8\u00b9\7n\2\2\u00b9\u00ba\7u\2\2\u00ba\u00bb\7g\2\2"+
		"\u00bb\30\3\2\2\2\u00bc\u00bd\7\177\2\2\u00bd\32\3\2\2\2\u00be\u00bf\7"+
		"h\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7p\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3"+
		"\7n\2\2\u00c3\u00c4\7n\2\2\u00c4\u00c5\7{\2\2\u00c5\34\3\2\2\2\u00c6\u00ca"+
		"\t\2\2\2\u00c7\u00c9\t\3\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\36\3\2\2\2\u00cc\u00ca\3\2\2"+
		"\2\u00cd\u00d1\5!\21\2\u00ce\u00d1\5%\23\2\u00cf\u00d1\5#\22\2\u00d0\u00cd"+
		"\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1 \3\2\2\2\u00d2"+
		"\u00d3\t\4\2\2\u00d3\"\3\2\2\2\u00d4\u00d5\7\61\2\2\u00d5\u00d6\7\61\2"+
		"\2\u00d6\u00da\3\2\2\2\u00d7\u00d9\n\5\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc"+
		"\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00df\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dd\u00e0\5%\23\2\u00de\u00e0\7\2\2\3\u00df\u00dd\3\2"+
		"\2\2\u00df\u00de\3\2\2\2\u00e0$\3\2\2\2\u00e1\u00e2\7\17\2\2\u00e2\u00e5"+
		"\7\f\2\2\u00e3\u00e5\t\5\2\2\u00e4\u00e1\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5"+
		"&\3\2\2\2\u00e6\u00e7\t\6\2\2\u00e7(\3\2\2\2\u00e8\u00ea\t\7\2\2\u00e9"+
		"\u00e8\3\2\2\2\u00ea*\3\2\2\2\u00eb\u00ed\5\'\24\2\u00ec\u00eb\3\2\2\2"+
		"\u00ed\u00ee\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0"+
		"\3\2\2\2\u00f0\u00f4\7\60\2\2\u00f1\u00f3\5\'\24\2\u00f2\u00f1\3\2\2\2"+
		"\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f8"+
		"\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f9\5-\27\2\u00f8\u00f7\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u010c\3\2\2\2\u00fa\u00fc\7\60\2\2\u00fb\u00fd\5"+
		"\'\24\2\u00fc\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u0102\5-\27\2\u0101\u0100\3\2"+
		"\2\2\u0101\u0102\3\2\2\2\u0102\u010c\3\2\2\2\u0103\u0105\5\'\24\2\u0104"+
		"\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2"+
		"\2\2\u0107\u0109\3\2\2\2\u0108\u010a\5-\27\2\u0109\u0108\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u00ec\3\2\2\2\u010b\u00fa\3\2"+
		"\2\2\u010b\u0104\3\2\2\2\u010c,\3\2\2\2\u010d\u010e\5/\30\2\u010e\u010f"+
		"\5\61\31\2\u010f.\3\2\2\2\u0110\u0111\t\b\2\2\u0111\60\3\2\2\2\u0112\u0114"+
		"\5\'\24\2\u0113\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0113\3\2\2\2"+
		"\u0115\u0116\3\2\2\2\u0116\u011e\3\2\2\2\u0117\u0119\t\t\2\2\u0118\u011a"+
		"\5\'\24\2\u0119\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0119\3\2\2\2"+
		"\u011b\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u0113\3\2\2\2\u011d\u0117"+
		"\3\2\2\2\u011e\62\3\2\2\2\u011f\u0120\7\62\2\2\u0120\u0122\t\n\2\2\u0121"+
		"\u0123\5)\25\2\u0122\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0122\3\2"+
		"\2\2\u0124\u0125\3\2\2\2\u0125\64\3\2\2\2\u0126\u012b\59\35\2\u0127\u0128"+
		"\59\35\2\u0128\u0129\5\65\33\2\u0129\u012b\3\2\2\2\u012a\u0126\3\2\2\2"+
		"\u012a\u0127\3\2\2\2\u012b\66\3\2\2\2\u012c\u0131\5;\36\2\u012d\u012e"+
		"\5;\36\2\u012e\u012f\5\67\34\2\u012f\u0131\3\2\2\2\u0130\u012c\3\2\2\2"+
		"\u0130\u012d\3\2\2\2\u01318\3\2\2\2\u0132\u0136\n\13\2\2\u0133\u0134\7"+
		"^\2\2\u0134\u0136\5? \2\u0135\u0132\3\2\2\2\u0135\u0133\3\2\2\2\u0136"+
		":\3\2\2\2\u0137\u013b\n\f\2\2\u0138\u0139\7^\2\2\u0139\u013b\5? \2\u013a"+
		"\u0137\3\2\2\2\u013a\u0138\3\2\2\2\u013b<\3\2\2\2\u013c\u013d\7^\2\2\u013d"+
		"\u013e\5%\23\2\u013e>\3\2\2\2\u013f\u0142\5A!\2\u0140\u0142\7\62\2\2\u0141"+
		"\u013f\3\2\2\2\u0141\u0140\3\2\2\2\u0142@\3\2\2\2\u0143\u0146\5C\"\2\u0144"+
		"\u0146\5E#\2\u0145\u0143\3\2\2\2\u0145\u0144\3\2\2\2\u0146B\3\2\2\2\u0147"+
		"\u0148\t\r\2\2\u0148D\3\2\2\2\u0149\u014a\n\16\2\2\u014aF\3\2\2\2\u014b"+
		"\u014f\5C\"\2\u014c\u014f\5\'\24\2\u014d\u014f\7z\2\2\u014e\u014b\3\2"+
		"\2\2\u014e\u014c\3\2\2\2\u014e\u014d\3\2\2\2\u014fH\3\2\2\2\u0150\u0151"+
		"\7z\2\2\u0151\u0152\5)\25\2\u0152\u0153\5)\25\2\u0153J\3\2\2\2\u0154\u0155"+
		"\7v\2\2\u0155\u0156\7t\2\2\u0156\u0157\7w\2\2\u0157\u0158\7g\2\2\u0158"+
		"L\3\2\2\2\u0159\u015a\7h\2\2\u015a\u015b\7c\2\2\u015b\u015c\7n\2\2\u015c"+
		"\u015d\7u\2\2\u015d\u015e\7g\2\2\u015eN\3\2\2\2\u015f\u0162\5+\26\2\u0160"+
		"\u0162\5\63\32\2\u0161\u015f\3\2\2\2\u0161\u0160\3\2\2\2\u0162P\3\2\2"+
		"\2\u0163\u0166\5K&\2\u0164\u0166\5M\'\2\u0165\u0163\3\2\2\2\u0165\u0164"+
		"\3\2\2\2\u0166R\3\2\2\2\u0167\u016b\7$\2\2\u0168\u016a\5\65\33\2\u0169"+
		"\u0168\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2"+
		"\2\2\u016c\u016e\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u0178\7$\2\2\u016f"+
		"\u0173\7)\2\2\u0170\u0172\5\67\34\2\u0171\u0170\3\2\2\2\u0172\u0175\3"+
		"\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0176\3\2\2\2\u0175"+
		"\u0173\3\2\2\2\u0176\u0178\7)\2\2\u0177\u0167\3\2\2\2\u0177\u016f\3\2"+
		"\2\2\u0178T\3\2\2\2\u0179\u017a\7p\2\2\u017a\u017b\7w\2\2\u017b\u017c"+
		"\7n\2\2\u017c\u017d\7n\2\2\u017dV\3\2\2\2\u017e\u017f\t\17\2\2\u017fX"+
		"\3\2\2\2\u0180\u0181\t\20\2\2\u0181Z\3\2\2\2\u0182\u0183\t\21\2\2\u0183"+
		"\\\3\2\2\2\u0184\u0185\t\22\2\2\u0185^\3\2\2\2\u0186\u0187\t\23\2\2\u0187"+
		"`\3\2\2\2\u0188\u0189\t\24\2\2\u0189b\3\2\2\2\u018a\u018b\t\25\2\2\u018b"+
		"d\3\2\2\2\u018c\u018d\t\26\2\2\u018df\3\2\2\2\u018e\u018f\t\27\2\2\u018f"+
		"h\3\2\2\2\u0190\u0191\t\30\2\2\u0191j\3\2\2\2\u0192\u0193\t\23\2\2\u0193"+
		"\u0194\t\23\2\2\u0194l\3\2\2\2\u0195\u0196\t\31\2\2\u0196n\3\2\2\2\u0197"+
		"\u0198\t\32\2\2\u0198p\3\2\2\2\u0199\u019a\t\33\2\2\u019ar\3\2\2\2\u019b"+
		"\u019c\t\33\2\2\u019c\u019d\t\23\2\2\u019dt\3\2\2\2\u019e\u019f\7r\2\2"+
		"\u019f\u01a0\7t\2\2\u01a0\u01a1\7k\2\2\u01a1\u01a2\7p\2\2\u01a2\u01a3"+
		"\7v\2\2\u01a3v\3\2\2\2\u01a4\u01a5\7x\2\2\u01a5\u01a6\7c\2\2\u01a6\u01a7"+
		"\7t\2\2\u01a7x\3\2\2\2\u01a8\u01a9\5\35\17\2\u01a9z\3\2\2\2\u01aa\u01ac"+
		"\5\37\20\2\u01ab\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ab\3\2\2\2"+
		"\u01ad\u01ae\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\b>\2\2\u01b0|\3\2"+
		"\2\2\"\2\u00ca\u00d0\u00da\u00df\u00e4\u00e9\u00ee\u00f4\u00f8\u00fe\u0101"+
		"\u0106\u0109\u010b\u0115\u011b\u011d\u0124\u012a\u0130\u0135\u013a\u0141"+
		"\u0145\u014e\u0161\u0165\u016b\u0173\u0177\u01ad";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}