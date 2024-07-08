import java.util.*;

public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size Of Array :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int duplicate = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + i + " = ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicate++;
                    break;
                }
            }
        }
        System.out.println("Duplicate Number = " + duplicate);
        sc.close();
    }
}
