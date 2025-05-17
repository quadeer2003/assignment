class WhileEven {
    public static void main(String[] args) {
        int num = 10;
        
        System.out.println("Even numbers between 10 and 100:");
        
        while(num <= 100) {
            if(num % 2 == 0) {
                System.out.print(num + " ");
            }
            num++;
        }
    }
} 