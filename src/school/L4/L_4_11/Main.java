package school.L4.L_4_11;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int x, x1, x2, dl;

        x = in.nextInt();
        x1 = x / 10;
        x2 = x % 10;
        dl = x1 - x2;

        System.out.println(dl);
        in.close();
    }
}
