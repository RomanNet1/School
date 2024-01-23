package school.L6.L_6_14;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b;
        a = in.nextInt();
        b = in.nextInt();
        if(a * b > 0){
            System.out.println("Положительная");
        }else {
            System.out.println("Отрицательная");
        }
    }
}
