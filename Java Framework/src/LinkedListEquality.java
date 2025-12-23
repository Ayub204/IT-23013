import java.util.LinkedList;

/*
 * Program: Check equality of two LinkedLists
 */
public class LinkedListEquality {

    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(1);
        list2.add(2);
        list2.add(3);

        // equals() method compares elements
        System.out.println("Are lists equal? " + list1.equals(list2));
    }
}
