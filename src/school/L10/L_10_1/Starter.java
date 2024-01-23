package school.L10.L_10_1;

public class Starter {
    public static void main(String[] args) {

        // от 10 до 99
        /*    х = a + (int)(Math.random() * (b - a + 1))      */

       // int x4 =  10 + (int)(Math.random() * (99 - 10 + 1));

//        int x4 = random(-10,-5);
//        int x5 = random(-10,-5);
//        int x6 = random(-10,-5);
//        int x7 = random(-10,-5);

        for (int i = 0; i < 100; i++) {
            int x = random(-10,-5);
            System.out.println("x" + i + " = " + x);
        }






    }

    public static int random(int a, int b){
        return  a + (int)(Math.random() * (b - a + 1));
    }
}
