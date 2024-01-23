package school.L5.L_5_6;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a , b;
        a = in.nextInt();
        b = in.nextInt();
        if((a < b) || (a < 100)){
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
