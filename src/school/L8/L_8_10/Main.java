package school.L8.L_8_10;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a = in.nextInt();
        if (a < 0){
            System.out.println(a * a);
        }else {
            System.out.println("Ошибка");
        }
    }
}
