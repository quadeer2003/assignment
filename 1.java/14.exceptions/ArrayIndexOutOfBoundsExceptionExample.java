public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        System.out.println("Demonstrating ArrayIndexOutOfBoundsException");
        
        // Example 1: Accessing array with invalid index
        accessInvalidIndex();
        
        // Example 2: Loop beyond array bounds
        loopBeyondBounds();
        
        // Example 3: Negative index
        negativeIndex();
        
        System.out.println("\nProgram completed");
    }
    
    private static void accessInvalidIndex() {
        System.out.println("\nExample 1: Accessing array with invalid index");
        
        try {
            int[] numbers = {10, 20, 30, 40, 50};
            
            System.out.println("Array length: " + numbers.length);
            System.out.println("Valid access - numbers[0]: " + numbers[0]);
            System.out.println("Valid access - numbers[4]: " + numbers[4]);
            
            System.out.println("Attempting to access index 5 (out of bounds)");
            // This will throw ArrayIndexOutOfBoundsException
            int value = numbers[5];
            
            // This line won't execute
            System.out.println("Value at index 5: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
    
    private static void loopBeyondBounds() {
        System.out.println("\nExample 2: Loop beyond array bounds");
        
        try {
            int[] scores = {85, 90, 78, 92, 88};
            
            System.out.println("Array length: " + scores.length);
            System.out.println("Attempting to iterate beyond array bounds:");
            
            // This will throw ArrayIndexOutOfBoundsException when i = 5
            for (int i = 0; i <= scores.length; i++) {
                System.out.println("scores[" + i + "]: " + scores[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
    
    private static void negativeIndex() {
        System.out.println("\nExample 3: Negative index");
        
        try {
            String[] fruits = {"Apple", "Banana", "Orange", "Grape", "Mango"};
            
            System.out.println("Array length: " + fruits.length);
            System.out.println("Valid access - fruits[2]: " + fruits[2]);
            
            System.out.println("Attempting to access negative index");
            // This will throw ArrayIndexOutOfBoundsException
            String fruit = fruits[-1];
            
            // This line won't execute
            System.out.println("Fruit at index -1: " + fruit);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
} 