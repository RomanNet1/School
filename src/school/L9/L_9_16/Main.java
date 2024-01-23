package school.L9.L_9_16;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a;

        a = in.nextInt();

        if(a < 0 || a >= 24){
            System.out.println("Этого периода нет");
        }
        if (a >= 6 && a < 10){
            System.out.println("утро");
        }
        if (a >= 10 && a <=18){
            System.out.println("день");
        }
        if (a > 18 && a<=22){
            System.out.println("вечер");
        }
        if((a == 23) || (a >= 0 && a < 6) ){
            System.out.println("ночь");
        }
    }
}

