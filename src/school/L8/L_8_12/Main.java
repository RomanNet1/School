package school.L8.L_8_12;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        int x = 0;
        System.out.println("Введите число:");
        System.out.print(">>");
        x = in.nextInt();

        if(x <= 5){
            System.out.println("оценка корректная");;
        }else {
            System.out.println("Оцена не корректная");
        }


    }
}
