import java.util.*;

public class BubbleShort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size Of Array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Elements Of Array:");
            arr[i] = sc.nextInt();
        }

        int last = n;
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < last - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Array Is Already Sorted");
            } else {
                last = last - 1;
            }
        }
        System.out.println("Sorted array is");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}