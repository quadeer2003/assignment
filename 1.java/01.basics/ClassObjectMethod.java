public class ClassObjectMethod {
    private int number;
    private String text;
    
    public ClassObjectMethod() {
        this.number = 0;
        this.text = "";
    }
    
    public ClassObjectMethod(int number, String text) {
        this.number = number;
        this.text = text;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }
    
    public int getNumber() {
        return number;
    }
    
    public void setText(String text) {
        this.text = text;
    }
    
    public String getText() {
        return text;
    }
    
    public void display() {
        System.out.println("Number: " + number + ", Text: " + text);
    }
    
    public static void main(String[] args) {
        ClassObjectMethod obj1 = new ClassObjectMethod();
        ClassObjectMethod obj2 = new ClassObjectMethod(10, "Hello");
        
        obj1.setNumber(5);
        obj1.setText("Java");
        
        obj1.display();
        obj2.display();
    }
} 