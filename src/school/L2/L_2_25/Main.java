package school.L2.L_2_25;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c;

        System.out.println("Введите первое число:");
        System.out.print(">>");
        a = input.nextInt();

        System.out.println("Введите второе число:");
        System.out.print(">>");
        b = input.nextInt();

        System.out.println("Введите третье число:");
        System.out.print(">>");
        c = input.nextInt();


        System.out.println("V = " + (a * b * c));
        System.out.println("Sм = " + (a * b));
        System.out.println("Sб = " + (a * c));
        System.out.println("Sобщ = " + ((2 * (a * b)) + (2 * (a * c))));
        System.out.println("P = " + (4*a + 4*b + 4*c));


    }
}
