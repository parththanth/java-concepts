import java.util.*;

public class findElement {
    static boolean findElement(int[][] matrix, int key) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == key) {
                    return true;
                }
            }
        }
        return false;
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

        int key = sc.nextInt(); 
        if (findElement(matrix, key)) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}
