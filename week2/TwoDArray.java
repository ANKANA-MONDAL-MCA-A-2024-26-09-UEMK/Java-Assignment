package week2;

public class TwoDArray { 
    public static void main(String[] args) {         
        // Create a 2D array (3 rows and 3 columns)         
        int[][] matrix = { 
            {1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 9} 
        }; 
        // Accessing and printing each element in the 2D array 
        System.out.println("Element at position (0,0): " + matrix[0][0]); 
        System.out.println("Element at position (0,1): " + matrix[0][1]);         
        System.out.println("Element at position (0,2): " + matrix[0][2]); 
         
        System.out.println("Element at position (1,0): " + matrix[1][0]); 
        System.out.println("Element at position (1,1): " + matrix[1][1]);         
        System.out.println("Element at position (1,2): " + matrix[1][2]); 
         
        System.out.println("Element at position (2,0): " + matrix[2][0]); 
        System.out.println("Element at position (2,1): " + matrix[2][1]);         
        System.out.println("Element at position (2,2): " + matrix[2][2]); 
    } 
} 

