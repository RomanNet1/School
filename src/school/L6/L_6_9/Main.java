package school.L6.L_6_9;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int a, a1, a2, a3, aRez;

        System.out.println("Введите трехзначное число:");
        System.out.print(">>");
        a = in.nextInt();

        a1 = a / 100;
        a2 = (a % 100) / 10;
        a3 = a % 10;

        a1 = a1 % 2;
        a2 = a2 % 2;
        a3 = a3 % 2;
        aRez = a1 + a2 + a3;

        if(aRez == 0){
            System.out.println("Число: " + a + ", является четно-красивым (каждая цифра четная)");
        }else {
            System.out.println("Число: " + a + ", не является четно-красивым");
        }

    }
}
