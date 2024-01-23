package school.L18.L_18_6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        int[]a = new int[n];

        int x = (int)(Math.random() * 99 + 1);
        for (int i = 0; i < n; i++) {
            a[i] = x;
            x = x + x % 10;
        }
        System.out.println(Arrays.toString(a));
    }
}
