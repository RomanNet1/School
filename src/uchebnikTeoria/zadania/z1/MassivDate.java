package uchebnikTeoria.zadania.z1;

import uchebnikTeoria.data_p2.Date;

import java.util.Arrays;

public class MassivDate {
    public static Date[] arrDateZ(Date[] arrDate, int a) {

        for (int i = 0; i < a; i++) {
            arrDate[i] = new Date(random(1, 31), random(1, 12), random(1900, 2011));
        }
        //System.out.println(Arrays.toString(arrDate));
        Date [] d = arrDate;
        return d;
    }


    public static int random(int a, int b) {
        return a + (int) (Math.random() * (b - a + 1));
    }


    public static void checkDataDayError(Date[] dd) {
        int schet = 0;
        for (int i = 0; i < dd.length; i++) {
            if(dd[i].getDay() > 31 || dd[i].getDay() < 1 ){
                schet++;
            }
        }
        System.out.println("Число ошибочных дат - " + schet);
    }

    public static void refDataDayError(Date[] dd) {
        int schet = 0;
        for (int i = 0; i < dd.length; i++) {
            if(dd[i].getDay() > 31 ){
                dd[i].setDay(31);
                schet++;
            } else if (dd[i].getDay() < 1) {
                dd[i].setDay(1);
                schet++;
            }else {
                //
                 }

        }
        System.out.println("Число ошибочных дат исправлено - " + schet);
        System.out.println(Arrays.toString(dd));
    }
}
