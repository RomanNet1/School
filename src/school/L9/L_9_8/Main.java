package school.L9.L_9_8;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int x, a, b, c, d, f, g;

        x = in.nextInt();

        a = x / 100_000;
        b = (x / 10_000) % 10;
        c = (x / 1_000) % 10;
        d = (x / 100) % 10;
        f = (x / 10) % 10;
        g = x % 10;

        if(((a + b + c) == (d + f + g)) && (a + b + c)%2 == 0 && (d + f + g)%2 == 0){
            System.out.println("Счастливое");
        }else {
            System.out.println("Нет");
        }
    }
}


/*
 123456
*/
