package week9;

import java.util.HashSet;
import java.util.Scanner;

public class CloneHashSetWithInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> original = new HashSet<>();

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            original.add(scanner.nextLine());
        }

        // No warning version:
        HashSet<String> cloned = new HashSet<>(original);

        System.out.println("Cloned HashSet: " + cloned);

        scanner.close();
    }
}
