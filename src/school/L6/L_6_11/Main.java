package school.L6.L_6_11;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b;
        System.out.println("Введите первое число:");
        System.out.print(">>");
        a = in.nextInt();

        System.out.println("Введите второе число:");
        System.out.print(">>");
        b = in.nextInt();

        if(a * b > 0){
            System.out.println("Один и тот же знак");
        }
        if(a * b < 0){
            System.out.println("Разные знаки");
        }
        if(a * b == 0){
            System.out.println("Некорректно");
        }
    }
}
