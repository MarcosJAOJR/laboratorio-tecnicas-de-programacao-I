import java.util.*;
import java.util.Map.Entry;

public abstract class WordFrequency4 {

  private static TreeMap<String, Integer> wordsMap = new TreeMap<String, Integer>();

  public static void orderedFrequency(String text[]) {

    wordsMap.putAll(WordFrequency.frequency(text));

    WordValueComparator comparator = new WordValueComparator(wordsMap);
    TreeMap<String, Integer> sorted = new TreeMap<String, Integer>(comparator);
    sorted.putAll(wordsMap);

    for (Entry<String, Integer> entry : sorted.entrySet())
      System.out.printf("%s %d\n", entry.getKey(), entry.getValue());

  }

  public static void main(String args[]){
    System.out.println("Entre um texto");
    Scanner entrada = new Scanner(System.in);
    WordFrequency4.orderedFrequency(entrada.nextLine().trim().split(" "));

  }
}
