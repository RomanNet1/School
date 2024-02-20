package uchebnikTeoria.classjava;

public class Main {
    public static void main(String[] args) {
        Point a = new Point('A',6,8); // точка
        Point b = new Point('B',23,45); // точка
        System.out.println(quarto(a));
        System.out.println(isAxis(a));
        System.out.println(pandP(a, b));
        System.out.println(howLong(a, b));




    }

    private static double howLong(Point a, Point b) {
        /*
        Метод получает в качестве параметра объекты а и Ь типа Point и возвращает
        расстояние между ними
        */
        double dx = ((a.getX() - b.getX()) * (a.getX() - b.getX()));
        double dy = ((a.getY() - b.getY()) * (a.getY() - b.getY()));
        double d = Math.sqrt(dx + dy);
        return d;
    }

    private static boolean pandP(Point a, Point b) {
        /*
Метод получает в качестве параметра объекты а и Ь типа Point и возвращает
true, если обе точки находятся в одной четверти системы координат;
в противном случае метод возвращает false
*/
        if(quarto(a) == quarto(b)){
            return true;
        }
        return false;
    }

    private static boolean isAxis(Point b) {
        /*
Метод получает в качестве параметра объект Ь типа Point и проверяет,
находится ли объект на одной из осей. В случае если находится, метод
возвращает true, в противном случае метод возвращает false
*/
        if(b.getX() == 0 || b.getY() == 0){
            return true;
        }
        return false;
    }

    public static int quarto(Point a){
        /*
Метод получает в качестве параметра объект а типа Point и проверяет, в
какой четверти находится объект. В случае если объект находится на одной
из осей, метод возвращает значение О
*/
        if(a.getX() > 0 && a.getY() > 0) return 1;
        if(a.getX() < 0 && a.getY() > 0) return 2;
        if(a.getX() < 0 && a.getY() < 0) return 3;
        if(a.getX() > 0 && a.getY() < 0) return 4;
        return 0;
    }
}
