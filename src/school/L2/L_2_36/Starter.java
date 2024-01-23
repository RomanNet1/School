package school.L2.L_2_36;

import java.util.Scanner;

public class Starter {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите фамилию пассажира: ");
        System.out.print(">> ");
        String name = input.next();

        System.out.println("Введите название города: ");
        System.out.print(">> ");
        String sity = input.next();

        System.out.println("Пассажир " + name + " вылетает в " + sity);

    }
}
