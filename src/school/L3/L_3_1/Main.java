package school.L3.L_3_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double tempF;
        int tempC;
        tempC = in.nextInt();
        tempF = 5.0 * (tempC - 32) / 9;
        System.out.println(tempF);
    }
}
