class C extends B {
    String name = "abdul quadeer";
    int value = 30;
    
    void methodC1() {
        System.out.println("Method C1 called from class C");
    }
    
    void methodC2() {
        System.out.println("Method C2 called from class C");
    }
    
    @Override
    void display() {
        System.out.println("Display method in class C");
        System.out.println("Name: " + name + ", Value: " + value);
    }
} 