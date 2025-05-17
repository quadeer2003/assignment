class StringCaseConversion {
    public static void main(String[] args) {
        String name = "mohammad abdul quadeer";
        System.out.println("Original string: " + name);
        
        // Convert to uppercase
        String uppercase = name.toUpperCase();
        System.out.println("Uppercase: " + uppercase);
        
        // Convert to lowercase
        String lowercase = uppercase.toLowerCase();
        System.out.println("Lowercase: " + lowercase);
        
        // Working with mixed case
        String mixedCase = "MoHaMMad AbDuL QuAdEEr";
        System.out.println("\nMixed case: " + mixedCase);
        System.out.println("Uppercase: " + mixedCase.toUpperCase());
        System.out.println("Lowercase: " + mixedCase.toLowerCase());
        
        // Case conversion with special characters and numbers
        String withSpecials = "Mohammad Abdul-Quadeer #123";
        System.out.println("\nWith special chars: " + withSpecials);
        System.out.println("Uppercase: " + withSpecials.toUpperCase());
        System.out.println("Lowercase: " + withSpecials.toLowerCase());
        
        // Converting just the first letter to uppercase (capitalize)
        String firstUppercase = name.substring(0, 1).toUpperCase() + name.substring(1);
        System.out.println("\nFirst letter uppercase: " + firstUppercase);
        
        // Converting first letter of each word to uppercase
        String[] words = name.split(" ");
        StringBuilder titleCase = new StringBuilder();
        
        for(String word : words) {
            if(word.length() > 0) {
                titleCase.append(word.substring(0, 1).toUpperCase())
                         .append(word.substring(1).toLowerCase())
                         .append(" ");
            }
        }
        
        System.out.println("Title case: " + titleCase.toString().trim());
        
        // Checking case before conversion
        String allUppercase = "MOHAMMAD";
        String allLowercase = "mohammad";
        
        System.out.println("\nChecking if string is all uppercase or lowercase:");
        System.out.println("Is '" + allUppercase + "' all uppercase? " + isAllUpperCase(allUppercase));
        System.out.println("Is '" + allLowercase + "' all lowercase? " + isAllLowerCase(allLowercase));
        System.out.println("Is '" + mixedCase + "' all uppercase? " + isAllUpperCase(mixedCase));
        System.out.println("Is '" + mixedCase + "' all lowercase? " + isAllLowerCase(mixedCase));
        
        // Practical use case: Case-insensitive comparison
        String input1 = "MoHaMMad";
        String input2 = "mohammad";
        
        System.out.println("\nCase-sensitive comparison: " + input1.equals(input2));
        System.out.println("Case-insensitive comparison: " + input1.toLowerCase().equals(input2.toLowerCase()));
        System.out.println("Using equalsIgnoreCase(): " + input1.equalsIgnoreCase(input2));
    }
    
    // Helper method to check if string is all uppercase
    private static boolean isAllUpperCase(String str) {
        return str.equals(str.toUpperCase());
    }
    
    // Helper method to check if string is all lowercase
    private static boolean isAllLowerCase(String str) {
        return str.equals(str.toLowerCase());
    }
} 