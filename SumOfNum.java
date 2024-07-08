import java.util.*;

public class SumOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int m = sc.nextInt();
        System.out.println("Enter second number");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = m; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum between " + m + " & " + n + " = " + sum);
        sc.close();
    }
}
