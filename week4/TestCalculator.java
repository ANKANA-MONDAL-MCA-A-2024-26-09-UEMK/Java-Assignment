package week4;

class Calculator { 
    // Method Overloading by Number of Parameters     
    public int add(int a, int b) {         
        return a + b; 
    } 
 
    public int add(int a, int b, int c) {         
        return a + b + c; 
    } 
 
    // Method Overloading by Data Type 
    public double add(double a, double b) {         
        return a + b; 
    } 
 
    public double add(int a, double b) { 
        return a + b; 
    } 
} 
 
public class TestCalculator {     
    public static void main(String[] args) { 
        Calculator calc = new Calculator(); 
         
        System.out.println("Sum of 5 and 10: " + calc.add(5, 10));  
        System.out.println("Sum of 5, 10, and 15: " + calc.add(5, 10, 15)); 
        System.out.println("Sum of 2.5 and 4.5: " + calc.add(2.5, 4.5)); 
        System.out.println("Sum of 5 and 3.5: " + calc.add(5, 3.5));  
   } 
} 

