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
		T__1=1, T__0=2, NUMERIC_LITERAL=3, BOOLEAN_LITERAL=4, STRING_LITERAL=5, 
		NULL_LITERAL=6, LPAREN=7, RPAREN=8, SEMICOLON=9, EQUAL=10, PLUS=11, MINUS=12, 
		ASTERISK=13, DASH=14, COMMA=15, DOUBLE_EQUAL=16, LESS=17, GREATER=18, 
		NOT=19, NOT_EQUAL=20, PRINT=21, VAR=22, IDENTIFIER=23, WhiteSpace=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'{'", "'}'", "NUMERIC_LITERAL", "BOOLEAN_LITERAL", "STRING_LITERAL", 
		"'null'", "LPAREN", "RPAREN", "SEMICOLON", "EQUAL", "PLUS", "MINUS", "ASTERISK", 
		"DASH", "COMMA", "DOUBLE_EQUAL", "LESS", "GREATER", "NOT", "NOT_EQUAL", 
		"'print'", "'var'", "IDENTIFIER", "WhiteSpace"
	};
	public static final String[] ruleNames = {
		"T__1", "T__0", "IdentifierCharacters", "SpaceTokens", "SpaceChars", "EndOfLineComment", 
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
		case 48: WhiteSpace_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WhiteSpace_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\32\u0152\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\7\4l\n\4\f\4\16\4o\13\4\3\5\3\5\3\5\5\5t\n\5\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\7\7|\n\7\f\7\16\7\177\13\7\3\7\3\7\5\7\u0083\n\7\3\b\3\b\3"+
		"\b\5\b\u0088\n\b\3\t\3\t\3\n\5\n\u008d\n\n\3\13\6\13\u0090\n\13\r\13\16"+
		"\13\u0091\3\13\3\13\7\13\u0096\n\13\f\13\16\13\u0099\13\13\3\13\5\13\u009c"+
		"\n\13\3\13\3\13\6\13\u00a0\n\13\r\13\16\13\u00a1\3\13\5\13\u00a5\n\13"+
		"\3\13\6\13\u00a8\n\13\r\13\16\13\u00a9\3\13\5\13\u00ad\n\13\5\13\u00af"+
		"\n\13\3\f\3\f\3\f\3\r\3\r\3\16\6\16\u00b7\n\16\r\16\16\16\u00b8\3\16\3"+
		"\16\6\16\u00bd\n\16\r\16\16\16\u00be\5\16\u00c1\n\16\3\17\3\17\3\17\6"+
		"\17\u00c6\n\17\r\17\16\17\u00c7\3\20\3\20\3\20\3\20\5\20\u00ce\n\20\3"+
		"\21\3\21\3\21\3\21\5\21\u00d4\n\21\3\22\3\22\3\22\5\22\u00d9\n\22\3\23"+
		"\3\23\3\23\5\23\u00de\n\23\3\24\3\24\3\24\3\25\3\25\5\25\u00e5\n\25\3"+
		"\26\3\26\5\26\u00e9\n\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\5\31\u00f2"+
		"\n\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\5\35\u0105\n\35\3\36\3\36\5\36\u0109\n\36\3\37\3"+
		"\37\7\37\u010d\n\37\f\37\16\37\u0110\13\37\3\37\3\37\3\37\7\37\u0115\n"+
		"\37\f\37\16\37\u0118\13\37\3\37\5\37\u011b\n\37\3 \3 \3 \3 \3 \3!\3!\3"+
		"\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+\3+\3,\3"+
		",\3-\3-\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\62"+
		"\6\62\u014d\n\62\r\62\16\62\u014e\3\62\3\62\2\63\3\3\1\5\4\1\7\2\1\t\2"+
		"\1\13\2\1\r\2\1\17\2\1\21\2\1\23\2\1\25\2\1\27\2\1\31\2\1\33\2\1\35\2"+
		"\1\37\2\1!\2\1#\2\1%\2\1\'\2\1)\2\1+\2\1-\2\1/\2\1\61\2\1\63\2\1\65\2"+
		"\1\67\2\19\5\1;\6\1=\7\1?\b\1A\t\1C\n\1E\13\1G\f\1I\r\1K\16\1M\17\1O\20"+
		"\1Q\21\1S\22\1U\23\1W\24\1Y\25\1[\26\1]\27\1_\30\1a\31\1c\32\2\3\2\33"+
		"\6\2&&C\\aac|\7\2&&\62;C\\aac|\5\2\13\13\16\16\"\"\4\2\f\f\17\17\3\2\62"+
		";\5\2\62;CHch\4\2GGgg\4\2--//\4\2ZZzz\5\2\f\f$$^^\5\2\f\f))^^\13\2$$)"+
		")^^ddhhppttvvxx\f\2\f\f$$))^^ddhhppttvvxx\3\2**\3\2++\3\2==\3\2??\3\2"+
		"--\3\2//\3\2,,\3\2\61\61\3\2..\3\2>>\3\2@@\3\2##\u0159\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3e\3\2\2\2\5g\3\2\2\2\7i\3\2"+
		"\2\2\ts\3\2\2\2\13u\3\2\2\2\rw\3\2\2\2\17\u0087\3\2\2\2\21\u0089\3\2\2"+
		"\2\23\u008c\3\2\2\2\25\u00ae\3\2\2\2\27\u00b0\3\2\2\2\31\u00b3\3\2\2\2"+
		"\33\u00c0\3\2\2\2\35\u00c2\3\2\2\2\37\u00cd\3\2\2\2!\u00d3\3\2\2\2#\u00d8"+
		"\3\2\2\2%\u00dd\3\2\2\2\'\u00df\3\2\2\2)\u00e4\3\2\2\2+\u00e8\3\2\2\2"+
		"-\u00ea\3\2\2\2/\u00ec\3\2\2\2\61\u00f1\3\2\2\2\63\u00f3\3\2\2\2\65\u00f7"+
		"\3\2\2\2\67\u00fc\3\2\2\29\u0104\3\2\2\2;\u0108\3\2\2\2=\u011a\3\2\2\2"+
		"?\u011c\3\2\2\2A\u0121\3\2\2\2C\u0123\3\2\2\2E\u0125\3\2\2\2G\u0127\3"+
		"\2\2\2I\u0129\3\2\2\2K\u012b\3\2\2\2M\u012d\3\2\2\2O\u012f\3\2\2\2Q\u0131"+
		"\3\2\2\2S\u0133\3\2\2\2U\u0136\3\2\2\2W\u0138\3\2\2\2Y\u013a\3\2\2\2["+
		"\u013c\3\2\2\2]\u013f\3\2\2\2_\u0145\3\2\2\2a\u0149\3\2\2\2c\u014c\3\2"+
		"\2\2ef\7}\2\2f\4\3\2\2\2gh\7\177\2\2h\6\3\2\2\2im\t\2\2\2jl\t\3\2\2kj"+
		"\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\b\3\2\2\2om\3\2\2\2pt\5\13\6\2"+
		"qt\5\17\b\2rt\5\r\7\2sp\3\2\2\2sq\3\2\2\2sr\3\2\2\2t\n\3\2\2\2uv\t\4\2"+
		"\2v\f\3\2\2\2wx\7\61\2\2xy\7\61\2\2y}\3\2\2\2z|\n\5\2\2{z\3\2\2\2|\177"+
		"\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0082\3\2\2\2\177}\3\2\2\2\u0080\u0083\5"+
		"\17\b\2\u0081\u0083\7\2\2\3\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083"+
		"\16\3\2\2\2\u0084\u0085\7\17\2\2\u0085\u0088\7\f\2\2\u0086\u0088\t\5\2"+
		"\2\u0087\u0084\3\2\2\2\u0087\u0086\3\2\2\2\u0088\20\3\2\2\2\u0089\u008a"+
		"\t\6\2\2\u008a\22\3\2\2\2\u008b\u008d\t\7\2\2\u008c\u008b\3\2\2\2\u008d"+
		"\24\3\2\2\2\u008e\u0090\5\21\t\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2"+
		"\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0097"+
		"\7\60\2\2\u0094\u0096\5\21\t\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2"+
		"\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097"+
		"\3\2\2\2\u009a\u009c\5\27\f\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2"+
		"\u009c\u00af\3\2\2\2\u009d\u009f\7\60\2\2\u009e\u00a0\5\21\t\2\u009f\u009e"+
		"\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a4\3\2\2\2\u00a3\u00a5\5\27\f\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3"+
		"\2\2\2\u00a5\u00af\3\2\2\2\u00a6\u00a8\5\21\t\2\u00a7\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2"+
		"\2\2\u00ab\u00ad\5\27\f\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00af\3\2\2\2\u00ae\u008f\3\2\2\2\u00ae\u009d\3\2\2\2\u00ae\u00a7\3\2"+
		"\2\2\u00af\26\3\2\2\2\u00b0\u00b1\5\31\r\2\u00b1\u00b2\5\33\16\2\u00b2"+
		"\30\3\2\2\2\u00b3\u00b4\t\b\2\2\u00b4\32\3\2\2\2\u00b5\u00b7\5\21\t\2"+
		"\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9"+
		"\3\2\2\2\u00b9\u00c1\3\2\2\2\u00ba\u00bc\t\t\2\2\u00bb\u00bd\5\21\t\2"+
		"\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf"+
		"\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00b6\3\2\2\2\u00c0\u00ba\3\2\2\2\u00c1"+
		"\34\3\2\2\2\u00c2\u00c3\7\62\2\2\u00c3\u00c5\t\n\2\2\u00c4\u00c6\5\23"+
		"\n\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\36\3\2\2\2\u00c9\u00ce\5#\22\2\u00ca\u00cb\5#\22"+
		"\2\u00cb\u00cc\5\37\20\2\u00cc\u00ce\3\2\2\2\u00cd\u00c9\3\2\2\2\u00cd"+
		"\u00ca\3\2\2\2\u00ce \3\2\2\2\u00cf\u00d4\5%\23\2\u00d0\u00d1\5%\23\2"+
		"\u00d1\u00d2\5!\21\2\u00d2\u00d4\3\2\2\2\u00d3\u00cf\3\2\2\2\u00d3\u00d0"+
		"\3\2\2\2\u00d4\"\3\2\2\2\u00d5\u00d9\n\13\2\2\u00d6\u00d7\7^\2\2\u00d7"+
		"\u00d9\5)\25\2\u00d8\u00d5\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9$\3\2\2\2"+
		"\u00da\u00de\n\f\2\2\u00db\u00dc\7^\2\2\u00dc\u00de\5)\25\2\u00dd\u00da"+
		"\3\2\2\2\u00dd\u00db\3\2\2\2\u00de&\3\2\2\2\u00df\u00e0\7^\2\2\u00e0\u00e1"+
		"\5\17\b\2\u00e1(\3\2\2\2\u00e2\u00e5\5+\26\2\u00e3\u00e5\7\62\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5*\3\2\2\2\u00e6\u00e9\5-\27\2"+
		"\u00e7\u00e9\5/\30\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9,\3"+
		"\2\2\2\u00ea\u00eb\t\r\2\2\u00eb.\3\2\2\2\u00ec\u00ed\n\16\2\2\u00ed\60"+
		"\3\2\2\2\u00ee\u00f2\5-\27\2\u00ef\u00f2\5\21\t\2\u00f0\u00f2\7z\2\2\u00f1"+
		"\u00ee\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\62\3\2\2"+
		"\2\u00f3\u00f4\7z\2\2\u00f4\u00f5\5\23\n\2\u00f5\u00f6\5\23\n\2\u00f6"+
		"\64\3\2\2\2\u00f7\u00f8\7v\2\2\u00f8\u00f9\7t\2\2\u00f9\u00fa\7w\2\2\u00fa"+
		"\u00fb\7g\2\2\u00fb\66\3\2\2\2\u00fc\u00fd\7h\2\2\u00fd\u00fe\7c\2\2\u00fe"+
		"\u00ff\7n\2\2\u00ff\u0100\7u\2\2\u0100\u0101\7g\2\2\u01018\3\2\2\2\u0102"+
		"\u0105\5\25\13\2\u0103\u0105\5\35\17\2\u0104\u0102\3\2\2\2\u0104\u0103"+
		"\3\2\2\2\u0105:\3\2\2\2\u0106\u0109\5\65\33\2\u0107\u0109\5\67\34\2\u0108"+
		"\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109<\3\2\2\2\u010a\u010e\7$\2\2\u010b"+
		"\u010d\5\37\20\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3"+
		"\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111"+
		"\u011b\7$\2\2\u0112\u0116\7)\2\2\u0113\u0115\5!\21\2\u0114\u0113\3\2\2"+
		"\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119"+
		"\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011b\7)\2\2\u011a\u010a\3\2\2\2\u011a"+
		"\u0112\3\2\2\2\u011b>\3\2\2\2\u011c\u011d\7p\2\2\u011d\u011e\7w\2\2\u011e"+
		"\u011f\7n\2\2\u011f\u0120\7n\2\2\u0120@\3\2\2\2\u0121\u0122\t\17\2\2\u0122"+
		"B\3\2\2\2\u0123\u0124\t\20\2\2\u0124D\3\2\2\2\u0125\u0126\t\21\2\2\u0126"+
		"F\3\2\2\2\u0127\u0128\t\22\2\2\u0128H\3\2\2\2\u0129\u012a\t\23\2\2\u012a"+
		"J\3\2\2\2\u012b\u012c\t\24\2\2\u012cL\3\2\2\2\u012d\u012e\t\25\2\2\u012e"+
		"N\3\2\2\2\u012f\u0130\t\26\2\2\u0130P\3\2\2\2\u0131\u0132\t\27\2\2\u0132"+
		"R\3\2\2\2\u0133\u0134\t\22\2\2\u0134\u0135\t\22\2\2\u0135T\3\2\2\2\u0136"+
		"\u0137\t\30\2\2\u0137V\3\2\2\2\u0138\u0139\t\31\2\2\u0139X\3\2\2\2\u013a"+
		"\u013b\t\32\2\2\u013bZ\3\2\2\2\u013c\u013d\t\32\2\2\u013d\u013e\t\22\2"+
		"\2\u013e\\\3\2\2\2\u013f\u0140\7r\2\2\u0140\u0141\7t\2\2\u0141\u0142\7"+
		"k\2\2\u0142\u0143\7p\2\2\u0143\u0144\7v\2\2\u0144^\3\2\2\2\u0145\u0146"+
		"\7x\2\2\u0146\u0147\7c\2\2\u0147\u0148\7t\2\2\u0148`\3\2\2\2\u0149\u014a"+
		"\5\7\4\2\u014ab\3\2\2\2\u014b\u014d\5\t\5\2\u014c\u014b\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\3\2"+
		"\2\2\u0150\u0151\b\62\2\2\u0151d\3\2\2\2\"\2ms}\u0082\u0087\u008c\u0091"+
		"\u0097\u009b\u00a1\u00a4\u00a9\u00ac\u00ae\u00b8\u00be\u00c0\u00c7\u00cd"+
		"\u00d3\u00d8\u00dd\u00e4\u00e8\u00f1\u0104\u0108\u010e\u0116\u011a\u014e";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}