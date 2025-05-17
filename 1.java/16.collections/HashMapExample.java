import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap with Student ID as key and Name as value
        HashMap<Integer, String> studentMap = new HashMap<>();
        
        // Insert key-value pairs into the map
        System.out.println("1. Adding student entries to HashMap:");
        studentMap.put(1001, "Alice Johnson");
        studentMap.put(1002, "Bob Smith");
        studentMap.put(1003, "Charlie Brown");
        studentMap.put(1004, "Diana Miller");
        studentMap.put(1005, "Edward Wilson");
        studentMap.put(1006, "Fiona Garcia");
        studentMap.put(1007, "George Davis");
        studentMap.put(1008, "Hannah Martinez");
        studentMap.put(1009, "Ian Thompson");
        studentMap.put(1010, "Julia Anderson");
        
        // Display the HashMap
        System.out.println("\nStudent Map: " + studentMap);
        
        // Fetch the value of a Key
        System.out.println("\n2. Fetching value for student ID 1005:");
        String studentName = studentMap.get(1005);
        System.out.println("Student with ID 1005: " + studentName);
        
        // Create a clone/copy of HashMap
        System.out.println("\n3. Creating a clone of the HashMap:");
        HashMap<Integer, String> clonedMap = (HashMap<Integer, String>) studentMap.clone();
        System.out.println("Cloned Map: " + clonedMap);
        
        // Check if the given Key is in the Map
        System.out.println("\n4. Checking if a key exists in the HashMap:");
        boolean isKeyPresent = studentMap.containsKey(1003);
        System.out.println("Is student ID 1003 present? " + isKeyPresent);
        
        isKeyPresent = studentMap.containsKey(1020);
        System.out.println("Is student ID 1020 present? " + isKeyPresent);
        
        // Check if the value is in the Map
        System.out.println("\n5. Checking if a value exists in the HashMap:");
        boolean isValuePresent = studentMap.containsValue("Bob Smith");
        System.out.println("Is 'Bob Smith' present as a value? " + isValuePresent);
        
        isValuePresent = studentMap.containsValue("John Doe");
        System.out.println("Is 'John Doe' present as a value? " + isValuePresent);
        
        // Check if the map is empty
        System.out.println("\n6. Checking if the HashMap is empty:");
        boolean isEmpty = studentMap.isEmpty();
        System.out.println("Is the student map empty? " + isEmpty);
        
        // Print the size of the Map to the console
        System.out.println("\n7. Printing the size of the HashMap:");
        System.out.println("Size of student map: " + studentMap.size());
        
        // Print all the Keys of the map to the console
        System.out.println("\n8. Printing all keys of the HashMap:");
        System.out.println("Student IDs: " + studentMap.keySet());
        
        // Print all the Values of the map to the console
        System.out.println("\n9. Printing all values of the HashMap:");
        System.out.println("Student Names: " + studentMap.values());
        
        // Remove a specific Key-value pair
        System.out.println("\n10. Removing a specific key-value pair:");
        String removedStudent = studentMap.remove(1004);
        System.out.println("Removed student: " + removedStudent);
        System.out.println("Student Map after removal: " + studentMap);
        
        // Copy all the elements of the Map to another Map
        System.out.println("\n11. Copying all elements to another HashMap:");
        HashMap<Integer, String> newStudentMap = new HashMap<>();
        newStudentMap.putAll(studentMap);
        System.out.println("New Student Map: " + newStudentMap);
        
        // Iterate through the HashMap
        System.out.println("\n12. Iterating through the HashMap:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
        
        // Clear the HashMap
        System.out.println("\n13. Clearing the HashMap:");
        studentMap.clear();
        System.out.println("Student Map after clearing: " + studentMap);
        System.out.println("Is the student map empty now? " + studentMap.isEmpty());
    }
}