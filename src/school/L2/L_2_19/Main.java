package school.L2.L_2_19;

import java.util.Scanner;

public class Main {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Введите значение:");
        System.out.print(">>");
        a = reader.nextInt();
        b = a - 1;
        c = a + 1;

        System.out.println(b +  " " + a + " " + c);
    }
}
