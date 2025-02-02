import java.util.ArrayList;
import java.util.Collections;
// import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // Example 1: Managing a list of books
        List<String> books = new ArrayList<>();

        // Adding elements
        books.add("To Kill a Mockingbird");
        books.add("1984");
        books.add("The Great Gatsby");
        books.add(1, "Pride and Prejudice"); // Inserting at index 1

        // Traversing using for-each loop
        System.out.println("Books list:");
        for (String book : books) {
            System.out.println(book);
        }

        // Accessing elements
        System.out.println("First book: " + books.get(0));

        // Modifying elements
        books.set(2, "Brave New World"); // Replacing element at index 2
        System.out.println("Modified books list:");
        for (String book : books) {
            System.out.println(book);
        }

        // Checking if an element exists
        System.out.println("Contains '1984': " + books.contains("1984")); // Should return true

        // Finding the index of an element
        System.out.println("Index of '1984': " + books.indexOf("1984")); // Should return 3
        System.out.println("Last index of '1984': " + books.lastIndexOf("1984")); // Should return 3

        // Removing elements
        books.remove("1984"); // Removing by element
        books.remove(0); // Removing by index
        
        System.out.println("Books list after removal:");
        for (String book : books) {
            System.out.println(book);
        }

        // Traversing using an Iterator
        System.out.println("Books list using Iterator:");
        Iterator<String> iterator = books.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Traversing using ListIterator
        System.out.println("Books list using ListIterator:");
        ListIterator<String> listIterator = books.listIterator();
        while (listIterator.hasNext()) { // hasPrevious() for reverse traversal
            // listIterator.previous(); // Uncomment to traverse in reverse
            System.out.println(listIterator.next());
        }

        // Checking the size of the list
        System.out.println("Size of books list: " + books.size()); // Should return 2

        // Clearing the list
        books.clear();
        System.out.println("Is the books list empty? " + books.isEmpty()); // Should return true

        // Example 2: Managing a list of students' grades
        List<Integer> grades = new ArrayList<>();
        grades.add(85);
        grades.add(92);
        grades.add(78);
        grades.add(89);

        // removing by index
        grades.remove(2);

        // removing by element
        grades.remove(Integer.valueOf(92));

        // Traversing and printing grades
        System.out.println("Grades list:");
        for (int grade : grades) {
            System.out.println(grade);
        }

        // Sorting grades in ascending order
        Collections.sort(grades);
        System.out.println("Sorted grades list:");
        for (int grade : grades) {
            System.out.println(grade);
        }

        // Example 3: Using a custom Pair class and sorting
        List<Pair<Integer, Integer>> pairs = new ArrayList<>();
        pairs.add(new Pair<>(3, 4));
        pairs.add(new Pair<>(1, 2));
        pairs.add(new Pair<>(5, 1));
        pairs.add(new Pair<>(2, 3));

        // Sorting by 'first' in ascending order
        // Collections.sort(pairs, new Comparator<Pair<Integer, Integer>>() {
        //     @Override
        //     public int compare(Pair<Integer, Integer> p1, Pair<Integer, Integer> p2) {
        //         return Integer.compare(p1.first, p2.first);
        //     }
        // });

        // Same using lambda
        Collections.sort(pairs, (p1, p2) -> Integer.compare(p1.first, p2.first));

        System.out.println("Pairs sorted by first:");
        for (Pair<Integer, Integer> pair : pairs) {
            System.out.println(pair.toString());
        }

        // Sorting by 'second' in ascending order
        // Collections.sort(pairs, new Comparator<Pair<Integer, Integer>>() {
        //     @Override
        //     public int compare(Pair<Integer, Integer> p1, Pair<Integer, Integer> p2) {
        //         return Integer.compare(p1.second, p2.second);
        //     }
        // });

        // Same using lambda
        Collections.sort(pairs, (p1, p2) -> Integer.compare(p1.second, p2.second));

        System.out.println("Pairs sorted by second:");
        for (Pair<Integer, Integer> pair : pairs) {
            System.out.println(pair.toString());
        }
    }
}
