package recursion;
import java.util.*;

public class powerFun {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int power = sc.nextInt();
        System.out.println(powerFunction(num, power));
    }

    static int powerFunction(int num, int power){
        if(power == 0){
            return 1; 
        } else {
            return num * powerFunction(num, power - 1);
        }
    }
}
