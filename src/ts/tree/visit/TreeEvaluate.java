
package ts.tree.visit;

import ts.Message;
import ts.tree.*;
import ts.support.*;

import java.util.List;
import java.util.ArrayList;

/**
 * Evaluate an AST. Parameterized by the "completion" type.
 * <p>
 * The "visit" method is overloaded for every tree node type.
 *
 */
public final class TreeEvaluate extends TreeVisitorBase<TSCompletion>
{
  // this is a declarative environment for now
  // TODO: change to an environment for the global object
  private TSLexicalEnvironment environment;
  private TSLexicalEnvironment globalEnvironment;

  public TreeEvaluate()
  {
   // TSEnvironmentRecord.global = TSLexicalEnvironment.newObjectEnvironment(null);
    globalEnvironment = TSLexicalEnvironment.newObjectEnvironment(
      TSEnvironmentRecord.global, null);
    environment = TSLexicalEnvironment.newDeclarativeEnvironment(globalEnvironment);

    labelStack.push("");
  }

  public TreeEvaluate(TSLexicalEnvironment env)
  {
    environment = env;

    labelStack.push("");
  }

  // visit a list of ASTs and evaluate them in order
  // use wildcard for generality: list of Statements, list of Expressions, etc
  // an array must be returned but this will always return an array of size 1
  public List<TSCompletion> visitEach(final Iterable<?> nodes)
  {
    List<TSCompletion> ret = new ArrayList<TSCompletion>();

    for (final Object node : nodes)
    {
      TSCompletion completion = visitNode((Tree) node);
      if (!completion.isNormal())
      {
        ret.add(completion);
        return ret;
      } 
    }
    ret.add(TSCompletion.createNormalNull());
    return ret;
  }

  // Unary Operator
  // ----------------------------------------------------------------
  public TSCompletion visit(final UnaryOperator unaryOperator)
  {
    TSCompletion left = visitNode(unaryOperator.getLeft());
    if (!left.isNormal())
    {
      return left;
    }

    Message.setLocation(unaryOperator.getLoc());
    if (unaryOperator.getOp() == Uop.NOT) 
    {
      left.setValue(left.getValue().not());
    }
    else if (unaryOperator.getOp() == Uop.MINUS)
    {
      left.setValue(left.getValue().unaryMinus());
    }
    else {
      assert false : "unexpected unary operator";
    }
    return left;
  }

  // Binary Operator 
  // ----------------------------------------------------------------
  public TSCompletion visit(final BinaryOperator binaryOperator)
  {
    TSCompletion left = visitNode(binaryOperator.getLeft());
    if (!left.isNormal())
    {
      return left;
    } 
    TSCompletion right = visitNode(binaryOperator.getRight());
    if (!right.isNormal())
    {
      return right;
    } 
    Message.setLocation(binaryOperator.getLoc());
    if (binaryOperator.getOp() == Binop.ADD)
    {
      left.setValue(left.getValue().add(right.getValue()));
    }
    else if (binaryOperator.getOp() == Binop.SUBTRACT)
    {
      left.setValue(left.getValue().subtract(right.getValue()));
    }
    else if (binaryOperator.getOp() == Binop.MULTIPLY)
    {
      left.setValue(left.getValue().multiply(right.getValue()));
    }
    else if (binaryOperator.getOp() == Binop.DIVIDE)
    {
      left.setValue(left.getValue().divide(right.getValue()));
    }
    else if (binaryOperator.getOp() == Binop.ASSIGN)
    {
      left.setValue(left.getValue().simpleAssignment(right.getValue()));
    }
    else if (binaryOperator.getOp() == Binop.EQUAL) 
    {
      left.setValue(left.getValue().isEqual(right.getValue()));
    }
    else if (binaryOperator.getOp() == Binop.LESS)
    {
      left.setValue(left.getValue().isLess(right.getValue()));
    }
    else if (binaryOperator.getOp() == Binop.GREATER) 
    {
      left.setValue(left.getValue().isGreater(right.getValue()));
    }
    else
    {
      assert false : "unexpected binary operator";
    }
    return left;
  }

  // Expression Statement
  // ----------------------------------------------------------------
  public TSCompletion visit(final ExpressionStatement expressionStatement)
  {
    TSCompletion completion = visitNode(expressionStatement.getExp());
    return completion;
  }

  // Identifier
  // ----------------------------------------------------------------
  public TSCompletion visit(final Identifier identifier)
  {
    return TSCompletion.createNormal(environment.getIdentifierReference(
      TSString.create(identifier.getName())));
  }

  // Numeric Literal
  // ----------------------------------------------------------------
  public TSCompletion visit(final NumericLiteral numericLiteral)
  {
    return TSCompletion.createNormal(TSNumber.create(
      numericLiteral.getValue()));
  }

  // Print Statement
  // ----------------------------------------------------------------
  public TSCompletion visit(final PrintStatement printStatement)
  {
    TSCompletion result = visitNode(printStatement.getExp());
    if (!result.isNormal())
    {
      return result;
    } 
    System.out.println(result.getValue().toStr().getInternal());
    return TSCompletion.createNormalNull();
  }

  // Variable Statement
  // ----------------------------------------------------------------
  public TSCompletion visit(final VarStatement varStatement)
  {
    // do not make it a configurable binding so it is not deletable
    environment.declareVariable(TSString.create(varStatement.getName()), false);
    return TSCompletion.createNormalNull();
  }

  // Boolean Literal
  // ----------------------------------------------------------------
  public TSCompletion visit(final BooleanLiteral booleanLiteral) 
  {
    return TSCompletion.createNormal(TSBoolean.create(booleanLiteral.getValue()));
  }

  // String Literal
  // ----------------------------------------------------------------
  public TSCompletion visit(final StringLiteral stringLiteral) 
  {
    return TSCompletion.createNormal(TSString.create(stringLiteral.getValue()));
  }

  // Null Literal 
  // ----------------------------------------------------------------
  public TSCompletion visit(final NullLiteral nullLiteral)
  {
    return TSCompletion.createNormal(TSNull.create(nullLiteral.getValue()));
  }

  // Block Statement
  // ----------------------------------------------------------------
  public TSCompletion visit(final BlockStatement blockStatement)
  {
    // Block : {}
    if (blockStatement.getStatement() == null)
      return TSCompletion.create(TSCompletionType.Normal, null, null);

    // StatementList : Statement
    if (blockStatement.getStatements() == null)
    {
      TSCompletion s = visitNode(blockStatement.getStatement());
      if (s.getType() == TSCompletionType.Throw)
        return s;

      return s;
    }

    // StatementList : StatementList Statement
    List<TSCompletion> slList = visitEach(blockStatement.getStatements());
    TSCompletion sl = slList.get(slList.size()-1);

    // If sl is an abrupt completion, return sl
    if (!sl.isNormal()) {
      if (sl.getType() == TSCompletionType.Continue) {
        String target = (sl.getTarget() == null) ? "" : sl.getTarget().toStr().getInternal();
        
        if (!target.equals("") && labelStack.contains(target)) {
          labelStack.pop();
          return TSCompletion.create(TSCompletionType.Continue, sl.getValue(), TSString.create(target));
        }
        return TSCompletion.createNormal(sl.getValue()); 
      }
        return sl;
    }

    // Let s be the result of evaluating Statement
    TSCompletion s = visitNode(blockStatement.getStatement());
    TSValue v = null;
    
    // check exceptions
    if (s.getType() == TSCompletionType.Throw)
      return s;

    // If s.value is empty, let v = sl.value, otherwise let v = s.value
    if (s.getValue() == null) {
      v = sl.getValue();
    } else {
      v = s.getValue();
    }

    // Return (s.type, v, s.target)
    TSString target = (s.getTarget() == null) ? null : s.getTarget().toStr();
    TSCompletion ret = TSCompletion.create(s.getType(), v, target);
    return ret;
  }

  // While Statement
  // ----------------------------------------------------------------
  public TSCompletion visit(final WhileStatement whileStatement) 
  {
    TSValue v = null;
    //String curLabel = labelStack.peek();

    while (true) {

      // a. Let exprRef be the result of evaluating Expression
      TSCompletion exprRef = visitNode(whileStatement.getExpression());
      
      // b. If ToBoolean(exprRef) is false, return (normal, V, empty)
      if (exprRef.getValue().toBoolean().getInternal() == false) 
        return TSCompletion.createNormal(v);

      // c. Let stmt be the result of evaluating Statement      
      TSCompletion stmt = visitNode(whileStatement.getStatement());

      // d. If stmt.value is not empty, let V = stmt.value      
      if (stmt.getValue() != null) 
        v = stmt.getValue();

      String target = (stmt.getTarget() == null) ? "" : stmt.getTarget().toStr().getInternal();

      // e. 
      if (stmt.getType() != TSCompletionType.Continue ||
          !labelStack.contains(target))
      {
        if (stmt.getType() == TSCompletionType.Break)
        {
          if (target.equals(""))
            return TSCompletion.createNormal(v);
          if (labelStack.contains(target)) 
            return TSCompletion.create(TSCompletionType.Break, v, TSString.create(target));
        }
        
        if (!stmt.isNormal()) {
          return stmt;
        }
      }
    }
  }

  // Break Statement
  // ----------------------------------------------------------------
  public TSCompletion visit(final BreakStatement breakStatement)
  {
    if (breakStatement.getName() == null)
    {
      return TSCompletion.create(TSCompletionType.Break, 
        null, 
        null);
    }
    return TSCompletion.create(TSCompletionType.Break, 
      null, 
      TSString.create(breakStatement.getName()));
  }

  // Continue Statement
  // ----------------------------------------------------------------
  public TSCompletion visit(final ContinueStatement continueStatement)
  {
    if (continueStatement.getName() == null)
    {
      return TSCompletion.create(TSCompletionType.Continue, 
        null, 
        null);
    }

    return TSCompletion.create(TSCompletionType.Continue, 
      null, 
      TSString.create(continueStatement.getName()));
  }

  // Labelled Statement
  // ----------------------------------------------------------------
  public TSCompletion visit(final LabelledStatement labelledStatement)
  {
    labelStack.push(labelledStatement.getName());
    TSCompletion stmt = visitNode(labelledStatement.getStatement());  
    String curLabel = (labelStack.size() == 1) ? "" : labelStack.pop();

    if (stmt.getType() == TSCompletionType.Break  && 
        stmt.getTarget() != null &&
        stmt.getTarget().toStr().getInternal().equals(labelledStatement.getName())) 
    {
      return TSCompletion.createNormal(stmt.getValue());
    }

    return stmt;
  }

  // If Statement
  // ----------------------------------------------------------------
  public TSCompletion visit(final IfStatement ifStatement)
  {
    Expression expr = ifStatement.getExpression();
    Statement s1    = ifStatement.getStatement1();
    Statement s2    = ifStatement.getStatement2();

    TSCompletion exprRef = visitNode(expr);

    if (s2 != null) 
    {
      if (exprRef.getValue().toBoolean().getInternal() == true)
      {
        return visitNode(s1);
      }
      else 
      {
        return visitNode(s2);
      }
    }

    else 
    {
      if (exprRef.getValue().toBoolean().getInternal() == false)
      {
        return TSCompletion.createNormalNull();
      }
      return visitNode(s1);
    }
  }

  // Empty Statement
  // ----------------------------------------------------------------
  public TSCompletion visit(final EmptyStatement emptyStatement) 
  {
      return TSCompletion.createNormalNull();
  }

  // Throw Statement
  // ----------------------------------------------------------------
  public TSCompletion visit(final ThrowStatement throwStatement)
  {
    Message.setLocation(throwStatement.getLoc());
    TSCompletion exprRef = visitNode(throwStatement.getExpression());
    return TSCompletion.create(TSCompletionType.Throw, exprRef.getValue(), null);
  }

  // Try Statement
  // ----------------------------------------------------------------
  public TSCompletion visit(final TryStatement tryStatement)
  {
    TSCompletion b, c, f;
    Statement  block = tryStatement.getStatement();
    CatchClause catchClause   = tryStatement.getCatchClause();
    Expression finallyClause = tryStatement.getFinallyClause();

    if (catchClause != null && finallyClause == null)
    {
      b = visitNode(block);

      if (b.getType() != TSCompletionType.Throw)
        return b;

      catchClause.passParameter(b.getValue());
      return visitNode(catchClause);
    }

    if (catchClause == null && finallyClause != null)
    {
      b = visitNode(block);
      f = visitNode(finallyClause);
      if (f.getType() == TSCompletionType.Normal)
        return b;
      return f;
    }

    b = visitNode(block);
    
    if (b.getType() == TSCompletionType.Throw)
    {
      catchClause.passParameter(b.getValue());
      c = visitNode(catchClause);
    } 
    else {
      c = b;
    }

    f = visitNode(finallyClause);
    if (f.getType() == TSCompletionType.Normal)
      return c;
    return f;
  }

  // Catch Clause
  // ----------------------------------------------------------------
  public TSCompletion visit(final CatchClause catchClause)
  {
    TSString name   = TSString.create(catchClause.getName());
    Statement block = catchClause.getStatement();
    TSValue c       = catchClause.getParam();

    TSLexicalEnvironment oldEnv   = this.environment;
    TSLexicalEnvironment catchEnv = TSLexicalEnvironment.newDeclarativeEnvironment(oldEnv);

    //catchEnv.createMutableBinding(name);
    //catchEnv.setMutableBinding(name, c);
    catchEnv.declareParameter(name.getInternal(), c);

    this.environment = catchEnv;
    TSCompletion b = visitNode(block);
    this.environment = oldEnv;
    return b;
  }

  // Finally Clause
  // ----------------------------------------------------------------
  public TSCompletion visit(final FinallyClause finallyClause)
  {
    return visitNode(finallyClause.getStatement());
  }


  // Function Call
  // ----------------------------------------------------------------
  public TSCompletion visit(final FunctionCall functionCall)
  {
    TSCompletion ref = visitNode(functionCall.getExpression());
    TSValue func = ref.getValue();
    TSString typeError = TSString.create("TypeError");

    if (!(func instanceof TSObject) || !func.isCallable()) 
    {
      Message.setLocation(functionCall.getLoc());
      return TSCompletion.create(TSCompletionType.Throw, typeError, null);
    }
   
    return func.getValue().call();
  }

  // Function Expression
  // ----------------------------------------------------------------
  public TSCompletion visit(final FunctionExpression functionExpression)
  {
    String name = functionExpression.getName();
    List<Statement> body = functionExpression.getBody();

    if (name == null)
      return TSCompletion.createNormal(TSFunctionObject.create(name, body, this.environment));

    TSLexicalEnvironment funcEnv = TSLexicalEnvironment.newDeclarativeEnvironment(this.environment);
    
    funcEnv.createImmutableBinding(name);
    TSFunctionObject closure = TSFunctionObject.create(name, body, funcEnv);
    funcEnv.initializeImmutableBinding(name, closure);

    return TSCompletion.createNormal(closure);
  }

  //  Return Statement
  // ----------------------------------------------------------------
  public TSCompletion visit(final ReturnStatement returnStatement)
  {
    Expression exp = returnStatement.getExpression();
    if (exp == null)
      return TSCompletion.create(TSCompletionType.Return, TSUndefined.value, null);

    TSCompletion expRef = visitNode(exp);
    return TSCompletion.create(TSCompletionType.Return, expRef.getValue(), null);
  }

  //  New Expression
  // ----------------------------------------------------------------
  public TSCompletion visit(final NewExpression newExpression)
  {
    TSValue ref = visitNode(newExpression.getExpression()).getValue();
    TSValue constructor = ref.getValue();

    /*
    if (!(constructor instanceof TSObject)) {
      TSString typeError = TSString.create("TypeError");
      Message.setLocation(newExpression.getLoc());
      return TSCompletion.create(TSCompletionType.Throw, typeError, null);
    }
    */

    if (constructor instanceof TSObject) {    
      TSValue prototype = ((TSObject) constructor).getProperty(TSString.create("prototype"));
      if (prototype instanceof TSObject)
        return TSCompletion.createNormal(TSObject.create((TSObject) prototype));
    }
    return TSCompletion.createNormal(TSObject.create());
  }

  // Property Accessor
  // ----------------------------------------------------------------
  public TSCompletion visit(final PropertyAccessor propertyAccessor)
  {
    TSValue baseRef = visitNode(propertyAccessor.getExpression()).getValue();
    TSValue baseValue = baseRef.getValue();
    TSString propertyName = TSString.create(propertyAccessor.getName());

    if (!(baseValue instanceof TSObject)) {
      TSString typeError = TSString.create("TypeError");
      Message.setLocation(propertyAccessor.getLoc());
      return TSCompletion.create(TSCompletionType.Throw, typeError, null);
    }

    TSPropertyReference reference = new TSPropertyReference(propertyName, baseValue);

    return TSCompletion.createNormal(reference);
  }
}

