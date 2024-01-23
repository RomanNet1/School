package school.L4.L_4_8;

import java.util.Scanner;

public class Main {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {


        int x, dig1,  dig2,  dig3;
        x = reader.nextInt();

        dig1 = x / 100;
        dig2 = (x % 100) / 10;
        dig3 = (x % 10);

        System.out.println(dig3 * 100  + dig2 * 10 + dig1);
        System.out.println((dig3 * 100  + dig2 * 10 + dig1) - 20);
        reader.close();
    }

}
