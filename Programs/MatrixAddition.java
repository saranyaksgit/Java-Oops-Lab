import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the first matrix: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter the number of columns for the first matrix: ");
        int columns1 = scanner.nextInt();

        System.out.print("Enter the number of rows for the second matrix: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter the number of columns for the second matrix: ");
        int columns2 = scanner.nextInt();

        if (rows1 != rows2 || columns1 != columns2) {
            System.out.println("Matrix addition is not possible. The dimensions of the matrices are not equal.");
        } else {
            int[][] matrix1 = new int[rows1][columns1];
            int[][] matrix2 = new int[rows2][columns2];
            int[][] sumMatrix = new int[rows1][columns1];

            System.out.println("Enter elements of the first matrix:");
            readMatrix(scanner, matrix1);

            System.out.println("Enter elements of the second matrix:");
            readMatrix(scanner, matrix2);

            // Perform matrix addition
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < columns1; j++) {
                    sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }

            System.out.println("Resultant matrix after addition:");
            displayMatrix(sumMatrix);
        }

        scanner.close();
    }

    public static void readMatrix(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

