class EvenOddSwitch {
    public static void main(String[] args) {
        int num = 24;
        
        switch (num % 2) {
            case 0:
                System.out.println(num + " is an EVEN number");
                break;
            case 1:
                System.out.println(num + " is an ODD number");
                break;
        }
        
        int anotherNum = 33;
        
        switch (anotherNum % 2) {
            case 0:
                System.out.println(anotherNum + " is an EVEN number");
                break;
            default:
                System.out.println(anotherNum + " is an ODD number");
                break;
        }
    }
} 