package school.L2.L_2_12;

public class Main {
    public static void main(String[] args) {

        //print1();
        print2();

    }

    private static void print2() {
int a = 7;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < a ; j++) {
                System.out.print("*");
            }
            System.out.println();
            a = a - 2;
        }

        int b = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j <= b ; j++) {
                System.out.print("*");
            }
            System.out.println();
            b = b + 1;
        }



//        for (int i = 0; i < 7; i++) {
//            System.out.print("*");
//        }
    }

    private static void print1() {
        System.out.println("*******");
        System.out.println(" ***** ");
        System.out.println("  ***  ");
        System.out.println("   *   ");
        System.out.println("  ***  ");
        System.out.println(" ***** ");
        System.out.println("*******");
    }
}
