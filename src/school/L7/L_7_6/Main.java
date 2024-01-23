package school.L7.L_7_6;

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

        if(a == b){
            System.out.println("Числа равны");
        }else {
            System.out.println("Числа не равны");
        }
    }
}
