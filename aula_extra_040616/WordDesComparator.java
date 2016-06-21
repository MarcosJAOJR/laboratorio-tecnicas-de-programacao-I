import java.util.Comparator;

public class WordDesComparator implements Comparator<String> {
    public int compare(String word1, String word2) {
        return (-1)*word1.compareTo(word2);
    }
}
