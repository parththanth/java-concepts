package searching;
import java.util.*;

public class linerSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        search(arr, target, 0);
    }

    public static void search(int[] arr, int target, int i){
        if(i == arr.length){
            System.out.println("not found");
            return;
        }
        if(arr[i] == target){
            System.out.println("found at index" + i);
            return;
        }
        search(arr, target, i + 1);
    }
}
