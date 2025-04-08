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

        HashSet<String> cloned = (HashSet<String>) original.clone();

        System.out.println("Cloned HashSet: " + cloned);

        scanner.close();
    }
}

