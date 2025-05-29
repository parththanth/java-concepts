import java.util.*;

public class sumOfRows {
    static void printRowSums(int[][] matrix, int n) {
        for (int col = 0; col < n; col++) {       
            int sum = 0;
            for  (int row = 0; row < n; row++) {  
                sum = sum + matrix[row][col];
            }
            System.out.println("Sum of column " + col + ": " + sum);
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

        printRowSums(matrix, n);
    }
}
