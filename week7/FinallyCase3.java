package week7;

public class FinallyCase3 {  
    public static void main(String[] args) {         
        try {             
            int result = 10 / 0;  // Will cause an ArithmeticException. 
            System.out.println("Result: " + result); 
        } catch (ArithmeticException e) {  
            System.out.println("Caught exception: " + e);  
        } finally {  
            System.out.println("This is always executed.");  
        }  
    }  
}  

