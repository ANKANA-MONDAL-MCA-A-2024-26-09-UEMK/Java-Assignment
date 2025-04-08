package week9;

import java.util.ArrayList;
import java.util.Scanner;

public class RetrieveFromArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> items = new ArrayList<>();

        System.out.println("Enter number of elements:");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Item " + (i + 1) + ": ");
            items.add(scanner.nextLine());
        }

        System.out.print("Enter index to retrieve (0 to " + (n - 1) + "): ");
        int index = scanner.nextInt();

        if (index >= 0 && index < n) {
            System.out.println("Element at index " + index + ": " + items.get(index));
        } else {
            System.out.println("Invalid index.");
        }

        scanner.close();
    }
}

