import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        System.out.println("Demonstrating FileNotFoundException");
        
        // Example 1: Opening a non-existent file with FileInputStream
        openNonExistentFile();
        
        // Example 2: Opening a non-existent file with FileReader
        openWithFileReader();
        
        // Example 3: Opening a file with incorrect path
        openWithIncorrectPath();
        
        System.out.println("\nProgram completed");
    }
    
    private static void openNonExistentFile() {
        System.out.println("\nExample 1: Opening a non-existent file with FileInputStream");
        
        try {
            System.out.println("Attempting to open 'nonexistent.txt'");
            FileInputStream fis = new FileInputStream("nonexistent.txt");
            
            // This line won't execute due to the exception
            System.out.println("File opened successfully");
            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException caught: " + e.getMessage());
            System.out.println("Exception details: " + e);
        } catch (Exception e) {
            System.out.println("Other exception caught: " + e.getMessage());
        }
    }
    
    private static void openWithFileReader() {
        System.out.println("\nExample 2: Opening a non-existent file with FileReader");
        
        try {
            System.out.println("Attempting to open 'imaginary_file.dat'");
            FileReader fr = new FileReader("imaginary_file.dat");
            
            // This line won't execute due to the exception
            System.out.println("File opened successfully");
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Other exception caught: " + e.getMessage());
        }
    }
    
    private static void openWithIncorrectPath() {
        System.out.println("\nExample 3: Opening a file with incorrect path");
        
        try {
            // Incorrect path (directory that doesn't exist)
            String invalidPath = "/nonexistent_directory/sample.txt";
            System.out.println("Attempting to open file with invalid path: " + invalidPath);
            
            File file = new File(invalidPath);
            FileInputStream fis = new FileInputStream(file);
            
            // This line won't execute due to the exception
            System.out.println("File opened successfully");
            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException caught: " + e.getMessage());
            
            // Additional information
            System.out.println("Stack trace:");
            e.printStackTrace(System.out);
        } catch (Exception e) {
            System.out.println("Other exception caught: " + e.getMessage());
        }
    }
} 