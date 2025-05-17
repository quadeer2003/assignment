public class ArithmeticExceptionNoHandling {
    public static void main(String[] args) {
        System.out.println("Program started");
        
        int numerator = 10;
        int denominator = 0;
        
        System.out.println("Trying to divide " + numerator + " by " + denominator);
        
        // This will throw an ArithmeticException
        int result = numerator / denominator;
        
        // The following code will not be executed due to the exception
        System.out.println("Result: " + result);
        System.out.println("Program completed successfully");
    }
} 