import java.util.Comparator;

public class WordComparator implements Comparator<String> {
    public int compare(String word1, String word2) {
        return word1.compareTo(word2);
    }
}
