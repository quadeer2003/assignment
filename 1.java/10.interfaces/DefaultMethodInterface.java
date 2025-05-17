interface Messageable {
    void sendMessage(String message);
    
    default void displayInfo() {
        System.out.println("This is a default method in the interface");
        System.out.println("Implementing classes need not override this method");
    }
}

class MessageSender implements Messageable {
    private String sender;
    
    MessageSender(String sender) {
        this.sender = sender;
    }
    
    @Override
    public void sendMessage(String message) {
        System.out.println(sender + " sends: " + message);
    }
}

public class DefaultMethodInterface {
    public static void main(String[] args) {
        MessageSender sender = new MessageSender("abdul quadeer");
        
        sender.sendMessage("Hello, world!");
        
        System.out.println("\nCalling default method without implementation:");
        sender.displayInfo();
        
        Messageable msgRef = sender;
        System.out.println("\nCalling default method through interface reference:");
        msgRef.displayInfo();
    }
} 