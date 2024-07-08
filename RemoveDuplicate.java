import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size Of Array :");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + i + " = ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    for (int k = j; k < n; k++) {
                        if (arr[k] == arr[k + 1]) {
                            n--;
                            j--;
                        }
                        System.out.println("Duplicate number found = " + arr[i]);
                    }
                    break;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
        sc.close();
    }
}
