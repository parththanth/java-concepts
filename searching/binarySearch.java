package searching;
import java.util.*;

public class binarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr); 
        binarySearch(arr, target, 0, arr.length - 1);
    }

    public static void binarySearch(int[] arr, int target, int start, int end){
        if(start > end){
            System.out.println("not found");
            return;
        }
        int mid = (start + end) / 2;
        if(arr[mid] == target){
            System.out.println("found at index" + mid);
            return;
        } else if(arr[mid] < target){
            binarySearch(arr, target, mid + 1, end);
        } else {
            binarySearch(arr, target, start, mid - 1);
        }
    }
}
