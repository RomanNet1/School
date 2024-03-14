package school.L8.L_8_22;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c = 0;
        System.out.println("Введите  число:");
        System.out.print(">>");
        a = in.nextInt();
        b = a % 10;
        if (b < 5) {
            c = (a / 10) * 10;
            System.out.println("Down to " +  c);
        }else {
            c = (a / 10 + 1) * 10;
            System.out.println("Up to " + c);
        }

    }
}
