import java.util.*;

class convertC2F {

    double celcius;
    double Fahrenhit;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a celsius or Fahrenheit = ");
        celcius = sc.nextDouble();
        sc.close();
    }

    void toFahrenhit() {
        double Fahrenhit = ((celcius - 32) * 5) / 9;
        System.out.println("Fahrenhit = " + Fahrenhit);
    }

    void tocelcius() {
        double celcius = ((Fahrenhit * 9) / 5) + 32;
        System.out.println("Fahrenhit = " + celcius);
    }
}

public class CelsiusFahrenhit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        convertC2F f1 = new convertC2F();
        convertC2F c1 = new convertC2F();
        f1.getData();
        f1.toFahrenhit();

        c1.getData();
        c1.tocelcius();

        sc.close();
    }

}