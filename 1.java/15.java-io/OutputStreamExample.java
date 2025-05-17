import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample {
    public static void main(String[] args) {
        try {
            // Create an OutputStream
            OutputStream outputStream = new FileOutputStream("output_stream_sample.txt");
            
            // Create a string to write
            String data = "This is a sample text file.\n";
            data += "It is being written using FileOutputStream.\n";
            data += "OutputStream writes data byte by byte.";
            
            // Convert the string to bytes
            byte[] dataBytes = data.getBytes();
            
            // Write bytes to file
            outputStream.write(dataBytes);
            
            // Close the stream
            outputStream.close();
            System.out.println("Data has been written to the file successfully using OutputStream.");
            
            // Display the content that was written
            System.out.println("\nContent written to file:");
            System.out.println(data);
            
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
} 