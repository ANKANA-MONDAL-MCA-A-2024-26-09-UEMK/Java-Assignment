package week1;

public class MaxOfThree {
    public static void main(String[] args) {
        int a = 12, b = 25, c = 9;
        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;
        System.out.println("Maximum: " + max);
    }
}
