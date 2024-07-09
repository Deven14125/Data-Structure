import java.util.*;

class LinkLi {

    class Node {
        int info;
        Node link;

        Node(int data) {
            this.info = data;
            this.link = null;
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

    void revLink() {
        if (first == null || first.link == null) {
            System.out.println("Empty");
            return;
        } else {
            Node prevNode = first;
            Node currNode = first.link;
            while (currNode != null) {
                Node nextNode = currNode.link;
                currNode.link = prevNode;

                prevNode = currNode;
                currNode = nextNode;
            }
            first.link = null;
            first = prevNode;
        }

    }

    void printList() {
        if (first == null) {
            System.out.println("List Is Empty");
        }
        Node currentNode = first;
        while (currentNode != null) {
            System.out.print(currentNode.info + " -> ");
            currentNode = currentNode.link;
        }
        System.out.println("NULL");
    }

    public class ReverseLinkedList {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            LinkLi lists = new LinkLi();
            System.out.println("LinkedList Operation :");
            while (true) {
                System.out.println("\n1. Insert at First");
                System.out.println("2. Insert at Last");
                System.out.println("2. Reverse List");
                System.out.println("2. Print List");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter data to insert at first: ");
                        int data = sc.nextInt();
                        lists.insertAtFirst(data);
                        break;
                    case 2:
                        System.out.print("Enter data to insert at last: ");
                        data = sc.nextInt();
                        lists.insertAtLast(data);
                        break;
                    case 3:
                        lists.revLink();
                        break;
                    case 4:
                        lists.printList();
                        break;
                }
            }
        }
    }
}