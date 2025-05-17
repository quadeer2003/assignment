package package1;

class DefaultDemo {
    String name = "abdul quadeer";
    int age = 25;
    
    void displayInfo() {
        System.out.println("Default method called");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class DefaultAccessTest {
    public static void main(String[] args) {
        DefaultDemo obj = new DefaultDemo();
        
        System.out.println("Accessing default fields from same package:");
        System.out.println("Name: " + obj.name);
        System.out.println("Age: " + obj.age);
        
        System.out.println("\nCalling default method from same package:");
        obj.displayInfo();
    }
} 