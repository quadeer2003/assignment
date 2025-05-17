class Builder {
    private String name;
    private int age;
    private String occupation;
    private String address;
    private String phoneNumber;
    
    public Builder() {
        this.name = "";
        this.age = 0;
        this.occupation = "";
        this.address = "";
        this.phoneNumber = "";
    }
    
    public Builder setName(String name) {
        this.name = name;
        return this;
    }
    
    public Builder setAge(int age) {
        this.age = age;
        return this;
    }
    
    public Builder setOccupation(String occupation) {
        this.occupation = occupation;
        return this;
    }
    
    public Builder setAddress(String address) {
        this.address = address;
        return this;
    }
    
    public Builder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    
    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Occupation: " + this.occupation);
        System.out.println("Address: " + this.address);
        System.out.println("Phone Number: " + this.phoneNumber);
    }
}

class StringBuilder {
    private String value;
    
    public StringBuilder() {
        this.value = "";
    }
    
    public StringBuilder append(String str) {
        this.value += str;
        return this;
    }
    
    public StringBuilder appendSpace() {
        return this.append(" ");
    }
    
    public StringBuilder appendNewLine() {
        return this.append("\n");
    }
    
    public String toString() {
        return this.value;
    }
}

public class MethodChaining {
    public static void main(String[] args) {
        System.out.println("Example 1: Builder Pattern with Method Chaining");
        Builder person = new Builder()
            .setName("Mohammad Sami")
            .setAge(35)
            .setOccupation("Software Engineer")
            .setAddress("123 Java Street")
            .setPhoneNumber("555-123-4567");
        
        person.displayInfo();
        
        System.out.println("\nExample 2: Custom StringBuilder with Method Chaining");
        StringBuilder sb = new StringBuilder()
            .append("Hello")
            .appendSpace()
            .append("World")
            .appendNewLine()
            .append("This is method chaining in action")
            .appendNewLine()
            .append("Each method returns 'this' reference");
        
        System.out.println(sb.toString());
        
        System.out.println("\nExample 3: Partial Method Chaining");
        Builder partialPerson = new Builder()
            .setName("Jane Doe")
            .setAge(28);
        
        partialPerson.displayInfo();
        
        System.out.println("\nAdding more information later:");
        partialPerson
            .setOccupation("Doctor")
            .setAddress("456 Medical Avenue");
        
        partialPerson.displayInfo();
    }
} 