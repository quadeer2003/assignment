class Parent {
    String name = "Parent";
    
    Parent() {
        System.out.println("Parent constructor called");
    }
    
    Parent(String name) {
        this.name = name;
        System.out.println("Parent parameterized constructor called");
    }
    
    void display() {
        System.out.println("Parent's name: " + name);
    }
    
    void showThis() {
        System.out.println("In Parent, this refers to: " + this);
        System.out.println("In Parent, this.name: " + this.name);
    }
}

class Child extends Parent {
    String name = "Child";
    
    Child() {
        super();
        System.out.println("Child constructor called");
    }
    
    Child(String name) {
        super("Parent: " + name);
        this.name = "Child: " + name;
        System.out.println("Child parameterized constructor called");
    }
    
    @Override
    void display() {
        System.out.println("Child's name: " + name);
        System.out.println("Using this.name: " + this.name);
        System.out.println("Using super.name: " + super.name);
    }
    
    void showBoth() {
        System.out.println("In Child, this refers to: " + this);
        System.out.println("In Child, this.name: " + this.name);
        System.out.println("In Child, super.name: " + super.name);
    }
    
    void callMethods() {
        System.out.println("Calling this.display():");
        this.display();
        
        System.out.println("\nCalling super.display():");
        super.display();
    }
}

public class SuperVsThis {
    public static void main(String[] args) {
        System.out.println("1. Demonstrating 'this' and 'super' with instance variables:");
        Child child = new Child("John");
        child.display();
        
        System.out.println("\n2. Differences in reference context:");
        child.showBoth();
        
        System.out.println("\n3. Default constructor chain:");
        Child defaultChild = new Child();
        
        System.out.println("\n4. Calling methods with this vs super:");
        child.callMethods();
        
        System.out.println("\n5. Parent object's perspective:");
        Parent parent = new Parent("Alice");
        parent.showThis();
        
        System.out.println("\n6. Reference type vs Object type:");
        Parent parentRef = new Child("Bob");
        parentRef.display(); // Will call Child's display() due to method overriding
        System.out.println("Parent reference, but Child's method was called");
        System.out.println("parentRef.name: " + parentRef.name); // Will show Parent's name due to variable hiding
    }
} 