import package1.PublicDemo;
import package2.ProtectedSubClass;
import package2.PublicAccess;

public class AccessModifiersDemo {
    public static void main(String[] args) {
        System.out.println("ACCESS MODIFIERS DEMONSTRATION");
        System.out.println("=============================");
        
        System.out.println("\n1. PUBLIC ACCESS MODIFIER");
        System.out.println("------------------------");
        PublicDemo publicObj = new PublicDemo();
        System.out.println("Accessing public members from anywhere:");
        System.out.println("Name: " + publicObj.name);
        System.out.println("Age: " + publicObj.age);
        publicObj.displayInfo();
        
        System.out.println("\n2. PROTECTED ACCESS MODIFIER");
        System.out.println("---------------------------");
        System.out.println("Protected members are accessible:");
        System.out.println("- Within the same package");
        System.out.println("- From subclasses in any package");
        System.out.println("Cannot be accessed from non-subclass in different package");
        
        System.out.println("\n3. DEFAULT ACCESS MODIFIER");
        System.out.println("-------------------------");
        System.out.println("Default members are accessible only within the same package");
        System.out.println("Cannot be accessed from different package");
        
        System.out.println("\n4. PRIVATE ACCESS MODIFIER");
        System.out.println("-------------------------");
        System.out.println("Private members are accessible only within the class");
        System.out.println("Cannot be accessed from another class, subclass, or different package");
        
        System.out.println("\nRun individual classes to see specific demonstrations");
    }
} 