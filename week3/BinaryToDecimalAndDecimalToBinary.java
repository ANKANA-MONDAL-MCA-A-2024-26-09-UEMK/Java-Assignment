//Write a Java program to convert a Binary Number to Decimal and Decimal to Binary. 
import java.util.Scanner;

class BinaryToDecimalAndDecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Convert binary to decimal
        System.out.print("Enter a binary number: ");
        String binary = scanner.next();
        int decimal = Integer.parseInt(binary, 2);  // Convert binary string to decimal
        System.out.println("Decimal equivalent: " + decimal);

        // Convert decimal to binary
        System.out.print("Enter a decimal number: ");
        int num = scanner.nextInt();  // Corrected variable name
        System.out.println("Binary equivalent: " + Integer.toBinaryString(num));

        scanner.close();
    }
}

