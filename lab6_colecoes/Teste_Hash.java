import java.util.*;

class Teste_Hash {
  public static void main(String args[]){
    // Set<String> mesesHash = new HashSet<>();
    // Set<String> mesesHash = new TreeSet<>();
    Set<String> mesesHash = new LinkedHashSet<>();

    mesesHash.add("Janeiro");
    mesesHash.add("Fevereiro");
    mesesHash.add("Março");
    mesesHash.add("Abril");
    mesesHash.add("Maio");
    mesesHash.add("Fevereiro");
    System.out.println("HashSet:");
    // System.out.println(mesesHash);

    Teste_Hash2.listar(mesesHash);
    Teste_Hash2.listar2(mesesHash);

  }
}
