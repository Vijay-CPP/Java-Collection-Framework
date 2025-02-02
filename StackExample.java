import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a stack of fruits
        Stack<String> fruitStack = new Stack<>();

        // Pushing elements onto the stack
        fruitStack.push("Apple");
        fruitStack.push("Banana");
        fruitStack.push("Cherry");
        fruitStack.push("Date");

        // Viewing the top element (peek)
        System.out.println("Top element: " + fruitStack.peek()); // Date

        // Popping the top element
        System.out.println("Popped element: " + fruitStack.pop()); // Date

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + fruitStack.empty()); // false

        // Searching for an element
        System.out.println("Position of 'Banana': " + fruitStack.search("Banana")); // 2

        // Traversing the stack
        System.out.println("Stack elements:");
        for (String fruit : fruitStack) {
            System.out.println(fruit);
        }
    }
}
