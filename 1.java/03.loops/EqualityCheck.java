class EqualityCheck {
    public static void main(String args[]) {
        int x = 5;
        int y = 10;
        int z = 5;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        System.out.println("x == y? " + (x == y));
        System.out.println("x == z? " + (x == z));
        
        System.out.println("x != y? " + (x != y));
        System.out.println("x != z? " + (x != z));
        
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        
        System.out.println("s1 == s2? " + (s1 == s2));
        System.out.println("s1 == s3? " + (s1 == s3));
        System.out.println("s1.equals(s3)? " + s1.equals(s3));
    }
}