class OddEven {
    public static void main(String[] args) {
        int limit = 20;
        
        System.out.println("Even numbers from 1 to " + limit + ":");
        for(int i = 1; i <= limit; i++) {
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        
        System.out.println("\nOdd numbers from 1 to " + limit + ":");
        for(int i = 1; i <= limit; i++) {
            if(i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
} 