class InsertElement {
    public static void main(String[] args) {
        int[] originalArray = {5, 10, 15, 20, 25};
        int newElement = 12;
        int position = 2;
        
        System.out.print("Original Array: ");
        printArray(originalArray);
        
        int[] newArray = insertElement(originalArray, newElement, position);
        
        System.out.println("After inserting " + newElement + " at position " + position + ":");
        printArray(newArray);
    }
    
    static int[] insertElement(int[] arr, int element, int position) {
        if(position < 0 || position > arr.length) {
            System.out.println("Invalid position");
            return arr;
        }
        
        int[] result = new int[arr.length + 1];
        
        for(int i = 0; i < position; i++) {
            result[i] = arr[i];
        }
        
        result[position] = element;
        
        for(int i = position; i < arr.length; i++) {
            result[i + 1] = arr[i];
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