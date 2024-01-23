package uchebnikTeoria.Раздел7;

import java.util.Scanner;        // трехзначное

public class MainR72 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int x, dig1,  dig2,  dig3;
        x = reader.nextInt();

        dig1 = x / 100;
        dig2 = (x % 100) / 10;
        dig3 = x % 10;

        System.out.println(x + "=" + dig1 * 100 + "+" + dig2 * 10 + "+" + dig3);
    }
}
