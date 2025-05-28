package recursion;
import java.util.*;
public class ltonseriseSum {
    static int nseriseSum(int n){
        if(n<=0){
           return 0;
        }else{
            return n+nseriseSum(n-1);
        }
    } 

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(nseriseSum(n));
}
}