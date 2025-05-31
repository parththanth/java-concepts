package recursion;
import java.util.*;

class maxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        for (int i = 0; i < 5; i++) num[i] = sc.nextInt();
        System.out.println(Max(num,0));
    }

    static int Max(int[] num, int i) {
        if (i == num.length - 1) return num[i];
        int maxRest = Max(num, i + 1);
        return num[i] > maxRest ? num[i] : maxRest;
    }
}
