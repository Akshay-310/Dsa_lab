package myhelloworld;
import java.util.Scanner;

public class DiagonalSum {
    
    int leftDiagonalSum = 0;
    int rightDiagonalSum = 0;
    
    // Method to calculate the sums of left and right diagonals
    void Calculatesum(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) 
        {
            leftDiagonalSum += matrix[i][i];           // Left diagonal elements
            rightDiagonalSum += matrix[i][n - i - 1];  // Right diagonal elements
        }
    }
    
    // Method to print the sums
    void printSum() 
    {
        System.out.println("Left Diagonal Sum: " + leftDiagonalSum);
        System.out.println("Right Diagonal Sum: " + rightDiagonalSum);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get matrix size
        System.out.print("Enter the size of the square matrix: ");
        int n = sc.nextInt();
        
        int[][] matrix = new int[n][n];
        
        // Input matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        DiagonalSum myobj = new DiagonalSum();
        myobj.Calculatesum(matrix, n);
        
        // Print the results
        myobj.printSum();
        
        sc.close();
    }
}
