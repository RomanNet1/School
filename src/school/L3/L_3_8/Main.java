package school.L3.L_3_8;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        double a,b, s, p;

        a = in.nextDouble();
        b = in.nextDouble();

        s = (a * b) /2;
        p = a + (2 * Math.sqrt(((a / 2) * (a / 2)) + (b * b)));

        System.out.println(s);
        System.out.println(p);
    }
}
