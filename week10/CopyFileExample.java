import java.io.*;

public class CopyFileExample {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("example.txt");
            FileWriter fw = new FileWriter("copy_example.txt");

            int c;
            while ((c = fr.read()) != -1) {
                fw.write(c);
            }

            fr.close();
            fw.close();
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

