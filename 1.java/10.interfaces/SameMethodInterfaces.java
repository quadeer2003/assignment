interface FirstInterface {
    void commonMethod();
}

interface SecondInterface {
    void commonMethod();
}

class Implementation implements FirstInterface, SecondInterface {
    @Override
    public void commonMethod() {
        System.out.println("Implementation of common method");
        System.out.println("This implementation satisfies both interfaces");
    }
}

public class SameMethodInterfaces {
    public static void main(String[] args) {
        Implementation impl = new Implementation();
        
        System.out.println("Calling method through the class instance:");
        impl.commonMethod();
        
        System.out.println("\nCalling method through FirstInterface reference:");
        FirstInterface first = impl;
        first.commonMethod();
        
        System.out.println("\nCalling method through SecondInterface reference:");
        SecondInterface second = impl;
        second.commonMethod();
        
        System.out.println("\nNote that all calls invoke the same implementation");
    }
} 