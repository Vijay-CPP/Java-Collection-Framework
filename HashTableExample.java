import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableExample {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // Create a Hashtable to store String keys and Integer values
        Map<String, Integer> fruitMap = new Hashtable<>();

        // Adding key-value pairs to the Hashtable
        fruitMap.put("Apple", 10);
        fruitMap.put("Banana", 20);
        fruitMap.put("Cherry", 30);
        fruitMap.put("Date", 40);

        // Retrieving a value by key
        System.out.println("Value for 'Banana': " + fruitMap.get("Banana")); // 20

        // Checking if a key exists in the Hashtable
        System.out.println("Contains key 'Cherry': " + fruitMap.containsKey("Cherry")); // true

        // Checking if a value exists in the Hashtable
        System.out.println("Contains value 30: " + fruitMap.containsValue(30)); // true

        // Removing a key-value pair by key
        System.out.println("Removed value for 'Date': " + fruitMap.remove("Date")); // 40

        // Checking the size of the Hashtable
        System.out.println("Size of the Hashtable: " + fruitMap.size()); // 3

        // Update the value of the key "Apple" by adding a new value (e.g., 5) to its
        // current value or 0 if the key is not present
        fruitMap.put("Apple", fruitMap.getOrDefault("Apple", 0) + 5);
        // Equivalent to:
        // fruitMap.compute("Apple", (key, val) -> val == null ? 5 : val + 5);

        // Iterating over the key-value pairs in the Hashtable
        System.out.println("Hashtable elements:");
        for (Map.Entry<String, Integer> entry : fruitMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Iterating over the keys in the Hashtable
        System.out.println("Hashtable keys:");
        Set<String> keys = fruitMap.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

        // Iterating over the values in the Hashtable
        System.out.println("Hashtable values:");
        Collection<Integer> values = fruitMap.values();
        for (Integer value : values) {
            System.out.println(value);
        }

        // Updating the value for a key
        fruitMap.put("Apple", 15);
        System.out.println("Updated value for 'Apple': " + fruitMap.get("Apple")); // 15

        // Clearing the Hashtable
        fruitMap.clear();
        System.out.println("Is the Hashtable empty? " + fruitMap.isEmpty()); // true

        // Example to show compute fn
        // Adding initial key-value pairs to the Hashtable
        fruitMap.put("Apple", 10);
        fruitMap.put("Banana", 20);
        fruitMap.put("Cherry", 30);

        // Using the compute method to update the value for "Banana"
        fruitMap.compute("Banana", (key, val) -> val == null ? 1 : val + 5);
        System.out.println("Updated value for 'Banana': " + fruitMap.get("Banana")); // 25

        // Using the compute method with a lambda expression
        fruitMap.compute("Cherry", (key, val) -> val == null ? 1 : val + 10);
        System.out.println("Updated value for 'Cherry': " + fruitMap.get("Cherry")); // 40

        // Using the computeIfAbsent method - Lambda expression
        fruitMap.computeIfAbsent("Elderberry", key -> 50);
        System.out.println("Value for 'Elderberry': " + fruitMap.get("Elderberry")); // 50

        // Using the computeIfAbsent method without lambda
        // fruitMap.computeIfAbsent("Elderberry", new java.util.function.Function<String, Integer>() {
        //     @Override
        //     public Integer apply(String key) {
        //         return 50;
        //     }
        // });
        // System.out.println("Value for 'Elderberry': " + fruitMap.get("Elderberry")); // 50

        // Using the computeIfPresent method - Lambda expression
        fruitMap.computeIfPresent("Elderberry", (key, val) -> val + 10);
        System.out.println("Updated value for 'Elderberry': " + fruitMap.get("Elderberry")); // 60

        // Using the computeIfPresent method without lambda
        // fruitMap.computeIfPresent("Elderberry", new java.util.function.BiFunction<String, Integer, Integer>() {
        //     @Override
        //     public Integer apply(String key, Integer val) {
        //         return val + 10;
        //     }
        // });
        // System.out.println("Updated value for 'Elderberry': " + fruitMap.get("Elderberry")); // 60
    }
}
