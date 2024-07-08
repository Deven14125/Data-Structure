import java.util.*;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a size of array = ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        int index = 0;
        boolean isFound = false;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + " = ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Which index element you want to delete = ");
        int e1 = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (e1 == arr[i]) {
                index = i;
                isFound = true;
                break;
            }
        }
        if (isFound && e1 < n) {
            System.out.println("Index Of " + e1 + " = " + index);
            System.out.print("New Array = ");
            for (int i = 0; i < n; i++) {
                if (i != index) {
                    System.out.print(arr[i] + ",");
                }
            }
        } else {
            System.out.println("Number Does Not Exist In Array Or Index Out Of Bound");

            for (int i = 0; i < n; i++) {
                System.out.println(arr[i] + ",");
            }
        }
        sc.close();
    }
}