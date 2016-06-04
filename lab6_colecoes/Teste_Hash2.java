import java.util.Collection;

public abstract class Teste_Hash2 {

  public static void listar(Collection param) {
    System.out.println(param);
  }

  static void listar2(Collection c) {
    System.out.println("*** Listar 2 ****");
    for (Object o : c)
      System.out.println(o);
  }
}
