package school.L8.L_8_17;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int x, a, b, c ;
        System.out.println("Введите трехзначное число:");
        System.out.print(">>");
        x = in.nextInt();
        a = x / 100;
        b = (x % 100) / 10;
        c = x % 10;

        if((x + (a + b + c)) % 2 == 0){
            System.out.println("Да");
        }
        else{
            System.out.println("Нет");
        }
    }
}
