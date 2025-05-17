import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try {
            // Create a FileWriter
            FileWriter fileWriter = new FileWriter("file_writer_sample.txt");
            
            // Content to write
            String content = "This is a sample text file for FileWriter.\n";
            content += "FileWriter is a character stream class used to write text files.\n";
            content += "It writes text in the default character encoding.";
            
            // Write content to file
            fileWriter.write(content);
            
            // Close the writer
            fileWriter.close();
            
            System.out.println("Data has been written to the file successfully using FileWriter.");
            
            // Display the content that was written
            System.out.println("\nContent written to file:");
            System.out.println(content);
            
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
} 