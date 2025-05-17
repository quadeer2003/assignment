import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of type String
        ArrayList<String> fruitList = new ArrayList<>();
        
        // Add 10 elements to ArrayList
        System.out.println("Adding 10 elements to ArrayList:");
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Cherry");
        fruitList.add("Date");
        fruitList.add("Elderberry");
        fruitList.add("Fig");
        fruitList.add("Grape");
        fruitList.add("Honeydew");
        fruitList.add("Imbe");
        fruitList.add("Jackfruit");
        
        // Display the ArrayList
        System.out.println("\nFruit List: " + fruitList);
        
        // Add an element to the ArrayList
        System.out.println("\n1. Adding an element to the ArrayList:");
        fruitList.add("Kiwi");
        System.out.println("After adding 'Kiwi': " + fruitList);
        
        // Iterate through the ArrayList using Iterator
        System.out.println("\n2. Iterating through the ArrayList using Iterator:");
        Iterator<String> iterator = fruitList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        // Add an element at a specific index
        System.out.println("\n3. Adding an element at index 2:");
        fruitList.add(2, "Blueberry");
        System.out.println("After adding 'Blueberry' at index 2: " + fruitList);
        
        // Remove an element from the ArrayList
        System.out.println("\n4. Removing an element ('Fig') from the ArrayList:");
        fruitList.remove("Fig");
        System.out.println("After removing 'Fig': " + fruitList);
        
        // Remove an element at an index
        System.out.println("\n5. Removing element at index 4:");
        String removedFruit = fruitList.remove(4);
        System.out.println("Removed: " + removedFruit);
        System.out.println("After removing element at index 4: " + fruitList);
        
        // Update the element at a specific index
        System.out.println("\n6. Updating element at index 1:");
        fruitList.set(1, "Better Banana");
        System.out.println("After updating element at index 1: " + fruitList);
        
        // Check if an element is present at a particular index
        System.out.println("\n7. Element at index 3:");
        System.out.println("Element at index 3: " + fruitList.get(3));
        
        // Get an element at a particular index
        System.out.println("\n8. Getting element at index 5:");
        String fruitAtIndex5 = fruitList.get(5);
        System.out.println("Fruit at index 5: " + fruitAtIndex5);
        
        // Find out the size of the ArrayList
        System.out.println("\n9. Size of the ArrayList:");
        System.out.println("Size: " + fruitList.size());
        
        // Check if a given element is present in the ArrayList
        System.out.println("\n10. Checking if 'Apple' is present in the ArrayList:");
        boolean isApplePresent = fruitList.contains("Apple");
        System.out.println("Is 'Apple' present? " + isApplePresent);
        
        System.out.println("Checking if 'Orange' is present in the ArrayList:");
        boolean isOrangePresent = fruitList.contains("Orange");
        System.out.println("Is 'Orange' present? " + isOrangePresent);
        
        // Remove all elements of the ArrayList
        System.out.println("\n11. Removing all elements of the ArrayList:");
        fruitList.clear();
        System.out.println("After clearing the ArrayList: " + fruitList);
        System.out.println("Is the ArrayList empty? " + fruitList.isEmpty());
    }
} 