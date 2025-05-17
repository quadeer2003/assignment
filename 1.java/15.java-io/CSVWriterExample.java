import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVWriterExample {
    public static void main(String[] args) {
        // The path to the existing and output CSV files
        String inputFilePath = "employee_data.csv";
        String outputFilePath = "updated_employee_data.csv";
        
        System.out.println("CSV Writing Example");
        System.out.println("------------------");
        System.out.println("Reading from CSV file: " + inputFilePath);
        System.out.println("Writing to: " + outputFilePath);
        
        try {
            // First check if the input file exists, if not create a sample file
            if (!fileExists(inputFilePath)) {
                createSampleCSVFile(inputFilePath);
            }
            
            // Step 1: Read the existing CSV file
            List<String> lines = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();
            
            System.out.println("\nRead " + lines.size() + " lines from the CSV file.");
            
            // Step 2: Add new data
            System.out.println("\nAdding new employees to the CSV file:");
            
            // New data to add (two new employees)
            String[] newEmployees = {
                "106,David Lee,29,52000,Sales",
                "107,Emma White,34,65000,Product"
            };
            
            for (String employee : newEmployees) {
                lines.add(employee);
                System.out.println("Added: " + employee.replace(",", ", "));
            }
            
            // Step 3: Write back to a new CSV file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
            
            for (int i = 0; i < lines.size(); i++) {
                writer.write(lines.get(i));
                
                // Add a newline for all lines except the last one
                if (i < lines.size() - 1) {
                    writer.newLine();
                }
            }
            
            writer.close();
            
            System.out.println("\nCSV file has been updated and saved as: " + outputFilePath);
            System.out.println("Total lines in updated file: " + lines.size());
            
        } catch (IOException e) {
            System.err.println("Error working with CSV file: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    // Helper method to check if a file exists
    private static boolean fileExists(String filePath) {
        java.io.File file = new java.io.File(filePath);
        return file.exists() && !file.isDirectory();
    }
    
    // Helper method to create a sample CSV file
    private static void createSampleCSVFile(String filePath) throws IOException {
        System.out.println("\nCreating a sample CSV file since it doesn't exist...");
        
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
        
        // Write header
        writer.write("ID,Name,Age,Salary,Department");
        writer.newLine();
        
        // Write data rows
        writer.write("101,John Doe,30,50000,IT");
        writer.newLine();
        writer.write("102,Jane Smith,28,45000,HR");
        writer.newLine();
        writer.write("103,Bob Johnson,35,60000,Finance");
        writer.newLine();
        writer.write("104,Alice Brown,32,55000,Marketing");
        writer.newLine();
        writer.write("105,Charlie Wilson,40,70000,Operations");
        
        writer.close();
        System.out.println("Sample CSV file created successfully at: " + filePath);
    }
} 