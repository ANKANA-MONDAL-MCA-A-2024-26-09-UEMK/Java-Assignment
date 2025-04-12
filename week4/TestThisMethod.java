package week4;

class Example {     
    int num; 
 
    public void setNum(int num) { 
        this.num = num; // this refers to the instance variable num 
    } 
 
    public void display() { 
        System.out.println("Value of num: " + this.num); // this invokes the current class method 
    } 
} 
 
public class TestThisMethod { 
    public static void main(String[] args) {        
        Example obj = new Example(); 
        obj.setNum(5); 
        obj.display(); 
    } 
} 

