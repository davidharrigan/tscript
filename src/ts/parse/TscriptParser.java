// Generated from Tscript.g by ANTLR 4.1

  package ts.parse;
  import ts.Location;
  import ts.tree.*;
  import static ts.parse.TreeBuilder.*;
  import java.util.List;
  import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TscriptParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__1=1, T__0=2, NUMERIC_LITERAL=3, BOOLEAN_LITERAL=4, STRING_LITERAL=5, 
		NULL_LITERAL=6, LPAREN=7, RPAREN=8, SEMICOLON=9, EQUAL=10, PLUS=11, MINUS=12, 
		ASTERISK=13, DASH=14, COMMA=15, DOUBLE_EQUAL=16, LESS=17, GREATER=18, 
		NOT=19, NOT_EQUAL=20, PRINT=21, VAR=22, IDENTIFIER=23, WhiteSpace=24;
	public static final String[] tokenNames = {
		"<INVALID>", "'{'", "'}'", "NUMERIC_LITERAL", "BOOLEAN_LITERAL", "STRING_LITERAL", 
		"'null'", "LPAREN", "RPAREN", "SEMICOLON", "EQUAL", "PLUS", "MINUS", "ASTERISK", 
		"DASH", "COMMA", "DOUBLE_EQUAL", "LESS", "GREATER", "NOT", "NOT_EQUAL", 
		"'print'", "'var'", "IDENTIFIER", "WhiteSpace"
	};
	public static final int
		RULE_program = 0, RULE_statementList = 1, RULE_statement = 2, RULE_blockStatement = 3, 
		RULE_emptyStatement = 4, RULE_varStatement = 5, RULE_variableDeclarationList = 6, 
		RULE_variableDeclaration = 7, RULE_initialiser = 8, RULE_expressionStatement = 9, 
		RULE_printStatement = 10, RULE_expression = 11, RULE_assignmentExpression = 12, 
		RULE_leftHandSideExpression = 13, RULE_additiveExpression = 14, RULE_multiplicativeExpression = 15, 
		RULE_primaryExpression = 16, RULE_relationalExpression = 17, RULE_equalityExpression = 18, 
		RULE_unaryExpression = 19;
	public static final String[] ruleNames = {
		"program", "statementList", "statement", "blockStatement", "emptyStatement", 
		"varStatement", "variableDeclarationList", "variableDeclaration", "initialiser", 
		"expressionStatement", "printStatement", "expression", "assignmentExpression", 
		"leftHandSideExpression", "additiveExpression", "multiplicativeExpression", 
		"primaryExpression", "relationalExpression", "equalityExpression", "unaryExpression"
	};

	@Override
	public String getGrammarFileName() { return "Tscript.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public TscriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public StatementListContext sl;
		public TerminalNode EOF() { return getToken(TscriptParser.EOF, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40); ((ProgramContext)_localctx).sl = statementList(0);
			setState(41); match(EOF);
			 semanticValue = ((ProgramContext)_localctx).sl.lval; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementListContext extends ParserRuleContext {
		public int _p;
		public List<Statement> lval;
		public StatementListContext sl;
		public StatementContext s;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatementListContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
	}

	public final StatementListContext statementList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementListContext _localctx = new StatementListContext(_ctx, _parentState, _p);
		StatementListContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, RULE_statementList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			 ((StatementListContext)_localctx).lval =  new ArrayList<Statement>(); 
			}
			_ctx.stop = _input.LT(-1);
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementListContext(_parentctx, _parentState, _p);
					_localctx.sl = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_statementList);
					setState(47);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(48); ((StatementListContext)_localctx).s = statement();
					 for (int i=0; i < ((StatementListContext)_localctx).s.lval.size(); i++) 
					                  ((StatementListContext)_localctx).sl.lval.add(((StatementListContext)_localctx).s.lval.get(i));
					                ((StatementListContext)_localctx).lval =  ((StatementListContext)_localctx).sl.lval;
					              
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public List<Statement> lval;
		public BlockStatementContext b;
		public VarStatementContext v;
		public EmptyStatementContext empty;
		public ExpressionStatementContext e;
		public PrintStatementContext p;
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public VarStatementContext varStatement() {
			return getRuleContext(VarStatementContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(71);
			switch (_input.LA(1)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56); ((StatementContext)_localctx).b = blockStatement();
				 ((StatementContext)_localctx).lval =  ((StatementContext)_localctx).b.lval; 
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(59); ((StatementContext)_localctx).v = varStatement();
				 ((StatementContext)_localctx).lval =  ((StatementContext)_localctx).v.lval; 
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 3);
				{
				setState(62); ((StatementContext)_localctx).empty = emptyStatement();
				 ((StatementContext)_localctx).lval =  new ArrayList<Statement>();
				      _localctx.lval.add(((StatementContext)_localctx).empty.lval); 
				}
				break;
			case NUMERIC_LITERAL:
			case BOOLEAN_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case MINUS:
			case NOT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(65); ((StatementContext)_localctx).e = expressionStatement();
				 ((StatementContext)_localctx).lval =  new ArrayList<Statement>();
				      _localctx.lval.add(((StatementContext)_localctx).e.lval); 
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 5);
				{
				setState(68); ((StatementContext)_localctx).p = printStatement();
				 ((StatementContext)_localctx).lval =  new ArrayList<Statement>();
				      _localctx.lval.add(((StatementContext)_localctx).p.lval); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public List<Statement> lval;
		public StatementListContext s;
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_blockStatement);
		try {
			setState(81);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73); match(1);
				setState(74); match(2);
				 ((BlockStatementContext)_localctx).lval =  new ArrayList<Statement>();
				      _localctx.lval.add(buildBlockStatement(loc(_localctx.start))); 
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76); match(1);
				setState(77); ((BlockStatementContext)_localctx).s = statementList(0);
				setState(78); match(2);
				 ((BlockStatementContext)_localctx).lval =  ((BlockStatementContext)_localctx).s.lval; 
				      _localctx.lval.add(buildBlockStatement(loc(_localctx.start))); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStatementContext extends ParserRuleContext {
		public Statement lval;
		public TerminalNode SEMICOLON() { return getToken(TscriptParser.SEMICOLON, 0); }
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); match(SEMICOLON);
			 ((EmptyStatementContext)_localctx).lval =  buildEmptyStatement(loc(_localctx.start)); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarStatementContext extends ParserRuleContext {
		public List<Statement> lval;
		public VariableDeclarationListContext v;
		public TerminalNode SEMICOLON() { return getToken(TscriptParser.SEMICOLON, 0); }
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public TerminalNode VAR() { return getToken(TscriptParser.VAR, 0); }
		public VarStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varStatement; }
	}

	public final VarStatementContext varStatement() throws RecognitionException {
		VarStatementContext _localctx = new VarStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); match(VAR);
			setState(87); ((VarStatementContext)_localctx).v = variableDeclarationList(0);
			setState(88); match(SEMICOLON);
			 ((VarStatementContext)_localctx).lval =  ((VarStatementContext)_localctx).v.lval; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationListContext extends ParserRuleContext {
		public int _p;
		public List<Statement> lval;
		public VariableDeclarationListContext vl;
		public VariableDeclarationContext v;
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(TscriptParser.COMMA, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationList; }
	}

	public final VariableDeclarationListContext variableDeclarationList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, _parentState, _p);
		VariableDeclarationListContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, RULE_variableDeclarationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			 ((VariableDeclarationListContext)_localctx).lval =  new ArrayList<Statement>(); 
			}
			_ctx.stop = _input.LT(-1);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(103);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new VariableDeclarationListContext(_parentctx, _parentState, _p);
						_localctx.vl = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_variableDeclarationList);
						setState(94);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(95); ((VariableDeclarationListContext)_localctx).v = variableDeclaration();
						 for (int i=0; i<((VariableDeclarationListContext)_localctx).v.lval.size(); i++)
						                  ((VariableDeclarationListContext)_localctx).vl.lval.add(((VariableDeclarationListContext)_localctx).v.lval.get(i)); 
						                ((VariableDeclarationListContext)_localctx).lval =  ((VariableDeclarationListContext)_localctx).vl.lval; 
						}
						break;

					case 2:
						{
						_localctx = new VariableDeclarationListContext(_parentctx, _parentState, _p);
						_localctx.vl = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_variableDeclarationList);
						setState(98);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(99); match(COMMA);
						setState(100); ((VariableDeclarationListContext)_localctx).v = variableDeclaration();
						 for (int i=0; i<((VariableDeclarationListContext)_localctx).v.lval.size(); i++)
						                  ((VariableDeclarationListContext)_localctx).vl.lval.add(((VariableDeclarationListContext)_localctx).v.lval.get(i)); 
						                ((VariableDeclarationListContext)_localctx).lval =  ((VariableDeclarationListContext)_localctx).vl.lval; 
						}
						break;
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public List<Statement> lval;
		public Token IDENTIFIER;
		public InitialiserContext i;
		public TerminalNode IDENTIFIER() { return getToken(TscriptParser.IDENTIFIER, 0); }
		public InitialiserContext initialiser() {
			return getRuleContext(InitialiserContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variableDeclaration);
		try {
			setState(114);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108); ((VariableDeclarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 ((VariableDeclarationContext)_localctx).lval =  new ArrayList<Statement>();
				      _localctx.lval.add(buildVarStatement(loc(_localctx.start), (((VariableDeclarationContext)_localctx).IDENTIFIER!=null?((VariableDeclarationContext)_localctx).IDENTIFIER.getText():null))); 
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110); ((VariableDeclarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(111); ((VariableDeclarationContext)_localctx).i = initialiser();
				 ((VariableDeclarationContext)_localctx).lval =  new ArrayList<Statement>(); 
				      _localctx.lval.add(buildVarStatement(loc(_localctx.start), (((VariableDeclarationContext)_localctx).IDENTIFIER!=null?((VariableDeclarationContext)_localctx).IDENTIFIER.getText():null)));

				      Expression left = buildIdentifier(loc(_localctx.start), (((VariableDeclarationContext)_localctx).IDENTIFIER!=null?((VariableDeclarationContext)_localctx).IDENTIFIER.getText():null)); 
				      checkAssignmentDestination(loc(_localctx.start), left);
				      Expression assgn = buildBinaryOperator(loc(_localctx.start), Binop.ASSIGN, left, ((VariableDeclarationContext)_localctx).i.lval);
				      _localctx.lval.add(buildExpressionStatement(loc(_localctx.start), assgn)); 
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitialiserContext extends ParserRuleContext {
		public Expression lval;
		public AssignmentExpressionContext a;
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(TscriptParser.EQUAL, 0); }
		public InitialiserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialiser; }
	}

	public final InitialiserContext initialiser() throws RecognitionException {
		InitialiserContext _localctx = new InitialiserContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_initialiser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); match(EQUAL);
			setState(117); ((InitialiserContext)_localctx).a = assignmentExpression();
			((InitialiserContext)_localctx).lval =  ((InitialiserContext)_localctx).a.lval;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public Statement lval;
		public ExpressionContext e;
		public TerminalNode SEMICOLON() { return getToken(TscriptParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); ((ExpressionStatementContext)_localctx).e = expression();
			setState(121); match(SEMICOLON);
			 ((ExpressionStatementContext)_localctx).lval =  buildExpressionStatement(loc(_localctx.start), ((ExpressionStatementContext)_localctx).e.lval); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStatementContext extends ParserRuleContext {
		public Statement lval;
		public ExpressionContext e;
		public TerminalNode PRINT() { return getToken(TscriptParser.PRINT, 0); }
		public TerminalNode SEMICOLON() { return getToken(TscriptParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); match(PRINT);
			setState(125); ((PrintStatementContext)_localctx).e = expression();
			setState(126); match(SEMICOLON);
			 ((PrintStatementContext)_localctx).lval =  buildPrintStatement(loc(_localctx.start), ((PrintStatementContext)_localctx).e.lval); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Expression lval;
		public AssignmentExpressionContext a;
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); ((ExpressionContext)_localctx).a = assignmentExpression();
			 ((ExpressionContext)_localctx).lval =  ((ExpressionContext)_localctx).a.lval; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public Expression lval;
		public EqualityExpressionContext e;
		public LeftHandSideExpressionContext l;
		public AssignmentExpressionContext r;
		public LeftHandSideExpressionContext leftHandSideExpression() {
			return getRuleContext(LeftHandSideExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(TscriptParser.EQUAL, 0); }
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignmentExpression);
		try {
			setState(140);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132); ((AssignmentExpressionContext)_localctx).e = equalityExpression(0);
				 ((AssignmentExpressionContext)_localctx).lval =  ((AssignmentExpressionContext)_localctx).e.lval; 
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135); ((AssignmentExpressionContext)_localctx).l = leftHandSideExpression();
				setState(136); match(EQUAL);
				setState(137); ((AssignmentExpressionContext)_localctx).r = assignmentExpression();
				 checkAssignmentDestination(loc(_localctx.start), ((AssignmentExpressionContext)_localctx).l.lval);
				      ((AssignmentExpressionContext)_localctx).lval =  buildBinaryOperator(loc(_localctx.start), Binop.ASSIGN,
				        ((AssignmentExpressionContext)_localctx).l.lval, ((AssignmentExpressionContext)_localctx).r.lval); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeftHandSideExpressionContext extends ParserRuleContext {
		public Expression lval;
		public PrimaryExpressionContext p;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public LeftHandSideExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftHandSideExpression; }
	}

	public final LeftHandSideExpressionContext leftHandSideExpression() throws RecognitionException {
		LeftHandSideExpressionContext _localctx = new LeftHandSideExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_leftHandSideExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); ((LeftHandSideExpressionContext)_localctx).p = primaryExpression();
			 ((LeftHandSideExpressionContext)_localctx).lval =  ((LeftHandSideExpressionContext)_localctx).p.lval; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public int _p;
		public Expression lval;
		public AdditiveExpressionContext l;
		public MultiplicativeExpressionContext m;
		public MultiplicativeExpressionContext r;
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(TscriptParser.MINUS, 0); }
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(TscriptParser.PLUS, 0); }
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
	}

	public final AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState, _p);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, RULE_additiveExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(146); ((AdditiveExpressionContext)_localctx).m = multiplicativeExpression(0);
			 ((AdditiveExpressionContext)_localctx).lval =  ((AdditiveExpressionContext)_localctx).m.lval; 
			}
			_ctx.stop = _input.LT(-1);
			setState(161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(159);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState, _p);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(149);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(150); match(PLUS);
						setState(151); ((AdditiveExpressionContext)_localctx).r = multiplicativeExpression(0);
						 ((AdditiveExpressionContext)_localctx).lval =  buildBinaryOperator(loc(_localctx.start), Binop.ADD,
						                  ((AdditiveExpressionContext)_localctx).l.lval, ((AdditiveExpressionContext)_localctx).r.lval); 
						}
						break;

					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState, _p);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(154);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(155); match(MINUS);
						setState(156); ((AdditiveExpressionContext)_localctx).r = multiplicativeExpression(0);
						 ((AdditiveExpressionContext)_localctx).lval =  buildBinaryOperator(loc(_localctx.start), Binop.SUBTRACT,
						                  ((AdditiveExpressionContext)_localctx).l.lval, ((AdditiveExpressionContext)_localctx).r.lval); 
						}
						break;
					}
					} 
				}
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public int _p;
		public Expression lval;
		public MultiplicativeExpressionContext l;
		public UnaryExpressionContext p;
		public UnaryExpressionContext r;
		public TerminalNode ASTERISK() { return getToken(TscriptParser.ASTERISK, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode DASH() { return getToken(TscriptParser.DASH, 0); }
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
	}

	public final MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState, _p);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, RULE_multiplicativeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(165); ((MultiplicativeExpressionContext)_localctx).p = unaryExpression();
			 ((MultiplicativeExpressionContext)_localctx).lval =  ((MultiplicativeExpressionContext)_localctx).p.lval; 
			}
			_ctx.stop = _input.LT(-1);
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(178);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState, _p);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(168);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(169); match(ASTERISK);
						setState(170); ((MultiplicativeExpressionContext)_localctx).r = unaryExpression();
						 ((MultiplicativeExpressionContext)_localctx).lval =  buildBinaryOperator(loc(_localctx.start), Binop.MULTIPLY,
						                ((MultiplicativeExpressionContext)_localctx).l.lval, ((MultiplicativeExpressionContext)_localctx).r.lval); 
						}
						break;

					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState, _p);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(173);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(174); match(DASH);
						setState(175); ((MultiplicativeExpressionContext)_localctx).r = unaryExpression();
						 ((MultiplicativeExpressionContext)_localctx).lval =  buildBinaryOperator(loc(_localctx.start), Binop.DIVIDE, 
						                ((MultiplicativeExpressionContext)_localctx).l.lval, ((MultiplicativeExpressionContext)_localctx).r.lval); 
						}
						break;
					}
					} 
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public Expression lval;
		public Token IDENTIFIER;
		public Token NUMERIC_LITERAL;
		public Token STRING_LITERAL;
		public Token BOOLEAN_LITERAL;
		public ExpressionContext e;
		public TerminalNode BOOLEAN_LITERAL() { return getToken(TscriptParser.BOOLEAN_LITERAL, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(TscriptParser.NUMERIC_LITERAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TscriptParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(TscriptParser.STRING_LITERAL, 0); }
		public TerminalNode RPAREN() { return getToken(TscriptParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(TscriptParser.LPAREN, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(TscriptParser.NULL_LITERAL, 0); }
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_primaryExpression);
		try {
			setState(198);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(183); ((PrimaryExpressionContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 ((PrimaryExpressionContext)_localctx).lval =  buildIdentifier(loc(_localctx.start), (((PrimaryExpressionContext)_localctx).IDENTIFIER!=null?((PrimaryExpressionContext)_localctx).IDENTIFIER.getText():null)); 
				}
				break;
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(185); ((PrimaryExpressionContext)_localctx).NUMERIC_LITERAL = match(NUMERIC_LITERAL);
				 ((PrimaryExpressionContext)_localctx).lval =  buildNumericLiteral(loc(_localctx.start), (((PrimaryExpressionContext)_localctx).NUMERIC_LITERAL!=null?((PrimaryExpressionContext)_localctx).NUMERIC_LITERAL.getText():null)); 
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(187); ((PrimaryExpressionContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((PrimaryExpressionContext)_localctx).lval =  buildStringLiteral(loc(_localctx.start), (((PrimaryExpressionContext)_localctx).STRING_LITERAL!=null?((PrimaryExpressionContext)_localctx).STRING_LITERAL.getText():null)); 
				}
				break;
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(189); ((PrimaryExpressionContext)_localctx).BOOLEAN_LITERAL = match(BOOLEAN_LITERAL);
				 ((PrimaryExpressionContext)_localctx).lval =  buildBooleanLiteral(loc(_localctx.start), (((PrimaryExpressionContext)_localctx).BOOLEAN_LITERAL!=null?((PrimaryExpressionContext)_localctx).BOOLEAN_LITERAL.getText():null)); 
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(191); match(NULL_LITERAL);
				 ((PrimaryExpressionContext)_localctx).lval =  buildNullLiteral(loc(_localctx.start)); 
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 6);
				{
				setState(193); match(LPAREN);
				setState(194); ((PrimaryExpressionContext)_localctx).e = expression();
				setState(195); match(RPAREN);
				 ((PrimaryExpressionContext)_localctx).lval =  ((PrimaryExpressionContext)_localctx).e.lval; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public int _p;
		public Expression lval;
		public RelationalExpressionContext l;
		public AdditiveExpressionContext a;
		public AdditiveExpressionContext r;
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode LESS() { return getToken(TscriptParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(TscriptParser.GREATER, 0); }
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
	}

	public final RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState, _p);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, RULE_relationalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(201); ((RelationalExpressionContext)_localctx).a = additiveExpression(0);
			 ((RelationalExpressionContext)_localctx).lval =  ((RelationalExpressionContext)_localctx).a.lval; 
			}
			_ctx.stop = _input.LT(-1);
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(214);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState, _p);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(204);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(205); match(LESS);
						setState(206); ((RelationalExpressionContext)_localctx).r = additiveExpression(0);
						 ((RelationalExpressionContext)_localctx).lval =  buildBinaryOperator(loc(_localctx.start), Binop.LESS, ((RelationalExpressionContext)_localctx).l.lval, ((RelationalExpressionContext)_localctx).r.lval); 
						}
						break;

					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState, _p);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(209);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(210); match(GREATER);
						setState(211); ((RelationalExpressionContext)_localctx).r = additiveExpression(0);
						 ((RelationalExpressionContext)_localctx).lval =  buildBinaryOperator(loc(_localctx.start), Binop.GREATER, ((RelationalExpressionContext)_localctx).l.lval, ((RelationalExpressionContext)_localctx).r.lval); 
						}
						break;
					}
					} 
				}
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public int _p;
		public Expression lval;
		public EqualityExpressionContext l;
		public RelationalExpressionContext re;
		public RelationalExpressionContext r;
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode DOUBLE_EQUAL() { return getToken(TscriptParser.DOUBLE_EQUAL, 0); }
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
	}

	public final EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState, _p);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, RULE_equalityExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(220); ((EqualityExpressionContext)_localctx).re = relationalExpression(0);
			 ((EqualityExpressionContext)_localctx).lval =  ((EqualityExpressionContext)_localctx).re.lval; 
			}
			_ctx.stop = _input.LT(-1);
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EqualityExpressionContext(_parentctx, _parentState, _p);
					_localctx.l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
					setState(223);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(224); match(DOUBLE_EQUAL);
					setState(225); ((EqualityExpressionContext)_localctx).r = relationalExpression(0);
					 ((EqualityExpressionContext)_localctx).lval =  buildBinaryOperator(loc(_localctx.start), Binop.EQUAL, ((EqualityExpressionContext)_localctx).l.lval, ((EqualityExpressionContext)_localctx).r.lval); 
					}
					} 
				}
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public Expression lval;
		public LeftHandSideExpressionContext le;
		public UnaryExpressionContext u;
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(TscriptParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(TscriptParser.NOT, 0); }
		public LeftHandSideExpressionContext leftHandSideExpression() {
			return getRuleContext(LeftHandSideExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_unaryExpression);
		try {
			setState(244);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
			case BOOLEAN_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(233); ((UnaryExpressionContext)_localctx).le = leftHandSideExpression();
				 ((UnaryExpressionContext)_localctx).lval =  ((UnaryExpressionContext)_localctx).le.lval; 
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(236); match(NOT);
				setState(237); ((UnaryExpressionContext)_localctx).u = unaryExpression();
				 ((UnaryExpressionContext)_localctx).lval =  buildUnaryOperator(loc(_localctx.start), Uop.NOT, ((UnaryExpressionContext)_localctx).u.lval); 
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(240); match(MINUS);
				setState(241); ((UnaryExpressionContext)_localctx).u = unaryExpression();
				 ((UnaryExpressionContext)_localctx).lval =  buildUnaryOperator(loc(_localctx.start), Uop.MINUS, ((UnaryExpressionContext)_localctx).u.lval); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1: return statementList_sempred((StatementListContext)_localctx, predIndex);

		case 6: return variableDeclarationList_sempred((VariableDeclarationListContext)_localctx, predIndex);

		case 14: return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);

		case 15: return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);

		case 17: return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);

		case 18: return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean statementList_sempred(StatementListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7: return 2 >= _localctx._p;

		case 8: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean variableDeclarationList_sempred(VariableDeclarationListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return 2 >= _localctx._p;

		case 2: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return 2 >= _localctx._p;

		case 4: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5: return 2 >= _localctx._p;

		case 6: return 1 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\32\u00f9\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\7\3\66\n\3\f\3\16\39\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4J\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5T\n\5"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\7\bj\n\b\f\b\16\bm\13\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tu\n\t\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u008f\n\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20"+
		"\u00a2\n\20\f\20\16\20\u00a5\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00b5\n\21\f\21\16\21\u00b8\13"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\5\22\u00c9\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\7\23\u00d9\n\23\f\23\16\23\u00dc\13\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00e7\n\24\f\24\16\24\u00ea"+
		"\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00f7"+
		"\n\25\3\25\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\2\u00fc"+
		"\2*\3\2\2\2\4.\3\2\2\2\6I\3\2\2\2\bS\3\2\2\2\nU\3\2\2\2\fX\3\2\2\2\16"+
		"]\3\2\2\2\20t\3\2\2\2\22v\3\2\2\2\24z\3\2\2\2\26~\3\2\2\2\30\u0083\3\2"+
		"\2\2\32\u008e\3\2\2\2\34\u0090\3\2\2\2\36\u0093\3\2\2\2 \u00a6\3\2\2\2"+
		"\"\u00c8\3\2\2\2$\u00ca\3\2\2\2&\u00dd\3\2\2\2(\u00f6\3\2\2\2*+\5\4\3"+
		"\2+,\7\2\2\3,-\b\2\1\2-\3\3\2\2\2./\b\3\1\2/\60\b\3\1\2\60\67\3\2\2\2"+
		"\61\62\6\3\2\3\62\63\5\6\4\2\63\64\b\3\1\2\64\66\3\2\2\2\65\61\3\2\2\2"+
		"\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\5\3\2\2\29\67\3\2\2\2:;\5\b\5"+
		"\2;<\b\4\1\2<J\3\2\2\2=>\5\f\7\2>?\b\4\1\2?J\3\2\2\2@A\5\n\6\2AB\b\4\1"+
		"\2BJ\3\2\2\2CD\5\24\13\2DE\b\4\1\2EJ\3\2\2\2FG\5\26\f\2GH\b\4\1\2HJ\3"+
		"\2\2\2I:\3\2\2\2I=\3\2\2\2I@\3\2\2\2IC\3\2\2\2IF\3\2\2\2J\7\3\2\2\2KL"+
		"\7\3\2\2LM\7\4\2\2MT\b\5\1\2NO\7\3\2\2OP\5\4\3\2PQ\7\4\2\2QR\b\5\1\2R"+
		"T\3\2\2\2SK\3\2\2\2SN\3\2\2\2T\t\3\2\2\2UV\7\13\2\2VW\b\6\1\2W\13\3\2"+
		"\2\2XY\7\30\2\2YZ\5\16\b\2Z[\7\13\2\2[\\\b\7\1\2\\\r\3\2\2\2]^\b\b\1\2"+
		"^_\b\b\1\2_k\3\2\2\2`a\6\b\3\3ab\5\20\t\2bc\b\b\1\2cj\3\2\2\2de\6\b\4"+
		"\3ef\7\21\2\2fg\5\20\t\2gh\b\b\1\2hj\3\2\2\2i`\3\2\2\2id\3\2\2\2jm\3\2"+
		"\2\2ki\3\2\2\2kl\3\2\2\2l\17\3\2\2\2mk\3\2\2\2no\7\31\2\2ou\b\t\1\2pq"+
		"\7\31\2\2qr\5\22\n\2rs\b\t\1\2su\3\2\2\2tn\3\2\2\2tp\3\2\2\2u\21\3\2\2"+
		"\2vw\7\f\2\2wx\5\32\16\2xy\b\n\1\2y\23\3\2\2\2z{\5\30\r\2{|\7\13\2\2|"+
		"}\b\13\1\2}\25\3\2\2\2~\177\7\27\2\2\177\u0080\5\30\r\2\u0080\u0081\7"+
		"\13\2\2\u0081\u0082\b\f\1\2\u0082\27\3\2\2\2\u0083\u0084\5\32\16\2\u0084"+
		"\u0085\b\r\1\2\u0085\31\3\2\2\2\u0086\u0087\5&\24\2\u0087\u0088\b\16\1"+
		"\2\u0088\u008f\3\2\2\2\u0089\u008a\5\34\17\2\u008a\u008b\7\f\2\2\u008b"+
		"\u008c\5\32\16\2\u008c\u008d\b\16\1\2\u008d\u008f\3\2\2\2\u008e\u0086"+
		"\3\2\2\2\u008e\u0089\3\2\2\2\u008f\33\3\2\2\2\u0090\u0091\5\"\22\2\u0091"+
		"\u0092\b\17\1\2\u0092\35\3\2\2\2\u0093\u0094\b\20\1\2\u0094\u0095\5 \21"+
		"\2\u0095\u0096\b\20\1\2\u0096\u00a3\3\2\2\2\u0097\u0098\6\20\5\3\u0098"+
		"\u0099\7\r\2\2\u0099\u009a\5 \21\2\u009a\u009b\b\20\1\2\u009b\u00a2\3"+
		"\2\2\2\u009c\u009d\6\20\6\3\u009d\u009e\7\16\2\2\u009e\u009f\5 \21\2\u009f"+
		"\u00a0\b\20\1\2\u00a0\u00a2\3\2\2\2\u00a1\u0097\3\2\2\2\u00a1\u009c\3"+
		"\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\37\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\b\21\1\2\u00a7\u00a8\5(\25"+
		"\2\u00a8\u00a9\b\21\1\2\u00a9\u00b6\3\2\2\2\u00aa\u00ab\6\21\7\3\u00ab"+
		"\u00ac\7\17\2\2\u00ac\u00ad\5(\25\2\u00ad\u00ae\b\21\1\2\u00ae\u00b5\3"+
		"\2\2\2\u00af\u00b0\6\21\b\3\u00b0\u00b1\7\20\2\2\u00b1\u00b2\5(\25\2\u00b2"+
		"\u00b3\b\21\1\2\u00b3\u00b5\3\2\2\2\u00b4\u00aa\3\2\2\2\u00b4\u00af\3"+
		"\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"!\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\7\31\2\2\u00ba\u00c9\b\22\1"+
		"\2\u00bb\u00bc\7\5\2\2\u00bc\u00c9\b\22\1\2\u00bd\u00be\7\7\2\2\u00be"+
		"\u00c9\b\22\1\2\u00bf\u00c0\7\6\2\2\u00c0\u00c9\b\22\1\2\u00c1\u00c2\7"+
		"\b\2\2\u00c2\u00c9\b\22\1\2\u00c3\u00c4\7\t\2\2\u00c4\u00c5\5\30\r\2\u00c5"+
		"\u00c6\7\n\2\2\u00c6\u00c7\b\22\1\2\u00c7\u00c9\3\2\2\2\u00c8\u00b9\3"+
		"\2\2\2\u00c8\u00bb\3\2\2\2\u00c8\u00bd\3\2\2\2\u00c8\u00bf\3\2\2\2\u00c8"+
		"\u00c1\3\2\2\2\u00c8\u00c3\3\2\2\2\u00c9#\3\2\2\2\u00ca\u00cb\b\23\1\2"+
		"\u00cb\u00cc\5\36\20\2\u00cc\u00cd\b\23\1\2\u00cd\u00da\3\2\2\2\u00ce"+
		"\u00cf\6\23\t\3\u00cf\u00d0\7\23\2\2\u00d0\u00d1\5\36\20\2\u00d1\u00d2"+
		"\b\23\1\2\u00d2\u00d9\3\2\2\2\u00d3\u00d4\6\23\n\3\u00d4\u00d5\7\24\2"+
		"\2\u00d5\u00d6\5\36\20\2\u00d6\u00d7\b\23\1\2\u00d7\u00d9\3\2\2\2\u00d8"+
		"\u00ce\3\2\2\2\u00d8\u00d3\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00da\u00db\3\2\2\2\u00db%\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de"+
		"\b\24\1\2\u00de\u00df\5$\23\2\u00df\u00e0\b\24\1\2\u00e0\u00e8\3\2\2\2"+
		"\u00e1\u00e2\6\24\13\3\u00e2\u00e3\7\22\2\2\u00e3\u00e4\5$\23\2\u00e4"+
		"\u00e5\b\24\1\2\u00e5\u00e7\3\2\2\2\u00e6\u00e1\3\2\2\2\u00e7\u00ea\3"+
		"\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\'\3\2\2\2\u00ea\u00e8"+
		"\3\2\2\2\u00eb\u00ec\5\34\17\2\u00ec\u00ed\b\25\1\2\u00ed\u00f7\3\2\2"+
		"\2\u00ee\u00ef\7\25\2\2\u00ef\u00f0\5(\25\2\u00f0\u00f1\b\25\1\2\u00f1"+
		"\u00f7\3\2\2\2\u00f2\u00f3\7\16\2\2\u00f3\u00f4\5(\25\2\u00f4\u00f5\b"+
		"\25\1\2\u00f5\u00f7\3\2\2\2\u00f6\u00eb\3\2\2\2\u00f6\u00ee\3\2\2\2\u00f6"+
		"\u00f2\3\2\2\2\u00f7)\3\2\2\2\22\67ISikt\u008e\u00a1\u00a3\u00b4\u00b6"+
		"\u00c8\u00d8\u00da\u00e8\u00f6";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}