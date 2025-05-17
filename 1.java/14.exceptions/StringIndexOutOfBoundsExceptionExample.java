public class StringIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        System.out.println("Demonstrating StringIndexOutOfBoundsException");
        
        // Example 1: Accessing character at an invalid index
        accessInvalidCharIndex();
        
        // Example 2: Substring with invalid bounds
        substringWithInvalidBounds();
        
        // Example 3: Handling string operations safely
        handleStringOperationsSafely();
        
        System.out.println("\nProgram completed");
    }
    
    private static void accessInvalidCharIndex() {
        System.out.println("\nExample 1: Accessing character at an invalid index");
        
        try {
            String text = "Hello";
            System.out.println("String: \"" + text + "\", length: " + text.length());
            
            System.out.println("Accessing valid index 0: " + text.charAt(0));
            System.out.println("Accessing valid index 4: " + text.charAt(4));
            
            System.out.println("Attempting to access invalid index 5");
            
            // This will throw StringIndexOutOfBoundsException
            char ch = text.charAt(5);
            
            // This line won't execute due to the exception
            System.out.println("Character at index 5: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
            System.out.println("Exception details: " + e);
        }
        
        try {
            String text = "Java";
            System.out.println("\nString: \"" + text + "\", length: " + text.length());
            
            System.out.println("Attempting to access negative index -1");
            
            // This will throw StringIndexOutOfBoundsException
            char ch = text.charAt(-1);
            
            // This line won't execute due to the exception
            System.out.println("Character at index -1: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
    
    private static void substringWithInvalidBounds() {
        System.out.println("\nExample 2: Substring with invalid bounds");
        
        try {
            String text = "Exception";
            System.out.println("String: \"" + text + "\", length: " + text.length());
            
            System.out.println("Valid substring(0, 5): \"" + text.substring(0, 5) + "\"");
            
            System.out.println("Attempting substring with end index > length: substring(5, 15)");
            
            // This will throw StringIndexOutOfBoundsException
            String sub = text.substring(5, 15);
            
            // This line won't execute due to the exception
            System.out.println("Substring: \"" + sub + "\"");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
        }
        
        try {
            String text = "Programming";
            System.out.println("\nString: \"" + text + "\", length: " + text.length());
            
            System.out.println("Attempting substring with beginIndex > endIndex: substring(8, 3)");
            
            // This will throw StringIndexOutOfBoundsException
            String sub = text.substring(8, 3);
            
            // This line won't execute due to the exception
            System.out.println("Substring: \"" + sub + "\"");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
        }
        
        try {
            String text = "Java";
            System.out.println("\nString: \"" + text + "\", length: " + text.length());
            
            System.out.println("Attempting substring with negative index: substring(-1, 2)");
            
            // This will throw StringIndexOutOfBoundsException
            String sub = text.substring(-1, 2);
            
            // This line won't execute due to the exception
            System.out.println("Substring: \"" + sub + "\"");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
    
    private static void handleStringOperationsSafely() {
        System.out.println("\nExample 3: Handling string operations safely");
        
        String text = "Hello, World!";
        System.out.println("String: \"" + text + "\", length: " + text.length());
        
        // Safe approach for character access
        int index = 20; // Out of bounds
        if (index >= 0 && index < text.length()) {
            System.out.println("Character at index " + index + ": " + text.charAt(index));
        } else {
            System.out.println("Index " + index + " is out of bounds for string of length " + text.length());
        }
        
        // Safe approach for substring
        int startIndex = 7;
        int endIndex = 25; // Out of bounds
        
        if (startIndex >= 0 && startIndex <= text.length()) {
            if (endIndex >= startIndex && endIndex <= text.length()) {
                System.out.println("Substring(" + startIndex + ", " + endIndex + "): \"" + 
                                text.substring(startIndex, endIndex) + "\"");
            } else {
                System.out.println("End index " + endIndex + " is invalid for string of length " + text.length());
                // Use a valid end index instead
                int validEndIndex = Math.min(endIndex, text.length());
                System.out.println("Using valid end index: Substring(" + startIndex + ", " + validEndIndex + "): \"" + 
                                text.substring(startIndex, validEndIndex) + "\"");
            }
        } else {
            System.out.println("Start index " + startIndex + " is invalid for string of length " + text.length());
        }
    }
} 