package uchebnikTeoria.Раздел7;

import java.util.Scanner;  // двузначное

public class MainR71 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int x;
        int dig1;
        int dig2;
        x = reader.nextInt();
        dig1 = x / 10;
        dig2 = x % 10;
        System.out.println(x + " = " + dig1 * 10 + " + " + dig2);
    }
}
