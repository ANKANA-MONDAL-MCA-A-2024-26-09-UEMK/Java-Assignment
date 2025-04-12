package week4;

class Person { 
    String name; 
 
    Person(String name) { 
        this.name = name; 
    } 
 
    // Method returns the current object     
    Person setName(String name) { 
        this.name = name; 
        return this;  // Return the current instance 
    } 
 
    void display() { 
        System.out.println("Name: " + name); 
    } 
 
    public static void main(String[] args) {         
        Person person = new Person("John"); 
        person.setName("Mike").display();  // Method chaining with 'this' 
    } } 

