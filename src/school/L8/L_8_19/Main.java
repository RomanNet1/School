package school.L8.L_8_19;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int a, a1, a2;
        System.out.println("Введите трехзначное число:");
        System.out.print(">>");
        a = in.nextInt();
        a1 = a / 100;
        a2 = a % 100;

        if(a1 == a2){
            System.out.println("Парно-симметричные");
        }else {
            System.out.println("Нет");
        }
    }
}
