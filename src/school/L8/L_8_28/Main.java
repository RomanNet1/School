package school.L8.L_8_28;

import java.util.Scanner;

public class Main {
    public  static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int a, a1, b, b1;
        a = in.nextInt();
        b = in.nextInt();

        if(a > b){
            System.out.println("Выражает целое число");
        }
        if(a < b){
            System.out.println("Дробь правильная");
        }
        if(a == b){
            System.out.println("Нет результата");
        }

        if(a == 0){
            System.out.println("");
        }

        if(b == 0){
            System.out.println("");
        }

    }
}
