package week5;

class StaticMethodExample {     
    static void display() { 
    System.out.println("This is a static method."); 
} 

public static void main(String[] args) { 
    // Calling the static method without creating an object 
    StaticMethodExample.display(); 
} 
} 

