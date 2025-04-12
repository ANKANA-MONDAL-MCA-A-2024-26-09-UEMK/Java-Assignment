package week7;

public class ThrowKeyword {     
    public static void checkAge(int age) {         
        if (age < 18) {              
            throw new ArithmeticException("Age is less than 18.");  
        } else {  
                System.out.println("You are eligible.");  
            }  
        }  
      
    public static void main(String[] args) {         
        try {  
                checkAge(15);  // Will throw exception  
            } catch (ArithmeticException e) {  
                System.out.println("Caught exception: " + e);  
            }  
        }  
}  
    
