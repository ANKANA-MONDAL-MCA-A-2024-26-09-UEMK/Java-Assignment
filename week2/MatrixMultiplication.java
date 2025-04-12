package week2;

public class MatrixMultiplication {     
    public static void main(String[] args) {         
        // Declare and initialize two matrices 
    int[][] matrix1 = { 
        {1, 2, 3}, 
        {4, 5, 6}, 
        {7, 8, 9} 
    }; 
    int[][] matrix2 = { 
        {9, 8, 7}, 
        {6, 5, 4}, 
        {3, 2, 1} 
    }; 
          // Check if multiplication is possible (columns of matrix1 should be equal to rows of matrix2)         
if (matrix1[0].length != matrix2.length) { 
        System.out.println("Matrix multiplication is not possible due to incompatible dimensions."); 
        return;         } 
// Result matrix initialization with the appropriate dimensions         
    int[][] result = new int[matrix1.length][matrix2[0].length]; 

    // Perform matrix multiplication         
    for (int i = 0; i < matrix1.length; i++) {             
        for (int j = 0; j < matrix2[0].length; j++) {                 
            for (int k = 0; k < matrix2.length; k++) {                     
                result[i][j] += matrix1[i][k] * matrix2[k][j]; 
            } 
        } 
    }      // Print the result matrix 
    System.out.println("Result of matrix multiplication:"); 
    for (int i = 0; i < result.length; i++) {             
        for (int j = 0; j < result[i].length; j++) { 
            System.out.print(result[i][j] + " "); 
        } 
        System.out.println(); 
    } 
} 
} 

