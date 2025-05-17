package package2;

// import package1.DefaultDemo; // This would not work for default class

public class DefaultAccessDifferentPackage {
    public static void main(String[] args) {
        System.out.println("Attempting to access default members from different package:");
        
        // These lines will cause compilation errors
        // DefaultDemo obj = new DefaultDemo();
        // System.out.println("Name: " + obj.name);
        // System.out.println("Age: " + obj.age);
        // obj.displayInfo();
        
        System.out.println("Cannot access default members from different package");
        System.out.println("Default access modifier restricts visibility to the same package only");
    }
} 