class StringCompare {
    public static void main(String[] args) {
        String name1 = "mohammad abdul quadeer";
        String name2 = "Mohammad Abdul Quadeer";
        String name3 = "mohammad abdul quadeer";
        String name4 = "Mohammad Quadeer";
        String name5 = "abdul";
        
        System.out.println("name1: " + name1);
        System.out.println("name2: " + name2);
        System.out.println("name3: " + name3);
        System.out.println("name4: " + name4);
        System.out.println("name5: " + name5);
        System.out.println();
        
        // 1. equals() - Compares the content of two strings (case-sensitive)
        System.out.println("Using equals() method:");
        System.out.println("name1.equals(name2): " + name1.equals(name2));
        System.out.println("name1.equals(name3): " + name1.equals(name3));
        System.out.println();
        
        // 2. equalsIgnoreCase() - Compares the content of two strings (case-insensitive)
        System.out.println("Using equalsIgnoreCase() method:");
        System.out.println("name1.equalsIgnoreCase(name2): " + name1.equalsIgnoreCase(name2));
        System.out.println("name1.equalsIgnoreCase(name4): " + name1.equalsIgnoreCase(name4));
        System.out.println();
        
        // 3. startsWith() - Checks if a string starts with the specified prefix
        System.out.println("Using startsWith() method:");
        System.out.println("name1.startsWith(\"mohammad\"): " + name1.startsWith("mohammad"));
        System.out.println("name2.startsWith(\"mohammad\"): " + name2.startsWith("mohammad"));
        System.out.println("name2.startsWith(\"Mohammad\"): " + name2.startsWith("Mohammad"));
        System.out.println();
        
        // 4. endsWith() - Checks if a string ends with the specified suffix
        System.out.println("Using endsWith() method:");
        System.out.println("name1.endsWith(\"quadeer\"): " + name1.endsWith("quadeer"));
        System.out.println("name2.endsWith(\"quadeer\"): " + name2.endsWith("quadeer"));
        System.out.println("name2.endsWith(\"Quadeer\"): " + name2.endsWith("Quadeer"));
        System.out.println();
        
        // 5. compareTo() - Compares two strings lexicographically (returns an int)
        System.out.println("Using compareTo() method:");
        System.out.println("name1.compareTo(name2): " + name1.compareTo(name2));
        System.out.println("name1.compareTo(name3): " + name1.compareTo(name3));
        System.out.println("name2.compareTo(name1): " + name2.compareTo(name1));
        System.out.println("name1.compareTo(name5): " + name1.compareTo(name5));
        System.out.println("name5.compareTo(name1): " + name5.compareTo(name1));
        System.out.println();
        
        // 6. compareToIgnoreCase() - Compares two strings lexicographically, ignoring case
        System.out.println("Using compareToIgnoreCase() method:");
        System.out.println("name1.compareToIgnoreCase(name2): " + name1.compareToIgnoreCase(name2));
        System.out.println("name2.compareToIgnoreCase(name4): " + name2.compareToIgnoreCase(name4));
        System.out.println();
        
        // 7. Using == operator (compares object references, not content)
        String str1 = "mohammad";
        String str2 = "mohammad";
        String str3 = new String("mohammad");
        
        System.out.println("Using == operator (compares references):");
        System.out.println("str1 == str2: " + (str1 == str2)); // true (both reference same string pool object)
        System.out.println("str1 == str3: " + (str1 == str3)); // false (different objects)
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true (same content)
    }
} 