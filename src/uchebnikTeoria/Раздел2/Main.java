package uchebnikTeoria.Раздел2;

import java.util.Scanner;

public class Main {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {

        int eggs;
        int ostatok;
        int upak;

        System.out.println("Введите количество яйц:");
        System.out.print(">> ");

        eggs = reader.nextInt();
        ostatok = eggs % 12;
        upak = eggs / 12;

        if(ostatok > 5){
            upak++;
            ostatok = 0;
        }

        System.out.println("Всего упаковок = " + upak);
        if (ostatok <= 5){
            System.out.println("назад на склад = " + ostatok);
        }

    }
}
