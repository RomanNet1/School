package uchebnikTeoria.prostayadrobp1;

import java.util.Scanner;

public class Rational {
    static Scanner in = new Scanner(System.in);
    private int num_up; // числитель
    private int num_down; // знаменатель

    public Rational(int x, int y) {
        this.num_up = x;
        this.num_down = y;
    }

    public Rational() {
        this.num_up = in.nextInt();
        this.num_down = in.nextInt();
    }

    public String toString() {
        return this.num_up + "/" + this.num_down;
    }

    public int getNum_up() {
        return this.num_up;
    }

    public int getNum_down() {
        return this.num_down;
    }

    public Rational multiply(Rational num) { // //произведение данной дроби и дроби-параметра
        int x = this.num_up * num.num_up;
        int y = this.num_down * num.num_down;
        Rational c = new Rational(x, y);
        return c;
    }

    public Rational sum(Rational num) { //сумма данной дроби и дроби-параметра
        int x = this.num_up * num.num_down + num.num_up * this.num_down;
        int y = this.num_down * num.num_down;
        Rational c = new Rational(x, y);
        return c;
    }

    public Rational devide(Rational num) { ////новая дробь, как результат деления данной дроби на дробь-параметр
        int x = this.num_up * num.num_down;
        int y = this.num_down * num.num_up;
        Rational c = new Rational(x, y);
        return c;
    }

    public Rational hisur(Rational num) { //новая дробь, как результат вычитания из данной дроби дробипараметра
        int x = this.num_up * num.num_down - num.num_up * this.num_down;
        int y = this.num_down * num.num_down;
        Rational c = new Rational(x, y);
        return c;
    }

    public boolean equals(Rational num) {/*Сравнение данной дроби с дробью-параметром
                                          Возвращает true, если дроби равны; возвращает false, если дроби не
                                          равны*/
        return this.num_up == num.num_up && this.num_down == num.num_down;
    }

    /*
Сравнение данной дроби с дробью-параметром
Возвращает О, если дроби равны
Возвращает 1, если данная дробь больше дроби-параметра
Возвращает -1, если данная дробь меньше дроби-параметра
*/

    public int compareTo(Rational num) {
        if (this.num_up * num.num_down > num.num_up * this.num_down)
            if (this.num_down * num.num_down > 0)
                return 1;
            else
                return -1;
        if (this.num_up * num.num_down < num.num_up * this.num_down)
            if (this.num_down * num.num_down > 0)
                return -1;
            else
                return 1;
        return 0;
    }
}