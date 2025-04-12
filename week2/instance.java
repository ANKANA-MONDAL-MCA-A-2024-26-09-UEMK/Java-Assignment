package week2;

public class instance {     // Instance variables     
    int number; 
    String text; 
 
    // No-argument (default) constructor     
    public instance() { 
        // Initializing the instance variables         
        number = 0; 
        text = "Default Text"; 
        System.out.println("No-argument constructor called!"); 
    } 
 
    // Method to display the values 
    public void display() { 
        System.out.println("Number: " + number); 
        System.out.println("Text: " + text); 
    } 
 
    public static void main(String[] args) { 
        // Create an object using the no-argument constructor 
        instance obj = new instance(); 
 
        // Display the values of the object 
        obj.display(); 
    } 
} 

