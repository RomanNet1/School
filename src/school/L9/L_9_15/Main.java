package school.L9.L_9_15;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a;

        a = in.nextInt();

        if(a <= 0 || a >= 13){
            System.out.println("Это не месяц");
        }
        if (a == 12 || a == 1 || a == 2){
            System.out.println("Зима");
        }
        if (a>=3 && a<=5){
            System.out.println("Весна");
        }
        if (a>=6 && a<=8){
            System.out.println("Лето");
        }
        if(a>=9 && a<=11){
            System.out.println("Осень");
        }
    }
}
