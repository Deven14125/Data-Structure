import java.util.*;

public class ReplaceIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size Of Array :");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Element " + i + " = ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter val1 = ");
        int val1 = sc.nextInt();
        System.out.print("Enter val2 = ");
        int val2 = sc.nextInt();

        int index1 = -1;
        int index2 = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val1) {
                index1 = i;
            }
            if (arr[i] == val2) {
                index2 = i;
            }
        }
        if (index1 < 0 || index2 < 0) {
            System.out.println("Array = ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + ",");
            }
            System.out.println("There is no changed in array");
        } else {
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
            System.out.print("New Array = ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + ",");
            }
        }
        sc.close();
    }
}