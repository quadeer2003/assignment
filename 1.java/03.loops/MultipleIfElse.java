class MultipleIfElse {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        
        System.out.println("Three numbers: " + a + ", " + b + ", " + c);
        
        if (a > b) {
            if (a > c) {
                System.out.println("Largest number is: " + a);
            } else {
                System.out.println("Largest number is: " + c);
            }
        } else {
            if (b > c) {
                System.out.println("Largest number is: " + b);
            } else {
                System.out.println("Largest number is: " + c);
            }
        }
        
        // Using the alternate approach
        if (a > b && a > c) {
            System.out.println("Using multiple conditions: " + a + " is largest");
        } else if (b > a && b > c) {
            System.out.println("Using multiple conditions: " + b + " is largest");
        } else {
            System.out.println("Using multiple conditions: " + c + " is largest");
        }
    }
} 