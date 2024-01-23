package school.L7.L_7_7;

import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int  students, stul;
        System.out.println("Введите число студентов:");
        System.out.print(">>");
        students = in.nextInt();

        System.out.println("Введите число стульев:");
        System.out.print(">>");
        stul = in.nextInt();

        if(stul >= students){
            System.out.println("всем ученикам будет где сесть");
        }else {
            System.out.println("Стульев не хватает");
        }
    }


}
