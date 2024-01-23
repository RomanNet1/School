package school.L18.L_18_3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int n = 5;
        int[]a = new int[n];
        int[] x = {10,25,68,65,98};
        for (int i = 1; i < n; i++) {
            //int x = reader.nextInt();
            a[i] = x[i] % i;

        }
        System.out.println(Arrays.toString(a));
    }
}
