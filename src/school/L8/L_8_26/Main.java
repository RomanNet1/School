package school.L8.L_8_26;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int a, a1, a2, a3,a4,a5, b = 0;

        System.out.println("Введите  число:");
        System.out.print(">>"); // 1 0 0 0 0
        a = in.nextInt();

        if(a > 10 && a < 99){
            a1 = a / 10;
            a2 = a % 10;
            if (a1 == a2){
                System.out.println("Число - " + a + " явлется полиндромом" );
            }else {
                System.out.println("Число - " + a + " не явлется полиндромом" );
            }
        }
        else if(a > 100 && a < 999){
            a3 = (a / 100) % 10;
            a4 = (a / 10) % 10;
            a5 = a % 10;
            if (a3 == a5){
                System.out.println("Число - " + a + " явлется полиндромом" );
            }else {
                System.out.println("Число - " + a + " не явлется полиндромом" );
            }
        }
        else if(a > 1000 && a < 9999){
            a2 = (a / 1000) % 10;
            a3 = (a / 100) % 10;
            a4 = (a / 10) % 10;
            a5 = a % 10;
            if (a2 == a5 && a3 == a4){
                System.out.println("Число - " + a + " явлется полиндромом" );
            }else {
                System.out.println("Число - " + a + " не явлется полиндромом" );
            }
        }
        else if(a > 10000 && a < 99999){
            a1 = a / 10000;
            a2 = (a / 1000) % 10;
            a3 = (a / 100) % 10;
            a4 = (a / 10) % 10;
            a5 = a % 10;
            if (a1 == a5 && a2 == a4){
                System.out.println("Число - " + a + " явлется полиндромом" );
            }else {
                System.out.println("Число - " + a + " не явлется полиндромом" );
            }
        }else {
            System.out.println("Некорректное число");
        }
    }
}
