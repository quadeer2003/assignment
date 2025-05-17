class StaticWithInstance {
    static int staticValue = 100;
    static String staticMessage = "This is static";
    
    int instanceValue = 200;
    String instanceMessage = "This is an instance";
    
    static void staticMethod() {
        System.out.println("Inside static method");
        
        System.out.println("Static variables can be accessed: " + staticValue + ", " + staticMessage);
        
        System.out.println("Instance variables cannot be directly accessed in static method");
        System.out.println("We need an object reference to access instance variables:");
        
        StaticWithInstance obj = new StaticWithInstance();
        System.out.println("Instance Variable 1: " + obj.instanceValue);
        System.out.println("Instance Variable 2: " + obj.instanceMessage);
    }
    
    public static void main(String[] args) {
        System.out.println("Demonstrating accessing instance variables in static method");
        staticMethod();
    }
} 