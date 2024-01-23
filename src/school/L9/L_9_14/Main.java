package school.L9.L_9_14;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a;

        a = in.nextInt();

        if(a == 1 || a == 2){
            System.out.println("Неудовлетворительно");
        }
        if (a == 3){
            System.out.println("удовлетворительно");
        }
        if (a == 4){
            System.out.println("хорошо");
        }
        if (a == 5){
            System.out.println("отлично");
        }
        if(a < 1 || a > 5){
            System.out.println("оценкой не является");
        }
    }
}
