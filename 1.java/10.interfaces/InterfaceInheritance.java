interface Vehicle {
    void start();
    void stop();
}

interface Car extends Vehicle {
    void accelerate();
    void brake();
}

class SportsCar implements Car {
    private String model;
    
    SportsCar(String model) {
        this.model = model;
    }
    
    @Override
    public void start() {
        System.out.println(model + " engine started");
    }
    
    @Override
    public void stop() {
        System.out.println(model + " engine stopped");
    }
    
    @Override
    public void accelerate() {
        System.out.println(model + " is accelerating");
    }
    
    @Override
    public void brake() {
        System.out.println(model + " is braking");
    }
}

public class InterfaceInheritance {
    public static void main(String[] args) {
        SportsCar car = new SportsCar("Ferrari");
        
        System.out.println("Calling methods through class instance:");
        car.start();
        car.accelerate();
        car.brake();
        car.stop();
        
        System.out.println("\nCalling methods through Car interface reference:");
        Car carRef = car;
        carRef.start();
        carRef.accelerate();
        
        System.out.println("\nCalling methods through Vehicle interface reference:");
        Vehicle vehicleRef = car;
        vehicleRef.start();
        vehicleRef.stop();
        
        System.out.println("\nNote: Cannot call car-specific methods through Vehicle reference");
    }
} 