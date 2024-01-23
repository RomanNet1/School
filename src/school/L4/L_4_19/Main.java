package school.L4.L_4_19;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int x, dig1,  dig2,  dig3, dig4, y;
        x = in.nextInt();

        dig1 = x / 1000;
        dig2 = (x / 100) % 10;
        dig3 = (x / 10) % 10;
        dig4 = x % 10;

        y = (dig2 * 100 + dig3 * 10 + dig4) * 10;

        System.out.println(y);
    }
}
