import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLExceptionExample {
    
    // Database connection details
    private static final String URL = "jdbc:mysql://localhost:3306/nonexistent_db";
    private static final String USER = "root";
    private static final String PASSWORD = "password";
    
    public static void main(String[] args) {
        System.out.println("Demonstrating SQLException");
        
        // Example 1: Connection to non-existent database
        connectToNonExistentDB();
        
        // Example 2: Incorrect SQL syntax
        executeIncorrectSQL();
        
        // Example 3: Using try-with-resources to handle database resources
        tryWithResourcesExample();
        
        System.out.println("\nProgram completed");
    }
    
    private static void connectToNonExistentDB() {
        System.out.println("\nExample 1: Connection to non-existent database");
        
        Connection connection = null;
        
        try {
            System.out.println("Attempting to connect to database: " + URL);
            
            // This will throw SQLException because the database doesn't exist
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            
            // This line won't execute due to the exception
            System.out.println("Connected successfully");
        } catch (SQLException e) {
            System.out.println("SQLException caught: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("Error Code: " + e.getErrorCode());
            
            // Print the stack trace
            System.out.println("Stack trace:");
            e.printStackTrace(System.out);
        } finally {
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                    System.out.println("Database connection closed");
                }
            } catch (SQLException e) {
                System.out.println("Error closing connection: " + e.getMessage());
            }
        }
    }
    
    private static void executeIncorrectSQL() {
        System.out.println("\nExample 2: Incorrect SQL syntax");
        
        // For this example, we'll just simulate a connection and an error
        // since we can't actually connect to a real database in this demo
        
        try {
            System.out.println("Simulating execution of SQL with incorrect syntax");
            
            // In a real application, this would be a real connection
            // connection = DriverManager.getConnection(URL, USER, PASSWORD);
            
            // Simulating a SQLException with a SQL syntax error
            throw new SQLException("You have an error in your SQL syntax; check the manual " +
                  "that corresponds to your MySQL server version for the right syntax to use near " +
                  "'SELCT * FROM users' at line 1", "42000", 1064);
        } catch (SQLException e) {
            System.out.println("SQLException caught: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("Error Code: " + e.getErrorCode());
        }
    }
    
    private static void tryWithResourcesExample() {
        System.out.println("\nExample 3: Using try-with-resources to handle database resources");
        
        // This method demonstrates the proper way to handle SQL resources
        // using try-with-resources, though it won't actually connect to a database
        
        // URL for a valid database in a real scenario
        String validURL = "jdbc:mysql://localhost:3306/valid_db";
        
        System.out.println("Demonstrating try-with-resources pattern (would be used with a valid database)");
        
        // In a real application, this would actually create these resources
        try {
            // Simulating a try-with-resources block
            System.out.println("Connection would be established here");
            System.out.println("Statements would be created and executed here");
            System.out.println("Resources would be automatically closed at the end of this block");
            
            // Simulating an SQL error during execution
            throw new SQLException("Table 'users' doesn't exist", "42S02", 1146);
        } catch (SQLException e) {
            System.out.println("\nSQLException caught: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("Error Code: " + e.getErrorCode());
            
            // In a real application, check for specific SQL states or error codes
            if ("42S02".equals(e.getSQLState())) {
                System.out.println("This error indicates that a table doesn't exist");
                System.out.println("You might need to run your database migrations or schema setup");
            }
        }
    }
    
    // This method shows how you would typically use try-with-resources in a real application
    // It won't be called in this example since we don't have a real database
    private static void realWorldExample() {
        String query = "SELECT id, name FROM users WHERE age > ?";
        
        try (
            // Resources declared here will be automatically closed
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(query)
        ) {
            stmt.setInt(1, 18); // Set parameter value
            
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    System.out.println("User: " + id + " - " + name);
                }
            }
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
} 