public class CustomExceptionMessage {
    public static void main(String[] args) {
        System.out.println("Program started");
        
        try {
            validateAge(15);
            System.out.println("Age 15 is valid");
            
            validateAge(5);
            System.out.println("Age 5 is valid"); // Won't execute due to exception
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        
        try {
            validateUsername("admin");
            System.out.println("Username 'admin' is valid");
            
            validateUsername("root");
            System.out.println("Username 'root' is valid"); // Won't execute
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        
        System.out.println("Program completed");
    }
    
    public static void validateAge(int age) throws Exception {
        System.out.println("Validating age: " + age);
        
        if (age < 10) {
            // Throwing an exception with a custom message
            throw new Exception("Age must be at least 10 years old");
        }
        
        if (age > 100) {
            throw new Exception("Age cannot be greater than 100 years");
        }
    }
    
    public static void validateUsername(String username) throws Exception {
        System.out.println("Validating username: " + username);
        
        if (username == null || username.isEmpty()) {
            throw new Exception("Username cannot be null or empty");
        }
        
        if (username.length() < 4) {
            throw new Exception("Username must be at least 4 characters long");
        }
        
        if (username.equals("root") || username.equals("admin")) {
            throw new Exception("Username '" + username + "' is restricted");
        }
    }
} 