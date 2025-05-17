class LargestNumber {
    public static void main(String[] args) {
        int a = 35;
        int b = 78;
        int c = 87;
        int largest;
        
        System.out.println("Numbers: " + a + ", " + b + ", " + c);
        
        if(a >= b) {
            if(a >= c) {
                largest = a;
            } else {
                largest = c;
            }
        } else {
            if(b >= c) {
                largest = b;
            } else {
                largest = c;
            }
        }
        
        System.out.println("The largest number is: " + largest);
    }
} 