package week6;

interface Printable {
    void print();
}

interface Showable {
    void show();
}

class A implements Printable, Showable {
    public void print() {
        System.out.println("Printing...");
    }

    public void show() {
        System.out.println("Showing...");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        A obj = new A();  // ✅ This is valid
        obj.print();
        obj.show();
    }
}
