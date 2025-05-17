import java.lang.reflect.Field;

public class NoSuchFieldExceptionExample {
    // Class with fields for demonstration
    static class Person {
        public String name;
        private int age;
        protected boolean employed;
        
        public Person(String name, int age, boolean employed) {
            this.name = name;
            this.age = age;
            this.employed = employed;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Demonstrating NoSuchFieldException");
        
        // Example 1: Accessing a non-existent field
        accessNonExistentField();
        
        // Example 2: Accessing a private field
        accessPrivateField();
        
        // Example 3: Successfully accessing a field
        accessExistingField();
        
        System.out.println("\nProgram completed");
    }
    
    private static void accessNonExistentField() {
        System.out.println("\nExample 1: Accessing a non-existent field");
        
        try {
            Person person = new Person("John", 30, true);
            
            System.out.println("Attempting to access non-existent field 'salary'");
            // This will throw NoSuchFieldException
            Field field = Person.class.getField("salary");
            
            // This line won't execute due to the exception
            System.out.println("Field found: " + field.getName());
        } catch (NoSuchFieldException e) {
            System.out.println("NoSuchFieldException caught: " + e.getMessage());
            System.out.println("Exception details: " + e);
        }
    }
    
    private static void accessPrivateField() {
        System.out.println("\nExample 2: Accessing a private field");
        
        try {
            System.out.println("Attempting to access private field 'age' using getField()");
            // This will throw NoSuchFieldException because getField() only finds public fields
            Field field = Person.class.getField("age");
            
            // This line won't execute due to the exception
            System.out.println("Field found: " + field.getName());
        } catch (NoSuchFieldException e) {
            System.out.println("NoSuchFieldException caught: " + e.getMessage());
        }
        
        try {
            System.out.println("\nAttempting to access private field 'age' using getDeclaredField()");
            // This will work because getDeclaredField() finds all fields regardless of access modifier
            Field field = Person.class.getDeclaredField("age");
            
            System.out.println("Field found using getDeclaredField(): " + field.getName());
            System.out.println("Field type: " + field.getType().getName());
            
            // Create Person instance to access the field value
            Person person = new Person("John", 30, true);
            
            // Need to make private field accessible
            field.setAccessible(true);
            int age = (int) field.get(person);
            
            System.out.println("Field value: " + age);
        } catch (NoSuchFieldException e) {
            System.out.println("NoSuchFieldException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Other exception caught: " + e.getMessage());
        }
    }
    
    private static void accessExistingField() {
        System.out.println("\nExample 3: Successfully accessing a field");
        
        try {
            System.out.println("Attempting to access public field 'name'");
            
            // This will work because 'name' is a public field
            Field field = Person.class.getField("name");
            
            System.out.println("Field found: " + field.getName());
            System.out.println("Field type: " + field.getType().getName());
            
            // Create Person instance to access the field value
            Person person = new Person("John", 30, true);
            String name = (String) field.get(person);
            
            System.out.println("Field value: " + name);
            
            // Modify the field value
            field.set(person, "Jane");
            System.out.println("Modified field value: " + person.name);
        } catch (NoSuchFieldException e) {
            System.out.println("NoSuchFieldException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Other exception caught: " + e.getMessage());
        }
    }
} 