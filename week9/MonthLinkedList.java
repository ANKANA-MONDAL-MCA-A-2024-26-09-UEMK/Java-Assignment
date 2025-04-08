package week9;

import java.util.LinkedList;
import java.util.Scanner;

public class MonthLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> months = new LinkedList<>();

        System.out.println("Enter 12 months:");
        for (int i = 0; i < 12; i++) {
            System.out.print("Month " + (i + 1) + ": ");
            months.add(scanner.nextLine());
        }

        System.out.println("Months:");
        for (String month : months) {
            System.out.println(month);
        }

        scanner.close();
    }
}

