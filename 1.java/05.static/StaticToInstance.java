class StaticToInstance {
    static int counter = 1;
    static String message = "Hello from static context";
    
    int id;
    String name;
    
    StaticToInstance(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    void showDetails() {
        System.out.println("Instance Method: showDetails()");
        System.out.println("ID: " + id + ", Name: " + name);
    }
    
    void greet() {
        System.out.println("Instance Method: greet()");
        System.out.println("Hello, " + name + "!");
    }
    
    static void processUser(StaticToInstance user) {
        System.out.println("Static Method: processUser()");
        System.out.println("Processing user with counter: " + counter);
        
        System.out.println("Calling instance methods from static method using object reference:");
        
        user.showDetails();
        user.greet();
        
        counter++;
    }
    
    static void createAndProcess() {
        System.out.println("Static Method: createAndProcess()");
        
        StaticToInstance newUser = new StaticToInstance(100 + counter, "User" + counter);
        System.out.println("Created new user and calling instance methods:");
        
        newUser.showDetails();
        newUser.greet();
    }
    
    public static void main(String[] args) {
        System.out.println("Demonstrating calling instance methods from static methods");
        
        StaticToInstance user1 = new StaticToInstance(101, "Alice");
        StaticToInstance user2 = new StaticToInstance(102, "Bob");
        
        processUser(user1);
        processUser(user2);
        
        createAndProcess();
    }
} 