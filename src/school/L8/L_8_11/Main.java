package school.L8.L_8_11;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int stud = 0, styl = 0;

        System.out.println("Введите число учеников:");
        System.out.print(">>");
        stud = in.nextInt();

        System.out.println("Введите число стульев:");
        System.out.print(">>");
        styl = in.nextInt();

        // 1

        if (stud > styl){
            System.out.println("Стульев не хватает");
            System.out.println("Нужно еще " + (stud - styl) + " штук");
        }
        if (stud == styl){
            System.out.println("Всем всё хватает");
        }
        if (stud < styl){
            System.out.println("Есть лишнии стулья");
            int a = styl - stud;
            System.out.println(a +  " стула лишних");
        }

    }
}
