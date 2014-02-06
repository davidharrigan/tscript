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
		NUMERIC_LITERAL=1, LPAREN=2, RPAREN=3, SEMICOLON=4, EQUAL=5, PLUS=6, ASTERISK=7, 
		DOUBLE_EQUAL=8, LESS=9, GREATER=10, NOT=11, NOT_EQUAL=12, PRINT=13, VAR=14, 
		BOOLEAN_LITERAL=15, IDENTIFIER=16, WhiteSpace=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"NUMERIC_LITERAL", "LPAREN", "RPAREN", "SEMICOLON", "EQUAL", "PLUS", "ASTERISK", 
		"DOUBLE_EQUAL", "LESS", "GREATER", "NOT", "NOT_EQUAL", "'print'", "'var'", 
		"BOOLEAN_LITERAL", "IDENTIFIER", "WhiteSpace"
	};
	public static final String[] ruleNames = {
		"DIGIT", "IdentifierCharacters", "SpaceTokens", "SpaceChars", "EndOfLineComment", 
		"LineTerminator", "TRUE", "FALSE", "NUMERIC_LITERAL", "LPAREN", "RPAREN", 
		"SEMICOLON", "EQUAL", "PLUS", "ASTERISK", "DOUBLE_EQUAL", "LESS", "GREATER", 
		"NOT", "NOT_EQUAL", "PRINT", "VAR", "BOOLEAN_LITERAL", "IDENTIFIER", "WhiteSpace"
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
		case 24: WhiteSpace_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WhiteSpace_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\23\u0095\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\7\3:\n\3\f\3\16\3=\13\3\3\4\3\4\3\4\5"+
		"\4B\n\4\3\5\3\5\3\6\3\6\3\6\3\6\7\6J\n\6\f\6\16\6M\13\6\3\6\3\6\5\6Q\n"+
		"\6\3\7\3\7\3\7\5\7V\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\6\nd\n\n\r\n\16\ne\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\5\30\u008b\n\30"+
		"\3\31\3\31\3\32\6\32\u0090\n\32\r\32\16\32\u0091\3\32\3\32\2\33\3\2\1"+
		"\5\2\1\7\2\1\t\2\1\13\2\1\r\2\1\17\2\1\21\2\1\23\3\1\25\4\1\27\5\1\31"+
		"\6\1\33\7\1\35\b\1\37\t\1!\n\1#\13\1%\f\1\'\r\1)\16\1+\17\1-\20\1/\21"+
		"\1\61\22\1\63\23\2\3\2\21\3\2\62;\6\2&&C\\aac|\7\2&&\62;C\\aac|\5\2\13"+
		"\13\16\16\"\"\4\2\f\f\17\17\3\2**\3\2++\3\2==\3\2??\3\2--\3\2,,\3\2>>"+
		"\3\2@@\3\2##\4\2##??\u0095\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5\67\3\2\2\2\7A\3\2\2\2\tC\3\2\2"+
		"\2\13E\3\2\2\2\rU\3\2\2\2\17W\3\2\2\2\21\\\3\2\2\2\23c\3\2\2\2\25g\3\2"+
		"\2\2\27i\3\2\2\2\31k\3\2\2\2\33m\3\2\2\2\35o\3\2\2\2\37q\3\2\2\2!s\3\2"+
		"\2\2#v\3\2\2\2%x\3\2\2\2\'z\3\2\2\2)|\3\2\2\2+~\3\2\2\2-\u0084\3\2\2\2"+
		"/\u008a\3\2\2\2\61\u008c\3\2\2\2\63\u008f\3\2\2\2\65\66\t\2\2\2\66\4\3"+
		"\2\2\2\67;\t\3\2\28:\t\4\2\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<"+
		"\6\3\2\2\2=;\3\2\2\2>B\5\t\5\2?B\5\r\7\2@B\5\13\6\2A>\3\2\2\2A?\3\2\2"+
		"\2A@\3\2\2\2B\b\3\2\2\2CD\t\5\2\2D\n\3\2\2\2EF\7\61\2\2FG\7\61\2\2GK\3"+
		"\2\2\2HJ\n\6\2\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LP\3\2\2\2MK\3"+
		"\2\2\2NQ\5\r\7\2OQ\7\2\2\3PN\3\2\2\2PO\3\2\2\2Q\f\3\2\2\2RS\7\17\2\2S"+
		"V\7\f\2\2TV\t\6\2\2UR\3\2\2\2UT\3\2\2\2V\16\3\2\2\2WX\7v\2\2XY\7t\2\2"+
		"YZ\7w\2\2Z[\7g\2\2[\20\3\2\2\2\\]\7h\2\2]^\7c\2\2^_\7n\2\2_`\7u\2\2`a"+
		"\7g\2\2a\22\3\2\2\2bd\5\3\2\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2"+
		"f\24\3\2\2\2gh\t\7\2\2h\26\3\2\2\2ij\t\b\2\2j\30\3\2\2\2kl\t\t\2\2l\32"+
		"\3\2\2\2mn\t\n\2\2n\34\3\2\2\2op\t\13\2\2p\36\3\2\2\2qr\t\f\2\2r \3\2"+
		"\2\2st\t\n\2\2tu\t\n\2\2u\"\3\2\2\2vw\t\r\2\2w$\3\2\2\2xy\t\16\2\2y&\3"+
		"\2\2\2z{\t\17\2\2{(\3\2\2\2|}\t\20\2\2}*\3\2\2\2~\177\7r\2\2\177\u0080"+
		"\7t\2\2\u0080\u0081\7k\2\2\u0081\u0082\7p\2\2\u0082\u0083\7v\2\2\u0083"+
		",\3\2\2\2\u0084\u0085\7x\2\2\u0085\u0086\7c\2\2\u0086\u0087\7t\2\2\u0087"+
		".\3\2\2\2\u0088\u008b\5\17\b\2\u0089\u008b\5\21\t\2\u008a\u0088\3\2\2"+
		"\2\u008a\u0089\3\2\2\2\u008b\60\3\2\2\2\u008c\u008d\5\5\3\2\u008d\62\3"+
		"\2\2\2\u008e\u0090\5\7\4\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\b\32"+
		"\2\2\u0094\64\3\2\2\2\13\2;AKPUe\u008a\u0091";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}