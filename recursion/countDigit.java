package recursion;
import java.util.*;

public class countDigit {

    public static int countDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return 1 + countDigits(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Digits: 1");  
        } else {
            System.out.println("Digits: " + countDigits(Math.abs(n)));
        }
    }
}
