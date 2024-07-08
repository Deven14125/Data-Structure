import java.util.*;

class Node {
    int info;
    Node link;

    Node(int data) {
        this.info = data;
        this.link = null;
    }
}

class LinkedList {
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

    void removeDuplicate() {
        if (first == null) {
            System.out.println("Stack Is Empty");
            return;
        }
        Node temp = first.link;
        Node temp1 = first;

        while (temp1.link != null) {
            if (temp1.info == temp.info) {
                temp1.link = temp.link;
            }
            temp1 = temp;
            temp = temp.link;
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

}

public class RemoveDuplicateLinkLi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList list1 = new LinkedList();

        System.out.println("LinkedList Operation :");
        while (true) {
            System.out.println("\n1. Insert at First");
            System.out.println("2. Insert at Last");
            System.out.println("3. Remove Duplicate");
            System.out.println("4. Print List");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert at first: ");
                    int data = sc.nextInt();
                    list1.insertAtFirst(data);
                    break;
                case 2:
                    System.out.print("Enter data to insert at last: ");
                    data = sc.nextInt();
                    list1.insertAtLast(data);
                    break;
                case 3:
                    list1.removeDuplicate();
                    break;
                case 4:
                    list1.printList();
                    break;
            }
        }
    }
}
