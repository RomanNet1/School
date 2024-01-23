package school.L2.L_2_38;

import java.util.Scanner;

public class Starter {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        char name1, name2, name3;
        name1 = in.next().charAt(0);
        name2 = in.next().charAt(0);
        name3 = in.next().charAt(0);

        System.out.println(name1 + "" + name2 + "" + name3);
    }
}
