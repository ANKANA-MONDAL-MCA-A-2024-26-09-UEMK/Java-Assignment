package week9;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetAppendIterate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();

        System.out.print("Enter number of initial elements: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            set.add(scanner.nextLine());
        }

        System.out.print("Enter element to append: ");
        set.add(scanner.nextLine());

        System.out.println("HashSet contents:");
        for (String item : set) {
            System.out.println(item);
        }

        scanner.close();
    }
}

