interface Internal {
    String MESSAGE = "Internal interface (default access)";
    void process();
}

class Processor implements Internal {
    @Override
    public void process() {
        System.out.println("Processing with " + MESSAGE);
    }
}

interface FieldTypes {
    public String PUBLIC_FIELD = "abdul quadeer";
    
    // These will cause compilation errors - interfaces can only have public static final fields
    // private String PRIVATE_FIELD = "Private field"; 
    // protected String PROTECTED_FIELD = "Protected field";
    
    static final int STATIC_FINAL = 100;
}

class FieldDemo implements FieldTypes {
    void showFields() {
        System.out.println("PUBLIC_FIELD: " + PUBLIC_FIELD);
        System.out.println("STATIC_FINAL: " + STATIC_FINAL);
    }
}

public class InterfaceAccessModifiers {
    public static void main(String[] args) {
        System.out.println("Demonstrating interface access modifiers:");
        
        Processor processor = new Processor();
        processor.process();
        
        System.out.println("\nAccessing default interface constant:");
        System.out.println(Internal.MESSAGE);
        
        System.out.println("\nAccessing interface fields:");
        FieldDemo demo = new FieldDemo();
        demo.showFields();
        
        System.out.println("\nNote:");
        System.out.println("1. Interfaces cannot be private or protected at top level");
        System.out.println("2. Interface fields are implicitly public static final");
        System.out.println("3. Interface methods are implicitly public abstract (except default/static methods)");
    }
} 