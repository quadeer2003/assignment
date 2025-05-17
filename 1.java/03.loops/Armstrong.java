class Armstrong {
    public static void main(String[] args) {
        int number = 153;
        int originalNumber = number;
        int remainder, result = 0, n = 0;
        
        // Count number of digits
        for (int temp = number; temp != 0; temp /= 10, ++n);
        
        // Check if number is Armstrong
        for (int temp = number; temp != 0; temp /= 10) {
            remainder = temp % 10;
            result += Math.pow(remainder, n);
        }
        
        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
        
        // Test another number
        int number2 = 1634;
        checkArmstrong(number2);
    }
    
    static void checkArmstrong(int num) {
        int originalNum = num;
        int digit, sum = 0;
        int digits = String.valueOf(num).length();
        
        while (num > 0) {
            digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
} 