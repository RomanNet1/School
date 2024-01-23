package school.L8.L_8_30;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c = 0;

        a = in.nextInt();
        b = in.nextInt();

        if(b != 0 && a > b) {
            c = a / b;
            a -= c * b;
            System.out.println(c + " " + a + "/" + b);
        }else {
            System.out.println("Подсчет не производится");
        }
    }
}
