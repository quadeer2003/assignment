import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyBlockExample {
    public static void main(String[] args) {
        System.out.println("Program started");
        
        // Example 1: Basic try-catch-finally
        basicTryCatchFinally();
        
        // Example 2: Finally with successful try block
        finallyWithSuccess();
        
        // Example 3: Finally with return statement
        System.out.println("\nExample 3: Finally with return statement");
        int result = finallyWithReturn();
        System.out.println("Result from method: " + result);
        
        // Example 4: File handling with finally
        fileHandlingWithFinally();
        
        System.out.println("\nProgram completed");
    }
    
    private static void basicTryCatchFinally() {
        System.out.println("\nExample 1: Basic try-catch-finally");
        
        try {
            System.out.println("Inside try block");
            int result = 10 / 0; // ArithmeticException
            System.out.println("This won't execute");
        } catch (ArithmeticException e) {
            System.out.println("Inside catch block");
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Inside finally block - This always executes");
        }
    }
    
    private static void finallyWithSuccess() {
        System.out.println("\nExample 2: Finally with successful try block");
        
        try {
            System.out.println("Inside try block");
            int result = 10 / 2; // No exception
            System.out.println("Calculation successful: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Inside catch block");
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Inside finally block - This always executes");
        }
    }
    
    private static int finallyWithReturn() {
        try {
            System.out.println("Inside try block");
            return 10; // This won't prevent finally from executing
        } catch (Exception e) {
            System.out.println("Inside catch block");
            return 20; // This won't prevent finally from executing
        } finally {
            System.out.println("Inside finally block - still executes with return statement");
            // Note: If we had a return statement here, it would override the return from try/catch
        }
    }
    
    private static void fileHandlingWithFinally() {
        System.out.println("\nExample 4: File handling with finally");
        FileInputStream fileInputStream = null;
        
        try {
            System.out.println("Trying to open a file");
            fileInputStream = new FileInputStream("nonexistent.txt");
            System.out.println("File opened successfully"); // Won't execute
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } finally {
            System.out.println("Executing finally block - cleaning up resources");
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    System.out.println("Error closing file: " + e.getMessage());
                }
            }
            System.out.println("Resource cleanup completed");
        }
    }
} 