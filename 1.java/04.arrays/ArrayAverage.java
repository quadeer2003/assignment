class ArrayAverage {
    public static void main(String[] args) {
        int[] numbers = {12, 5, 8, 23, 16, 9};
        
        System.out.print("Array elements: ");
        for(int num : numbers) {
            System.out.print(num + " ");
        }
        
        double avg = calculateAverage(numbers);
        System.out.println("\nAverage of array elements: " + avg);
    }
    
    static double calculateAverage(int[] arr) {
        int sum = 0;
        
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        
        return (double) sum / arr.length;
    }
} 