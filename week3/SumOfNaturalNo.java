//Write a Java program to calculate the sum of natural numbers up to a certain range .

import java.util.Scanner;

class SumOfNaturalNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        
        // Calculate the sum of natural numbers up to n
        int sum = n * (n + 1) / 2;
        
        // Output the result
        System.out.println("Sum of natural numbers up to " + n + " is: " + sum);
        
        // Close the scanner
        scanner.close();
    }
}
