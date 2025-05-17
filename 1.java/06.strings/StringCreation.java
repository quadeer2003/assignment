class StringCreation {
    public static void main(String[] args) {
        // Method 1: String literal
        String name1 = "mohammad abdul quadeer";
        
        // Method 2: Using new keyword with String constructor
        String name2 = new String("mohammad abdul quadeer");
        
        // Method 3: Using character array
        char[] charArray = {'m', 'o', 'h', 'a', 'm', 'm', 'a', 'd', ' ', 
                           'a', 'b', 'd', 'u', 'l', ' ', 'q', 'u', 'a', 'd', 'e', 'e', 'r'};
        String name3 = new String(charArray);
        
        // Method 4: Using byte array
        byte[] byteArray = {109, 111, 104, 97, 109, 109, 97, 100};
        String name4 = new String(byteArray);
        
        // Method 5: Using StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("mohammad").append(" ").append("abdul").append(" ").append("quadeer");
        String name5 = sb.toString();
        
        // Method 6: Using StringBuffer
        StringBuffer sbuf = new StringBuffer();
        sbuf.append("mohammad").append(" ").append("abdul").append(" ").append("quadeer");
        String name6 = sbuf.toString();
        
        // Method 7: String concatenation
        String firstName = "mohammad";
        String middleName = "abdul";
        String lastName = "quadeer";
        String name7 = firstName + " " + middleName + " " + lastName;
        
        // Method 8: Using String.format()
        String name8 = String.format("%s %s %s", firstName, middleName, lastName);
        
        // Method 9: Using String.join()
        String name9 = String.join(" ", firstName, middleName, lastName);
        
        // Printing all created strings
        System.out.println("String Literal: " + name1);
        System.out.println("Using new keyword: " + name2);
        System.out.println("Using character array: " + name3);
        System.out.println("Using byte array: " + name4);
        System.out.println("Using StringBuilder: " + name5);
        System.out.println("Using StringBuffer: " + name6);
        System.out.println("Using concatenation: " + name7);
        System.out.println("Using String.format(): " + name8);
        System.out.println("Using String.join(): " + name9);
        
        System.out.println("\nChecking if all strings are equal:");
        System.out.println("name1 equals name2: " + name1.equals(name2));
        System.out.println("name1 equals name3: " + name1.equals(name3));
        System.out.println("name1 equals name5: " + name1.equals(name5));
        System.out.println("name1 equals name7: " + name1.equals(name7));
    }
} 