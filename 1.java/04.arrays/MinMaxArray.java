class MinMaxArray {
    public static void main(String[] args) {
        int[] numbers = {34, 15, 88, 2, 60, 47, 23, 91, 8};
        
        System.out.print("Array elements: ");
        for(int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        findMinMax(numbers);
    }
    
    static void findMinMax(int[] arr) {
        if(arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        
        int min = arr[0];
        int max = arr[0];
        
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
            
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
} 