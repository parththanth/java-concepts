
import java.util.*;

public class squareMatrix {
    static int sumOfmajorDiagonal(int[][] matrix) {
        int sum = 0;
        for (int ind = 0; ind < matrix.length; ind++) {
            sum = sum + matrix[ind][ind];
        }
        return sum;
    }

    static void printMajorDiagonal(int[][] matrix, int n) {
        for (int index = 0; index < n; index++) {
            System.out.print(matrix[index][index] + " ");
        }
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

        printMajorDiagonal(matrix, n);
        System.out.println("\nSum: " + sumOfmajorDiagonal(matrix));
    }
}
