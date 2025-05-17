class ContainsElements {
    public static void main(String[] args) {
        int[] array = {10, 15, 12, 8, 23, 18, 31, 7};
        int first = 12;
        int second = 23;
        
        System.out.print("Array elements: ");
        for(int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        boolean containsBoth = containsElements(array, first, second);
        
        if(containsBoth) {
            System.out.println("Array contains both " + first + " and " + second);
        } else {
            if(contains(array, first)) {
                System.out.println("Array contains " + first + " but not " + second);
            } else if(contains(array, second)) {
                System.out.println("Array contains " + second + " but not " + first);
            } else {
                System.out.println("Array contains neither " + first + " nor " + second);
            }
        }
    }
    
    static boolean containsElements(int[] arr, int element1, int element2) {
        return contains(arr, element1) && contains(arr, element2);
    }
    
    static boolean contains(int[] arr, int element) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == element) {
                return true;
            }
        }
        
        return false;
    }
} 