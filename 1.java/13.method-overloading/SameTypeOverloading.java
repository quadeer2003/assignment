public class SameTypeOverloading {
    
    // Method with no parameters
    public void calculate() {
        System.out.println("calculate() called with no parameters");
        System.out.println("Result: 0");
    }
    
    // Method with one int parameter
    public void calculate(int a) {
        System.out.println("calculate(int) called with value: " + a);
        System.out.println("Result: " + a);
    }
    
    // Method with two int parameters
    public void calculate(int a, int b) {
        System.out.println("calculate(int, int) called with values: " + a + ", " + b);
        System.out.println("Result: " + (a + b));
    }
    
    // Method with three int parameters
    public void calculate(int a, int b, int c) {
        System.out.println("calculate(int, int, int) called with values: " + a + ", " + b + ", " + c);
        System.out.println("Result: " + (a + b + c));
    }
    
    public static void main(String[] args) {
        SameTypeOverloading demo = new SameTypeOverloading();
        
        System.out.println("1. Calling calculate() with no parameters:");
        demo.calculate();
        
        System.out.println("\n2. Calling calculate() with one parameter:");
        demo.calculate(10);
        
        System.out.println("\n3. Calling calculate() with two parameters:");
        demo.calculate(10, 20);
        
        System.out.println("\n4. Calling calculate() with three parameters:");
        demo.calculate(10, 20, 30);
    }
} 