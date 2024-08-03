import java.util.*;

public class IntersectionShort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size Of Array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter arr[" + i + "]");
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            int small = arr[i];
            int j = i - 1;

            while (j >= 0 && small < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = small;
        }

        System.out.println("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
