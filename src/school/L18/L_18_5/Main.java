package school.L18.L_18_5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        int[]a = new int[n];

        for (int i = 0; i < n; i = i + 2) {
            int x = (int)(90 * Math.random() + 10);
            a[i] = x % 10;
            a[i + 1] = x / 10;

        }
        System.out.println(Arrays.toString(a));
    }
}
