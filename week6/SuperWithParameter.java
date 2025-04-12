package week6;

class SuperParent {
    SuperParent(String message) {
        System.out.println("Message from SuperParent: " + message);
    }
}

class SuperChild extends SuperParent {
    SuperChild() {
        super("Hello from SuperChild to SuperParent!");
        System.out.println("Constructor of SuperChild called");
    }
}

public class SuperWithParameter {
    public static void main(String[] args) {
        SuperChild obj = new SuperChild();
        System.out.println("Object created: " + obj);
    }
}

