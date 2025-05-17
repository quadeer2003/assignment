class InstanceWithStatic {
    static int count = 0;
    static String company = "TechCorp";
    
    int id;
    String name;
    
    InstanceWithStatic(int id, String name) {
        this.id = id;
        this.name = name;
        count++;
    }
    
    void displayDetails() {
        System.out.println("Inside instance method displayDetails()");
        System.out.println("Instance variables - ID: " + id + ", Name: " + name);
        
        System.out.println("Static variables can be accessed directly in instance methods:");
        System.out.println("Count: " + count);
        System.out.println("Company: " + company);
        
        System.out.println("Static variables can also be accessed using class name:");
        System.out.println("Count: " + InstanceWithStatic.count);
        System.out.println("Company: " + InstanceWithStatic.company);
    }
    
    public static void main(String[] args) {
        System.out.println("Initial static variables - Count: " + count + ", Company: " + company);
        
        InstanceWithStatic obj1 = new InstanceWithStatic(101, "John");
        obj1.displayDetails();
        
        InstanceWithStatic obj2 = new InstanceWithStatic(102, "Jane");
        obj2.displayDetails();
    }
} 