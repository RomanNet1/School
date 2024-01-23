package school.L2.L_2_5;

import java.util.Scanner;

public class Main {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите значение:");
        System.out.print(">>");
        int a = reader.nextInt();
        System.out.println("a * a = " + (a * a));
        System.out.println("a * 10 = " + (a * 10));

    }
}
