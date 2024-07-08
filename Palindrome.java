import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        int num = sc.nextInt();

        int c = num;
        int r, rev = 0;
        while (num != 0) {
            r = num % 10;
            rev = (rev * 10) + r;
            num = num / 10;
        }

        if (c == rev) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Number is not Palindrome");
        }
        sc.close();
    }
}
