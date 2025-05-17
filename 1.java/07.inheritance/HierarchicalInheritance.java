class Parent {
    void display() {
        System.out.println("Parent class display method");
    }
    
    void parentMethod() {
        System.out.println("Method specific to Parent class");
    }
}

class Child1 extends Parent {
    @Override
    void display() {
        System.out.println("Child1 class display method");
    }
    
    void child1Method() {
        System.out.println("Method specific to Child1 class");
    }
}

class Child2 extends Parent {
    String name = "abdul quadeer";
    
    @Override
    void display() {
        System.out.println("Child2 class display method");
        System.out.println("Name: " + name);
    }
    
    void child2Method() {
        System.out.println("Method specific to Child2 class");
    }
}

class HierarchicalInheritance {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child1 child1 = new Child1();
        Child2 child2 = new Child2();
        
        System.out.println("Calling methods using Parent object:");
        parent.display();
        parent.parentMethod();
        
        System.out.println("\nCalling methods using Child1 object:");
        child1.display();
        child1.parentMethod();
        child1.child1Method();
        
        System.out.println("\nCalling methods using Child2 object:");
        child2.display();
        child2.parentMethod();
        child2.child2Method();
        
        System.out.println("\nDemonstrating polymorphism:");
        Parent ref;
        
        ref = child1;
        System.out.println("Parent reference to Child1:");
        ref.display();
        
        ref = child2;
        System.out.println("\nParent reference to Child2:");
        ref.display();
    }
} 