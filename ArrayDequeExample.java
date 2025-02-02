import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        // Create an ArrayDeque of integers
        Deque<Integer> deque = new ArrayDeque<>();

        // Adding elements to the deque
        // deque.add(12); // equivalent to addLast
        deque.addFirst(10); // [10]
        deque.addLast(20); // [10, 20]
        deque.offerFirst(5); // [5, 10, 20]
        deque.offerLast(25); // [5, 10, 20, 25]

        // Viewing the first and last elements
        System.out.println("First element: " + deque.getFirst()); // 5
        System.out.println("Last element: " + deque.getLast()); // 25

        // Peeking at the first and last elements
        System.out.println("Peek first element: " + deque.peekFirst()); // 5
        System.out.println("Peek last element: " + deque.peekLast()); // 25

        // Removing elements from the deque
        // deque.remove(); // equivalent to removeFirst
        System.out.println("Removed first element: " + deque.removeFirst()); // 5
        System.out.println("Removed last element: " + deque.removeLast()); // 25
        System.out.println("Polled first element: " + deque.pollFirst()); // 10
        System.out.println("Polled last element: " + deque.pollLast()); // 20

        // Adding elements again for demonstration
        deque.addFirst(15); // [15]
        deque.addLast(30); // [15, 30]
        deque.addFirst(25); // [25, 15, 30]
        deque.addLast(35); // [25, 15, 30, 35]

        // Checking and removing specific elements
        System.out.println("Removed first occurrence of 15: " + deque.removeFirstOccurrence(15)); // true
        System.out.println("Removed last occurrence of 35: " + deque.removeLastOccurrence(35)); // true

        // Checking if the deque is empty
        System.out.println("Is deque empty? " + deque.isEmpty()); // false

        // Traversing the deque
        System.out.println("Deque elements:");
        for (Integer number : deque) {
            System.out.println(number);
        }

        Deque<Pair<Integer, String>> pairs = new ArrayDeque<>();

        // Adding elements to the deque
        pairs.addFirst(new Pair<>(10, "Ten"));
        pairs.addLast(new Pair<>(20, "Twenty"));
        pairs.offerFirst(new Pair<>(5, "Five"));
        pairs.offerLast(new Pair<>(25, "Twenty-Five"));

        // Viewing the first and last elements
        System.out.println("First element: " + pairs.getFirst()); // (5, Five)
        System.out.println("Last element: " + pairs.getLast()); // (25, Twenty-Five)

        // Peeking at the first and last elements
        System.out.println("Peek first element: " + pairs.peekFirst()); // (5, Five)
        System.out.println("Peek last element: " + pairs.peekLast()); // (25, Twenty-Five)

        // Removing elements from the pairs
        System.out.println("Removed first element: " + pairs.removeFirst()); // (5, Five)
        System.out.println("Removed last element: " + pairs.removeLast()); // (25, Twenty-Five)
        System.out.println("Polled first element: " + pairs.pollFirst()); // (10, Ten)
        System.out.println("Polled last element: " + pairs.pollLast()); // (20, Twenty)

        // Adding elements again for demonstration
        pairs.addFirst(new Pair<>(15, "Fifteen"));
        pairs.addLast(new Pair<>(30, "Thirty"));
        pairs.addFirst(new Pair<>(25, "Twenty-Five"));
        pairs.addLast(new Pair<>(35, "Thirty-Five"));

        // Checking if the pairs is empty
        System.out.println("Is pairs deque empty? " + pairs.isEmpty()); // false

        // Traversing the pairs
        System.out.println("Deque elements:");
        for (Pair<Integer, String> pair : pairs) {
            System.out.println(pair);
        }
    }
}