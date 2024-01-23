package school.L9.L_9_18;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int  a, b, c;

        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if(a + b >= c && b + c >= a && c + a >= b){
            System.out.println("Является треугольником");
        }else {
            System.out.println("Не является треугольником");
        }
    }
}
