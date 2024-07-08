import java.util.*;//

public class ArmstrongN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//
        System.out.print("Armstrong Number Between 0 to 1000 = ");

        for (int i = 1; i <= 1000; i++) {
            int n = i;
            int sum = 0;

            while (n > 0) {
                int num = n % 10;
                sum = sum + (num * num * num);
                n = n / 10;
            }
            if (sum == i) {
                System.out.print(sum + " , ");
            }
        }
        sc.close();
    }
}