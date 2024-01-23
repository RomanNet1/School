package school.L4.L_4_26;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, b, b1, a2, b2;

        a = in.nextInt(); // 222
        b = in.nextInt(); // 333

        a1 = a / 100;
        b1 = b / 100;

        a2 = a % 100;
        b2 = b % 100;

        System.out.println(b1 * 100 + a2);
        System.out.println(a1 * 100 + b2);
    }
}
