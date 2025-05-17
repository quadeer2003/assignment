class Palindrome {
    public static void main(String[] args) {
        // Check if a string is palindrome
        String str = "radar";
        String reversed = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        
        if (str.equals(reversed)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
        
        // Check if a number is palindrome
        int num = 12321;
        int originalNum = num;
        int reversedNum = 0;
        
        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome number");
        } else {
            System.out.println(originalNum + " is not a palindrome number");
        }
    }
} 