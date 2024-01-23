package school.L18.L_18_11;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //int n = 5;
        //int[] a = new int[n];

        int[] a = {3,5,2,9,6,4,0}; // 7

        int[]b = new int[a.length]; //int[]b = new int[7]

        int mid;  //

        mid = a.length/2;  // mid = 3
        b[mid] = a[mid];  // b[3] = a[3] == 9

        for (int k = 1; k <= mid; k++) {
            b[mid + k] = a[mid - k];
            b[mid - k] = a[mid + k];
        }
        System.out.println(Arrays.toString(b));

    }
}
