import java.util.*;

public class InsertSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = { 1, 2, 4, 5, 8, 9, 11, 15, 18, 20 };

        for (int i = 0; i < array.length; i++) {
            int minvalue = array[i];
            int minindex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < minvalue) {
                    minvalue = array[j];
                    minindex = j;
                }
            }
            array[minindex] = array[i];
            array[i] = minvalue;
        }

        System.out.println("After Sorted :");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        sc.close();
    }
}
