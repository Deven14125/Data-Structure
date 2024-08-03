import java.util.*;

public class SelectionShort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Sixe Of Array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element Of Array :");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            int minindex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minindex]) {
                    minindex = j;
                }
            }
            if (minindex != i) {
                int temp = arr[i];
                arr[i] = arr[minindex];
                arr[minindex] = temp;
            }
        }
        System.out.println("Sorted array is");
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}