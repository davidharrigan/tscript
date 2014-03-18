//
// an ANTLR parser specification for a Tscript subset
//

grammar Tscript;

@header {
  package ts.parse;
  import ts.Location;
  import ts.tree.*;
  import static ts.parse.TreeBuilder.*;
  import java.util.List;
  import java.util.ArrayList;
}

@members {
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
}

// grammar proper

program
  : sl=statementList EOF
    { semanticValue = $sl.lval; }
  ;

statementList
  returns [ List<Statement> lval ]
  : // empty rule
    { $lval = new ArrayList<Statement>(); }
  | sl=statementList s=statement
    { for (int i=0; i < $s.lval.size(); i++) 
        $sl.lval.add($s.lval.get(i));
      $lval = $sl.lval;
    }
  ;

statement
  returns [ List<Statement> lval ]
  : b=blockStatement
    { $lval = new ArrayList<Statement>();
      $lval.add($b.lval); }
  | v=varStatement
    { $lval = $v.lval; }
  | empty=emptyStatement
    { $lval = new ArrayList<Statement>();
      $lval.add($empty.lval); }
  | e=expressionStatement
    { $lval = new ArrayList<Statement>();
      $lval.add($e.lval); }
  | iter=iterationStatement
    { $lval = new ArrayList<Statement>(); 
      $lval.add($iter.lval); }
  | bStatement=breakStatement
    { $lval = new ArrayList<Statement>();
      $lval.add($bStatement.lval); }
  | cStatement=continueStatement
    { $lval = new ArrayList<Statement>(); 
      $lval.add($cStatement.lval); }
  | lStatement=labelledStatement
    { $lval = new ArrayList<Statement>();
      $lval.add($lStatement.lval); }
  | i=ifStatement
    { $lval = new ArrayList<Statement>();
      $lval.add($i.lval); }
  | p=printStatement
    { $lval = new ArrayList<Statement>();
      $lval.add($p.lval); }
  | th=throwStatement
    { $lval = new ArrayList<Statement>();
      $lval.add($th.lval); }
  | tr=tryStatement
    { $lval = new ArrayList<Statement>();
      $lval.add($tr.lval); }
  ;

// Block Statement 
// ------------------------------------------------------------------
blockStatement
  returns [ Statement lval ]
  : '{' '}'
    { $lval = buildBlockStatement(loc($start), null); }
  | '{' s=statementList '}'
    { $lval = buildBlockStatement(loc($start), $s.lval); }
  ;

// Empty Statement
// ------------------------------------------------------------------
emptyStatement
  returns [ Statement lval ]
  : SEMICOLON
    { $lval = buildEmptyStatement(loc($start)); }
  ;

// Iteration Statement
// ------------------------------------------------------------------
iterationStatement
  returns [ Statement lval ]
  :// 'do' s=statement 'while' RPAREN e=expression LPAREN SEMICOLON
   // { }
   'while' LPAREN e=expression RPAREN s=statement 
    { $lval = buildWhileStatement(loc($start), $e.lval, $s.lval); }
  ;

// Break Statement
// ------------------------------------------------------------------
breakStatement
  returns [ Statement lval ]
  : 'break' SEMICOLON
    { $lval = buildBreakStatement(loc($start), null); }
  | 'break' IDENTIFIER SEMICOLON
    { $lval = buildBreakStatement(loc($start), $IDENTIFIER.text);}
  ;

// Continue Statement
// ------------------------------------------------------------------
continueStatement
  returns [ Statement lval ]
  : 'continue' SEMICOLON
    { $lval = buildContinueStatement(loc($start), null); }
  | 'continue' IDENTIFIER SEMICOLON
    { $lval = buildContinueStatement(loc($start), $IDENTIFIER.text);}
  ;

// Labelled Statement
// ------------------------------------------------------------------
labelledStatement
  returns [ Statement lval ]
  : IDENTIFIER COLON s=statement
    { $lval = buildLabelledStatement(loc($start), $IDENTIFIER.text, $s.lval); }
  ;

// If Statement
// ------------------------------------------------------------------
ifStatement
  returns [ Statement lval ]
  : 'if' LPAREN e=expression RPAREN s1=statement 'else' s2=statement
    { $lval = buildIfStatement(loc($start), $e.lval, $s1.lval, $s2.lval); }
  | 'if' LPAREN e=expression RPAREN s=statement
    { $lval = buildIfStatement(loc($start), $e.lval, $s.lval, null); }
  ;

// Variable Statement
// ------------------------------------------------------------------
varStatement
  returns [ List<Statement> lval ]
  : VAR v=variableDeclarationList SEMICOLON
    { $lval = $v.lval; }
  //: VAR IDENTIFIER SEMICOLON
  //  { $lval = buildVarStatement(loc($start), $IDENTIFIER.text); }
  ;

// Variable Declaration List
// ------------------------------------------------------------------
variableDeclarationList
  returns [ List<Statement> lval ]
  : //empty rule
    { $lval = new ArrayList<Statement>(); }
  | vl=variableDeclarationList v=variableDeclaration
    { for (int i=0; i<$v.lval.size(); i++)
        $vl.lval.add($v.lval.get(i)); 
      $lval = $vl.lval; }
  | vl=variableDeclarationList COMMA v=variableDeclaration
    { for (int i=0; i<$v.lval.size(); i++)
        $vl.lval.add($v.lval.get(i)); 
      $lval = $vl.lval; }
  ;

// Variable Declaration
// ------------------------------------------------------------------
variableDeclaration
  returns [ List<Statement> lval ]
  : IDENTIFIER
    { $lval = new ArrayList<Statement>();
      $lval.add(buildVarStatement(loc($start), $IDENTIFIER.text)); }
  | IDENTIFIER i=initialiser
    { $lval = new ArrayList<Statement>(); 
      $lval.add(buildVarStatement(loc($start), $IDENTIFIER.text));

      Expression left = buildIdentifier(loc($start), $IDENTIFIER.text); 
      checkAssignmentDestination(loc($start), left);
      Expression assgn = buildBinaryOperator(loc($start), Binop.ASSIGN, left, $i.lval);
      $lval.add(buildExpressionStatement(loc($start), assgn)); 
    }
  ;

// Initialiser
// ------------------------------------------------------------------
initialiser
  returns [ Expression lval ]
  : EQUAL a=assignmentExpression 
    {$lval = $a.lval;}
  ;

// Expression Statement
// ------------------------------------------------------------------
expressionStatement
  returns [ Statement lval ]
  : e=expression SEMICOLON
    { $lval = buildExpressionStatement(loc($start), $e.lval); }
  ;

// Print Statement
// ------------------------------------------------------------------
printStatement
  returns [ Statement lval ]
  : PRINT e=expression SEMICOLON
    { $lval = buildPrintStatement(loc($start), $e.lval); }
  ;

// Expression
// ------------------------------------------------------------------
expression
  returns [ Expression lval ]
  : a=assignmentExpression
    { $lval = $a.lval; }
  ;

// Assignment Expression
// ------------------------------------------------------------------
assignmentExpression
  returns [ Expression lval ]
  : e=equalityExpression
    { $lval = $e.lval; }
  | l=leftHandSideExpression EQUAL r=assignmentExpression
    { checkAssignmentDestination(loc($start), $l.lval);
      $lval = buildBinaryOperator(loc($start), Binop.ASSIGN,
        $l.lval, $r.lval); }
  ;

// Left Hand Side Expression
// ------------------------------------------------------------------
leftHandSideExpression
  returns [ Expression lval ]
  : c=callExpression
    { $lval = $c.lval; }
  | n=newExpression
    { $lval = $n.lval; }
  ;

// Throw Statement
// ------------------------------------------------------------------
throwStatement
  returns [ Statement lval ]
  : 'throw' e=expression
     { $lval = buildThrowStatement(loc($start), $e.lval); }
  ;

// Try Statement
// ------------------------------------------------------------------
tryStatement
  returns [ Statement lval ]
  : 'try' b=blockStatement c=catchClause
    { $lval = buildTryStatement(loc($start), $b.lval, $c.lval, null); }
  | 'try' b=blockStatement f=finallyClause
    { $lval = buildTryStatement(loc($start), $b.lval, null, $f.lval); }
  | 'try' b=blockStatement c=catchClause f=finallyClause
    { $lval = buildTryStatement(loc($start), $b.lval, $c.lval, $f.lval); }
  ;

catchClause
  returns [ Expression lval ]
  : 'catch' LPAREN IDENTIFIER RPAREN b=blockStatement
    { $lval = buildCatchClause(loc($start), $IDENTIFIER.text, $b.lval); }
  ;

finallyClause
  returns [ Expression lval ]
  : 'finally' b=blockStatement
    { $lval = buildFinallyClause(loc($start), $b.lval); }
  ;

newExpression
  returns [ Expression lval ]
  : m=memberExpression
    { $lval = $m.lval; }
  ;

callExpression
  returns [ Expression lval ]
  : m=memberExpression arguments
    { $lval = buildFunctionCall(loc($start), $m.lval); }
  ;

memberExpression
  returns [ Expression lval ]
  : p=primaryExpression
    { $lval = $p.lval; }
  | f=functionExpression
    { $lval = $f.lval; }
  ;

functionExpression
  returns [ Expression lval ]
  : 'function' LPAREN RPAREN '{' f=functionBody '}'
    { $lval = buildFunctionExpression(loc($start), "", $f.lval); }
  | 'function' IDENTIFIER LPAREN RPAREN '{' f=functionBody '}'
    { $lval = buildFunctionExpression(loc($start), $IDENTIFIER.text, $f.lval); }

  //| 'function' LPAREN formalParameterList RPAREN '{' functionBody '}'
  //| 'function' IDENTIFIER LPAREN formalParameterList RPAREN '{' functionBody '}'
  ;


arguments
  : LPAREN RPAREN
  //| LPAREN argumentList RPAREN
  ;

functionBody
  returns [ List<Statement> lval ]
  : // empty rule
    { $lval = new ArrayList<Statement>(); }
  | sl=statementList s=statement
    { for (int i=0; i < $s.lval.size(); i++) 
        $sl.lval.add($s.lval.get(i));
      $lval = $sl.lval;
    }
  ;
/*
functionDeclaration
  : 'function' IDENTIFIER LPAREN RPAREN '{' functionBody '}'
  | 'function' IDENTIFIER LPAREN formalParameterList RPAREN '{' functionBody '}'
  ;


formalParameterList
  : IDENTIFIER
  | formalParameterList COMMA IDENTIFIER
  ;

argumentList
  : assignmentExpression
  | argumentList COMMA assignmentExpression
  ;

sourceElements
  : sourceElement
  | sourceElements sourceElement
  ;

sourceElement
  : statement
  //| functionDeclaration
  ;
*/
// Additive Expression
// ------------------------------------------------------------------
additiveExpression
  returns [ Expression lval ]
  : m=multiplicativeExpression
    { $lval = $m.lval; }
  | l=additiveExpression PLUS r=multiplicativeExpression
    { $lval = buildBinaryOperator(loc($start), Binop.ADD,
        $l.lval, $r.lval); }
  | l=additiveExpression MINUS r=multiplicativeExpression
    { $lval = buildBinaryOperator(loc($start), Binop.SUBTRACT,
        $l.lval, $r.lval); }
  ;

// Multiplicative Expression
// ------------------------------------------------------------------
multiplicativeExpression
  returns [ Expression lval ]
  : p=unaryExpression
    { $lval = $p.lval; }
  | l=multiplicativeExpression ASTERISK r=unaryExpression
    { $lval = buildBinaryOperator(loc($start), Binop.MULTIPLY,
      $l.lval, $r.lval); }
  | l=multiplicativeExpression DASH r=unaryExpression
    { $lval = buildBinaryOperator(loc($start), Binop.DIVIDE, 
      $l.lval, $r.lval); }
  ;

// Primary Expression
// ------------------------------------------------------------------
primaryExpression
  returns [ Expression lval ]
  : IDENTIFIER
    { $lval = buildIdentifier(loc($start), $IDENTIFIER.text); }
  | NUMERIC_LITERAL
    { $lval = buildNumericLiteral(loc($start), $NUMERIC_LITERAL.text); }
  | STRING_LITERAL 
    { $lval = buildStringLiteral(loc($start), $STRING_LITERAL.text); }
  | BOOLEAN_LITERAL
    { $lval = buildBooleanLiteral(loc($start), $BOOLEAN_LITERAL.text); }
  | NULL_LITERAL 
    { $lval = buildNullLiteral(loc($start)); }
  | LPAREN e=expression RPAREN
    { $lval = $e.lval; }
  ;

// Relational Expression
// ------------------------------------------------------------------
relationalExpression
  returns [ Expression lval ]
  : a=additiveExpression
    { $lval = $a.lval; }
  | l=relationalExpression LESS r=additiveExpression
    { $lval = buildBinaryOperator(loc($start), Binop.LESS, $l.lval, $r.lval); }
  | l=relationalExpression GREATER r=additiveExpression
    { $lval = buildBinaryOperator(loc($start), Binop.GREATER, $l.lval, $r.lval); }
  ;

// Equality Expression
// ------------------------------------------------------------------
equalityExpression
  returns [ Expression lval ]
  : re=relationalExpression
    { $lval = $re.lval; }
  | l=equalityExpression DOUBLE_EQUAL r=relationalExpression
    { $lval = buildBinaryOperator(loc($start), Binop.EQUAL, $l.lval, $r.lval); }
  ;

// Unary Expression
// ------------------------------------------------------------------
unaryExpression
  returns [ Expression lval ]
  : le=leftHandSideExpression
    { $lval = $le.lval; }
  | NOT u=unaryExpression
    { $lval = buildUnaryOperator(loc($start), Uop.NOT, $u.lval); }
  | MINUS u=unaryExpression
    { $lval = buildUnaryOperator(loc($start), Uop.MINUS, $u.lval); }
  ;


// fragments to support the lexer rules

fragment IdentifierCharacters : [a-zA-Z_$] [a-zA-Z0-9_$]*;

fragment SpaceTokens : SpaceChars | LineTerminator | EndOfLineComment;

fragment SpaceChars : ' ' | '\t' | '\f';

fragment EndOfLineComment : '//' ( ~[\n\r] )* (LineTerminator | EOF);

fragment LineTerminator : '\r' '\n' | '\r' | '\n';

// Numeric -----------------------------------------------------------
//

fragment DecimalDigit : [0-9];

fragment HexDigit : [0-9] | [a-f] | [A-F];

fragment DecimalLiteral
  : DecimalDigit+ '.' DecimalDigit* ExponentPart?
  | '.' DecimalDigit+ ExponentPart?
  | DecimalDigit+ ExponentPart?
  ;

fragment ExponentPart
  : ExponentIndicator SignedInteger
  ;

fragment ExponentIndicator
  : 'e' 
  | 'E'
  ;

fragment SignedInteger
  : DecimalDigit+
  | ('+' | '-') DecimalDigit+
  ;

fragment HexIntegerLiteral
  : '0' ('x' | 'X') HexDigit+;

// String -------------------------------------------------------------
//
fragment DoubleStringCharacters 
  : DoubleStringCharacter 
  | DoubleStringCharacter DoubleStringCharacters
  ;

fragment SingleStringCharacters
  : SingleStringCharacter
  | SingleStringCharacter SingleStringCharacters
  ;

fragment DoubleStringCharacter 
  : ~('"' | '\\' | '\n')
  | '\\' EscapeSequence
  ;

fragment SingleStringCharacter 
  : ~('\'' | '\\' | '\n')
  | '\\' EscapeSequence
  ;

fragment LineContinuation 
  : '\\' LineTerminator
  ;

fragment EscapeSequence 
  : CharacterEscapeSequence
  | '0'
  // | HexEscapeSequence
  ;

fragment CharacterEscapeSequence 
  : SingleEscapeCharacter
  | NonEscapeCharacter
  ;

fragment SingleEscapeCharacter 
  : '\'' 
  | '"' 
  | '\\' 
  | 'b' 
  | 'f' 
  | 'n' 
  | 'r' 
  | 't' 
  | 'v' 
  ;

fragment NonEscapeCharacter 
  : ~[\'"\\bfnrtv\n]
  ;

fragment EscapeCharacter 
  : SingleEscapeCharacter 
  | DecimalDigit
  | 'x'
  ;

fragment HexEscapeSequence 
  : 'x' HexDigit HexDigit
  ;

fragment TRUE: 'true';
fragment FALSE: 'false';

// lexer rules
//   keywords must appear before IDENTIFIER

NUMERIC_LITERAL 
  : DecimalLiteral
  | HexIntegerLiteral
  ;

BOOLEAN_LITERAL 
  : TRUE 
  | FALSE
  ;

STRING_LITERAL 
  : '"' DoubleStringCharacters* '"'
  | '\'' SingleStringCharacters* '\''
  ;

NULL_LITERAL 
  : 'null'
  ;

LPAREN : [(];
RPAREN : [)];
SEMICOLON : [;];
COLON : [:];
EQUAL : [=];
PLUS : [+];
MINUS : [-];
ASTERISK : [*];
DASH : [/];
COMMA : [,];

DOUBLE_EQUAL : [=][=];
LESS : [<];
GREATER : [>];
NOT : [!];
NOT_EQUAL : [!][=];

// keywords start here
PRINT : 'print';
VAR : 'var';

IDENTIFIER : IdentifierCharacters;

// skip whitespace and comments
WhiteSpace : SpaceTokens+ -> skip;

