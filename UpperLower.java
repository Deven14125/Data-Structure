import java.util.*;

public class UpperLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A Random String Name :");
        String str = sc.nextLine();

        String str1 = str.toLowerCase();
        String str2 = str.toUpperCase();

        System.out.println(str1);
        System.out.println(str2);

        sc.close();
    }
}
