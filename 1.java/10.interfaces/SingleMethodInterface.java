interface Greeting {
    void greet();
}

class HelloGreeting implements Greeting {
    @Override
    public void greet() {
        System.out.println("Hello, abdul quadeer!");
    }
}

public class SingleMethodInterface {
    public static void main(String[] args) {
        HelloGreeting hello = new HelloGreeting();
        hello.greet();
        
        Greeting greetingRef = new HelloGreeting();
        greetingRef.greet();
    }
} 