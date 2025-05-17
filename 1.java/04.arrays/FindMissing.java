class FindMissing {
    public static void main(String[] args) {
        int[] array = createArrayWithMissing(100, 45);
        
        System.out.println("Array with a missing number between 1 and 100:");
        
        int missing = findMissingNumber(array);
        System.out.println("The missing number is: " + missing);
        
        int[] anotherArray = {1, 2, 3, 4, 5, 6, 8, 9, 10};
        System.out.print("Another array: ");
        for(int num : anotherArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        missing = findMissingNumberSum(anotherArray, 10);
        System.out.println("The missing number is: " + missing);
    }
    
    static int[] createArrayWithMissing(int n, int missing) {
        if(missing <= 0 || missing > n) {
            throw new IllegalArgumentException("Missing number should be between 1 and " + n);
        }
        
        int[] result = new int[n - 1];
        int index = 0;
        
        for(int i = 1; i <= n; i++) {
            if(i != missing) {
                result[index++] = i;
            }
        }
        
        return result;
    }
    
    static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        int arraySum = 0;
        
        for(int i = 0; i < arr.length; i++) {
            arraySum += arr[i];
        }
        
        return sum - arraySum;
    }
    
    static int findMissingNumberSum(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        
        for(int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }
        
        return expectedSum - actualSum;
    }
} 