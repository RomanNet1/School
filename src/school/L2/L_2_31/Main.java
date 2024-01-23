package school.L2.L_2_31;

import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        double m, v, e;

        System.out.println("масса: ");
        System.out.print(">>");
        m = input.nextDouble();

        System.out.println("скрость: ");
        System.out.print(">>");
        v = input.nextDouble();

        e = (m *  v * v ) / 2;

        System.out.println(e);


    }

}
