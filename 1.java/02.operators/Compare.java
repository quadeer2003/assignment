public class Compare {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 15;
        
        compareNumbers(num1, num2);
        
        num2 = 20;
        compareNumbers(num1, num2);
    }
    
    public static void compareNumbers(int a, int b) {
        if(a == b) {
            System.out.println(a + " is equal to " + b);
        } else {
            System.out.println(a + " is not equal to " + b);
        }
    }
} 