package recursion;
import java.util.*;

class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 

        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }

    static int fib(int n) {
        if (n < 2) return n;
        return fib(n - 1) + fib(n - 2);
    }
}
