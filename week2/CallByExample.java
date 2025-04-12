package week2;

public class CallByExample {

    // Call by Value: works with primitive types
    static void modifyValue(int x) {
        x = x + 10;
        System.out.println("Inside modifyValue (x): " + x);
    }

    // Class to demonstrate Call by Reference
    static class Number {
        int value;
    }

    // Call by Reference: works with object references
    static void modifyReference(Number num) {
        num.value = num.value + 10;
        System.out.println("Inside modifyReference (value): " + num.value);
    }

    public static void main(String[] args) {
        // --- Call by Value Demo ---
        int a = 5;
        System.out.println("Before modifyValue (a): " + a);
        modifyValue(a);
        System.out.println("After modifyValue (a): " + a);

        System.out.println(); // Just a line break

        // --- Call by Reference Demo ---
        Number obj = new Number();
        obj.value = 5;
        System.out.println("Before modifyReference (value): " + obj.value);
        modifyReference(obj);
        System.out.println("After modifyReference (value): " + obj.value);
    }
}
