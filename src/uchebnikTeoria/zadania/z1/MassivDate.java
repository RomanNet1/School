package uchebnikTeoria.zadania.z1;

import uchebnikTeoria.data_p2.Date;

import java.util.Arrays;

public class MassivDate {

    public static Date arrData() {
        int day = random(1, 31);
        int mounth = random(1, 12);
        int year = random(1900, 2011);
        Date arrDate = new Date(day, mounth, year);
        return arrDate;
    }


    public static int random(int a, int b) {
        return a + (int) (Math.random() * (b - a + 1));
    }


    public static void arrDateZ(Date[] arrDate, int a) {

        for (int i = 0; i < a; i++) {
            arrDate[i] = new Date(random(1, 31),random(1, 12),random(1900, 2011));
        }
        System.out.println(Arrays.toString(arrDate));
    }
}
