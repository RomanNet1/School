package school.L18.L_18_12;

import java.util.Scanner;

public class Main {
    //public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int doun = 100, up = 999, n = 10;
        //n= in.nextInt();
        int[] m = new int[n];
        fill(m,doun,up);
        write(m);
    }

    private static void write(int[] m) {
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i] + " ");
        }
    }

    private static void fill(int[] m, int doun, int up) {
        for (int i = 0; i < m.length; i++) {
            m[i]= doun + (int) ((up - doun + 1) * Math.random());
        }
    }
}
