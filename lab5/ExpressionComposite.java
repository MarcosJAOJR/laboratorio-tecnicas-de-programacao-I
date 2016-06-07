public class ExpressionComposite extends ExpressionComponent {

  ExpressionComponent expression1,
                      expression2;

  public String print() {
    return this.expression1.print() + this.expression2.print();
  }

  public float execute(){
    return this.expression1.execute() + this.expression2.execute();
  }
}
