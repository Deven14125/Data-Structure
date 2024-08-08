import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size Of Array :");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        mergesort(0, n - 1, a);

        System.out.println(Arrays.toString(a));
    }

    public static void mergesort(int low, int high, int[] a) {
        int mid = (low + high) / 2;
        if (low < high) {
            mergesort(low, mid, a);
            mergesort(mid + 1, high, a);
            merge(low, mid, high, a);
        }
    }

    public static void merge(int low, int mid, int high, int[] a) {
        int h = low;
        int i = 0;
        int j = mid + 1;
        int[] b = new int[high - low + 1];
        while (h <= mid && j <= high) {
            System.out.println(i + " , " + j);
            if (a[h] <= a[j]) {
                b[i] = a[h];
                h = h + 1;
            } else {
                b[i] = a[j];
                j = j + 1;
            }
            i++;
        }

        if (h > mid) {
            for (int k = j; k <= high; k++) {
                b[i] = a[k];
                i++;
            }
        } else {
            for (int k = h; k <= mid; k++) {
                b[i] = a[k];
                i++;
            }
        }
        for (int k = low; k <= high; k++) {
            a[k] = b[k - low];
        }
    }
}