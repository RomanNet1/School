package school.L6.L_6_6;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int a;
        System.out.println("Введите число:");
        System.out.print(">>");
        a = in.nextInt();

        if(a > 0){
            System.out.println("Положительное");
        }

        if(a < 0){
            System.out.println("Отрицательное");
        }

        if(a == 0){
            System.out.println("ноль");
        }

    }
}
