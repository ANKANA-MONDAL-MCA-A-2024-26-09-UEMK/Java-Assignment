package week5;

class StaticKeyword {
    static int count = 0;

    // Constructor to increment count whenever an object is created
    StaticKeyword() {
        count++;
    }

    public static void main(String[] args) {
        new StaticKeyword();
        new StaticKeyword();
        new StaticKeyword();

        System.out.println("Total objects created: " + count);
    }
}
