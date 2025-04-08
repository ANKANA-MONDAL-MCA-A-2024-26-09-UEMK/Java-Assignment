package week9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StringListWithIterator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> stringList = new ArrayList<>();

        System.out.println("Enter number of strings:");
        int count = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 0; i < count; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            stringList.add(scanner.nextLine());
        }

        printAll(stringList);

        scanner.close();
    }

    public static void printAll(ArrayList<String> list) {
        Iterator<String> iterator = list.iterator();
        System.out.println("\nElements:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

