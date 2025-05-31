package recursion;
import java.util.*;

public class arraySortedornot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        for (int i = 0; i < 5; i++) num[i] = sc.nextInt();
        System.out.println(isSorted(num, 0));
    }

    static boolean isSorted(int[] num, int i) {
        if (i == num.length - 1) return true;
        if (num[i] > num[i + 1]) return false;
        return isSorted(num, i + 1);
    }
}
