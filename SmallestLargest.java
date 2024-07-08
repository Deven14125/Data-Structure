import java.util.*;

public class SmallestLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How Many Element ou Want To Enter :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int min = arr[0];
        int max = arr[0];
        int minindex = 0;
        int maxindex = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Number = " + i);
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                minindex = i;
            }
            if (max < arr[i]) {
                max = arr[i];
                maxindex = i;
            }
        }
        System.out.println("MinIndex = " + minindex + " MaxIndex = " + maxindex);
        sc.close();
    }
}