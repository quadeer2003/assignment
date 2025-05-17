class StringSubstring {
    public static void main(String[] args) {
        String name = "mohammad abdul quadeer";
        
        // Display the original string
        System.out.println("Original string: " + name);
        
        // Method 1: substring(beginIndex) - extracts from beginIndex to end
        String substring1 = name.substring(9); // Starts from the 10th character (0-based index)
        System.out.println("substring(9): " + substring1);
        
        // Method 2: substring(beginIndex, endIndex) - extracts from beginIndex to endIndex-1
        String substring2 = name.substring(0, 8); // First name
        System.out.println("substring(0, 8): " + substring2);
        
        // Extract the middle name
        String middleName = name.substring(9, 14);
        System.out.println("Middle name: " + middleName);
        
        // Extract the last name
        String lastName = name.substring(15);
        System.out.println("Last name: " + lastName);
        
        // Extract a substring from the middle
        String middle = name.substring(5, 16);
        System.out.println("Middle portion: " + middle);
        
        // Using indexOf() with substring
        int firstSpace = name.indexOf(" ");
        int lastSpace = name.lastIndexOf(" ");
        
        String firstName2 = name.substring(0, firstSpace);
        String middleName2 = name.substring(firstSpace + 1, lastSpace);
        String lastName2 = name.substring(lastSpace + 1);
        
        System.out.println("\nUsing indexOf with substring:");
        System.out.println("First name: " + firstName2);
        System.out.println("Middle name: " + middleName2);
        System.out.println("Last name: " + lastName2);
        
        // Demonstration of substring with trimming
        String paddedName = "   mohammad abdul quadeer   ";
        String trimmedSubstring = paddedName.trim().substring(0, 8);
        System.out.println("\nTrimmed and substring: " + trimmedSubstring);
    }
} 