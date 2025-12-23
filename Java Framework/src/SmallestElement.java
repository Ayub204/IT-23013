import java.util.ArrayList;
import java.util.Collections;

/*
 * Program: Find k-th smallest element from ArrayList
 * Concept: Collection + Sorting
 */
public class SmallestElement {

    public static void main(String[] args) {

        // Handwritten-style data initialization
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(19);

        int k = 3; // k-th smallest element

        // Sorting the ArrayList
        Collections.sort(list);

        // Index = k-1 because index starts from 0
        System.out.println("K-th Smallest Element: " + list.get(k - 1));
    }
}
