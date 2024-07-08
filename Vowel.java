import java.util.*;;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter a String");
        String str = sc.nextLine();

        int i, n = str.length();
        int vowel = 0, conso = 0;
        for (i = 0; i < n; i++) {
            if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O'
                    || str.charAt(i) == 'U' ||
                    str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                vowel++;
            } else {
                conso++;
            }
        }
        System.out.println("Vowel =" + vowel);
        System.out.println("Conso =" + conso);
        sc.close();
    }
}
