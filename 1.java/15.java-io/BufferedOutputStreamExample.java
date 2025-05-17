import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {
    public static void main(String[] args) {
        try {
            // Create a FileOutputStream
            FileOutputStream fileOutputStream = new FileOutputStream("buffered_output_sample.txt");
            
            // Create a BufferedOutputStream
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            
            // Create a string to write
            String data = "This is a sample text file for BufferedOutputStream.\n";
            data += "BufferedOutputStream improves performance by buffering the output bytes.\n";
            data += "It reduces the number of calls to the native API, improving efficiency.";
            
            // Convert string to bytes
            byte[] dataBytes = data.getBytes();
            
            // Write bytes to file
            bufferedOutputStream.write(dataBytes);
            
            // Flush and close streams
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            fileOutputStream.close();
            
            System.out.println("Data has been written to the file successfully using BufferedOutputStream.");
            
            // Display the content that was written
            System.out.println("\nContent written to file:");
            System.out.println(data);
            
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
} 