package school.L9.L_9_9;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;
        a = in.nextInt();
        b = in.nextInt();
        if(a == 0 && b == 0){
            System.out.println("Бесконечное множество решений");
        }
        if(a == 0 && b != 0){
            System.out.println("Нет решений");
        }
        if(a != 0){
            System.out.println(-b / a);
        }
    }
}
