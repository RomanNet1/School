package school.L2.L_2_28;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int cabeltov;
        double metres, kilometres;

        System.out.println("Введите целое число:");
        System.out.print(">>");
        cabeltov = in.nextInt();

        metres = 185.2 * cabeltov;
        kilometres = metres / 1000;

        System.out.println(metres);
        System.out.println(kilometres);
    }
}
