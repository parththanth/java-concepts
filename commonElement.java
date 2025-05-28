import java.util.*;

public class commonElement {
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] b = {
            {5, 6, 7},
            {8, 9, 10},
            {11, 12, 13}
        };

        Set<Integer> bucket = new HashSet<>();
        Set<Integer> temp = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                bucket.add(a[i][j]);
            }
        }

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                if (bucket.contains(b[i][j])) {
                    temp.add(b[i][j]);
                }
            }
        }

        for (int x : temp) {
            System.out.print(x + " ");
        }
    }
}
