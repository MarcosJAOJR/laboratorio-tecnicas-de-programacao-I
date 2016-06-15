package observer;

public class PositiveObserver extends ExpressionObserver {

  public PositiveObserver(ExpressionSubject expressionSub) {
    super(expressionSub);
  }

  public void update() {
    try {
      Double value = expressionSub.getState().operation();
      if (value >= 0)
        System.out.println("O valor da expressão é positivo: " + value);
    }
    catch (Exception e) {
      System.out.println(e);
    }
  }
}
