package school.L4.L_4_14;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int x, x1, x2, x3, y = 0;

        x = in.nextInt();
        x1 = x / 100;
        x2 = (x % 100) / 10;
        x3 = x % 10;

        if(x1 % 2 == 0){
            y++;
        }

        if(x2 % 2 == 0){
            y++;
        }
        if(x3 % 2 == 0){
            y++;
        }

        System.out.println(y);
        in.close();
    }
}
