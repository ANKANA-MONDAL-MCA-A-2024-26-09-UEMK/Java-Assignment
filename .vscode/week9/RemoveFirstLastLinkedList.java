import java.util.LinkedList;
import java.util.Scanner;

public class RemoveFirstLastLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();

        System.out.println("Enter at least 3 elements:");
        for (int i = 0; i < 3; i++) {
            list.add(scanner.nextLine());
        }

        list.removeFirst();
        list.removeLast();

        System.out.println("LinkedList after removing first and last:");
        System.out.println(list);

        scanner.close();
    }
}

