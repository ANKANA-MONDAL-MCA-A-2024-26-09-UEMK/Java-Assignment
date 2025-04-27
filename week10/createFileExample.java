import java.io.FileWriter;
import java.io.IOException;

public class createFileExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, this is Week 10 of Java File Handling!\n");
            writer.write("We are learning how to handle files.\n");
            writer.close();
            System.out.println("File created and data written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
