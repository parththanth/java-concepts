import java.util.*;

class reverseCount {
    public static void reversecount(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.println(n);
            reversecount(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reversecount(n);
    }
}
