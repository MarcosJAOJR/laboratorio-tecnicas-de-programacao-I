package composite;

public class ExpressionComposite extends Expression {

  private Expression child1;
  private Expression child2;

  private String operator;

  public ExpressionComposite(String pOperator) {
    this.operator = pOperator;
  }

  public Double operation() {
    switch (this.operator) {
      case "*":
        return this.child1.operation()*this.child2.operation();
      case "/":
        return this.child1.operation()/this.child2.operation();
      default:
        return null;
    }
  }

  public void add(Expression child) throws Exception {
    if (this.child1 == null)
      this.child1 = child;
    else if(child2 == null)
      this.child2 = child;
    else
      throw new Exception("Você não pode mais adicionar numeros");
  }

  public void remove(Expression child) {
    if(this.child1.operation() == child.operation())
      this.child1 = null;
    if (this.child2.operation() == child.operation())
      this.child2 = null;
  }

  public Expression getChild(int index) {
    switch (index) {
      case 1:
        return this.child1;
      case 2:
        return this.child2;
      default:
        return null;
    }
  }

}
