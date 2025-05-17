class EvenOddCount {
    public static void main(String[] args) {
        int[] numbers = {23, 44, 12, 89, 67, 90, 34, 55, 18, 71};
        
        System.out.print("Array elements: ");
        for(int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        countEvenOdd(numbers);
    }
    
    static void countEvenOdd(int[] arr) {
        int evenCount = 0;
        int oddCount = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        System.out.println("Number of even elements: " + evenCount);
        System.out.println("Number of odd elements: " + oddCount);
        
        System.out.print("Even numbers: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        
        System.out.print("\nOdd numbers: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
} 