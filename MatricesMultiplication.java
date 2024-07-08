import java.util.*;

public class MatricesMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st matrix row :");
        int m1 = sc.nextInt();
        System.out.print("Enter 1st matrix col :");
        int n1 = sc.nextInt();

        int[][] arr1 = new int[m1][n1];
        System.out.println("Enter First Matrix Element");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                System.out.print("Enter arr1[" + i + "][" + j + "] = ");
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter 2nd matrix row :");
        int m2 = sc.nextInt();
        System.out.print("Enter 2nd matrix col :");
        int n2 = sc.nextInt();

        int[][] arr2 = new int[m2][n2];
        System.out.println("Enter Second Matrix Element");
        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print("Enter arr2[" + i + "][" + j + "] = ");
                arr2[i][j] = sc.nextInt();
            }
        }
        if (m1 != n2) {
            System.out.println("Matrix Multiplication Is Not Possible");
        } else {
            System.out.println("New Arrray =");
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n2; j++) {
                    int result = 0;
                    for (int k = 0; k < n1; k++) {
                        result += arr1[i][k] * arr2[k][j];
                    }
                    System.out.print(result + " ");
                }
                System.out.println(" ");
            }
        }
        sc.close();
    }
}