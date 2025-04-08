import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class IterateFromPositionLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();

        System.out.println("Enter number of elements:");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            list.add(scanner.nextLine());
        }

        System.out.print("Enter position to start iteration (0 to " + (n - 1) + "): ");
        int pos = scanner.nextInt();

        if (pos < 0 || pos >= n) {
            System.out.println("Invalid position.");
        } else {
            ListIterator<String> iterator = list.listIterator(pos);
            System.out.println("Elements from position " + pos + ":");
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }

        scanner.close();
    }
}

