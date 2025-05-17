public interface Configurable {
    String VERSION = "1.0";
    int MAX_CONNECTIONS = 10;
    boolean DEBUG_MODE = true;
    
    void configure();
    String getStatus();
}

class Application implements Configurable {
    private String appName;
    private boolean running;
    
    Application(String appName) {
        this.appName = appName;
        this.running = false;
    }
    
    @Override
    public void configure() {
        System.out.println("Configuring " + appName);
        System.out.println("Using version: " + VERSION);
        System.out.println("Max connections: " + MAX_CONNECTIONS);
        System.out.println("Debug mode: " + DEBUG_MODE);
        running = true;
    }
    
    @Override
    public String getStatus() {
        return appName + " is " + (running ? "running" : "stopped");
    }
}

public class InterfaceWithFields {
    public static void main(String[] args) {
        Application app = new Application("abdul quadeer app");
        
        System.out.println("Interface constants accessed through interface name:");
        System.out.println("VERSION: " + Configurable.VERSION);
        System.out.println("MAX_CONNECTIONS: " + Configurable.MAX_CONNECTIONS);
        System.out.println("DEBUG_MODE: " + Configurable.DEBUG_MODE);
        
        System.out.println("\nInterface constants accessed through implementing class:");
        System.out.println("VERSION: " + Application.VERSION);
        System.out.println("MAX_CONNECTIONS: " + Application.MAX_CONNECTIONS);
        System.out.println("DEBUG_MODE: " + Application.DEBUG_MODE);
        
        System.out.println("\nCalling interface methods:");
        app.configure();
        System.out.println("Status: " + app.getStatus());
    }
} 