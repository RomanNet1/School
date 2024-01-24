package school.L6.L_6_13;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (b <= 0){
            System.out.println("No");
        }
        else {
            System.out.println("Yes");
        }
    }
}
