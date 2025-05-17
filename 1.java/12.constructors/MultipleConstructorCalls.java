class Product {
    private String name;
    private double price;
    
    public Product() {
        System.out.println("Default constructor called");
        this.name = "Unknown";
        this.price = 0.0;
    }
    
    public Product(String name, double price) {
        System.out.println("Parameterized constructor called");
        this.name = name;
        this.price = price;
    }
    
    public void displayInfo() {
        System.out.println("Product: " + name + ", Price: $" + price);
    }
    
    // Method to simulate constructor call
    public void reinitialize() {
        System.out.println("Reinitialize method called (not a constructor)");
        this.name = "Reinitialized";
        this.price = 0.0;
    }
    
    // Method that calls a constructor (will not work as expected)
    public void tryConstructorAgain() {
        System.out.println("Attempting to call constructor again (will not work as expected)");
        // This actually creates a new object, not reinitializing the current one
        new Product();
        // The current object (this) remains unchanged
    }
}

public class MultipleConstructorCalls {
    public static void main(String[] args) {
        System.out.println("Creating first product:");
        Product product = new Product("Laptop", 999.99);
        product.displayInfo();
        
        System.out.println("\nAttempting to call constructor again on the same object...");
        // This won't work - constructors can only be called during object instantiation
        // product.Product(); // This would cause a compilation error
        
        System.out.println("\nUsing a reinitialize method instead:");
        product.reinitialize();
        product.displayInfo();
        
        System.out.println("\nTrying to call constructor from a method:");
        product.tryConstructorAgain();
        product.displayInfo(); // Note: the original object is unchanged
        
        System.out.println("\nThe only way to 'reuse' a constructor is to create a new object:");
        product = new Product(); // Reassigning the variable to a new object
        product.displayInfo();
    }
} 