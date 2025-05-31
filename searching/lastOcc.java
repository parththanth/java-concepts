package searching;
import java.util.*;

public class lastOcc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
           Arrays.sort(num); 
        int target = sc.nextInt();

        int index = lastOccurrence(num, 0, n - 1, target);

        if (index != -1)
            System.out.println("Last occurrence at index: " + index);
        else
            System.out.println("Element not found.");
    }

    static int lastOccurrence(int[] arr, int start, int end, int target) {
        if (start > end) return -1;

        int mid = (start + end) / 2;

        if ((mid == arr.length - 1 || arr[mid + 1] > target) && arr[mid] == target)
            return mid;
        else if (arr[mid] > target)
            return lastOccurrence(arr, start, mid - 1, target);
        else
            return lastOccurrence(arr, mid + 1, end, target);
    }
}
