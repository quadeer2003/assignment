package package1;

public class ProtectedDemo {
    protected String name = "abdul quadeer";
    protected int age = 25;
    
    protected void displayInfo() {
        System.out.println("Protected method called");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class ProtectedAccessSamePackage {
    public static void main(String[] args) {
        ProtectedDemo obj = new ProtectedDemo();
        
        System.out.println("Accessing protected fields from same package:");
        System.out.println("Name: " + obj.name);
        System.out.println("Age: " + obj.age);
        
        System.out.println("\nCalling protected method from same package:");
        obj.displayInfo();
    }
} 