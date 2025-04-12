package week2;

public class MyClass {     // Instance variables     
    int number; 
    String text; 
 
    // Parameterized constructor     
    public MyClass(int num, String str) { 
        // Initializing instance variables using parameters         
        number = num; 
        text = str; 
        System.out.println("Parameterized constructor called!"); 
    } 
 
    // Method to display the values     
    public void display() { 
        System.out.println("Number: " + number); 
        System.out.println("Text: " + text); 
    } 
 
    public static void main(String[] args) { 
        // Creating an object using the parameterized constructor 
        MyClass obj1 = new MyClass(10, "Hello World"); 
 
        // Display the values of the object 
        obj1.display(); 
 
        // Creating another object with different values 
        MyClass obj2 = new MyClass(20, "Java Programming"); 
 
        // Display the values of the second object 
        obj2.display(); 
    } 
} 

