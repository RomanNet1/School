package school.L18.L_18_9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        int[] a = new int[n];
        a[0] = 1;
        a[1] = 1;
        for (int i = 2; i < n; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        System.out.println(Arrays.toString(a));
    }
}
