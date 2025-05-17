import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class IOExceptionExample {
    public static void main(String[] args) {
        System.out.println("Demonstrating IOException");
        
        // Example 1: Reading from a file that exists but has issues
        readFromFile();
        
        // Example 2: Writing to a file in a location without permission
        writeToRestrictedFile();
        
        // Example 3: Connecting to a non-existent URL
        connectToInvalidURL();
        
        System.out.println("\nProgram completed");
    }
    
    private static void readFromFile() {
        System.out.println("\nExample 1: Reading from a file");
        FileInputStream fileInputStream = null;
        
        try {
            // First create a test file
            createTestFile();
            
            File file = new File("test_file.txt");
            System.out.println("Attempting to read from: " + file.getAbsolutePath());
            
            fileInputStream = new FileInputStream(file);
            
            // Trying to read more data than is available in the file
            // This would normally just return -1 at end of file, not throw an exception
            byte[] buffer = new byte[1024];
            int bytesRead = fileInputStream.read(buffer);
            
            System.out.println("Bytes read: " + bytesRead);
            
            // Let's simulate an IO error by closing the stream and then trying to read again
            fileInputStream.close();
            System.out.println("File stream closed");
            
            System.out.println("Attempting to read from closed stream");
            // This will throw IOException
            bytesRead = fileInputStream.read(buffer);
            
            // This line won't execute due to the exception
            System.out.println("Bytes read after closing: " + bytesRead);
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                System.out.println("IOException while closing stream: " + e.getMessage());
            }
            
            // Clean up the test file
            File file = new File("test_file.txt");
            if (file.exists()) {
                file.delete();
            }
        }
    }
    
    private static void writeToRestrictedFile() {
        System.out.println("\nExample 2: Writing to a restricted file");
        
        try {
            // Trying to write to a location that typically requires elevated permissions
            // This may not always throw an exception depending on your OS and permissions
            String restrictedPath = "/system/restricted_file.txt";
            File restrictedFile = new File(restrictedPath);
            
            System.out.println("Attempting to write to: " + restrictedFile.getAbsolutePath());
            
            FileOutputStream fos = new FileOutputStream(restrictedFile);
            
            // This line won't execute if the FileOutputStream constructor throws an exception
            fos.write("Test data".getBytes());
            fos.close();
            
            System.out.println("Successfully wrote to file");
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }
    
    private static void connectToInvalidURL() {
        System.out.println("\nExample 3: Connecting to an invalid URL");
        
        try {
            // Invalid URL format
            System.out.println("Attempting to connect to invalid URL format");
            URL url = new URL("http://this.is.not.a.valid.domain.name.12345");
            
            System.out.println("Opening connection to: " + url.toString());
            URLConnection connection = url.openConnection();
            connection.connect();
            
            // Read from the connection
            InputStream inputStream = connection.getInputStream();
            
            // This line won't execute due to the exception
            System.out.println("Connected successfully");
            inputStream.close();
        } catch (MalformedURLException e) {
            // Subclass of IOException for URL format issues
            System.out.println("MalformedURLException caught: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }
    
    private static void createTestFile() throws IOException {
        File file = new File("test_file.txt");
        OutputStream os = new FileOutputStream(file);
        os.write("Test data for IOException example".getBytes());
        os.close();
    }
} 