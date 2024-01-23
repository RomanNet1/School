package school.L4.L_4_20;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x, x1, x2, x3, rez;

        x = in.nextInt();

        x1 = x / 100;
        x2 = (x % 100) / 10;
        x3 = x % 10;

        rez = x2 * 100 + x3 * 10 + x1 ;

        System.out.println(rez);
    }
}
