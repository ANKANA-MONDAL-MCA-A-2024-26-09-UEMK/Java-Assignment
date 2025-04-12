package week7;

public class ThrowsKeyword {  
    public static void throwException() throws ArithmeticException {         
        throw new ArithmeticException("This is an exception.");  
    }  
  
    public static void main(String[] args) {         
        try {  
            throwException();  
        } catch (ArithmeticException e) {  
            System.out.println("Caught exception: " + e);  
        }  
    }  
}  
