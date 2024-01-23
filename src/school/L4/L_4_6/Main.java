package school.L4.L_4_6;

import java.util.Scanner;

public class Main {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int x, dig1,  dig2,  dig3;

        x = reader.nextInt();

        dig1 = x / 100;
        dig2 = x % 100;
        dig3 = x % 10;

        System.out.println(dig1 + "+" + dig2  + "+" + dig3);
    }
}
