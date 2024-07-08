import java.util.*;

public class InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a size of array = ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + " = ");
            arr[i] = sc.nextInt();
        }

        System.out.print("On Which index you want to enter new element = ");
        int index = sc.nextInt();

        System.out.print("Enter new element =");
        int number = sc.nextInt();

        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (index < n) {
                if (i == index) {
                    newArr[i] = number;
                } else if (i < newArr.length) {
                    newArr[i] = arr[j++];
                } else {
                    System.out.println("Index Out Of Bound");
                }
            }

        }
        System.out.print("New Array = ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + ",");
        }
        sc.close();
    }
}