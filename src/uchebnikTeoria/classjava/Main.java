package uchebnikTeoria.classjava;

public class Main {
    public static void main(String[] args) {
        Point x = new Point('A',6,8);
        System.out.println(quarto(x));

    }

    public static int quarto(Point a){
        if(a.getX() > 0 && a.getY() > 0) return 1;
        if(a.getX() < 0 && a.getY() > 0) return 2;
        if(a.getX() < 0 && a.getY() < 0) return 3;
        if(a.getX() > 0 && a.getY() < 0) return 4;
        return 0;
    }
}
