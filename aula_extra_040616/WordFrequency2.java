import java.util.*;
import java.util.Map.Entry;

public abstract class WordFrequency2 {

  private static TreeMap<String, Integer> wordsMap = new TreeMap<String, Integer>();

  public static void orderedFrequency(String text[]) {

    WordComparator comparator = new WordComparator();

    wordsMap = new TreeMap<String, Integer>(comparator);
    wordsMap.putAll(CountWords.frequency(text));

    for (Entry<String, Integer> entry : wordsMap.entrySet())
      System.out.printf("%s %d\n", entry.getKey(), entry.getValue());

  }

  public static void main(String args[]){
    WordFrequency2.orderedFrequency(args);

  }
}
