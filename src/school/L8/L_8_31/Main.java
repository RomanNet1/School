package school.L8.L_8_31;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int a, a1, a2, a3, b = 0;

        System.out.println("Введите трехзначное число:");
        System.out.print(">>");
        a = in.nextInt();

        a1 = a / 100;
        a2 = (a / 10) % 10;
        a3 = a % 10;

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        if(a%2 == 0){
            if(a1%2 == 0){
                a1 = a1 + 1;
            }else {
                a1 = a1 == 1 ? a1 : a1 - 1;
            }
            if(a2%2 == 0){
                a2 = a2 + 1;
            }else {
                a2 = a2 - 1;
            }
            if(a3%2 == 0){
                a3 = a3 + 1;
            }else {
                a3 = a3 - 1;
            }
        }else {
            if(a1%2 == 0){
                a1 = a1 == 1 ? a1 : a1 - 1;
            }else {
                a1 = a1 + 1;
            }
            if(a2%2 == 0){

                a2 = a2 == 0 ? a2 : a2 - 1;
            }else {
                a2 = a2 + 1;
            }
            if(a3%2 == 0){
                a3 = a3 == 0 ? a3 : a3 - 1;

            }else {
                a3 = a3 + 1;
            }
        }
        System.out.println(a1 * 100 + a2 * 10 + a3);


    }
}
