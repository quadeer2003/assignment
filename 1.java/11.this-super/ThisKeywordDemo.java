class Person {
    String name;
    int age;
    
    Person() {
        this("Default Name", 0);
        System.out.println("No-arg constructor called");
    }
    
    Person(String name) {
        this(name, 0);
        System.out.println("Single argument constructor called");
    }
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Two argument constructor called");
    }
    
    void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
    
    void printThis() {
        System.out.println("this reference: " + this);
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        System.out.println("1. Using this to refer to current instance variables:");
        Person person1 = new Person("abdul quadeer", 30);
        person1.displayInfo();
        
        System.out.println("\n2. Using this() to call constructor:");
        Person person2 = new Person();
        person2.displayInfo();
        
        System.out.println("\n3. Using this() to call argument constructor:");
        Person person3 = new Person("John");
        person3.displayInfo();
        
        System.out.println("\n4. Using this as a reference to the current object:");
        person1.printThis();
        person2.printThis();
    }
} 