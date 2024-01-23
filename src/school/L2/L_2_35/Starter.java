package school.L2.L_2_35;

import java.util.Scanner;

public class Starter {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите имя: ");
        System.out.print(">> ");
        String name = input.next();

        System.out.println("Введите фамилию: ");
        System.out.print(">> ");
        String fam = input.next();

        System.out.println("Вас зовут " + name + " " + fam);

    }
}
