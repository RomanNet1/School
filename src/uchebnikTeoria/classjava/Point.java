package uchebnikTeoria.classjava;

public class Point {
    private char name;
    private double x;
    private double y;

    public Point(char name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "name=" + name +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
