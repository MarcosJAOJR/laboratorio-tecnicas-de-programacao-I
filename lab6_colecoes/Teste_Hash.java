import java.util.*;

class Teste_Hash {
  public static void main(String args[]){
    // Set<String> mesesHash = new HashSet<>();
    // Set<String> mesesHash = new TreeSet<>();
    Set<String> mesesHash = new TreeSet<>();

    mesesHash.add("Janeiro");
    mesesHash.add("Fevereiro");
    mesesHash.add("Março");
    mesesHash.add("Abril");
    mesesHash.add("Maio");
    mesesHash.add("Fevereiro");
    System.out.println("TreeSet:");
    System.out.println(mesesHash);

	Set<String> mesesHash2 = new LinkedHashSet<>();

    mesesHash2.add("Janeiro");
	mesesHash2.add("Fevereiro");
	mesesHash2.add("Março");
	mesesHash2.add("Abril");
	mesesHash2.add("Maio");
	mesesHash2.add("Fevereiro");
	System.out.println("LinkedHashSet:");


    Teste_Hash2.listar(mesesHash2);
    Teste_Hash2.listar2(mesesHash);

  }
}
