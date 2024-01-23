package school.L4.L_4_24;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int x, y, x1, y1, x0, y0;

        x = in.nextInt(); // 312
        y = in.nextInt(); // 415

        x0 = x % 10; // 310 --- 2
        y0 = y % 10; // 410 --- 5

        x1 = x / 10;
        y1 = y / 10;


        System.out.println(x1 * 10 + y0);
        System.out.println(y1 * 10 + x0);

    }
}
