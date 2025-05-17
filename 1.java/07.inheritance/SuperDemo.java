class SuperClass {
    String message = "Message from SuperClass";
    
    void display() {
        System.out.println("Display method in SuperClass");
        System.out.println("Message: " + message);
    }
}

class SubClass extends SuperClass {
    String message = "abdul quadeer";
    
    void display() {
        super.display();
        System.out.println("Display method in SubClass");
        System.out.println("SubClass message: " + message);
        System.out.println("SuperClass message: " + super.message);
    }
    
    void accessSuperMembers() {
        System.out.println("Accessing superclass members using super keyword");
        System.out.println("SuperClass message: " + super.message);
        super.display();
    }
}

class SuperDemo {
    public static void main(String[] args) {
        System.out.println("SuperClass instance:");
        SuperClass superObj = new SuperClass();
        superObj.display();
        
        System.out.println("\nSubClass instance:");
        SubClass subObj = new SubClass();
        subObj.display();
        
        System.out.println("\nCalling accessSuperMembers method:");
        subObj.accessSuperMembers();
    }
} 