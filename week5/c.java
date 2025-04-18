package week5;

interface A { 
    void methodA(); 
} 
 
interface B { 
    void methodB(); 
} 
 
class C implements A, B {     
    public void methodA() { 
        System.out.println("Method A"); 
    } 
 
    public void methodB() { 
        System.out.println("Method B"); 
    } 
 
    public static void main(String[] args) {         
        C obj = new C(); 
        obj.methodA();  // Output: Method A 
        obj.methodB();  // Output: Method B 
    } 
} 
