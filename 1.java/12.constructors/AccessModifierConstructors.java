class AccessModifiersExample {
    private String name;
    private int id;
    private double value;
    
    // Public constructor
    public AccessModifiersExample() {
        System.out.println("Public constructor called");
        this.name = "Default";
        this.id = 0;
        this.value = 0.0;
    }
    
    // Private constructor
    private AccessModifiersExample(int id) {
        System.out.println("Private constructor called");
        this.name = "Private";
        this.id = id;
        this.value = 0.0;
    }
    
    // Protected constructor
    protected AccessModifiersExample(String name) {
        System.out.println("Protected constructor called");
        this.name = name;
        this.id = 1;
        this.value = 0.0;
    }
    
    // Default (package-private) constructor
    AccessModifiersExample(double value) {
        System.out.println("Default (package-private) constructor called");
        this.name = "Default Access";
        this.id = 2;
        this.value = value;
    }
    
    // Factory method to access private constructor
    public static AccessModifiersExample createWithId(int id) {
        return new AccessModifiersExample(id);
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id + ", Value: " + value);
    }
}

class AccessModifiersChild extends AccessModifiersExample {
    private String additionalInfo;
    
    public AccessModifiersChild() {
        // Calls public constructor of parent
        super();
        this.additionalInfo = "Using public constructor";
    }
    
    public AccessModifiersChild(String name) {
        // Calls protected constructor of parent
        super(name);
        this.additionalInfo = "Using protected constructor";
    }
    
    /* Cannot call private constructor of parent
    public AccessModifiersChild(int id) {
        super(id); // This would give compilation error
        this.additionalInfo = "Using private constructor";
    }
    */
    
    public void display() {
        displayInfo();
        System.out.println("Additional Info: " + additionalInfo);
    }
}

public class AccessModifierConstructors {
    public static void main(String[] args) {
        // Using public constructor
        AccessModifiersExample obj1 = new AccessModifiersExample();
        obj1.displayInfo();
        
        // Using package-private constructor (works within same package)
        AccessModifiersExample obj2 = new AccessModifiersExample(3.14);
        obj2.displayInfo();
        
        // Using factory method to access private constructor
        AccessModifiersExample obj3 = AccessModifiersExample.createWithId(100);
        obj3.displayInfo();
        
        // Using protected constructor directly (works within same package)
        AccessModifiersExample obj4 = new AccessModifiersExample("ProtectedAccess");
        obj4.displayInfo();
        
        System.out.println("\nInherited class examples:");
        
        // Child class using public constructor
        AccessModifiersChild child1 = new AccessModifiersChild();
        child1.display();
        
        // Child class using protected constructor
        AccessModifiersChild child2 = new AccessModifiersChild("ChildName");
        child2.display();
        
        // Note: Child cannot directly use private constructor of parent
        System.out.println("\nPrivate constructors cannot be called from child classes");
    }
}