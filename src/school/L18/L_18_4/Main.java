package school.L18.L_18_4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int n = 5;
        int[]a = new int[n];

        for (int i = 0; i < n; i++) {
            int x = (int)(90 * Math.random() + 10);
            System.out.println(x);
            a[i] = x / 10;

        }
        System.out.println(Arrays.toString(a));
    }
}
