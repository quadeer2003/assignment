class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {10, 45, 30, 78, 56, 22};
        
        System.out.print("Array: ");
        for(int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        int secondLargest = findSecondLargest(numbers);
        
        if(secondLargest != Integer.MIN_VALUE) {
            System.out.println("Second largest element: " + secondLargest);
        } else {
            System.out.println("No second largest element found.");
        }
    }
    
    static int findSecondLargest(int[] arr) {
        if(arr.length < 2) {
            return Integer.MIN_VALUE;
        }
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        
        return secondLargest;
    }
} 