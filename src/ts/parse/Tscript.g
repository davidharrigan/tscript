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
    { $sl.lval.add($s.lval);
      $lval = $sl.lval; }
  ;

statement
  returns [ Statement lval ]
  : v=varStatement
    { $lval = $v.lval; }
  | e=expressionStatement
    { $lval = $e.lval; }
  | p=printStatement
    { $lval = $p.lval; }
  ;

varStatement
  returns [ Statement lval ]
  : VAR IDENTIFIER SEMICOLON
    { $lval = buildVarStatement(loc($start), $IDENTIFIER.text); }
  ;

expressionStatement
  returns [ Statement lval ]
  : e=expression SEMICOLON
    { $lval = buildExpressionStatement(loc($start), $e.lval); }
  ;

printStatement
  returns [ Statement lval ]
  : PRINT e=expression SEMICOLON
    { $lval = buildPrintStatement(loc($start), $e.lval); }
  ;

expression
  returns [ Expression lval ]
  : a=assignmentExpression
    { $lval = $a.lval; }
  ;

assignmentExpression
  returns [ Expression lval ]
  : e=equalityExpression
    { $lval = $e.lval; }
  | l=leftHandSideExpression EQUAL r=assignmentExpression
    { checkAssignmentDestination(loc($start), $l.lval);
      $lval = buildBinaryOperator(loc($start), Binop.ASSIGN,
        $l.lval, $r.lval); }
  ;

leftHandSideExpression
  returns [ Expression lval ]
  : p=primaryExpression
    { $lval = $p.lval; }
  ;

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

multiplicativeExpression
  returns [ Expression lval ]
  : p=unaryExpression
    { $lval = $p.lval; }
  | l=multiplicativeExpression ASTERISK r=primaryExpression
    { $lval = buildBinaryOperator(loc($start), Binop.MULTIPLY,
      $l.lval, $r.lval); }
  | l=multiplicativeExpression DASH r=primaryExpression
    { $lval = buildBinaryOperator(loc($start), Binop.DIVIDE, 
      $l.lval, $r.lval); }
  ;

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

relationalExpression
  returns [ Expression lval ]
  : a=additiveExpression
    { $lval = $a.lval; }
  | l=relationalExpression LESS r=additiveExpression
    { $lval = buildBinaryOperator(loc($start), Binop.LESS, $l.lval, $r.lval); }
  | l=relationalExpression GREATER r=additiveExpression
    { $lval = buildBinaryOperator(loc($start), Binop.GREATER, $l.lval, $r.lval); }
  ;

equalityExpression
  returns [ Expression lval ]
  : re=relationalExpression
    { $lval = $re.lval; }
  | l=equalityExpression DOUBLE_EQUAL r=relationalExpression
    { $lval = buildBinaryOperator(loc($start), Binop.EQUAL, $l.lval, $r.lval); }
  ;

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
  : DecimalDigit
  | ('+' | '-') DecimalDigit
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
  : ~["\\\n]
  | '\\' EscapeSequence
  ;

fragment SingleStringCharacter 
  : ~['\\\n']
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
  : 'SingleEscapeCharacter'
  | 'NonEscapeCharacter'
  ;

fragment SingleEscapeCharacter 
  :  '\'' 
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
 // | DecimalDigit
  | 'x'
  | 'u'
  ;

//fragment HexEscapeSequence 
// : 'x' HexDigit HexDigit
// ;

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
EQUAL : [=];
PLUS : [+];
MINUS : [-];
ASTERISK : [*];
DASH : [/];

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

