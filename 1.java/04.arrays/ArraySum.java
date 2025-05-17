class ArraySum {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        
        System.out.println("Array: ");
        for(int num : numbers) {
            System.out.print(num + " ");
        }
        
        int sum = sumArray(numbers);
        System.out.println("\nSum of array elements: " + sum);
    }
    
    static int sumArray(int[] arr) {
        int sum = 0;
        
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        
        return sum;
    }
} 