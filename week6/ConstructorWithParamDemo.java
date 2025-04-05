package week6;

class BaseClass {
    BaseClass(String msg) {
        System.out.println("BaseClass Constructor: " + msg);
    }
}

class SubClass extends BaseClass {
    SubClass() {
        super("Hello from SubClass");
        System.out.println("SubClass Constructor");
    }
}

public class ConstructorWithParamDemo {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
    }
}
