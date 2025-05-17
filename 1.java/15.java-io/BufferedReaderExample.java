import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) {
        try {
            // Create a sample file first
            createSampleFile();
            
            // Create a FileReader
            FileReader fileReader = new FileReader("buffered_reader_sample.txt");
            
            // Create a BufferedReader
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            System.out.println("Reading file content using BufferedReader:");
            
            String line;
            // Read line by line
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            
            // Close the readers
            bufferedReader.close();
            fileReader.close();
            
            System.out.println("\nFile reading completed successfully.");
            
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    // Helper method to create a sample file for demonstration
    private static void createSampleFile() throws IOException {
        java.io.FileWriter writer = new java.io.FileWriter("buffered_reader_sample.txt");
        writer.write("This is a sample text file for BufferedReader.\n");
        writer.write("BufferedReader is a character stream class that reads text efficiently.\n");
        writer.write("It buffers characters for efficient reading of text files.\n");
        writer.write("It provides convenient methods like readLine() to read a line at a time.");
        writer.close();
        System.out.println("Sample file created successfully.");
    }
} 