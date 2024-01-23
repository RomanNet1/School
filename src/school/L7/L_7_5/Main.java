package school.L7.L_7_5;

import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int x = input.nextInt();
        if(x > 0){
            System.out.println("ПОложительное");
        }else {
            System.out.println("Не положительное");
        }
    }
}
