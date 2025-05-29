import java.util.*;

public class sumOfminorDiagonal {
     static void printMinorDiagonal(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][n - i -1] + " ");
        }
    }
    
    static int sumOfMinorDiagonal(int[][] matrix) {
        int sum = 0;
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][n - 1 - i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                matrix[row][col] = sc.nextInt();
            }
        }

        printMinorDiagonal(matrix, n);
        System.out.println("\nSum: " + sumOfMinorDiagonal(matrix));
    }
}
