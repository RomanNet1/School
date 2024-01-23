package school.L4.L_4_21;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int x, xfirst, xlast, y;
        x = in.nextInt();
        xfirst = x / 1000;
        xlast = x % 1000;
        y = xlast * 10 + xfirst;
        System.out.println(y);
    }
}
