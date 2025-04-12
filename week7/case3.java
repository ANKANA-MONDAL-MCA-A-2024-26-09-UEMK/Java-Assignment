package week7;

public class case3 {  
    public static void main(String[] args) {          
        int result = 10 / 0;  // This will cause an ArithmeticException, but it's not handled.             
        System.out.println("Result: " + result);  
    }  
}  
