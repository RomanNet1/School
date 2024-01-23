package school.L2.L_2_26;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c;

        System.out.println("Введите год рождения:");
        System.out.print(">>");
        a = input.nextInt();

        System.out.println("Введите текущий год:");
        System.out.print(">>");
        b = input.nextInt();

        c = b - a;


        System.out.println("Возраст: " + c);



    }
}
