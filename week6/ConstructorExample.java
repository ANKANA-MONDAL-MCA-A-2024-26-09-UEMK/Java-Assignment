package week6;

class Base {
    Base() {
        System.out.println("Base Constructor");
    }
}

class Derived extends Base {
    Derived() {
        super(); // Optional here, since Java inserts it automatically
        System.out.println("Derived Constructor");
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        Derived d = new Derived(); // Variable 'd' created but not used further
        System.out.println("Object created of type: " + d.getClass().getSimpleName());
    }
}
