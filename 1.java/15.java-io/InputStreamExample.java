import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {
    public static void main(String[] args) {
        try {
            // Create a sample file first
            createSampleFile();
            
            // Reading from file using InputStream
            InputStream inputStream = new FileInputStream("sample.txt");
            System.out.println("Reading file content using InputStream:");
            
            int data;
            // Read byte by byte
            while ((data = inputStream.read()) != -1) {
                // Convert byte to char and print
                System.out.print((char) data);
            }
            
            // Close the stream
            inputStream.close();
            System.out.println("\nFile reading completed successfully.");
            
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    // Helper method to create a sample file for demonstration
    private static void createSampleFile() throws IOException {
        java.io.FileWriter writer = new java.io.FileWriter("sample.txt");
        writer.write("This is a sample text file.\n");
        writer.write("It is being read using FileInputStream.\n");
        writer.write("InputStream reads data byte by byte.");
        writer.close();
        System.out.println("Sample file created successfully.");
    }
} 