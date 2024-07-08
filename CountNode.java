import java.util.*;

class LinkL {
    int size = 0;

    class Node {
        int info;
        Node link;

        Node(int data) {
            this.info = data;
            this.link = null;
            size++;
        }
    }

    Node first;

    void insertAtFirst(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            return;
        }
        // newNode.info = data;
        newNode.link = first;
        first = newNode;
    }

    void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            return;
        }
        Node currentNode = first;
        while (currentNode.link != null) {
            currentNode = currentNode.link;
        }
        currentNode.link = newNode;
    }

    void deleteAtFirst() {
        if (first == null) {
            System.out.println("List Is Empty");
            return;
        }
        size--;
        first = first.link;
    }

    void getSizeNode() {
        System.out.println("Size of LinkedList: " + size);
    }

    public class CountNode {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            LinkL list = new LinkL();

            System.out.println("LinkedList Operation :");
            while (true) {
                System.out.println("\n1. Insert at First");
                System.out.println("2. Insert at Last");
                System.out.println("3. Delete First");
                System.out.println("4. Get Size of LinkedList");
                System.out.println("5. Exit");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter data to insert at first: ");
                        int data = sc.nextInt();
                        list.insertAtFirst(data);
                        break;
                    case 2:
                        System.out.print("Enter data to insert at last: ");
                        data = sc.nextInt();
                        list.insertAtLast(data);
                        break;
                    case 3:
                        list.deleteAtFirst();
                        break;
                    case 4:
                        list.getSizeNode();
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        sc.close();
                        return;
                }
            }
        }
    }
}