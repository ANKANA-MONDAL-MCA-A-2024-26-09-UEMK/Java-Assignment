package week4;

class Car { 
    String model; 
 
    // Constructor with parameter 'model'     
    Car(String model) { 
        this.model = model;  // 'this.model' refers to the instance variable, 'model' refers to the constructor parameter 
    } 
 
    void display() { 
        String model = "Unknown";  // Local variable with same name as instance variable 
        System.out.println("Local model: " + model);  // Outputs: Unknown 
        System.out.println("Instance model: " + this.model);  // Outputs the instance variable value 
    } 
 
    public static void main(String[] args) {         
        Car car = new Car("Tesla"); 
        car.display();  // Outputs both local and instance model values 
   } 
} 
