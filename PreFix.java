//Here We want to convert infix notation to prefix notation using stack
//(1). First we need to declare three method F , G and R
//(2). then we take a string from a user
//(3). then we need to reverse a string which given by user
//(4). then create stack and push closing bracket

import java.util.*;

public class PreFix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // enter a string
        System.out.print("Enter a String = ");
        String string = sc.nextLine();

        // create revString for Store reverse string
        String revString = "";

        // using for loop we reverse string
        for (int i = string.length() - 1; i >= 0; i--) {
            char ch = string.charAt(i);
            if (ch == '(') {
                revString += ch = ')';
            } else if (ch == ')') {
                revString += ch = '(';
            } else {
                revString += ch;
            }
        }

        // print reverse string
        System.out.print("Reverse String = " + revString);
        revString += ")";

        Stack<Character> stac = new Stack<>();

        // create empty string for store prefix string
        String Polish = "";

        stac.push('(');

        // we repeat while loop till reverse string length
        int i = 0;
        while (i < revString.length()) {
            if (stac.size() < 1) {
                System.out.println("\nInvalid String");
                break;
            }

            char next = revString.charAt(i);
            while (G(stac.peek()) > F(next)) {
                char temp = stac.pop();
                Polish += temp;
            }

            if (G(stac.peek()) != F(next)) {
                stac.push(next);
            } else {
                stac.pop();
            }
            i++;
        }

        if (stac.size() != 0) {
            System.out.println("\nString Invalid");
            System.out.println(Polish);
        } else {
            for (int j = Polish.length() - 1; j >= 0; j--) {
                Polish.charAt(j);
            }
            System.out.println("\nPrefix String = " + Polish);
        }
    }

    // craete method for return value of character
    static int F(char sym) {
        if (sym == '+' || sym == '-') {
            return 2;
        } else if (sym == '*' || sym == '/') {
            return 4;
        } else if (sym == '^') {
            return 5;
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
            return 1;
        } else if (sym == '*' || sym == '/') {
            return 3;
        } else if (sym == '^') {
            return 6;
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