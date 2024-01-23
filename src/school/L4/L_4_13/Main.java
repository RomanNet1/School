package school.L4.L_4_13;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int x, x1, x2, y = 0;

        x = in.nextInt();
        x1 = x / 10;
        x2 = x % 10;

        if(x1 % 2 == 0){
            y++;
        }

        if(x2 % 2 == 0){
            y++;
        }

        System.out.println(y);
        in.close();
    }
}
