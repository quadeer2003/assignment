package package2;

import package1.ProtectedDemo;

public class ProtectedSubClass extends ProtectedDemo {
    
    public void accessProtectedMembers() {
        System.out.println("Accessing protected members from subclass in different package:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        
        System.out.println("\nCalling protected method from subclass in different package:");
        displayInfo();
    }
    
    public static void main(String[] args) {
        ProtectedSubClass obj = new ProtectedSubClass();
        obj.accessProtectedMembers();
    }
}

class ProtectedNonSubClass {
    public static void main(String[] args) {
        ProtectedDemo obj = new ProtectedDemo();
        
        System.out.println("Attempting to access protected members from non-subclass in different package:");
        
        // These lines will cause compilation errors
        // System.out.println("Name: " + obj.name);
        // System.out.println("Age: " + obj.age);
        // obj.displayInfo();
        
        System.out.println("Cannot access protected members from non-subclass in different package");
        
        ProtectedSubClass subObj = new ProtectedSubClass();
        subObj.accessProtectedMembers();
    }
} 