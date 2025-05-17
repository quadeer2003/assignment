public class ArithmeticExceptionHandling {
    public static void main(String[] args) {
        System.out.println("Program started");
        
        int numerator = 10;
        int denominator = 0;
        int result = 0;
        
        try {
            System.out.println("Trying to divide " + numerator + " by " + denominator);
            
            // This operation would throw an ArithmeticException
            result = numerator / denominator;
            
            // This line won't execute if an exception occurs
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println("Cannot divide by zero");
            
            // Set a default value when exception occurs
            result = 0;
        }
        
        System.out.println("Final result: " + result);
        System.out.println("Program completed successfully");
        
        // Example with successful execution
        tryDivision(10, 2);
        
        // Example with exception
        tryDivision(20, 0);
    }
    
    public static void tryDivision(int num, int denom) {
        System.out.println("\nTrying another division: " + num + " / " + denom);
        
        try {
            int result = num / denom;
            System.out.println("Division successful! Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division failed! " + e.getMessage());
        }
    }
} 