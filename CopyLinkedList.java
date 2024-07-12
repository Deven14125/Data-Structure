import java.util.*;

class Node {
    int info;
    Node link;

    Node(int data) {
        this.info = data;
        this.link = null;
    }
}

class LinkList {
    Node first;

    void insertElement(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            return;
        }
        newNode.link = first;
        first = newNode;
    }

    void copyLinkList(LinkList firstlist, LinkList secondlist) {
        if (first == null) {
            System.out.println("List Is Empty");
            return;
        }
        Node temp = first;
        while (temp != null) {
            secondlist.insertElement(temp.info);
            temp = temp.link;
        }

    }

    void printList() {
        if (first == null) {
            System.out.println("List Is Empty");
        }

        Node currNode = first;
        while (currNode != null) {
            System.out.print(currNode.info + " -> ");
            currNode = currNode.link;
        }
        System.out.println("NULL");
    }
}

public class CopyLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkList firstList = new LinkList();
        LinkList secondList = new LinkList();

        while (true) {

            System.out.println("\n1. For Insert Element in First List");
            System.out.println("2. For Copy In Second List");
            System.out.println("3. For Print First List");
            System.out.println("4. For Print Second List");
            System.out.println("5. For Exit");

            int Choice = sc.nextInt();

            switch (Choice) {
                case 1:
                    System.out.println("Enter Element In First List");
                    int data = sc.nextInt();
                    firstList.insertElement(data);
                    break;
                case 2:
                    firstList.copyLinkList(firstList, secondList);
                    System.out.println("Linked List Copied Sucessfully");
                    break;
                case 3:
                    firstList.printList();
                    break;
                case 4:
                    secondList.printList();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}