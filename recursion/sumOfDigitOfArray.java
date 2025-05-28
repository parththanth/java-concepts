package recursion;
import java.util.*;

public class sumOfDigitOfArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        for (int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println(sumOfDigitOfNum(num, 0));
    }

    static int sumOfDigitOfNum(int[] num, int index){
        if (index == num.length)
            return 0;
        return sumDigits(num[index]) + sumOfDigitOfNum(num, index + 1);
    }

    static int sumDigits(int n){
        if (n == 0)
            return 0;
        return (n % 10) + sumDigits(n / 10);
    }
}
