package week7;

public class MultiCatch {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int x = a / b;  // Throws ArithmeticException
            System.out.println("Value of x: " + x);

            String str = "Hello";  // No longer null
            System.out.println(str.length());  // Safe usage
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Caught exception: " + e);
        }
    }
}
