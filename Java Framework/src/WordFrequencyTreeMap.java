import java.util.TreeMap;

/*
 * Program: Word Frequency Counter
 * Concept: TreeMap (Sorted Key)
 */
public class WordFrequencyTreeMap {

    public static void main(String[] args) {

        String text = "java is easy and java is powerful";

        String[] words = text.split(" ");

        TreeMap<String, Integer> map = new TreeMap<>();

        for (String word : words) {
            // Increase frequency if exists
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Frequencies:");
        System.out.println(map);
    }
}
