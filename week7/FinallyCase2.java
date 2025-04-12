package week7;

public class FinallyCase2 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);  // avoids warning
        } finally {
            System.out.println("This is always executed.");
        }
    }
}
