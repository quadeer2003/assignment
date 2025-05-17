class CommonValues {
    public static void main(String[] args) {
        int[] array1 = {1, 4, 7, 9, 12, 15, 18};
        int[] array2 = {3, 7, 10, 12, 15, 20};
        
        System.out.print("First Array: ");
        printArray(array1);
        
        System.out.print("Second Array: ");
        printArray(array2);
        
        findCommonValues(array1, array2);
    }
    
    static void findCommonValues(int[] arr1, int[] arr2) {
        System.out.print("Common values: ");
        boolean foundCommon = false;
        
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    foundCommon = true;
                    break;
                }
            }
        }
        
        if(!foundCommon) {
            System.out.print("None");
        }
        
        System.out.println();
    }
    
    static void printArray(int[] arr) {
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
} 