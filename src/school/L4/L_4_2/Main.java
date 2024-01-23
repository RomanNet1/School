package school.L4.L_4_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, dig1,  dig2,  dig3;

        x = in.nextInt();

        dig1 = x / 100;
        dig2 = (x % 100) / 10;
        dig3 = x % 10;

        System.out.println(dig1 + " " + dig2 + " " + dig3);
    }

}
