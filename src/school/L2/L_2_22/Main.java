package school.L2.L_2_22;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите первое значение:");
        System.out.print(">>");
        int a = input.nextInt();
        System.out.println("Введите второе значение:");
        System.out.print(">>");
        int b = input.nextInt();
        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a - b);
        System.out.println(b - a);



    }
}
