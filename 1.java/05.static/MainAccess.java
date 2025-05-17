class MainAccess {
    static int maxLimit = 1000;
    static String department = "Engineering";
    
    int userId;
    String userName;
    
    MainAccess(int id, String name) {
        this.userId = id;
        this.userName = name;
    }
    
    static void staticMethod1() {
        System.out.println("Static Method 1");
        System.out.println("Max Limit: " + maxLimit);
    }
    
    static void staticMethod2() {
        System.out.println("Static Method 2");
        System.out.println("Department: " + department);
    }
    
    void instanceMethod1() {
        System.out.println("Instance Method 1");
        System.out.println("User ID: " + userId);
    }
    
    void instanceMethod2() {
        System.out.println("Instance Method 2");
        System.out.println("User Name: " + userName);
    }
    
    public static void main(String[] args) {
        System.out.println("Accessing all variables in main method");
        
        System.out.println("Static Variables:");
        System.out.println("Max Limit: " + maxLimit);
        System.out.println("Department: " + department);
        
        System.out.println("\nInstance Variables (need object):");
        MainAccess user = new MainAccess(501, "John Smith");
        System.out.println("User ID: " + user.userId);
        System.out.println("User Name: " + user.userName);
    }
} 