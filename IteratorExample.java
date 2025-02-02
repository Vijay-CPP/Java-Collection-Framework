import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorExample {
    public static void main(String[] args) {
        // Create a List of Strings
        List<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Cherry");
        fruitList.add("Date");

        // Using Iterator to traverse the List
        System.out.println("Using Iterator:");
        Iterator<String> iterator = fruitList.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);

            // Remove "Banana" while iterating
            if (fruit.equals("Banana")) {
                iterator.remove();
            }
        }

        // Print the List after removal
        System.out.println("List after Iterator removal: " + fruitList);

        // Using ListIterator to traverse the List in both directions
        System.out.println("Using ListIterator (forward):");
        ListIterator<String> listIterator = fruitList.listIterator();
        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            System.out.println(fruit);
        }

        // Adding elements using ListIterator
        System.out.println("Adding 'Elderberry' after 'Apple' using ListIterator:");
        listIterator = fruitList.listIterator(); // Reset the ListIterator
        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            if (fruit.equals("Apple")) {
                listIterator.add("Elderberry");
            }
        }

        // Print the List after adding elements
        System.out.println("List after adding elements using ListIterator: " + fruitList);

        // Traversing the List in reverse using ListIterator
        System.out.println("Using ListIterator (backward):");
        while (listIterator.hasPrevious()) {
            String fruit = listIterator.previous();
            System.out.println(fruit);
        }

        // Updating elements using ListIterator
        System.out.println("Updating elements using ListIterator:");
        listIterator = fruitList.listIterator(); // Reset the ListIterator
        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            if (fruit.equals("Cherry")) {
                listIterator.set("Citrus");
            }
        }

        // Print the List after updating elements
        System.out.println("List after updating elements using ListIterator: " + fruitList);
    }
}
