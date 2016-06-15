import composite.*;
import decorator.*;

public class MainDecorator {

  public static void main(String[] args) {

    try {
      // Expression -> sin(cos(34/(1*((4*5)/23))))
      ExpressionComposite m1 = new ExpressionComposite("*");
      m1.add(new Leaf(4.0d));
      m1.add(new Leaf(5.0d));

      ExpressionComposite d1 = new ExpressionComposite("/");
      d1.add(m1);
      d1.add(new Leaf(23.0d));

      ExpressionComposite m2 = new ExpressionComposite("*");
      m2.add(new Leaf(1.0d));
      m2.add(d1);

      ExpressionComposite d2 = new ExpressionComposite("/");
      d2.add(new Leaf(34.0d));
      d2.add(m2);

      Expression expression = new Cos(d2);

      expression = new Sin(expression);

      System.out.println(expression.operation());
    }
    catch (Exception e) {
      System.out.println(e);
    }
  }
}
