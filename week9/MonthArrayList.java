package week9;

import java.util.ArrayList;
import java.util.Scanner;

public class MonthArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> months = new ArrayList<>();

        System.out.println("Enter 12 months:");
        for (int i = 0; i < 12; i++) {
            System.out.print("Month " + (i + 1) + ": ");
            months.add(scanner.nextLine());
        }

        System.out.println("\nMonths entered:");
        for (String month : months) {
            System.out.println(month);
        }

        scanner.close();
    }
}
