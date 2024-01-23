package school.L4.L_4_1;

import java.util.Scanner;

public class Main {
    public  static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int x, dig1, dig2;
        x = reader.nextInt();
        dig1 = x / 10;
        dig2 = x % 10;
        System.out.println(dig1 + " " + dig2);
    }
}
