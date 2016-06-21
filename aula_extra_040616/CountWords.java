import java.util.*;

public abstract class CountWords {

  private static HashSet<String> wordsSet = new HashSet<String>();

  public static void count(String[] arr) {
    System.out.println("Total de Palavras: " + arr.length);
    for (String palavra : arr) {
      wordsSet.add(palavra);
    }
    System.out.println("Total de Palavras Distintas: " + wordsSet.size());
  }

  public static void main(String[] args) {

    System.out.println("Entre um texto");
    Scanner entrada = new Scanner(System.in);
    CountWords.count(entrada.nextLine().trim().split(" "));

  }
}
