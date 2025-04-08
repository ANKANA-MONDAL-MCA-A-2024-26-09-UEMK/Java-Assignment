import java.util.LinkedList;
import java.util.Scanner;

public class InsertFirstLastLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();

        System.out.print("Enter element to insert at first: ");
        list.addFirst(scanner.nextLine());

        System.out.print("Enter element to insert at last: ");
        list.addLast(scanner.nextLine());

        System.out.println("LinkedList after insertions:");
        System.out.println(list);

        scanner.close();
    }
}

