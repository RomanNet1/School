package school.L8.L_8_25;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int a;

        System.out.println("Введите целое положительное число:");
        System.out.print(">>");
        a = in.nextInt();

        if(a % 2 == 0){
            Scanner reader = new Scanner(System.in);
            System.out.println("Введите дробное число:");
            System.out.print(">>");
            double b = Double.parseDouble(reader.nextLine());
            double c = (double) a * b;
            System.out.println(c);
        }else {
            System.out.println("Введите целое положительное число:");
            System.out.print(">>");
            int d = in.nextInt();
            int f = a + d;
            System.out.println(f);
        }


    }
}
