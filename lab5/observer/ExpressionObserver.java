package observer;

public abstract class ExpressionObserver {

  protected ExpressionSubject expressionSub;

  public ExpressionObserver(ExpressionSubject expressionSub) {
    this.expressionSub = expressionSub;
  }

  public abstract void update();

}
