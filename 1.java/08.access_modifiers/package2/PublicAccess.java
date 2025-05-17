package package2;

import package1.PublicDemo;

public class PublicAccess {
    public static void main(String[] args) {
        PublicDemo obj = new PublicDemo();
        
        System.out.println("Accessing public fields from different package:");
        System.out.println("Name: " + obj.name);
        System.out.println("Age: " + obj.age);
        
        System.out.println("\nCalling public method from different package:");
        obj.displayInfo();
        
        obj.name = "Modified abdul quadeer";
        obj.age = 30;
        
        System.out.println("\nAfter modifying public fields:");
        obj.displayInfo();
    }
} 