class IntegerToString {
    public static void main(String[] args) {
        // Create Integer objects
        Integer int1 = 42;
        Integer int2 = Integer.valueOf(100);
        Integer int3 = new Integer(786); // deprecated in newer Java versions
        
        System.out.println("Integer objects:");
        System.out.println("int1: " + int1);
        System.out.println("int2: " + int2);
        System.out.println("int3: " + int3);
        
        // Method 1: Using toString() method of Integer class
        String str1 = int1.toString();
        System.out.println("\nMethod 1 - Using toString() method:");
        System.out.println("Integer: " + int1);
        System.out.println("String: " + str1);
        System.out.println("Type: " + str1.getClass().getName());
        
        // Method 2: Using static toString() method of Integer class
        String str2 = Integer.toString(int2);
        System.out.println("\nMethod 2 - Using static Integer.toString():");
        System.out.println("Integer: " + int2);
        System.out.println("String: " + str2);
        
        // Method 3: Using String.valueOf() method
        String str3 = String.valueOf(int3);
        System.out.println("\nMethod 3 - Using String.valueOf():");
        System.out.println("Integer: " + int3);
        System.out.println("String: " + str3);
        
        // Method 4: Using concatenation with empty string
        String str4 = "" + int1;
        System.out.println("\nMethod 4 - Using string concatenation:");
        System.out.println("Integer: " + int1);
        System.out.println("String: " + str4);
        
        // Method 5: Using String.format()
        String str5 = String.format("%d", int2);
        System.out.println("\nMethod 5 - Using String.format():");
        System.out.println("Integer: " + int2);
        System.out.println("String: " + str5);
        
        // Converting with radix (base)
        String binaryStr = Integer.toString(int1, 2);
        String octalStr = Integer.toString(int1, 8);
        String hexStr = Integer.toString(int1, 16);
        
        System.out.println("\nConversion with different bases (for " + int1 + "):");
        System.out.println("Binary: " + binaryStr);
        System.out.println("Octal: " + octalStr);
        System.out.println("Hexadecimal: " + hexStr);
        
        // Demonstration: verifying that we have strings (string operations)
        System.out.println("\nVerifying string conversion by performing string operations:");
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at position 0 in str2: " + str2.charAt(0));
        System.out.println("Substring of str3: " + str3.substring(0, 2));
        System.out.println("Uppercase of str4: " + str4.toUpperCase());
    }
} 