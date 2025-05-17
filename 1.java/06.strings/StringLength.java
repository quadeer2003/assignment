class StringLength {
    public static void main(String[] args) {
        String name = "mohammad abdul quadeer";
        
        // Using length() method to get the string length
        int length = name.length();
        System.out.println("The string: \"" + name + "\"");
        System.out.println("Length of the string: " + length);
        
        // Finding length of an empty string
        String emptyString = "";
        System.out.println("Length of empty string: " + emptyString.length());
        
        // Finding length of a string with white spaces
        String stringWithSpaces = "   mohammad abdul quadeer   ";
        System.out.println("Length of string with spaces: " + stringWithSpaces.length());
        
        // Finding length of a trimmed string
        String trimmedString = stringWithSpaces.trim();
        System.out.println("Length after trimming: " + trimmedString.length());
        
        // Length of individual parts of the string
        String[] parts = name.split(" ");
        System.out.println("First name length: " + parts[0].length());
        System.out.println("Middle name length: " + parts[1].length());
        System.out.println("Last name length: " + parts[2].length());
        
        // Using length for array vs length() for string
        char[] nameChars = name.toCharArray();
        System.out.println("Character array length: " + nameChars.length);
        System.out.println("String length: " + name.length());
        
        // Combining with other string methods
        System.out.println("Uppercase string length: " + name.toUpperCase().length());
    }
} 