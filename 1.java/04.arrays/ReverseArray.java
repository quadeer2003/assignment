class ReverseArray {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7};
        
        System.out.print("Original array: ");
        printArray(original);
        
        int[] reversed = reverseArray(original);
        
        System.out.print("Reversed array: ");
        printArray(reversed);
        
        System.out.println("Reversing the original array in-place:");
        reverseArrayInPlace(original);
        printArray(original);
    }
    
    static int[] reverseArray(int[] arr) {
        int[] result = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        
        return result;
    }
    
    static void reverseArrayInPlace(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        
        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
    }
    
    static void printArray(int[] arr) {
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
} 