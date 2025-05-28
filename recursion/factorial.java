package recursion;
import java.util.*;
public class factorial {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(factOfN(num));
    }

    static int factOfN (int num){
        if(num==1||num==0){
            return 1;
        }else{
            return num * factOfN(num-1) ;
        }

    }

}
    

