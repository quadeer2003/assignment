class GenderSwitch {
    public static void main(String[] args) {
        char gender = 'M';
        
        switch (gender) {
            case 'M':
            case 'm':
                System.out.println("Gender: Male");
                break;
            case 'F':
            case 'f':
                System.out.println("Gender: Female");
                break;
            default:
                System.out.println("Invalid input");
        }
        
        // Test with different input
        printGender('F');
        printGender('x');
    }
    
    static void printGender(char ch) {
        switch (ch) {
            case 'M':
            case 'm':
                System.out.println("Input: " + ch + ", Gender: Male");
                break;
            case 'F':
            case 'f':
                System.out.println("Input: " + ch + ", Gender: Female");
                break;
            default:
                System.out.println("Input: " + ch + ", Invalid gender code");
        }
    }
} 