import java.util.*;

class CirculQueu {
    int F = -1;
    int R = -1;

    int size = 5;
    int[] cq1 = new int[size];

    void Enqueue(int x) {
        if ((R + 1) % size == F) {
            System.out.println("Queue Overflow");
            return;
        }
        R = (R + 1) % size;
        cq1[R] = x;
    }
}

public class CircularQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CirculQueu cq = new CirculQueu();

    }
}
