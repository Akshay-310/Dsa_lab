package myhelloworld;
import java.util.Scanner;

public class TransposeMatrix {

    // Method to take matrix input
    public static int[][] inputMatrix(int a, int b) {
        
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[a][b];
        System.out.println("Enter the elements for the matrix:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    // Method to calculate the transpose of a matrix
    public static int[][] calculateTranspose(int[][] matrix, int a, int b) {
        int[][] transpose = new int[b][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Method to print the matrix
    public static void printMatrix(int[][] matrix, int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get matrix size from the user
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

        // Call methods
        int[][] matrix = inputMatrix(rows, columns);
        
        System.out.println("Original Matrix:");
        printMatrix(matrix, rows, columns);

        int[][] transpose = calculateTranspose(matrix, rows, columns);
        
        System.out.println("Transpose of the Matrix:");
        printMatrix(transpose, columns, rows);

        sc.close();
    }
}
