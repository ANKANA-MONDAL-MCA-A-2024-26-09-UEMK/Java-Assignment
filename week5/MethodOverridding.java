package week5;

class MethodOverridding {     
    void sound() { 
    System.out.println("Animal makes a sound"); 
} 
} 

class Dog extends MethodOverridding {     
    @Override     
    void sound() { 
    System.out.println("Dog barks"); 
} 

public static void main(String[] args) {         
    MethodOverridding animal = new Dog(); 
    animal.sound();  // Output: Dog barks 
} 
} 

