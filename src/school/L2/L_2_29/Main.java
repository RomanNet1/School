package school.L2.L_2_29;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int h, s;


        System.out.println("Введите время в часах:");
        System.out.print(">>");
        h = in.nextInt();

        s = h * 3600;

        System.out.println("Секунд: " + s);

    }
}
