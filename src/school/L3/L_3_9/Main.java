package school.L3.L_3_9;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,b,c,all;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        all = a*10 + b*100 + c*1000;
        System.out.println(all);
    }
}
