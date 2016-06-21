import java.util.*;

public class Teste_Colecoes {

  public static void main(String[] args) {

    String[] array = new String[]{"Marcos","José","Augusto","de","Oliveira","Júnior","Marcos"};

    // Original
		System.out.println("\nOriginal:\n");
		System.out.println(Arrays.toString(array));

    // HashSet
    System.out.println("\nHashSet:");
    HashSet<String> hashSet = new HashSet<String>();
    Colecoes colecoes = new Colecoes(hashSet, array);
    colecoes.verificar();

    // TreeSet
    System.out.println("\nTreeSet:");
    TreeSet<String> treeSet = new TreeSet<String>();
    colecoes = new Colecoes(treeSet, array);
    colecoes.verificar();

    // LinkedHashSet
    System.out.println("\nLinkedHashSet:");
    LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
    colecoes = new Colecoes(linkedHashSet, array);
    colecoes.verificar();

    // ArrayList
    System.out.println("\nArrayList:");
    ArrayList<String> arrayList = new ArrayList<String>();
    colecoes = new Colecoes(arrayList, array);
    colecoes.verificar();

  }
}
