package guskova.circle;

public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.0,"Синий");
        System.out.println("Радиус = " + c1.getRadius() + " Цвет - " + c1.getColor() + " Площадь = " + c1.getArea());

        Circle c2 = new Circle(2.0);
        System.out.println("Радиус = " + c2.getRadius() + " Цвет - " + c2.getColor() + " Площадь = " + c2.getArea());

        Circle c3 = new Circle();
        System.out.println("Радиус = " + c3.getRadius() + " Цвет - " + c3.getColor() + " Площадь = " + c3.getArea());

    }
}
