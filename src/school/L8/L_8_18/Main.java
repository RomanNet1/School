package school.L8.L_8_18;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int x, a, b, c, count = 0 ;
        System.out.println("Введите трехзначное число:");
        System.out.print(">>");
        x = in.nextInt();
        a = x / 100;
        b = (x % 100) / 10;
        c = x % 10;

        if(a % 2 == 0){
            count++;
        }
        if(b % 2 == 0){
            count++;
        }
        if(c % 2 == 0){
            count++;
        }
        System.out.println("Степень четности = " + count);

    }
}
