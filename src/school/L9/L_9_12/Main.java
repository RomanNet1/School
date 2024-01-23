package school.L9.L_9_12;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2, a3;
        a = in.nextInt();
        a1 = a / 100;
        a2 = (a / 10) % 10;
        a3 = a % 10;

        if(a1 < a2 && a2 < a3){
            System.out.println("поднимающееся");
        }else {
            System.out.println("Нет");
        }
    }
}
