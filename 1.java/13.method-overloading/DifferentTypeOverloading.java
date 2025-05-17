public class DifferentTypeOverloading {
    
    // Method with no parameters
    public void process() {
        System.out.println("process() called with no parameters");
        System.out.println("Default processing");
    }
    
    // Method with one int parameter
    public void process(int number) {
        System.out.println("process(int) called with value: " + number);
        System.out.println("Processing integer: " + number);
    }
    
    // Method with one String parameter
    public void process(String text) {
        System.out.println("process(String) called with value: " + text);
        System.out.println("Processing string of length: " + text.length());
    }
    
    // Method with one int and one String parameter
    public void process(int number, String text) {
        System.out.println("process(int, String) called with values: " + number + ", " + text);
        System.out.println("Processing integer " + number + " with string: " + text);
    }
    
    // Method with one String and one double parameter
    public void process(String text, double value) {
        System.out.println("process(String, double) called with values: " + text + ", " + value);
        System.out.println("Processing string: " + text + " with double value: " + value);
    }
    
    public static void main(String[] args) {
        DifferentTypeOverloading demo = new DifferentTypeOverloading();
        
        System.out.println("1. Calling process() with no parameters:");
        demo.process();
        
        System.out.println("\n2. Calling process() with one int parameter:");
        demo.process(100);
        
        System.out.println("\n3. Calling process() with one String parameter:");
        demo.process("Hello World");
        
        System.out.println("\n4. Calling process() with int and String parameters:");
        demo.process(200, "Processing data");
        
        System.out.println("\n5. Calling process() with String and double parameters:");
        demo.process("Temperature", 98.6);
    }
}