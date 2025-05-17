interface Calculator {
    int add(int a, int b);
    int subtract(int a, int b);
}

abstract class BasicCalculator implements Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}

class AdvancedCalculator extends BasicCalculator {
    @Override
    public int subtract(int a, int b) {
        return a - b;
    }
}

public class PartialImplementation {
    public static void main(String[] args) {
        AdvancedCalculator calc = new AdvancedCalculator();
        
        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Subtraction: " + calc.subtract(10, 5));
        
        Calculator calcRef = calc;
        System.out.println("\nUsing interface reference:");
        System.out.println("Addition: " + calcRef.add(20, 5));
        System.out.println("Subtraction: " + calcRef.subtract(20, 5));
    }
} 