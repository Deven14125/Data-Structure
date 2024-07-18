import java.util.*;

public class EvaluatePostfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter PostFix :");
        String PostFix = sc.nextLine();

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < PostFix.length(); i++) {
            char next = PostFix.charAt(i);

            if (next >= 48 && next <= 57) {
                st.push(Integer.parseInt(next + ""));
            } else {
                int ope1 = st.pop();
                int ope2 = st.pop();

                switch (next) {
                    case '+':
                        st.push(ope1 + ope2);
                        break;
                    case '-':
                        st.push(ope2 - ope1);
                        break;
                    case '*':
                        st.push(ope1 * ope2);
                        break;
                    case '/':
                        st.push(ope2 / ope1);
                        break;
                    case '^':
                        st.push((int) Math.pow(ope1, ope2));
                        break;
                }
            }
            System.out.println("Final Answer :" + st);
        }
        System.out.println("Popped Answer :" + st.pop());
        sc.close();
    }
}
