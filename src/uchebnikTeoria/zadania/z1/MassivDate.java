package uchebnikTeoria.zadania.z1;

import uchebnikTeoria.data_p2.Date;

import java.util.Arrays;

public class MassivDate {
    public static void arrDateZ(Date[] arrDate, int a) {

        for (int i = 0; i < a; i++) {
            arrDate[i] = new Date(random(1, 31), random(1, 12), random(1900, 2011));
        }
        System.out.println(Arrays.toString(arrDate));
    }


    public static int random(int a, int b) {
        return a + (int) (Math.random() * (b - a + 1));
    }


}
