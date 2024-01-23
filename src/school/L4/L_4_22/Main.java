package school.L4.L_4_22;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int x, xfirst, xlast, y;
        x = in.nextInt();
        xfirst = x / 10;
        xlast = x % 10;
        y = xlast * 100 + xfirst;
        System.out.println(y);
    }
}
