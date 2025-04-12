package week5;

class Animal {     
    void sound() { 
    System.out.println("Animal makes a sound"); 
} 
} 

class Dog extends Animal {     
    void sound() { 
    System.out.println("Dog barks"); 
} 
} 

class Cat extends Animal {     
    void sound() { 
    System.out.println("Cat meows"); 
} 
} 

public class Dynamic { 
public static void main(String[] args) { 
    Animal animal; 

    animal = new Dog(); 
    animal.sound();  // Output: Dog barks 

    animal = new Cat(); 
    animal.sound();  // Output: Cat meows 
} 
} 

