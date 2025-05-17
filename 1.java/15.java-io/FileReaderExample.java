import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        try {
            // Create a sample file first
            createSampleFile();
            
            // Create a FileReader
            FileReader fileReader = new FileReader("file_reader_sample.txt");
            
            System.out.println("Reading file content using FileReader:");
            
            int character;
            // Read character by character
            while ((character = fileReader.read()) != -1) {
                // Print each character
                System.out.print((char) character);
            }
            
            // Close the reader
            fileReader.close();
            
            System.out.println("\nFile reading completed successfully.");
            
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    // Helper method to create a sample file for demonstration
    private static void createSampleFile() throws IOException {
        java.io.FileWriter writer = new java.io.FileWriter("file_reader_sample.txt");
        writer.write("This is a sample text file for FileReader.\n");
        writer.write("FileReader is a character stream class that reads text files.\n");
        writer.write("It reads text files in the default character encoding.");
        writer.close();
        System.out.println("Sample file created successfully.");
    }
} 