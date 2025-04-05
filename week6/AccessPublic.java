package week6;

class PublicExample {
    public int number = 10;

    public void show() {
        System.out.println("Public method accessed");
    }
}

public class AccessPublic {
    public static void main(String[] args) {
        PublicExample obj = new PublicExample();
        System.out.println("Public variable: " + obj.number);
        obj.show();
    }
}

