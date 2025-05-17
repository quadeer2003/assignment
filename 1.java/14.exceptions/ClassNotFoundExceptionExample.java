public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        System.out.println("Demonstrating ClassNotFoundException");
        
        // Example 1: Loading a non-existent class
        loadNonExistentClass();
        
        // Example 2: Loading class with incorrect package name
        loadIncorrectPackage();
        
        // Example 3: Loading class dynamically from user input
        // In a real application, this could come from a configuration or user input
        String className = "com.example.NonExistentClass";
        loadDynamicClass(className);
        
        System.out.println("\nProgram completed");
    }
    
    private static void loadNonExistentClass() {
        System.out.println("\nExample 1: Loading a non-existent class");
        
        try {
            System.out.println("Attempting to load 'NonExistentClass'");
            Class.forName("NonExistentClass");
            
            // This line won't execute due to the exception
            System.out.println("Class loaded successfully");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException caught: " + e.getMessage());
        }
    }
    
    private static void loadIncorrectPackage() {
        System.out.println("\nExample 2: Loading class with incorrect package name");
        
        try {
            // String class exists, but not in this package
            System.out.println("Attempting to load 'java.lang.string' (incorrect case)");
            Class.forName("java.lang.string");
            
            // This line won't execute due to the exception
            System.out.println("Class loaded successfully");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException caught: " + e.getMessage());
        }
        
        // Successful example
        try {
            // Correct case and package
            System.out.println("\nAttempting to load 'java.lang.String' (correct case)");
            Class<?> stringClass = Class.forName("java.lang.String");
            
            System.out.println("Class loaded successfully: " + stringClass.getName());
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException caught: " + e.getMessage());
        }
    }
    
    private static void loadDynamicClass(String className) {
        System.out.println("\nExample 3: Loading class dynamically - " + className);
        
        try {
            System.out.println("Attempting to load class: " + className);
            Class<?> dynamicClass = Class.forName(className);
            
            // This line won't execute due to the exception
            System.out.println("Class loaded successfully: " + dynamicClass.getName());
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException caught: " + e.getMessage());
            System.out.println("Exception type: " + e.getClass().getName());
        }
    }
} 