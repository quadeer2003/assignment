class InstanceToStatic {
    static int totalCount = 0;
    static String appName = "MyStaticApp";
    
    int instanceId;
    String instanceName;
    
    InstanceToStatic(int id, String name) {
        this.instanceId = id;
        this.instanceName = name;
        totalCount++;
    }
    
    static void displayAppInfo() {
        System.out.println("Static Method: displayAppInfo()");
        System.out.println("App Name: " + appName);
        System.out.println("Total Count: " + totalCount);
    }
    
    static void incrementCounter() {
        System.out.println("Static Method: incrementCounter()");
        totalCount++;
        System.out.println("Counter incremented to: " + totalCount);
    }
    
    void processInstance() {
        System.out.println("Instance Method: processInstance()");
        System.out.println("Processing instance: " + instanceName + " (ID: " + instanceId + ")");
        
        System.out.println("Calling static methods from instance method:");
        
        displayAppInfo();
        incrementCounter();
    }
    
    void showStats() {
        System.out.println("Instance Method: showStats()");
        System.out.println("Instance details - ID: " + instanceId + ", Name: " + instanceName);
        
        System.out.println("Calling static methods using class name from instance method:");
        InstanceToStatic.displayAppInfo();
        
        System.out.println("Calling static method directly from instance method:");
        incrementCounter();
    }
    
    public static void main(String[] args) {
        System.out.println("Demonstrating calling static methods from instance methods");
        
        InstanceToStatic obj1 = new InstanceToStatic(201, "Instance1");
        obj1.processInstance();
        
        InstanceToStatic obj2 = new InstanceToStatic(202, "Instance2");
        obj2.showStats();
    }
} 