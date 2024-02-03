package school.L8.L_8_2;

import java.util.Scanner;

public class Main {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Введите целое число = ");
        int a = reader.nextInt();
        System.out.print("Введите второе целое число = ");
        int b = reader.nextInt();
        if (a%b == 0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        if (b%a == 0){
            a += 2;
            System.out.println("Good");
        }else {
            a = 2;
            System.out.println("Bad");
        }
        System.out.println(a);




    }


}
