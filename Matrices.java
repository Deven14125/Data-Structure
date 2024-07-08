import java.util.*;

public class Matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row :");
        int m = sc.nextInt();
        System.out.print("Enter col :");
        int n = sc.nextInt();

        int[][] arr1 = new int[m][n];
        int[][] arr2 = new int[m][n];
        int[][] arr3 = new int[m][n];
        System.out.println("Enter First Matrix Element");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter arr1[" + i + "][" + j + "] = ");
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Second Matrix Element");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter arr2[" + i + "][" + j + "] = ");
                arr2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(arr3[i][j] + "  ");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}