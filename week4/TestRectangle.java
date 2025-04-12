package week4;

class Rectangle {     
    int length; 
    int width; 
 
    // Default constructor     
    public Rectangle() {         
        length = 10; 
        width = 5; 
    } 
 
    // Parameterized constructor     
    public Rectangle(int l, int w) { 
        length = l; 
        width = w; 
    } 
 
    public void displayArea() { 
        System.out.println("Area: " + (length * width)); 
    } 
} 
 
public class TestRectangle { 
    public static void main(String[] args) {         // Using default constructor         
        Rectangle rect1 = new Rectangle(); 
        rect1.displayArea(); 
 
        // Using parameterized constructor         
        Rectangle rect2 = new Rectangle(15, 20); 
        rect2.displayArea(); 
    } 
} 
