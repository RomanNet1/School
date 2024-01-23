package school.L2.L_2_17;

import java.util.Scanner;

public class Main {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите значение:");
        System.out.print(">>");
        int a = reader.nextInt();
        int b = a * a;

        System.out.println("b = " + b);



    }
}
