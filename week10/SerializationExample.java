import java.io.*;

class Student implements Serializable {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        Student s1 = new Student("Ankana", 22);

        // Serialize
        try {
            FileOutputStream fileOut = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(s1);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in student.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }

        // Deserialize
        try {
            FileInputStream fileIn = new FileInputStream("student.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Student s = (Student) in.readObject();
            in.close();
            fileIn.close();

            System.out.println("Deserialized Student...");
            System.out.println("Name: " + s.name);
            System.out.println("Age: " + s.age);
        } catch (IOException | ClassNotFoundException i) {
            i.printStackTrace();
        }
    }
}
