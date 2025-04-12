package week4;

class Employee {     
    String name;     
    int age; 
    double salary; 
 
    // Constructor with 3 parameters 
    Employee(String name, int age, double salary) {         
        this.name = name;         
        this.age = age; 
        this.salary = salary; 
    } 
 
    // Constructor with 2 parameters, calls the first constructor using 'this'     
    Employee(String name, int age) { 
        this(name, age, 50000); // Default salary set to 50000 
    } 
 
    // Constructor with 1 parameter, calls the second constructor     
    Employee(String name) { 
        this(name, 30); // Default age set to 30 
    } 
 
    // Method to display the employee details     
    void display() { 
        System.out.println("Name: " + name); 
        System.out.println("Age: " + age); 
        System.out.println("Salary: " + salary); 
    } 
 
    public static void main(String[] args) { 
        // Using the constructor with 3 parameters 
        Employee emp1 = new Employee("Alice", 28, 60000);         
        emp1.display(); 
 
        System.out.println("-----"); 
 
        // Using the constructor with 2 parameters (Salary defaults to 50000)         
        Employee emp2 = new Employee("Bob", 32);         
        emp2.display(); 
 
        System.out.println("-----"); 
 
        // Using the constructor with 1 parameter (Age defaults to 30, Salary defaults to 50000)        
        Employee emp3 = new Employee("Charlie");         
        emp3.display(); 
    } 
} 

