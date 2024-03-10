package uchebnikTeoria.passport_p3;

import uchebnikTeoria.data_p2.Date;

public class Main {
    public static void main(String[] args) {
        Date d = new Date( 12,5,2008);
        Passport p=new Passport("Cepгeй", 121,d);
        Date d1 =new Date(12,5, 2009);
        System.out.println(p.isValid( d1) );
        System.out.println(p );
        d.setYear(2013);
        System.out.println(p );
        System.out.println(p.isValid( d1 ));
    }
}
