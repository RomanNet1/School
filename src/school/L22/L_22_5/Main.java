package school.L22.L_22_5;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = 6, m = 14;
        int [][] ar = new int[n][m];
        ar = build(ar);
        write(ar);
    }

    private static int[][] build(int [][] ar){
       int down = 30, up = 125;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                ar[i][j] = down + (int)((up - down + 1) * Math.random());
            }
        }
        return ar;
    }

    private static void write(int [][] ar){

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }

    }

}
