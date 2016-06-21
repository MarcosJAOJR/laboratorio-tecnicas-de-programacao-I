import java.util.Comparator;
import java.util.Map;

public class WordValueComparator implements Comparator<String> {

  Map<String, Integer> base;

  public WordValueComparator(Map<String, Integer> base) {
    this.base = base;
  }

  public int compare(String word1, String word2) {
    if (base.get(word1) >= base.get(word2)) {
      return -1;
    } else {
      return 1;
    }
  }
}
