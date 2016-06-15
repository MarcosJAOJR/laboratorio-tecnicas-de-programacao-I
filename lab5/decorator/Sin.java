package decorator;

import composite.*;

public class Sin extends ExpressionDecorator {

  public Sin(Expression pExpression) {
    super(pExpression);
  }

  public Double execute(Double param) {
    return Math.sin(param);
  }

}
