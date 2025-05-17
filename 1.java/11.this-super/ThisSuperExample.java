class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    
    public Vehicle() {
        this("Unknown", "Unknown", 0);
    }
    
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    public void start() {
        System.out.println("Vehicle starting");
    }
    
    public void displayDetails() {
        System.out.println("Vehicle Details:");
        System.out.println("Make: " + this.make);
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
    }
}

class ElectricVehicle extends Vehicle {
    private int batteryCapacity;
    private int range;
    
    public ElectricVehicle() {
        super();
        this.batteryCapacity = 0;
        this.range = 0;
    }
    
    public ElectricVehicle(String make, String model, int year, int batteryCapacity, int range) {
        super(make, model, year);
        this.batteryCapacity = batteryCapacity;
        this.range = range;
    }
    
    public ElectricVehicle(String make, String model, int year) {
        this(make, model, year, 0, 0);
    }
    
    @Override
    public void start() {
        super.start();
        System.out.println("Electric motors activated");
    }
    
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + this.batteryCapacity + " kWh");
        System.out.println("Range: " + this.range + " miles");
    }
    
    public void charge() {
        System.out.println(this.make + " " + this.model + " is charging");
    }
}

public class ThisSuperExample {
    public static void main(String[] args) {
        System.out.println("Creating a basic Vehicle:");
        Vehicle vehicle = new Vehicle("Toyota", "Camry", 2020);
        vehicle.displayDetails();
        
        System.out.println("\nCreating an Electric Vehicle:");
        ElectricVehicle ev = new ElectricVehicle("Tesla", "Model 3", 2023, 75, 310);
        ev.displayDetails();
        
        System.out.println("\nStarting vehicles:");
        vehicle.start();
        System.out.println();
        ev.start();
        
        System.out.println("\nCharging the Electric Vehicle:");
        ev.charge();
        
        System.out.println("\nCreating vehicles with default constructors:");
        Vehicle defaultVehicle = new Vehicle();
        ElectricVehicle defaultEV = new ElectricVehicle();
        
        defaultVehicle.displayDetails();
        System.out.println();
        defaultEV.displayDetails();
        
        System.out.println("\nCreating EV with partial constructor:");
        ElectricVehicle partialEV = new ElectricVehicle("Rivian", "R1T", 2022);
        partialEV.displayDetails();
    }
} 