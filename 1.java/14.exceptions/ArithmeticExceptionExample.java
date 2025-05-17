public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        System.out.println("Demonstrating ArithmeticException");
        
        // Example 1: Division by zero
        divideByZero();
        
        // Example 2: Integer overflow
        integerOverflow();
        
        System.out.println("\nProgram completed");
    }
    
    private static void divideByZero() {
        System.out.println("\nExample 1: Division by zero");
        
        try {
            int numerator = 100;
            int denominator = 0;
            
            System.out.println("Attempting to divide " + numerator + " by " + denominator);
            int result = numerator / denominator;
            
            // This line won't execute due to the exception
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
            System.out.println("Exception details: " + e);
            e.printStackTrace(); // Prints stack trace to standard error
        }
    }
    
    private static void integerOverflow() {
        System.out.println("\nExample 2: Working with integer limits");
        
        try {
            int maxValue = Integer.MAX_VALUE;
            System.out.println("Maximum integer value: " + maxValue);
            
            System.out.println("Attempting to add 1 to maximum value");
            int result = maxValue + 1;
            
            // This will not throw an exception but will cause integer overflow
            // Java doesn't throw exceptions for integer overflow
            System.out.println("Result after adding 1: " + result);
            
            // Let's demonstrate another arithmetic operation
            System.out.println("\nAttempting integer division with remainder");
            int a = 10;
            int b = 3;
            int quotient = a / b;
            int remainder = a % b;
            
            System.out.println(a + " / " + b + " = " + quotient + " with remainder " + remainder);
            
            // Modulo by zero will also throw ArithmeticException
            System.out.println("Attempting to calculate remainder with divisor 0");
            int invalidRemainder = a % 0;
            
            // This line won't execute due to the exception
            System.out.println("Result: " + invalidRemainder);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
    }
} 