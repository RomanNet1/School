package school.L8.L_8_23;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a = 0, b = 0;
        System.out.println("Введите первое число:");
        System.out.print(">>");
        a = in.nextInt();

        System.out.println("Введите второе число:");
        System.out.print(">>");
        b = in.nextInt();

        if(a > b){
            a--;
            b ++;
        }
        if (a < b){
            a++;
            b--;
        }
        if (a == b){
            a++;
            b++;
        }
        System.out.println(a + " " + b);

    }
}
