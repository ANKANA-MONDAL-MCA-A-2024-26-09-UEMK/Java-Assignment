package week7;

public class NoExceptionHandling {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int c = a / b; // Causes ArithmeticException
        System.out.println("Result: " + c);
    }
}

