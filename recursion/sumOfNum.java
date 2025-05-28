package recursion;
import java.util.*;
public class sumOfNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfN(n));
        sc.close();
    }
    static int sumOfN(int n){
        if(n == 1){
            return 1;
        } else {
            return n + sumOfN(n - 1);
        }
    }
}
 