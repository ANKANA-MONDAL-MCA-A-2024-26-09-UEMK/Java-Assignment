//Write a Java program to check whether a number is prime or not. 

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();  // Corrected this line
        boolean isPrime = num > 1;     // Corrected this line
        
        for (int i = 2; i <= Math.sqrt(num); i++) {  // Corrected loop declaration
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        
        System.out.println(num + " is " + (isPrime ? "a prime number." : "not a prime number."));
        
        scanner.close();
    }
}

