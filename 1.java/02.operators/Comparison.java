public class Comparison {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 15;
        
        if(num1 > num2) {
            System.out.println("Larger number: " + num1);
            System.out.println("Smaller number: " + num2);
        } else {
            System.out.println("Larger number: " + num2);
            System.out.println("Smaller number: " + num1);
        }
        
        int a = 30;
        int b = 45;
        
        int larger = a > b ? a : b;
        int smaller = a < b ? a : b;
        
        System.out.println("Between " + a + " and " + b + ":");
        System.out.println("Larger number: " + larger);
        System.out.println("Smaller number: " + smaller);
    }
} 