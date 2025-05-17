// Custom exception class extending Exception
class InvalidAgeException extends Exception {
    // Default constructor
    public InvalidAgeException() {
        super("Invalid age provided");
    }
    
    // Constructor with custom message
    public InvalidAgeException(String message) {
        super(message);
    }
    
    // Constructor with custom message and cause
    public InvalidAgeException(String message, Throwable cause) {
        super(message, cause);
    }
}

// Another custom exception class
class RestrictedUsernameException extends Exception {
    private String username;
    
    public RestrictedUsernameException(String username) {
        super("Username '" + username + "' is restricted");
        this.username = username;
    }
    
    public String getRestrictedUsername() {
        return username;
    }
}

public class CustomException {
    public static void main(String[] args) {
        System.out.println("Program started");
        
        try {
            validateAge(15);
            System.out.println("Age 15 is valid");
            
            validateAge(5);
            System.out.println("Age 5 is valid"); // Won't execute
        } catch (InvalidAgeException e) {
            System.out.println("InvalidAgeException: " + e.getMessage());
        }
        
        try {
            validateUsername("john");
            System.out.println("Username 'john' is valid");
            
            validateUsername("admin");
            System.out.println("Username 'admin' is valid"); // Won't execute
        } catch (RestrictedUsernameException e) {
            System.out.println("RestrictedUsernameException: " + e.getMessage());
            System.out.println("Attempted to use restricted username: " + e.getRestrictedUsername());
        }
        
        // Nested exception with cause
        try {
            try {
                validateAge(-10);
            } catch (InvalidAgeException e) {
                // Wrapping the caught exception with additional context
                throw new InvalidAgeException("Error in age validation process", e);
            }
        } catch (InvalidAgeException e) {
            System.out.println("Caught exception: " + e.getMessage());
            System.out.println("Caused by: " + e.getCause().getMessage());
        }
        
        System.out.println("Program completed");
    }
    
    public static void validateAge(int age) throws InvalidAgeException {
        System.out.println("Validating age: " + age);
        
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative");
        }
        
        if (age < 10) {
            throw new InvalidAgeException("Age must be at least 10 years old");
        }
        
        if (age > 100) {
            throw new InvalidAgeException("Age cannot be greater than 100 years");
        }
    }
    
    public static void validateUsername(String username) throws RestrictedUsernameException {
        System.out.println("Validating username: " + username);
        
        if (username.equals("root") || username.equals("admin")) {
            throw new RestrictedUsernameException(username);
        }
    }
} 