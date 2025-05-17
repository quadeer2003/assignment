class Vehicle {
    protected String brand;
    protected String model;
    
    // Default constructor
    public Vehicle() {
        System.out.println("Vehicle default constructor called");
        this.brand = "Unknown";
        this.model = "Unknown";
    }
    
    // Parameterized constructor
    public Vehicle(String brand, String model) {
        System.out.println("Vehicle parameterized constructor called");
        this.brand = brand;
        this.model = model;
    }
    
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }
}

class Car extends Vehicle {
    private int year;
    
    // Default constructor calling super default constructor
    public Car() {
        super(); // Calls Vehicle's default constructor
        System.out.println("Car default constructor called");
        this.year = 2000;
    }
    
    // Parameterized constructor calling super parameterized constructor
    public Car(String brand, String model, int year) {
        super(brand, model); // Calls Vehicle's parameterized constructor
        System.out.println("Car parameterized constructor called");
        this.year = year;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Year: " + year);
    }
}

public class SuperConstructors {
    public static void main(String[] args) {
        System.out.println("Creating car with default constructor:");
        Car car1 = new Car();
        car1.displayInfo();
        
        System.out.println("\nCreating car with parameterized constructor:");
        Car car2 = new Car("Toyota", "Camry", 2023);
        car2.displayInfo();
    }
} 