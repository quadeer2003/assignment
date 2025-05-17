class ContainsValue {
    public static void main(String[] args) {
        int[] numbers = {15, 7, 22, 19, 34, 41, 9};
        int searchValue1 = 22;
        int searchValue2 = 50;
        
        System.out.print("Array: ");
        for(int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        System.out.println("Array contains " + searchValue1 + ": " + 
                          containsValue(numbers, searchValue1));
        
        System.out.println("Array contains " + searchValue2 + ": " + 
                          containsValue(numbers, searchValue2));
    }
    
    static boolean containsValue(int[] arr, int value) {
        for(int element : arr) {
            if(element == value) {
                return true;
            }
        }
        
        return false;
    }
} 