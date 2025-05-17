import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        
        try {
            System.out.println("Starting program execution");
            
            // Potential ArithmeticException
            int result = 10 / 0;
            System.out.println("Result: " + result); // Won't execute due to exception
            
            // Potential ArrayIndexOutOfBoundsException
            int[] numbers = {1, 2, 3};
            System.out.println("Value at index 5: " + numbers[5]); // Won't execute
            
            // Potential FileNotFoundException (subclass of IOException)
            fileInputStream = new FileInputStream("nonexistent.txt");
            System.out.println("File opened successfully"); // Won't execute
            
            // Potential IOException
            int data = fileInputStream.read();
            System.out.println("Data read: " + data); // Won't execute
            
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException caught: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        } catch (Exception e) {
            // Generic catch block for any other exceptions
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Executing finally block");
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                    System.out.println("File input stream closed");
                } catch (IOException e) {
                    System.out.println("Error closing file input stream: " + e.getMessage());
                }
            }
        }
        
        System.out.println("Program completed");
        
        // Demonstrate which catch block is executed for different exceptions
        demonstrateDivisionByZero();
        demonstrateArrayIndexOutOfBounds();
        demonstrateFileNotFound();
    }
    
    private static void demonstrateDivisionByZero() {
        System.out.println("\nDemonstrating ArithmeticException:");
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Generic Exception caught: " + e.getMessage());
        }
    }
    
    private static void demonstrateArrayIndexOutOfBounds() {
        System.out.println("\nDemonstrating ArrayIndexOutOfBoundsException:");
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Value at index 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Generic Exception caught: " + e.getMessage());
        }
    }
    
    private static void demonstrateFileNotFound() {
        System.out.println("\nDemonstrating FileNotFoundException:");
        try {
            FileInputStream fileInputStream = new FileInputStream("nonexistent.txt");
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException caught: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Generic Exception caught: " + e.getMessage());
        }
    }
} 