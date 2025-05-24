import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String[] args) {
        // 1. Creating an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // 2. Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        System.out.println("After adding elements: " + fruits);

        // 3. Adding element at a specific index
        fruits.add(1, "Orange");
        System.out.println("After adding at index 1: " + fruits);

        // 4. Accessing elements
        System.out.println("Element at index 2: " + fruits.get(2));

        // 5. Modifying elements
        fruits.set(2, "Pineapple");
        System.out.println("After modifying index 2: " + fruits);

        // 6. Removing element by index
        fruits.remove(1);
        System.out.println("After removing index 1: " + fruits);

        // 7. Removing element by value
        fruits.remove("Banana");
        System.out.println("After removing 'Banana': " + fruits);

        // 8. Size of the ArrayList
        System.out.println("Size: " + fruits.size());

        // 9. Iterating using loop
        System.out.print("Loop through elements: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // 10. Check if list contains an element
        System.out.println("Contains Mango? " + fruits.contains("Mango"));
        System.out.println("Contains Apple? " + fruits.contains("Apple"));

        // 11. Clear the ArrayList
        fruits.clear();
        System.out.println("After clearing: " + fruits);

        // 12. Check if ArrayList is empty
        System.out.println("Is empty? " + fruits.isEmpty());
    }
}