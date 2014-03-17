<head>
<title> AST for my_phase2/block.ts</title>
</head>
<body>
<pre>
Program
  Var x
  ExpressionStatement
    ASSIGN
      Identifier x
      NumericLiteral 10.0
  ExpressionStatement
    ASSIGN
      Identifier x
      ADD
        Identifier x
        NumericLiteral 1.0
  BlockStatement
  PrintStatement
    Identifier x
</pre>
