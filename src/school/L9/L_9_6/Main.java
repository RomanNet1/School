package school.L9.L_9_6;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        if((a + b) > c && (a + c) > b && (b + c) > a){
            System.out.println("Стороны");
        }else {
            System.out.println("Нет");
        }
    }
}
