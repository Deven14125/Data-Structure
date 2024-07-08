import java.util.*;

class stack {
    int top = -1;
    int max = 10;

    int[] s = new int[max];

    void push(int x) {
        if (top > max) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            s[top] = x;
            System.out.println("Top value = " + top);
        }
    }

    void pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Popped element is " + s[top]);
            top--;
        }
    }

    void peep() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Which Index Element You Want To Show");
        int i = sc.nextInt();
        if (top - i + 1 <= 0) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Peeped element is " + s[top - i + 1]);
        }
    }

    void display() {
        if (top < 0) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Stack Elements are:");
            for (int i = 0; i <= top; i++)
                System.out.print(s[i] + " ");
            System.out.println();
        }
    }

    void change() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which Index Element You Want To Change");
        int i = sc.nextInt();

        System.out.println("Enter New Element");
        int newElement = sc.nextInt();
        if (top - i + 1 <= 0) {
            System.out.println("Stack Underflow");
        } else {
            s[top - i + 1] = newElement;
        }
    }
}

public class StackOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stack st = new stack();
        while (true) {
            System.out.println("Enter Choice For Stack Operation");
            System.out.println("Press 1. For Push Elemrnt");
            System.out.println("Press 2. For Pop Elemrnt");
            System.out.println("Press 3. For Peep Elemrnt");
            System.out.println("Press 4. For Change Elemrnt");
            System.out.println("Press 5. For Display Elemrnt");
            System.out.println("Press 6. For Exit");

            int Choice = sc.nextInt();

            switch (Choice) {
                case 1: {
                    System.out.println("Enter the element to push :");
                    int num = sc.nextInt();
                    st.push(num);
                    break;
                }
                case 2: {
                    st.pop();
                    break;
                }
                case 3: {
                    st.peep();
                    break;
                }
                case 4: {
                    st.change();
                    break;
                }
                case 5: {
                    st.display();
                    break;
                }
            }
        }
    }
}