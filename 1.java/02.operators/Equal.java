public class Equal {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;
        int num3 = 20;
        
        System.out.println("num1 == num2: " + (num1 == num2));
        System.out.println("num1 == num3: " + (num1 == num3));
        
        System.out.println("num1 != num2: " + (num1 != num2));
        System.out.println("num1 != num3: " + (num1 != num3));
        
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1 == str3: " + (str1 == str3));
        System.out.println("str1.equals(str3): " + str1.equals(str3));
    }
} 