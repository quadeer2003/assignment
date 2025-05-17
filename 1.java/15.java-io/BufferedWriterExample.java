import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        try {
            // Create a FileWriter
            FileWriter fileWriter = new FileWriter("buffered_writer_sample.txt");
            
            // Create a BufferedWriter
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
            // Content to write
            String[] lines = {
                "This is a sample text file for BufferedWriter.",
                "BufferedWriter is a character stream class that writes text efficiently.",
                "It buffers characters for efficient writing to text files.",
                "It provides convenient methods like newLine() to write line separators."
            };
            
            // Write content to file line by line
            for (String line : lines) {
                bufferedWriter.write(line);
                bufferedWriter.newLine(); // Add a line separator
            }
            
            // Close writers
            bufferedWriter.close();
            fileWriter.close();
            
            System.out.println("Data has been written to the file successfully using BufferedWriter.");
            
            // Display the content that was written
            System.out.println("\nContent written to file:");
            for (String line : lines) {
                System.out.println(line);
            }
            
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
} 