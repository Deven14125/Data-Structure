import java.util.*;

public class PrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How Many Element You Want to Enter");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Element Number " + i);
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
