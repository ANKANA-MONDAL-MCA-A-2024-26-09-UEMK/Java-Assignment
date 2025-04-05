package week6;

class MainClass {
    final void show() {
        System.out.println("Final method in MainClass");
    }
}

class DerivedClass extends MainClass {
    // void show() {}  // This would cause an error
}

public class FinalMethodDemo {
    public static void main(String[] args) {
        new DerivedClass().show();
    }
}
