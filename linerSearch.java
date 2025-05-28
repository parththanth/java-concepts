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
        search(arr, target);
    }

    public static void search(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                System.out.println("found at index" + i);
                return;
            }
        }
        System.out.println("not found");
    }
}
