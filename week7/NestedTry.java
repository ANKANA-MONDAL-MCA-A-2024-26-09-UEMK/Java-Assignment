package week7;

public class NestedTry {
    public static void main(String[] args) {
        try {
            try {
                int a = 10, b = 0;
                int result = a / b;
                System.out.println("Result: " + result); // Not reached, but avoids warning
            } catch (ArithmeticException e) {
                System.out.println("Caught in inner try block: " + e);
            }
        } catch (Exception e) {
            System.out.println("Caught in outer try block: " + e);
        }
    }
}
