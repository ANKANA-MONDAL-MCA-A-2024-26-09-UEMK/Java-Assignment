package week2;

public class SumOfTwo2DArrays {     
    public static void main(String[] args) {         
        // Declare and initialize two 2D arrays 
    int[][] array1 = { 
        {1, 2, 3}, 
        {4, 5, 6}, 
        {7, 8, 9} 
    }; 
                   
    int[][] array2 = { 
        {9, 8, 7}, 
        {6, 5, 4}, 
        {3, 2, 1} 
    }; // Assuming both arrays have the same dimensions         
    int rows = array1.length; 
    int cols = array1[0].length; 

    // Declare a 2D array to store the result of the sum         
    int[][] sumArray = new int[rows][cols]; 

    // Loop through the arrays and calculate the sum         
    for (int i = 0; i < rows; i++) {             
        for (int j = 0; j < cols; j++) { 
            sumArray[i][j] = array1[i][j] + array2[i][j]; 
        } 
    } 

    // Print the resulting array 
    System.out.println("Sum of the two 2D arrays:");         
    for (int i = 0; i < rows; i++) {             
        for (int j = 0; j < cols; j++) { 
            System.out.print(sumArray[i][j] + " "); 
        } 
        System.out.println(); 
    } 
} 
} 

