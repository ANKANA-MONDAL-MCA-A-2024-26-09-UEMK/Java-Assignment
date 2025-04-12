package week2;

public class DiagonalSum {     
    public static void main(String[] args) { 
    // Declare and initialize a 2D array (square matrix)         
    int[][] matrix = { 
        {1, 2, 3}, 
        {4, 5, 6}, 
        {7, 8, 9} 
    }; 

    // Variable to store the sum of diagonal elements         
    int diagonalSum = 0; 

    // Loop through the matrix to calculate the sum of diagonal elements 
    int size = matrix.length;  // Assuming it's a square matrix         
    for (int i = 0; i < size; i++) { 
        // Add the primary diagonal element (i, i)             
        diagonalSum += matrix[i][i]; 
        // Add the secondary diagonal element (i, size - 1 - i) 
        if (i != size - 1 - i) {  // Prevent double counting the center element                 
            diagonalSum += matrix[i][size - 1 - i]; 
        } 
    } 

    // Print the sum of diagonal elements 
    System.out.println("Sum of diagonal elements: " + diagonalSum); 
} 
} 

