package school.L8.L_8_32;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b = 0;
        double c = 0.0;

        a = in.nextInt();


        if(a%2 == 0) {
            c = in.nextDouble();
            System.out.println(a * c);
        }else {
            b = in.nextInt();
            System.out.println(a + b);
        }
    }
}
