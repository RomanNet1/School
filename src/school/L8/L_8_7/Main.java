package school.L8.L_8_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        if(a > b){
            System.out.println(a - b);
        }
        if(a < b){
            System.out.println(b - a);
        }
        if(a == b){
            System.out.println(a * b);
        }
    }
}
