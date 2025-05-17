public class Arithmetic {
    public static void main(String[] args) {
        arithmeticOperations(10, 5);
    }
    
    public static void arithmeticOperations(int a, int b) {
        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;
        
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
    }
} 