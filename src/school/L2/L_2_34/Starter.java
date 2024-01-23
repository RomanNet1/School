package school.L2.L_2_34;

import java.util.Scanner;

public class Starter {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String s = "Привет";
        System.out.println("Введите имя: ");
        System.out.print(">> ");
        String name = input.next();

        System.out.println(s + ", " + name + "!");

    }

}
