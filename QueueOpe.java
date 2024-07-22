import java.util.*;

import javax.swing.text.html.parser.Element;

class Queue {
    int F = -1;
    int R = -1;

    int n = 5;

    int[] q = new int[n];

    void Enqueue(int x) {
        if (R >= n) {
            System.out.println("Queue Overflow");
            return;
        }
        R++;
        q[R] = x;
        if (F == -1) {
            F = 0;
        }
    }

    void Dequeue() {
        if (F == -1) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println("Dequeued Element Is :" + q[F]);
            if (F == R) {
                F = -1;
                R = -1;
            } else {
                F++;
            }
        }
    }

    void Peek() {
        if (R < 0) {
            System.out.println("Queue Is Empty");
        } else {
            System.out.println("Peeked Element Is :" + q[F]);
        }
    }

    void printQueue() {
        if (R < 0) {
            System.out.println("Queue Is Empty");
        }
        for (int i = F; i <= R; i++) {
            System.out.print(q[i] + " ");
        }
    }
}

public class QueueOpe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue que = new Queue();

        while (true) {

            System.out.println("\nQueue Operation :");
            System.out.println("1. For Enqueue");
            System.out.println("2. For Dequeue");
            System.out.println("3. For Peek");
            System.out.println("4. For Print Queue");

            int Choice = sc.nextInt();

            switch (Choice) {
                case 1:
                    System.out.println("Enter Element To Enqueue");
                    int x = sc.nextInt();
                    que.Enqueue(x);
                    break;
                case 2:
                    que.Dequeue();
                    break;
                case 3:
                    que.Peek();
                    break;
                case 4:
                    que.printQueue();
                    break;
            }
        }
    }
}