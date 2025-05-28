package recursion;
import java.util.*;
public class sumOfDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sumOfDigitOfNum(num));
    }

    static int sumOfDigitOfNum(int num){
        if(num == 0)
            return 0;
        return (num % 10) + sumOfDigitOfNum(num / 10);
    }
}
