package recursion;
import java.util.*;

public class sumOfDigitOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        for (int i = 0; i < 5; i++) num[i] = sc.nextInt();
        System.out.println(sum(num, 0));
    }

    static int sum(int[] a, int i) {
        if (i == a.length) return 0;
        int s = 0, n = a[i];
        while (n > 0) {
            s += n % 10;
            n /= 10;
        }
        return s + sum(a, i + 1);
    }
}
