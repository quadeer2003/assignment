class Person {
    private String name;
    private int age;
    
    // Default constructor
    public Person() {
        System.out.println("Default constructor called");
        this.name = "Unknown";
        this.age = 0;
    }
    
    // One-argument constructor
    public Person(String name) {
        System.out.println("One-argument constructor called");
        this.name = name;
        this.age = 0;
    }
    
    // Two-argument constructor
    public Person(String name, int age) {
        System.out.println("Two-argument constructor called");
        this.name = name;
        this.age = age;
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class MultipleConstructors {
    public static void main(String[] args) {
        // Calling default constructor
        Person person1 = new Person();
        person1.displayInfo();
        
        // Calling one-argument constructor
        Person person2 = new Person("John");
        person2.displayInfo();
        
        // Calling two-argument constructor
        Person person3 = new Person("Alice", 25);
        person3.displayInfo();
    }
} 