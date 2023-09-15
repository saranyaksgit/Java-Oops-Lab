import java.util.*;

public class Symmetric {
    public static void main(String args[]) {
        int i, j, rows, cols, n = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows for the Matrix: ");
        rows = sc.nextInt();
        System.out.print("Enter the number of columns for the Matrix: ");
        cols = sc.nextInt();
        
        if (rows != cols) {
            System.out.println("Matrix is not symmetric because it's not a square matrix.");
        } else {
            int a[][] = new int[rows][cols];
            
            System.out.println("Enter the Matrix:");
            for (i = 0; i < rows; i++) {
                for (j = 0; j < cols; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            
            // Check for symmetry
            for (i = 0; i < rows; i++) {
                for (j = 0; j < cols; j++) {
                    if (a[i][j] != a[j][i]) {
                        n = 1;
                        break;
                    }
                }
                if (n == 1) {
                    break;
                }
            }
            
            System.out.println("The Matrix is:");
            for (i = 0; i < rows; i++) {
                for (j = 0; j < cols; j++) {
                    System.out.print(" " + a[i][j]);
                }
                System.out.println();
            }
            
            if (n == 0) {
                System.out.println("Matrix is symmetric.");
            } else {
                System.out.println("Matrix is not symmetric.");
            }
        }
    }
}

