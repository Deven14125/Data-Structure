import java.util.*;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 200, 800 };
        int result = BinarySearchRecursive(arr, 0, arr.length - 1, 200);
        System.out.println(result);
    }

    public static int BinarySearchRecursive(int[] arr, int left, int right, int x) {
        // if (left > right) {
        // return -2;
        // }
        int mid = (left + right) / 2;
        if (arr[mid] == x) {
            return mid;
        } else {
            if (arr[mid] > x) {
                return BinarySearchRecursive(arr, left, mid - 1, x);
            } else if (arr[mid] < x) {
                return BinarySearchRecursive(arr, mid + 1, right, x);
            }
        }
        return -1;
    }
}