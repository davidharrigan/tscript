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
		PRINT=8, VAR=9, BOOLEAN_LITERAL=10, IDENTIFIER=11, WhiteSpace=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"NUMERIC_LITERAL", "LPAREN", "RPAREN", "SEMICOLON", "EQUAL", "PLUS", "ASTERISK", 
		"'print'", "'var'", "BOOLEAN_LITERAL", "IDENTIFIER", "WhiteSpace"
	};
	public static final String[] ruleNames = {
		"DIGIT", "IdentifierCharacters", "SpaceTokens", "SpaceChars", "EndOfLineComment", 
		"LineTerminator", "TRUE", "FALSE", "NUMERIC_LITERAL", "LPAREN", "RPAREN", 
		"SEMICOLON", "EQUAL", "PLUS", "ASTERISK", "PRINT", "VAR", "BOOLEAN_LITERAL", 
		"IDENTIFIER", "WhiteSpace"
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
		case 19: WhiteSpace_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WhiteSpace_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\16\u0080\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\7\3\60\n\3\f\3\16"+
		"\3\63\13\3\3\4\3\4\3\4\5\48\n\4\3\5\3\5\3\6\3\6\3\6\3\6\7\6@\n\6\f\6\16"+
		"\6C\13\6\3\6\3\6\5\6G\n\6\3\7\3\7\3\7\5\7L\n\7\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\6\nZ\n\n\r\n\16\n[\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\5\23v\n\23\3\24\3\24\3\25\6\25{\n\25\r\25\16\25|"+
		"\3\25\3\25\2\26\3\2\1\5\2\1\7\2\1\t\2\1\13\2\1\r\2\1\17\2\1\21\2\1\23"+
		"\3\1\25\4\1\27\5\1\31\6\1\33\7\1\35\b\1\37\t\1!\n\1#\13\1%\f\1\'\r\1)"+
		"\16\2\3\2\r\3\2\62;\6\2&&C\\aac|\7\2&&\62;C\\aac|\5\2\13\13\16\16\"\""+
		"\4\2\f\f\17\17\3\2**\3\2++\3\2==\3\2??\3\2--\3\2,,\u0080\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3"+
		"\2\2\2\5-\3\2\2\2\7\67\3\2\2\2\t9\3\2\2\2\13;\3\2\2\2\rK\3\2\2\2\17M\3"+
		"\2\2\2\21R\3\2\2\2\23Y\3\2\2\2\25]\3\2\2\2\27_\3\2\2\2\31a\3\2\2\2\33"+
		"c\3\2\2\2\35e\3\2\2\2\37g\3\2\2\2!i\3\2\2\2#o\3\2\2\2%u\3\2\2\2\'w\3\2"+
		"\2\2)z\3\2\2\2+,\t\2\2\2,\4\3\2\2\2-\61\t\3\2\2.\60\t\4\2\2/.\3\2\2\2"+
		"\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\6\3\2\2\2\63\61\3\2\2\2\64"+
		"8\5\t\5\2\658\5\r\7\2\668\5\13\6\2\67\64\3\2\2\2\67\65\3\2\2\2\67\66\3"+
		"\2\2\28\b\3\2\2\29:\t\5\2\2:\n\3\2\2\2;<\7\61\2\2<=\7\61\2\2=A\3\2\2\2"+
		">@\n\6\2\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BF\3\2\2\2CA\3\2\2\2"+
		"DG\5\r\7\2EG\7\2\2\3FD\3\2\2\2FE\3\2\2\2G\f\3\2\2\2HI\7\17\2\2IL\7\f\2"+
		"\2JL\t\6\2\2KH\3\2\2\2KJ\3\2\2\2L\16\3\2\2\2MN\7v\2\2NO\7t\2\2OP\7w\2"+
		"\2PQ\7g\2\2Q\20\3\2\2\2RS\7h\2\2ST\7c\2\2TU\7n\2\2UV\7u\2\2VW\7g\2\2W"+
		"\22\3\2\2\2XZ\5\3\2\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\24\3"+
		"\2\2\2]^\t\7\2\2^\26\3\2\2\2_`\t\b\2\2`\30\3\2\2\2ab\t\t\2\2b\32\3\2\2"+
		"\2cd\t\n\2\2d\34\3\2\2\2ef\t\13\2\2f\36\3\2\2\2gh\t\f\2\2h \3\2\2\2ij"+
		"\7r\2\2jk\7t\2\2kl\7k\2\2lm\7p\2\2mn\7v\2\2n\"\3\2\2\2op\7x\2\2pq\7c\2"+
		"\2qr\7t\2\2r$\3\2\2\2sv\5\17\b\2tv\5\21\t\2us\3\2\2\2ut\3\2\2\2v&\3\2"+
		"\2\2wx\5\5\3\2x(\3\2\2\2y{\5\7\4\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2"+
		"\2\2}~\3\2\2\2~\177\b\25\2\2\177*\3\2\2\2\13\2\61\67AFK[u|";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}