package week7;

public class FinallyCase1 {  
    public static void main(String[] args) {         
    try {  
            System.out.println("No exception here.");  
        } finally {  
            System.out.println("This is always executed.");  
        }  
    }  
}  
