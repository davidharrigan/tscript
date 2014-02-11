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
		NUMERIC_LITERAL=1, BOOLEAN_LITERAL=2, LPAREN=3, RPAREN=4, SEMICOLON=5, 
		EQUAL=6, PLUS=7, MINUS=8, ASTERISK=9, DASH=10, DOUBLE_EQUAL=11, LESS=12, 
		GREATER=13, NOT=14, NOT_EQUAL=15, PRINT=16, VAR=17, IDENTIFIER=18, WhiteSpace=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"NUMERIC_LITERAL", "BOOLEAN_LITERAL", "LPAREN", "RPAREN", "SEMICOLON", 
		"EQUAL", "PLUS", "MINUS", "ASTERISK", "DASH", "DOUBLE_EQUAL", "LESS", 
		"GREATER", "NOT", "NOT_EQUAL", "'print'", "'var'", "IDENTIFIER", "WhiteSpace"
	};
	public static final String[] ruleNames = {
		"DIGIT", "IdentifierCharacters", "SpaceTokens", "SpaceChars", "EndOfLineComment", 
		"LineTerminator", "TRUE", "FALSE", "NUMERIC_LITERAL", "BOOLEAN_LITERAL", 
		"LPAREN", "RPAREN", "SEMICOLON", "EQUAL", "PLUS", "MINUS", "ASTERISK", 
		"DASH", "DOUBLE_EQUAL", "LESS", "GREATER", "NOT", "NOT_EQUAL", "PRINT", 
		"VAR", "IDENTIFIER", "WhiteSpace"
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
		case 26: WhiteSpace_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WhiteSpace_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\25\u009e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\7\3>\n\3\f\3\16\3"+
		"A\13\3\3\4\3\4\3\4\5\4F\n\4\3\5\3\5\3\6\3\6\3\6\3\6\7\6N\n\6\f\6\16\6"+
		"Q\13\6\3\6\3\6\5\6U\n\6\3\7\3\7\3\7\5\7Z\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\6\nh\n\n\r\n\16\ni\3\13\3\13\5\13n\n\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\34\6\34\u0099\n\34"+
		"\r\34\16\34\u009a\3\34\3\34\2\35\3\2\1\5\2\1\7\2\1\t\2\1\13\2\1\r\2\1"+
		"\17\2\1\21\2\1\23\3\1\25\4\1\27\5\1\31\6\1\33\7\1\35\b\1\37\t\1!\n\1#"+
		"\13\1%\f\1\'\r\1)\16\1+\17\1-\20\1/\21\1\61\22\1\63\23\1\65\24\1\67\25"+
		"\2\3\2\22\3\2\62;\6\2&&C\\aac|\7\2&&\62;C\\aac|\5\2\13\13\16\16\"\"\4"+
		"\2\f\f\17\17\3\2**\3\2++\3\2==\3\2??\3\2--\3\2//\3\2,,\3\2\61\61\3\2>"+
		">\3\2@@\3\2##\u009e\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5;\3\2\2\2\7E\3"+
		"\2\2\2\tG\3\2\2\2\13I\3\2\2\2\rY\3\2\2\2\17[\3\2\2\2\21`\3\2\2\2\23g\3"+
		"\2\2\2\25m\3\2\2\2\27o\3\2\2\2\31q\3\2\2\2\33s\3\2\2\2\35u\3\2\2\2\37"+
		"w\3\2\2\2!y\3\2\2\2#{\3\2\2\2%}\3\2\2\2\'\177\3\2\2\2)\u0082\3\2\2\2+"+
		"\u0084\3\2\2\2-\u0086\3\2\2\2/\u0088\3\2\2\2\61\u008b\3\2\2\2\63\u0091"+
		"\3\2\2\2\65\u0095\3\2\2\2\67\u0098\3\2\2\29:\t\2\2\2:\4\3\2\2\2;?\t\3"+
		"\2\2<>\t\4\2\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\6\3\2\2\2A?\3"+
		"\2\2\2BF\5\t\5\2CF\5\r\7\2DF\5\13\6\2EB\3\2\2\2EC\3\2\2\2ED\3\2\2\2F\b"+
		"\3\2\2\2GH\t\5\2\2H\n\3\2\2\2IJ\7\61\2\2JK\7\61\2\2KO\3\2\2\2LN\n\6\2"+
		"\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PT\3\2\2\2QO\3\2\2\2RU\5\r\7"+
		"\2SU\7\2\2\3TR\3\2\2\2TS\3\2\2\2U\f\3\2\2\2VW\7\17\2\2WZ\7\f\2\2XZ\t\6"+
		"\2\2YV\3\2\2\2YX\3\2\2\2Z\16\3\2\2\2[\\\7v\2\2\\]\7t\2\2]^\7w\2\2^_\7"+
		"g\2\2_\20\3\2\2\2`a\7h\2\2ab\7c\2\2bc\7n\2\2cd\7u\2\2de\7g\2\2e\22\3\2"+
		"\2\2fh\5\3\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\24\3\2\2\2kn\5"+
		"\17\b\2ln\5\21\t\2mk\3\2\2\2ml\3\2\2\2n\26\3\2\2\2op\t\7\2\2p\30\3\2\2"+
		"\2qr\t\b\2\2r\32\3\2\2\2st\t\t\2\2t\34\3\2\2\2uv\t\n\2\2v\36\3\2\2\2w"+
		"x\t\13\2\2x \3\2\2\2yz\t\f\2\2z\"\3\2\2\2{|\t\r\2\2|$\3\2\2\2}~\t\16\2"+
		"\2~&\3\2\2\2\177\u0080\t\n\2\2\u0080\u0081\t\n\2\2\u0081(\3\2\2\2\u0082"+
		"\u0083\t\17\2\2\u0083*\3\2\2\2\u0084\u0085\t\20\2\2\u0085,\3\2\2\2\u0086"+
		"\u0087\t\21\2\2\u0087.\3\2\2\2\u0088\u0089\t\21\2\2\u0089\u008a\t\n\2"+
		"\2\u008a\60\3\2\2\2\u008b\u008c\7r\2\2\u008c\u008d\7t\2\2\u008d\u008e"+
		"\7k\2\2\u008e\u008f\7p\2\2\u008f\u0090\7v\2\2\u0090\62\3\2\2\2\u0091\u0092"+
		"\7x\2\2\u0092\u0093\7c\2\2\u0093\u0094\7t\2\2\u0094\64\3\2\2\2\u0095\u0096"+
		"\5\5\3\2\u0096\66\3\2\2\2\u0097\u0099\5\7\4\2\u0098\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\u009d\b\34\2\2\u009d8\3\2\2\2\13\2?EOTYim\u009a";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}