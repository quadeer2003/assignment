public class NullPointerExceptionExample {
    // Class for demonstration
    static class User {
        private String name;
        private Address address;
        
        public User(String name, Address address) {
            this.name = name;
            this.address = address;
        }
        
        public String getName() {
            return name;
        }
        
        public Address getAddress() {
            return address;
        }
        
        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("City: " + address.getCity());
        }
    }
    
    static class Address {
        private String city;
        
        public Address(String city) {
            this.city = city;
        }
        
        public String getCity() {
            return city;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Demonstrating NullPointerException");
        
        // Example 1: Calling a method on a null object
        callMethodOnNullObject();
        
        // Example 2: Accessing a property of a null object
        accessPropertyOfNullObject();
        
        // Example 3: Null object in an array
        nullObjectInArray();
        
        // Example 4: Prevent NullPointerException with null checks
        preventNullPointerException();
        
        System.out.println("\nProgram completed");
    }
    
    private static void callMethodOnNullObject() {
        System.out.println("\nExample 1: Calling a method on a null object");
        
        try {
            String str = null;
            System.out.println("Attempting to call a method on null String");
            
            // This will throw NullPointerException
            int length = str.length();
            
            // This line won't execute due to the exception
            System.out.println("String length: " + length);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
            System.out.println("Exception details: " + e);
        }
    }
    
    private static void accessPropertyOfNullObject() {
        System.out.println("\nExample 2: Accessing a property of a null object");
        
        try {
            // Create a User with null Address
            User user = new User("John", null);
            
            System.out.println("User name: " + user.getName());
            System.out.println("Attempting to access city from null Address object");
            
            // This will throw NullPointerException
            String city = user.getAddress().getCity();
            
            // This line won't execute due to the exception
            System.out.println("City: " + city);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
        
        try {
            // Create a User with null Address and call a method that uses the address
            User user = new User("Jane", null);
            
            System.out.println("\nAttempting to call displayInfo() which uses the null Address");
            
            // This will throw NullPointerException inside the method
            user.displayInfo();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }
    
    private static void nullObjectInArray() {
        System.out.println("\nExample 3: Null object in an array");
        
        try {
            // Create an array with null elements
            String[] names = new String[3];
            names[0] = "Alice";
            names[1] = null;
            names[2] = "Charlie";
            
            System.out.println("Array created with one null element:");
            System.out.println("names[0]: " + names[0]);
            System.out.println("names[1]: " + names[1]);
            System.out.println("names[2]: " + names[2]);
            
            System.out.println("\nAttempting to call toUpperCase() on each element:");
            
            for (int i = 0; i < names.length; i++) {
                // This will throw NullPointerException when i = 1
                System.out.println("names[" + i + "] uppercase: " + names[i].toUpperCase());
            }
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }
    
    private static void preventNullPointerException() {
        System.out.println("\nExample 4: Prevent NullPointerException with null checks");
        
        // Create an array with null elements
        String[] names = new String[3];
        names[0] = "Alice";
        names[1] = null;
        names[2] = "Charlie";
        
        System.out.println("Array created with one null element:");
        System.out.println("names[0]: " + names[0]);
        System.out.println("names[1]: " + names[1]);
        System.out.println("names[2]: " + names[2]);
        
        System.out.println("\nUsing null checks before calling methods:");
        
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                System.out.println("names[" + i + "] uppercase: " + names[i].toUpperCase());
            } else {
                System.out.println("names[" + i + "] is null, skipping");
            }
        }
        
        // Using null check for nested objects
        User user = new User("John", null);
        
        System.out.println("\nAttempting to safely access city from potentially null Address:");
        if (user.getAddress() != null) {
            System.out.println("City: " + user.getAddress().getCity());
        } else {
            System.out.println("Address is null, cannot access city");
        }
    }
} 