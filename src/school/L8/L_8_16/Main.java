package school.L8.L_8_16;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int x, a, b ;
        System.out.println("Введите трехзначное число:");
        System.out.print(">>");
        x = in.nextInt();
        a = x / 100;
        b = x % 10;
        if(a == b){
            System.out.println("Да");
        }
        if(a < b){
            System.out.println("Нет");
        }
    }
}
