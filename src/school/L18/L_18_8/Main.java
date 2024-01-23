package school.L18.L_18_8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int n = 5;
        int[] a = new int[n];
        int[] x = {10,25,68,65,98};

        for (int i = 0; i < n/2; i++) {

            a[i] = x[i];
            a[n - 1 - i] = a[i];

        }
        System.out.println(Arrays.toString(a));
    }
}
