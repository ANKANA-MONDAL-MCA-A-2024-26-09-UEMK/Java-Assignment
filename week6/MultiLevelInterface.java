package week6;

interface A {
    void show();
}

interface B extends A {
    void display();
}

class C implements B {
    public void show() {
        System.out.println("Show from A");
    }
    public void display() {
        System.out.println("Display from B");
    }
}

public class MultiLevelInterface {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.display();
    }
}

