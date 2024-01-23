package school.L2.L_2_39;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        String name, name1,name2,name3;
        name1 = in.next();
        name2 = in.next();
        name3 = in.next();
        name = name1.charAt(0) + "." + name2.charAt(0) + "." + name3;
        System.out.println(name);
    }
}
