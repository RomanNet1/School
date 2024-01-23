package school.L8.L_8_27;

import java.util.Scanner;

public class Main {
    public  static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int a, a1, b, b1;
        a = in.nextInt();
        b = in.nextInt();
        a1 = a % 10;
        b1 = b % 10;
        if(a1 > b1){
            System.out.println(a);
        }
        if(a1 < b1){
            System.out.println(b);
        }
        if(a1 == b1){
            System.out.println("Нет результата");
        }

    }
}
