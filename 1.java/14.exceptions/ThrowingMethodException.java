import java.io.IOException;

public class ThrowingMethodException {
    
    // This method declares that it throws an IOException
    public static void readFile(String fileName) throws IOException {
        if (fileName == null || fileName.isEmpty()) {
            // Throwing an IOException explicitly
            throw new IOException("File name cannot be null or empty");
        }
        
        // Simulating file operations
        System.out.println("Reading file: " + fileName);
        
        if (!fileName.endsWith(".txt")) {
            // Throwing another IOException with a different message
            throw new IOException("File must be a text file (.txt)");
        }
        
        System.out.println("File read successfully");
    }
    
    // Main method declares that it throws IOException
    // This allows us to call methods that throw exceptions without try-catch
    public static void main(String[] args) throws IOException {
        System.out.println("Program started");
        
        // Calling the method without try-catch
        // Since main declares "throws IOException", the exception will
        // be propagated to the JVM if it occurs
        readFile("example.txt");
        
        System.out.println("First file operation completed");
        
        // This will throw an exception
        readFile("data.csv");
        
        // This code will not execute if the exception occurs
        System.out.println("Program completed successfully");
    }
} 