package school.L21.L_21_3;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String st = in.next();
        go(st);
    }

    private static void go(String st) {
        int n = st.length();
        System.out.println(st.charAt(0));
        System.out.println(st.charAt(n - 1));
    }
}
