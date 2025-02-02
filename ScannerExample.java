//Write a java program to take input from keyboard using Scanner class. 

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        System.out.println("You entered: " + number);

        scanner.close();
    }
}
