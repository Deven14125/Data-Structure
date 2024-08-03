import java.util.*;

public class LiniarSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = { 1, 2, 3, 4, 5, 6, 112, 5, 7, 9, 12 };

        System.out.println("Enter Number to find");
        int key = sc.nextInt();

        boolean isfound = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                isfound = true;
                System.out.println("Number is found at index " + i);
            }

        }
        if (!isfound) {
            System.out.println("Number is not found");
        }
    }
}