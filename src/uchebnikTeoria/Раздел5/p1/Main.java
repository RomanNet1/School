package uchebnikTeoria.Раздел5.p1;

import java.util.Scanner;

public class Main {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {

        String a =  reader.next(); // строковое значение
        char b = reader.next().charAt(1);
        System.out.println("Результат: " + a + " " + b);

    }
}
