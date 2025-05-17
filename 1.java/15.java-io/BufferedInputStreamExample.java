import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExample {
    public static void main(String[] args) {
        try {
            // Create a sample file first
            createSampleFile();
            
            // Create a FileInputStream
            FileInputStream fileInputStream = new FileInputStream("buffered_sample.txt");
            
            // Create a BufferedInputStream
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            
            System.out.println("Reading file content using BufferedInputStream:");
            
            // Buffer to read data in chunks
            byte[] buffer = new byte[1024];
            int bytesRead;
            
            // Read data into buffer
            while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {
                // Convert bytes to string and print
                System.out.print(new String(buffer, 0, bytesRead));
            }
            
            // Close streams
            bufferedInputStream.close();
            fileInputStream.close();
            
            System.out.println("\nFile reading completed successfully.");
            
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    // Helper method to create a sample file for demonstration
    private static void createSampleFile() throws IOException {
        java.io.FileWriter writer = new java.io.FileWriter("buffered_sample.txt");
        writer.write("This is a sample text file for BufferedInputStream.\n");
        writer.write("BufferedInputStream improves performance by buffering the input bytes.\n");
        writer.write("It reduces the number of calls to the native API, improving efficiency.");
        writer.close();
        System.out.println("Sample file created successfully.");
    }
} 