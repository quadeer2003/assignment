class DuplicateValues {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 8, 4, 7, 9, 2, 1, 8, 5, 4};
        
        System.out.print("Array: ");
        for(int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        findDuplicates(numbers);
    }
    
    static void findDuplicates(int[] arr) {
        System.out.print("Duplicate values: ");
        boolean duplicateFound = false;
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    boolean alreadyPrinted = false;
                    
                    for(int k = 0; k < i; k++) {
                        if(arr[k] == arr[i]) {
                            alreadyPrinted = true;
                            break;
                        }
                    }
                    
                    if(!alreadyPrinted) {
                        System.out.print(arr[i] + " ");
                        duplicateFound = true;
                    }
                    
                    break;
                }
            }
        }
        
        if(!duplicateFound) {
            System.out.print("None");
        }
        
        System.out.println();
    }
} 