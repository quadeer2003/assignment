import java.lang.reflect.Method;

public class NoSuchMethodExceptionExample {
    // Class with methods for demonstration
    static class Calculator {
        public int add(int a, int b) {
            return a + b;
        }
        
        private double multiply(double a, double b) {
            return a * b;
        }
        
        protected void printResult(String operation, double result) {
            System.out.println(operation + ": " + result);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Demonstrating NoSuchMethodException");
        
        // Example 1: Accessing a non-existent method
        accessNonExistentMethod();
        
        // Example 2: Accessing a method with incorrect parameters
        accessMethodWithIncorrectParameters();
        
        // Example 3: Accessing a private method
        accessPrivateMethod();
        
        // Example 4: Successfully accessing and invoking a method
        accessExistingMethod();
        
        System.out.println("\nProgram completed");
    }
    
    private static void accessNonExistentMethod() {
        System.out.println("\nExample 1: Accessing a non-existent method");
        
        try {
            System.out.println("Attempting to access non-existent method 'subtract'");
            // This will throw NoSuchMethodException
            Method method = Calculator.class.getMethod("subtract", int.class, int.class);
            
            // This line won't execute due to the exception
            System.out.println("Method found: " + method.getName());
        } catch (NoSuchMethodException e) {
            System.out.println("NoSuchMethodException caught: " + e.getMessage());
            System.out.println("Exception details: " + e);
        }
    }
    
    private static void accessMethodWithIncorrectParameters() {
        System.out.println("\nExample 2: Accessing a method with incorrect parameters");
        
        try {
            System.out.println("Attempting to access 'add' method with incorrect parameter types");
            // This will throw NoSuchMethodException because add takes int parameters, not String
            Method method = Calculator.class.getMethod("add", String.class, String.class);
            
            // This line won't execute due to the exception
            System.out.println("Method found: " + method.getName());
        } catch (NoSuchMethodException e) {
            System.out.println("NoSuchMethodException caught: " + e.getMessage());
        }
        
        try {
            System.out.println("\nAttempting to access 'add' method without parameters");
            // This will throw NoSuchMethodException because add requires two parameters
            Method method = Calculator.class.getMethod("add");
            
            // This line won't execute due to the exception
            System.out.println("Method found: " + method.getName());
        } catch (NoSuchMethodException e) {
            System.out.println("NoSuchMethodException caught: " + e.getMessage());
        }
    }
    
    private static void accessPrivateMethod() {
        System.out.println("\nExample 3: Accessing a private method");
        
        try {
            System.out.println("Attempting to access private method 'multiply' using getMethod()");
            // This will throw NoSuchMethodException because getMethod() only finds public methods
            Method method = Calculator.class.getMethod("multiply", double.class, double.class);
            
            // This line won't execute due to the exception
            System.out.println("Method found: " + method.getName());
        } catch (NoSuchMethodException e) {
            System.out.println("NoSuchMethodException caught: " + e.getMessage());
        }
        
        try {
            System.out.println("\nAttempting to access private method 'multiply' using getDeclaredMethod()");
            // This will work because getDeclaredMethod() finds all methods regardless of access modifier
            Method method = Calculator.class.getDeclaredMethod("multiply", double.class, double.class);
            
            System.out.println("Method found using getDeclaredMethod(): " + method.getName());
            System.out.println("Return type: " + method.getReturnType().getName());
            
            // Create Calculator instance to invoke the method
            Calculator calculator = new Calculator();
            
            // Need to make private method accessible
            method.setAccessible(true);
            double result = (double) method.invoke(calculator, 4.5, 2.0);
            
            System.out.println("Method result: " + result);
        } catch (NoSuchMethodException e) {
            System.out.println("NoSuchMethodException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Other exception caught: " + e.getMessage());
        }
    }
    
    private static void accessExistingMethod() {
        System.out.println("\nExample 4: Successfully accessing and invoking a method");
        
        try {
            System.out.println("Attempting to access public method 'add'");
            
            // This will work because 'add' is a public method
            Method method = Calculator.class.getMethod("add", int.class, int.class);
            
            System.out.println("Method found: " + method.getName());
            System.out.println("Return type: " + method.getReturnType().getName());
            System.out.println("Parameter count: " + method.getParameterCount());
            
            // Create Calculator instance to invoke the method
            Calculator calculator = new Calculator();
            int result = (int) method.invoke(calculator, 10, 20);
            
            System.out.println("Method result: " + result);
        } catch (NoSuchMethodException e) {
            System.out.println("NoSuchMethodException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Other exception caught: " + e.getMessage());
        }
    }
} 