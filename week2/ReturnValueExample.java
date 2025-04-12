package week2;

public class ReturnValueExample { 
     
    // Method to calculate the sum of two numbers and return the result     
    public int sum(int a, int b) {         // Calculate the sum and return it 
        return a + b; 
    } 
 
    // Main method (caller method)     
    public static void main(String[] args) { 
        // Create an object of the ReturnValueExample class 
        ReturnValueExample obj = new ReturnValueExample(); 
 
        // Call the sum method and store the returned result in a variable         
        int result = obj.sum(10, 20); 
 
        // Print the returned result 
        System.out.println("The sum of 10 and 20 is: " + result); 
    } 
} 
