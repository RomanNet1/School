package school.L6.L_6_5;

import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int a;

        System.out.println("Введите число:");
        System.out.print(">>");
        a = input.nextInt();

        if(a == 0){
            System.out.println("Ноль");
        }
    }
}
