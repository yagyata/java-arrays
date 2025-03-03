import java.util.Scanner;

public class MatrixTo1DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        // Creating a 2D array (Matrix)
        int[][] matrix = new int[rows][cols];

        // Taking input for the 2D array
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Creating a 1D array to store elements from the 2D array
        int[] array = new int[rows * cols];
        int index = 0;

        // Copying elements from 2D array to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        // Printing the 2D array
        System.out.println("The original 2D matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to next line after each row
        }

        // Printing the 1D array
        System.out.println("Converted 1D array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
