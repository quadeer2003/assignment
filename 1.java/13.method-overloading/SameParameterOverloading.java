public class SameParameterOverloading {
    
    // This example attempts to have two methods with the same name and parameter types
    // However, this is not valid method overloading since the signature is the same
    // The methods are commented out to avoid compilation errors
    
    public void display(int number) {
        System.out.println("First display method: " + number);
    }
    
    /*
    // This would cause a compilation error - methods have same signature
    public void display(int value) {
        System.out.println("Second display method: " + value);
    }
    */
    
    // Method that differs only by parameter name is not valid overloading
    // However, we can use different parameter names in valid overloaded methods
    
    public void process(int x) {
        System.out.println("Processing single integer: " + x);
    }
    
    public void process(int x, int y) {
        System.out.println("Processing two integers: " + x + ", " + y);
    }
    
    // These two methods have the same number of parameters but different types
    // This is valid method overloading
    
    public void analyze(int number) {
        System.out.println("Analyzing integer: " + number);
    }
    
    public void analyze(String text) {
        System.out.println("Analyzing string: " + text);
    }
    
    public static void main(String[] args) {
        SameParameterOverloading demo = new SameParameterOverloading();
        
        System.out.println("1. Calling single method with parameter named 'number':");
        demo.display(100);
        
        System.out.println("\n2. Calling process() with one parameter:");
        demo.process(50);
        
        System.out.println("\n3. Calling process() with two parameters:");
        demo.process(10, 20);
        
        System.out.println("\n4. Calling analyze() with int parameter:");
        demo.analyze(500);
        
        System.out.println("\n5. Calling analyze() with String parameter:");
        demo.analyze("Test String");
        
        System.out.println("\nNotice: Methods with same parameter types but different parameter names");
        System.out.println("would cause a compilation error. This is not valid method overloading.");
    }
} 