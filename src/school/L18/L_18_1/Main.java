package school.L18.L_18_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = i * (i + 1);
        }

        System.out.println(Arrays.toString(a));
    }
}
