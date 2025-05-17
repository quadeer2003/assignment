class StringMatches {
    public static void main(String[] args) {
        String name = "mohammad abdul quadeer";
        System.out.println("String: " + name);
        
        // Checking if the string contains only alphabets and spaces
        boolean isAlphaSpace = name.matches("[a-zA-Z ]+");
        System.out.println("Contains only alphabets and spaces? " + isAlphaSpace);
        
        // Checking if the string starts with 'm'
        boolean startsWithM = name.matches("m.*");
        System.out.println("Starts with 'm'? " + startsWithM);
        
        // Checking if the string ends with 'r'
        boolean endsWithR = name.matches(".*r");
        System.out.println("Ends with 'r'? " + endsWithR);
        
        // Checking if the string contains the word "abdul"
        boolean containsAbdul = name.matches(".*abdul.*");
        System.out.println("Contains 'abdul'? " + containsAbdul);
        
        // Checking if the string has exactly two spaces
        boolean hasTwoSpaces = name.matches("[^ ]+ [^ ]+ [^ ]+");
        System.out.println("Has exactly two spaces? " + hasTwoSpaces);
        
        // More examples with different patterns
        
        // Example with email pattern
        String email = "mohammad@example.com";
        boolean isValidEmail = email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
        System.out.println("\nEmail: " + email);
        System.out.println("Is valid email? " + isValidEmail);
        
        // Example with phone number pattern
        String phone = "123-456-7890";
        boolean isValidPhone = phone.matches("\\d{3}-\\d{3}-\\d{4}");
        System.out.println("\nPhone: " + phone);
        System.out.println("Is valid phone format? " + isValidPhone);
        
        // Example with date pattern
        String date = "2023-10-25";
        boolean isValidDate = date.matches("\\d{4}-\\d{2}-\\d{2}");
        System.out.println("\nDate: " + date);
        System.out.println("Is valid date format (YYYY-MM-DD)? " + isValidDate);
        
        // Example with word boundary
        String sentence = "I am mohammad abdul quadeer";
        boolean hasCompleteWord = sentence.matches(".*\\bmohammad\\b.*");
        System.out.println("\nSentence: " + sentence);
        System.out.println("Contains complete word 'mohammad'? " + hasCompleteWord);
    }
} 