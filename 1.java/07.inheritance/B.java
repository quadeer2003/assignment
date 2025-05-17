class B extends A {
    String name = "Class B";
    int value = 20;
    
    void methodB1() {
        System.out.println("Method B1 called from class B");
    }
    
    void methodB2() {
        System.out.println("Method B2 called from class B");
    }
    
    @Override
    void display() {
        System.out.println("Display method in class B");
        System.out.println("Name: " + name + ", Value: " + value);
    }
} 