package uchebnikTeoria.Раздел7;

import java.util.Scanner;                // четырехзначное

public class MainR73 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int x, dig1,  dig2,  dig3, dig4;
        x = reader.nextInt();

        dig1 = x / 1000;
        dig2 = (x / 100) % 10;
        dig3 = (x / 10) % 10;
        dig4 = x % 10;

        System.out.println(x + " = " + dig1 * 1000 + " + " + dig2 * 100 + " + " + dig3 * 10 + " + " + dig4);
    }
}
