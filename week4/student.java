package week4;

class Student { 
    String name; 
 
    // Constructor with parameter 'name'     
    Student(String name) { 
        this.name = name;  // 'this.name' refers to the instance variable, 'name' refers to the constructor parameter 
    } 
 
    void display() { 
        System.out.println("Student name: " + this.name);  // Using 'this' to refer to the current object's instance variable 
    } 
 
    public static void main(String[] args) {         
        Student student = new Student("Alice"); 
        student.display();  // Outputs: Student name: Alice 
    } 
} 
