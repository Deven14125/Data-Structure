import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        int n = sc.nextInt();

        int i = 1, count = 0;
        while (i <= n) {
            if (n % i == 0) {
                count++;
            }
            i++;
        }
        if (count == 2) {
            System.out.println("Given Number Is Prime Number");
        } else {
            System.out.println("Given Number Is Not Prime Number");
        }
        sc.close();
    }
}