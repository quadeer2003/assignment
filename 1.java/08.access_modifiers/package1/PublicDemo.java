package package1;

public class PublicDemo {
    public String name = "abdul quadeer";
    public int age = 25;
    
    public void displayInfo() {
        System.out.println("Public method called");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class PublicAccessSamePackage {
    public static void main(String[] args) {
        PublicDemo obj = new PublicDemo();
        
        System.out.println("Accessing public fields from same package:");
        System.out.println("Name: " + obj.name);
        System.out.println("Age: " + obj.age);
        
        System.out.println("\nCalling public method from same package:");
        obj.displayInfo();
    }
} 