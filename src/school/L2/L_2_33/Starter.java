package school.L2.L_2_33;

import java.util.Scanner;

public class Starter {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        double a, b, h, s;

        System.out.println("Ст 1: ");
        System.out.print(">>");
        a = in.nextDouble();

        System.out.println("Ст 2: ");
        System.out.print(">>");
        b = in.nextDouble();

        System.out.println("Высота: ");
        System.out.print(">>");
        h =  in.nextDouble();

        s = 0.5 * (a + b) * h;

        System.out.println(s);


    }
}
