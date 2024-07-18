import java.util.*;

class queue {
    int info;
    Node link;

    queue(int data) {
        this.info = data;
        this.link = null;
    }
}

class queueLinked {
    Node top;
    Node rear;

    void enqueue(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
            rear = newNode;
        } else {
            rear.link = newNode;
            rear = newNode;
            // top.link = newNode;
            // top = newNode;
        }
    }

    void dequque() {
        if (top == null) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Deleted element is: " + top.info);
        top = top.link;
    }

    void display() {
        if (top == null) {
            System.out.println("Queue is empty");
            return;
        } else {
            System.out.println("Queue elements are: ");
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.info + " ");
                temp = temp.link;
            }
            System.out.println();

        }
    }
}

public class QueueUsingLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        queueLinked queue = new queueLinked();

        while (true) {
            System.out.println("\nQueue Operation");
            System.out.println("Press 1. For Enqueue");
            System.out.println("Press 2. For Dequeue");
            System.out.println("Press 3. For Display");
            System.out.println("Press 4. For Exit");

            System.out.println("\nEnter Choice :");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to enqueue: ");
                    int element = sc.nextInt();
                    queue.enqueue(element);
                    break;
                case 2:
                    queue.dequque();
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}