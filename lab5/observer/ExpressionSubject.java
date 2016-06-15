package observer;

import java.util.ArrayList;
import composite.*;

public class ExpressionSubject {

  protected ArrayList<ExpressionObserver> observers;
  protected Expression expression;

  public ExpressionSubject() {
    observers = new ArrayList<ExpressionObserver>();
  }

  public void attach(ExpressionObserver observer) {
    observers.add(observer);
  }

  public void dettach(int indice) {
    observers.remove(indice);
  }

  public void setState(Expression expression) {
    this.expression = expression;
    notifyObservers();
  }

  private void notifyObservers() {
    for (ExpressionObserver observer : observers) {
      observer.update();
    }
  }

  public Expression getState() {
    return expression;
  }

}
