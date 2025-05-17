class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("Creating objects of each class:");
        A objectA = new A();
        B objectB = new B();
        C objectC = new C();
        
        System.out.println("\n-----Class A Methods-----");
        objectA.methodA1();
        objectA.methodA2();
        objectA.display();
        
        System.out.println("\n-----Class B Methods-----");
        objectB.methodA1();
        objectB.methodA2();
        objectB.methodB1();
        objectB.methodB2();
        objectB.display();
        
        System.out.println("\n-----Class C Methods-----");
        objectC.methodA1();
        objectC.methodA2();
        objectC.methodB1();
        objectC.methodB2();
        objectC.methodC1();
        objectC.methodC2();
        objectC.display();
        
        System.out.println("\n-----Runtime Polymorphism with Methods-----");
        A refA;
        
        refA = objectB;
        System.out.println("Reference of A refers to object of B:");
        refA.display();
        
        refA = objectC;
        System.out.println("\nReference of A refers to object of C:");
        refA.display();
        
        System.out.println("\n-----Runtime Polymorphism with Data Members-----");
        System.out.println("Direct access to variables:");
        System.out.println("objectA.name: " + objectA.name);
        System.out.println("objectB.name: " + objectB.name);
        System.out.println("objectC.name: " + objectC.name);
        
        System.out.println("\nAccessing variables using reference of A:");
        refA = objectA;
        System.out.println("refA referring to objectA - refA.name: " + refA.name);
        
        refA = objectB;
        System.out.println("refA referring to objectB - refA.name: " + refA.name);
        
        refA = objectC;
        System.out.println("refA referring to objectC - refA.name: " + refA.name);
    }
} 