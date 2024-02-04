package school.L8.L_8_3;

import java.util.Scanner;

public class Main {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите целое двузначное число");
        int a, b, c;
        a = reader.nextInt();
        b = a/10;
        c=a%10;
        if(b==c) System.out.println("Yes");
        else System.out.println("No");
        if (b>c) System.out.println("Good");
        else System.out.println("Bad");
    }
}
