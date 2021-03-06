import java.util.*;
import java.util.Map.Entry;

public abstract class WordFrequency2 {

  private static TreeMap<String, Integer> wordsMap = new TreeMap<String, Integer>();

  public static void orderedFrequency(String text[]) {

    WordComparator comparator = new WordComparator();

    wordsMap = new TreeMap<String, Integer>(comparator);
    wordsMap.putAll(WordFrequency.frequency(text));

    for (Entry<String, Integer> entry : wordsMap.entrySet())
      System.out.printf("%s %d\n", entry.getKey(), entry.getValue());

  }

  public static void main(String args[]){
    System.out.println("Entre um texto");
    Scanner entrada = new Scanner(System.in);
    WordFrequency2.orderedFrequency(entrada.nextLine().trim().split(" "));

  }
}
