class StringIndexOf {
    public static void main(String[] args) {
        String name = "mohammad abdul quadeer";
        System.out.println("Original string: " + name);
        
        // Method 1: indexOf(char) - finds the first occurrence of a character
        int indexOfM = name.indexOf('m');
        System.out.println("Index of 'm': " + indexOfM);
        
        // Method 2: indexOf(String) - finds the first occurrence of a substring
        int indexOfAbdul = name.indexOf("abdul");
        System.out.println("Index of 'abdul': " + indexOfAbdul);
        
        // Method 3: indexOf(char, fromIndex) - search starts from the specified index
        int indexOfA = name.indexOf('a');
        System.out.println("First 'a' at index: " + indexOfA);
        
        int secondA = name.indexOf('a', indexOfA + 1);
        System.out.println("Second 'a' at index: " + secondA);
        
        // Method 4: indexOf(String, fromIndex) - search for substring starts from the specified index
        int indexOfFirstSpace = name.indexOf(" ");
        int indexOfSecondSpace = name.indexOf(" ", indexOfFirstSpace + 1);
        System.out.println("First space at index: " + indexOfFirstSpace);
        System.out.println("Second space at index: " + indexOfSecondSpace);
        
        // Method 5: lastIndexOf(char) - finds the last occurrence of a character
        int lastIndexOfA = name.lastIndexOf('a');
        System.out.println("Last occurrence of 'a' at index: " + lastIndexOfA);
        
        // Method 6: lastIndexOf(String) - finds the last occurrence of a substring
        int lastIndexOfD = name.lastIndexOf("d");
        System.out.println("Last occurrence of 'd' at index: " + lastIndexOfD);
        
        // Checking if a character/substring exists
        String searchChar = "z";
        if(name.indexOf(searchChar) != -1) {
            System.out.println("'" + searchChar + "' found in the string");
        } else {
            System.out.println("'" + searchChar + "' not found in the string");
        }
        
        // Finding all occurrences of a character
        char findChar = 'a';
        int count = 0;
        int position = name.indexOf(findChar);
        
        System.out.println("\nAll occurrences of '" + findChar + "':");
        while(position != -1) {
            System.out.println("Found at position: " + position);
            position = name.indexOf(findChar, position + 1);
            count++;
        }
        System.out.println("Total occurrences: " + count);
    }
} 