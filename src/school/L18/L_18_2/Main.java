package school.L18.L_18_2;

import java.util.Arrays;

public class Main {
    //public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int n = 5;
        int[]a = new int[n];

        for (int i = 0; i < n; i++) {
            //int x = reader.nextInt();
            a[i] = i % 2;

        }
        System.out.println(Arrays.toString(a));
    }
}
