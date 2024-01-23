package school.L7.L_7_10;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        int x = 0;
        System.out.println("Введите число:");
        System.out.print(">>");
        x = in.nextInt();
        if(x < 0){
            x *= -1;
        }else {
            x = 0;
        }
        System.out.println(x);

    }
}
