package school.L3.L_3_10;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        double rubV;
        double rubR;
        double kurs;
        double evro;

        rubV = in.nextDouble();
        rubR = in.nextDouble();
        kurs = in.nextDouble();

        evro = (rubR + rubV) / kurs;

        System.out.println(evro);

    }
}
