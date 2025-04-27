import java.io.*;
import java.util.*;

public class SearchordExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word to search: ");
        String searchWord = sc.nextLine();
        int count = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equalsIgnoreCase(searchWord)) {
                        count++;
                    }
                }
            }
            reader.close();
            System.out.println("The word '" + searchWord + "' occurs " + count + " times.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }finally {
            sc.close(); // Always close Scanner in finally block
        }
    }
}
