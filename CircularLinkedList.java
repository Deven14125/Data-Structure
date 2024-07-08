import java.util.*;

class Node {
    int info;
    Node link;

    Node(int data) {
        this.info = data;
        this.link = null;
    }
}

class CircularLinkLi {
    Node First;
    Node Last;

    void insertFirst(int data) {
        Node newNode = new Node(data);
        if (First == null) {
            newNode.link = newNode;
            First = Last = newNode;
        }
        newNode.link = First;
        Last.link = newNode;
        First = newNode;
    }

    void insertLast(int data) {
        Node newNode = new Node(data);
        if (First == null) {
            newNode.link = newNode;
            First = Last = newNode;
        }
        Node Last = First;
        while (Last.link != First) {
            Last = Last.link;
        }
        Last.link = newNode;
        // Last = newNode;
        newNode.link = First;
    }

    void insertOrdered(int data) {
        Node newNode = new Node(data);
        if (First == null) {
            newNode.link = newNode;
            First = Last = newNode;
            return;
        }
        if (newNode.info <= First.info) {
            newNode.link = First;
            Last.link = newNode;
            First = newNode;
            return;
        }
        Node Save = First;
        while (Save != Last && newNode.info >= Save.link.info) {
            Save = Save.link;
        }
        newNode.link = Save.link;
        Save.link = newNode;
    }

    void deleteFirst() {
        if (First == null) {
            System.out.println("List Is Empty");
            return;
        }
        First = First.link;
        Last.link = First;
    }

    void deleteLast() {
        Node prevNode = First;
        Node currNode = First;

        while (currNode.link != First) {
            prevNode = currNode;
            currNode = currNode.link;
        }
        prevNode.link = First;
    }

    void deleteSpecifiedEle(int i) {
        Scanner sc = new Scanner(System.in);
        Node prevNode = First;
        Node currNode = First;

        if (First == null) {
            System.out.println("List Is Empty");
            return;
        }

        while (currNode.link != prevNode) {
            if (i == First.info) {
                First = First.link;
            } else if (i == currNode.info) {
                prevNode.link = currNode.link;
                return;
            } else {
                prevNode = currNode;
                currNode = currNode.link;
            }
        }
    }

    void printList() {
        Node current = First;
        if (current != null) {
            do {
                System.out.print(current.info + " -> ");
                current = current.link;
            } while (current != First);
        }
    }
}

public class CircularLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CircularLinkLi circular = new CircularLinkLi();
        while (true) {

            System.out.println("\nCircular Operation");
            System.out.println("1. For Insert At First");
            System.out.println("2. For Insert At Last");
            System.out.println("3. For Insert In Ordered");
            System.out.println("4. For Delete At First");
            System.out.println("5. For Delete At Last");
            System.out.println("6. For Delete Specified Element");
            System.out.println("7. For Print List");
            System.out.println("8. For Exit");

            int Choice = sc.nextInt();

            switch (Choice) {
                case 1:
                    System.out.println("Enter Element to Insert");
                    int data = sc.nextInt();
                    circular.insertFirst(data);
                    break;
                case 2:
                    System.out.println("Enter Element to Insert");
                    data = sc.nextInt();
                    circular.insertLast(data);
                    break;
                case 3:
                    System.out.println("Enter a Element to Insert Ordered");
                    data = sc.nextInt();
                    circular.insertOrdered(data);
                case 4:
                    circular.deleteFirst();
                    break;
                case 5:
                    circular.deleteLast();
                    break;
                case 6:
                    System.out.println("Enter Which Element You Want To Delete");
                    int element = sc.nextInt();
                    circular.deleteSpecifiedEle(element);
                    break;
                case 7:
                    circular.printList();
                    break;
                case 8:
                    sc.close();
                    break;
            }
        }
    }
}