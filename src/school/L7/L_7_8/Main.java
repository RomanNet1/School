package school.L7.L_7_8;

import java.util.Scanner;

public class Main {


    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int  students, tables;
        System.out.println("Введите число студентов:");
        System.out.print(">>");
        students = in.nextInt();

        System.out.println("Введите число столов:");
        System.out.print(">>");
        tables = in.nextInt();

        if(tables * 2 >= students){
            System.out.println("Да");
        }else {
            System.out.println("Нет");
        }
    }
}
