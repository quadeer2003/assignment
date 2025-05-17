class StringConcatenation {
    public static void main(String[] args) {
        String firstName = "mohammad";
        String middleAndLast = "abdul quadeer";
        
        // Simple concatenation with + operator
        String fullName = firstName + " " + middleAndLast;
        System.out.println("Full name: " + fullName);
        
        // Concatenation with different data types
        int age = 25;
        double height = 5.9;
        String info = fullName + " is " + age + " years old and " + height + " feet tall";
        System.out.println(info);
        
        // Concatenation in a loop
        String repeatedName = "";
        for(int i = 0; i < 3; i++) {
            repeatedName = repeatedName + fullName + " ";
        }
        System.out.println("Repeated name: " + repeatedName);
        
        // Concatenation using += operator
        String description = "Name: ";
        description += fullName;
        description += ", Profession: Software Developer";
        System.out.println(description);
        
        // Concatenating multiple strings
        String part1 = "Hello, ";
        String part2 = "my name is ";
        String part3 = "mohammad abdul quadeer";
        String greeting = part1 + part2 + part3;
        System.out.println(greeting);
        
        // Concatenation with literal strings
        String message = firstName + " says " + "\"Hello World!\"";
        System.out.println(message);
    }
} 