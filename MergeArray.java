import java.util.*;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size Of Array1 :");
        int n1 = sc.nextInt();

        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter a[" + i + "] :");
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter Size Of Array2 :");
        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Enter a[" + i + "] :");
            arr2[i] = sc.nextInt();
        }

        int[] arr3 = new int[arr1.length + arr2.length];

        int p = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
            p++;
        }

        for (int i = 0; i < arr2.length; i++) {
            arr3[p] = arr2[i];
            p++;
        }

        for (int i = 0; i < arr3.length; i++) {
            int minvalue = arr3[i];
            int minindex = i;
            for (int j = i; j < arr3.length; j++) {
                if (arr3[j] < minvalue) {
                    minvalue = arr3[j];
                    minindex = j;
                }
            }
            arr3[minindex] = arr3[i];
            arr3[i] = minvalue;
        }
        System.out.println("After Merge Array :");
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
        sc.close();
    }
}
