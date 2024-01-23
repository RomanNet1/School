package school.L6.L_6_12;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c, d;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = b * b - 4 * a * c;

        if(d >= 0){
            System.out.println("Да");
        }else {
            System.out.println("Нет");
        }
    }
}
