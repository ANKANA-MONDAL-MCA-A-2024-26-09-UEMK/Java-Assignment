package week5;

class Multilevel {     
    void sound() { 
    System.out.println("Animal makes a sound"); 
} 
} 

class Dog extends Multilevel { 
void sound() { 
    System.out.println("Dog barks"); 
} 
} 

class Puppy extends Dog { 
void sound() { 
    System.out.println("Puppy whines"); 
} 

public static void main(String[] args) {         
    Puppy puppy = new Puppy(); 
    puppy.sound();  // Output: Puppy whines 
} 
} 


