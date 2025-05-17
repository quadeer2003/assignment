class Animal {
    String type;
    
    Animal() {
        this("Unknown");
        System.out.println("Animal no-arg constructor");
    }
    
    Animal(String type) {
        this.type = type;
        System.out.println("Animal parameterized constructor");
    }
    
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
    
    void displayInfo() {
        System.out.println("Animal type: " + type);
    }
}

class Dog extends Animal {
    String breed;
    
    Dog() {
        super();
        this.breed = "Unknown";
        System.out.println("Dog no-arg constructor");
    }
    
    Dog(String type, String breed) {
        super(type);
        this.breed = breed;
        System.out.println("Dog parameterized constructor");
    }
    
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
    
    void callParentSound() {
        super.makeSound();
    }
    
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Dog breed: " + breed);
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {
        System.out.println("1. Using super to call parent constructor:");
        Dog dog1 = new Dog("Canine", "Labrador");
        
        System.out.println("\n2. Using super to call parent method:");
        dog1.makeSound();
        dog1.callParentSound();
        
        System.out.println("\n3. Using super in overridden methods:");
        dog1.displayInfo();
        
        System.out.println("\n4. Using default constructor with super:");
        Dog dog2 = new Dog();
        dog2.displayInfo();
    }
} 