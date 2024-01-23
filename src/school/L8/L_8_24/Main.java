package school.L8.L_8_24;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int a, a1, a2, a3, b = 0;

        System.out.println("Введите  число:");
        System.out.print(">>");
        a = in.nextInt();

        a1 = a / 100;
        a2 = (a / 10) % 10;
        a3 = a % 10;

        if(a > 500){
            b = a3 * 100 + a2 * 10 + a1;
        }else {
            b = a1 * 100 + a3 * 10 + a2;
        }

        System.out.println(b);
    }
}
