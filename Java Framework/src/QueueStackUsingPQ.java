import java.util.PriorityQueue;
import java.util.Comparator;

/*
 * Program: Queue and Stack using PriorityQueue
 */
public class QueueStackUsingPQ {

    public static void main(String[] args) {

        // Queue (FIFO)
        PriorityQueue<Integer> queue =
                new PriorityQueue<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Queue Output: " + queue.poll());

        // Stack (LIFO) using reverse comparator
        PriorityQueue<Integer> stack =
                new PriorityQueue<>(Comparator.reverseOrder());

        stack.add(10);
        stack.add(20);
        stack.add(30);

        System.out.println("Stack Output: " + stack.poll());
    }
}
