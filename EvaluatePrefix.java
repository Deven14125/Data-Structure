import java.util.*;

public class EvaluatePrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter PreFix :");
        String Prefix = sc.nextLine();

        Stack<Integer> sta = new Stack<>();

        String rev = "";
        for (int i = Prefix.length() - 1; i >= 0; i--) {
            char ch = Prefix.charAt(i);
            rev += ch;
        }
        System.out.print("Reverse Prefix :" + rev);

        for (int i = 0; i < rev.length(); i++) {
            char next = rev.charAt(i);

            if (next >= 48 && next <= 57) {
                sta.push(Integer.parseInt(next + ""));
            } else {
                int ope2 = sta.pop();
                int ope1 = sta.pop();

                switch (next) {
                    case '+':
                        sta.push(ope1 + ope2);
                        break;
                    case '-':
                        sta.push(ope2 - ope1);
                        break;
                    case '*':
                        sta.push(ope1 * ope2);
                        break;
                    case '/':
                        sta.push(ope2 / ope1);
                        break;
                    case '^':
                        sta.push((int) Math.pow(ope2, ope1));
                        break;
                }
            }
            System.out.println("Final Answer :" + sta);
        }
        System.out.println("Popped Answer :" + sta.pop());
        sc.close();
    }
}