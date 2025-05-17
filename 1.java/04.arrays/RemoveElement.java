class RemoveElement {
    public static void main(String[] args) {
        int[] originalArray = {10, 25, 30, 15, 40, 20};
        int elementToRemove = 15;
        
        System.out.print("Original Array: ");
        printArray(originalArray);
        
        int[] newArray = removeElement(originalArray, elementToRemove);
        
        System.out.print("Array after removing " + elementToRemove + ": ");
        printArray(newArray);
    }
    
    static int[] removeElement(int[] arr, int element) {
        int index = -1;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == element) {
                index = i;
                break;
            }
        }
        
        if(index == -1) {
            return arr;
        }
        
        int[] result = new int[arr.length - 1];
        
        for(int i = 0, j = 0; i < arr.length; i++) {
            if(i != index) {
                result[j++] = arr[i];
            }
        }
        
        return result;
    }
    
    static void printArray(int[] arr) {
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
} 