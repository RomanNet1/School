package school.L4.L_4_25;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, b, b1;
        a = in.nextInt();
        b = in.nextInt();

        a1 = a % 10;
        a = a / 10;
        b1 = b % 10;
        b = b / 10;

        a = a * 10 + b1;
        b = b * 10 + a1;
        System.out.println(a + " " + b);

    }
}
