import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileExample {
    public static void main(String[] args) {
        try {
            // First, create a properties file
            createPropertiesFile();
            
            // Reading from properties file
            Properties properties = new Properties();
            
            // Load properties from file
            FileInputStream inputStream = new FileInputStream("config.properties");
            properties.load(inputStream);
            
            // Display properties
            System.out.println("Reading properties from file:");
            System.out.println("database.url: " + properties.getProperty("database.url"));
            System.out.println("database.username: " + properties.getProperty("database.username"));
            System.out.println("database.password: " + properties.getProperty("database.password"));
            System.out.println("app.name: " + properties.getProperty("app.name"));
            System.out.println("app.version: " + properties.getProperty("app.version"));
            
            // Close input stream
            inputStream.close();
            
            System.out.println("\nProperties file reading completed successfully.");
            
        } catch (IOException e) {
            System.err.println("An error occurred while working with properties file: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    // Helper method to create a properties file for demonstration
    private static void createPropertiesFile() throws IOException {
        Properties properties = new Properties();
        
        // Set properties
        properties.setProperty("database.url", "jdbc:mysql://localhost:3306/mydatabase");
        properties.setProperty("database.username", "admin");
        properties.setProperty("database.password", "password123");
        properties.setProperty("app.name", "MyApplication");
        properties.setProperty("app.version", "1.0.0");
        
        // Save properties to file
        FileOutputStream outputStream = new FileOutputStream("config.properties");
        properties.store(outputStream, "Sample Properties File");
        outputStream.close();
        
        System.out.println("Properties file created successfully.");
    }
} 