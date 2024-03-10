package uchebnikTeoria.data_p2;

public class Main {
    public static void main(String[] args) {
        Date d = new Date(12,5,2008);
        Date d1 = new Date(12,5, 2007);
        System.out.println(d +" & " + d1);
        System.out.println( d.compareTo(d1));
    }
}
