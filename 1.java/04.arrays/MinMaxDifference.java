class MinMaxDifference {
    public static void main(String[] args) {
        int[] array = {8, 15, 3, 24, 7, 29, 11, 18};
        
        System.out.print("Array elements: ");
        for(int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        int difference = getDifference(array);
        System.out.println("Difference between largest and smallest: " + difference);
    }
    
    static int getDifference(int[] arr) {
        if(arr.length == 0) {
            return 0;
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
        
        System.out.println("Smallest element: " + min);
        System.out.println("Largest element: " + max);
        
        return max - min;
    }
} 