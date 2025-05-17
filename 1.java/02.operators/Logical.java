public class Logical {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        
        System.out.println("a && b (Logical AND): " + (a && b));
        System.out.println("a || b (Logical OR): " + (a || b));
        System.out.println("!a (Logical NOT): " + (!a));
        System.out.println("!b (Logical NOT): " + (!b));
        
        int x = 10;
        int y = 20;
        int z = 30;
        
        System.out.println("(x < y) && (y < z): " + ((x < y) && (y < z)));
        System.out.println("(x > y) || (y < z): " + ((x > y) || (y < z)));
        System.out.println("!(x > y): " + (!(x > y)));
    }
} 