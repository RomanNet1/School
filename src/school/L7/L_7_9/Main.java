package school.L7.L_7_9;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Введите первое число:");
        System.out.print(">>");
        a = in.nextInt();

        System.out.println("Введите второе число:");
        System.out.print(">>");
        b = in.nextInt();

        System.out.println("Введите третье число:");
        System.out.print(">>");
        c = in.nextInt();


        if(a < c){
            System.out.println("верно");
        }
        if(b < c){
            System.out.println("верно");
        }
    }
}
