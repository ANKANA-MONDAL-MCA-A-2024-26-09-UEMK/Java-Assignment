package week7;

class CheckArgumentException extends Exception {     
    public CheckArgumentException(String message) {         
        super(message);  
        }  
    }  
      
    public class CheckArgument {     
    public static void main(String[] args) {         
        try {              
            if (args.length < 5) {  
                    throw new CheckArgumentException("Insufficient arguments. Please provide 5 numbers.");  
            } else {                 
                int sum = 0;                 
                for (String arg : args) {  
                        sum += Integer.parseInt(arg);  
                }  
                    System.out.println("Sum of arguments: " + sum);  
                }  
            } catch (CheckArgumentException e) {  
                System.out.println(e.getMessage());  
            }  
    }  
}  
    
