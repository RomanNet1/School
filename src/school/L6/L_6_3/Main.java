package school.L6.L_6_3;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int age;
        System.out.println("Введите свой возраст");
        age = in.nextInt();
        if(age >= 18){
            System.out.println("Можешь участвовать в выборах");
        }
    }
}
