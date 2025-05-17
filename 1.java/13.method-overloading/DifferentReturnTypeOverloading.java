public class DifferentReturnTypeOverloading {
    
    // Method that returns an int
    public int getValue() {
        System.out.println("getValue() called - returning int");
        return 100;
    }
    
    /* 
    // This would cause a compilation error - methods differ only by return type
    public double getValue() {
        System.out.println("getValue() called - returning double");
        return 100.5;
    }
    */
    
    // Method with parameters returning int
    public int calculate(int a, int b) {
        System.out.println("calculate(int, int) called - returning int");
        return a + b;
    }
    
    /*
    // This would cause a compilation error - methods differ only by return type
    public double calculate(int a, int b) {
        System.out.println("calculate(int, int) called - returning double");
        return a + b + 0.5;
    }
    */
    
    // These are valid overloaded methods because the parameter types are different
    public int getData(int value) {
        System.out.println("getData(int) called - returning int");
        return value * 2;
    }
    
    public double getData(double value) {
        System.out.println("getData(double) called - returning double");
        return value * 2;
    }
    
    public String getData(String value) {
        System.out.println("getData(String) called - returning String");
        return value + value;
    }
    
    public static void main(String[] args) {
        DifferentReturnTypeOverloading demo = new DifferentReturnTypeOverloading();
        
        System.out.println("1. Calling getValue():");
        int intValue = demo.getValue();
        System.out.println("Value returned: " + intValue);
        
        System.out.println("\n2. Calling calculate() with int parameters:");
        int result = demo.calculate(10, 20);
        System.out.println("Result: " + result);
        
        System.out.println("\n3. Calling getData() with different parameter types:");
        
        int intResult = demo.getData(5);
        System.out.println("Int result: " + intResult);
        
        double doubleResult = demo.getData(5.5);
        System.out.println("Double result: " + doubleResult);
        
        String stringResult = demo.getData("Hello");
        System.out.println("String result: " + stringResult);
        
        System.out.println("\nNote: Method overloading in Java requires different parameter types.");
        System.out.println("Methods cannot be overloaded by return type alone.");
    }
} 