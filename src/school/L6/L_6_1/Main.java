package school.L6.L_6_1;

import java.util.Scanner;

public class Main {
    static public Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int x = reader.nextInt();
        int y = reader.nextInt();
        if (x < y) {
            System.out.println("x меньше y");
        }
        if (x == y) {
            System.out.println("x равно y");
        }
        if (x > y) {
            System.out.println("x больше y");
        }
    }
}
