package school.L6.L_6_10;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int a, a1, a2,  a12;

        System.out.println("Введите двузначное число:");
        System.out.print(">>");
        a = in.nextInt();

        a1 = a / 10;
        a2 = a % 10;

        a12 = a1 * a2;


        if(a > a12){
            System.out.println("Введенно больше");
        }
        if(a < a12){
            System.out.println("Введенно меньше");
        }
        if(a == a12){
            System.out.println("равны");
        }

    }
}
