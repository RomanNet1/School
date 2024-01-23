package school.L8.L_8_1;

import java.util.Scanner;

public class Main {
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите целое число = ");
        int a = reader.nextInt();

        if (a%2 == 0){
            a++;
            System.out.println("Yes");
        } else {
            a--;
            System.out.println("No");
        }
        System.out.println(a);
    }
}
