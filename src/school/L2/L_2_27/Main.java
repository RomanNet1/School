package school.L2.L_2_27;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c;

        System.out.println("Введите массу тела в граммах:");
        System.out.print(">>");
        a = input.nextInt();

        b = a / 1000;


        System.out.println("масса тела в килограммах: " + b);



    }
}
