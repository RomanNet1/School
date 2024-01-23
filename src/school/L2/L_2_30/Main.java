package school.L2.L_2_30;

import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c, d, f;

        System.out.println("Часы:");
        System.out.print(">>");
        a = input.nextInt();

        System.out.println("Минуты: ");
        System.out.print(">>");
        b = input.nextInt();

        c = (a * 3600) + (b * 60); // часы в секунды             // с полуночи до данного момента в секундах
        f = (a * 60) + b;          // всего минут                // с полуночи до данного момента в минутах
        d = 24 * 60 - f;                                         // сколько минут осталось до полуночи

    }
}
