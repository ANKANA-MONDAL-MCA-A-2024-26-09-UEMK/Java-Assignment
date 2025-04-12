package week6;

class ParentClass {
    ParentClass() {
        System.out.println("ParentClass constructor called");
    }
}

class ChildClass extends ParentClass {
    ChildClass() {
        super(); // Explicit call to parent constructor
        System.out.println("ChildClass constructor called");
    }
}

public class SuperNoParameter {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        System.out.println("Object created: " + obj);
    }
}

