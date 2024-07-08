import java.util.*;

class LinkedList {
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

    void deleteAtLast() {
        if (first == null) {
            System.out.println("List Is Empty");
            return;
        }
        size--;
        if (first.link == null) {
            first = null;
        }
        Node secondLast = first;
        Node lastNode = first.link;
        while (lastNode.link != null) {
            lastNode = lastNode.link;
            secondLast = secondLast.link;
        }
        secondLast.link = null;
    }

    void insertOrdered(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            newNode.link = first;
            return;
        }

    }

    void deleteSpecified(int i) {
        if (first == null) {
            System.out.println("List Is Empty");
            return;
        }
        Node currentNode = first;
        Node previousNode = first;
        int count = 1;
        while (currentNode.link != null) {
            if (count == i) {
                previousNode.link = currentNode.link;
                return;
            }
            previousNode = currentNode;
            currentNode = currentNode.link;
            count++;
        }
        System.out.println("Element Not Found");
    }

    void getSizeNode() {
        System.out.println("Size of LinkedList: " + size);
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

    public class LinkedListOpe {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            LinkedList mylist = new LinkedList();

            System.out.println("LinkedList Operation :");
            while (true) {
                System.out.println("\n1. Insert at First");
                System.out.println("2. Insert at Last");
                System.out.println("3. Delete First");
                System.out.println("4. Delete Last");
                System.out.println("5. Print List");
                System.out.println("6. Delete at a specific position");
                System.out.println("7. Get Size of LinkedList");
                System.out.println("8. Exit");

                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter data to insert at first: ");
                        int data = sc.nextInt();
                        mylist.insertAtFirst(data);
                        break;
                    case 2:
                        System.out.print("Enter data to insert at last: ");
                        data = sc.nextInt();
                        mylist.insertAtLast(data);
                        break;
                    case 3:
                        mylist.deleteAtFirst();
                        break;
                    case 4:
                        mylist.deleteAtLast();
                        break;
                    case 5:
                        mylist.printList();
                        break;
                    case 6:
                        System.out.print("Enter the position to delete: ");
                        int pos = sc.nextInt();
                        mylist.deleteSpecified(pos);
                        break;
                    case 7:
                        mylist.getSizeNode();
                        break;
                    case 8:
                        System.out.println("Exiting...");
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid choice! Try again.");
                }
            }
        }
    }
}