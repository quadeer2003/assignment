class FindIndex {
    public static void main(String[] args) {
        int[] arr = {24, 16, 8, 42, 37, 19, 55};
        int element = 42;
        
        System.out.print("Array: ");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        
        int index = findElementIndex(arr, element);
        
        if(index != -1) {
            System.out.println("\nElement " + element + " found at index: " + index);
        } else {
            System.out.println("\nElement " + element + " not found in the array");
        }
        
        int notPresent = 100;
        index = findElementIndex(arr, notPresent);
        
        if(index != -1) {
            System.out.println("Element " + notPresent + " found at index: " + index);
        } else {
            System.out.println("Element " + notPresent + " not found in the array");
        }
    }
    
    static int findElementIndex(int[] arr, int element) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == element) {
                return i;
            }
        }
        
        return -1;
    }
} 