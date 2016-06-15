package observer;

public class NegativeObserver extends ExpressionObserver {

  public NegativeObserver(ExpressionSubject expressionSub) {
    super(expressionSub);
  }

  public void update() {
    try {
      Double value = expressionSub.getState().operation();
      if (value < 0)
        System.out.println("O valor da expressão é negativo: "+value);
    }
    catch (Exception e) {
      System.out.println(e);
    }
  }
}
