class StringTrim {
    public static void main(String[] args) {
        // String with leading and trailing spaces
        String name = "   mohammad abdul quadeer   ";
        
        System.out.println("Original string: \"" + name + "\"");
        System.out.println("Length of original string: " + name.length());
        
        // Using trim() to remove leading and trailing whitespace
        String trimmedName = name.trim();
        System.out.println("After trim(): \"" + trimmedName + "\"");
        System.out.println("Length after trim(): " + trimmedName.length());
        
        // String with only leading spaces
        String leadingSpaces = "     mohammad abdul quadeer";
        System.out.println("\nString with leading spaces: \"" + leadingSpaces + "\"");
        System.out.println("After trim(): \"" + leadingSpaces.trim() + "\"");
        
        // String with only trailing spaces
        String trailingSpaces = "mohammad abdul quadeer     ";
        System.out.println("\nString with trailing spaces: \"" + trailingSpaces + "\"");
        System.out.println("After trim(): \"" + trailingSpaces.trim() + "\"");
        
        // String with no leading or trailing spaces
        String noSpaces = "mohammad abdul quadeer";
        System.out.println("\nString with no extra spaces: \"" + noSpaces + "\"");
        System.out.println("After trim(): \"" + noSpaces.trim() + "\"");
        
        // String with spaces in the middle
        String middleSpaces = "mohammad   abdul   quadeer";
        System.out.println("\nString with spaces in the middle: \"" + middleSpaces + "\"");
        System.out.println("After trim(): \"" + middleSpaces.trim() + "\"");
        
        // Trim with empty string
        String emptyString = "    ";
        System.out.println("\nEmpty string with spaces: \"" + emptyString + "\"");
        System.out.println("After trim(): \"" + emptyString.trim() + "\"");
        System.out.println("Length after trim(): " + emptyString.trim().length());
        
        // Practical use case - sanitizing user input
        String userInput = "   mohammad abdul quadeer   ";
        System.out.println("\nUser input: \"" + userInput + "\"");
        
        if(userInput.trim().equals("mohammad abdul quadeer")) {
            System.out.println("Input matches after trimming!");
        } else {
            System.out.println("Input does not match after trimming.");
        }
    }
} 