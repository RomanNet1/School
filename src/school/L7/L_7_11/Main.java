package school.L7.L_7_11;

import java.util.Scanner;

public class Main {
        public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;
        a = in.nextInt();
        b = in.nextInt();
        if(a > b){
            System.out.println(b + " " + a);
            System.out.println(a + " " + b);
        }
        if(a < b){
            System.out.println(a + " " + b);
            System.out.println(b + " " + a);

        }
    }
}
