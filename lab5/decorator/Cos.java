package decorator;

import composite.*;

public class Cos extends ExpressionDecorator {

  public Cos(Expression pExpression) {
    super(pExpression);
  }

  public Double execute(Double param) {
    return Math.cos(param);
  }

}
