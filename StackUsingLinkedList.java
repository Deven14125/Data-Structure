import java.util.*;

class stack {
    int info;
    Node link;

    stack(int data) {
        this.info = data;
        this.link = null;
    }

}

class stackLinked {

    Node top;

    void push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
            return;
        }
        newNode.link = top;
        top = newNode;
    }

    void pop() {
        if (top == null) {
            System.out.println("Stack Is Empty");
        } else {
            System.out.println("Popped Element Is :" + top.info);
            top = top.link;
        }
    }

    void peek() {
        if (top == null) {
            System.out.println("Stack Is Empty");
        } else {
            System.out.println("Peeked Element is :" + top.info);
        }
    }

    void display() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.info + " ");
            temp = temp.link;
        }
        System.out.println();
    }
}

public class StackUsingLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        stackLinked stacklinked = new stackLinked();

        while (true) {
            System.out.println("\nStack LinkedList Opeation");
            System.out.println("Press 1. For Push Element In Stack Linked List");
            System.out.println("Press 2. For Pop Element In Stack Linked List");
            System.out.println("Press 3. For Know Which Is Element Is On Top");
            System.out.println("Press 4. For Display Element OF Stack Linked List");

            System.out.print("Enter Choice = ");
            int Choice = sc.nextInt();

            switch (Choice) {
                case 1:
                    System.out.print("Enter Element To Push = ");
                    int pushElement = sc.nextInt();
                    stacklinked.push(pushElement);
                    break;
                case 2:
                    stacklinked.pop();
                    break;
                case 3:
                    stacklinked.peek();
                    break;
                case 4:
                    stacklinked.display();
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}