interface First {
    void firstMethod();
    
    default void show() {
        System.out.println("Default show method from First interface");
    }
}

interface Second {
    void secondMethod();
    
    default void show() {
        System.out.println("Default show method from Second interface");
    }
}

class MultipleInheritanceDemo implements First, Second {
    String name = "abdul quadeer";
    
    @Override
    public void firstMethod() {
        System.out.println("Implementation of firstMethod()");
    }
    
    @Override
    public void secondMethod() {
        System.out.println("Implementation of secondMethod()");
    }
    
    @Override
    public void show() {
        First.super.show();
        Second.super.show();
        System.out.println("Own implementation of show method");
        System.out.println("Name: " + name);
    }
}

class MultipleInheritance {
    public static void main(String[] args) {
        MultipleInheritanceDemo demo = new MultipleInheritanceDemo();
        
        System.out.println("Calling methods from MultipleInheritanceDemo object:");
        demo.firstMethod();
        demo.secondMethod();
        demo.show();
        
        System.out.println("\nUsing interface references:");
        First first = demo;
        Second second = demo;
        
        System.out.println("Through First interface reference:");
        first.firstMethod();
        first.show();
        
        System.out.println("\nThrough Second interface reference:");
        second.secondMethod();
        second.show();
    }
} 