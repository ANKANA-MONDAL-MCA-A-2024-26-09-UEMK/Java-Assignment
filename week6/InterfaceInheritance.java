package week6;

interface Parent {
    void greet();
}

interface Child extends Parent {
    void message();
}

class MyClass implements Child {
    public void greet() {
        System.out.println("Hello from Parent");
    }

    public void message() {
        System.out.println("Message from Child");
    }
}

public class InterfaceInheritance {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.greet();
        obj.message();
    }
}
