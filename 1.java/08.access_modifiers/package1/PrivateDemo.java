package package1;

class PrivateDemo {
    private String name = "abdul quadeer";
    private int age = 25;
    
    private void displayPrivateInfo() {
        System.out.println("Private method called");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
    public static void main(String[] args) {
        PrivateDemo obj = new PrivateDemo();
        
        System.out.println("Accessing private fields from main method:");
        System.out.println("Name: " + obj.name);
        System.out.println("Age: " + obj.age);
        
        System.out.println("\nCalling private method from main method:");
        obj.displayPrivateInfo();
    }
}

class PrivateSubClass extends PrivateDemo {
    void tryToAccessPrivateMembers() {
        System.out.println("Attempting to access private members from subclass:");
        
        // These lines will cause compilation errors because private members 
        // are not accessible in subclass
        
        // System.out.println("Name: " + name);
        // System.out.println("Age: " + age);
        // displayPrivateInfo();
        
        System.out.println("Cannot access private fields and methods from subclass");
    }
}

class PrivateAccessTest {
    public static void main(String[] args) {
        PrivateSubClass subObj = new PrivateSubClass();
        subObj.tryToAccessPrivateMembers();
        
        PrivateDemo obj = new PrivateDemo();
        
        // These lines will cause compilation errors
        // System.out.println(obj.name);
        // System.out.println(obj.age);
        // obj.displayPrivateInfo();
        
        System.out.println("Cannot access private fields and methods from another class");
    }
} 