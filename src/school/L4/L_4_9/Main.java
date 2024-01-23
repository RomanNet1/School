package school.L4.L_4_9;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int x, x1, x2, sum;

        x = in.nextInt();
        x1 = x / 10;
        x2 = x % 10;
        sum = x1 + x2;

        System.out.println(sum);
        in.close();
    }
}
