class StaticDemo {
    static int staticVar1 = 10;
    static String staticVar2 = "Static Variable";
    
    int instanceVar1 = 20;
    String instanceVar2 = "Instance Variable";
    
    static void staticMethod1() {
        System.out.println("Inside staticMethod1");
        System.out.println("Static Variable 1: " + staticVar1);
        System.out.println("Static Variable 2: " + staticVar2);
    }
    
    static void staticMethod2() {
        System.out.println("Inside staticMethod2");
        System.out.println("Static Variable values can be directly accessed: " + staticVar1 + ", " + staticVar2);
    }
    
    void instanceMethod1() {
        System.out.println("Inside instanceMethod1");
        System.out.println("Instance Variable 1: " + instanceVar1);
        System.out.println("Instance Variable 2: " + instanceVar2);
    }
    
    void instanceMethod2() {
        System.out.println("Inside instanceMethod2");
        System.out.println("Instance variables belong to the object: " + instanceVar1 + ", " + instanceVar2);
    }
    
    public static void main(String[] args) {
        System.out.println("StaticDemo class demonstrates static and instance variables and methods");
        
        StaticDemo obj = new StaticDemo();
        
        staticMethod1();
        staticMethod2();
        
        obj.instanceMethod1();
        obj.instanceMethod2();
    }
} 