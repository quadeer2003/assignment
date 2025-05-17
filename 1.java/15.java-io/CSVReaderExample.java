import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReaderExample {
    public static void main(String[] args) {
        // The path to the CSV file
        String filePath = "employee_data.csv";
        
        System.out.println("CSV Reading Example");
        System.out.println("------------------");
        System.out.println("Reading from CSV file: " + filePath);
        
        try {
            // Create FileReader and BufferedReader for efficient reading
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            System.out.println("\nData from CSV file:");
            System.out.println("------------------");
            
            // Read the header line
            String line = bufferedReader.readLine();
            if (line != null) {
                System.out.println(line.replace(",", "\t\t")); // Display header with tab separation
                System.out.println("--------------------------------------------------");
            }
            
            // Read and display each line
            while ((line = bufferedReader.readLine()) != null) {
                // Replace commas with tabs for better display formatting
                System.out.println(line.replace(",", "\t\t"));
            }
            
            // Close resources
            bufferedReader.close();
            fileReader.close();
            
            System.out.println("\nCSV file reading completed successfully.");
            
        } catch (IOException e) {
            System.err.println("Error reading CSV file: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    // Optional method to create a sample CSV file
    // You can call this method if the CSV file doesn't exist
    private static void createSampleCSVFile(String filePath) throws IOException {
        java.io.FileWriter fileWriter = new java.io.FileWriter(filePath);
        
        // Write header
        fileWriter.write("ID,Name,Age,Salary,Department\n");
        
        // Write data rows
        fileWriter.write("101,John Doe,30,50000,IT\n");
        fileWriter.write("102,Jane Smith,28,45000,HR\n");
        fileWriter.write("103,Bob Johnson,35,60000,Finance\n");
        fileWriter.write("104,Alice Brown,32,55000,Marketing\n");
        fileWriter.write("105,Charlie Wilson,40,70000,Operations\n");
        
        fileWriter.close();
        System.out.println("Sample CSV file created successfully at: " + filePath);
    }
} 