import java.util.*;

public class BinarySearchNew {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

        int left = 0;
        int right = arr.length - 1;

        System.out.println("Enter Number To Search:");
        int num = sc.nextInt();

        boolean isFound = false;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == num) {
                isFound = true;
                System.out.println("Number Found = " + arr[mid]);
                break;
            } else if (arr[mid] > num) {
                right = mid - 1;
            } else if (arr[mid] < num) {
                left = mid + 1;
            }
        }
        if (!isFound) {
            System.out.println("Number Not Found");
        }
    }
}