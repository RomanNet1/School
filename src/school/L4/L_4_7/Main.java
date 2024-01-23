package school.L4.L_4_7;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x, x1, x2, y;
        x = in.nextInt();
        x1 = x/10;
        x2 = x%10;
        y = x2*10 + x1;
        System.out.println(y);
        y+=8;
        System.out.println(y);
    }
}
