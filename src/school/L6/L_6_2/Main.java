package school.L6.L_6_2;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        double num;
        System.out.println("Введите число");
        num = in.nextDouble();
        if(num > 0){
            System.out.println("Положительное число");
        }
        System.out.println("Завершено");
    }
}
