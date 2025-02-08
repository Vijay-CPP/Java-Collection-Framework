import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    @SuppressWarnings("unused")

    public static void main(String[] args) {
        // Create a priority queue of integers
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements to the priority queue
        pq.offer(25);
        pq.offer(10);
        pq.offer(45);
        pq.offer(20);

        // size of the priority queue
        System.out.println("Size of priority queue: " + pq.size()); // 4

        // Viewing the top element (peek)
        System.out.println("Top element: " + pq.peek()); // 10

        // Removing the top element (poll)
        System.out.println("Polled element: " + pq.poll()); // 10

        // Checking if the priority queue is empty
        System.out.println("Is priority queue empty? " + pq.isEmpty()); // false

        // Remove element from the priority queue
        pq.remove(25); // 25 is removed from the priority queue

        // Traversing the priority queue
        System.out.println("PriorityQueue elements:");
        for (Integer number : pq) {
            System.out.println(number);
        }

        // Adding more elements
        pq.offer(15);
        pq.offer(5);

        // Viewing and removing elements in priority order
        System.out.println("Elements in priority order:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

        // Custom comparator for descending order
        Comparator<Integer> descendingOrder = new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return Integer.compare(i2, i1); // For descending order
            }
        };

        // Create a priority queue with custom comparator
        pq = new PriorityQueue<>(descendingOrder);

        // Adding elements to the priority queue
        pq.offer(25);
        pq.offer(10);
        pq.offer(45);
        pq.offer(20);

        // Viewing and removing elements in priority order
        System.out.println("Elements in priority order (descending):");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

        // Custom comparator for Pair to sort by the first value in descending order
        // Comparator<Pair<Integer, Integer>> pairComparator = new Comparator<Pair<Integer, Integer>>() {
        //     @Override
        //     public int compare(Pair<Integer, Integer> p1, Pair<Integer, Integer> p2) {
        //         // return p2.first - p1.first; // Descending order by the first value
        //         return Integer.compare(p2.second, p1.second); // Descending order by the first value
        //     }
        // };

        // Lambda expression
        Comparator<Pair<Integer, Integer>> pairComparator = (p1, p2) -> Integer.compare(p2.second, p1.second);

        // Create a priority queue with custom comparator for pairs
        PriorityQueue<Pair<Integer, Integer>> pairPQ = new PriorityQueue<>(pairComparator);

        // Combined into one line Lambda expression
        PriorityQueue<Pair<Integer, Integer>> pairPQ2 = new PriorityQueue<>((p1, p2) -> Integer.compare(p2.second, p1.second));

        // Adding pairs to the priority queue
        pairPQ.offer(new Pair<>(3, 4));
        pairPQ.offer(new Pair<>(1, 2));
        pairPQ.offer(new Pair<>(5, 1));
        pairPQ.offer(new Pair<>(2, 3));

        // Viewing and removing pairs in priority order
        System.out.println("Pairs in priority order (by first value, descending):");
        while (!pairPQ.isEmpty()) {
            System.out.println(pairPQ.poll());
        }
    }
}
