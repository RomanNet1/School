package school.L6.L_6_8;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b;
        System.out.println("Введите первое число:");
        System.out.print(">>");
        a = in.nextInt();

        System.out.println("Введите второе число:");
        System.out.print(">>");
        b = in.nextInt();

//        if(a > b){
//            System.out.println(a + b);
//        }
//        if(a < b){
//            System.out.println(a * b);
//        }
//        if(a == b){
//            System.out.println("Числа равны");
//        }
//********************************************************************


        if(a > b){
            System.out.println(a + b);
        }
        else if(a < b){
            System.out.println(a * b);
        }
        else {
            System.out.println("Числа равны");
        }


    }
}
