public abstract class ExpressionComponent {

  String symbolExpression;

  public String print() throws Exception {
    System.out.println(this.symbolExpression);
  }

  public float execute(float val1, float val2) throws Exception{
    return val1
  }

  public void add(ExpressionComponent newExpression) throws Exception{
    throw new Exception("Não pode adicionar expressão em: " + this.symbolExpression);
  }

  public void remove(String symbolExpression) throws Exception{
    throw new Exception("Não pode remover expressão em: " + this.symbolExpression);
  }

  public ExpressionComponent getExpression(String symbolExpression) throws Exception{
    throw new Exception("Não pode pesquisar expressões em: " + this.symbolExpression);
  }

}
