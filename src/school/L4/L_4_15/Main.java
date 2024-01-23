package school.L4.L_4_15;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int x, dig1,  dig2,  dig3, dig4, y = 0;
        x = in.nextInt();

        dig1 = x / 1000;
        dig2 = (x / 100) % 10;
        dig3 = (x / 10) % 10;
        dig4 = x % 10;

        if(dig1 % 2 == 0){
            y++;
        }

        if(dig2 % 2 == 0){
            y++;
        }
        if(dig3 % 2 == 0){
            y++;
        }
        if(dig4 % 2 == 0){
            y++;
        }

        System.out.println(y);
        in.close();
    }
}
