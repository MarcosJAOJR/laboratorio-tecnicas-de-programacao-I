package composite;

public abstract class Expression {

  Double value;

  public Double operation() throws Exception {
    return value;
  }

  public void add(Expression expression) throws Exception {
    throw new Exception("Não pode inserir uma expressão");
  }

  public void remove(Expression expression) throws Exception {
    throw new Exception("Não pode remover uma expressão");
  }

  public Expression getChild(int index) throws Exception {
    throw new Exception("Não pode buscar uma expressão");
  }

}
