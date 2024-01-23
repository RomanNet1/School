package school.L4.L_4_23;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int x, xfirst, xlast, y;
        x = in.nextInt();
        xfirst = x / 10;
        xlast = x % 10;
        y = xlast * 1000 + xfirst;
        System.out.println(y);
    }
}
