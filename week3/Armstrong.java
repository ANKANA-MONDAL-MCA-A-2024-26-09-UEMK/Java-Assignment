//Write a Java program to check whether a given number is Armstrong Number or not. 

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();  // Corrected variable name
        int original = num;
        int sum = 0;
        int digits = String.valueOf(num).length();  // Get the number of digits

        // Calculate the Armstrong sum
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);  // Raise the digit to the power of number of digits
            num /= 10;
        }

        // Check if the number is an Armstrong number
        System.out.println(original + " is " + (sum == original ? "an Armstrong number." : "not an Armstrong number."));
        
        scanner.close();
    }
}

