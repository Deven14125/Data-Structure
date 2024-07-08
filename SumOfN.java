import java.util.*;

// 
class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //
        System.out.print("Enter Number :");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            sum += (i * (i + 1) / 2);
            System.out.println("Sum = " + sum + ",");
        }
        sc.close();
    }
}

// for (int i = 1; i <= n; i++) {
// int sum = 0;
// for (int j = 1; j <= i; j++) {
// sum = sum + j;
// }
// System.out.println("Sum [" + i + "] = " + sum + ",");
// }