package week6;

final class FinalClass {
    void display() {
        System.out.println("This is a final class");
    }
}

// class SubClass extends FinalClass {}  // Not allowed

public class FinalClassDemo {
    public static void main(String[] args) {
        new FinalClass().display();
    }
}
