class RemoveDuplicates {
    public static void main(String[] args) {
        int[] originalArray = {10, 22, 10, 20, 11, 22, 15, 20, 30};
        
        System.out.print("Original Array: ");
        printArray(originalArray);
        
        int[] result = removeDuplicates(originalArray);
        
        System.out.print("Array after removing duplicates: ");
        printArray(result);
    }
    
    static int[] removeDuplicates(int[] arr) {
        int uniqueCount = 0;
        
        for(int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            
            for(int j = 0; j < i; j++) {
                if(arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            
            if(!isDuplicate) {
                uniqueCount++;
            }
        }
        
        int[] result = new int[uniqueCount];
        int index = 0;
        
        for(int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            
            for(int j = 0; j < i; j++) {
                if(arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            
            if(!isDuplicate) {
                result[index++] = arr[i];
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