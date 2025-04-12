package week5;

class Fraction { 
    int numerator, denominator; 
 
    Fraction() {         
        numerator = 1; 
        denominator = 1; 
    } 
 
    Fraction(int num, int den) {         
        numerator = num; 
        denominator = den; 
    } 
 
    Fraction(Fraction frac) {         
        numerator = frac.numerator; 
        denominator = frac.denominator; 
    } 
 
    void display() { 
        System.out.println("Fraction: " + numerator + "/" + denominator); 
    } 
 
    public static void main(String[] args) {         
        Fraction frac1 = new Fraction(); 
        Fraction frac2 = new Fraction(5, 10); 
        Fraction frac3 = new Fraction(frac2); 
 
        frac1.display();  // Output: Fraction: 1/1         
        frac2.display();  // Output: Fraction: 5/10         
        frac3.display();  // Output: Fraction: 5/10 
    } 
}  

