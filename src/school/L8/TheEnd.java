package school.L8;

import java.util.Scanner;

public class TheEnd {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int a, a1, a2;
        System.out.println("Введите число:");
        System.out.print(">>");
        a = in.nextInt();
        a1 = a / 3;
        a2 = a % 3;

        System.out.println(a1);
        System.out.println(a2);


    }
}
