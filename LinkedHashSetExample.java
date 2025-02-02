import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Example 1: Managing a set of unique books
        Set<String> books = new LinkedHashSet<>();

        // Adding elements
        books.add("To Kill a Mockingbird");
        books.add("1984");
        books.add("The Great Gatsby");
        books.add("Pride and Prejudice");

        // Adding duplicate elements (will not be added to the set)
        books.add("1984");
        books.add("The Great Gatsby");

        // Traversing using for-each loop
        System.out.println("Books set:");
        for (String book : books) {
            System.out.println(book);
        }

        // Checking if an element exists
        System.out.println("Contains '1984': " + books.contains("1984")); // Should return true

        // Removing elements
        books.remove("1984");
        
        System.out.println("Books set after removal:");
        for (String book : books) {
            System.out.println(book);
        }

        // Traversing using an Iterator
        System.out.println("Books set using Iterator:");
        Iterator<String> iterator = books.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Checking the size of the set
        System.out.println("Size of books set: " + books.size()); // Should return 3

        // Clearing the set
        books.clear();
        System.out.println("Is the books set empty? " + books.isEmpty()); // Should return true

        // Example 2: Managing a set of students' grades
        Set<Integer> grades = new LinkedHashSet<>();
        grades.add(85);
        grades.add(92);
        grades.add(78);
        grades.add(89);

        // Adding duplicate grades (will not be added to the set)
        grades.add(85);
        grades.add(92);

        // contains() method
        System.out.println("Contains 85: " + grades.contains(85)); // Should return true

        // Traversing and printing grades
        System.out.println("Grades set:");
        for (int grade : grades) {
            System.out.println(grade);
        }

        // Converting to a list and sorting grades in ascending order
        List<Integer> gradeList = new ArrayList<>(grades);
        System.out.println("Grades array-list:");
        for (int grade : gradeList) {
            System.out.println(grade);
        }
    }
}
