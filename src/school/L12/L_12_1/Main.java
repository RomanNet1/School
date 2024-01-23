package school.L12.L_12_1;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int x;
        int count = 0;

        for (int i = 1; i <= 10 ; i++) {
            x = in.nextInt();

            if(x > 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
