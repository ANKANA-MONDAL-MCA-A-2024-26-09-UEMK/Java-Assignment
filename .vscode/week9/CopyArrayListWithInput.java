import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CopyArrayListWithInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> source = new ArrayList<>();

        System.out.println("Enter number of elements to add:");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            source.add(scanner.nextLine());
        }

        ArrayList<String> destination = new ArrayList<>(Collections.nCopies(n, ""));
        Collections.copy(destination, source);

        System.out.println("Copied list:");
        System.out.println(destination);

        scanner.close();
    }
}

