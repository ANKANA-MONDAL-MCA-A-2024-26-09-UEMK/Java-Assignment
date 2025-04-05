package week1;
class FactorialCalc {
    public int factorial(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

public class FactorialMain {
    public static void main(String[] args) {
        FactorialCalc obj = new FactorialCalc();
        int num = 5;
        System.out.println("Factorial: " + obj.factorial(num));
    }
}
