class StringValueOf {
    public static void main(String[] args) {
        // 1. Convert int to String using valueOf()
        int intValue = 123;
        String strFromInt = String.valueOf(intValue);
        System.out.println("Integer: " + intValue);
        System.out.println("String from integer: " + strFromInt);
        System.out.println("Type of strFromInt: " + strFromInt.getClass().getName());
        
        // 2. Convert double to String
        double doubleValue = 123.456;
        String strFromDouble = String.valueOf(doubleValue);
        System.out.println("\nDouble: " + doubleValue);
        System.out.println("String from double: " + strFromDouble);
        
        // 3. Convert boolean to String
        boolean boolValue = true;
        String strFromBool = String.valueOf(boolValue);
        System.out.println("\nBoolean: " + boolValue);
        System.out.println("String from boolean: " + strFromBool);
        
        // 4. Convert char to String
        char charValue = 'M';
        String strFromChar = String.valueOf(charValue);
        System.out.println("\nChar: " + charValue);
        System.out.println("String from char: " + strFromChar);
        
        // 5. Convert long to String
        long longValue = 1234567890L;
        String strFromLong = String.valueOf(longValue);
        System.out.println("\nLong: " + longValue);
        System.out.println("String from long: " + strFromLong);
        
        // 6. Convert float to String
        float floatValue = 3.14f;
        String strFromFloat = String.valueOf(floatValue);
        System.out.println("\nFloat: " + floatValue);
        System.out.println("String from float: " + strFromFloat);
        
        // 7. Convert char array to String
        char[] charArray = {'m', 'o', 'h', 'a', 'm', 'm', 'a', 'd'};
        String strFromCharArray = String.valueOf(charArray);
        System.out.println("\nChar array: " + java.util.Arrays.toString(charArray));
        System.out.println("String from char array: " + strFromCharArray);
        
        // 8. Convert portion of char array to String
        String partOfCharArray = String.valueOf(charArray, 2, 3);
        System.out.println("Substring from char array (offset=2, count=3): " + partOfCharArray);
        
        // 9. Using concatenation with valueOf results
        String name = "mohammad abdul quadeer";
        int age = 25;
        String concatenated = "Name: " + name + ", Age: " + String.valueOf(age);
        System.out.println("\nConcatenated string: " + concatenated);
        
        // 10. Using valueOf vs. toString for null
        Object nullObj = null;
        try {
            String strFromNullToString = nullObj.toString(); // Will throw NullPointerException
            System.out.println(strFromNullToString); 
        } catch (NullPointerException e) {
            System.out.println("\nnullObj.toString() throws NullPointerException");
        }
        
        String strFromNullValueOf = String.valueOf(nullObj); // Returns "null" as a string
        System.out.println("String.valueOf(nullObj): " + strFromNullValueOf);
    }
} 