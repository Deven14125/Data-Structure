// import java.util.*;

// public class CircleArea {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a radius =");
//         double r = sc.nextDouble();

//         double Area = Math.PI * r * r;
//         System.out.println("Area = " + Area);
//         sc.close();
//     }
// }

import java.util.*;

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float r;
        System.out.println("Enter radius");
        r = sc.nextFloat();
        System.out.println("Area=" + (3.14 * r * r));
        sc.close();
    }
}
