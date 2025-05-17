abstract class Person {
    private String name;
    private int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    abstract void work();
    
    abstract double calculateSalary();
    
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
    String getName() {
        return name;
    }
    
    int getAge() {
        return age;
    }
}

class Employee extends Person {
    private double hourlyRate;
    private int hoursWorked;
    
    Employee(String name, int age, double hourlyRate, int hoursWorked) {
        super(name, age);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    
    @Override
    void work() {
        System.out.println(getName() + " is working as an employee");
    }
    
    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
    
    void employeeSpecificMethod() {
        System.out.println("This is a method specific to Employee class");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        System.out.println("Abstract Class Example");
        System.out.println("=====================");
        
        Employee emp = new Employee("abdul quadeer", 30, 25.0, 40);
        
        System.out.println("2. Accessing non-abstract methods through child class object:");
        emp.displayInfo();
        
        System.out.println("\n3. Calling abstract methods from child class:");
        emp.work();
        System.out.println("Salary: $" + emp.calculateSalary());
        
        System.out.println("\n4. Calling non-abstract methods from child class:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
        emp.employeeSpecificMethod();
        
        System.out.println("\nNote: We cannot create an instance of abstract class Person directly");
        // Person p = new Person("John", 25); // This will cause compilation error
    }
} 