package school.L4.L_4_17;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int x, dig1, dig2, dig3, dig4, sum;
        x = in.nextInt();

        dig1 = x / 1000;
        dig2 = (x / 100) % 10;
        dig3 = (x / 10) % 10;
        dig4 = x % 10;

        sum = dig4 * 1000 + dig2 * 100 + dig3 * 10 + dig1;

        System.out.println(sum);
    }
}
