class MainMethodsCall {
    static int staticData = 500;
    static String staticString = "Static String";
    
    int instanceData;
    String instanceString;
    
    MainMethodsCall(int data, String text) {
        this.instanceData = data;
        this.instanceString = text;
    }
    
    static void showStaticData() {
        System.out.println("Static Method: showStaticData()");
        System.out.println("Static Data: " + staticData);
        System.out.println("Static String: " + staticString);
    }
    
    static void updateStaticData(int newValue, String newText) {
        System.out.println("Static Method: updateStaticData()");
        staticData = newValue;
        staticString = newText;
        System.out.println("Updated Static Data: " + staticData);
        System.out.println("Updated Static String: " + staticString);
    }
    
    void showInstanceData() {
        System.out.println("Instance Method: showInstanceData()");
        System.out.println("Instance Data: " + instanceData);
        System.out.println("Instance String: " + instanceString);
    }
    
    void updateInstanceData(int newValue, String newText) {
        System.out.println("Instance Method: updateInstanceData()");
        instanceData = newValue;
        instanceString = newText;
        System.out.println("Updated Instance Data: " + instanceData);
        System.out.println("Updated Instance String: " + instanceString);
    }
    
    public static void main(String[] args) {
        System.out.println("Demonstrating method calls in main method");
        
        System.out.println("\nCalling static methods from main:");
        showStaticData();
        updateStaticData(1000, "Updated Static String");
        
        System.out.println("\nCalling instance methods from main (needs object):");
        MainMethodsCall obj = new MainMethodsCall(100, "Instance String");
        obj.showInstanceData();
        obj.updateInstanceData(200, "Updated Instance String");
        
        System.out.println("\nCalling static methods using class name:");
        MainMethodsCall.showStaticData();
        
        System.out.println("\nVerifying all data after method calls:");
        System.out.println("Static Data: " + staticData);
        System.out.println("Static String: " + staticString);
        System.out.println("Instance Data: " + obj.instanceData);
        System.out.println("Instance String: " + obj.instanceString);
    }
} 