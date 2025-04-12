package week5;

class Point {     
    int x, y; 
 
    // Constructor to initialize the coordinates of the point     
    Point(int x, int y) {         
        this.x = x; 
        this.y = y; 
    } 
} 
 
// Circle class to represent the circle and its area 
class Circle { 
    Point center;  // Point object representing the center of the circle     
    double radius; 
 
    // Constructor to initialize the circle's center and radius     
    Circle(Point center, double radius) { 
        this.center = center; 
        this.radius = radius; 
    } 
 
    // Method to calculate the area of the circle     
    double calculateArea() { 
        return Math.PI * radius * radius; 
    } 
 
    // Method to display the area of the circle 
    void displayArea() { 
        System.out.println("Circle with center at (" + center.x + ", " + center.y + ")"); 
        System.out.println("Radius: " + radius); 
        System.out.println("Area of the circle: " + calculateArea()); 
    } 
} 
 
public class t { 
    public static void main(String[] args) { 
        // Create a Point object representing the center of the circle          
        Point center = new Point(5, 3); 
 
        // Create a Circle object with the given center and radius 
        Circle circle = new Circle(center, 7); 
 
        // Display the area of the circle         
        circle.displayArea(); 
    } 
} 
 

