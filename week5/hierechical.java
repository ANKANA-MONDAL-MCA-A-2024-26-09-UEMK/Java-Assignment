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

public class hierechical { 
public static void main(String[] args) {         
    Dog dog = new Dog(); 
    dog.sound();  // Output: Dog barks 

    Cat cat = new Cat(); 
    cat.sound();  // Output: Cat meows 
} 
} 
