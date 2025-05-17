class ReturnTypeTest {
    private String message;
    
    // Regular constructor (no return type)
    public ReturnTypeTest() {
        System.out.println("Default constructor called");
        this.message = "Default message";
    }
    
    /* This will not compile - constructors cannot have return types
    public int ReturnTypeTest() {
        System.out.println("Constructor with int return type - not allowed");
        this.message = "Cannot return int";
        return 100;
    }
    */
    
    /* This will not compile - constructors cannot have return types
    public String ReturnTypeTest(String msg) {
        System.out.println("Constructor with String return type - not allowed");
        this.message = msg;
        return msg;
    }
    */
    
    // This is a regular method, not a constructor
    public int createWithInt() {
        System.out.println("This is a method, not a constructor");
        return 100;
    }
    
    // This is a regular method, not a constructor
    public String createWithString(String msg) {
        System.out.println("This is a method, not a constructor");
        return msg;
    }
    
    public void display() {
        System.out.println("Message: " + message);
    }
}

public class ConstructorReturnType {
    public static void main(String[] args) {
        System.out.println("Creating object with default constructor:");
        ReturnTypeTest obj = new ReturnTypeTest();
        obj.display();
        
        System.out.println("\nConstructors cannot have return types!");
        System.out.println("The following code would not compile if uncommented:");
        System.out.println("public int ReturnTypeTest() { ... }");
        System.out.println("public String ReturnTypeTest(String msg) { ... }");
        
        System.out.println("\nUsing regular methods that look similar to constructors:");
        int value = obj.createWithInt();
        System.out.println("Value returned from method: " + value);
        
        String message = obj.createWithString("Hello from method");
        System.out.println("Message returned from method: " + message);
    }
} 