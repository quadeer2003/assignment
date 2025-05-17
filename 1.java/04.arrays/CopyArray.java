class CopyArray {
    public static void main(String[] args) {
        int[] source = {10, 20, 30, 40, 50};
        
        System.out.print("Source Array: ");
        printArray(source);
        
        int[] destination1 = copyArray(source);
        System.out.print("Copied Array (method 1): ");
        printArray(destination1);
        
        int[] destination2 = new int[source.length];
        System.arraycopy(source, 0, destination2, 0, source.length);
        System.out.print("Copied Array (using System.arraycopy): ");
        printArray(destination2);
        
        int[] destination3 = source.clone();
        System.out.print("Copied Array (using clone): ");
        printArray(destination3);
    }
    
    static int[] copyArray(int[] arr) {
        int[] result = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
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