import java.util.*;

public class firstOcc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] num = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        Arrays.sort(num);

        int target = sc.nextInt();

        int index = firstOccurrence(num, 0, n - 1, target);

        if (index != -1)
            System.out.println("First occurrence at index: " + index);
        else
            System.out.println("Element not found.");
    }

    static int firstOccurrence(int[] arr, int start, int end, int target) {
        int result = -1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                result = mid;
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

}
