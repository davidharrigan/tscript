
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

  public TreeEvaluate()
  {
    environment = TSLexicalEnvironment.newDeclarativeEnvironment(null);
    environment.declareVariable(TSString.create("undefined"), false);
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

  public TSCompletion visit(final ExpressionStatement expressionStatement)
  {
    TSCompletion completion = visitNode(expressionStatement.getExp());
    return completion;
  }

  public TSCompletion visit(final Identifier identifier)
  {
    return TSCompletion.createNormal(environment.getIdentifierReference(
      TSString.create(identifier.getName())));
  }

  public TSCompletion visit(final NumericLiteral numericLiteral)
  {
    return TSCompletion.createNormal(TSNumber.create(
      numericLiteral.getValue()));
  }

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

  public TSCompletion visit(final VarStatement varStatement)
  {
    // do not make it a configurable binding so it is not deletable
    environment.declareVariable(TSString.create(varStatement.getName()), false);
    return TSCompletion.createNormalNull();
  }

  public TSCompletion visit(final BooleanLiteral booleanLiteral) 
  {
    return TSCompletion.createNormal(TSBoolean.create(booleanLiteral.getValue()));
  }

  public TSCompletion visit(final StringLiteral stringLiteral) 
  {
    return TSCompletion.createNormal(TSString.create(stringLiteral.getValue()));
  }

  public TSCompletion visit(final NullLiteral nullLiteral)
  {
    return TSCompletion.createNormal(TSNull.create(nullLiteral.getValue()));
  }

  public TSCompletion visit(final BlockStatement blockStatement)
  {
    List<TSCompletion> ret; 
    if (blockStatement.getStatements() == null)
      return TSCompletion.create(TSCompletionType.Normal, null, null);
    else 
        ret = visitEach(blockStatement.getStatements());
      return ret.get(ret.size() - 1);
  }

  public TSCompletion visit(final WhileStatement whileStatement) 
  {
    TSValue v = null;
    while (true) {
      TSCompletion exprRef = visitNode(whileStatement.getExpression());
      if (exprRef.getValue().toBoolean().getInternal() == false) 
      {
        return TSCompletion.createNormal(v);
      }
      
      List<Statement> stmts = whileStatement.getStatements();
      TSCompletion stmt = visitNode(stmts.get(stmts.size()-1));
      
      if (stmt.getValue() != null) 
      {
        v = stmt.getValue();
      }

      
      if (!stmt.getType().equals(TSCompletionType.Continue) ||
          !stmt.getTarget().toStr().getInternal().equals(labelStack.peek().getName()))
      {
        if (labelStack.size() > 0) {
          System.out.println("cur label : " + labelStack.peek().getName());
        }
                  System.out.println("cur type  : " + stmt.getType().toString());

        if (stmt.getType() == TSCompletionType.Break &&
            stmt.getTarget().toStr().getInternal().equals(labelStack.peek().getName())) {//&& something about label)
          System.out.println("Label is : " + labelStack.peek().getName());
          return TSCompletion.createNormal(v);
        }
        
        if (stmt.getType() != TSCompletionType.Normal)        
          return stmt;
      }
      
    }
  }

  public TSCompletion visit(final BreakStatement breakStatement)
  {
    if (breakStatement.getName() == null)
    {
      return TSCompletion.createNormalNull();
    }
    return TSCompletion.create(TSCompletionType.Break, 
      null, 
      TSString.create(breakStatement.getName()));
  }

  public TSCompletion visit(final ContinueStatement continueStatement)
  {
    if (continueStatement.getName() == null)
    {
      return TSCompletion.createNormalNull();
    }
    return TSCompletion.create(TSCompletionType.Continue, 
      null, 
      TSString.create(continueStatement.getName()));
  }

  public TSCompletion visit(final LabelledStatement labelledStatement)
  {
    System.out.println(labelStack.peek().getName());
    TSCompletion stmt = visitNode(labelledStatement.getStatement());

    if (stmt.getType() == TSCompletionType.Break && 
        stmt.getTarget().toStr().getInternal().equals(labelledStatement.getName())) 
    {
      System.out.println("breakin");
      this.labelStack.pop();
      return TSCompletion.createNormal(stmt.getValue());
    }
    this.labelStack.pop();
    return TSCompletion.createNormalNull();
  }

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

  public TSCompletion visit(final EmptyStatement emptyStatement) 
  {
      return TSCompletion.createNormalNull();
  }
}

