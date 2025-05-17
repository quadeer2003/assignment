public class VariableScope {
    static int number = 100; // Global variable (class level)
    
    public static void main(String[] args) {
        int number = 10; // Local variable with same name as global variable
        
        System.out.println("Local variable: " + number);
        System.out.println("Global variable: " + VariableScope.number);
        
        // Demonstrate scope
        demonstrateScope();
    }
    
    public static void demonstrateScope() {
        // This method will use the global variable as no local variable with same name exists here
        System.out.println("In demonstrateScope method, number = " + number);
        
        // Creating a local variable
        int anotherNumber = 50;
        System.out.println("Local to demonstrateScope: " + anotherNumber);
        
        // This variable is only accessible within this method
    }
} 