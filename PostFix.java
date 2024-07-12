import java.util.*;

// class postFixNotation {

public class PostFix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String:");
        String str = sc.nextLine();

        Stack<Character> st = new Stack<>();

        String Polish = "";

        st.push('(');
        int i = 0;

        while (i < str.length()) {
            if (st.size() < 1) {
                System.out.println("String Invalid");
                break;
            }

            char next = str.charAt(i);

            while (G(st.peek()) > F(next)) {
                char temp = st.pop();
                Polish += temp;
            }

            if (G(st.peek()) != F(next)) {
                st.push(next);
            } else {
                st.pop();
            }
            i++;
        }

        if (st.size() != 0) {
            System.out.println("String Invalid");
            System.out.println(Polish);
        } else {
            System.out.println("Postfix Notation: " + Polish);
        }
    }

    static int F(char sym) {
        if (sym == '+' || sym == '-') {
            return 1;
        } else if (sym == '*' || sym == '/') {
            return 3;
        } else if (sym == '^') {
            return 6;
        } else if (sym >= 97 && sym <= 122) {
            return 7;
        } else if (sym == '(') {
            return 9;
        } else {
            return 0;
        }
    }

    static int G(char sym) {
        if (sym == '+' || sym == '-') {
            return 2;
        } else if (sym == '*' || sym == '/') {
            return 4;
        } else if (sym == '^') {
            return 5;
        } else if (sym >= 97 && sym <= 122) {
            return 8;
        } else {
            return 0;
        }
    }

    static int R(char sym) {
        if (sym == '+' || sym == '-' || sym == '*' || sym == '/' || sym == '^') {
            return -1;
        } else {
            return 1;
        }
    }
}

// import java.util.Stack;

// public class InfixToPostfix {

// // Method to determine the precedence of operators
// private static int precedence(char operator) {
// switch (operator) {
// case '+':
// case '-':
// return 1;
// case '*':
// case '/':
// return 2;
// case '^':
// return 3;
// default:
// return 0;
// }
// }

// // Method to convert infix expression to postfix
// public static String infixToPostfix(String infix) {
// StringBuilder postfix = new StringBuilder();
// Stack<Character> stack = new Stack<>();

// for (int i = 0; i < infix.length(); i++) {
// char ch = infix.charAt(i);

// // If the character is an operand, add it to the output
// if (Character.isLetterOrDigit(ch)) {
// postfix.append(ch);
// }
// // If the character is '(', push it to the stack
// else if (ch == '(') {
// stack.push(ch);
// }
// // If the character is ')', pop from stack until '(' is found
// else if (ch == ')') {
// while (!stack.isEmpty() && stack.peek() != '(') {
// postfix.append(stack.pop());
// }
// stack.pop(); // Remove '(' from the stack
// }
// // If the character is an operator
// else {
// while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)) {
// postfix.append(stack.pop());
// }
// stack.push(ch);
// }
// }

// // Pop all the operators from the stack
// while (!stack.isEmpty()) {
// postfix.append(stack.pop());
// }

// return postfix.toString();
// }

// public static void main(String[] args) {
// String infix = "A+B*(C^D-E)";
// String postfix = infixToPostfix(infix);
// System.out.println("Infix: " + infix);
// System.out.println("Postfix: " + postfix);
// }
// }
