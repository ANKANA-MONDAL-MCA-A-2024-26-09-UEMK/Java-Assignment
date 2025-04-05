package week6;

class Base {
    Base() {
        System.out.println("Base Constructor");
    }
}

class Derived extends Base {
    Derived() {
        super();
        System.out.println("Derived Constructor");
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        Derived d = new Derived();
    }
}


