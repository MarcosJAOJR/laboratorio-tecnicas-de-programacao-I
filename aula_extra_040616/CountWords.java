import java.util.*;

public abstract class CountWords {

  private static TreeMap<String, Integer> wordsMap = new TreeMap<String, Integer>();

  public static void count(String text) {
        String[] arr = text.split(" ");
  }

  public static TreeMap<String, Integer> frequency(String text[]) {

    for (String item : text) {
      int value = 0;

      if (wordsMap.get(item) != null) {
        value = wordsMap.get(item);
      }

      wordsMap.put(item, ++value);
    }

    return wordsMap;
  }

  public static void main(String args[]){
    System.out.println(CountWords.frequency(args));

  }

}
