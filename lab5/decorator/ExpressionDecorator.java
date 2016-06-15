package decorator;

import composite.*;

public abstract class ExpressionDecorator extends Expression {

  protected Expression expression;

  ExpressionDecorator(Expression pExpression) {
    this.expression = pExpression;
  }

  public Double execute(Double param) throws Exception {
    throw new Exception("Essa classe não implementa execute");
  }

  public Double operation() throws Exception {
    return execute(this.expression.operation());
  }

}
