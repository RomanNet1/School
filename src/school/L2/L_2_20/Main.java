package school.L2.L_2_20;

import java.util.Scanner;

public class Main {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Введите значение:");
        System.out.print(">>");
        a = reader.nextInt();
        b = -1 * a; // -(a), -a, -1  можно сделать как константу. признак противоположности
        System.out.println(a);
        System.out.println(b);
    }
}
