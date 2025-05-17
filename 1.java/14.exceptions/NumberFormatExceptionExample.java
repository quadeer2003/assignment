public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        System.out.println("Demonstrating NumberFormatException");
        
        // Example 1: Parsing an invalid integer
        parseInvalidInteger();
        
        // Example 2: Parsing an invalid double
        parseInvalidDouble();
        
        // Example 3: Handling valid and invalid formats
        handleMixedInput();
        
        System.out.println("\nProgram completed");
    }
    
    private static void parseInvalidInteger() {
        System.out.println("\nExample 1: Parsing an invalid integer");
        
        try {
            String validNum = "123";
            System.out.println("Parsing valid number string: " + validNum);
            int number = Integer.parseInt(validNum);
            System.out.println("Successfully parsed: " + number);
            
            String invalidNum = "123abc";
            System.out.println("Attempting to parse invalid number string: " + invalidNum);
            
            // This will throw NumberFormatException
            number = Integer.parseInt(invalidNum);
            
            // This line won't execute due to the exception
            System.out.println("Successfully parsed: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
            System.out.println("Exception details: " + e);
        }
        
        try {
            String notANumber = "abc";
            System.out.println("\nAttempting to parse non-numeric string: " + notANumber);
            
            // This will throw NumberFormatException
            int number = Integer.parseInt(notANumber);
            
            // This line won't execute due to the exception
            System.out.println("Successfully parsed: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }
    }
    
    private static void parseInvalidDouble() {
        System.out.println("\nExample 2: Parsing an invalid double");
        
        try {
            String validDouble = "123.45";
            System.out.println("Parsing valid double string: " + validDouble);
            double number = Double.parseDouble(validDouble);
            System.out.println("Successfully parsed: " + number);
            
            String invalidDouble = "123.45.67";
            System.out.println("Attempting to parse invalid double string: " + invalidDouble);
            
            // This will throw NumberFormatException
            number = Double.parseDouble(invalidDouble);
            
            // This line won't execute due to the exception
            System.out.println("Successfully parsed: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }
    }
    
    private static void handleMixedInput() {
        System.out.println("\nExample 3: Handling valid and invalid formats");
        
        String[] inputs = {"100", "abc", "123.45", "100f", "-500", "1,000", " 42 "};
        
        System.out.println("Processing multiple inputs with validation:");
        
        for (String input : inputs) {
            processInput(input);
        }
    }
    
    private static void processInput(String input) {
        try {
            int number = Integer.parseInt(input);
            System.out.println("'" + input + "' is valid integer: " + number);
        } catch (NumberFormatException e) {
            // Try parsing as double if it's not a valid integer
            try {
                double doubleValue = Double.parseDouble(input);
                System.out.println("'" + input + "' is valid double: " + doubleValue);
            } catch (NumberFormatException e2) {
                System.out.println("'" + input + "' is not a valid number");
            }
        }
    }
} 