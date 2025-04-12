package week7;

public class Case2 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("Result is: " + result);  // This line will never be reached
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
