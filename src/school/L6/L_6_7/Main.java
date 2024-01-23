package school.L6.L_6_7;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int a;
        System.out.println("Введите число:");
        System.out.print(">>");
        a = in.nextInt();

        if(a > 99){
            a--;
            System.out.println(a);

        }

    }
}
