package week4;

class Example {
    int num;

    public Example() {
        this(10); // Calls the parameterized constructor
        System.out.println("Default constructor called.");
    }

    public Example(int num) {
        this.num = num;
        System.out.println("Constructor with argument called.");
    }

    public void display() {
        System.out.println("Value of num: " + num);
    }
}

public class TestThisConstructor {
    public static void main(String[] args) {
        Example obj = new Example(); // Triggers constructor chaining
        obj.display();
    }
}
