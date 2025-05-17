class StringSplit {
    public static void main(String[] args) {
        String name = "mohammad abdul quadeer";
        System.out.println("Original string: " + name);
        
        // 1. Basic split by space
        String[] parts = name.split(" ");
        System.out.println("\nSplitting by space:");
        System.out.println("Number of parts: " + parts.length);
        
        for (int i = 0; i < parts.length; i++) {
            System.out.println("Part " + (i + 1) + ": " + parts[i]);
        }
        
        // 2. Split with limit parameter
        String[] limitedParts = name.split(" ", 2);
        System.out.println("\nSplitting with limit 2:");
        for (int i = 0; i < limitedParts.length; i++) {
            System.out.println("Part " + (i + 1) + ": " + limitedParts[i]);
        }
        
        // 3. Split by character
        String[] splitByA = name.split("a");
        System.out.println("\nSplitting by character 'a':");
        System.out.println("Number of parts: " + splitByA.length);
        
        for (int i = 0; i < splitByA.length; i++) {
            System.out.println("Part " + (i + 1) + ": '" + splitByA[i] + "'");
        }
        
        // 4. Split by regex
        String dateString = "2023-10-25";
        String[] dateParts = dateString.split("-");
        System.out.println("\nSplitting date string '" + dateString + "':");
        System.out.println("Year: " + dateParts[0]);
        System.out.println("Month: " + dateParts[1]);
        System.out.println("Day: " + dateParts[2]);
        
        // 5. Split by multiple characters using regex
        String text = "mohammad,abdul;quadeer|developer";
        String[] textParts = text.split("[,;|]");
        System.out.println("\nSplitting by multiple delimiters (',', ';', '|'):");
        
        for (int i = 0; i < textParts.length; i++) {
            System.out.println("Part " + (i + 1) + ": " + textParts[i]);
        }
        
        // 6. Split with empty parts
        String textWithEmptyParts = "mohammad..abdul...quadeer";
        String[] emptyParts = textWithEmptyParts.split("\\.");
        System.out.println("\nSplitting with empty parts:");
        
        for (int i = 0; i < emptyParts.length; i++) {
            System.out.println("Part " + (i + 1) + ": '" + emptyParts[i] + "'");
        }
        
        // 7. Split and ignore empty results
        String[] noEmptyParts = textWithEmptyParts.split("\\.", 0);
        System.out.println("\nSplitting and ignoring empty results:");
        
        for (int i = 0; i < noEmptyParts.length; i++) {
            System.out.println("Part " + (i + 1) + ": '" + noEmptyParts[i] + "'");
        }
        
        // 8. Using split results in a practical example - extracting domain parts
        String email = "mohammad@example.com";
        String[] emailParts = email.split("@");
        String[] domainParts = emailParts[1].split("\\.");
        
        System.out.println("\nEmail: " + email);
        System.out.println("Username: " + emailParts[0]);
        System.out.println("Domain: " + emailParts[1]);
        System.out.println("Domain name: " + domainParts[0]);
        System.out.println("TLD: " + domainParts[1]);
    }
} 