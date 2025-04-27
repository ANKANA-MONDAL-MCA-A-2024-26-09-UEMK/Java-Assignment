import java.io.File;
import java.util.Scanner;

public class ListFilesExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the directory path: ");
            String path = sc.nextLine();

            File directory = new File(path);

            if (directory.exists() && directory.isDirectory()) {
                String[] filesList = directory.list();
                System.out.println("Files and directories in " + path + ":");
                for (String fileName : filesList) {
                    System.out.println(fileName);
                }
            } else {
                System.out.println("The given path is not valid!");
            }
        } finally {
            sc.close(); // Always close Scanner in finally block
        }
    }
}
