package school.L2.L_2_21;

import java.util.Scanner;

public class Main {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c,d;
        System.out.println("Введите значение:");
        System.out.print(">>");
        a = reader.nextInt();
        b = a + 1;
        c = a + 2;
        d = a + 3;

        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
