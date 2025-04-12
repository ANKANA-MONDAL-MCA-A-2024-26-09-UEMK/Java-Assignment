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

public static void main(String[] args) {         
    Dog dog = new Dog(); 
    dog.sound(); // Output: Dog barks 
} 
} 

