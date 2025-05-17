class PrimeNumber {
    public static void main(String[] args) {
        int num = 29;
        boolean isPrime = true;
        
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        
        if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
        
        // Check another number
        checkPrime(17);
        checkPrime(20);
    }
    
    static void checkPrime(int n) {
        boolean flag = true;
        
        if (n <= 1) {
            flag = false;
        } else {
            for (int j = 2; j <= n/2; j++) {
                if (n % j == 0) {
                    flag = false;
                    break;
                }
            }
        }
        
        if (flag) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }
} 