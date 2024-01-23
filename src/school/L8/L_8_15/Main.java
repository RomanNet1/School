package school.L8.L_8_15;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int x, a, b ;
        System.out.println("Введите число:");
        System.out.print(">>");
        x = in.nextInt();
        a = x / 10;
        b = x % 10;
        if(a > b){
            System.out.println("Первая цифра больше");
        }
        if(a < b){
            System.out.println("Вторая цифра больше");
        }
    }
}
