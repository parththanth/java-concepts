import java.util.Scanner;

class ReverseNumberRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        reverse(n);
        System.out.println();  
    }

    static void reverse(int n) {
        if (n < 0) {
            System.out.print("-");  
            reverse(-n);            
        }
        else if (n < 10) {
            System.out.print(n);
        } else {
            System.out.print(n % 10);
            reverse(n / 10);
        }
    }
}
