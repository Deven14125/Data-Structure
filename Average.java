import java.util.*;

public class Average {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum till number " + n + " = " + sum);
        double avg = sum / n;
        System.out.println("Average = " + avg);
        sc.close();
    }
}