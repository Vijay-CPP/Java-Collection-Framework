import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class TreeSetExample {
    public static void main(String[] args) {
        // Example 1: Managing a set of unique books
        Set<String> books = new TreeSet<>();
    
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


        // Custom comparator for book titles (reverse alphabetical order)
        // Comparator<String> bookComparator = new Comparator<String>() {
        //     @Override
        //     public int compare(String s1, String s2) {
        //         return s2.compareTo(s1); // Reverse order
        //     }
        // };

        // Lambda expression
        Comparator<String> bookComparator = (s1, s2) -> s2.compareTo(s1);


        // Managing a set of unique books with custom ordering
        books = new TreeSet<>(bookComparator);

        // Combined into one line Lambda expression
        books = new TreeSet<>((s1, s2) -> s2.compareTo(s1));

        // Adding elements
        books.add("To Kill a Mockingbird");
        books.add("1984");
        books.add("The Great Gatsby");
        books.add("Pride and Prejudice");

        // Adding duplicate elements (will not be added to the set)
        books.add("1984");
        books.add("The Great Gatsby");

        // Traversing using for-each loop
        System.out.println("Books set (reverse order):");
        for (String book : books) {
            System.out.println(book);
        }

        // Example 2: Managing a set of students' grades
        Set<Integer> grades = new TreeSet<>();
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

        // Managing a set of students' grades with custom ordering
        // Custom comparator for grades (descending order)
        // Comparator<Integer> gradeComparator = new Comparator<Integer>() {
        //     @Override
        //     public int compare(Integer i1, Integer i2) {
        //         return i2.compareTo(i1); // Descending order
        //     }
        // };

        // Lambda expression
        Comparator<Integer> gradeComparator = (i1, i2) -> i2.compareTo(i1);

        grades = new TreeSet<>(gradeComparator);

        // Combined into one line Lambda expression
        grades = new TreeSet<>((i1, i2) -> i2.compareTo(i1));

        // Adding elements
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
        System.out.println("Grades set (descending order):");
        for (int grade : grades) {
            System.out.println(grade);
        }
    }
}
