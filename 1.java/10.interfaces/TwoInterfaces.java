interface Printable {
    void print();
}

interface Displayable {
    void display();
}

class Document implements Printable, Displayable {
    private String content;
    
    Document(String content) {
        this.content = content;
    }
    
    @Override
    public void print() {
        System.out.println("Printing: " + content);
    }
    
    @Override
    public void display() {
        System.out.println("Displaying: " + content);
    }
}

public class TwoInterfaces {
    public static void main(String[] args) {
        Document doc = new Document("abdul quadeer document");
        
        doc.print();
        doc.display();
        
        System.out.println("\nUsing interface references:");
        
        Printable printable = doc;
        printable.print();
        
        Displayable displayable = doc;
        displayable.display();
    }
} 