public class Increment {
    public static void main(String[] args) {
        incrementDecrementDemo();
    }
    
    public static void incrementDecrementDemo() {
        int a = 5;
        int b = 5;
        
        System.out.println("Pre-increment: " + (++a));
        System.out.println("Value of a after pre-increment: " + a);
        
        System.out.println("Post-increment: " + (b++));
        System.out.println("Value of b after post-increment: " + b);
        
        a = 5;
        b = 5;
        
        System.out.println("Pre-decrement: " + (--a));
        System.out.println("Value of a after pre-decrement: " + a);
        
        System.out.println("Post-decrement: " + (b--));
        System.out.println("Value of b after post-decrement: " + b);
    }
} 