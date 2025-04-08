import java.util.HashSet;
import java.util.Scanner;

public class HashSetToArrayWithInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            set.add(scanner.nextLine());
        }

        String[] array = new String[set.size()];
        set.toArray(array);

        System.out.println("Array elements:");
        for (String item : array) {
            System.out.println(item);
        }

        scanner.close();
    }
}

