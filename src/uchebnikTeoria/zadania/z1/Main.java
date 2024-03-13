package uchebnikTeoria.zadania.z1;

import uchebnikTeoria.data_p2.Date;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Date[] arrDate = new Date[10];
        int a = arrDate.length;
        Date[] dd =  MassivDate.arrDateZ(arrDate, a);
        //1
        System.out.println(Arrays.toString(dd));
        //2
        MassivDate.checkDataDayError(dd);
        //3
        MassivDate.refDataDayError(dd);









    }
}
