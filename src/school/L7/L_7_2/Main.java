package school.L7.L_7_2;

import java.util.Scanner;

public class Main {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a = reader.nextInt();
        int digit1 = a / 10;
        int digit2 = a % 10;
         if(digit1 == digit2){
             System.out.println("Числа равны");
         }else {
             System.out.println("Числа не равны");
         }
    }
}
