package week2;

public class SumOfEvenNumbers {     
    public static void main(String[] args) {         
        // Declare and initialize the integer array         
        int[] numbers = {10, 15, 20, 25, 30, 35, 40, 45}; 
 
        // Variable to store the sum of even numbers         
        int sum = 0; 
 
        // Loop through the array 
        for (int i = 0; i < numbers.length; i++) {             
            // Check if the number is even             
            if (numbers[i] % 2 == 0) { 
                sum += numbers[i];  // Add the even number to the sum 
            } 
        } 
 
        // Print the sum of even numbers 
        System.out.println("Sum of even numbers: " + sum); 
    } 
} 

